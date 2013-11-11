/*
 * Crée le 11 sept. 08 par Ludovic Chaboud.
 *
 */
package org.ludo.codegenerator.fusion.modification;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.ludo.codegenerator.fusion.modification.bean.Contenu;
import org.ludo.codegenerator.fusion.modification.bean.ContenuLigne;
import org.ludo.codegenerator.fusion.modification.bean.GroupeContenu;
import org.ludo.codegenerator.fusion.modification.bean.Zone;
import org.ludo.codegenerator.fusion.modification.bean.ZoneLibre;
import org.ludo.codegenerator.fusion.modification.bean.ZoneStatique;
import org.ludo.codegenerator.fusion.utils.FichierHelper;
import org.ludo.utils.AssertHelper;

/**
 * Description de la classe.
 *
 * @author Ludovic Chaboud
 * @date 11 sept. 08
 * @version $Revision$ $Date$
 *
 */
public class ReporterModificationManager
{

    /**
     * Créer le fichier de modification.
     * @param nomRepertoireGenere
     * @param nomFichierGenere
     * @param nomRepertoireSauvegarde.
     */
    public final void sauvegarderGenere(
            final String nomRepertoireTemporaireNouveauGenere,
            final String nomFichierGenere,
            final String nomRepertoireTemporaireModification
        )
    {
        final String nomFichierComplet =
            FichierHelper
                .getNomFichierComplet(
                    nomFichierGenere,
                    nomRepertoireTemporaireNouveauGenere
                );

        FichierHelper
            .creerRepertoire(
                nomRepertoireTemporaireModification
            );

        FichierHelper
            .copierEtRemplacerFichier(
                nomRepertoireTemporaireNouveauGenere,
                nomFichierGenere,
                nomRepertoireTemporaireModification
            );
    }

    /**
     * Reporte les modifications du zoneStatique principal.
     * @param zoneStatiquePrincipal
     * @param nomRepertoireTemporaire
     * @param nomFichierCodeSource.
     */
    public final void reporterModificationDepuisZoneStatiquePrincipal(
            final ZoneStatique zoneStatiquePrincipalCodeSource,
            final ZoneStatique zoneStatiquePrincipalNouveauGenere,
            final String nomRepertoireTemporaireModification,
            final String nomFichierGenere
        )
    {
        // Récupérer le contenu des zones libres du fichier code source existant

        reporterModificationDansZoneStatique(
            zoneStatiquePrincipalCodeSource,
            zoneStatiquePrincipalNouveauGenere
        );

        // Ecriture du fichier

        final
        String nomFichierCompletGenere =
            FichierHelper
                .getNomFichierComplet(
                    nomRepertoireTemporaireModification,
                    nomFichierGenere
                );


        final File file = new File(nomFichierCompletGenere);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
        }
        catch (final Exception exception) {
            throw new
                RuntimeException (
                    "new FileWriter() - nomFichierCompletGenere = " + nomFichierCompletGenere,
                    exception
                );
        }
        AssertHelper.assertNotNull(fileWriter, "fileWriter");

        try {
            ecrireModificationDepuisZoneStatiquePrincipal(
                zoneStatiquePrincipalNouveauGenere,
                fileWriter
            );

            fileWriter.close();
        }
        catch (final IOException e) {
            throw new IllegalStateException(
                    "erreur lors de l'écriture dans le fichier de modification",
                    e);
        }
    }


    /**
     * Reporte les modifications du zoneStatique principal.
     * @param zoneStatiquePrincipal
     * @param nomRepertoireTemporaire
     * @param nomFichierCodeSource.
     */
    public final void reporterModificationDansZoneStatique(
            final ZoneStatique zoneStatiqueParentCodeSource,
            final ZoneStatique zoneStatiqueParentNouveauGenere
        )
    {
        // Récupérer le contenu des zones libres du fichier code source existant

        final GroupeContenu groupeContenuCodeSource =
            zoneStatiqueParentCodeSource.getGroupeContenu();

        final GroupeContenu groupeContenuNouveauGenere =
            zoneStatiqueParentNouveauGenere.getGroupeContenu();

        for (final Iterator<Contenu> iterContenuCodeSource = groupeContenuCodeSource.getListeContenu().iterator();
             iterContenuCodeSource.hasNext(); )
        {
            final Contenu contenuCodeSource = iterContenuCodeSource.next();
            if (contenuCodeSource instanceof ZoneStatique) {
                final ZoneStatique zoneStatiqueFilsCodeSource =
                    (ZoneStatique) contenuCodeSource;
                AssertHelper.assertDefined(zoneStatiqueFilsCodeSource.getNom(), "nom de la zone statique du code source");
                final Zone zoneFilsNouveauGenere =
                    groupeContenuNouveauGenere
                        .getZoneParNom(
                            zoneStatiqueFilsCodeSource.getNom()
                        );
                if ((zoneFilsNouveauGenere != null)
                 && (zoneFilsNouveauGenere instanceof ZoneStatique))
                {
                    final ZoneStatique zoneStatiqueFilsNouveauGenere =
                        (ZoneStatique) zoneFilsNouveauGenere;

                    reporterModificationDansZoneStatique(
                        zoneStatiqueFilsCodeSource,
                        zoneStatiqueFilsNouveauGenere
                    );
                }
            }
            else
            if (contenuCodeSource instanceof ZoneLibre) {
                final ZoneLibre zoneLibreFilsCodeSource =
                    (ZoneLibre) contenuCodeSource;
                AssertHelper.assertDefined(zoneLibreFilsCodeSource.getNom(), "nom de la zone libre fils du code source");
                final Zone zoneFilsNouveauGenere =
                    groupeContenuNouveauGenere
                        .getZoneParNom(
                            zoneLibreFilsCodeSource.getNom()
                        );
                if ((zoneFilsNouveauGenere != null)
                 && (zoneFilsNouveauGenere instanceof ZoneLibre))
                {
                    final ZoneLibre zoneLibreFilsNouveauGenere =
                        (ZoneLibre) zoneFilsNouveauGenere;

                    for (final Iterator<Contenu> iterContenuZoneLibreFilsCodeSource =
                             zoneLibreFilsCodeSource.getListeContenu().iterator();
                         iterContenuZoneLibreFilsCodeSource.hasNext();)
                    {
                        final Contenu contenu = iterContenuZoneLibreFilsCodeSource.next();
                        if (contenu instanceof ContenuLigne) {
                            final ContenuLigne contenuLigne = (ContenuLigne) contenu;
                            zoneLibreFilsNouveauGenere
                                .addLigne(
                                    contenuLigne.toString()
                                );
                        }
                    }
                }
            }
        }

    }

    private void ecrireModificationDepuisZoneStatiquePrincipal(
                final Zone zoneParent,
                final FileWriter fileWriter
            )
    throws IOException
    {
        for (final Contenu contenu : zoneParent.getListeContenu())
        {
            if (contenu instanceof ContenuLigne)
            {
                final ContenuLigne contenuLigne = (ContenuLigne) contenu;
                fileWriter.write(contenuLigne.toString() + "\n");
            }
            else
            if (contenu instanceof Zone)
            {
                final Zone zoneFils = (Zone) contenu;
                ecrireModificationDepuisZoneStatiquePrincipal(zoneFils, fileWriter);
            }
        }
    }

}

