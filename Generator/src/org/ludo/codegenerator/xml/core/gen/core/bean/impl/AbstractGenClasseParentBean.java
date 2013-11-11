package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseParent;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseParents;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AbstractGenClasseParentBean implements GenClasseParent {
	
	/** Récupération de l'élément parent */
	
	private GenClasseParents referenceGenClasseParents = null;
	
	public GenClasseParents getReferenceGenClasseParents() {
		return referenceGenClasseParents;
	}
	
	public void setReferenceGenClasseParents(GenClasseParents referenceGenClasseParents) {
		this.referenceGenClasseParents = referenceGenClasseParents;
	}
	
	/** Récupération des éléments fils */
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	

	public String getClasseGenIdAsString() {
		return this.classeGenId;
	}
	public void setClasseGenIdAsString(String classeGenIdAsString) {
		this.classeGenId = classeGenIdAsString;
	}
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
	private String classeGenId = null;

	public String getClasseGenId() {
		return this.classeGenId;
	}
	public void setClasseGenId(String classeGenId) {
		this.classeGenId = classeGenId;
	}
}
