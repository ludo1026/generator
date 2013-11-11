package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupe;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateRef;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AbstractGenTemplateGroupeBean implements GenTemplateGroupe {
	
	/** Récupération de l'élément parent */
	
	private GenTemplateGroupes referenceGenTemplateGroupes = null;
	
	public GenTemplateGroupes getReferenceGenTemplateGroupes() {
		return referenceGenTemplateGroupes;
	}
	
	public void setReferenceGenTemplateGroupes(GenTemplateGroupes referenceGenTemplateGroupes) {
		this.referenceGenTemplateGroupes = referenceGenTemplateGroupes;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenTemplateRef> listeGenTemplateRef = new ArrayList<GenTemplateRef>();
	
    public GenTemplateRef getGenTemplateRefByNom(String nom) {
        for(GenTemplateRef genTemplateRef : listeGenTemplateRef) {
            if(genTemplateRef.getNom().equalsIgnoreCase(nom)) {
                return genTemplateRef;
            }
        }
        throw new IllegalStateException("La genTemplateRef n'est pas définie : nom de genTemplateRef = "+nom);
    }
    public void addGenTemplateRef(GenTemplateRef genTemplateRef) {
    	genTemplateRef.setReferenceGenTemplateGroupe(this);
        listeGenTemplateRef.add(genTemplateRef);
    }
    public List<GenTemplateRef> getListeGenTemplateRef() {
        return listeGenTemplateRef;
    }
    public void setListeGenTemplateRef(List<GenTemplateRef> listeGenTemplateRef) {
        this.listeGenTemplateRef = listeGenTemplateRef;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	

	public String getNomAsString() {
		return this.nom;
	}
	public void setNomAsString(String nomAsString) {
		this.nom = nomAsString;
	}
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
	private String nom = null;

	public String getNom() {
		return this.nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
}
