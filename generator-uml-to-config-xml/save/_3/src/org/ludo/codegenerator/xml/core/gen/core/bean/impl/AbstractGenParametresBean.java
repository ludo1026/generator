package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenMethode;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenParametre;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenParametres;

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
	
    private List listeGenParametre = new ArrayList();
	
    public GenParametre getGenParametreByGenId(String genId) {
        for(Iterator iter = listeGenParametre.iterator(); iter.hasNext(); ) {
            GenParametreBean genParametre = (GenParametreBean) iter.next();
            if(genParametre.getGenId().equalsIgnoreCase(genId)) {
                return genParametre;
            }
        }
        throw new IllegalStateException("La genParametre n'est pas définie : genId de genParametre = "+genId);
    }
    public GenParametre getGenParametreByNomJava(String nomJava) {
        for(Iterator iter = listeGenParametre.iterator(); iter.hasNext(); ) {
            GenParametreBean genParametre = (GenParametreBean) iter.next();
            if(genParametre.getNomJava().equalsIgnoreCase(nomJava)) {
                return genParametre;
            }
        }
        throw new IllegalStateException("La genParametre n'est pas définie : nomJava de genParametre = "+nomJava);
    }
    public GenParametre getGenParametreByType(String type) {
        for(Iterator iter = listeGenParametre.iterator(); iter.hasNext(); ) {
            GenParametreBean genParametre = (GenParametreBean) iter.next();
            if(genParametre.getType().equalsIgnoreCase(type)) {
                return genParametre;
            }
        }
        throw new IllegalStateException("La genParametre n'est pas définie : type de genParametre = "+type);
    }
    public void addGenParametre(GenParametre genParametre) {
    	genParametre.setReferenceGenParametres(this);
        listeGenParametre.add(genParametre);
    }
    public List getListeGenParametre() {
        return listeGenParametre;
    }
    public void setListeGenParametre(List listeGenParametre) {
        this.listeGenParametre = listeGenParametre;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
