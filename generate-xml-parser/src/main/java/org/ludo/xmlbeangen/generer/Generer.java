/*
 * Projet   : Generator
 * Package  : generator.core.generer
 * Source   : Generer.java
 * CrÃ©ation : CHABOUD   Date : 29 mars 2007
 * Copyright (C) 2007   Apria RSA
 *
 * --------------- DerniÃ¨re mise Ã  jour ---------------------
 * @author  : $author$
 * @version : $Revision$, $Date$
 * --------------- Historique -------------------------------
 * Auteur :                      Date : ../../....
 * Motif  :
 */
package org.ludo.xmlbeangen.generer;

import java.util.ArrayList;
import java.util.List;


/**
 * <b>Description :</b>
 * <description de la classe>
 *
 * @version : $Revision$, $Date$
 * @author  : $Author$
 * @since   : version 1.0.0
 */
public class Generer {
    
    private String nomClasse = null;
    private List listeNomTemplate = new ArrayList();
    
    public List getListeNomTemplate() {
        return listeNomTemplate;
    }
    public void setListeNomTemplate(List listeNomTemplate) {
        this.listeNomTemplate = listeNomTemplate;
    }
    public void addNomTemplate(String nomTemplate) {
        listeNomTemplate.add(nomTemplate);
    }
    public String getNomClasse() {
        return nomClasse;
    }
    public void setNomClasse(String nomClasse) {
        this.nomClasse = nomClasse;
    }
}
