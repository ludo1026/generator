package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenMethode;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenMethodes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenParametres;

public class AbstractGenMethodeBean implements GenMethode {
	
	/** Récupération de l'élément parent */
	
	private GenMethodes referenceGenMethodes = null;
	
	public GenMethodes getReferenceGenMethodes() {
		return referenceGenMethodes;
	}
	
	public void setReferenceGenMethodes(GenMethodes referenceGenMethodes) {
		this.referenceGenMethodes = referenceGenMethodes;
	}
	
	/** Récupération des éléments fils */

    private GenParametres genParametres = null;
    
    public GenParametres getGenParametres() {
    	return this.genParametres;
    }
    
    public void setGenParametres(GenParametres genParametres) {
    	genParametres.setReferenceGenMethode(this);
    	this.genParametres = genParametres;
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
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
	private String genId = null;
	private String nomJava = null;
	private String retourType = null;

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
}
