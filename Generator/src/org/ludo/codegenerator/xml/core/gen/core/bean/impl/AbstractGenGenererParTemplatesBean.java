package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParTemplates;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererGroupe;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParTemplate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
	
    private List<GenGenererParTemplate> listeGenGenererParTemplate = new ArrayList<GenGenererParTemplate>();
	
    public void addGenGenererParTemplate(GenGenererParTemplate genGenererParTemplate) {
    	genGenererParTemplate.setReferenceGenGenererParTemplates(this);
        listeGenGenererParTemplate.add(genGenererParTemplate);
    }
    public List<GenGenererParTemplate> getListeGenGenererParTemplate() {
        return listeGenGenererParTemplate;
    }
    public void setListeGenGenererParTemplate(List<GenGenererParTemplate> listeGenGenererParTemplate) {
        this.listeGenGenererParTemplate = listeGenGenererParTemplate;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
