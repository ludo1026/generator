/*
 * Crée le 19 sept. 08 par Ludovic Chaboud.
 *
 */
package org.ludo.codegenerator.fusion;

import org.ludo.codegenerator.fusion.FusionManager.GenererFusionParameter;
import org.ludo.codegenerator.fusion.modification.bean.ZoneStatique;

/**
 * Description de la classe.
 *
 * @author Ludovic Chaboud
 * @date 19 sept. 08
 * @version $Revision$ $Date$
 *
 */
public class FusionTest
{


    public static void main(final String[] args)
    {
        final FusionManager fusionManager = new FusionManager();
        final GenererFusionParameter param = new GenererFusionParameter();

        final String repertoireBase = "/home/dev/projets/Demo_Sample/test-fusion/";
        param.nomRepertoireCodeSource = repertoireBase + "src";
        param.nomRepertoireDernierGenere = repertoireBase + "dernier-src";
        param.nomRepertoireSauvegarde = repertoireBase + "sauvegarde";
        param.nomRepertoireTemplate = repertoireBase + "template";
        param.nomRepertoireTemporaireNouveauGenere = repertoireBase + "temp-genere";
        param.nomRepertoireTemporaireModification = repertoireBase + "temp-modif";
        param.nomFichierCodeSource = "AccueilAction.java";
        param.nomFichierTemplate = "AccueilAction.java";

        // Etape 1 : Générer le nouveau code généré à partir du template et du context velocity.
        //fusionManager.genererDepuisTemplate(param);
        // Etape 2 : Récupérer le dernier généré qui a servi à la génération et extraire l'arborescence des zoneStatiques et des zones libres.
        final ZoneStatique zoneStatiquePrincipalDuDernierGenere =
            fusionManager.recupererZoneStatiqueEtLibreDuDernierGenere(param);
        // Etape 3 : Récupérer le fichier source modifié par l'utilisateur et extraire, à partir des zoneStatiques et zones libres du dernier templates, les modifications apportées.
        fusionManager.recupererModificationCodeSource(
                param, zoneStatiquePrincipalDuDernierGenere);
        // Etape 4.a : Récupérer le nouveau template qui a servi à la génération et extraire l'arborescence des zoneStatiques et des zones libres.
        final ZoneStatique zoneStatiquePrincipalDuNouveauGenere =
            fusionManager.recupererZoneStatiqueEtLibreDuNouveauGenere(param);
        // Etape 4 : Reprendre le nouveau code généré et y inclure les modifications apportées dans le fichier source modifié.
        fusionManager.reporterModification(
            param,
            zoneStatiquePrincipalDuDernierGenere,
            zoneStatiquePrincipalDuNouveauGenere
        );
        // Etape 5 : Sauvegarder le fichier source actuel ainsi que le dernier template dans un dossier horodaté.
        fusionManager.sauvegarderCodeSourceEtGenere(param);
        // Etape 6 : Remplacer le fichier source actuel par le nouveau code source généré qu iinclut les modifications.
        fusionManager.remplacerCodeSource(param);
        // Etape 7 : Copier le nouveau template dans le répertoire de sauvegarde du dernier template qui a servi à la génération du fichier.
        fusionManager.remplacerDernierGenere(param);
    }


}

