package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenMethodes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenMethode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AbstractGenMethodesBean implements GenMethodes {
	
	/** Récupération de l'élément parent */
	
	private GenClasse referenceGenClasse = null;
	
	public GenClasse getReferenceGenClasse() {
		return referenceGenClasse;
	}
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse) {
		this.referenceGenClasse = referenceGenClasse;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenMethode> listeGenMethode = new ArrayList<GenMethode>();
	
    public GenMethode getGenMethodeByGenId(String genId) {
        for(GenMethode genMethode : listeGenMethode) {
            if(genMethode.getGenId().equalsIgnoreCase(genId)) {
                return genMethode;
            }
        }
        throw new IllegalStateException("La genMethode n'est pas définie : genId de genMethode = "+genId);
    }
    public GenMethode getGenMethodeByNomJava(String nomJava) {
        for(GenMethode genMethode : listeGenMethode) {
            if(genMethode.getNomJava().equalsIgnoreCase(nomJava)) {
                return genMethode;
            }
        }
        throw new IllegalStateException("La genMethode n'est pas définie : nomJava de genMethode = "+nomJava);
    }
    public GenMethode getGenMethodeByRetourType(String retourType) {
        for(GenMethode genMethode : listeGenMethode) {
            if(genMethode.getRetourType().equalsIgnoreCase(retourType)) {
                return genMethode;
            }
        }
        throw new IllegalStateException("La genMethode n'est pas définie : retourType de genMethode = "+retourType);
    }
    public GenMethode getGenMethodeByDescription(String description) {
        for(GenMethode genMethode : listeGenMethode) {
            if(genMethode.getDescription().equalsIgnoreCase(description)) {
                return genMethode;
            }
        }
        throw new IllegalStateException("La genMethode n'est pas définie : description de genMethode = "+description);
    }
    public void addGenMethode(GenMethode genMethode) {
    	genMethode.setReferenceGenMethodes(this);
        listeGenMethode.add(genMethode);
    }
    public List<GenMethode> getListeGenMethode() {
        return listeGenMethode;
    }
    public void setListeGenMethode(List<GenMethode> listeGenMethode) {
        this.listeGenMethode = listeGenMethode;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
