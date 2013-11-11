/*
 * Projet   : Generator
 * Package  : generator.core.classe.config
 * Source   : ClasseConfigReader.java
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
package org.ludo.xmlbeangen.xml.config;

import org.ludo.utils.CreateParser;
import org.ludo.xmlbeangen.xml.Xml;

/**
 * <b>Description :</b>
 * <description de la classe>
 *
 * @version : $Revision$, $Date$
 * @author  : $Author$
 * @since   : version 1.0.0
 */
public class XmlConfigReader {
    
    /** Default parser name. */
    protected static final String DEFAULT_PARSER_NAME = "org.apache.xerces.parsers.SAXParser";
    
    private String filename = null;
    
    public XmlConfigReader(String filename) {
        this.filename = filename;
    }
    
    public Xml getXml() {
        
        // Create Handler
        XmlConfigHandler xmlConfigHandler = new XmlConfigHandler();

        // Create the parser
        CreateParser parser = new CreateParser(xmlConfigHandler);

        // Parse the XML file, handler generates the output
        parser.parse(filename);

        return xmlConfigHandler.getXml();
    }
    
    /*
    public static void main(String[] args) {
        ClasseConfigReader c = new ClasseConfigReader();
        System.out.println("liste classe = "+c.getListeClasse());
    }
    */
    
}
