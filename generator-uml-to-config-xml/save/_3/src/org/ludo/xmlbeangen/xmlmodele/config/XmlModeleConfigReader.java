/*
 * Projet   : Generator
 * Package  : generator.core.generer.config
 * Source   : GenererConfigReader.java
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
package org.ludo.xmlbeangen.xmlmodele.config;

import org.ludo.utils.CreateParser;
import org.ludo.xmlbeangen.xmlmodele.XmlModeles;


/**
 * <b>Description :</b>
 * <description de la classe>
 *
 * @version : $Revision$, $Date$
 * @author  : $Author$
 * @since   : version 1.0.0
 */
public class XmlModeleConfigReader {
    
    /** Default parser name. */
    protected static final String DEFAULT_PARSER_NAME = "org.apache.xerces.parsers.SAXParser";
    
    private String filename = null;
    
    public XmlModeleConfigReader(String filename) {
        this.filename = filename;
    }
    
    public XmlModeles getXmlModeles() {
        
        // Create Handler
        XmlModeleConfigHandler c = new XmlModeleConfigHandler();

        // Create the parser
        CreateParser parser = new CreateParser(c);

        // Parse the XML file, handler generates the output
        parser.parse(filename);

        return c.getXmlModeles();
    }
    
    /*
    public static void main(String[] args) {
        XmlModeleConfigReader c = new XmlModeleConfigReader();
        System.out.println("liste classe = "+c.getListeClasse());
    }
    */
    
}
