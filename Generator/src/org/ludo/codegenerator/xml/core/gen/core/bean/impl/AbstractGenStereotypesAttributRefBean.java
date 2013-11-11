package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypesAttributRef;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeAttribut;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AbstractGenStereotypesAttributRefBean implements GenStereotypesAttributRef {
	
	/** Récupération de l'élément parent */
	
	private GenAttribut referenceGenAttribut = null;
	
	public GenAttribut getReferenceGenAttribut() {
		return referenceGenAttribut;
	}
	
	public void setReferenceGenAttribut(GenAttribut referenceGenAttribut) {
		this.referenceGenAttribut = referenceGenAttribut;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenStereotypeAttribut> listeGenStereotypeAttribut = new ArrayList<GenStereotypeAttribut>();
	
    public GenStereotypeAttribut getGenStereotypeAttributByNom(String Nom) {
        for(GenStereotypeAttribut genStereotypeAttribut : listeGenStereotypeAttribut) {
            if(genStereotypeAttribut.getNom().equalsIgnoreCase(Nom)) {
                return genStereotypeAttribut;
            }
        }
        throw new IllegalStateException("La genStereotypeAttribut n'est pas définie : Nom de genStereotypeAttribut = "+Nom);
    }
    public void addGenStereotypeAttribut(GenStereotypeAttribut genStereotypeAttribut) {
    	genStereotypeAttribut.setReferenceGenStereotypesAttributRef(this);
        listeGenStereotypeAttribut.add(genStereotypeAttribut);
    }
    public List<GenStereotypeAttribut> getListeGenStereotypeAttribut() {
        return listeGenStereotypeAttribut;
    }
    public void setListeGenStereotypeAttribut(List<GenStereotypeAttribut> listeGenStereotypeAttribut) {
        this.listeGenStereotypeAttribut = listeGenStereotypeAttribut;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
