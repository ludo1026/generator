package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypesClasseRef;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeClasse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AbstractGenStereotypesClasseRefBean implements GenStereotypesClasseRef {
	
	/** Récupération de l'élément parent */
	
	private GenClasse referenceGenClasse = null;
	
	public GenClasse getReferenceGenClasse() {
		return referenceGenClasse;
	}
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse) {
		this.referenceGenClasse = referenceGenClasse;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenStereotypeClasse> listeGenStereotypeClasse = new ArrayList<GenStereotypeClasse>();
	
    public GenStereotypeClasse getGenStereotypeClasseByNom(String Nom) {
        for(GenStereotypeClasse genStereotypeClasse : listeGenStereotypeClasse) {
            if(genStereotypeClasse.getNom().equalsIgnoreCase(Nom)) {
                return genStereotypeClasse;
            }
        }
        throw new IllegalStateException("La genStereotypeClasse n'est pas définie : Nom de genStereotypeClasse = "+Nom);
    }
    public void addGenStereotypeClasse(GenStereotypeClasse genStereotypeClasse) {
    	genStereotypeClasse.setReferenceGenStereotypesClasseRef(this);
        listeGenStereotypeClasse.add(genStereotypeClasse);
    }
    public List<GenStereotypeClasse> getListeGenStereotypeClasse() {
        return listeGenStereotypeClasse;
    }
    public void setListeGenStereotypeClasse(List<GenStereotypeClasse> listeGenStereotypeClasse) {
        this.listeGenStereotypeClasse = listeGenStereotypeClasse;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
