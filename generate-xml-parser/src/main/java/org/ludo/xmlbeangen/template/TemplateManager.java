/*
 * Projet   : Generator
 * Package  : generator.core.template
 * Source   : TemplateManager.java
 * CrÃ©ation : CHABOUD   Date : 28 mars 2007
 * Copyright (C) 2007   Apria RSA
 *
 * --------------- DerniÃ¨re mise Ã  jour ---------------------
 * @author  : $author$
 * @version : $Revision$, $Date$
 * --------------- Historique -------------------------------
 * Auteur :                      Date : ../../....
 * Motif  :
 */
package org.ludo.xmlbeangen.template;


import java.util.List;

import org.ludo.xmlbeangen.template.config.TemplateConfigReader;

/**
 * <b>Description :</b>
 * <description de la classe>
 *
 * @version : $Revision$, $Date$
 * @author  : $Author$
 * @since   : version 1.0.0
 */
public class TemplateManager {
    
    public static final int CONTEXT_VERSEMENT = 1;
    
    private TemplateManager() {}
    
    public static final TemplateManager getTemplateManager(String fileConfig) {
        TemplateManager c = new TemplateManager();
        TemplateConfigReader templateConfigReader = new TemplateConfigReader(fileConfig);
        c.templates = templateConfigReader.getTemplates(); 
        return c;
    }
    
    private TemplateConfigReader templateConfigReader = null;
    private Templates templates = null;
    
    public Templates getTemplates() {
        return templates;
    }
    
    public List getListeTemplate() {
        return templates.getListeTemplates();
    }

}
