package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypesRefPourGenererParStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeRefPourGenererParStereotype;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
	
    private List<GenStereotypeRefPourGenererParStereotype> listeGenStereotypeRefPourGenererParStereotype = new ArrayList<GenStereotypeRefPourGenererParStereotype>();
	
    public GenStereotypeRefPourGenererParStereotype getGenStereotypeRefPourGenererParStereotypeByStereotypeNom(String stereotypeNom) {
        for(GenStereotypeRefPourGenererParStereotype genStereotypeRefPourGenererParStereotype : listeGenStereotypeRefPourGenererParStereotype) {
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
    public List<GenStereotypeRefPourGenererParStereotype> getListeGenStereotypeRefPourGenererParStereotype() {
        return listeGenStereotypeRefPourGenererParStereotype;
    }
    public void setListeGenStereotypeRefPourGenererParStereotype(List<GenStereotypeRefPourGenererParStereotype> listeGenStereotypeRefPourGenererParStereotype) {
        this.listeGenStereotypeRefPourGenererParStereotype = listeGenStereotypeRefPourGenererParStereotype;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
