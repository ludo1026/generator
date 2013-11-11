package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenParametres;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenMethode;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenParametre;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AbstractGenParametresBean implements GenParametres {
	
	/** Récupération de l'élément parent */
	
	private GenMethode referenceGenMethode = null;
	
	public GenMethode getReferenceGenMethode() {
		return referenceGenMethode;
	}
	
	public void setReferenceGenMethode(GenMethode referenceGenMethode) {
		this.referenceGenMethode = referenceGenMethode;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenParametre> listeGenParametre = new ArrayList<GenParametre>();
	
    public GenParametre getGenParametreByGenId(String genId) {
        for(GenParametre genParametre : listeGenParametre) {
            if(genParametre.getGenId().equalsIgnoreCase(genId)) {
                return genParametre;
            }
        }
        throw new IllegalStateException("La genParametre n'est pas définie : genId de genParametre = "+genId);
    }
    public GenParametre getGenParametreByNomJava(String nomJava) {
        for(GenParametre genParametre : listeGenParametre) {
            if(genParametre.getNomJava().equalsIgnoreCase(nomJava)) {
                return genParametre;
            }
        }
        throw new IllegalStateException("La genParametre n'est pas définie : nomJava de genParametre = "+nomJava);
    }
    public GenParametre getGenParametreByType(String type) {
        for(GenParametre genParametre : listeGenParametre) {
            if(genParametre.getType().equalsIgnoreCase(type)) {
                return genParametre;
            }
        }
        throw new IllegalStateException("La genParametre n'est pas définie : type de genParametre = "+type);
    }
    public GenParametre getGenParametreByDescription(String description) {
        for(GenParametre genParametre : listeGenParametre) {
            if(genParametre.getDescription().equalsIgnoreCase(description)) {
                return genParametre;
            }
        }
        throw new IllegalStateException("La genParametre n'est pas définie : description de genParametre = "+description);
    }
    public void addGenParametre(GenParametre genParametre) {
    	genParametre.setReferenceGenParametres(this);
        listeGenParametre.add(genParametre);
    }
    public List<GenParametre> getListeGenParametre() {
        return listeGenParametre;
    }
    public void setListeGenParametre(List<GenParametre> listeGenParametre) {
        this.listeGenParametre = listeGenParametre;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
