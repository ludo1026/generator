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
