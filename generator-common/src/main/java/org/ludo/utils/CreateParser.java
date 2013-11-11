/*
 * Projet   : Deploiement
 * Package  : xml
 * Source   : CreateParser.java
 * Création : GOULLEY   Date : 28 mars 2007
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

import java.io.File;
import java.io.InputStream;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.helpers.DefaultHandler;

/**
 * <b>Desctription :</b>
 * <description de la classe>
 *
 * @version : $Revision$, $Date$
 * @version : $Author$
 * @since   : version 1.0.0
 */
public class CreateParser {

    private DefaultHandler handler;
    private SAXParser saxParser;

    /**
     * Constructor
     * @param handler - DefaultHandler for the SAX parser
     */
    public CreateParser(DefaultHandler handler) {
      this.handler = handler;
      create();
    }

    /**
     * Create the SAX parser
     */
    private void create() {
      try {
        // Obtain a new instance of a SAXParserFactory.
        SAXParserFactory factory = SAXParserFactory.newInstance();
        // Specifies that the parser produced by this code will provide support for XML namespaces.
        factory.setNamespaceAware(true);
        // Specifies that the parser produced by this code will validate documents as they are parsed.
        factory.setValidating(true);
        // Creates a new instance of a SAXParser using the currently configured factory parameters.
        saxParser = factory.newSAXParser();
      } catch (Throwable t) {
        t.printStackTrace();
      }
    }

    /**
     * Parse a File
     * @param file - File
     */
    public void parse(File file){
      try{
        saxParser.parse(file,handler);
      } catch (Throwable t) {
        t.printStackTrace();
      }
    }

    /**
     * Parse a URI
     * @param uri - String
     */
    public void parse(String uri){
      try{
        saxParser.parse(uri,handler);
      } catch (Throwable t) {
        t.printStackTrace();
      }
    }

    /**
     * Parse a Stream
     * @param stream - InputStream
     */
    public void parse(InputStream stream){
      try{
        saxParser.parse(stream,handler);
      } catch (Throwable t) {
        t.printStackTrace();
      }
    }
  }

