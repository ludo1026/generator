/*
 * Projet   : Generator
 * Package  : generator.core.generer
 * Source   : GenererManager.java
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
package org.ludo.xmlbeangen.xmlmodele;


import org.ludo.xmlbeangen.xmlmodele.config.XmlModeleConfigReader;

/**
 * <b>Description :</b>
 * <description de la classe>
 *
 * @version : $Revision$, $Date$
 * @author  : $Author$
 * @since   : version 1.0.0
 */
public class XmlModeleManager {
    
    public static final int CONTEXT_VERSEMENT = 1;
    
    private XmlModeleManager() {}
    
    public static final XmlModeleManager getXmlModeleManager(String fileConfig) {
        XmlModeleManager c = new XmlModeleManager();
        XmlModeleConfigReader xmlModeleConfigReader = new XmlModeleConfigReader(fileConfig);
        c.xmlModeles = xmlModeleConfigReader.getXmlModeles();
        return c;
    }
    
    private XmlModeleConfigReader xmlModeleConfigReader = null;
    private XmlModeles xmlModeles = null;
    
    public XmlModeles getXmlModeles() {
        return xmlModeles;
    }
    
}
