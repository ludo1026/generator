package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenAssociationAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAssociationAttributs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenAssociationAttributBean implements GenAssociationAttribut {
	
	/** R�cup�ration de l'�l�ment parent */
	
	private GenAssociationAttributs referenceGenAssociationAttributs;
	
	public GenAssociationAttributs getReferenceGenAssociationAttributs() {
		return referenceGenAssociationAttributs;
	}
	
	public void setReferenceGenAssociationAttributs(GenAssociationAttributs referenceGenAssociationAttributs) {
		this.referenceGenAssociationAttributs = referenceGenAssociationAttributs;
	}
	
	/** R�cup�ration des �l�ments fils */
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	

	public String getGenIdAsString() {
		return this.genId;
	}
	public void setGenIdAsString(String genIdAsString) {
		this.genId = genIdAsString;
	}
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	
	private String genId = null;

	public String getGenId() {
		return this.genId;
	}
	public void setGenId(String genId) {
		this.genId = genId;
	}

}
