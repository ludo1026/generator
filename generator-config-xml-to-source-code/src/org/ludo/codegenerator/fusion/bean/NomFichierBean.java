/*
 * Crée le 13 sept. 08 par Ludovic Chaboud.
 * 
 */
package org.ludo.codegenerator.fusion.bean;

/**
 * Description de la classe.
 *
 * @author Ludovic Chaboud
 * @date 13 sept. 08
 * @version $Revision$ $Date$
 *
 */
public class NomFichierBean
{
    /** Répertoire du fichier. */
    private String nomRepertoire;
    /** Nom du fichier */
    private String nomFichier;
    /**
     * Retourne nomRepertoire.
     * @return Retourne le nomRepertoire.
     */
    public String getNomRepertoire()
    {
        return this.nomRepertoire;
    }
    /**
     * Met à jour nomRepertoire.
     * @param nomRepertoire le nomRepertoire à écrire.
     */
    public void setNomRepertoire(String nomRepertoire)
    {
        this.nomRepertoire = nomRepertoire;
    }
    /**
     * Retourne nomFichier.
     * @return Retourne le nomFichier.
     */
    public String getNomFichier()
    {
        return this.nomFichier;
    }
    /**
     * Met à jour nomFichier.
     * @param nomFichier le nomFichier à écrire.
     */
    public void setNomFichier(String nomFichier)
    {
        this.nomFichier = nomFichier;
    }
    /**
     * Nom du fichier complet avec répertoire
     * @return.
     */
    public String getNomFichierAvecRepertoire() {
        return getNomRepertoire() + "/" + getNomFichier();
    }
    
}

