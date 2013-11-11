package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseParents;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseParent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AbstractGenClasseParentsBean implements GenClasseParents {
	
	/** Récupération de l'élément parent */
	
	private GenClasse referenceGenClasse = null;
	
	public GenClasse getReferenceGenClasse() {
		return referenceGenClasse;
	}
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse) {
		this.referenceGenClasse = referenceGenClasse;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenClasseParent> listeGenClasseParent = new ArrayList<GenClasseParent>();
	
    public GenClasseParent getGenClasseParentByClasseGenId(String classeGenId) {
        for(GenClasseParent genClasseParent : listeGenClasseParent) {
            if(genClasseParent.getClasseGenId().equalsIgnoreCase(classeGenId)) {
                return genClasseParent;
            }
        }
        throw new IllegalStateException("La genClasseParent n'est pas définie : classeGenId de genClasseParent = "+classeGenId);
    }
    public void addGenClasseParent(GenClasseParent genClasseParent) {
    	genClasseParent.setReferenceGenClasseParents(this);
        listeGenClasseParent.add(genClasseParent);
    }
    public List<GenClasseParent> getListeGenClasseParent() {
        return listeGenClasseParent;
    }
    public void setListeGenClasseParent(List<GenClasseParent> listeGenClasseParent) {
        this.listeGenClasseParent = listeGenClasseParent;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
