package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypes;
import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotype;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AbstractGenStereotypesBean implements GenStereotypes {
	
	/** Récupération de l'élément parent */
	
	private Gen referenceGen = null;
	
	public Gen getReferenceGen() {
		return referenceGen;
	}
	
	public void setReferenceGen(Gen referenceGen) {
		this.referenceGen = referenceGen;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenStereotype> listeGenStereotype = new ArrayList<GenStereotype>();
	
    public GenStereotype getGenStereotypeByNom(String nom) {
        for(GenStereotype genStereotype : listeGenStereotype) {
            if(genStereotype.getNom().equalsIgnoreCase(nom)) {
                return genStereotype;
            }
        }
        throw new IllegalStateException("La genStereotype n'est pas définie : nom de genStereotype = "+nom);
    }
    public void addGenStereotype(GenStereotype genStereotype) {
    	genStereotype.setReferenceGenStereotypes(this);
        listeGenStereotype.add(genStereotype);
    }
    public List<GenStereotype> getListeGenStereotype() {
        return listeGenStereotype;
    }
    public void setListeGenStereotype(List<GenStereotype> listeGenStereotype) {
        this.listeGenStereotype = listeGenStereotype;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
