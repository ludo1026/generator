package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenProprietesAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenProprieteAttribut;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AbstractGenProprietesAttributBean implements GenProprietesAttribut {
	
	/** Récupération de l'élément parent */
	
	private GenAttribut referenceGenAttribut = null;
	
	public GenAttribut getReferenceGenAttribut() {
		return referenceGenAttribut;
	}
	
	public void setReferenceGenAttribut(GenAttribut referenceGenAttribut) {
		this.referenceGenAttribut = referenceGenAttribut;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenProprieteAttribut> listeGenProprieteAttribut = new ArrayList<GenProprieteAttribut>();
	
    public GenProprieteAttribut getGenProprieteAttributByNom(String nom) {
        for(GenProprieteAttribut genProprieteAttribut : listeGenProprieteAttribut) {
            if(genProprieteAttribut.getNom().equalsIgnoreCase(nom)) {
                return genProprieteAttribut;
            }
        }
        throw new IllegalStateException("La genProprieteAttribut n'est pas définie : nom de genProprieteAttribut = "+nom);
    }
    public GenProprieteAttribut getGenProprieteAttributByValeur(String valeur) {
        for(GenProprieteAttribut genProprieteAttribut : listeGenProprieteAttribut) {
            if(genProprieteAttribut.getValeur().equalsIgnoreCase(valeur)) {
                return genProprieteAttribut;
            }
        }
        throw new IllegalStateException("La genProprieteAttribut n'est pas définie : valeur de genProprieteAttribut = "+valeur);
    }
    public void addGenProprieteAttribut(GenProprieteAttribut genProprieteAttribut) {
    	genProprieteAttribut.setReferenceGenProprietesAttribut(this);
        listeGenProprieteAttribut.add(genProprieteAttribut);
    }
    public List<GenProprieteAttribut> getListeGenProprieteAttribut() {
        return listeGenProprieteAttribut;
    }
    public void setListeGenProprieteAttribut(List<GenProprieteAttribut> listeGenProprieteAttribut) {
        this.listeGenProprieteAttribut = listeGenProprieteAttribut;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
