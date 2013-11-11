/*
 * Projet   : Generator
 * Package  : generator.core.context
 * Source   : Context.java
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
package org.ludo.codegenerator.core;

import org.apache.velocity.VelocityContext;

/**
 * <b>Description :</b>
 * <description de la classe>
 *
 * @version : $Revision$, $Date$
 * @author  : $Author$
 * @since   : version 1.0.0
 */
public class Context {
    
    private VelocityContext velocityContext = null;
    private String filename = null;
    
    public VelocityContext getVelocityContext() {
        return velocityContext;
    }
    public void setVelocityContext(VelocityContext velocityContext) {
        this.velocityContext = velocityContext;
    }
}
