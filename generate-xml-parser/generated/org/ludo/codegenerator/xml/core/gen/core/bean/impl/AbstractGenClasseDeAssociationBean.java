package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseDeAssociation;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAssociation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenClasseDeAssociationBean implements GenClasseDeAssociation {
	
	/** Récupération de l'élément parent */
	
	private GenAssociation referenceGenAssociation;
	
	public GenAssociation getReferenceGenAssociation() {
		return referenceGenAssociation;
	}
	
	public void setReferenceGenAssociation(GenAssociation referenceGenAssociation) {
		this.referenceGenAssociation = referenceGenAssociation;
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
