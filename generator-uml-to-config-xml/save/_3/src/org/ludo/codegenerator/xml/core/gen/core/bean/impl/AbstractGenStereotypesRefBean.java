package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeRef;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypesRef;

public class AbstractGenStereotypesRefBean implements GenStereotypesRef {
	
	/** Récupération de l'élément parent */
	
	private GenClasse referenceGenClasse = null;
	
	public GenClasse getReferenceGenClasse() {
		return referenceGenClasse;
	}
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse) {
		this.referenceGenClasse = referenceGenClasse;
	}
	
	/** Récupération des éléments fils */
	
    private List listeGenStereotypeRef = new ArrayList();
	
    public GenStereotypeRef getGenStereotypeRefByStereotypeNom(String stereotypeNom) {
        for(Iterator iter = listeGenStereotypeRef.iterator(); iter.hasNext(); ) {
            GenStereotypeRefBean genStereotypeRef = (GenStereotypeRefBean) iter.next();
            if(genStereotypeRef.getStereotypeNom().equalsIgnoreCase(stereotypeNom)) {
                return genStereotypeRef;
            }
        }
        throw new IllegalStateException("La genStereotypeRef n'est pas définie : stereotypeNom de genStereotypeRef = "+stereotypeNom);
    }
    public void addGenStereotypeRef(GenStereotypeRef genStereotypeRef) {
    	genStereotypeRef.setReferenceGenStereotypesRef(this);
        listeGenStereotypeRef.add(genStereotypeRef);
    }
    public List getListeGenStereotypeRef() {
        return listeGenStereotypeRef;
    }
    public void setListeGenStereotypeRef(List listeGenStereotypeRef) {
        this.listeGenStereotypeRef = listeGenStereotypeRef;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
