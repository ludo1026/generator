package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypesMethodeRef;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenMethode;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeMethode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AbstractGenStereotypesMethodeRefBean implements GenStereotypesMethodeRef {
	
	/** Récupération de l'élément parent */
	
	private GenMethode referenceGenMethode = null;
	
	public GenMethode getReferenceGenMethode() {
		return referenceGenMethode;
	}
	
	public void setReferenceGenMethode(GenMethode referenceGenMethode) {
		this.referenceGenMethode = referenceGenMethode;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenStereotypeMethode> listeGenStereotypeMethode = new ArrayList<GenStereotypeMethode>();
	
    public GenStereotypeMethode getGenStereotypeMethodeByNom(String Nom) {
        for(GenStereotypeMethode genStereotypeMethode : listeGenStereotypeMethode) {
            if(genStereotypeMethode.getNom().equalsIgnoreCase(Nom)) {
                return genStereotypeMethode;
            }
        }
        throw new IllegalStateException("La genStereotypeMethode n'est pas définie : Nom de genStereotypeMethode = "+Nom);
    }
    public void addGenStereotypeMethode(GenStereotypeMethode genStereotypeMethode) {
    	genStereotypeMethode.setReferenceGenStereotypesMethodeRef(this);
        listeGenStereotypeMethode.add(genStereotypeMethode);
    }
    public List<GenStereotypeMethode> getListeGenStereotypeMethode() {
        return listeGenStereotypeMethode;
    }
    public void setListeGenStereotypeMethode(List<GenStereotypeMethode> listeGenStereotypeMethode) {
        this.listeGenStereotypeMethode = listeGenStereotypeMethode;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
