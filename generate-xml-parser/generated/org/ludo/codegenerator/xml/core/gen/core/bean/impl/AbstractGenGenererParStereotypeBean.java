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
	
	/** R�cup�ration de l'�l�ment parent */
	
	private GenGenererParStereotypes referenceGenGenererParStereotypes;
	
	public GenGenererParStereotypes getReferenceGenGenererParStereotypes() {
		return referenceGenGenererParStereotypes;
	}
	
	public void setReferenceGenGenererParStereotypes(GenGenererParStereotypes referenceGenGenererParStereotypes) {
		this.referenceGenGenererParStereotypes = referenceGenGenererParStereotypes;
	}
	
	/** R�cup�ration des �l�ments fils */

    private GenStereotypeRefPourGenererParStereotypes genStereotypeRefPourGenererParStereotypes = new GenStereotypeRefPourGenererParStereotypesBean();
    
    public GenStereotypeRefPourGenererParStereotypes getGenStereotypeRefPourGenererParStereotypes() {
    	return this.genStereotypeRefPourGenererParStereotypes;
    }
    
    public void setGenStereotypeRefPourGenererParStereotypes(GenStereotypeRefPourGenererParStereotypes genStereotypeRefPourGenererParStereotypes) {
    	genStereotypeRefPourGenererParStereotypes.setReferenceGenGenererParStereotype(this);
    	this.genStereotypeRefPourGenererParStereotypes = genStereotypeRefPourGenererParStereotypes;
    }
	
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	

}
