package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParClasses;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseRefPourGenererParClasses;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeRefPourGenererParClasses;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenGenererParClasseBean implements GenGenererParClasse {
	
	/** R�cup�ration de l'�l�ment parent */
	
	private GenGenererParClasses referenceGenGenererParClasses;
	
	public GenGenererParClasses getReferenceGenGenererParClasses() {
		return referenceGenGenererParClasses;
	}
	
	public void setReferenceGenGenererParClasses(GenGenererParClasses referenceGenGenererParClasses) {
		this.referenceGenGenererParClasses = referenceGenGenererParClasses;
	}
	
	/** R�cup�ration des �l�ments fils */

    private GenClasseRefPourGenererParClasses genClasseRefPourGenererParClasses = new GenClasseRefPourGenererParClassesBean();
    
    public GenClasseRefPourGenererParClasses getGenClasseRefPourGenererParClasses() {
    	return this.genClasseRefPourGenererParClasses;
    }
    
    public void setGenClasseRefPourGenererParClasses(GenClasseRefPourGenererParClasses genClasseRefPourGenererParClasses) {
    	genClasseRefPourGenererParClasses.setReferenceGenGenererParClasse(this);
    	this.genClasseRefPourGenererParClasses = genClasseRefPourGenererParClasses;
    }
	

    private GenTemplateGroupeRefPourGenererParClasses genTemplateGroupeRefPourGenererParClasses = new GenTemplateGroupeRefPourGenererParClassesBean();
    
    public GenTemplateGroupeRefPourGenererParClasses getGenTemplateGroupeRefPourGenererParClasses() {
    	return this.genTemplateGroupeRefPourGenererParClasses;
    }
    
    public void setGenTemplateGroupeRefPourGenererParClasses(GenTemplateGroupeRefPourGenererParClasses genTemplateGroupeRefPourGenererParClasses) {
    	genTemplateGroupeRefPourGenererParClasses.setReferenceGenGenererParClasse(this);
    	this.genTemplateGroupeRefPourGenererParClasses = genTemplateGroupeRefPourGenererParClasses;
    }
	
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	

}
