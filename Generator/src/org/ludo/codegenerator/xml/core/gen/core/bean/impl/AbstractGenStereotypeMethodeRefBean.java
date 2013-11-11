package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeMethode;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypesMethodeRef;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AbstractGenStereotypeMethodeBean implements GenStereotypeMethode {
	
	/** Récupération de l'élément parent */
	
	private GenStereotypesMethodeRef referenceGenStereotypesMethodeRef = null;
	
	public GenStereotypesMethodeRef getReferenceGenStereotypesMethodeRef() {
		return referenceGenStereotypesMethodeRef;
	}
	
	public void setReferenceGenStereotypesMethodeRef(GenStereotypesMethodeRef referenceGenStereotypesMethodeRef) {
		this.referenceGenStereotypesMethodeRef = referenceGenStereotypesMethodeRef;
	}
	
	/** Récupération des éléments fils */
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	

	public String getNomAsString() {
		return this.Nom;
	}
	public void setNomAsString(String NomAsString) {
		this.Nom = NomAsString;
	}
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
	private String Nom = null;

	public String getNom() {
		return this.Nom;
	}
	public void setNom(String Nom) {
		this.Nom = Nom;
	}
}
