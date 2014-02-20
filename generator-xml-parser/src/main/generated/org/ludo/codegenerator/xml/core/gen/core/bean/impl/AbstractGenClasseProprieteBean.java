package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenClassePropriete;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenClasseProprieteBean implements GenClassePropriete {
	
	/** Récupération de l'élément parent */
	
	private GenClasse referenceGenClasse;
	
	public GenClasse getReferenceGenClasse() {
		return referenceGenClasse;
	}
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse) {
		this.referenceGenClasse = referenceGenClasse;
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
