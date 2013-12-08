package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeRefPourGenererParTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeRefPourGenererParTemplates;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenStereotypeRefPourGenererParTemplateBean implements GenStereotypeRefPourGenererParTemplate {
	
	/** R�cup�ration de l'�l�ment parent */
	
	private GenStereotypeRefPourGenererParTemplates referenceGenStereotypeRefPourGenererParTemplates;
	
	public GenStereotypeRefPourGenererParTemplates getReferenceGenStereotypeRefPourGenererParTemplates() {
		return referenceGenStereotypeRefPourGenererParTemplates;
	}
	
	public void setReferenceGenStereotypeRefPourGenererParTemplates(GenStereotypeRefPourGenererParTemplates referenceGenStereotypeRefPourGenererParTemplates) {
		this.referenceGenStereotypeRefPourGenererParTemplates = referenceGenStereotypeRefPourGenererParTemplates;
	}
	
	/** R�cup�ration des �l�ments fils */
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	

	public String getStereotypeNomAsString() {
		return this.stereotypeNom;
	}
	public void setStereotypeNomAsString(String stereotypeNomAsString) {
		this.stereotypeNom = stereotypeNomAsString;
	}
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	
	private String stereotypeNom = null;

	public String getStereotypeNom() {
		return this.stereotypeNom;
	}
	public void setStereotypeNom(String stereotypeNom) {
		this.stereotypeNom = stereotypeNom;
	}

}
