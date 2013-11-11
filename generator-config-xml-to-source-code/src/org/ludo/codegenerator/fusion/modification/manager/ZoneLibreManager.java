/*
 * Crée le 11 sept. 08 par François Dugast
 *
 */
package org.ludo.codegenerator.fusion.modification.manager;

import org.ludo.codegenerator.fusion.bean.LectureFichier.LectureFichierIterator;
import org.ludo.codegenerator.fusion.modification.bean.ZoneLibre;
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
public class ZoneLibreManager
{

    private TagManager tagManager = new TagManager();

    public void lireZoneLibre(
            final LectureFichierIterator lectureFichierIterator,
            final ZoneStatique zoneStatiqueParent)
    {
        String ligne = lectureFichierIterator.getLigneActuelle();

        final ZoneLibre zoneLibre = new ZoneLibre();
        if (zoneStatiqueParent != null) {
            zoneStatiqueParent.addContenu(zoneLibre);
        }
        zoneLibre.setZoneStatiqueParent(zoneStatiqueParent);

        /**
         * Définition du zoneLibre
         */
        final String nomZoneLibre =
            this.tagManager.getNomFromTagDebutZoneLibre(ligne);
        AssertHelper.assertDefined(nomZoneLibre, "le nom du zoneLibre n'est pas défini dans le tag de début du zoneLibre");

        zoneLibre
            .setNom(
                nomZoneLibre
            );


        /*
        if (estZoneLibreMonoLigne(ligne)) {
            zoneLibre.setEstMonoLigne(true);
            zoneLibre.addLigne(ligne);
        }
        */

        boolean estFini = false;

        while( ! estFini && lectureFichierIterator.hasNext())
        {
            ligne = lectureFichierIterator.next();
            AssertHelper.assertNotNull(ligne, "la ligne du fichier est null");

            if (this.tagManager.estTagFinZoneLibre(ligne)) {
                estFini = true;
            }

            if ( ! estFini ) {
                //zoneLibre.addLigne(ligne);
            }
        }
    }

}

