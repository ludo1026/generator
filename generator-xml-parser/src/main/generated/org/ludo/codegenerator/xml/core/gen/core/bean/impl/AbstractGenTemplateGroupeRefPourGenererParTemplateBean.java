package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeRefPourGenererParTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeRefPourGenererParTemplates;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeRefPourGenererParTemplates;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenTemplateGroupeRefPourGenererParTemplateBean implements GenTemplateGroupeRefPourGenererParTemplate {
	
	/** R�cup�ration de l'�l�ment parent */
	
	private GenTemplateGroupeRefPourGenererParTemplates referenceGenTemplateGroupeRefPourGenererParTemplates;
	
	public GenTemplateGroupeRefPourGenererParTemplates getReferenceGenTemplateGroupeRefPourGenererParTemplates() {
		return referenceGenTemplateGroupeRefPourGenererParTemplates;
	}
	
	public void setReferenceGenTemplateGroupeRefPourGenererParTemplates(GenTemplateGroupeRefPourGenererParTemplates referenceGenTemplateGroupeRefPourGenererParTemplates) {
		this.referenceGenTemplateGroupeRefPourGenererParTemplates = referenceGenTemplateGroupeRefPourGenererParTemplates;
	}
	
	/** R�cup�ration des �l�ments fils */

    private GenStereotypeRefPourGenererParTemplates genStereotypeRefPourGenererParTemplates = new GenStereotypeRefPourGenererParTemplatesBean();
    
    public GenStereotypeRefPourGenererParTemplates getGenStereotypeRefPourGenererParTemplates() {
    	return this.genStereotypeRefPourGenererParTemplates;
    }
    
    public void setGenStereotypeRefPourGenererParTemplates(GenStereotypeRefPourGenererParTemplates genStereotypeRefPourGenererParTemplates) {
    	genStereotypeRefPourGenererParTemplates.setReferenceGenTemplateGroupeRefPourGenererParTemplate(this);
    	this.genStereotypeRefPourGenererParTemplates = genStereotypeRefPourGenererParTemplates;
    }
	
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	

	public String getTemplateGroupeNomAsString() {
		return this.templateGroupeNom;
	}
	public void setTemplateGroupeNomAsString(String templateGroupeNomAsString) {
		this.templateGroupeNom = templateGroupeNomAsString;
	}
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	
	private String templateGroupeNom = null;

	public String getTemplateGroupeNom() {
		return this.templateGroupeNom;
	}
	public void setTemplateGroupeNom(String templateGroupeNom) {
		this.templateGroupeNom = templateGroupeNom;
	}

}
