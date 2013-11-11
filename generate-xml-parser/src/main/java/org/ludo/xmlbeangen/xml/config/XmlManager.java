/*
 * Projet   : Generator
 * Package  : generator.core.classe
 * Source   : ClasseManager.java
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

import org.ludo.xmlbeangen.xml.Xml;



/**
 * <b>Description :</b>
 * <description de la classe>
 *
 * @version : $Revision$, $Date$
 * @author  : $Author$
 * @since   : version 1.0.0
 */
public class XmlManager {
    
    public static final int CONTEXT_VERSEMENT = 1;
    
    private XmlManager() {}
    
    public static final XmlManager getXmlManager(String fileConfig) {
        XmlManager xmlManager = new XmlManager();
        XmlConfigReader xmlConfigReader = new XmlConfigReader(fileConfig);
        xmlManager.xml = xmlConfigReader.getXml();
        return xmlManager;
    }
    
    private Xml xml = null;
    
    public Xml getXml() {
        return xml;
    }
}
