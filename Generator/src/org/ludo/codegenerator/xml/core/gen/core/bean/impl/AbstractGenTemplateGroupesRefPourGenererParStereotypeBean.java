package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupesRefPourGenererParStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeRefPourGenererParStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeRefPourGenererParStereotype;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AbstractGenTemplateGroupesRefPourGenererParStereotypeBean implements GenTemplateGroupesRefPourGenererParStereotype {
	
	/** Récupération de l'élément parent */
	
	private GenStereotypeRefPourGenererParStereotype referenceGenStereotypeRefPourGenererParStereotype = null;
	
	public GenStereotypeRefPourGenererParStereotype getReferenceGenStereotypeRefPourGenererParStereotype() {
		return referenceGenStereotypeRefPourGenererParStereotype;
	}
	
	public void setReferenceGenStereotypeRefPourGenererParStereotype(GenStereotypeRefPourGenererParStereotype referenceGenStereotypeRefPourGenererParStereotype) {
		this.referenceGenStereotypeRefPourGenererParStereotype = referenceGenStereotypeRefPourGenererParStereotype;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenTemplateGroupeRefPourGenererParStereotype> listeGenTemplateGroupeRefPourGenererParStereotype = new ArrayList<GenTemplateGroupeRefPourGenererParStereotype>();
	
    public GenTemplateGroupeRefPourGenererParStereotype getGenTemplateGroupeRefPourGenererParStereotypeByTemplateGroupeNom(String templateGroupeNom) {
        for(GenTemplateGroupeRefPourGenererParStereotype genTemplateGroupeRefPourGenererParStereotype : listeGenTemplateGroupeRefPourGenererParStereotype) {
            if(genTemplateGroupeRefPourGenererParStereotype.getTemplateGroupeNom().equalsIgnoreCase(templateGroupeNom)) {
                return genTemplateGroupeRefPourGenererParStereotype;
            }
        }
        throw new IllegalStateException("La genTemplateGroupeRefPourGenererParStereotype n'est pas définie : templateGroupeNom de genTemplateGroupeRefPourGenererParStereotype = "+templateGroupeNom);
    }
    public void addGenTemplateGroupeRefPourGenererParStereotype(GenTemplateGroupeRefPourGenererParStereotype genTemplateGroupeRefPourGenererParStereotype) {
    	genTemplateGroupeRefPourGenererParStereotype.setReferenceGenTemplateGroupesRefPourGenererParStereotype(this);
        listeGenTemplateGroupeRefPourGenererParStereotype.add(genTemplateGroupeRefPourGenererParStereotype);
    }
    public List<GenTemplateGroupeRefPourGenererParStereotype> getListeGenTemplateGroupeRefPourGenererParStereotype() {
        return listeGenTemplateGroupeRefPourGenererParStereotype;
    }
    public void setListeGenTemplateGroupeRefPourGenererParStereotype(List<GenTemplateGroupeRefPourGenererParStereotype> listeGenTemplateGroupeRefPourGenererParStereotype) {
        this.listeGenTemplateGroupeRefPourGenererParStereotype = listeGenTemplateGroupeRefPourGenererParStereotype;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
