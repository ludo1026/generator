package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeRefPourGenererParStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeRefPourGenererParStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupesRefPourGenererParStereotype;

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
	
    private List listeGenTemplateGroupeRefPourGenererParStereotype = new ArrayList();
	
    public GenTemplateGroupeRefPourGenererParStereotype getGenTemplateGroupeRefPourGenererParStereotypeByTemplateGroupeNom(String templateGroupeNom) {
        for(Iterator iter = listeGenTemplateGroupeRefPourGenererParStereotype.iterator(); iter.hasNext(); ) {
            GenTemplateGroupeRefPourGenererParStereotypeBean genTemplateGroupeRefPourGenererParStereotype = (GenTemplateGroupeRefPourGenererParStereotypeBean) iter.next();
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
    public List getListeGenTemplateGroupeRefPourGenererParStereotype() {
        return listeGenTemplateGroupeRefPourGenererParStereotype;
    }
    public void setListeGenTemplateGroupeRefPourGenererParStereotype(List listeGenTemplateGroupeRefPourGenererParStereotype) {
        this.listeGenTemplateGroupeRefPourGenererParStereotype = listeGenTemplateGroupeRefPourGenererParStereotype;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
