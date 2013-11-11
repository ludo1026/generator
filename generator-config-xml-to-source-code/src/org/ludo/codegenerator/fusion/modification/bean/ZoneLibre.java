/*
 * Crée le 11 sept. 08 par François Dugast
 *
 */
package org.ludo.codegenerator.fusion.modification.bean;

import java.util.List;

/**
 * Description de la classe.
 *
 * @author Ludovic Chaboud
 * @date 11 sept. 08
 * @version $Revision$ $Date$
 *
 */
public class ZoneLibre
implements Zone
{

    private Zone zoneStatiqueParent;
    private String nom = "";
    private GroupeContenu groupeContenu = new GroupeContenu();

    /**
     * Retourne zoneStatiqueParent.
     * @return Retourne le zoneStatiqueParent.
     */
    public Zone getZoneStatiqueParent()
    {
        return this.zoneStatiqueParent;
    }
    /**
     * Met à jour zoneStatiqueParent.
     * @param zoneStatiqueParent le zoneStatiqueParent à écrire.
     */
    public void setZoneStatiqueParent(final Zone zoneStatiqueParent)
    {
        this.zoneStatiqueParent = zoneStatiqueParent;
    }
    /**
     * Retourne nom.
     * @return Retourne le nom.
     */
    public String getNom()
    {
        return this.nom;
    }
    /**
     * Met à jour nom.
     * @param nom le nom à écrire.
     */
    public void setNom(final String nom)
    {
        this.nom = nom;
    }
    /**
     * Retourne groupeContenu.
     * @return Retourne le groupeContenu.
     */
    public GroupeContenu getGroupeContenu()
    {
        return this.groupeContenu;
    }
    /**
     * Met à jour groupeContenu.
     * @param groupeContenu le groupeContenu à écrire.
     */
    public void setGroupeContenu(final GroupeContenu groupeContenu)
    {
        this.groupeContenu = groupeContenu;
    }
    /**
     * Retourne groupeContenu.
     * @return Retourne le groupeContenu.
     */
    public List<Contenu> getListeContenu()
    {
        return this.groupeContenu.getListeContenu();
    }

    /**
     * Ajoute une ligne au contenu modifié
     * @param ligne ligne à ajouter
     */
    public void addLigne(final String ligne)
    {
        this.groupeContenu.addLigne(ligne);
    }

}

