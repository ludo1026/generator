/*
 * Crée le 11 sept. 08 par François Dugast
 *
 */
package org.ludo.codegenerator.fusion.modification.manager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import org.apache.commons.lang.StringUtils;
import org.ludo.codegenerator.fusion.bean.GroupeLigne;
import org.ludo.codegenerator.fusion.bean.MarqueurLigne;
import org.ludo.codegenerator.fusion.bean.LectureFichier.LectureFichierIterator;
import org.ludo.codegenerator.fusion.modification.bean.Contenu;
import org.ludo.codegenerator.fusion.modification.bean.ContenuLigne;
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
public class ZoneStatiqueManager
{

    private TagManager tagManager = new TagManager();
    private ZoneLibreManager zoneLibreManager = new ZoneLibreManager();

    /**
     * Crée le zoneStatique et lit sont contenu.
     * @param lectureFichierIterator itération sur les lignes du fichier
     * @param zoneStatiqueParent zoneStatique parent.
     */
    public void lireZoneStatique(
            final LectureFichierIterator lectureFichierIterator,
            final ZoneStatique zoneStatiqueParent)
    {
        String ligne = lectureFichierIterator.getLigneActuelle();

        /**
         * Création du zoneStatique
         */
        final ZoneStatique zoneStatique = new ZoneStatique();
        if (zoneStatiqueParent != null) {
            zoneStatiqueParent.addContenu(zoneStatique);
        }
        zoneStatique.setZoneStatiqueParent(zoneStatiqueParent);

        /**
         * Définition du zoneStatique
         */
        final String nomZoneStatique =
            this.tagManager.getNomFromTagDebutZoneStatique(ligne);
        AssertHelper.assertDefined(nomZoneStatique, "le nom du zoneStatique n'est pas défini dans le tag de début du zoneStatique");

        zoneStatique
            .setNom(
                nomZoneStatique
            );

        /**
         * Remplissage du zoneStatique
         */
        boolean estFini = false;
        while( ! estFini && lectureFichierIterator.hasNext())
        {
            ligne = lectureFichierIterator.next();
            AssertHelper.assertNotNull(ligne, "la ligne du fichier est null");

            if (this.tagManager.estTagFinZoneStatique(ligne)) {
                final String nomFin = this.tagManager.getNomFromTagFinZoneStatique(ligne);
                AssertHelper.assertDefined(nomFin, "le nom dans le tag de fin de zoneStatique n'est pas défini");
                AssertHelper.assertBoolean(StringUtils.equals(nomZoneStatique, nomFin), "le nom du tag de fin ('" + nomFin + "') n'est pas identique au nom du tag de début ('" + nomZoneStatique + "')");
                estFini = true;
            }

            if ( ! estFini )
            {
                boolean stockerLigne = true;

                if (this.tagManager.estTagDebutZoneStatique(ligne)) {
                    this.lireZoneStatique(
                        lectureFichierIterator,
                        zoneStatique
                    );

                    ligne = lectureFichierIterator.getLigneActuelle();

                    stockerLigne = false;
                }

                if (this.tagManager.estTagDebutZoneLibre(ligne)) {
                    this.zoneLibreManager.lireZoneLibre(
                        lectureFichierIterator,
                        zoneStatique
                    );

                    ligne = lectureFichierIterator.getLigneActuelle();

                    stockerLigne = false;
                }

                if ( stockerLigne ) {
                    zoneStatique.addLigne(ligne);
                }
            }
        }
    }


    /**
     *
     * 1 : rechercher où se trouve la zone statique
     *
     */
    public MarqueurLigne existeZoneStatiqueDansGroupeLigne(
            final GroupeLigne groupeLigneOriginal,
            final ZoneStatique zoneStatiqueParent)
    {
        String premiereLigneZoneStatique = null;

        for (final Iterator<Contenu> iterContenu = zoneStatiqueParent.getListeContenu().iterator();
             (premiereLigneZoneStatique == null) && iterContenu.hasNext(); )
        {
            final Contenu contenu = iterContenu.next();
            if (contenu instanceof ContenuLigne) {
                premiereLigneZoneStatique = ((ContenuLigne) contenu).getLigne();
            }
        }

        if (premiereLigneZoneStatique == null) {
            return null;
        }

        // 1 : rechercher les lignes d'où peuvent commencer la zone statique
        final List<Integer> listeNumeroLigneDepart = new ArrayList<Integer>();

        for (int numeroLigne = groupeLigneOriginal.getMarqueurNumeroLigneDebut();
             numeroLigne <= groupeLigneOriginal.getMarqueurNumeroLigneFin();
             numeroLigne++ )
        {
            if (StringUtils.equals(
                    StringUtils.trimToNull(groupeLigneOriginal.getLigne(numeroLigne)),
                    StringUtils.trimToNull(premiereLigneZoneStatique)
                )
             && ! groupeLigneOriginal.aEteModifieeLigne(numeroLigne))
            {
                listeNumeroLigneDepart.add(new Integer(numeroLigne));
            }
        }

        if (listeNumeroLigneDepart.isEmpty()) {
            return null;
        }

        // 2 : rechercher où se trouve les lignes susceptibles de contenir la zone statique
        final List<MarqueurLigne> listeMarqueurLigneSansZoneStatiqueFils =
            new ArrayList<MarqueurLigne>();

        for (final Iterator<Integer> iterNumeroLigneDepart = listeNumeroLigneDepart.iterator();
             iterNumeroLigneDepart.hasNext(); )
        {
            final int numeroLigneDepart = iterNumeroLigneDepart.next().intValue();

            boolean aEteTrouve = true;
            boolean finiLireLigne = false;

            int numeroLigne = numeroLigneDepart;
            String ligneActuelle = groupeLigneOriginal.getLigne(numeroLigne);

            // Dernière zone statique visitée
            boolean estContenuPrecedent_ZoneStatique = false;
            int derniereZoneStatiqueNumeroLigneDebut = 0;
            // Dernière zone libre visitée
            boolean estContenuPrecedent_ZoneLibre = false;
            int derniereZoneLibreNumeroLigneDebut = 0;
            // Pour reprise
            final Stack<Integer> pileNumeroLigneReprise = new Stack<Integer>();
            final Stack<Integer> pileIndexContenuReprise = new Stack<Integer>();
            final Stack<Boolean> pileEstContenuPrecedentZoneLibreDebutReprise = new Stack<Boolean>();
            final Stack<Boolean> pileEstContenuPrecedentZoneStatiqueDebutReprise = new Stack<Boolean>();
            final Stack<Integer> pileDerniereZoneLibreNumeroLigneDebutReprise = new Stack<Integer>();
            final Stack<Integer> pileDerniereZoneStatiqueNumeroLigneDebutReprise = new Stack<Integer>();
            boolean estReprise = false;
            int numeroLigneReprise = 0;
            /*
            if ( ! groupeLigneOriginal.aEteModifieeLigne(numeroLigne)) {
                aEteTrouve = false;
            }
*/
            for (int indexContenu = 0;
                 aEteTrouve && ! finiLireLigne && (indexContenu < zoneStatiqueParent.getListeContenu().size());
                 indexContenu++)
            {
                if (estReprise) {
                    indexContenu--;
                    estReprise = false;
                    AssertHelper.assertBoolean(
                            numeroLigne <= numeroLigneReprise,
                            "la ligne à laquelle à effectuer la reprise actuelle et que l'on ne " +
                            "doit pas comparer avec la ligne actuelle n'est pas supérieure ou égale" +
                            " au numéro de ligne à laquelle on reprend.");
                } else {
                    numeroLigneReprise = 0;
                }

                final Contenu contenu = zoneStatiqueParent.getListeContenu().get(indexContenu);
                AssertHelper.assertNotNull(contenu, "contenu");
                ligneActuelle = groupeLigneOriginal.getLigne(numeroLigne);
                AssertHelper.assertNotNull(ligneActuelle, "ligne actuelle");

                if (contenu instanceof ContenuLigne)
                {
                    final ContenuLigne contenuLigne = (ContenuLigne) contenu;
                    if (estContenuPrecedent_ZoneLibre
                     || estContenuPrecedent_ZoneStatique)
                    {
                        while( (numeroLigne <= numeroLigneReprise) // teste si on est avant ou sur la ligne de reprise
                            && ! finiLireLigne )
                        {
                            // En cas de reprise, on ignore la ligne de reprise
                            numeroLigne++;
                            if ( ! groupeLigneOriginal.existeLigne(numeroLigne)) {
                                finiLireLigne = true;
                            } else {
                                ligneActuelle = groupeLigneOriginal.getLigne(numeroLigne);
                            }
    /*
                            if ( ! groupeLigneOriginal.aEteModifieeLigne(numeroLigne)) {
                                aEteTrouve = false;
                            }
    */
                        }
                        // Parcourt les lignes suivantes jusqu'à trouver la ligne du contenu
                        while( ! finiLireLigne
                            && ! StringUtils.equals(
                                    StringUtils.trimToNull(ligneActuelle),
                                    StringUtils.trimToNull(contenuLigne.getLigne())) )
                        {
                            numeroLigne++;
                            if ( ! groupeLigneOriginal.existeLigne(numeroLigne)) {
                                finiLireLigne = true;
                            } else {
                                ligneActuelle = groupeLigneOriginal.getLigne(numeroLigne);
                            }
    /*
                            if ( ! groupeLigneOriginal.aEteModifieeLigne(numeroLigne)) {
                                aEteTrouve = false;
                            }
    */
                        }
                        if ( ! StringUtils.equals(
                                StringUtils.trimToNull(ligneActuelle),
                                StringUtils.trimToNull(contenuLigne.getLigne())) )
                        {
                            finiLireLigne = false;
                            // Reprise
                            if (pileNumeroLigneReprise.size() > 0)
                            {
                                // Reprise
                                estReprise = true;
                                numeroLigneReprise = numeroLigne;
                                numeroLigne = pileNumeroLigneReprise.pop().intValue();
                                indexContenu = pileIndexContenuReprise.pop().intValue();
                                derniereZoneLibreNumeroLigneDebut = pileDerniereZoneLibreNumeroLigneDebutReprise.pop();
                                estContenuPrecedent_ZoneLibre = pileEstContenuPrecedentZoneLibreDebutReprise.pop();
                                derniereZoneStatiqueNumeroLigneDebut = pileDerniereZoneStatiqueNumeroLigneDebutReprise.pop();
                                estContenuPrecedent_ZoneStatique = pileEstContenuPrecedentZoneStatiqueDebutReprise.pop();
                            }
                            else {
                                aEteTrouve = false;
                            }
                        }
                        else // ( StringUtils.equals(ligneActuelle, contenuLigne.getLigne()) )
                        {
                            // Pour reprise
                            pileNumeroLigneReprise.push(new Integer(numeroLigne));
                            pileIndexContenuReprise.push(new Integer(indexContenu));
                            pileDerniereZoneLibreNumeroLigneDebutReprise.push(derniereZoneLibreNumeroLigneDebut);
                            pileEstContenuPrecedentZoneLibreDebutReprise.push(estContenuPrecedent_ZoneLibre);
                            pileDerniereZoneStatiqueNumeroLigneDebutReprise.push(derniereZoneStatiqueNumeroLigneDebut);
                            pileEstContenuPrecedentZoneStatiqueDebutReprise.push(estContenuPrecedent_ZoneStatique);

                            estContenuPrecedent_ZoneLibre = false;
                            estContenuPrecedent_ZoneStatique = false;

                            numeroLigne++;
                            if ( ! groupeLigneOriginal.existeLigne(numeroLigne)) {
                                finiLireLigne = true;
                            } else {
                                ligneActuelle = groupeLigneOriginal.getLigne(numeroLigne);
                            }
    /*
                            if ( ! groupeLigneOriginal.aEteModifieeLigne(numeroLigne)) {
                                aEteTrouve = false;
                            }
    */
                        }
                    }

                    else // le contenu précédent n'était pas une zone libre
                    {
                        if ( ! StringUtils.equals(
                                StringUtils.trimToNull(ligneActuelle),
                                StringUtils.trimToNull(contenuLigne.getLigne())) )
                        {
                            if (pileNumeroLigneReprise.size() > 0)
                            {
                                // Reprise
                                estReprise = true;
                                numeroLigneReprise = numeroLigne;
                                numeroLigne = pileNumeroLigneReprise.pop().intValue();
                                indexContenu = pileIndexContenuReprise.pop().intValue();
                                derniereZoneLibreNumeroLigneDebut = pileDerniereZoneLibreNumeroLigneDebutReprise.pop();
                                estContenuPrecedent_ZoneLibre = pileEstContenuPrecedentZoneLibreDebutReprise.pop();
                                derniereZoneStatiqueNumeroLigneDebut = pileDerniereZoneStatiqueNumeroLigneDebutReprise.pop();
                                estContenuPrecedent_ZoneStatique = pileEstContenuPrecedentZoneStatiqueDebutReprise.pop();
                            }
                            else {
                                aEteTrouve = false;
                            }
                        }
                        else
                        {
                            numeroLigne++;
                            if ( ! groupeLigneOriginal.existeLigne(numeroLigne)) {
                                finiLireLigne = true;
                            } else {
                                ligneActuelle = groupeLigneOriginal.getLigne(numeroLigne);
                            }
    /*
                            if ( ! groupeLigneOriginal.aEteModifieeLigne(numeroLigne)) {
                                aEteTrouve = false;
                            }
    */
                        }
                    }
                }
                else
                if (contenu instanceof ZoneStatique)
                {
                    derniereZoneStatiqueNumeroLigneDebut = numeroLigne;
                    estContenuPrecedent_ZoneStatique = true;
                    derniereZoneLibreNumeroLigneDebut = 0;
                    estContenuPrecedent_ZoneLibre = false;

                    // Pour reprise
                    /*
                    pileNumeroLigneReprise.push(new Integer(numeroLigne));
                    pileIndexContenuReprise.push(new Integer(indexContenu));
                    pileDerniereZoneStatiqueNumeroLigneDebutReprise.push(derniereZoneStatiqueNumeroLigneDebut);
                    pileEstContenuPrecedentZoneStatiqueDebutReprise.push(estContenuPrecedent_ZoneStatique);
                    pileDerniereZoneLibreNumeroLigneDebutReprise.push(derniereZoneLibreNumeroLigneDebut);
                    pileEstContenuPrecedentZoneLibreDebutReprise.push(estContenuPrecedent_ZoneLibre);
                    */
                }
                else
                if (contenu instanceof ZoneLibre)
                {
                    derniereZoneStatiqueNumeroLigneDebut = 0;
                    estContenuPrecedent_ZoneStatique = false;
                    derniereZoneLibreNumeroLigneDebut = numeroLigne;
                    estContenuPrecedent_ZoneLibre = true;

                    // Pour reprise
                    /*
                    pileNumeroLigneReprise.push(new Integer(numeroLigne));
                    pileIndexContenuReprise.push(new Integer(indexContenu));
                    pileDerniereZoneStatiqueNumeroLigneDebutReprise.push(derniereZoneStatiqueNumeroLigneDebut);
                    pileEstContenuPrecedentZoneStatiqueDebutReprise.push(estContenuPrecedent_ZoneStatique);
                    pileDerniereZoneLibreNumeroLigneDebutReprise.push(derniereZoneLibreNumeroLigneDebut);
                    pileEstContenuPrecedentZoneLibreDebutReprise.push(estContenuPrecedent_ZoneLibre);
                    */
                }
            }

            if (aEteTrouve)
            {
                final MarqueurLigne marqueurLigne =
                    new MarqueurLigne(
                            numeroLigneDepart,
                            numeroLigne
                        );

                listeMarqueurLigneSansZoneStatiqueFils.add(marqueurLigne);
            }
        }

        if (listeMarqueurLigneSansZoneStatiqueFils.isEmpty()) {
            return null;
        }

        // 3 : choisir celles où se trouve la zone statique et les sous-zones statiques
        final List<MarqueurLigne> listeMarqueurLigneAvecZoneStatiqueFils =
            new ArrayList<MarqueurLigne>();

        for (final Iterator<Integer> iterNumeroLigneDepart = listeNumeroLigneDepart.iterator();
             iterNumeroLigneDepart.hasNext(); )
        {
            final int numeroLigneDepart = iterNumeroLigneDepart.next().intValue();

            boolean aEteTrouve = true;
            boolean finiLireLigne = false;

            MarqueurLigne marqueurLigne = new MarqueurLigne();
            int numeroLigne = numeroLigneDepart;
            String ligneActuelle = groupeLigneOriginal.getLigne(numeroLigne);
            // Dernière zone libre visitée
            boolean estContenuPrecedent_ZoneLibre = false;
            int derniereZoneLibreNumeroLigneDebut = 0;
            ZoneLibre derniereZoneLibreContenu = null;

            // Pour reprise
            final Stack<Integer> pileNumeroLigneReprise = new Stack<Integer>();
            final Stack<Integer> pileIndexContenuReprise = new Stack<Integer>();
            final Stack<MarqueurLigne> pileMarqueurLigneReprise = new Stack<MarqueurLigne>();
            final Stack<Boolean> pileEstContenuPrecedentZoneLibreDebutReprise = new Stack<Boolean>();
            final Stack<Integer> pileDerniereZoneLibreNumeroLigneDebutReprise = new Stack<Integer>();
            final Stack<ZoneLibre> pileDerniereZoneLibreContenuReprise = new Stack<ZoneLibre>();
            boolean estReprise = false;
            int numeroLigneReprise = 0;

            /*
            if ( ! groupeLigneOriginal.aEteModifieeLigne(numeroLigne)) {
                aEteTrouve = false;
            }
*/
            for (int indexContenu = 0;
                 aEteTrouve && ! finiLireLigne && (indexContenu < zoneStatiqueParent.getListeContenu().size());
                 indexContenu++)
            {
                if (estReprise) {
                    indexContenu--;
                    estReprise = false;
                    AssertHelper.assertBoolean(
                            numeroLigne <= numeroLigneReprise,
                            "la ligne à laquelle à effectuer la reprise actuelle et que l'on ne " +
                            "doit pas comparer avec la ligne actuelle n'est pas supérieure ou égale" +
                            " au numéro de ligne à laquelle on reprend.");
                } else {
                    numeroLigneReprise = 0;
                }

                final Contenu contenu = zoneStatiqueParent.getListeContenu().get(indexContenu);
                AssertHelper.assertNotNull(contenu, "contenu");
                ligneActuelle = groupeLigneOriginal.getLigne(numeroLigne);
                AssertHelper.assertNotNull(ligneActuelle, "ligne actuelle");

                if (contenu instanceof ContenuLigne)
                {
                    final ContenuLigne contenuLigne = (ContenuLigne) contenu;
                    if (estContenuPrecedent_ZoneLibre)
                    {
                        while ( (numeroLigne <= numeroLigneReprise) // teste si on est sur la ligne de reprise
                             && ! finiLireLigne )
                        {
                            // En cas de reprise, on ignore la ligne de reprise
                            numeroLigne++;
                            if ( ! groupeLigneOriginal.existeLigne(numeroLigne)) {
                                finiLireLigne = true;
                            } else {
                                ligneActuelle = groupeLigneOriginal.getLigne(numeroLigne);
                            }
    /*
                            if ( ! groupeLigneOriginal.aEteModifieeLigne(numeroLigne)) {
                                aEteTrouve = false;
                            }
    */
                        }
                        // Parcourt les lignes suivantes jusqu'à trouver la ligne du contenu
                        while( ! finiLireLigne
                            && ! StringUtils.equals(
                                    StringUtils.trimToNull(ligneActuelle),
                                    StringUtils.trimToNull(contenuLigne.getLigne())) )
                        {
                            numeroLigne++;
                            if ( ! groupeLigneOriginal.existeLigne(numeroLigne)) {
                                finiLireLigne = true;
                            } else {
                                ligneActuelle = groupeLigneOriginal.getLigne(numeroLigne);
                            }
    /*
                            if ( ! groupeLigneOriginal.aEteModifieeLigne(numeroLigne)) {
                                aEteTrouve = false;
                            }
    */
                        }
                        if ( ! StringUtils.equals(
                                StringUtils.trimToNull(ligneActuelle),
                                StringUtils.trimToNull(contenuLigne.getLigne())) )
                        {
                            finiLireLigne = false;
                            // Reprise
                            if (pileNumeroLigneReprise.size() > 0)
                            {
                                // Reprise
                                estReprise = true;
                                numeroLigneReprise = numeroLigne;
                                numeroLigne = pileNumeroLigneReprise.pop().intValue();
                                indexContenu = pileIndexContenuReprise.pop().intValue();
                                marqueurLigne = pileMarqueurLigneReprise.pop();
                                derniereZoneLibreNumeroLigneDebut = pileDerniereZoneLibreNumeroLigneDebutReprise.pop();
                                derniereZoneLibreContenu = pileDerniereZoneLibreContenuReprise.pop();
                                estContenuPrecedent_ZoneLibre = pileEstContenuPrecedentZoneLibreDebutReprise.pop();
                            }
                            else {
                                aEteTrouve = false;
                            }
                        }
                        else // ( StringUtils.equals(ligneActuelle, contenuLigne.getLigne()) )
                        {
                            // Pour reprise
                            pileNumeroLigneReprise.push(new Integer(numeroLigne));
                            pileIndexContenuReprise.push(new Integer(indexContenu));
                            final MarqueurLigne marqueurLigneCopy = MarqueurLigne.Manager.getCopy(marqueurLigne);
                            pileMarqueurLigneReprise.push(marqueurLigneCopy);
                            pileDerniereZoneLibreNumeroLigneDebutReprise.push(derniereZoneLibreNumeroLigneDebut);
                            pileDerniereZoneLibreContenuReprise.push(derniereZoneLibreContenu);
                            pileEstContenuPrecedentZoneLibreDebutReprise.push(estContenuPrecedent_ZoneLibre);

                            // Enregistre les marqueurs de la dernière zone libre
                            final MarqueurLigne marqueurLigneDerniereZoneLibre =
                                new MarqueurLigne(
                                        derniereZoneLibreNumeroLigneDebut,
                                        numeroLigne
                                    );
                            marqueurLigne.addMarqueurLignePourZone(
                                    derniereZoneLibreContenu,
                                    marqueurLigneDerniereZoneLibre
                                );

                            estContenuPrecedent_ZoneLibre = false;

                            numeroLigne++;
                            if ( ! groupeLigneOriginal.existeLigne(numeroLigne)) {
                                finiLireLigne = true;
                            } else {
                                ligneActuelle = groupeLigneOriginal.getLigne(numeroLigne);
                            }
    /*
                            if ( ! groupeLigneOriginal.aEteModifieeLigne(numeroLigne)) {
                                aEteTrouve = false;
                            }
    */
                        }
                    }
                    else // le contenu précédent n'était pas une zone libre
                    {
                        if ( ! StringUtils.equals(
                                StringUtils.trimToNull(ligneActuelle),
                                StringUtils.trimToNull(contenuLigne.getLigne())) )
                        {
                            if (pileNumeroLigneReprise.size() > 0)
                            {
                                // Reprise
                                estReprise = true;
                                numeroLigneReprise = numeroLigne;
                                numeroLigne = pileNumeroLigneReprise.pop().intValue();
                                indexContenu = pileIndexContenuReprise.pop().intValue();
                                marqueurLigne = pileMarqueurLigneReprise.pop();
                                derniereZoneLibreNumeroLigneDebut = pileDerniereZoneLibreNumeroLigneDebutReprise.pop();
                                derniereZoneLibreContenu = pileDerniereZoneLibreContenuReprise.pop();
                                estContenuPrecedent_ZoneLibre = pileEstContenuPrecedentZoneLibreDebutReprise.pop();
                            }
                            else {
                                aEteTrouve = false;
                            }
                        }
                        else
                        {
                            numeroLigne++;
                            if ( ! groupeLigneOriginal.existeLigne(numeroLigne)) {
                                finiLireLigne = true;
                            } else {
                                ligneActuelle = groupeLigneOriginal.getLigne(numeroLigne);
                            }
    /*
                            if ( ! groupeLigneOriginal.aEteModifieeLigne(numeroLigne)) {
                                aEteTrouve = false;
                            }
    */
                        }
                    }


                }
                else
                if (contenu instanceof ZoneStatique)
                {
                    final ZoneStatique zoneStatique = (ZoneStatique) contenu;
                    final int ancienNumeroLigneDebut = groupeLigneOriginal.getMarqueurNumeroLigneDebut();
                    final int ancienNumeroLigneFin = groupeLigneOriginal.getMarqueurNumeroLigneFin();
                    groupeLigneOriginal.setMarqueurNumeroLigneDebut(numeroLigne);
                    final MarqueurLigne marqueurLigneFils =
                        this.existeZoneStatiqueDansGroupeLigne(
                            groupeLigneOriginal,
                            (ZoneStatique) contenu
                        );
                    groupeLigneOriginal.setMarqueurNumeroLigneDebut(ancienNumeroLigneDebut);
                    groupeLigneOriginal.setMarqueurNumeroLigneFin(ancienNumeroLigneFin);
                    if (marqueurLigneFils == null) {
                        if (pileNumeroLigneReprise.size() > 0)
                        {
                            // Reprise
                            estReprise = true;
                            numeroLigneReprise = numeroLigne;
                            numeroLigne = pileNumeroLigneReprise.pop().intValue();
                            indexContenu = pileIndexContenuReprise.pop().intValue();
                            marqueurLigne = pileMarqueurLigneReprise.pop();
                            derniereZoneLibreNumeroLigneDebut = pileDerniereZoneLibreNumeroLigneDebutReprise.pop();
                            derniereZoneLibreContenu = pileDerniereZoneLibreContenuReprise.pop();
                            estContenuPrecedent_ZoneLibre = pileEstContenuPrecedentZoneLibreDebutReprise.pop();
                        }
                        else {
                            aEteTrouve = false;
                        }
                    } else {
                        marqueurLigne.addMarqueurLignePourZone(
                                zoneStatique,
                                marqueurLigneFils
                            );
                        numeroLigne = marqueurLigneFils.getNumeroLigneFin();

                        estContenuPrecedent_ZoneLibre = false;
                    }
                }
                else
                if (contenu instanceof ZoneLibre)
                {
                    final ZoneLibre zoneLibre = (ZoneLibre) contenu;

                    derniereZoneLibreNumeroLigneDebut = numeroLigne;
                    derniereZoneLibreContenu = zoneLibre;
                    estContenuPrecedent_ZoneLibre = true;

                    // Pour reprise
                    /*
                    pileNumeroLigneReprise.push(new Integer(numeroLigne));
                    pileIndexContenuReprise.push(new Integer(indexContenu));
                    final MarqueurLigne marqueurLigneCopy = MarqueurLigne.Manager.getCopy(marqueurLigne);
                    pileMarqueurLigneReprise.push(marqueurLigneCopy);
                    pileDerniereZoneLibreNumeroLigneDebutReprise.push(derniereZoneLibreNumeroLigneDebut);
                    pileDerniereZoneLibreContenuReprise.push(derniereZoneLibreContenu);
                    pileEstContenuPrecedentZoneLibreDebutReprise.push(estContenuPrecedent_ZoneLibre);
                    */
                }
            }

            if (aEteTrouve)
            {
                marqueurLigne.setNumeroLigneDebut(numeroLigneDepart);
                marqueurLigne.setNumeroLigneFin(numeroLigne);
                listeMarqueurLigneAvecZoneStatiqueFils.add(marqueurLigne);
            }
        }

        if (listeMarqueurLigneAvecZoneStatiqueFils == null)
        {
            return null;
        }

        // 4 : Choisir la zone la plus petite
        int tailleMinimum = Integer.MAX_VALUE;
        MarqueurLigne marqueurLigneMinimum = null;
        for (final Iterator<MarqueurLigne> iterMarqueurLigne = listeMarqueurLigneAvecZoneStatiqueFils.iterator();
             iterMarqueurLigne.hasNext(); )
        {
            final MarqueurLigne marqueurLigne = iterMarqueurLigne.next();
            if (marqueurLigne.getNumeroLigneFin() - marqueurLigne.getNumeroLigneDebut() < tailleMinimum) {
                marqueurLigneMinimum = marqueurLigne;
                tailleMinimum = marqueurLigne.getNumeroLigneFin() - marqueurLigne.getNumeroLigneDebut();
            }
        }

        return marqueurLigneMinimum;

    }



    /**
     * Crée le zoneStatique et lit sont contenu.
     * @param lectureFichierIterator itération sur les lignes du fichier.
     * @param zoneStatiqueParent zoneStatique parent.
     * @return indique si la zone statique existe dans le groupe de ligne.
     */
    public void lireModificationEtDefinirDansZoneStatique(
            final GroupeLigne groupeLigne,
            final ZoneStatique zoneStatiqueParent,
            final MarqueurLigne marqueurLigne,
            final boolean estZoneStatiquePrincipale)
    {
        if (marqueurLigne == null) {
            return ;
        }
        // 2 : récupérer les modifications dans les zones libres

        final int numeroLigneDepart = marqueurLigne.getNumeroLigneDebut();

        final boolean aEteTrouve = true;
        boolean finiLireLigne = false;

        final int numeroLigne = numeroLigneDepart;
        String ligneActuelle = groupeLigne.getLigne(numeroLigne);

        for (final Iterator<Contenu> iterContenu = zoneStatiqueParent.getListeContenu().iterator();
             aEteTrouve && ! finiLireLigne && iterContenu.hasNext(); )
        {
            final Contenu contenu = iterContenu.next();
            AssertHelper.assertNotNull(contenu, "contenu");

            ligneActuelle = groupeLigne.getLigne(numeroLigne);

            /*
            if (contenu instanceof ContenuLigne)
            {
                // Itération sur les lignes du fichier source
                // jusqu'à trouver la ligne correspondante à la ligne actuelle
                // du dernier template
                numeroLigne++;
                if ( ! groupeLigne.existeLigne(numeroLigne)) {
                    finiLireLigne = true;
                    aEteTrouve = false;
                } else {
                    ligneActuelle = groupeLigne.getLigne(numeroLigne);
                }
            }
            else
            */
            if (contenu instanceof ZoneStatique)
            {
                final ZoneStatique zoneStatique = (ZoneStatique) contenu;

                final MarqueurLigne marqueurLignePourZoneStatique =
                    marqueurLigne.getMarqueurLignePourZone(zoneStatique);
                if (marqueurLignePourZoneStatique != null)
                {
                    AssertHelper.assertNotNull(
                        marqueurLignePourZoneStatique,
                        "marqueur de lignes pour la zone statique");

                    this.lireModificationEtDefinirDansZoneStatique(
                        groupeLigne,
                        zoneStatique,
                        marqueurLignePourZoneStatique,
                        false
                    );
                }
            }
            else
            if (contenu instanceof ZoneLibre)
            {
                final ZoneLibre zoneLibre = (ZoneLibre) contenu;
                // Traite les lignes de cette zone libre
                final MarqueurLigne marqueurLignePourContenu =
                    marqueurLigne.getMarqueurLignePourZone(zoneLibre);
                if (marqueurLignePourContenu != null)
                {
                    AssertHelper.assertNotNull(marqueurLignePourContenu, "marqueur de lignes pour la zone statique");
                    final int numeroLigneDebutZoneLibre = marqueurLignePourContenu.getNumeroLigneDebut();
                    final int numeroLigneFinZoneLibre = marqueurLignePourContenu.getNumeroLigneFin();
                    for (int numeroLigneZoneLibre = numeroLigneDebutZoneLibre;
                         numeroLigneZoneLibre < numeroLigneFinZoneLibre;
                         numeroLigneZoneLibre++)
                    {
                        zoneLibre
                            .addLigne(
                                groupeLigne.getLigne(numeroLigneZoneLibre)
                            );
                    }
                }
                /*
                numeroLigne = numeroLigneDebutZoneLibre;
                */
            }

        }

        // Marquer les lignes dans le groupe de lignes
/*
        groupeLigne
            .ajouterIndicateurModification(
                marqueurLigne.getNumeroLigneDebut(),
                marqueurLigne.getNumeroLigneFin()
            );
*/
    }

}

