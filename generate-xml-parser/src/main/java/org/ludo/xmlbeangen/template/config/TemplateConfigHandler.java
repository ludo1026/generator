/*
 * Projet   : Generator
 * Package  : generator.core.context.config
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
package org.ludo.xmlbeangen.template.config;



import org.apache.log4j.Logger;
import org.ludo.utils.LoggerManager;
import org.ludo.xmlbeangen.template.Template;
import org.ludo.xmlbeangen.template.Templates;
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
public class TemplateConfigHandler extends DefaultHandler {
    
    private static Logger log = LoggerManager.getLogger(TemplateConfigHandler.class);
    
    // description des champs 
    private float fOrderPrice = 0;
    private String priceElement = ""; //$NON-NLS-1$
    
    private static final String N_TEMPLATES                    = "TEMPLATES";
    private static final String N_TEMPLATES_A_REPERT_ENTREE    = "INDIR";
    private static final String N_TEMPLATES_A_REPERT_SORTIE    = "OUTDIR";
    private static final String N_TEMPLATES_A_PACKAGE_BASE     = "PACKAGEBASE";
    private static final String N_TEMPLATE                     = "TEMPLATE";
    private static final String N_TEMPLATE_A_NOM_TEMPLATE      = "NOM";
    private static final String N_TEMPLATE_A_NOM_FICHIER       = "FILE";
    private static final String N_TEMPLATE_A_NOM_FICHIER_SORTIE= "OUTFILE";
    private static final String N_TEMPLATE_A_REPERT_SORTIE     = "OUTDIR";
    private static final String N_TEMPLATE_A_PACKAGE           = "PACKAGE";
    
    private EnCours enCours = new EnCours();
    
    private class EnCours {
        public Templates templates = null;
        public Template template = null;
    };
    
    private Templates templates = null;
    
    public Templates getTemplates() {
        return templates;
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
        if (N_TEMPLATES.equalsIgnoreCase(localName)){
            startElement_Templates(namespaceURI, localName, qName, atts);
        }
        if (N_TEMPLATE.equalsIgnoreCase(localName)){
            startElement_Template(namespaceURI, localName, qName, atts);
        }
    }
    
    public void startElement_Templates(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
        log.info("startElement_ : noeud = "+localName);
        Templates templates = new Templates();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(N_TEMPLATES_A_REPERT_ENTREE.equalsIgnoreCase(attName)) {
                templates.setRepertoireEntree(atts.getValue(i));
            }
            if(N_TEMPLATES_A_REPERT_SORTIE.equalsIgnoreCase(attName)) {
                templates.setRepertoireSortie(atts.getValue(i));
            }
            if(N_TEMPLATES_A_PACKAGE_BASE.equalsIgnoreCase(attName)) {
                templates.setPackageBase(atts.getValue(i));
            }
        }
        enCours.templates = templates;
    }
    
    public void startElement_Template(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
        log.info("startElement_ : noeud = "+localName);
        Template template = new Template();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(N_TEMPLATE_A_NOM_TEMPLATE.equalsIgnoreCase(attName)) {
                template.setNomTemplate(atts.getValue(i));
            }
            if(N_TEMPLATE_A_NOM_FICHIER.equalsIgnoreCase(attName)) {
                template.setNomFichierTemplate(atts.getValue(i));
            }
            if(N_TEMPLATE_A_NOM_FICHIER_SORTIE.equalsIgnoreCase(attName)) {
                template.setNomFichierSortie(atts.getValue(i));
            }
            if(N_TEMPLATE_A_REPERT_SORTIE.equalsIgnoreCase(attName)) {
                template.setNomSousRepertoireSortie(atts.getValue(i));
            }
            if(N_TEMPLATE_A_PACKAGE.equalsIgnoreCase(attName)) {
                template.setNomSousPackage(atts.getValue(i));
            }
        }
        enCours.template = template;
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
        if (N_TEMPLATES.equalsIgnoreCase(localName)){
            endElement_Templates(namespaceURI, localName, qName);
        }
        if (N_TEMPLATE.equalsIgnoreCase(localName)){
            endElement_Template(namespaceURI, localName, qName);
        }
    }
    
    public void endElement_Templates(String namespaceURI, String localName, String qName)
    throws SAXException {
        log.info("  endElement_ : noeud = "+localName);
        templates = enCours.templates;
    }
    
    public void endElement_Template(String namespaceURI, String localName, String qName)
    throws SAXException {
        log.info("  endElement_ : noeud = "+localName);
        enCours.templates.addTemplate(enCours.template);
    }
    
}
