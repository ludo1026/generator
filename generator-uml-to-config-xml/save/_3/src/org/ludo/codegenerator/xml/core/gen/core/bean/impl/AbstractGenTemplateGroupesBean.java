package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupe;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupes;

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
	
    private List listeGenTemplateGroupe = new ArrayList();
	
    public GenTemplateGroupe getGenTemplateGroupeByNom(String nom) {
        for(Iterator iter = listeGenTemplateGroupe.iterator(); iter.hasNext(); ) {
            GenTemplateGroupeBean genTemplateGroupe = (GenTemplateGroupeBean) iter.next();
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
    public List getListeGenTemplateGroupe() {
        return listeGenTemplateGroupe;
    }
    public void setListeGenTemplateGroupe(List listeGenTemplateGroupe) {
        this.listeGenTemplateGroupe = listeGenTemplateGroupe;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
