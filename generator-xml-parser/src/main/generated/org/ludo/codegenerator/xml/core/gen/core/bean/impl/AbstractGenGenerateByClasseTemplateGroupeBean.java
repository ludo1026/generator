package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenerateByClasseTemplateGroupe;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenerateByClasse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenGenerateByClasseTemplateGroupeBean implements GenGenerateByClasseTemplateGroupe {
	
	/** Récupération de l'élément parent */
	
	private GenGenerateByClasse referenceGenGenerateByClasse;
	
	public GenGenerateByClasse getReferenceGenGenerateByClasse() {
		return referenceGenGenerateByClasse;
	}
	
	public void setReferenceGenGenerateByClasse(GenGenerateByClasse referenceGenGenerateByClasse) {
		this.referenceGenGenerateByClasse = referenceGenGenerateByClasse;
	}
	
	/** Récupération des éléments fils */
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	

	public String getTemplateGroupeAsString() {
		return this.templateGroupe;
	}
	public void setTemplateGroupeAsString(String templateGroupeAsString) {
		this.templateGroupe = templateGroupeAsString;
	}
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
	private String templateGroupe = null;

	public String getTemplateGroupe() {
		return this.templateGroupe;
	}
	public void setTemplateGroupe(String templateGroupe) {
		this.templateGroupe = templateGroupe;
	}

}
