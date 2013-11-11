package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasses;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererGroupe;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplates;

public class AbstractGenBean implements Gen {
	
	/** Récupération de l'élément parent */
	
	/** Récupération des éléments fils */

    private GenTemplates genTemplates = null;
    
    public GenTemplates getGenTemplates() {
    	return this.genTemplates;
    }
    
    public void setGenTemplates(GenTemplates genTemplates) {
    	genTemplates.setReferenceGen(this);
    	this.genTemplates = genTemplates;
    }
	

    private GenTemplateGroupes genTemplateGroupes = null;
    
    public GenTemplateGroupes getGenTemplateGroupes() {
    	return this.genTemplateGroupes;
    }
    
    public void setGenTemplateGroupes(GenTemplateGroupes genTemplateGroupes) {
    	genTemplateGroupes.setReferenceGen(this);
    	this.genTemplateGroupes = genTemplateGroupes;
    }
	

    private GenStereotypes genStereotypes = null;
    
    public GenStereotypes getGenStereotypes() {
    	return this.genStereotypes;
    }
    
    public void setGenStereotypes(GenStereotypes genStereotypes) {
    	genStereotypes.setReferenceGen(this);
    	this.genStereotypes = genStereotypes;
    }
	

    private GenClasses genClasses = null;
    
    public GenClasses getGenClasses() {
    	return this.genClasses;
    }
    
    public void setGenClasses(GenClasses genClasses) {
    	genClasses.setReferenceGen(this);
    	this.genClasses = genClasses;
    }
	

    private GenGenererGroupe genGenererGroupe = null;
    
    public GenGenererGroupe getGenGenererGroupe() {
    	return this.genGenererGroupe;
    }
    
    public void setGenGenererGroupe(GenGenererGroupe genGenererGroupe) {
    	genGenererGroupe.setReferenceGen(this);
    	this.genGenererGroupe = genGenererGroupe;
    }
	
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
