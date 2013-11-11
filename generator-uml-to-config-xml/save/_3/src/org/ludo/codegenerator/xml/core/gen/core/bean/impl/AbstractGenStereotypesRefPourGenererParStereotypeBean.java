package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeRefPourGenererParStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypesRefPourGenererParStereotype;

public class AbstractGenStereotypesRefPourGenererParStereotypeBean implements GenStereotypesRefPourGenererParStereotype {
	
	/** Récupération de l'élément parent */
	
	private GenGenererParStereotype referenceGenGenererParStereotype = null;
	
	public GenGenererParStereotype getReferenceGenGenererParStereotype() {
		return referenceGenGenererParStereotype;
	}
	
	public void setReferenceGenGenererParStereotype(GenGenererParStereotype referenceGenGenererParStereotype) {
		this.referenceGenGenererParStereotype = referenceGenGenererParStereotype;
	}
	
	/** Récupération des éléments fils */
	
    private List listeGenStereotypeRefPourGenererParStereotype = new ArrayList();
	
    public GenStereotypeRefPourGenererParStereotype getGenStereotypeRefPourGenererParStereotypeByStereotypeNom(String stereotypeNom) {
        for(Iterator iter = listeGenStereotypeRefPourGenererParStereotype.iterator(); iter.hasNext(); ) {
            GenStereotypeRefPourGenererParStereotypeBean genStereotypeRefPourGenererParStereotype = (GenStereotypeRefPourGenererParStereotypeBean) iter.next();
            if(genStereotypeRefPourGenererParStereotype.getStereotypeNom().equalsIgnoreCase(stereotypeNom)) {
                return genStereotypeRefPourGenererParStereotype;
            }
        }
        throw new IllegalStateException("La genStereotypeRefPourGenererParStereotype n'est pas définie : stereotypeNom de genStereotypeRefPourGenererParStereotype = "+stereotypeNom);
    }
    public void addGenStereotypeRefPourGenererParStereotype(GenStereotypeRefPourGenererParStereotype genStereotypeRefPourGenererParStereotype) {
    	genStereotypeRefPourGenererParStereotype.setReferenceGenStereotypesRefPourGenererParStereotype(this);
        listeGenStereotypeRefPourGenererParStereotype.add(genStereotypeRefPourGenererParStereotype);
    }
    public List getListeGenStereotypeRefPourGenererParStereotype() {
        return listeGenStereotypeRefPourGenererParStereotype;
    }
    public void setListeGenStereotypeRefPourGenererParStereotype(List listeGenStereotypeRefPourGenererParStereotype) {
        this.listeGenStereotypeRefPourGenererParStereotype = listeGenStereotypeRefPourGenererParStereotype;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
