package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseMethodeParametre;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseMethode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenClasseMethodeParametreBean implements GenClasseMethodeParametre {
	
	/** Récupération de l'élément parent */
	
	private GenClasseMethode referenceGenClasseMethode;
	
	public GenClasseMethode getReferenceGenClasseMethode() {
		return referenceGenClasseMethode;
	}
	
	public void setReferenceGenClasseMethode(GenClasseMethode referenceGenClasseMethode) {
		this.referenceGenClasseMethode = referenceGenClasseMethode;
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

	public String getDescriptionAsString() {
		return this.description;
	}
	public void setDescriptionAsString(String descriptionAsString) {
		this.description = descriptionAsString;
	}
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
	private String genId = null;
	private String nomJava = null;
	private String type = null;
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

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
