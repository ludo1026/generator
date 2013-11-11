package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypesClasseRef;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AbstractGenStereotypeClasseBean implements GenStereotypeClasse {
	
	/** Récupération de l'élément parent */
	
	private GenStereotypesClasseRef referenceGenStereotypesClasseRef = null;
	
	public GenStereotypesClasseRef getReferenceGenStereotypesClasseRef() {
		return referenceGenStereotypesClasseRef;
	}
	
	public void setReferenceGenStereotypesClasseRef(GenStereotypesClasseRef referenceGenStereotypesClasseRef) {
		this.referenceGenStereotypesClasseRef = referenceGenStereotypesClasseRef;
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
