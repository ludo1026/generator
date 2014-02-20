package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenTemplateGroupeTemplateBean implements GenTemplateGroupeTemplate {
	
	/** Récupération de l'élément parent */
	
	private GenTemplateGroupe referenceGenTemplateGroupe;
	
	public GenTemplateGroupe getReferenceGenTemplateGroupe() {
		return referenceGenTemplateGroupe;
	}
	
	public void setReferenceGenTemplateGroupe(GenTemplateGroupe referenceGenTemplateGroupe) {
		this.referenceGenTemplateGroupe = referenceGenTemplateGroupe;
	}
	
	/** Récupération des éléments fils */
	
	private String nom = null;

	public String getNom() {
		return this.nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

}
