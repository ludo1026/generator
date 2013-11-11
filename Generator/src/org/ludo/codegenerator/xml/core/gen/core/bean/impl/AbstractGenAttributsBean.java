package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenAttributs;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAttribut;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AbstractGenAttributsBean implements GenAttributs {
	
	/** Récupération de l'élément parent */
	
	private GenClasse referenceGenClasse = null;
	
	public GenClasse getReferenceGenClasse() {
		return referenceGenClasse;
	}
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse) {
		this.referenceGenClasse = referenceGenClasse;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenAttribut> listeGenAttribut = new ArrayList<GenAttribut>();
	
    public GenAttribut getGenAttributByGenId(String genId) {
        for(GenAttribut genAttribut : listeGenAttribut) {
            if(genAttribut.getGenId().equalsIgnoreCase(genId)) {
                return genAttribut;
            }
        }
        throw new IllegalStateException("La genAttribut n'est pas définie : genId de genAttribut = "+genId);
    }
    public GenAttribut getGenAttributByNomJava(String nomJava) {
        for(GenAttribut genAttribut : listeGenAttribut) {
            if(genAttribut.getNomJava().equalsIgnoreCase(nomJava)) {
                return genAttribut;
            }
        }
        throw new IllegalStateException("La genAttribut n'est pas définie : nomJava de genAttribut = "+nomJava);
    }
    public GenAttribut getGenAttributByType(String type) {
        for(GenAttribut genAttribut : listeGenAttribut) {
            if(genAttribut.getType().equalsIgnoreCase(type)) {
                return genAttribut;
            }
        }
        throw new IllegalStateException("La genAttribut n'est pas définie : type de genAttribut = "+type);
    }
    public GenAttribut getGenAttributByNbMin(String nbMin) {
        for(GenAttribut genAttribut : listeGenAttribut) {
            if(genAttribut.getNbMin().equalsIgnoreCase(nbMin)) {
                return genAttribut;
            }
        }
        throw new IllegalStateException("La genAttribut n'est pas définie : nbMin de genAttribut = "+nbMin);
    }
    public GenAttribut getGenAttributByNbMax(String nbMax) {
        for(GenAttribut genAttribut : listeGenAttribut) {
            if(genAttribut.getNbMax().equalsIgnoreCase(nbMax)) {
                return genAttribut;
            }
        }
        throw new IllegalStateException("La genAttribut n'est pas définie : nbMax de genAttribut = "+nbMax);
    }
    public GenAttribut getGenAttributByNomSQL(String nomSQL) {
        for(GenAttribut genAttribut : listeGenAttribut) {
            if(genAttribut.getNomSQL().equalsIgnoreCase(nomSQL)) {
                return genAttribut;
            }
        }
        throw new IllegalStateException("La genAttribut n'est pas définie : nomSQL de genAttribut = "+nomSQL);
    }
    public GenAttribut getGenAttributByTypeSQL(String typeSQL) {
        for(GenAttribut genAttribut : listeGenAttribut) {
            if(genAttribut.getTypeSQL().equalsIgnoreCase(typeSQL)) {
                return genAttribut;
            }
        }
        throw new IllegalStateException("La genAttribut n'est pas définie : typeSQL de genAttribut = "+typeSQL);
    }
    public GenAttribut getGenAttributByEstDansTable(String estDansTable) {
        for(GenAttribut genAttribut : listeGenAttribut) {
            if(genAttribut.getEstDansTable().equalsIgnoreCase(estDansTable)) {
                return genAttribut;
            }
        }
        throw new IllegalStateException("La genAttribut n'est pas définie : estDansTable de genAttribut = "+estDansTable);
    }
    public GenAttribut getGenAttributBySize(String size) {
        for(GenAttribut genAttribut : listeGenAttribut) {
            if(genAttribut.getSize().equalsIgnoreCase(size)) {
                return genAttribut;
            }
        }
        throw new IllegalStateException("La genAttribut n'est pas définie : size de genAttribut = "+size);
    }
    public GenAttribut getGenAttributByEstClePrimaire(String estClePrimaire) {
        for(GenAttribut genAttribut : listeGenAttribut) {
            if(genAttribut.getEstClePrimaire().equalsIgnoreCase(estClePrimaire)) {
                return genAttribut;
            }
        }
        throw new IllegalStateException("La genAttribut n'est pas définie : estClePrimaire de genAttribut = "+estClePrimaire);
    }
    public GenAttribut getGenAttributByEstCleIncrementee(String estCleIncrementee) {
        for(GenAttribut genAttribut : listeGenAttribut) {
            if(genAttribut.getEstCleIncrementee().equalsIgnoreCase(estCleIncrementee)) {
                return genAttribut;
            }
        }
        throw new IllegalStateException("La genAttribut n'est pas définie : estCleIncrementee de genAttribut = "+estCleIncrementee);
    }
    public GenAttribut getGenAttributByDescription(String description) {
        for(GenAttribut genAttribut : listeGenAttribut) {
            if(genAttribut.getDescription().equalsIgnoreCase(description)) {
                return genAttribut;
            }
        }
        throw new IllegalStateException("La genAttribut n'est pas définie : description de genAttribut = "+description);
    }
    public void addGenAttribut(GenAttribut genAttribut) {
    	genAttribut.setReferenceGenAttributs(this);
        listeGenAttribut.add(genAttribut);
    }
    public List<GenAttribut> getListeGenAttribut() {
        return listeGenAttribut;
    }
    public void setListeGenAttribut(List<GenAttribut> listeGenAttribut) {
        this.listeGenAttribut = listeGenAttribut;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
