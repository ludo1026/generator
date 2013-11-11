package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeRefPourGenererParTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupesRefPourGenererParTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypesRefPourGenererParTemplate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AbstractGenTemplateGroupeRefPourGenererParTemplateBean implements GenTemplateGroupeRefPourGenererParTemplate {
	
	/** Récupération de l'élément parent */
	
	private GenTemplateGroupesRefPourGenererParTemplate referenceGenTemplateGroupesRefPourGenererParTemplate = null;
	
	public GenTemplateGroupesRefPourGenererParTemplate getReferenceGenTemplateGroupesRefPourGenererParTemplate() {
		return referenceGenTemplateGroupesRefPourGenererParTemplate;
	}
	
	public void setReferenceGenTemplateGroupesRefPourGenererParTemplate(GenTemplateGroupesRefPourGenererParTemplate referenceGenTemplateGroupesRefPourGenererParTemplate) {
		this.referenceGenTemplateGroupesRefPourGenererParTemplate = referenceGenTemplateGroupesRefPourGenererParTemplate;
	}
	
	/** Récupération des éléments fils */

    private GenStereotypesRefPourGenererParTemplate genStereotypesRefPourGenererParTemplate = null;
    
    public GenStereotypesRefPourGenererParTemplate getGenStereotypesRefPourGenererParTemplate() {
    	return this.genStereotypesRefPourGenererParTemplate;
    }
    
    public void setGenStereotypesRefPourGenererParTemplate(GenStereotypesRefPourGenererParTemplate genStereotypesRefPourGenererParTemplate) {
    	genStereotypesRefPourGenererParTemplate.setReferenceGenTemplateGroupeRefPourGenererParTemplate(this);
    	this.genStereotypesRefPourGenererParTemplate = genStereotypesRefPourGenererParTemplate;
    }
	
	
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
