package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeRefPourGenererParStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypesRefPourGenererParStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupesRefPourGenererParStereotype;

public class AbstractGenStereotypeRefPourGenererParStereotypeBean implements GenStereotypeRefPourGenererParStereotype {
	
	/** Récupération de l'élément parent */
	
	private GenStereotypesRefPourGenererParStereotype referenceGenStereotypesRefPourGenererParStereotype = null;
	
	public GenStereotypesRefPourGenererParStereotype getReferenceGenStereotypesRefPourGenererParStereotype() {
		return referenceGenStereotypesRefPourGenererParStereotype;
	}
	
	public void setReferenceGenStereotypesRefPourGenererParStereotype(GenStereotypesRefPourGenererParStereotype referenceGenStereotypesRefPourGenererParStereotype) {
		this.referenceGenStereotypesRefPourGenererParStereotype = referenceGenStereotypesRefPourGenererParStereotype;
	}
	
	/** Récupération des éléments fils */

    private GenTemplateGroupesRefPourGenererParStereotype genTemplateGroupesRefPourGenererParStereotype = null;
    
    public GenTemplateGroupesRefPourGenererParStereotype getGenTemplateGroupesRefPourGenererParStereotype() {
    	return this.genTemplateGroupesRefPourGenererParStereotype;
    }
    
    public void setGenTemplateGroupesRefPourGenererParStereotype(GenTemplateGroupesRefPourGenererParStereotype genTemplateGroupesRefPourGenererParStereotype) {
    	genTemplateGroupesRefPourGenererParStereotype.setReferenceGenStereotypeRefPourGenererParStereotype(this);
    	this.genTemplateGroupesRefPourGenererParStereotype = genTemplateGroupesRefPourGenererParStereotype;
    }
	
	
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
