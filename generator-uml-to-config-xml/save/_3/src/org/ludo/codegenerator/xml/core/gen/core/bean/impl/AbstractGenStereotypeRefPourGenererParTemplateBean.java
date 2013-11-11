package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeRefPourGenererParTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypesRefPourGenererParTemplate;

public class AbstractGenStereotypeRefPourGenererParTemplateBean implements GenStereotypeRefPourGenererParTemplate {
	
	/** Récupération de l'élément parent */
	
	private GenStereotypesRefPourGenererParTemplate referenceGenStereotypesRefPourGenererParTemplate = null;
	
	public GenStereotypesRefPourGenererParTemplate getReferenceGenStereotypesRefPourGenererParTemplate() {
		return referenceGenStereotypesRefPourGenererParTemplate;
	}
	
	public void setReferenceGenStereotypesRefPourGenererParTemplate(GenStereotypesRefPourGenererParTemplate referenceGenStereotypesRefPourGenererParTemplate) {
		this.referenceGenStereotypesRefPourGenererParTemplate = referenceGenStereotypesRefPourGenererParTemplate;
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
