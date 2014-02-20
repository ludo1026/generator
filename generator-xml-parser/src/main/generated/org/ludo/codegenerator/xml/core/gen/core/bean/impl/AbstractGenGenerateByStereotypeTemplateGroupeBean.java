package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenerateByStereotypeTemplateGroupe;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenerateByStereotype;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenGenerateByStereotypeTemplateGroupeBean implements GenGenerateByStereotypeTemplateGroupe {
	
	/** Récupération de l'élément parent */
	
	private GenGenerateByStereotype referenceGenGenerateByStereotype;
	
	public GenGenerateByStereotype getReferenceGenGenerateByStereotype() {
		return referenceGenGenerateByStereotype;
	}
	
	public void setReferenceGenGenerateByStereotype(GenGenerateByStereotype referenceGenGenerateByStereotype) {
		this.referenceGenGenerateByStereotype = referenceGenGenerateByStereotype;
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
