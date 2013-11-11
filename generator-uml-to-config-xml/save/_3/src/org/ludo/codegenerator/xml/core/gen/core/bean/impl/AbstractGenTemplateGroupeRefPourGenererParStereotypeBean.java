package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeRefPourGenererParStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupesRefPourGenererParStereotype;

public class AbstractGenTemplateGroupeRefPourGenererParStereotypeBean implements GenTemplateGroupeRefPourGenererParStereotype {
	
	/** Récupération de l'élément parent */
	
	private GenTemplateGroupesRefPourGenererParStereotype referenceGenTemplateGroupesRefPourGenererParStereotype = null;
	
	public GenTemplateGroupesRefPourGenererParStereotype getReferenceGenTemplateGroupesRefPourGenererParStereotype() {
		return referenceGenTemplateGroupesRefPourGenererParStereotype;
	}
	
	public void setReferenceGenTemplateGroupesRefPourGenererParStereotype(GenTemplateGroupesRefPourGenererParStereotype referenceGenTemplateGroupesRefPourGenererParStereotype) {
		this.referenceGenTemplateGroupesRefPourGenererParStereotype = referenceGenTemplateGroupesRefPourGenererParStereotype;
	}
	
	/** Récupération des éléments fils */
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	

	public String getTemplateGroupeNomAsString() {
		return this.templateGroupeNom;
	}
	public void setTemplateGroupeNomAsString(String templateGroupeNomAsString) {
		this.templateGroupeNom = templateGroupeNomAsString;
	}
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
	private String templateGroupeNom = null;

	public String getTemplateGroupeNom() {
		return this.templateGroupeNom;
	}
	public void setTemplateGroupeNom(String templateGroupeNom) {
		this.templateGroupeNom = templateGroupeNom;
	}
}
