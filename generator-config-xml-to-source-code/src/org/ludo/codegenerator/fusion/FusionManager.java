/*
 * Crée le 11 sept. 08 par François Dugast
 *
 */
package org.ludo.codegenerator.fusion;

import org.apache.velocity.VelocityContext;
import org.ludo.codegenerator.fusion.manager.FichierSourceManager;
import org.ludo.codegenerator.fusion.manager.GenerationDepuisTemplateManager;
import org.ludo.codegenerator.fusion.manager.GenereManager;
import org.ludo.codegenerator.fusion.manager.SauvegardeManager;
import org.ludo.codegenerator.fusion.modification.LectureModificationCodeSourceManager;
import org.ludo.codegenerator.fusion.modification.ReporterModificationManager;
import org.ludo.codegenerator.fusion.modification.ZoneStatiqueEtLibreDeGenereManager;
import org.ludo.codegenerator.fusion.modification.bean.ZoneStatique;
import org.ludo.utils.AssertHelper;

/**
 * Description de la classe.
 *
 * @author Ludovic Chaboud
 * @date 11 sept. 08
 * @version $Revision$ $Date$
 *
 */
public class FusionManager
{

    public static final class GenererFusionParameter {
        public VelocityContext context;
        public String nomRepertoireTemplate;
        public String nomRepertoireDernierGenere;
        public String nomRepertoireTemporaireNouveauGenere;
        public String nomRepertoireTemporaireModification;
        public String nomRepertoireCodeSource;
        public String nomRepertoireSauvegarde;
        public String nomFichierTemplate;
        public String nomFichierCodeSource;
    }

    public final void genererFusion(
            final GenererFusionParameter param)
    {
        // Etape 1 : Générer le nouveau code généré à partir du template et du context velocity.
        this.genererDepuisTemplate(param);
        // Etape 2 : Récupérer la dernière génération qui a servi à la génération et extraire l'arborescence des zoneStatiques et des zones libres.
        final ZoneStatique zoneStatiquePrincipalDuDernierGenere =
            this.recupererZoneStatiqueEtLibreDuDernierGenere(param);
        // Etape 3 : Récupérer le fichier source modifié par l'utilisateur et extraire, à partir des zoneStatiques et zones libres de la dernière génération, les modifications apportées.
        this.recupererModificationCodeSource(param, zoneStatiquePrincipalDuDernierGenere);
        // Etape 4.a : Récupérer la nouvelle génération qui a servi à la génération et extraire l'arborescence des zoneStatiques et des zones libres.
        final ZoneStatique zoneStatiquePrincipalDuNouveauGenere =
            this.recupererZoneStatiqueEtLibreDuNouveauGenere(param);
        // Etape 4 : Reprendre le nouveau code généré et y inclure les modifications apportées dans le fichier source modifié.
        this.reporterModification(
            param,
            zoneStatiquePrincipalDuDernierGenere,
            zoneStatiquePrincipalDuNouveauGenere
        );
        // Etape 5 : Sauvegarder le fichier source actuel ainsi que le dernier template dans un dossier horodaté.
        this.sauvegarderCodeSourceEtGenere(param);
        // Etape 6 : Remplacer le fichier source actuel par le nouveau code source généré qu iinclut les modifications.
        this.remplacerCodeSource(param);
        // Etape 7 : Copier la nouvelle génération de fichier dans le répertoire de sauvegarde de la dernière génération de fichier
        this.remplacerDernierGenere(param);
    }

    /**
     * Etape 1 : Générer le nouveau code généré à partir du template et du context velocity.
     * @param param.
     */
    protected final void genererDepuisTemplate(
            final GenererFusionParameter param)
    {
        final GenerationDepuisTemplateManager generationDepuisTemplateManager =
            new GenerationDepuisTemplateManager();

        generationDepuisTemplateManager
            .genererDepuisTemplate(
                param.nomRepertoireTemplate,
                param.nomFichierTemplate,
                param.nomRepertoireTemporaireNouveauGenere,
                param.nomFichierCodeSource,
                param.context
            );
    }

    /**
     * Etape 2 : Récupérer le dernier template qui a servi à la génération et extraire l'arborescence des zoneStatiques et des zones libres.
     * @param param.
     */
    protected final ZoneStatique recupererZoneStatiqueEtLibreDuDernierGenere(
            final GenererFusionParameter param)
    {
        final ZoneStatiqueEtLibreDeGenereManager zoneStatiqueEtLibreDeGenereManager =
            new ZoneStatiqueEtLibreDeGenereManager();

        final ZoneStatique zoneStatiquePrincipal =
            zoneStatiqueEtLibreDeGenereManager
                .recupererZoneStatiquePrincipalDeGenere(
                    param.nomRepertoireDernierGenere,
                    param.nomFichierTemplate
                );

        AssertHelper.assertNotNull(
                zoneStatiquePrincipal,
                "zone statique principale du template");

        return zoneStatiquePrincipal;
    }

    /**
     * Etape 3 : Récupérer le fichier source modifié par l'utilisateur et extraire, à partir des zoneStatiques et zones libres du dernier templates, les modifications apportées.
     * @param param.
     */
    protected final void recupererModificationCodeSource(
            final GenererFusionParameter param,
            final ZoneStatique zoneStatiquePrincipal)
    {
        final LectureModificationCodeSourceManager lectureModificationCodeSourceManager =
            new LectureModificationCodeSourceManager();

        lectureModificationCodeSourceManager
            .recupererModificationCodeSourceDansZoneStatiquePrincipal(
                param.nomRepertoireCodeSource,
                param.nomFichierCodeSource,
                zoneStatiquePrincipal
            );

    }


    /**
     * Etape 4.a : Récupérer le nouveau template qui a servi à la génération et extraire l'arborescence des zoneStatiques et des zones libres.
     * @param param.
     */
    protected final ZoneStatique recupererZoneStatiqueEtLibreDuNouveauGenere(
            final GenererFusionParameter param)
    {
        final ZoneStatiqueEtLibreDeGenereManager zoneStatiqueEtLibreDeGenereManager =
            new ZoneStatiqueEtLibreDeGenereManager();

        final ZoneStatique zoneStatiquePrincipal =
            zoneStatiqueEtLibreDeGenereManager
                .recupererZoneStatiquePrincipalDeGenere(
                    param.nomRepertoireTemporaireNouveauGenere,
                    param.nomFichierCodeSource
                );

        AssertHelper.assertNotNull(
                zoneStatiquePrincipal,
                "zone statique principale du template");

        return zoneStatiquePrincipal;
    }

    /**
     * Etape 4 : Reprendre le nouveau code généré et y inclure les modifications apportées dans le fichier source modifié.
     * @param param.
     */
    protected final void reporterModification(
            final GenererFusionParameter param,
            final ZoneStatique zoneStatiquePrincipalDuDernierGenere,
            final ZoneStatique zoneStatiquePrincipalDuNouveauGenere)
    {
        final ReporterModificationManager reporterModificationManager =
            new ReporterModificationManager();

        reporterModificationManager
            .reporterModificationDepuisZoneStatiquePrincipal(
                zoneStatiquePrincipalDuDernierGenere,
                zoneStatiquePrincipalDuNouveauGenere,
                param.nomRepertoireTemporaireModification,
                param.nomFichierCodeSource
            );

        /*
        reporterModificationManager
            .reporterModificationDansZoneStatiquePrincipal(
                    zoneStatiquePrincipalDuDernierTemplate,
                    zoneStatiquePrincipalDuNouveauTemplate
                );
        /*
        reporterModificationManager
            .reporterModificationDepuisCodeSource(
                zoneStatiquePrincipalDuNouveauTemplate,
                param.nomRepertoireTemporaire,
                param.nomFichierCodeSource
            );

        reporterModificationManager
            .supprimerTagDuCodeSource(
                zoneStatiquePrincipalDuNouveauTemplate,
                param.nomRepertoireTemporaire,
                param.nomFichierCodeSource
            );

        */
    }

    /**
     * Etape 5 : Sauvegarder le fichier source actuel ainsi que le dernier template dans un dossier horodaté.
     * @param param.
     */
    protected final void sauvegarderCodeSourceEtGenere(
            final GenererFusionParameter param)
    {
        final SauvegardeManager sauvegardeManager =
            new SauvegardeManager();

        sauvegardeManager
            .sauvegarderCodeSource(
                param.nomRepertoireCodeSource,
                param.nomFichierCodeSource,
                param.nomRepertoireSauvegarde
            );

        sauvegardeManager
            .sauvegarderGenere(
                param.nomRepertoireTemporaireNouveauGenere,
                param.nomFichierCodeSource,
                param.nomRepertoireSauvegarde
            );

    }

    /**
     * Etape 6 : Remplacer le fichier source actuel par le nouveau code source généré qui inclut les modifications.
     * @param param.
     */
    protected final void remplacerCodeSource(
            final GenererFusionParameter param)
    {
        final FichierSourceManager fichierSourceManager =
            new FichierSourceManager();

        fichierSourceManager
            .remplacerCodeSource(
                param.nomRepertoireTemporaireModification,
                param.nomFichierCodeSource,
                param.nomRepertoireCodeSource
            );

    }

    /**
     * Etape 7 : Copier le nouveau template dans le répertoire de sauvegarde du dernier template qui a servi à la génération du fichier.
     * @param param.
     */
    protected final void remplacerDernierGenere(
            final GenererFusionParameter param)
    {
        final GenereManager genereManager =
            new GenereManager();

        genereManager
            .remplacerDernierGenere(
                param.nomRepertoireTemporaireNouveauGenere,
                param.nomFichierCodeSource,
                param.nomRepertoireDernierGenere
            );

    }

}

