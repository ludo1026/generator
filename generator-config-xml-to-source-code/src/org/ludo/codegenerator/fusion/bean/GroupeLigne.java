/*
 * Crée le 18 sept. 08 par Ludovic Chaboud.
 *
 */
package org.ludo.codegenerator.fusion.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.ludo.utils.AssertHelper;

/**
 * Description de la classe.
 *
 * @author Ludovic Chaboud
 * @date 18 sept. 08
 * @version $Revision$ $Date$
 *
 */
public class GroupeLigne
{

    public static final class LigneModification {
        private final int numeroLigneDebut;
        private final int numeroLigneFin;
        public LigneModification(
                final int numeroLigneDebut,
                final int numeroLigneFin)
        {
            AssertHelper.assertBoolean(numeroLigneDebut > 0, "numéro de la ligne de début n'est pas un nombre positif");
            AssertHelper.assertBoolean(numeroLigneFin > 0, "numéro de la ligne de fin n'est pas un nombre positif");
            AssertHelper.assertBoolean(numeroLigneDebut <= numeroLigneFin, "numéro de ligne de début n'est pas inférieur ou égale au numéro de ligne de fin");
            this.numeroLigneDebut = numeroLigneDebut;
            this.numeroLigneFin = numeroLigneFin;
        }
        /**
         * Retourne numeroLigneDebut.
         * @return Retourne le numeroLigneDebut.
         */
        public int getNumeroLigneDebut()
        {
            return this.numeroLigneDebut;
        }
        /**
         * Retourne numeroLigneFin.
         * @return Retourne le numeroLigneFin.
         */
        public int getNumeroLigneFin()
        {
            return this.numeroLigneFin;
        }
    }

    public static final class GroupeLigneModification {
        private final List<LigneModification> listeLigneModification =
            new ArrayList<LigneModification>();
        private final HashMap<Integer,LigneModification> tableLigneModification =
            new HashMap<Integer,LigneModification>();
        public GroupeLigneModification()
        {
        }
        /**
         * Retourne listeLigneModification.
         * @return Retourne le listeLigneModification.
         */
        public List<LigneModification> getListeLigneModification()
        {
            return this.listeLigneModification;
        }
        /**
         * Ajoute une ligne de modification.
         * @param ligneModification.
         */
        public void addLigneModification(final LigneModification ligneModification)
        {
            this.listeLigneModification.add(ligneModification);
            for (final int numeroLigne = ligneModification.getNumeroLigneDebut();
                 numeroLigne <= ligneModification.getNumeroLigneFin(); )
            {
//                AssertHelper.assertBoolean(
//                        this.tableLigneModification.get(new Integer(numeroLigne)) == null,
//                        "la ligne n°" + numeroLigne + " a déjà été modifiée.");
                this.tableLigneModification
                    .put(
                        new Integer(numeroLigne),
                        ligneModification
                    );
            }
        }
        /**
         * Indique si la ligne a été modifiée.
         * @param numeroLigne
         * @return.
         */
        public boolean estLigneModifiee(final int numeroLigne)
        {
            return this.tableLigneModification.get(new Integer(numeroLigne)) != null;
        }
    }

    public static final class Manager {
        public static final GroupeLigne getNewGroupeLigne(final LectureFichier lectureFichier)
        {
            final GroupeLigne groupeLigne = new GroupeLigne();
            int nombreLigne = 0;
            for (final String ligne : lectureFichier) {
                groupeLigne.addLigne(ligne);
                nombreLigne++;
            }
            if (nombreLigne == 0) {
                groupeLigne.setMarqueurNumeroLigneDebut(0);
                groupeLigne.setMarqueurNumeroLigneFin(0);
            } else {
                groupeLigne.setMarqueurNumeroLigneDebut(1);
                groupeLigne.setMarqueurNumeroLigneFin(nombreLigne);
            }
            return groupeLigne;
        }

        public static final GroupeLigne getNewGroupeLigne(
                final GroupeLigne groupeLigne)
        {
            final GroupeLigne groupeLigneNew = new GroupeLigne();
            for (final String ligne : groupeLigne.getListeLigne())
            {
                groupeLigneNew.addLigne(ligne);
            }
            return groupeLigneNew;
        }

        public static final GroupeLigne getNewGroupeLigne(
                final GroupeLigne groupeLigne,
                final int numeroLigneDebut,
                final int numeroLigneFin)
        {
            final GroupeLigne groupeLigneNew = new GroupeLigne();
            final List<String> listeLigne = groupeLigne.getListeLigne();
            final Iterator<String> iterLigne = listeLigne.iterator();
            for (int numeroLigne = 0;
                 iterLigne.hasNext() && (numeroLigne < numeroLigneDebut);
                 numeroLigne++)
            {
                iterLigne.next();
            }
            for (int numeroLigne = numeroLigneDebut;
                 iterLigne.hasNext() && (numeroLigne <= numeroLigneFin);
                 numeroLigne++)
            {
                groupeLigneNew.addLigne(iterLigne.next());
            }
            return groupeLigneNew;
        }
    }

    private List<String> listeLigne = new ArrayList<String>();

    private final GroupeLigneModification groupeLigneModification =
        new GroupeLigneModification();

    private int marqueurNumeroLigneDebut = 0;
    private int marqueurNumeroLigneFin = 0;

    /**
     * Retourne marqueurNumeroLigneDebut.
     * @return Retourne le marqueurNumeroLigneDebut.
     */
    public int getMarqueurNumeroLigneDebut()
    {
        return this.marqueurNumeroLigneDebut;
    }

    /**
     * Met à jour marqueurNumeroLigneDebut.
     * @param marqueurNumeroLigneDebut le marqueurNumeroLigneDebut à écrire.
     */
    public void setMarqueurNumeroLigneDebut(final int marqueurNumeroLigneDebut)
    {
        this.marqueurNumeroLigneDebut = marqueurNumeroLigneDebut;
    }

    /**
     * Retourne marqueurNumeroLigneFin.
     * @return Retourne le marqueurNumeroLigneFin.
     */
    public int getMarqueurNumeroLigneFin()
    {
        return this.marqueurNumeroLigneFin;
    }

    /**
     * Met à jour marqueurNumeroLigneFin.
     * @param marqueurNumeroLigneFin le marqueurNumeroLigneFin à écrire.
     */
    public void setMarqueurNumeroLigneFin(final int marqueurNumeroLigneFin)
    {
        this.marqueurNumeroLigneFin = marqueurNumeroLigneFin;
    }

    /**
     * Ajoute une ligne dans la liste des lignes.
     * @param ligne.
     */
    public void addLigne(final String ligne) {
        this.listeLigne.add(ligne);
    }

    public List<String> getListeLigne() {
        return this.listeLigne;
    }

    public List<String> getListeLigneDepuisNumeroLigne(final int numeroLigne) {
        return this.listeLigne.subList(numeroLigne - 1, this.listeLigne.size());
    }

    /**
     * Ajouter un indicateur de modification.
     * @param numeroLigneDebut
     * @param numeroLigneFin.
     */
    public void ajouterIndicateurModification(
            final int numeroLigneDebut,
            final int numeroLigneFin)
    {
        final LigneModification ligneModification =
            new LigneModification(
                    numeroLigneDebut,
                    numeroLigneFin
                );

        this.groupeLigneModification
            .addLigneModification(
                ligneModification
            );
    }

    /**
     * Indique si la ligne a été modifiée.
     * @param numeroLigne
     * @return.
     */
    public boolean aEteModifieeLigne(
            final int numeroLigne)
    {
        return
            this.groupeLigneModification
                .estLigneModifiee(
                    numeroLigne
                );
    }

    public boolean existeLigne(final int numeroLigne)
    {
        return (numeroLigne > 0) && (numeroLigne <= this.listeLigne.size());
    }

    public String getLigne(final int numeroLigne)
    {
        AssertHelper.assertBoolean(existeLigne(numeroLigne), "la ligne n'existe pas : numeroligne = '" + numeroLigne + "'");
        return this.listeLigne.get(numeroLigne - 1);
    }



}

