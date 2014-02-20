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
	
	private String _type = null;

	public String get_type() {
		return this._type;
	}
	public void set_type(String _type) {
		this._type = _type;
	}

}
