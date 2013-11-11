/*
 * Projet   : Generator
 * Package  : generator.core.generer
 * Source   : Generer.java
 * CrÃ©ation : CHABOUD   Date : 29 mars 2007
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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



/**
 * <b>Description :</b>
 * <description de la classe>
 *
 * @version : $Revision$, $Date$
 * @author  : $Author$
 * @since   : version 1.0.0
 */
public class XmlModeles {
    
    private String path = null;

	public final String getPath() {
		return path;
	}

	public final void setPath(String path) {
		this.path = path;
	}
    

    private List listeXmlModele = new ArrayList();
    
    public XmlModele getXmlModele(String nom) {
        for(Iterator iter = listeXmlModele.iterator(); iter.hasNext(); ) {
            XmlModele xmlModele = (XmlModele) iter.next();
            if(xmlModele.getNom().equals(nom)) {
                return xmlModele;
            }
        }
        throw new IllegalStateException("La xmlModele n'est pas dÃ©finie : nom = "+nom);
    }
    public void addXmlModele(XmlModele xmlModele) {
        listeXmlModele.add(xmlModele);
    }
    public List getListeXmlModele() {
        return listeXmlModele;
    }
    public void setListeXmlModele(List listeXmlModele) {
        this.listeXmlModele = listeXmlModele;
    }


}
