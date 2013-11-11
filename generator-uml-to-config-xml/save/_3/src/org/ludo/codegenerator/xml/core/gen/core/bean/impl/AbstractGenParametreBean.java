package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenParametre;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenParametres;

public class AbstractGenParametreBean implements GenParametre {
	
	/** Récupération de l'élément parent */
	
	private GenParametres referenceGenParametres = null;
	
	public GenParametres getReferenceGenParametres() {
		return referenceGenParametres;
	}
	
	public void setReferenceGenParametres(GenParametres referenceGenParametres) {
		this.referenceGenParametres = referenceGenParametres;
	}
	
	/** Récupération des éléments fils */
	
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

	public String getTypeAsString() {
		return this.type;
	}
	public void setTypeAsString(String typeAsString) {
		this.type = typeAsString;
	}
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
	private String genId = null;
	private String nomJava = null;
	private String type = null;

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

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
