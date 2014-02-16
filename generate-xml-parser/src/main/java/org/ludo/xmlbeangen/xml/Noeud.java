/*
 * Projet   : Generator
 * Package  : generator.model
 * Source   : Classe.java
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
package org.ludo.xmlbeangen.xml;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;

/**
 * <b>Description :</b> <description de la classe>
 * 
 * @version : $Revision$, $Date$
 * @author : $Author$
 * @since : version 1.0.0
 */
public class Noeud {

	private Xml referenceXml = null;

	public Xml getReferenceXml() {
		return this.referenceXml;
	}

	public void setReferenceXml(final Xml referenceXml) {
		this.referenceXml = referenceXml;
	}

	private String nomPourParserSAX = "";
	
	public String getNomPourParserSAX() {
		return nomPourParserSAX;
	}

	public void setNomPourParserSAX(String nomPourParserSAX) {
		this.nomPourParserSAX = nomPourParserSAX;
	}

	private Noeud noeudParent = null;

	public Noeud getNoeudParent() {
		return noeudParent;
	}

	public void setNoeudParent(Noeud noeudParent) {
		this.noeudParent = noeudParent;
	}

	private Noeud referenceNoeud = null;

	public boolean hasReferenceNoeud() {
		return this.referenceNoeud != null;
	}

	public Noeud getReferenceNoeud() {
		return this.referenceNoeud;
	}

	public void setReferenceNoeud(final Noeud referenceNoeud) {
		this.referenceNoeud = referenceNoeud;
	}

	private List listeNoeud = new ArrayList();

	public Noeud getNoeud(final String nom) {
		for (final Iterator iter = this.listeNoeud.iterator(); iter.hasNext();) {
			final Noeud noeud = (Noeud) iter.next();
			if (noeud.getNomSansMajuscule().equalsIgnoreCase(nom)) {
				return noeud;
			}
		}
		throw new IllegalStateException("La noeud n'est pas dÃ©finie : nom = " + nom);
	}

	public int getNombreNoeud(final String nom) {
		int i = 0;
		for (final Iterator iter = this.listeNoeud.iterator(); iter.hasNext();) {
			final Noeud noeud = (Noeud) iter.next();
			if (noeud.getNomSansMajuscule().equalsIgnoreCase(nom)) {
				i++;
			}
		}
		return i;
	}

	public void addNoeud(final Noeud noeud) {
		noeud.setReferenceNoeud(this);
		this.listeNoeud.add(noeud);
	}

	public List getListeNoeud() {
		return this.listeNoeud;
	}

	public void setListeNoeud(final List listeNoeud) {
		this.listeNoeud = listeNoeud;
	}

	private List listeAttribut = new ArrayList();

	public Attribut getAttribut(final String nom) {
		for (final Iterator iter = this.listeAttribut.iterator(); iter.hasNext();) {
			final Attribut attribut = (Attribut) iter.next();
			if (attribut.getNom().equals(nom)) {
				return attribut;
			}
		}
		throw new IllegalStateException("La attribut n'est pas dÃ©finie : nom = " + nom);
	}

	public void addAttribut(final Attribut attribut) {
		attribut.setReferenceNoeud(this);
		this.listeAttribut.add(attribut);
	}

	public List getListeAttribut() {
		return this.listeAttribut;
	}

	public void setListeAttribut(final List listeAttribut) {
		this.listeAttribut = listeAttribut;
	}

	private String nom = "";

	public String getNomToutMajuscule() {
		return StringUtils.upperCase(this.nom);
	}

	public String getNomToutMinuscule() {
		return StringUtils.lowerCase(this.nom);
	}

	public String getNomAvecMajuscule() {
		return StringUtils.capitalize(this.nom);
	}

	public String getNomSansMajuscule() {
		return StringUtils.uncapitalize(this.nom);
	}

	public String getNomBean() {
		return StringUtils.capitalize(this.nom) + "Bean";
	}

	public String getNomInterface() {
		return StringUtils.capitalize(this.nom);
	}

	public String getNomAbstract() {
		return "Abstract" + this.getNomBean();
	}

	// public String getNom() {
	// return nom;
	// }
	public void setNom(final String nom) {
		this.nom = Noeud.formatNom(nom);
	}

	private String nomXml = "";

	public void setNomXml(final String nom) {
		this.nomXml = Noeud.formatNomXml(nom);
	}

	public String getNomXml() {
		return this.nomXml;
	}

	private static String formatNomXml(final String str) {
		String nom = "";
		final String[] subNomTab = str.split("-");
		for (int i = 0; i < subNomTab.length; i++) {
			if (i > 0) {
				nom += "-";
			}
			nom += StringUtils.uncapitalize(subNomTab[i]);
		}
		return nom;
	}

	private static String formatNom(final String str) {
		return NomHelper.formaterNomXmlEnNomJava(str);
	}

	public static final int NOMBRE_NOEUD_ILLIMITE = -1;
	public static final Integer NOMBRE_NOEUD_ILLIMITE_INTEGER = new Integer(Noeud.NOMBRE_NOEUD_ILLIMITE);

	private int nombre = Noeud.NOMBRE_NOEUD_ILLIMITE;

	public int getNombre() {
		return this.nombre;
	}

	public void setNombre(final int nombre) {
		this.nombre = nombre;
	}

}
