package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseParent;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseParents;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenClasseParentBean implements GenClasseParent {
	
	/** R�cup�ration de l'�l�ment parent */
	
	private GenClasseParents referenceGenClasseParents;
	
	public GenClasseParents getReferenceGenClasseParents() {
		return referenceGenClasseParents;
	}
	
	public void setReferenceGenClasseParents(GenClasseParents referenceGenClasseParents) {
		this.referenceGenClasseParents = referenceGenClasseParents;
	}
	
	/** R�cup�ration des �l�ments fils */
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	

	public String getClasseGenIdAsString() {
		return this.classeGenId;
	}
	public void setClasseGenIdAsString(String classeGenIdAsString) {
		this.classeGenId = classeGenIdAsString;
	}
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	
	private String classeGenId = null;

	public String getClasseGenId() {
		return this.classeGenId;
	}
	public void setClasseGenId(String classeGenId) {
		this.classeGenId = classeGenId;
	}

}
