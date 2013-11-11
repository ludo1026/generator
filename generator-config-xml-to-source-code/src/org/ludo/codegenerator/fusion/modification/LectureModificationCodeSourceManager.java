/*
 * Crée le 11 sept. 08 par Ludovic Chaboud.
 *
 */
package org.ludo.codegenerator.fusion.modification;

import org.ludo.codegenerator.fusion.bean.GroupeLigne;
import org.ludo.codegenerator.fusion.bean.LectureFichier;
import org.ludo.codegenerator.fusion.bean.MarqueurLigne;
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
public class LectureModificationCodeSourceManager
{

    private ZoneStatiqueManager zoneStatiqueManager = new ZoneStatiqueManager();

    /**
     * Récupère les modifications du code source et le met dans le zoneStatique principal.
     * @param nomRepertoireCodeSource
     * @param nomFichierCodeSource
     * @param zoneStatiquePrincipal.
     */
    public void recupererModificationCodeSourceDansZoneStatiquePrincipal(
            final String nomRepertoireCodeSource,
            final String nomFichierCodeSource,
            final ZoneStatique zoneStatiquePrincipal
        )
    {
        AssertHelper.assertNotNullArgument(
                zoneStatiquePrincipal,
                "zoneStatique principal",
                "recupererModificationCodeSourceDansZoneStatiquePrincipal");

        final
        String nomFichierCompletCodeSource =
            FichierHelper
                .getNomFichierComplet(
                    nomRepertoireCodeSource,
                    nomFichierCodeSource
                );

        final
        LectureFichier lectureFichierCodeSource =
            LectureFichier.Manager
                .getLectureFichier(nomFichierCompletCodeSource);

        final
        GroupeLigne groupeLigneCodeSource =
            GroupeLigne.Manager
                .getNewGroupeLigne(lectureFichierCodeSource);

        final ZoneStatique zoneStatique = (ZoneStatique) zoneStatiquePrincipal.getListeContenu().get(0);

        final LectureFichierIterator lectureFichierIterator =
            lectureFichierCodeSource.iterator();

        // 1 : rechercher où se trouvent les zones statiques
        final MarqueurLigne marqueurLigne =
            this.zoneStatiqueManager
                .existeZoneStatiqueDansGroupeLigne(
                    groupeLigneCodeSource,
                    zoneStatique
                );

        // 2 : récupérer les modifications dans les zones libres
        this.zoneStatiqueManager
            .lireModificationEtDefinirDansZoneStatique(
                groupeLigneCodeSource,
                zoneStatique,
                marqueurLigne,
                true
            );

        lectureFichierCodeSource.fermer();

        AssertHelper.assertNotNull(zoneStatiquePrincipal, "zoneStatique principal");
    }

}

