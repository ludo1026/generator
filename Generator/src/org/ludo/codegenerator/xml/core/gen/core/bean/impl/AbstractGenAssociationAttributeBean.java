package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.IGenAssociationAttribute;
import org.ludo.codegenerator.xml.core.gen.core.bean.IGenAssociation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AbstractGenAssociationAttributeBean implements IGenAssociationAttribute {
	
	/** Récupération de l'élément parent */
	
	private IGenAssociation referenceGenAssociation = null;
	
	public IGenAssociation getReferenceGenAssociation() {
		return referenceGenAssociation;
	}
	
	public void setReferenceGenAssociation(IGenAssociation referenceGenAssociation) {
		this.referenceGenAssociation = referenceGenAssociation;
	}
	
	/** Récupération des éléments fils */
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	

	public String getGenIdAsString() {
		return this.genId;
	}
	public void setGenIdAsString(String genIdAsString) {
		this.genId = genIdAsString;
	}
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
	private String genId = null;

	public String getGenId() {
		return this.genId;
	}
	public void setGenId(String genId) {
		this.genId = genId;
	}
}
