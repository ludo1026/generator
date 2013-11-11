/*
 * Projet   : Generator
 * Package  : log
 * Source   : Logger.java
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
package org.ludo.utils;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * <b>Description :</b>
 * <description de la classe>
 *
 * @version : $Revision$, $Date$
 * @author  : $Author$
 * @since   : version 1.0.0
 */
public class LoggerManager {
    
    private static boolean hasBeenInitialized = false;
    
    static {
        if(!hasBeenInitialized) {
            hasBeenInitialized = true;
            PropertyConfigurator.configure("log4j.properties");
        }
    }
    
    public static final Logger getLogger(Class objectClass) {
        return Logger.getLogger(objectClass.getName());
    }
    
}
