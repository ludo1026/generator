package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseParent;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseParents;

public class AbstractGenClasseParentsBean implements GenClasseParents {
	
	/** Récupération de l'élément parent */
	
	private GenClasse referenceGenClasse = null;
	
	public GenClasse getReferenceGenClasse() {
		return referenceGenClasse;
	}
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse) {
		this.referenceGenClasse = referenceGenClasse;
	}
	
	/** Récupération des éléments fils */
	
    private List listeGenClasseParent = new ArrayList();
	
    public GenClasseParent getGenClasseParentByClasseGenId(String classeGenId) {
        for(Iterator iter = listeGenClasseParent.iterator(); iter.hasNext(); ) {
            GenClasseParentBean genClasseParent = (GenClasseParentBean) iter.next();
            if(genClasseParent.getClasseGenId().equalsIgnoreCase(classeGenId)) {
                return genClasseParent;
            }
        }
        throw new IllegalStateException("La genClasseParent n'est pas définie : classeGenId de genClasseParent = "+classeGenId);
    }
    public void addGenClasseParent(GenClasseParent genClasseParent) {
    	genClasseParent.setReferenceGenClasseParents(this);
        listeGenClasseParent.add(genClasseParent);
    }
    public List getListeGenClasseParent() {
        return listeGenClasseParent;
    }
    public void setListeGenClasseParent(List listeGenClasseParent) {
        this.listeGenClasseParent = listeGenClasseParent;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
