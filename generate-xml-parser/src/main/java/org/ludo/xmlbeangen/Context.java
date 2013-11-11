/*
 * Projet   : Generator
 * Package  : generator.core.context
 * Source   : Context.java
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
package org.ludo.xmlbeangen;

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
