/*
 * Projet   : Generator
 * Package  : generator.core.classe
 * Source   : Classes.java
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
package org.ludo.xmlbeangen.xml;


/**
 * <b>Description :</b>
 * <description de la classe>
 *
 * @version : $Revision$, $Date$
 * @author  : $Author$
 * @since   : version 1.0.0
 */
public class Xml {
    
	private Noeud noeud = null;

	public final Noeud getNoeud() {
		return noeud;
	}

	public final void setNoeud(Noeud noeud) {
		noeud.setReferenceXml(this);
		this.noeud = noeud;
	}
	
/*	
    private List listeNoeud = new ArrayList();
    
    public Noeud getNoeud(String nom) {
        for(Iterator iter = listeNoeud.iterator(); iter.hasNext(); ) {
            Noeud noeud = (Noeud) iter.next();
            if(noeud.getNom().equals(nom)) {
                return noeud;
            }
        }
        throw new IllegalStateException("La noeud n'est pas dÃ©finie : nom = "+nom);
    }
    public void addNoeud(Noeud noeud) {
    	noeud.setReferenceXml(this);
        listeNoeud.add(noeud);
    }
    public List getListeNoeud() {
        return listeNoeud;
    }
    public void setListeNoeud(List listeNoeud) {
        this.listeNoeud = listeNoeud;
    }
    */
}
