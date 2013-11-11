/*
 * Crée le 18 sept. 08 par Ludovic Chaboud.
 *
 */
package org.ludo.codegenerator.fusion.bean;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.ludo.codegenerator.fusion.modification.bean.Zone;
import org.ludo.utils.AssertHelper;

/**
 * Description de la classe.
 *
 * @author Ludovic Chaboud
 * @date 18 sept. 08
 * @version $Revision$ $Date$
 *
 */
public class MarqueurLigne
{
    public static final class Manager {
        public static final MarqueurLigne getCopy(final MarqueurLigne marqueurLigne) {
            final MarqueurLigne marqueurLigneCopy = new MarqueurLigne();
            marqueurLigneCopy.numeroLigneDebut = marqueurLigne.numeroLigneDebut;
            marqueurLigneCopy.numeroLigneFin = marqueurLigne.numeroLigneFin;
            for (final Iterator<String> iterContenuNom = marqueurLigne.mapMarqueurLignePourZone.keySet().iterator();
                 iterContenuNom.hasNext();)
            {
                final String contenuNom = iterContenuNom.next();
                final MarqueurLigne marqueurLigneFils = marqueurLigne.mapMarqueurLignePourZone.get(contenuNom);
                final MarqueurLigne marqueurLigneFilsCopy = getCopy(marqueurLigneFils);
                marqueurLigneCopy
                    .mapMarqueurLignePourZone
                        .put(
                            contenuNom,
                            marqueurLigneFilsCopy
                        );
            }
            return marqueurLigneCopy;
        }
    }

    private int numeroLigneDebut;
    private int numeroLigneFin;

    private final Map<String, MarqueurLigne> mapMarqueurLignePourZone = new HashMap<String,MarqueurLigne>();

    public MarqueurLigne() {

    }

    public MarqueurLigne(
            final int numeroLigneDebut,
            final int numeroLigneFin)
    {
        AssertHelper.assertBoolean(numeroLigneDebut > 0, "le numéro de ligne de début n'est pas supérieur à zéro");
        AssertHelper.assertBoolean(numeroLigneFin > 0, "le numéro de ligne de fin n'est pas supérieur à zéro");
        this.numeroLigneDebut = numeroLigneDebut;
        this.numeroLigneFin = numeroLigneFin;
    }

    /**
     * Retourne listeMarqueurLigneFils.
     * @return Retourne le listeMarqueurLigneFils.
     */
    public MarqueurLigne getMarqueurLignePourZone(final Zone zone)
    {
        AssertHelper.assertNotNullArgument(zone, "zone", "addMarqueurLignePourZone");
        AssertHelper.assertDefined(zone.getNom(), "nom de la zone");
        final MarqueurLigne marqueurLigne = this.mapMarqueurLignePourZone.get(zone.getNom());
        //AssertHelper.assertNotNull(marqueurLigne, "marqueurLigne");
        return marqueurLigne;
    }

    public void addMarqueurLignePourZone(
            final Zone zone,
            final MarqueurLigne marqueurLigne)
    {
        AssertHelper.assertNotNullArgument(zone, "zone", "addMarqueurLignePourZone");
        AssertHelper.assertNotNullArgument(marqueurLigne, "marqueurLigne", "addMarqueurLignePourZone");
        AssertHelper.assertDefined(zone.getNom(), "nom de la zone");
        this.mapMarqueurLignePourZone.put(zone.getNom(), marqueurLigne);
    }

    /**
     * Met à jour numeroLigneDebut.
     * @param numeroLigneDebut le numeroLigneDebut à écrire.
     */
    public void setNumeroLigneDebut(final int numeroLigneDebut)
    {
        AssertHelper.assertBoolean(numeroLigneDebut > 0, "le numéro de ligne de début n'est pas supérieur à zéro");
        this.numeroLigneDebut = numeroLigneDebut;
    }

    /**
     * Met à jour numeroLigneFin.
     * @param numeroLigneFin le numeroLigneFin à écrire.
     */
    public void setNumeroLigneFin(final int numeroLigneFin)
    {
        AssertHelper.assertBoolean(numeroLigneFin > 0, "le numéro de ligne de fin n'est pas supérieur à zéro");
        this.numeroLigneFin = numeroLigneFin;
    }

    /**
     * Retourne numeroLigneDebut.
     * @return Retourne le numeroLigneDebut.
     */
    public int getNumeroLigneDebut()
    {
        AssertHelper.assertBoolean(this.numeroLigneDebut > 0, "le numéro de ligne de début n'est pas supérieur à zéro");
        return this.numeroLigneDebut;
    }
    /**
     * Retourne numeroligneFin.
     * @return Retourne le numeroligneFin.
     */
    public int getNumeroLigneFin()
    {
        AssertHelper.assertBoolean(this.numeroLigneFin > 0, "le numéro de ligne de fin n'est pas supérieur à zéro");
        return this.numeroLigneFin;
    }

}

