package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseRefPourGenererParClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseRefPourGenererParClasses;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenClasseRefPourGenererParClasseBean implements GenClasseRefPourGenererParClasse {
	
	/** Récupération de l'élément parent */
	
	private GenClasseRefPourGenererParClasses referenceGenClasseRefPourGenererParClasses;
	
	public GenClasseRefPourGenererParClasses getReferenceGenClasseRefPourGenererParClasses() {
		return referenceGenClasseRefPourGenererParClasses;
	}
	
	public void setReferenceGenClasseRefPourGenererParClasses(GenClasseRefPourGenererParClasses referenceGenClasseRefPourGenererParClasses) {
		this.referenceGenClasseRefPourGenererParClasses = referenceGenClasseRefPourGenererParClasses;
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
