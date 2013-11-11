/*
 * Projet   : Generator
 * Package  : generator.core.generer
 * Source   : GenererManager.java
 * Création : CHABOUD   Date : 28 mars 2007
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


import java.util.List;

import org.ludo.xmlbeangen.generer.config.GenererConfigReader;

/**
 * <b>Description :</b>
 * <description de la classe>
 *
 * @version : $Revision$, $Date$
 * @author  : $Author$
 * @since   : version 1.0.0
 */
public class GenererManager {
    
    public static final int CONTEXT_VERSEMENT = 1;
    
    private GenererManager() {}
    
    public static final GenererManager getGenererManager(String fileConfig) {
        GenererManager c = new GenererManager();
        GenererConfigReader genererConfigReader = new GenererConfigReader(fileConfig);
        c.generation = genererConfigReader.getGeneration();
        return c;
    }
    
    private GenererConfigReader genererConfigReader = null;
    private Generation generation = null;
    
    public List getListeGenerer() {
        return generation.getListeGenerer();
    }
    
    public Generer getGenerer(String nomClasse) {
        return generation.getGenerer(nomClasse);
    }
    
}
