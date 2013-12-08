package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeRefPourGenererParClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeRefPourGenererParClasses;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenTemplateGroupeRefPourGenererParClasseBean implements GenTemplateGroupeRefPourGenererParClasse {
	
	/** R�cup�ration de l'�l�ment parent */
	
	private GenTemplateGroupeRefPourGenererParClasses referenceGenTemplateGroupeRefPourGenererParClasses;
	
	public GenTemplateGroupeRefPourGenererParClasses getReferenceGenTemplateGroupeRefPourGenererParClasses() {
		return referenceGenTemplateGroupeRefPourGenererParClasses;
	}
	
	public void setReferenceGenTemplateGroupeRefPourGenererParClasses(GenTemplateGroupeRefPourGenererParClasses referenceGenTemplateGroupeRefPourGenererParClasses) {
		this.referenceGenTemplateGroupeRefPourGenererParClasses = referenceGenTemplateGroupeRefPourGenererParClasses;
	}
	
	/** R�cup�ration des �l�ments fils */
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	

	public String getTemplateGroupeNomAsString() {
		return this.templateGroupeNom;
	}
	public void setTemplateGroupeNomAsString(String templateGroupeNomAsString) {
		this.templateGroupeNom = templateGroupeNomAsString;
	}
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	
	private String templateGroupeNom = null;

	public String getTemplateGroupeNom() {
		return this.templateGroupeNom;
	}
	public void setTemplateGroupeNom(String templateGroupeNom) {
		this.templateGroupeNom = templateGroupeNom;
	}

}
