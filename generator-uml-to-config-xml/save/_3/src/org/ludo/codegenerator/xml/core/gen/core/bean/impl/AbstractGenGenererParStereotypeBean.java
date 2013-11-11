package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParStereotypes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypesRefPourGenererParStereotype;

public class AbstractGenGenererParStereotypeBean implements GenGenererParStereotype {
	
	/** Récupération de l'élément parent */
	
	private GenGenererParStereotypes referenceGenGenererParStereotypes = null;
	
	public GenGenererParStereotypes getReferenceGenGenererParStereotypes() {
		return referenceGenGenererParStereotypes;
	}
	
	public void setReferenceGenGenererParStereotypes(GenGenererParStereotypes referenceGenGenererParStereotypes) {
		this.referenceGenGenererParStereotypes = referenceGenGenererParStereotypes;
	}
	
	/** Récupération des éléments fils */

    private GenStereotypesRefPourGenererParStereotype genStereotypesRefPourGenererParStereotype = null;
    
    public GenStereotypesRefPourGenererParStereotype getGenStereotypesRefPourGenererParStereotype() {
    	return this.genStereotypesRefPourGenererParStereotype;
    }
    
    public void setGenStereotypesRefPourGenererParStereotype(GenStereotypesRefPourGenererParStereotype genStereotypesRefPourGenererParStereotype) {
    	genStereotypesRefPourGenererParStereotype.setReferenceGenGenererParStereotype(this);
    	this.genStereotypesRefPourGenererParStereotype = genStereotypesRefPourGenererParStereotype;
    }
	
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
