/*
 * Projet   : Generator
 * Package  : generator.core.generer
 * Source   : Generation.java
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
package org.ludo.xmlbeangen.generer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.ludo.utils.LoggerManager;


/**
 * <b>Description :</b>
 * <description de la classe>
 *
 * @version : $Revision$, $Date$
 * @author  : $Author$
 * @since   : version 1.0.0
 */
public class Generation {
    
    private static Logger log = LoggerManager.getLogger(Generation.class);
    
    private List listeGenerer = new ArrayList();
    
    public Generer getGenerer(String nomClasse) {
        log.debug("getGenerer : nomGenerer = "+nomClasse);
        for(Iterator iter = listeGenerer.iterator(); iter.hasNext(); ) {
            Generer generer = (Generer) iter.next();
            if(generer.getNomClasse().equals(nomClasse)) {
                return generer;
            }
        }
        throw new IllegalStateException("Le generer n'est pas défini : nom classe = "+nomClasse);
    }
    
    public List getListeGenerer() {
        return listeGenerer;
    }
    public void setListeGenerer(List listeGenerer) {
        this.listeGenerer = listeGenerer;
    }
    public void addGenerer(Generer g) {
        listeGenerer.add(g);
    }
}
