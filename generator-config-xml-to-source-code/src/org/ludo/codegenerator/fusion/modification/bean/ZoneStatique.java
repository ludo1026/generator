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
public class ZoneStatique
implements Zone
{
    private ZoneStatique zoneStatiqueParent;
    private String nom = "";
    private GroupeContenu groupeContenu = new GroupeContenu();

    public ZoneStatique() {

    }


    /**
     * Retourne zoneStatiqueParent.
     * @return Retourne le zoneStatiqueParent.
     */
    public ZoneStatique getZoneStatiqueParent()
    {
        return this.zoneStatiqueParent;
    }


    /**
     * Met à jour zoneStatiqueParent.
     * @param zoneStatiqueParent le zoneStatiqueParent à écrire.
     */
    public void setZoneStatiqueParent(final ZoneStatique zoneStatiqueParent)
    {
        this.zoneStatiqueParent = zoneStatiqueParent;
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
     * Ajoute un contenu.
     * @param contenu Contenu.
     */
    public void addContenu(final Contenu contenu)
    {
        this.groupeContenu.addContenu(contenu);
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
     * Ajoute une ligne au contenu statique
     * @param ligne ligne à ajouter
     */
    public void addLigne(final String ligne)
    {
        this.groupeContenu.addLigne(ligne);
    }

}

