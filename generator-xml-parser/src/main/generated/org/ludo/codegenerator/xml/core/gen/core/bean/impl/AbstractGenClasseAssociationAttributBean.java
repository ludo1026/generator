package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseAssociationAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseAssociation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenClasseAssociationAttributBean implements GenClasseAssociationAttribut {
	
	/** Récupération de l'élément parent */
	
	private GenClasseAssociation referenceGenClasseAssociation;
	
	public GenClasseAssociation getReferenceGenClasseAssociation() {
		return referenceGenClasseAssociation;
	}
	
	public void setReferenceGenClasseAssociation(GenClasseAssociation referenceGenClasseAssociation) {
		this.referenceGenClasseAssociation = referenceGenClasseAssociation;
	}
	
	/** Récupération des éléments fils */
	
	private String genId = null;

	public String getGenId() {
		return this.genId;
	}
	public void setGenId(String genId) {
		this.genId = genId;
	}

}
