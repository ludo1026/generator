/*
 * Projet   : Generator
 * Package  : generator.core.context.config
 * Source   : TemplateConfigReader.java
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
package org.ludo.xmlbeangen.template.config;

import org.ludo.utils.CreateParser;
import org.ludo.xmlbeangen.template.Templates;


/**
 * <b>Description :</b>
 * <description de la classe>
 *
 * @version : $Revision$, $Date$
 * @author  : $Author$
 * @since   : version 1.0.0
 */
public class TemplateConfigReader {
    
    /** Default parser name. */
    protected static final String DEFAULT_PARSER_NAME = "org.apache.xerces.parsers.SAXParser";
    
    private String filename = null;
    
    public TemplateConfigReader(String filename) {
        this.filename = filename;
    }
    
    public Templates getTemplates() {
        
        // Create Handler
        TemplateConfigHandler t = new TemplateConfigHandler();

        // Create the parser
        CreateParser parser = new CreateParser(t);

        // Parse the XML file, handler generates the output
        parser.parse(filename);

        return t.getTemplates();
    }
    
    public static void main(String[] args) {
        TemplateConfigReader t = new TemplateConfigReader("config/config.xml");
        System.out.println("templates = "+t.getTemplates());
    }
    
    
}
