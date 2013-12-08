package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeClasses;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenStereotypeClasseBean implements GenStereotypeClasse {
	
	/** Récupération de l'élément parent */
	
	private GenStereotypeClasses referenceGenStereotypeClasses;
	
	public GenStereotypeClasses getReferenceGenStereotypeClasses() {
		return referenceGenStereotypeClasses;
	}
	
	public void setReferenceGenStereotypeClasses(GenStereotypeClasses referenceGenStereotypeClasses) {
		this.referenceGenStereotypeClasses = referenceGenStereotypeClasses;
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
