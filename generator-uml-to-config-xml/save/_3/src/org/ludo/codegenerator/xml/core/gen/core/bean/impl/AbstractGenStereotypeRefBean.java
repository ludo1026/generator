package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeRef;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypesRef;

public class AbstractGenStereotypeRefBean implements GenStereotypeRef {
	
	/** Récupération de l'élément parent */
	
	private GenStereotypesRef referenceGenStereotypesRef = null;
	
	public GenStereotypesRef getReferenceGenStereotypesRef() {
		return referenceGenStereotypesRef;
	}
	
	public void setReferenceGenStereotypesRef(GenStereotypesRef referenceGenStereotypesRef) {
		this.referenceGenStereotypesRef = referenceGenStereotypesRef;
	}
	
	/** Récupération des éléments fils */
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	

	public String getStereotypeNomAsString() {
		return this.stereotypeNom;
	}
	public void setStereotypeNomAsString(String stereotypeNomAsString) {
		this.stereotypeNom = stereotypeNomAsString;
	}
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
	private String stereotypeNom = null;

	public String getStereotypeNom() {
		return this.stereotypeNom;
	}
	public void setStereotypeNom(String stereotypeNom) {
		this.stereotypeNom = stereotypeNom;
	}
}
