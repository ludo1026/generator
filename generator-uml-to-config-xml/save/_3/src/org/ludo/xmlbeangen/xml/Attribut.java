/*
 * Projet   : Generator
 * Package  : generator.model
 * Source   : Attribut.java
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
package org.ludo.xmlbeangen.xml;

import org.apache.commons.lang.StringUtils;


/**
 * <b>Description :</b>
 * <description de la classe>
 *
 * @version : $Revision$, $Date$
 * @author  : $Author$
 * @since   : version 1.0.0
 */
public class Attribut {
    
	private Noeud referenceNoeud = null;
	
	public Noeud getReferenceNoeud() {
		return referenceNoeud;
	}
	public void setReferenceNoeud(Noeud referenceNoeud) {
		this.referenceNoeud = referenceNoeud;
	}
	
    
    private String nom = null;

    public String getNomToutMajuscule() {
        return StringUtils.upperCase(nom);
    }
    public String getNomAvecMajuscule() {
        return StringUtils.capitalize(nom);
    }
    public String getNomSansMajuscule() {
        return StringUtils.uncapitalize(nom);
    }
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = formatNom(nom);
	}
	
    private String nomXml = null;
	public void setNomXml(String nom) {
		this.nomXml = formatNomXml(nom);
	}
	public String getNomXml() {
		return this.nomXml;
	}
	
	private static String formatNomXml(String str) {
		String nom = "";
		String[] subNomTab = str.split("-");
		for(int i=0; i<subNomTab.length; i++) {
			if( i>0 ) {
				nom += "-";
			}
			nom += StringUtils.uncapitalize(subNomTab[i]);
		}
		return nom;
	}
	
	private static String formatNom(String str) {
		return NomHelper.formaterNomXmlEnNomJava(str);
	}
	
    
    
    
}
