package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenAssociation;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAssociations;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseDeAssociation;

public class AbstractGenAssociationBean implements GenAssociation {
	
	/** Récupération de l'élément parent */
	
	private GenAssociations referenceGenAssociations = null;
	
	public GenAssociations getReferenceGenAssociations() {
		return referenceGenAssociations;
	}
	
	public void setReferenceGenAssociations(GenAssociations referenceGenAssociations) {
		this.referenceGenAssociations = referenceGenAssociations;
	}
	
	/** Récupération des éléments fils */

    private GenClasseDeAssociation genClasseDeAssociation = null;
    
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

	public String getNomJavaChampAsString() {
		return this.nomJavaChamp;
	}
	public void setNomJavaChampAsString(String nomJavaChampAsString) {
		this.nomJavaChamp = nomJavaChampAsString;
	}

	public String getClasseGenIdAsString() {
		return this.classeGenId;
	}
	public void setClasseGenIdAsString(String classeGenIdAsString) {
		this.classeGenId = classeGenIdAsString;
	}

	public String getNombreMinimumAsString() {
		return this.nombreMinimum;
	}
	public void setNombreMinimumAsString(String nombreMinimumAsString) {
		this.nombreMinimum = nombreMinimumAsString;
	}

	public String getNombreMaximumAsString() {
		return this.nombreMaximum;
	}
	public void setNombreMaximumAsString(String nombreMaximumAsString) {
		this.nombreMaximum = nombreMaximumAsString;
	}
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
	private String genId = null;
	private String nomJavaChamp = null;
	private String classeGenId = null;
	private String nombreMinimum = null;
	private String nombreMaximum = null;

	public String getGenId() {
		return this.genId;
	}
	public void setGenId(String genId) {
		this.genId = genId;
	}

	public String getNomJavaChamp() {
		return this.nomJavaChamp;
	}
	public void setNomJavaChamp(String nomJavaChamp) {
		this.nomJavaChamp = nomJavaChamp;
	}

	public String getClasseGenId() {
		return this.classeGenId;
	}
	public void setClasseGenId(String classeGenId) {
		this.classeGenId = classeGenId;
	}

	public String getNombreMinimum() {
		return this.nombreMinimum;
	}
	public void setNombreMinimum(String nombreMinimum) {
		this.nombreMinimum = nombreMinimum;
	}

	public String getNombreMaximum() {
		return this.nombreMaximum;
	}
	public void setNombreMaximum(String nombreMaximum) {
		this.nombreMaximum = nombreMaximum;
	}
}
