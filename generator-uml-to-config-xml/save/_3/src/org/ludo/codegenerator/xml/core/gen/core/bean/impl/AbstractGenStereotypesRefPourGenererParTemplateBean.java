package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeRefPourGenererParTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypesRefPourGenererParTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeRefPourGenererParTemplate;

public class AbstractGenStereotypesRefPourGenererParTemplateBean implements GenStereotypesRefPourGenererParTemplate {
	
	/** Récupération de l'élément parent */
	
	private GenTemplateGroupeRefPourGenererParTemplate referenceGenTemplateGroupeRefPourGenererParTemplate = null;
	
	public GenTemplateGroupeRefPourGenererParTemplate getReferenceGenTemplateGroupeRefPourGenererParTemplate() {
		return referenceGenTemplateGroupeRefPourGenererParTemplate;
	}
	
	public void setReferenceGenTemplateGroupeRefPourGenererParTemplate(GenTemplateGroupeRefPourGenererParTemplate referenceGenTemplateGroupeRefPourGenererParTemplate) {
		this.referenceGenTemplateGroupeRefPourGenererParTemplate = referenceGenTemplateGroupeRefPourGenererParTemplate;
	}
	
	/** Récupération des éléments fils */
	
    private List listeGenStereotypeRefPourGenererParTemplate = new ArrayList();
	
    public GenStereotypeRefPourGenererParTemplate getGenStereotypeRefPourGenererParTemplateByStereotypeNom(String stereotypeNom) {
        for(Iterator iter = listeGenStereotypeRefPourGenererParTemplate.iterator(); iter.hasNext(); ) {
            GenStereotypeRefPourGenererParTemplateBean genStereotypeRefPourGenererParTemplate = (GenStereotypeRefPourGenererParTemplateBean) iter.next();
            if(genStereotypeRefPourGenererParTemplate.getStereotypeNom().equalsIgnoreCase(stereotypeNom)) {
                return genStereotypeRefPourGenererParTemplate;
            }
        }
        throw new IllegalStateException("La genStereotypeRefPourGenererParTemplate n'est pas définie : stereotypeNom de genStereotypeRefPourGenererParTemplate = "+stereotypeNom);
    }
    public void addGenStereotypeRefPourGenererParTemplate(GenStereotypeRefPourGenererParTemplate genStereotypeRefPourGenererParTemplate) {
    	genStereotypeRefPourGenererParTemplate.setReferenceGenStereotypesRefPourGenererParTemplate(this);
        listeGenStereotypeRefPourGenererParTemplate.add(genStereotypeRefPourGenererParTemplate);
    }
    public List getListeGenStereotypeRefPourGenererParTemplate() {
        return listeGenStereotypeRefPourGenererParTemplate;
    }
    public void setListeGenStereotypeRefPourGenererParTemplate(List listeGenStereotypeRefPourGenererParTemplate) {
        this.listeGenStereotypeRefPourGenererParTemplate = listeGenStereotypeRefPourGenererParTemplate;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
