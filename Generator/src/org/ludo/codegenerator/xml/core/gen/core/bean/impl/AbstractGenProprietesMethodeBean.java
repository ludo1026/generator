package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenProprietesMethode;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenMethode;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenProprieteMethode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AbstractGenProprietesMethodeBean implements GenProprietesMethode {
	
	/** Récupération de l'élément parent */
	
	private GenMethode referenceGenMethode = null;
	
	public GenMethode getReferenceGenMethode() {
		return referenceGenMethode;
	}
	
	public void setReferenceGenMethode(GenMethode referenceGenMethode) {
		this.referenceGenMethode = referenceGenMethode;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenProprieteMethode> listeGenProprieteMethode = new ArrayList<GenProprieteMethode>();
	
    public GenProprieteMethode getGenProprieteMethodeByNom(String nom) {
        for(GenProprieteMethode genProprieteMethode : listeGenProprieteMethode) {
            if(genProprieteMethode.getNom().equalsIgnoreCase(nom)) {
                return genProprieteMethode;
            }
        }
        throw new IllegalStateException("La genProprieteMethode n'est pas définie : nom de genProprieteMethode = "+nom);
    }
    public GenProprieteMethode getGenProprieteMethodeByValeur(String valeur) {
        for(GenProprieteMethode genProprieteMethode : listeGenProprieteMethode) {
            if(genProprieteMethode.getValeur().equalsIgnoreCase(valeur)) {
                return genProprieteMethode;
            }
        }
        throw new IllegalStateException("La genProprieteMethode n'est pas définie : valeur de genProprieteMethode = "+valeur);
    }
    public void addGenProprieteMethode(GenProprieteMethode genProprieteMethode) {
    	genProprieteMethode.setReferenceGenProprietesMethode(this);
        listeGenProprieteMethode.add(genProprieteMethode);
    }
    public List<GenProprieteMethode> getListeGenProprieteMethode() {
        return listeGenProprieteMethode;
    }
    public void setListeGenProprieteMethode(List<GenProprieteMethode> listeGenProprieteMethode) {
        this.listeGenProprieteMethode = listeGenProprieteMethode;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
