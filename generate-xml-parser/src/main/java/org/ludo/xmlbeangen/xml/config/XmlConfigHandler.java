/*
 * Projet   : Generator
 * Package  : generator.core.classe.config
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
package org.ludo.xmlbeangen.xml.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.ludo.utils.LoggerManager;
import org.ludo.xmlbeangen.xml.Attribut;
import org.ludo.xmlbeangen.xml.Noeud;
import org.ludo.xmlbeangen.xml.Xml;
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
public class XmlConfigHandler extends DefaultHandler {
    
    private static Logger log = LoggerManager.getLogger(XmlConfigHandler.class);
    
    private EnCours enCours = new EnCours();
    
    private class EnCours {
        public Xml xml = new Xml();
        public Noeud noeud = null;
        //public Attribut attribut = null;
        Stack pileNoeud = new Stack();
    };
    
    public Xml getXml() {
        return enCours.xml;
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
        // CrÃ©er un noeud
        Noeud noeud = new Noeud();
        // DÃ©finir son nom
        noeud.setNomXml(localName);
        if( enCours.xml == null || enCours.xml.getNoeud() == null ) {
        	noeud.setNom(localName);
        } else {
        	noeud.setNom(enCours.xml.getNoeud().getNomSansMajuscule()+StringUtils.capitalize(localName));
        }
        // Ajouter les attributs du noeud
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if( "_NOMBRE".equalsIgnoreCase(attName)
             || "_NB".equalsIgnoreCase(attName) ) {
            	try {
            		noeud.setNombre(Integer.parseInt(atts.getValue(i)));
            	} catch(NumberFormatException e) {
            		// nothing
            	}
            } else
            if( "_NOM".equalsIgnoreCase(attName) ) {
            	if( enCours.xml == null || enCours.xml.getNoeud() == null ) {
                	noeud.setNom(atts.getValue(i));
                } else {
                	noeud.setNom(enCours.xml.getNoeud().getNomSansMajuscule()+StringUtils.capitalize(atts.getValue(i)));
                }
            } else {
            	Attribut attribut = new Attribut();
            	attribut.setNom(attName);
            	attribut.setNomXml(attName);
            	noeud.addAttribut(attribut);
            }
        }
        // Ajouter ce nouveau noeud
        if(enCours.noeud == null) {
        	enCours.xml.setNoeud(noeud);
        } else {
        	Noeud noeudParent = ((Noeud)enCours.pileNoeud.peek());
        	noeudParent.addNoeud(noeud);
            // Define parent node
            noeud.setNoeudParent(noeudParent);
        }
        // Le dÃ©finir comme noeud courant
        enCours.pileNoeud.push(noeud);
        enCours.noeud = noeud;

        // Définir le nom de variable pour le parser SAX qui sera généré
        defineNomPourParserSAX(noeud);
    }
    
    private void defineNomPourParserSAX(Noeud noeud) {
    	StringBuffer nom = new StringBuffer("");
    	Stack<Noeud> noeuds = new Stack<Noeud>();
    	Noeud noeudCourant = noeud;
    	while(noeudCourant != null) {
    		noeuds.push(noeudCourant);
    		noeudCourant = noeudCourant.getNoeudParent();
    	}
    	while(noeuds.size()!=0) {
    		noeudCourant = noeuds.pop();
    		nom.append(noeudCourant.getNomAvecMajuscule());
    	}
    	noeud.setNomPourParserSAX(nom.toString());
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
        enCours.pileNoeud.pop();
    }
    
}
