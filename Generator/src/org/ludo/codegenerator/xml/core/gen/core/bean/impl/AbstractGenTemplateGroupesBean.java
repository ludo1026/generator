package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupes;
import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AbstractGenTemplateGroupesBean implements GenTemplateGroupes {
	
	/** Récupération de l'élément parent */
	
	private Gen referenceGen = null;
	
	public Gen getReferenceGen() {
		return referenceGen;
	}
	
	public void setReferenceGen(Gen referenceGen) {
		this.referenceGen = referenceGen;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenTemplateGroupe> listeGenTemplateGroupe = new ArrayList<GenTemplateGroupe>();
	
    public GenTemplateGroupe getGenTemplateGroupeByNom(String nom) {
        for(GenTemplateGroupe genTemplateGroupe : listeGenTemplateGroupe) {
            if(genTemplateGroupe.getNom().equalsIgnoreCase(nom)) {
                return genTemplateGroupe;
            }
        }
        throw new IllegalStateException("La genTemplateGroupe n'est pas définie : nom de genTemplateGroupe = "+nom);
    }
    public void addGenTemplateGroupe(GenTemplateGroupe genTemplateGroupe) {
    	genTemplateGroupe.setReferenceGenTemplateGroupes(this);
        listeGenTemplateGroupe.add(genTemplateGroupe);
    }
    public List<GenTemplateGroupe> getListeGenTemplateGroupe() {
        return listeGenTemplateGroupe;
    }
    public void setListeGenTemplateGroupe(List<GenTemplateGroupe> listeGenTemplateGroupe) {
        this.listeGenTemplateGroupe = listeGenTemplateGroupe;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
