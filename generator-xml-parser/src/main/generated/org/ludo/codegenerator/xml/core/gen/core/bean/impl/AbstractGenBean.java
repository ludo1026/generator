package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplates;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasses;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenerate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenBean implements Gen {
	
	/** R�cup�ration de l'�l�ment parent */
	
	/** R�cup�ration des �l�ments fils */

    private GenTemplates genTemplates = new GenTemplatesBean();
    
    public GenTemplates getGenTemplates() {
    	return this.genTemplates;
    }
    
    public void setGenTemplates(GenTemplates genTemplates) {
    	genTemplates.setReferenceGen(this);
    	this.genTemplates = genTemplates;
    }
	

    private GenTemplateGroupes genTemplateGroupes = new GenTemplateGroupesBean();
    
    public GenTemplateGroupes getGenTemplateGroupes() {
    	return this.genTemplateGroupes;
    }
    
    public void setGenTemplateGroupes(GenTemplateGroupes genTemplateGroupes) {
    	genTemplateGroupes.setReferenceGen(this);
    	this.genTemplateGroupes = genTemplateGroupes;
    }
	

    private GenStereotypes genStereotypes = new GenStereotypesBean();
    
    public GenStereotypes getGenStereotypes() {
    	return this.genStereotypes;
    }
    
    public void setGenStereotypes(GenStereotypes genStereotypes) {
    	genStereotypes.setReferenceGen(this);
    	this.genStereotypes = genStereotypes;
    }
	

    private GenClasses genClasses = new GenClassesBean();
    
    public GenClasses getGenClasses() {
    	return this.genClasses;
    }
    
    public void setGenClasses(GenClasses genClasses) {
    	genClasses.setReferenceGen(this);
    	this.genClasses = genClasses;
    }
	

    private GenGenerate genGenerate = new GenGenerateBean();
    
    public GenGenerate getGenGenerate() {
    	return this.genGenerate;
    }
    
    public void setGenGenerate(GenGenerate genGenerate) {
    	genGenerate.setReferenceGen(this);
    	this.genGenerate = genGenerate;
    }
	
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	

}
