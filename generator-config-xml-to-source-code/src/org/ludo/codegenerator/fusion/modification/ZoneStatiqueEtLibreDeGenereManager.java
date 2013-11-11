/*
 * Crée le 11 sept. 08 par Ludovic Chaboud.
 *
 */
package org.ludo.codegenerator.fusion.modification;

import org.ludo.codegenerator.fusion.bean.LectureFichier;
import org.ludo.codegenerator.fusion.bean.LectureFichier.LectureFichierIterator;
import org.ludo.codegenerator.fusion.modification.bean.ZoneStatique;
import org.ludo.codegenerator.fusion.modification.manager.ZoneStatiqueManager;
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
public class ZoneStatiqueEtLibreDeGenereManager
{

    private ZoneStatiqueManager zoneStatiqueManager = new ZoneStatiqueManager();

    /**
     * Récupère les informations du zoneStatique principal du dernier généré.
     * @param nomRepertoireDernierGenere Répertoire du dernier généré.
     * @param nomFichierDernierGenere Nom du fichier du dernier généré.
     */
    public final ZoneStatique recupererZoneStatiquePrincipalDeGenere(
            final String nomRepertoireDernierGenere,
            final String nomFichierDernierGenere
        )
    {
        final
        String nomFichierCompletDernierGenere =
            FichierHelper
                .getNomFichierComplet(
                    nomRepertoireDernierGenere,
                    nomFichierDernierGenere
                );

        final
        LectureFichier lectureFichierDernierGenere =
            LectureFichier.Manager
                .getLectureFichier(nomFichierCompletDernierGenere);

        final ZoneStatique zoneStatique = new ZoneStatique();

        zoneStatique.setNom(nomFichierDernierGenere);

        final LectureFichierIterator lectureFichierIterator =
            lectureFichierDernierGenere.iterator();

        if (lectureFichierIterator.hasNext())
        {
           final String premiereLigne = lectureFichierIterator.next();
           this.zoneStatiqueManager.lireZoneStatique(lectureFichierIterator, zoneStatique);
        }

        lectureFichierDernierGenere.fermer();

        AssertHelper.assertNotNull(zoneStatique, "zoneStatique principal");
        return zoneStatique;
    }

/*
    private void lireFichierGenere() {
        final FileWriter file = new FileWriter(new File("temp/"+nomFichierSortie));
        Velocity.mergeTemplate(nomFichierGenere, "UTF-8", context, file );
        file.flush();
        file.close();

        // Table des modifications apportées dans les zones de modifications
        final Map mapZoneModification = new HashMap();
        String codeZonePrecedent = null;

        // Ouvre l'ancien fichier déjà généré pour lecture
        final BufferedReader in = new BufferedReader(new FileReader(nomFichierSortie));
        StringBuffer strBuffer = null;
        String line = in.readLine();
        while( line != null ) {
            final int posZoneDebut = StringUtils.indexOf(line, "@zone-debut:");
            final int posZoneFin = StringUtils.indexOf(line, "@zone-fin:");
            if( posZoneDebut >= 0) {
                final int posDebutCodeZone = StringUtils.indexOf(line, '{', posZoneDebut) + 1;
                AssertHelper.assertBoolean(posDebutCodeZone >= 0,"le code de la zone de modifications n'est pas précédé d'une accolade.");
                final int posFinCodeZone = StringUtils.indexOf(line, '}', posDebutCodeZone);
                AssertHelper.assertBoolean(posFinCodeZone >= 0,"le code de la zone de modifications n'est pas suivi d'une accolade.");
                AssertHelper.assertBoolean(codeZonePrecedent == null, "la zone de modifications précédente '"+codeZonePrecedent+"' n'est pas terminée par une balise de fin de zone");
                codeZonePrecedent = StringUtils.substring(line, posDebutCodeZone, posFinCodeZone);
                AssertHelper.assertDefined(codeZonePrecedent, "code de la zone de modification");
                strBuffer = new StringBuffer();
            }
            else
            if( posZoneFin >= 0 ) {
                final int posDebutCodeZone = StringUtils.indexOf(line, '{', posZoneFin) + 1;
                AssertHelper.assertBoolean(posDebutCodeZone >= 0,"le code de la zone de modifications n'est pas précédé d'une accolade.");
                final int posFinCodeZone = StringUtils.indexOf(line, '}', posDebutCodeZone);
                AssertHelper.assertBoolean(posFinCodeZone >= 0,"le code de la zone de modifications n'est pas suivi d'une accolade.");
                final String codeZone = StringUtils.substring(line, posDebutCodeZone, posFinCodeZone);
                AssertHelper.assertDefined(codeZone, "code de la zone de modification");
                AssertHelper.assertBoolean(codeZonePrecedent != null, "aucune balise d'ouverture de zone de modifications '"+codeZone+"' n'a été définie");
                AssertHelper.assertBoolean(StringUtils.equalsIgnoreCase(codeZonePrecedent, codeZone), "le code de la zone de modification dans les balises de début et de fin de zone ne sont pas identiques");
                mapZoneModification.put(codeZone, strBuffer.toString());
                codeZonePrecedent = null;
            }
            else
            if( codeZonePrecedent != null)
            {
                strBuffer.append(line + "\n");
            }
            line = in.readLine();
        }
        in.close();
        AssertHelper.assertDefined(codeZonePrecedent == null, "la dernière zone de modifications n'est pas terminée par une balise de fin");

    }
*/

}

