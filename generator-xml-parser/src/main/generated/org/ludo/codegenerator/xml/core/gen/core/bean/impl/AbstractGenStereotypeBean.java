package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenStereotypeBean implements GenStereotype {
	
	/** R�cup�ration de l'�l�ment parent */
	
	private GenStereotypes referenceGenStereotypes;
	
	public GenStereotypes getReferenceGenStereotypes() {
		return referenceGenStereotypes;
	}
	
	public void setReferenceGenStereotypes(GenStereotypes referenceGenStereotypes) {
		this.referenceGenStereotypes = referenceGenStereotypes;
	}
	
	/** R�cup�ration des �l�ments fils */
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	

	public String getNomAsString() {
		return this.nom;
	}
	public void setNomAsString(String nomAsString) {
		this.nom = nomAsString;
	}
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	
	private String nom = null;

	public String getNom() {
		return this.nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

}
