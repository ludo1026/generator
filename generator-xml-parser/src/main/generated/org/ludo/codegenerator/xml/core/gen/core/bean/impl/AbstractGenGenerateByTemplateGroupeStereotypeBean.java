package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenerateByTemplateGroupeStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenerateByTemplateGroupe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenGenerateByTemplateGroupeStereotypeBean implements GenGenerateByTemplateGroupeStereotype {
	
	/** Récupération de l'élément parent */
	
	private GenGenerateByTemplateGroupe referenceGenGenerateByTemplateGroupe;
	
	public GenGenerateByTemplateGroupe getReferenceGenGenerateByTemplateGroupe() {
		return referenceGenGenerateByTemplateGroupe;
	}
	
	public void setReferenceGenGenerateByTemplateGroupe(GenGenerateByTemplateGroupe referenceGenGenerateByTemplateGroupe) {
		this.referenceGenGenerateByTemplateGroupe = referenceGenGenerateByTemplateGroupe;
	}
	
	/** Récupération des éléments fils */
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	

	public String getStereotypeAsString() {
		return this.stereotype;
	}
	public void setStereotypeAsString(String stereotypeAsString) {
		this.stereotype = stereotypeAsString;
	}
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
	private String stereotype = null;

	public String getStereotype() {
		return this.stereotype;
	}
	public void setStereotype(String stereotype) {
		this.stereotype = stereotype;
	}

}
