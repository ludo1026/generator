package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypes;

public class AbstractGenStereotypeBean implements GenStereotype {
	
	/** Récupération de l'élément parent */
	
	private GenStereotypes referenceGenStereotypes = null;
	
	public GenStereotypes getReferenceGenStereotypes() {
		return referenceGenStereotypes;
	}
	
	public void setReferenceGenStereotypes(GenStereotypes referenceGenStereotypes) {
		this.referenceGenStereotypes = referenceGenStereotypes;
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
