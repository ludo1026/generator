package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenAssociations;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAssociation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AbstractGenAssociationsBean implements GenAssociations {
	
	/** Récupération de l'élément parent */
	
	private GenClasse referenceGenClasse = null;
	
	public GenClasse getReferenceGenClasse() {
		return referenceGenClasse;
	}
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse) {
		this.referenceGenClasse = referenceGenClasse;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenAssociation> listeGenAssociation = new ArrayList<GenAssociation>();
	
    public GenAssociation getGenAssociationByGenId(String genId) {
        for(GenAssociation genAssociation : listeGenAssociation) {
            if(genAssociation.getGenId().equalsIgnoreCase(genId)) {
                return genAssociation;
            }
        }
        throw new IllegalStateException("La genAssociation n'est pas définie : genId de genAssociation = "+genId);
    }
    public GenAssociation getGenAssociationByNomJava(String nomJava) {
        for(GenAssociation genAssociation : listeGenAssociation) {
            if(genAssociation.getNomJava().equalsIgnoreCase(nomJava)) {
                return genAssociation;
            }
        }
        throw new IllegalStateException("La genAssociation n'est pas définie : nomJava de genAssociation = "+nomJava);
    }
    public GenAssociation getGenAssociationByClasseGenId(String classeGenId) {
        for(GenAssociation genAssociation : listeGenAssociation) {
            if(genAssociation.getClasseGenId().equalsIgnoreCase(classeGenId)) {
                return genAssociation;
            }
        }
        throw new IllegalStateException("La genAssociation n'est pas définie : classeGenId de genAssociation = "+classeGenId);
    }
    public GenAssociation getGenAssociationByNbMin(String nbMin) {
        for(GenAssociation genAssociation : listeGenAssociation) {
            if(genAssociation.getNbMin().equalsIgnoreCase(nbMin)) {
                return genAssociation;
            }
        }
        throw new IllegalStateException("La genAssociation n'est pas définie : nbMin de genAssociation = "+nbMin);
    }
    public GenAssociation getGenAssociationByNbMax(String nbMax) {
        for(GenAssociation genAssociation : listeGenAssociation) {
            if(genAssociation.getNbMax().equalsIgnoreCase(nbMax)) {
                return genAssociation;
            }
        }
        throw new IllegalStateException("La genAssociation n'est pas définie : nbMax de genAssociation = "+nbMax);
    }
    public GenAssociation getGenAssociationByDescription(String description) {
        for(GenAssociation genAssociation : listeGenAssociation) {
            if(genAssociation.getDescription().equalsIgnoreCase(description)) {
                return genAssociation;
            }
        }
        throw new IllegalStateException("La genAssociation n'est pas définie : description de genAssociation = "+description);
    }
    public void addGenAssociation(GenAssociation genAssociation) {
    	genAssociation.setReferenceGenAssociations(this);
        listeGenAssociation.add(genAssociation);
    }
    public List<GenAssociation> getListeGenAssociation() {
        return listeGenAssociation;
    }
    public void setListeGenAssociation(List<GenAssociation> listeGenAssociation) {
        this.listeGenAssociation = listeGenAssociation;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
