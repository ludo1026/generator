/*
 * Projet   : Generator
 * Package  : generator.core.template
 * Source   : Template.java
 * Création : CHABOUD   Date : 29 mars 2007
 * Copyright (C) 2007   Apria RSA
 *
 * --------------- Dernière mise à jour ---------------------
 * @author  : $author$
 * @version : $Revision$, $Date$
 * --------------- Historique -------------------------------
 * Auteur :                      Date : ../../....
 * Motif  :
 */
package org.ludo.xmlbeangen.template;

/**
 * <b>Description :</b>
 * <description de la classe>
 *
 * @version : $Revision$, $Date$
 * @author  : $Author$
 * @since   : version 1.0.0
 */
public class Template {
    
    private String nomTemplate = null;
    private String nomFichierTemplate = null;
    private String nomSousRepertoireSortie = null;
    private String nomFichierSortie = null;
    private String nomSousPackage = null;
    
    public String getNomFichierTemplate() {
        return nomFichierTemplate;
    }
    public void setNomFichierTemplate(String nomFichierTemplate) {
        this.nomFichierTemplate = nomFichierTemplate;
    }
    public String getNomSousPackage() {
        return nomSousPackage;
    }
    public void setNomSousPackage(String nomSousPackage) {
        this.nomSousPackage = nomSousPackage;
    }
    public String getNomSousRepertoireSortie() {
        return nomSousRepertoireSortie;
    }
    public void setNomSousRepertoireSortie(String nomSousRepertoireSortie) {
        this.nomSousRepertoireSortie = nomSousRepertoireSortie;
    }
    public String getNomFichierSortie() {
        return nomFichierSortie;
    }
    public void setNomFichierSortie(String nomFichierSortie) {
        this.nomFichierSortie = nomFichierSortie;
    }
    public String getNomTemplate() {
        return nomTemplate;
    }
    public void setNomTemplate(String nomTemplate) {
        this.nomTemplate = nomTemplate;
    }
}
