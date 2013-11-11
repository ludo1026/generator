package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import java.util.ArrayList;
import java.util.List;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererGroupe;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParStereotypes;

public class AbstractGenGenererParStereotypesBean implements GenGenererParStereotypes {
	
	/** Récupération de l'élément parent */
	
	private GenGenererGroupe referenceGenGenererGroupe = null;
	
	public GenGenererGroupe getReferenceGenGenererGroupe() {
		return referenceGenGenererGroupe;
	}
	
	public void setReferenceGenGenererGroupe(GenGenererGroupe referenceGenGenererGroupe) {
		this.referenceGenGenererGroupe = referenceGenGenererGroupe;
	}
	
	/** Récupération des éléments fils */
	
    private List listeGenGenererParStereotype = new ArrayList();
	
    public void addGenGenererParStereotype(GenGenererParStereotype genGenererParStereotype) {
    	genGenererParStereotype.setReferenceGenGenererParStereotypes(this);
        listeGenGenererParStereotype.add(genGenererParStereotype);
    }
    public List getListeGenGenererParStereotype() {
        return listeGenGenererParStereotype;
    }
    public void setListeGenGenererParStereotype(List listeGenGenererParStereotype) {
        this.listeGenGenererParStereotype = listeGenGenererParStereotype;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
