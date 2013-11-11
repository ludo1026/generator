package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import java.util.ArrayList;
import java.util.List;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererGroupe;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParTemplates;

public class AbstractGenGenererParTemplatesBean implements GenGenererParTemplates {
	
	/** Récupération de l'élément parent */
	
	private GenGenererGroupe referenceGenGenererGroupe = null;
	
	public GenGenererGroupe getReferenceGenGenererGroupe() {
		return referenceGenGenererGroupe;
	}
	
	public void setReferenceGenGenererGroupe(GenGenererGroupe referenceGenGenererGroupe) {
		this.referenceGenGenererGroupe = referenceGenGenererGroupe;
	}
	
	/** Récupération des éléments fils */
	
    private List listeGenGenererParTemplate = new ArrayList();
	
    public void addGenGenererParTemplate(GenGenererParTemplate genGenererParTemplate) {
    	genGenererParTemplate.setReferenceGenGenererParTemplates(this);
        listeGenGenererParTemplate.add(genGenererParTemplate);
    }
    public List getListeGenGenererParTemplate() {
        return listeGenGenererParTemplate;
    }
    public void setListeGenGenererParTemplate(List listeGenGenererParTemplate) {
        this.listeGenGenererParTemplate = listeGenGenererParTemplate;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
