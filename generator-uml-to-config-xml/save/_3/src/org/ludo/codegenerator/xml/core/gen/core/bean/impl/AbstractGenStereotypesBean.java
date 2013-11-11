package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypes;

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
	
    private List listeGenStereotype = new ArrayList();
	
    public GenStereotype getGenStereotypeByNom(String nom) {
        for(Iterator iter = listeGenStereotype.iterator(); iter.hasNext(); ) {
            GenStereotypeBean genStereotype = (GenStereotypeBean) iter.next();
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
    public List getListeGenStereotype() {
        return listeGenStereotype;
    }
    public void setListeGenStereotype(List listeGenStereotype) {
        this.listeGenStereotype = listeGenStereotype;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
