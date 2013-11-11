package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypesAttributRef;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AbstractGenStereotypeAttributBean implements GenStereotypeAttribut {
	
	/** Récupération de l'élément parent */
	
	private GenStereotypesAttributRef referenceGenStereotypesAttributRef = null;
	
	public GenStereotypesAttributRef getReferenceGenStereotypesAttributRef() {
		return referenceGenStereotypesAttributRef;
	}
	
	public void setReferenceGenStereotypesAttributRef(GenStereotypesAttributRef referenceGenStereotypesAttributRef) {
		this.referenceGenStereotypesAttributRef = referenceGenStereotypesAttributRef;
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
