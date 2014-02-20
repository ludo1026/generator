package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenStereotypeBean implements GenStereotype {
	
	/** Récupération de l'élément parent */
	
	private GenStereotypes referenceGenStereotypes;
	
	public GenStereotypes getReferenceGenStereotypes() {
		return referenceGenStereotypes;
	}
	
	public void setReferenceGenStereotypes(GenStereotypes referenceGenStereotypes) {
		this.referenceGenStereotypes = referenceGenStereotypes;
	}
	
	/** Récupération des éléments fils */
	
	private String nom = null;

	public String getNom() {
		return this.nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

}
