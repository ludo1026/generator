package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseAttributPropriete;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseAttribut;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenClasseAttributProprieteBean implements GenClasseAttributPropriete {
	
	/** Récupération de l'élément parent */
	
	private GenClasseAttribut referenceGenClasseAttribut;
	
	public GenClasseAttribut getReferenceGenClasseAttribut() {
		return referenceGenClasseAttribut;
	}
	
	public void setReferenceGenClasseAttribut(GenClasseAttribut referenceGenClasseAttribut) {
		this.referenceGenClasseAttribut = referenceGenClasseAttribut;
	}
	
	/** Récupération des éléments fils */
	
	private String nom = null;
	private String valeur = null;

	public String getNom() {
		return this.nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getValeur() {
		return this.valeur;
	}
	public void setValeur(String valeur) {
		this.valeur = valeur;
	}

}
