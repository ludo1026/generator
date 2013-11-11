package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAttributs;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;

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
	
    private List listeGenAttribut = new ArrayList();
	
    public GenAttribut getGenAttributByGenId(String genId) {
        for(Iterator iter = listeGenAttribut.iterator(); iter.hasNext(); ) {
            GenAttributBean genAttribut = (GenAttributBean) iter.next();
            if(genAttribut.getGenId().equalsIgnoreCase(genId)) {
                return genAttribut;
            }
        }
        throw new IllegalStateException("La genAttribut n'est pas définie : genId de genAttribut = "+genId);
    }
    public GenAttribut getGenAttributByNomJava(String nomJava) {
        for(Iterator iter = listeGenAttribut.iterator(); iter.hasNext(); ) {
            GenAttributBean genAttribut = (GenAttributBean) iter.next();
            if(genAttribut.getNomJava().equalsIgnoreCase(nomJava)) {
                return genAttribut;
            }
        }
        throw new IllegalStateException("La genAttribut n'est pas définie : nomJava de genAttribut = "+nomJava);
    }
    public GenAttribut getGenAttributByType(String type) {
        for(Iterator iter = listeGenAttribut.iterator(); iter.hasNext(); ) {
            GenAttributBean genAttribut = (GenAttributBean) iter.next();
            if(genAttribut.getType().equalsIgnoreCase(type)) {
                return genAttribut;
            }
        }
        throw new IllegalStateException("La genAttribut n'est pas définie : type de genAttribut = "+type);
    }
    public GenAttribut getGenAttributByNombreMinimum(String nombreMinimum) {
        for(Iterator iter = listeGenAttribut.iterator(); iter.hasNext(); ) {
            GenAttributBean genAttribut = (GenAttributBean) iter.next();
            if(genAttribut.getNombreMinimum().equalsIgnoreCase(nombreMinimum)) {
                return genAttribut;
            }
        }
        throw new IllegalStateException("La genAttribut n'est pas définie : nombreMinimum de genAttribut = "+nombreMinimum);
    }
    public GenAttribut getGenAttributByNombreMaximum(String nombreMaximum) {
        for(Iterator iter = listeGenAttribut.iterator(); iter.hasNext(); ) {
            GenAttributBean genAttribut = (GenAttributBean) iter.next();
            if(genAttribut.getNombreMaximum().equalsIgnoreCase(nombreMaximum)) {
                return genAttribut;
            }
        }
        throw new IllegalStateException("La genAttribut n'est pas définie : nombreMaximum de genAttribut = "+nombreMaximum);
    }
    public GenAttribut getGenAttributByNomSQL(String nomSQL) {
        for(Iterator iter = listeGenAttribut.iterator(); iter.hasNext(); ) {
            GenAttributBean genAttribut = (GenAttributBean) iter.next();
            if(genAttribut.getNomSQL().equalsIgnoreCase(nomSQL)) {
                return genAttribut;
            }
        }
        throw new IllegalStateException("La genAttribut n'est pas définie : nomSQL de genAttribut = "+nomSQL);
    }
    public GenAttribut getGenAttributByTypeSQL(String typeSQL) {
        for(Iterator iter = listeGenAttribut.iterator(); iter.hasNext(); ) {
            GenAttributBean genAttribut = (GenAttributBean) iter.next();
            if(genAttribut.getTypeSQL().equalsIgnoreCase(typeSQL)) {
                return genAttribut;
            }
        }
        throw new IllegalStateException("La genAttribut n'est pas définie : typeSQL de genAttribut = "+typeSQL);
    }
    public GenAttribut getGenAttributByEstDansTable(String estDansTable) {
        for(Iterator iter = listeGenAttribut.iterator(); iter.hasNext(); ) {
            GenAttributBean genAttribut = (GenAttributBean) iter.next();
            if(genAttribut.getEstDansTable().equalsIgnoreCase(estDansTable)) {
                return genAttribut;
            }
        }
        throw new IllegalStateException("La genAttribut n'est pas définie : estDansTable de genAttribut = "+estDansTable);
    }
    public GenAttribut getGenAttributBySize(String size) {
        for(Iterator iter = listeGenAttribut.iterator(); iter.hasNext(); ) {
            GenAttributBean genAttribut = (GenAttributBean) iter.next();
            if(genAttribut.getSize().equalsIgnoreCase(size)) {
                return genAttribut;
            }
        }
        throw new IllegalStateException("La genAttribut n'est pas définie : size de genAttribut = "+size);
    }
    public GenAttribut getGenAttributByEstClePrimaire(String estClePrimaire) {
        for(Iterator iter = listeGenAttribut.iterator(); iter.hasNext(); ) {
            GenAttributBean genAttribut = (GenAttributBean) iter.next();
            if(genAttribut.getEstClePrimaire().equalsIgnoreCase(estClePrimaire)) {
                return genAttribut;
            }
        }
        throw new IllegalStateException("La genAttribut n'est pas définie : estClePrimaire de genAttribut = "+estClePrimaire);
    }
    public GenAttribut getGenAttributByEstCleIncrementee(String estCleIncrementee) {
        for(Iterator iter = listeGenAttribut.iterator(); iter.hasNext(); ) {
            GenAttributBean genAttribut = (GenAttributBean) iter.next();
            if(genAttribut.getEstCleIncrementee().equalsIgnoreCase(estCleIncrementee)) {
                return genAttribut;
            }
        }
        throw new IllegalStateException("La genAttribut n'est pas définie : estCleIncrementee de genAttribut = "+estCleIncrementee);
    }
    public void addGenAttribut(GenAttribut genAttribut) {
    	genAttribut.setReferenceGenAttributs(this);
        listeGenAttribut.add(genAttribut);
    }
    public List getListeGenAttribut() {
        return listeGenAttribut;
    }
    public void setListeGenAttribut(List listeGenAttribut) {
        this.listeGenAttribut = listeGenAttribut;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
