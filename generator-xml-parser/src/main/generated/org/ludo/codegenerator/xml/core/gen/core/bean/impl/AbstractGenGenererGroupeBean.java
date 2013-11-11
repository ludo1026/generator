package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererGroupe;
import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParClasses;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParTemplates;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParStereotypes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenGenererGroupeBean implements GenGenererGroupe {
	
	/** Récupération de l'élément parent */
	
	private Gen referenceGen;
	
	public Gen getReferenceGen() {
		return referenceGen;
	}
	
	public void setReferenceGen(Gen referenceGen) {
		this.referenceGen = referenceGen;
	}
	
	/** Récupération des éléments fils */

    private GenGenererParClasses genGenererParClasses = new GenGenererParClassesBean();
    
    public GenGenererParClasses getGenGenererParClasses() {
    	return this.genGenererParClasses;
    }
    
    public void setGenGenererParClasses(GenGenererParClasses genGenererParClasses) {
    	genGenererParClasses.setReferenceGenGenererGroupe(this);
    	this.genGenererParClasses = genGenererParClasses;
    }
	

    private GenGenererParTemplates genGenererParTemplates = new GenGenererParTemplatesBean();
    
    public GenGenererParTemplates getGenGenererParTemplates() {
    	return this.genGenererParTemplates;
    }
    
    public void setGenGenererParTemplates(GenGenererParTemplates genGenererParTemplates) {
    	genGenererParTemplates.setReferenceGenGenererGroupe(this);
    	this.genGenererParTemplates = genGenererParTemplates;
    }
	

    private GenGenererParStereotypes genGenererParStereotypes = new GenGenererParStereotypesBean();
    
    public GenGenererParStereotypes getGenGenererParStereotypes() {
    	return this.genGenererParStereotypes;
    }
    
    public void setGenGenererParStereotypes(GenGenererParStereotypes genGenererParStereotypes) {
    	genGenererParStereotypes.setReferenceGenGenererGroupe(this);
    	this.genGenererParStereotypes = genGenererParStereotypes;
    }
	
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

}
