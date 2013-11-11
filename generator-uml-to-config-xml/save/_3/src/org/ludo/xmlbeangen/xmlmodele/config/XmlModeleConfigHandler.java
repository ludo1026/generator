/*
 * Projet   : Generator
 * Package  : generator.core.xmlModele.config
 * Source   : AbstractDefaultHandler.java
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



import org.apache.log4j.Logger;
import org.ludo.utils.LoggerManager;
import org.ludo.xmlbeangen.xmlmodele.XmlModele;
import org.ludo.xmlbeangen.xmlmodele.XmlModeles;
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
public class XmlModeleConfigHandler extends DefaultHandler {
    
    private static Logger log = LoggerManager.getLogger(XmlModeleConfigHandler.class);
    
    // description des champs 
    private float fOrderPrice = 0;
    private String priceElement = "";
    private final String N_XMLMODELES = "XMLMODELES";
    private final String N_XMLMODELES_A_PATH = "PATH";
    private final String N_XMLMODELE = "XMLMODELE";
    private final String N_XMLMODELE_A_NOM = "NOM";
    private final String N_XMLMODELE_A_FICHIER = "FICHIER";
    
    private EnCours enCours = new EnCours();
    
    private class EnCours {
        public XmlModeles xmlModeles = null;
        public XmlModele xmlModele = null;
    };
    
    private XmlModeles xmlModeles = new XmlModeles();
    
    public XmlModeles getXmlModeles() {
        return xmlModeles;
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
        if (N_XMLMODELES.equalsIgnoreCase(localName)){
            startElement_XmlModeles(namespaceURI, localName, qName, atts);
        }
        if (N_XMLMODELE.equalsIgnoreCase(localName)){
            startElement_XmlModele(namespaceURI, localName, qName, atts);
        }
    }
    
    public void startElement_XmlModeles(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
        XmlModeles xmlModeles = new XmlModeles();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(N_XMLMODELES_A_PATH.equalsIgnoreCase(attName)) {
                xmlModeles.setPath(atts.getValue(i));
            }
        }
        enCours.xmlModeles = xmlModeles;
    }
    
    public void startElement_XmlModele(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
        XmlModele xmlModele = new XmlModele();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(N_XMLMODELE_A_NOM.equalsIgnoreCase(attName)) {
                xmlModele.setNom(atts.getValue(i));
            }
            if(N_XMLMODELE_A_FICHIER.equalsIgnoreCase(attName)) {
                xmlModele.setFichier(atts.getValue(i));
            }
        }
        enCours.xmlModele = xmlModele;
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
        if (N_XMLMODELES.equalsIgnoreCase(localName)){
            endElement_XmlModeles(namespaceURI, localName, qName);
        }
        if (N_XMLMODELE.equalsIgnoreCase(localName)){
            endElement_XmlModele(namespaceURI, localName, qName);
        }
    }
    
    public void endElement_XmlModeles(String namespaceURI, String localName, String qName)
    throws SAXException {
        xmlModeles = enCours.xmlModeles;
    }
    
    public void endElement_XmlModele(String namespaceURI, String localName, String qName)
    throws SAXException {
        enCours.xmlModeles.addXmlModele(enCours.xmlModele);
    }
    
}
