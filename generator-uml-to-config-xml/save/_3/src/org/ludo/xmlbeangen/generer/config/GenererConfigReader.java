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
package org.ludo.xmlbeangen.generer.config;

import org.ludo.utils.CreateParser;
import org.ludo.xmlbeangen.generer.Generation;


/**
 * <b>Description :</b>
 * <description de la classe>
 *
 * @version : $Revision$, $Date$
 * @author  : $Author$
 * @since   : version 1.0.0
 */
public class GenererConfigReader {
    
    /** Default parser name. */
    protected static final String DEFAULT_PARSER_NAME = "org.apache.xerces.parsers.SAXParser";
    
    private String filename = null;
    
    public GenererConfigReader(String filename) {
        this.filename = filename;
    }
    
    public Generation getGeneration() {
        
        // Create Handler
        GenererConfigHandler c = new GenererConfigHandler();

        // Create the parser
        CreateParser parser = new CreateParser(c);

        // Parse the XML file, handler generates the output
        parser.parse(filename);

        return c.getGeneration();
    }
    
    /*
    public static void main(String[] args) {
        GenererConfigReader c = new GenererConfigReader();
        System.out.println("liste classe = "+c.getListeClasse());
    }
    */
    
}
