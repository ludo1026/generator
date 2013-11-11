package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenProprietesClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenProprieteClasse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AbstractGenProprietesClasseBean implements GenProprietesClasse {
	
	/** Récupération de l'élément parent */
	
	private GenClasse referenceGenClasse = null;
	
	public GenClasse getReferenceGenClasse() {
		return referenceGenClasse;
	}
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse) {
		this.referenceGenClasse = referenceGenClasse;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenProprieteClasse> listeGenProprieteClasse = new ArrayList<GenProprieteClasse>();
	
    public GenProprieteClasse getGenProprieteClasseByNom(String nom) {
        for(GenProprieteClasse genProprieteClasse : listeGenProprieteClasse) {
            if(genProprieteClasse.getNom().equalsIgnoreCase(nom)) {
                return genProprieteClasse;
            }
        }
        throw new IllegalStateException("La genProprieteClasse n'est pas définie : nom de genProprieteClasse = "+nom);
    }
    public GenProprieteClasse getGenProprieteClasseByValeur(String valeur) {
        for(GenProprieteClasse genProprieteClasse : listeGenProprieteClasse) {
            if(genProprieteClasse.getValeur().equalsIgnoreCase(valeur)) {
                return genProprieteClasse;
            }
        }
        throw new IllegalStateException("La genProprieteClasse n'est pas définie : valeur de genProprieteClasse = "+valeur);
    }
    public void addGenProprieteClasse(GenProprieteClasse genProprieteClasse) {
    	genProprieteClasse.setReferenceGenProprietesClasse(this);
        listeGenProprieteClasse.add(genProprieteClasse);
    }
    public List<GenProprieteClasse> getListeGenProprieteClasse() {
        return listeGenProprieteClasse;
    }
    public void setListeGenProprieteClasse(List<GenProprieteClasse> listeGenProprieteClasse) {
        this.listeGenProprieteClasse = listeGenProprieteClasse;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
