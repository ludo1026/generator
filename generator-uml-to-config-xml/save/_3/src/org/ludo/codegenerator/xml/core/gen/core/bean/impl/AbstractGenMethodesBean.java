package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenMethode;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenMethodes;

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
	
    private List listeGenMethode = new ArrayList();
	
    public GenMethode getGenMethodeByGenId(String genId) {
        for(Iterator iter = listeGenMethode.iterator(); iter.hasNext(); ) {
            GenMethodeBean genMethode = (GenMethodeBean) iter.next();
            if(genMethode.getGenId().equalsIgnoreCase(genId)) {
                return genMethode;
            }
        }
        throw new IllegalStateException("La genMethode n'est pas définie : genId de genMethode = "+genId);
    }
    public GenMethode getGenMethodeByNomJava(String nomJava) {
        for(Iterator iter = listeGenMethode.iterator(); iter.hasNext(); ) {
            GenMethodeBean genMethode = (GenMethodeBean) iter.next();
            if(genMethode.getNomJava().equalsIgnoreCase(nomJava)) {
                return genMethode;
            }
        }
        throw new IllegalStateException("La genMethode n'est pas définie : nomJava de genMethode = "+nomJava);
    }
    public GenMethode getGenMethodeByRetourType(String retourType) {
        for(Iterator iter = listeGenMethode.iterator(); iter.hasNext(); ) {
            GenMethodeBean genMethode = (GenMethodeBean) iter.next();
            if(genMethode.getRetourType().equalsIgnoreCase(retourType)) {
                return genMethode;
            }
        }
        throw new IllegalStateException("La genMethode n'est pas définie : retourType de genMethode = "+retourType);
    }
    public void addGenMethode(GenMethode genMethode) {
    	genMethode.setReferenceGenMethodes(this);
        listeGenMethode.add(genMethode);
    }
    public List getListeGenMethode() {
        return listeGenMethode;
    }
    public void setListeGenMethode(List listeGenMethode) {
        this.listeGenMethode = listeGenMethode;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
