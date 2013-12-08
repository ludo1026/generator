package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParStereotypes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeRefPourGenererParStereotypes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenGenererParStereotypeBean implements GenGenererParStereotype {
	
	/** Récupération de l'élément parent */
	
	private GenGenererParStereotypes referenceGenGenererParStereotypes;
	
	public GenGenererParStereotypes getReferenceGenGenererParStereotypes() {
		return referenceGenGenererParStereotypes;
	}
	
	public void setReferenceGenGenererParStereotypes(GenGenererParStereotypes referenceGenGenererParStereotypes) {
		this.referenceGenGenererParStereotypes = referenceGenGenererParStereotypes;
	}
	
	/** Récupération des éléments fils */

    private GenStereotypeRefPourGenererParStereotypes genStereotypeRefPourGenererParStereotypes = new GenStereotypeRefPourGenererParStereotypesBean();
    
    public GenStereotypeRefPourGenererParStereotypes getGenStereotypeRefPourGenererParStereotypes() {
    	return this.genStereotypeRefPourGenererParStereotypes;
    }
    
    public void setGenStereotypeRefPourGenererParStereotypes(GenStereotypeRefPourGenererParStereotypes genStereotypeRefPourGenererParStereotypes) {
    	genStereotypeRefPourGenererParStereotypes.setReferenceGenGenererParStereotype(this);
    	this.genStereotypeRefPourGenererParStereotypes = genStereotypeRefPourGenererParStereotypes;
    }
	
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

}
