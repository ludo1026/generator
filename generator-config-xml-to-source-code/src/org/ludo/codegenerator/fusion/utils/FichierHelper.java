/*
 * Crée le 13 sept. 08 par Ludovic Chaboud.
 *
 */
package org.ludo.codegenerator.fusion.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Calendar;
import java.util.Date;

import org.ludo.utils.AssertHelper;

/**
 * Description de la classe.
 *
 * @author Ludovic Chaboud
 * @date 13 sept. 08
 * @version $Revision$ $Date$
 *
 */
public class FichierHelper
{

    /** Séparateur de répertoire. */
    public static final String SEPARATEUR_REPERTOIRE = "/";

    /**
     * Retourne le nom complet du fichier avec le répertoire.
     * @param nomFichier
     * @param nomRepertoire
     * @return.
     */
    public static final String getNomFichierComplet(
            final String nomRepertoire,
            final String nomFichier)
    {
        AssertHelper.assertDefinedArgument(
                nomRepertoire, "nom du répertoire", "getNomFichierComplet");
        AssertHelper.assertDefinedArgument(
                nomFichier, "nom du fichier", "getNomFichierComplet");

        return
            nomRepertoire
          + SEPARATEUR_REPERTOIRE
          + nomFichier;
    }

    /**
     * Création du répertoire.
     * @param nomRepertoire Répertoire à creer.
     */
    public static final void creerRepertoire(
            final String nomRepertoire)
    {
        AssertHelper.assertDefinedArgument(
                nomRepertoire, "nom du répertoire", "creerRepertoire");

        // Créer le répertoire
        final File repertoire = new File(nomRepertoire);
        repertoire.mkdirs();
    }

    private static final String DATE_HEURE_FORMAT = "yyyy-MM-dd_hh-mm-ss";
    private static final String DATE_HEURE_FORMAT_SEPARATEUR_1 = "-";
    private static final String DATE_HEURE_FORMAT_SEPARATEUR_2 = "_";

    /**
     * @return la dte formatée pour être inclue dans un nom de fichier ou de répertoire.
     */
    public static final String getDateEtHeureMaintenantToString() {
        final Date dateMaintenant = new Date();
        final Calendar cal = Calendar.getInstance();
        cal.setTime(dateMaintenant);
        final StringBuffer dateAsSB = new StringBuffer()
        .append(cal.get(Calendar.YEAR))
        .append(DATE_HEURE_FORMAT_SEPARATEUR_1)
        .append(cal.get(Calendar.MONTH))
        .append(DATE_HEURE_FORMAT_SEPARATEUR_1)
        .append(cal.get(Calendar.DAY_OF_MONTH))
        .append(DATE_HEURE_FORMAT_SEPARATEUR_2)
        .append(cal.get(Calendar.HOUR_OF_DAY))
        .append(DATE_HEURE_FORMAT_SEPARATEUR_1)
        .append(cal.get(Calendar.MINUTE))
        ;
        return dateAsSB.toString();
    }

    public static final void copierEtRemplacerFichier(
            final String nomRepertoireSource,
            final String nomFichier,
            final String nomRepertoireDestination)
    {
        final String nomFichierSourceComplet =
            getNomFichierComplet(
                nomRepertoireSource,
                nomFichier
            );

        final String nomFichierDestinationComplet =
            getNomFichierComplet(
                nomRepertoireDestination,
                nomFichier
            );

        final File directoryDestination = new File(nomRepertoireDestination);
        directoryDestination.mkdirs();

        final File fileSource = new File(nomFichierSourceComplet);
        final File fileDestination = new File(nomFichierDestinationComplet);
        if (fileDestination.exists()) {
            fileDestination.delete();
        }

        try {
            final FileChannel ic = new FileInputStream(fileSource).getChannel();
            final FileChannel oc = new FileOutputStream(fileDestination).getChannel();
            ic.transferTo(0, ic.size(), oc);
            ic.close();
            oc.close();
        } catch(final IOException e) {
            throw new RuntimeException(
                    "Erreur lors de la copie du fichier (répertoire source = " + nomRepertoireSource + ", nom fichier source = " + nomFichierSourceComplet + ", nom répertoire destination = " + nomRepertoireDestination + ")",e);
        }
        AssertHelper.assertBoolean(
            fileDestination.length() == fileSource.length(),
            "le fichier de destination (taille = "+fileDestination.length()+")"
          + "n'est pas identique au fichier source (taille = "+fileSource.length()+")");
    }

    /**
     * Supprimer un fichier situé dans le répertoire.
     * @param nomRepertoire
     * @param nomFichier.
     */
    public static final void supprimerFichier(
            final String nomRepertoire,
            final String nomFichier)
    {
        final String nomFichierComplet =
            getNomFichierComplet(
                nomRepertoire,
                nomFichier
            );

        final File file = new File(nomFichierComplet);

        file.delete();
    }
}
