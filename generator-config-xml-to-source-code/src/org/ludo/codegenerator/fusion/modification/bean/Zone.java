/*
 * Crée le 15 sept. 08 par Ludovic Chaboud.
 *
 */
package org.ludo.codegenerator.fusion.modification.bean;

import java.util.List;

/**
 * Description de la classe.
 *
 * @author Ludovic Chaboud
 * @date 15 sept. 08
 * @version $Revision$ $Date$
 *
 */
public interface Zone
extends Contenu
{

    public List<Contenu> getListeContenu();

    /**
     * Ajoute une ligne au contenu de la zone.
     * @param ligne ligne à ajouter
     */
    public void addLigne(final String ligne);

    /**
     * Retourne le nom unique de la zone.
     * @return.
     */
    public String getNom();

}

