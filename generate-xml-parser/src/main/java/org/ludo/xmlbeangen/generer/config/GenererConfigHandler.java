/*
 * Projet   : Generator
 * Package  : generator.core.generer.config
 * Source   : AbstractDefaultHandler.java
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
package org.ludo.xmlbeangen.generer.config;



import org.apache.log4j.Logger;
import org.ludo.utils.LoggerManager;
import org.ludo.xmlbeangen.generer.Generation;
import org.ludo.xmlbeangen.generer.Generer;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


/**
 * <b>Description :</b>
 * <description de la classe>
 *
 * @version : $Revision$, $Date$
 * @author  : $Author$
 * @since   : version 1.0.0
 */
public class GenererConfigHandler extends DefaultHandler {
    
    private static Logger log = LoggerManager.getLogger(GenererConfigHandler.class);
    
    // description des champs 
    private float fOrderPrice = 0;
    private String priceElement = "";
    private final String N_GENERATION = "GENERATION";
    private final String N_CLASSE = "GENERER";
    private final String N_CLASSE_A_NOM_CLASSE = "NOMCLASSE";
    private final String N_TEMPLATE = "PATTERN";
    private final String N_TEMPLATE_A_NOM_TEMPLATE = "NOMTEMPLATE";
    
    private EnCours enCours = new EnCours();
    
    private class EnCours {
        public Generation generation = null;
        public Generer generer = null;
        public String nomTemplate = null;
    };
    
    private Generation generation = new Generation();
    
    public Generation getGeneration() {
        return generation;
    }
    
    /**
     * Receive notification of the start of an element.
     * @param namespaceURI - The Namespace URI, or the empty string if the element has no Namespace URI or if Namespace processing is not being performed.
     * @param localName - The local name (without prefix), or the empty string if Namespace processing is not being performed.
     * @param qName - The qualified name (with prefix), or the empty string if qualified names are not available.
     * @param atts - The attributes attached to the element. If there are no attributes, it shall be an empty Attributes object.
     * @throws SAXException - Any SAX exception, possibly wrapping another exception.
     */
    public void startElement(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
        log.info("startElement : noeud = "+localName);
        if (N_GENERATION.equalsIgnoreCase(localName)){
            startElement_Generation(namespaceURI, localName, qName, atts);
        }
        if (N_CLASSE.equalsIgnoreCase(localName)){
            startElement_Generer(namespaceURI, localName, qName, atts);
        }
        if (N_TEMPLATE.equalsIgnoreCase(localName)){
            startElement_Template(namespaceURI, localName, qName, atts);
        }
    }
    
    public void startElement_Generation(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
        enCours.generation = new Generation();
    }
    
    public void startElement_Generer(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
        Generer generer = new Generer();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(N_CLASSE_A_NOM_CLASSE.equalsIgnoreCase(attName)) {
                generer.setNomClasse(atts.getValue(i));
            }
        }
        enCours.generer = generer;
    }
    
    public void startElement_Template(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
        String nomTemplate = null;
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(N_TEMPLATE_A_NOM_TEMPLATE.equalsIgnoreCase(attName)) {
                nomTemplate = atts.getValue(i);
            }
        }
        enCours.nomTemplate = nomTemplate;
    }
    
    /**
     * Receive notification of character data inside an element.
     * @param ch - The characters.
     * @param start - The start position in the character array.
     * @param length - The number of characters to use from the character array.
     * @throws SAXException - Any SAX exception, possibly wrapping another exception.
     */
    public void characters(char[] ch, int start, int length)
    throws SAXException {
        //String strValue = new String(ch, start, length);
    }
    
    /**
     * Receive notification of the end of an element.
     * @param namespaceURI - The Namespace URI, or the empty string if the element has no Namespace URI or if Namespace processing is not being performed.
     * @param localName - The local name (without prefix), or the empty string if Namespace processing is not being performed.
     * @param qName - The qualified name (with prefix), or the empty string if qualified names are not available.
     * @throws SAXException - Any SAX exception, possibly wrapping another exception.
     */
    public void endElement(String namespaceURI, String localName, String qName)
    throws SAXException {
        log.info("endElement : noeud = "+localName);
        if (N_GENERATION.equalsIgnoreCase(localName)){
            endElement_Generation(namespaceURI, localName, qName);
        }
        if (N_CLASSE.equalsIgnoreCase(localName)){
            endElement_Generer(namespaceURI, localName, qName);
        }
        if (N_TEMPLATE.equalsIgnoreCase(localName)){
            endElement_Template(namespaceURI, localName, qName);
        }
    }
    
    public void endElement_Generation(String namespaceURI, String localName, String qName)
    throws SAXException {
        generation = enCours.generation;
    }
    
    public void endElement_Generer(String namespaceURI, String localName, String qName)
    throws SAXException {
        enCours.generation.addGenerer(enCours.generer);
    }
    
    public void endElement_Template(String namespaceURI, String localName, String qName)
    throws SAXException {
        enCours.generer.addNomTemplate(enCours.nomTemplate);
    }
    
}
