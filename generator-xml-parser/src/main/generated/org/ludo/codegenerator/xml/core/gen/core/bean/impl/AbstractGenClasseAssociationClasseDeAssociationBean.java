package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseAssociationClasseDeAssociation;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseAssociation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenClasseAssociationClasseDeAssociationBean implements GenClasseAssociationClasseDeAssociation {
	
	/** Récupération de l'élément parent */
	
	private GenClasseAssociation referenceGenClasseAssociation;
	
	public GenClasseAssociation getReferenceGenClasseAssociation() {
		return referenceGenClasseAssociation;
	}
	
	public void setReferenceGenClasseAssociation(GenClasseAssociation referenceGenClasseAssociation) {
		this.referenceGenClasseAssociation = referenceGenClasseAssociation;
	}
	
	/** Récupération des éléments fils */
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	

	public String get_typeAsString() {
		return this._type;
	}
	public void set_typeAsString(String _typeAsString) {
		this._type = _typeAsString;
	}
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
	private String _type = null;

	public String get_type() {
		return this._type;
	}
	public void set_type(String _type) {
		this._type = _type;
	}

}
