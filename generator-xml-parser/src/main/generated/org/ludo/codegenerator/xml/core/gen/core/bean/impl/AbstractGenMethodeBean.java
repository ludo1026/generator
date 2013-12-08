package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenMethode;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenMethodes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenProprieteMethodes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenParametres;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeMethodes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenMethodeBean implements GenMethode {
	
	/** Récupération de l'élément parent */
	
	private GenMethodes referenceGenMethodes;
	
	public GenMethodes getReferenceGenMethodes() {
		return referenceGenMethodes;
	}
	
	public void setReferenceGenMethodes(GenMethodes referenceGenMethodes) {
		this.referenceGenMethodes = referenceGenMethodes;
	}
	
	/** Récupération des éléments fils */

    private GenProprieteMethodes genProprieteMethodes = new GenProprieteMethodesBean();
    
    public GenProprieteMethodes getGenProprieteMethodes() {
    	return this.genProprieteMethodes;
    }
    
    public void setGenProprieteMethodes(GenProprieteMethodes genProprieteMethodes) {
    	genProprieteMethodes.setReferenceGenMethode(this);
    	this.genProprieteMethodes = genProprieteMethodes;
    }
	

    private GenParametres genParametres = new GenParametresBean();
    
    public GenParametres getGenParametres() {
    	return this.genParametres;
    }
    
    public void setGenParametres(GenParametres genParametres) {
    	genParametres.setReferenceGenMethode(this);
    	this.genParametres = genParametres;
    }
	

    private GenStereotypeMethodes genStereotypeMethodes = new GenStereotypeMethodesBean();
    
    public GenStereotypeMethodes getGenStereotypeMethodes() {
    	return this.genStereotypeMethodes;
    }
    
    public void setGenStereotypeMethodes(GenStereotypeMethodes genStereotypeMethodes) {
    	genStereotypeMethodes.setReferenceGenMethode(this);
    	this.genStereotypeMethodes = genStereotypeMethodes;
    }
	
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	

	public String getGenIdAsString() {
		return this.genId;
	}
	public void setGenIdAsString(String genIdAsString) {
		this.genId = genIdAsString;
	}

	public String getNomJavaAsString() {
		return this.nomJava;
	}
	public void setNomJavaAsString(String nomJavaAsString) {
		this.nomJava = nomJavaAsString;
	}

	public String getRetourTypeAsString() {
		return this.retourType;
	}
	public void setRetourTypeAsString(String retourTypeAsString) {
		this.retourType = retourTypeAsString;
	}

	public String getDescriptionAsString() {
		return this.description;
	}
	public void setDescriptionAsString(String descriptionAsString) {
		this.description = descriptionAsString;
	}
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
	private String genId = null;
	private String nomJava = null;
	private String retourType = null;
	private String description = null;

	public String getGenId() {
		return this.genId;
	}
	public void setGenId(String genId) {
		this.genId = genId;
	}

	public String getNomJava() {
		return this.nomJava;
	}
	public void setNomJava(String nomJava) {
		this.nomJava = nomJava;
	}

	public String getRetourType() {
		return this.retourType;
	}
	public void setRetourType(String retourType) {
		this.retourType = retourType;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
