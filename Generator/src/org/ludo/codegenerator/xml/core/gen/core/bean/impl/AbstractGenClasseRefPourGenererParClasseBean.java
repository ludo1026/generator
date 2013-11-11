package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseRefPourGenererParClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClassesRefPourGenererParClasse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AbstractGenClasseRefPourGenererParClasseBean implements GenClasseRefPourGenererParClasse {
	
	/** Récupération de l'élément parent */
	
	private GenClassesRefPourGenererParClasse referenceGenClassesRefPourGenererParClasse = null;
	
	public GenClassesRefPourGenererParClasse getReferenceGenClassesRefPourGenererParClasse() {
		return referenceGenClassesRefPourGenererParClasse;
	}
	
	public void setReferenceGenClassesRefPourGenererParClasse(GenClassesRefPourGenererParClasse referenceGenClassesRefPourGenererParClasse) {
		this.referenceGenClassesRefPourGenererParClasse = referenceGenClassesRefPourGenererParClasse;
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
