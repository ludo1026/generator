package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenAssociation;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAssociations;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAssociationAttributs;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseDeAssociation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenAssociationBean implements GenAssociation {
	
	/** Récupération de l'élément parent */
	
	private GenAssociations referenceGenAssociations;
	
	public GenAssociations getReferenceGenAssociations() {
		return referenceGenAssociations;
	}
	
	public void setReferenceGenAssociations(GenAssociations referenceGenAssociations) {
		this.referenceGenAssociations = referenceGenAssociations;
	}
	
	/** Récupération des éléments fils */

    private GenAssociationAttributs genAssociationAttributs = new GenAssociationAttributsBean();
    
    public GenAssociationAttributs getGenAssociationAttributs() {
    	return this.genAssociationAttributs;
    }
    
    public void setGenAssociationAttributs(GenAssociationAttributs genAssociationAttributs) {
    	genAssociationAttributs.setReferenceGenAssociation(this);
    	this.genAssociationAttributs = genAssociationAttributs;
    }
	

    private GenClasseDeAssociation genClasseDeAssociation = new GenClasseDeAssociationBean();
    
    public GenClasseDeAssociation getGenClasseDeAssociation() {
    	return this.genClasseDeAssociation;
    }
    
    public void setGenClasseDeAssociation(GenClasseDeAssociation genClasseDeAssociation) {
    	genClasseDeAssociation.setReferenceGenAssociation(this);
    	this.genClasseDeAssociation = genClasseDeAssociation;
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

	public String getClasseGenIdAsString() {
		return this.classeGenId;
	}
	public void setClasseGenIdAsString(String classeGenIdAsString) {
		this.classeGenId = classeGenIdAsString;
	}

	public String getNbMinAsString() {
		return this.nbMin;
	}
	public void setNbMinAsString(String nbMinAsString) {
		this.nbMin = nbMinAsString;
	}

	public String getNbMaxAsString() {
		return this.nbMax;
	}
	public void setNbMaxAsString(String nbMaxAsString) {
		this.nbMax = nbMaxAsString;
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
	private String classeGenId = null;
	private String nbMin = null;
	private String nbMax = null;
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

	public String getClasseGenId() {
		return this.classeGenId;
	}
	public void setClasseGenId(String classeGenId) {
		this.classeGenId = classeGenId;
	}

	public String getNbMin() {
		return this.nbMin;
	}
	public void setNbMin(String nbMin) {
		this.nbMin = nbMin;
	}

	public String getNbMax() {
		return this.nbMax;
	}
	public void setNbMax(String nbMax) {
		this.nbMax = nbMax;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
