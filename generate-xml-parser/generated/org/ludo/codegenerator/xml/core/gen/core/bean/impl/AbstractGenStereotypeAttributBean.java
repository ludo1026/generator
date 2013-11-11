package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeAttributs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenStereotypeAttributBean implements GenStereotypeAttribut {
	
	/** Récupération de l'élément parent */
	
	private GenStereotypeAttributs referenceGenStereotypeAttributs;
	
	public GenStereotypeAttributs getReferenceGenStereotypeAttributs() {
		return referenceGenStereotypeAttributs;
	}
	
	public void setReferenceGenStereotypeAttributs(GenStereotypeAttributs referenceGenStereotypeAttributs) {
		this.referenceGenStereotypeAttributs = referenceGenStereotypeAttributs;
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
