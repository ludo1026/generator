package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenProprieteMethode;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenProprieteMethodes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenProprieteMethodeBean implements GenProprieteMethode {
	
	/** Récupération de l'élément parent */
	
	private GenProprieteMethodes referenceGenProprieteMethodes;
	
	public GenProprieteMethodes getReferenceGenProprieteMethodes() {
		return referenceGenProprieteMethodes;
	}
	
	public void setReferenceGenProprieteMethodes(GenProprieteMethodes referenceGenProprieteMethodes) {
		this.referenceGenProprieteMethodes = referenceGenProprieteMethodes;
	}
	
	/** Récupération des éléments fils */
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	

	public String getNomAsString() {
		return this.nom;
	}
	public void setNomAsString(String nomAsString) {
		this.nom = nomAsString;
	}

	public String getValeurAsString() {
		return this.valeur;
	}
	public void setValeurAsString(String valeurAsString) {
		this.valeur = valeurAsString;
	}
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
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
