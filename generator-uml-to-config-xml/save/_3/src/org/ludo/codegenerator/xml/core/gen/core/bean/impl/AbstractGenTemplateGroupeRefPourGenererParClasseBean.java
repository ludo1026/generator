package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeRefPourGenererParClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupesRefPourGenererParClasse;

public class AbstractGenTemplateGroupeRefPourGenererParClasseBean implements GenTemplateGroupeRefPourGenererParClasse {
	
	/** Récupération de l'élément parent */
	
	private GenTemplateGroupesRefPourGenererParClasse referenceGenTemplateGroupesRefPourGenererParClasse = null;
	
	public GenTemplateGroupesRefPourGenererParClasse getReferenceGenTemplateGroupesRefPourGenererParClasse() {
		return referenceGenTemplateGroupesRefPourGenererParClasse;
	}
	
	public void setReferenceGenTemplateGroupesRefPourGenererParClasse(GenTemplateGroupesRefPourGenererParClasse referenceGenTemplateGroupesRefPourGenererParClasse) {
		this.referenceGenTemplateGroupesRefPourGenererParClasse = referenceGenTemplateGroupesRefPourGenererParClasse;
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
