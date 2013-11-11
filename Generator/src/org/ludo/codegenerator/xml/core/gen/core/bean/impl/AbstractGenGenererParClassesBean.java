package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParClasses;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererGroupe;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParClasse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AbstractGenGenererParClassesBean implements GenGenererParClasses {
	
	/** Récupération de l'élément parent */
	
	private GenGenererGroupe referenceGenGenererGroupe = null;
	
	public GenGenererGroupe getReferenceGenGenererGroupe() {
		return referenceGenGenererGroupe;
	}
	
	public void setReferenceGenGenererGroupe(GenGenererGroupe referenceGenGenererGroupe) {
		this.referenceGenGenererGroupe = referenceGenGenererGroupe;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenGenererParClasse> listeGenGenererParClasse = new ArrayList<GenGenererParClasse>();
	
    public void addGenGenererParClasse(GenGenererParClasse genGenererParClasse) {
    	genGenererParClasse.setReferenceGenGenererParClasses(this);
        listeGenGenererParClasse.add(genGenererParClasse);
    }
    public List<GenGenererParClasse> getListeGenGenererParClasse() {
        return listeGenGenererParClasse;
    }
    public void setListeGenGenererParClasse(List<GenGenererParClasse> listeGenGenererParClasse) {
        this.listeGenGenererParClasse = listeGenGenererParClasse;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
