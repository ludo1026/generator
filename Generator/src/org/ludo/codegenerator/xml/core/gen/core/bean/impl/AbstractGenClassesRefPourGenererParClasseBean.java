package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenClassesRefPourGenererParClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseRefPourGenererParClasse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AbstractGenClassesRefPourGenererParClasseBean implements GenClassesRefPourGenererParClasse {
	
	/** Récupération de l'élément parent */
	
	private GenGenererParClasse referenceGenGenererParClasse = null;
	
	public GenGenererParClasse getReferenceGenGenererParClasse() {
		return referenceGenGenererParClasse;
	}
	
	public void setReferenceGenGenererParClasse(GenGenererParClasse referenceGenGenererParClasse) {
		this.referenceGenGenererParClasse = referenceGenGenererParClasse;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenClasseRefPourGenererParClasse> listeGenClasseRefPourGenererParClasse = new ArrayList<GenClasseRefPourGenererParClasse>();
	
    public GenClasseRefPourGenererParClasse getGenClasseRefPourGenererParClasseByClasseGenId(String classeGenId) {
        for(GenClasseRefPourGenererParClasse genClasseRefPourGenererParClasse : listeGenClasseRefPourGenererParClasse) {
            if(genClasseRefPourGenererParClasse.getClasseGenId().equalsIgnoreCase(classeGenId)) {
                return genClasseRefPourGenererParClasse;
            }
        }
        throw new IllegalStateException("La genClasseRefPourGenererParClasse n'est pas définie : classeGenId de genClasseRefPourGenererParClasse = "+classeGenId);
    }
    public void addGenClasseRefPourGenererParClasse(GenClasseRefPourGenererParClasse genClasseRefPourGenererParClasse) {
    	genClasseRefPourGenererParClasse.setReferenceGenClassesRefPourGenererParClasse(this);
        listeGenClasseRefPourGenererParClasse.add(genClasseRefPourGenererParClasse);
    }
    public List<GenClasseRefPourGenererParClasse> getListeGenClasseRefPourGenererParClasse() {
        return listeGenClasseRefPourGenererParClasse;
    }
    public void setListeGenClasseRefPourGenererParClasse(List<GenClasseRefPourGenererParClasse> listeGenClasseRefPourGenererParClasse) {
        this.listeGenClasseRefPourGenererParClasse = listeGenClasseRefPourGenererParClasse;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
