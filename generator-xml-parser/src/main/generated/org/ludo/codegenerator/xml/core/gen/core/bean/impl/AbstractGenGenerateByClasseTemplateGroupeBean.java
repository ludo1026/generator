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
	
	private String templateGroupe = null;

	public String getTemplateGroupe() {
		return this.templateGroupe;
	}
	public void setTemplateGroupe(String templateGroupe) {
		this.templateGroupe = templateGroupe;
	}

}
