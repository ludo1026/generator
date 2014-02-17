package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenerateByStereotypeTemplateGroup;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenerateByStereotype;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenGenerateByStereotypeTemplateGroupBean implements GenGenerateByStereotypeTemplateGroup {
	
	/** Récupération de l'élément parent */
	
	private GenGenerateByStereotype referenceGenGenerateByStereotype;
	
	public GenGenerateByStereotype getReferenceGenGenerateByStereotype() {
		return referenceGenGenerateByStereotype;
	}
	
	public void setReferenceGenGenerateByStereotype(GenGenerateByStereotype referenceGenGenerateByStereotype) {
		this.referenceGenGenerateByStereotype = referenceGenGenerateByStereotype;
	}
	
	/** Récupération des éléments fils */
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	

	public String getTemplateGroupAsString() {
		return this.templateGroup;
	}
	public void setTemplateGroupAsString(String templateGroupAsString) {
		this.templateGroup = templateGroupAsString;
	}
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
	private String templateGroup = null;

	public String getTemplateGroup() {
		return this.templateGroup;
	}
	public void setTemplateGroup(String templateGroup) {
		this.templateGroup = templateGroup;
	}

}
