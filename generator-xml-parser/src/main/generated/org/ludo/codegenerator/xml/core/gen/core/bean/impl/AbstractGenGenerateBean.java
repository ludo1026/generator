package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenerate;
import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParClasses;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParTemplates;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParStereotypes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenGenerateBean implements GenGenerate {
	
	/** R�cup�ration de l'�l�ment parent */
	
	private Gen referenceGen;
	
	public Gen getReferenceGen() {
		return referenceGen;
	}
	
	public void setReferenceGen(Gen referenceGen) {
		this.referenceGen = referenceGen;
	}
	
	/** R�cup�ration des �l�ments fils */

    private GenGenererParClasses genGenererParClasses = new GenGenererParClassesBean();
    
    public GenGenererParClasses getGenGenererParClasses() {
    	return this.genGenererParClasses;
    }
    
    public void setGenGenererParClasses(GenGenererParClasses genGenererParClasses) {
    	genGenererParClasses.setReferenceGenGenerate(this);
    	this.genGenererParClasses = genGenererParClasses;
    }
	

    private GenGenererParTemplates genGenererParTemplates = new GenGenererParTemplatesBean();
    
    public GenGenererParTemplates getGenGenererParTemplates() {
    	return this.genGenererParTemplates;
    }
    
    public void setGenGenererParTemplates(GenGenererParTemplates genGenererParTemplates) {
    	genGenererParTemplates.setReferenceGenGenerate(this);
    	this.genGenererParTemplates = genGenererParTemplates;
    }
	

    private GenGenererParStereotypes genGenererParStereotypes = new GenGenererParStereotypesBean();
    
    public GenGenererParStereotypes getGenGenererParStereotypes() {
    	return this.genGenererParStereotypes;
    }
    
    public void setGenGenererParStereotypes(GenGenererParStereotypes genGenererParStereotypes) {
    	genGenererParStereotypes.setReferenceGenGenerate(this);
    	this.genGenererParStereotypes = genGenererParStereotypes;
    }
	
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	

}
