package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseMethodeStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseMethode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenClasseMethodeStereotypeBean implements GenClasseMethodeStereotype {
	
	/** Récupération de l'élément parent */
	
	private GenClasseMethode referenceGenClasseMethode;
	
	public GenClasseMethode getReferenceGenClasseMethode() {
		return referenceGenClasseMethode;
	}
	
	public void setReferenceGenClasseMethode(GenClasseMethode referenceGenClasseMethode) {
		this.referenceGenClasseMethode = referenceGenClasseMethode;
	}
	
	/** Récupération des éléments fils */
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	

	public String getNomAsString() {
		return this.nom;
	}
	public void setNomAsString(String nomAsString) {
		this.nom = nomAsString;
	}
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
	private String nom = null;

	public String getNom() {
		return this.nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

}
