package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParClasses;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClassesRefPourGenererParClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupesRefPourGenererParClasse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AbstractGenGenererParClasseBean implements GenGenererParClasse {
	
	/** Récupération de l'élément parent */
	
	private GenGenererParClasses referenceGenGenererParClasses = null;
	
	public GenGenererParClasses getReferenceGenGenererParClasses() {
		return referenceGenGenererParClasses;
	}
	
	public void setReferenceGenGenererParClasses(GenGenererParClasses referenceGenGenererParClasses) {
		this.referenceGenGenererParClasses = referenceGenGenererParClasses;
	}
	
	/** Récupération des éléments fils */

    private GenClassesRefPourGenererParClasse genClassesRefPourGenererParClasse = null;
    
    public GenClassesRefPourGenererParClasse getGenClassesRefPourGenererParClasse() {
    	return this.genClassesRefPourGenererParClasse;
    }
    
    public void setGenClassesRefPourGenererParClasse(GenClassesRefPourGenererParClasse genClassesRefPourGenererParClasse) {
    	genClassesRefPourGenererParClasse.setReferenceGenGenererParClasse(this);
    	this.genClassesRefPourGenererParClasse = genClassesRefPourGenererParClasse;
    }
	

    private GenTemplateGroupesRefPourGenererParClasse genTemplateGroupesRefPourGenererParClasse = null;
    
    public GenTemplateGroupesRefPourGenererParClasse getGenTemplateGroupesRefPourGenererParClasse() {
    	return this.genTemplateGroupesRefPourGenererParClasse;
    }
    
    public void setGenTemplateGroupesRefPourGenererParClasse(GenTemplateGroupesRefPourGenererParClasse genTemplateGroupesRefPourGenererParClasse) {
    	genTemplateGroupesRefPourGenererParClasse.setReferenceGenGenererParClasse(this);
    	this.genTemplateGroupesRefPourGenererParClasse = genTemplateGroupesRefPourGenererParClasse;
    }
	
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
