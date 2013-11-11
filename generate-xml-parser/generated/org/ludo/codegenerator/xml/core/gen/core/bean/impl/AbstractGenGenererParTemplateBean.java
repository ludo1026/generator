package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParTemplates;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeRefPourGenererParTemplates;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenGenererParTemplateBean implements GenGenererParTemplate {
	
	/** Récupération de l'élément parent */
	
	private GenGenererParTemplates referenceGenGenererParTemplates;
	
	public GenGenererParTemplates getReferenceGenGenererParTemplates() {
		return referenceGenGenererParTemplates;
	}
	
	public void setReferenceGenGenererParTemplates(GenGenererParTemplates referenceGenGenererParTemplates) {
		this.referenceGenGenererParTemplates = referenceGenGenererParTemplates;
	}
	
	/** Récupération des éléments fils */

    private GenTemplateGroupeRefPourGenererParTemplates genTemplateGroupeRefPourGenererParTemplates = new GenTemplateGroupeRefPourGenererParTemplatesBean();
    
    public GenTemplateGroupeRefPourGenererParTemplates getGenTemplateGroupeRefPourGenererParTemplates() {
    	return this.genTemplateGroupeRefPourGenererParTemplates;
    }
    
    public void setGenTemplateGroupeRefPourGenererParTemplates(GenTemplateGroupeRefPourGenererParTemplates genTemplateGroupeRefPourGenererParTemplates) {
    	genTemplateGroupeRefPourGenererParTemplates.setReferenceGenGenererParTemplate(this);
    	this.genTemplateGroupeRefPourGenererParTemplates = genTemplateGroupeRefPourGenererParTemplates;
    }
	
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

}
