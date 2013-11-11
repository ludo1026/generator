package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParTemplates;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupesRefPourGenererParTemplate;

public class AbstractGenGenererParTemplateBean implements GenGenererParTemplate {
	
	/** Récupération de l'élément parent */
	
	private GenGenererParTemplates referenceGenGenererParTemplates = null;
	
	public GenGenererParTemplates getReferenceGenGenererParTemplates() {
		return referenceGenGenererParTemplates;
	}
	
	public void setReferenceGenGenererParTemplates(GenGenererParTemplates referenceGenGenererParTemplates) {
		this.referenceGenGenererParTemplates = referenceGenGenererParTemplates;
	}
	
	/** Récupération des éléments fils */

    private GenTemplateGroupesRefPourGenererParTemplate genTemplateGroupesRefPourGenererParTemplate = null;
    
    public GenTemplateGroupesRefPourGenererParTemplate getGenTemplateGroupesRefPourGenererParTemplate() {
    	return this.genTemplateGroupesRefPourGenererParTemplate;
    }
    
    public void setGenTemplateGroupesRefPourGenererParTemplate(GenTemplateGroupesRefPourGenererParTemplate genTemplateGroupesRefPourGenererParTemplate) {
    	genTemplateGroupesRefPourGenererParTemplate.setReferenceGenGenererParTemplate(this);
    	this.genTemplateGroupesRefPourGenererParTemplate = genTemplateGroupesRefPourGenererParTemplate;
    }
	
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
