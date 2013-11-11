package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeRefPourGenererParStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeRefPourGenererParStereotypes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeRefPourGenererParStereotypes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenStereotypeRefPourGenererParStereotypeBean implements GenStereotypeRefPourGenererParStereotype {
	
	/** Récupération de l'élément parent */
	
	private GenStereotypeRefPourGenererParStereotypes referenceGenStereotypeRefPourGenererParStereotypes;
	
	public GenStereotypeRefPourGenererParStereotypes getReferenceGenStereotypeRefPourGenererParStereotypes() {
		return referenceGenStereotypeRefPourGenererParStereotypes;
	}
	
	public void setReferenceGenStereotypeRefPourGenererParStereotypes(GenStereotypeRefPourGenererParStereotypes referenceGenStereotypeRefPourGenererParStereotypes) {
		this.referenceGenStereotypeRefPourGenererParStereotypes = referenceGenStereotypeRefPourGenererParStereotypes;
	}
	
	/** Récupération des éléments fils */

    private GenTemplateGroupeRefPourGenererParStereotypes genTemplateGroupeRefPourGenererParStereotypes = new GenTemplateGroupeRefPourGenererParStereotypesBean();
    
    public GenTemplateGroupeRefPourGenererParStereotypes getGenTemplateGroupeRefPourGenererParStereotypes() {
    	return this.genTemplateGroupeRefPourGenererParStereotypes;
    }
    
    public void setGenTemplateGroupeRefPourGenererParStereotypes(GenTemplateGroupeRefPourGenererParStereotypes genTemplateGroupeRefPourGenererParStereotypes) {
    	genTemplateGroupeRefPourGenererParStereotypes.setReferenceGenStereotypeRefPourGenererParStereotype(this);
    	this.genTemplateGroupeRefPourGenererParStereotypes = genTemplateGroupeRefPourGenererParStereotypes;
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
