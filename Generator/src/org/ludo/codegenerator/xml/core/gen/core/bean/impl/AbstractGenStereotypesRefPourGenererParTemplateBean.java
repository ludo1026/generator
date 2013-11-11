package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypesRefPourGenererParTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeRefPourGenererParTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeRefPourGenererParTemplate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
	
    private List<GenStereotypeRefPourGenererParTemplate> listeGenStereotypeRefPourGenererParTemplate = new ArrayList<GenStereotypeRefPourGenererParTemplate>();
	
    public GenStereotypeRefPourGenererParTemplate getGenStereotypeRefPourGenererParTemplateByStereotypeNom(String stereotypeNom) {
        for(GenStereotypeRefPourGenererParTemplate genStereotypeRefPourGenererParTemplate : listeGenStereotypeRefPourGenererParTemplate) {
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
    public List<GenStereotypeRefPourGenererParTemplate> getListeGenStereotypeRefPourGenererParTemplate() {
        return listeGenStereotypeRefPourGenererParTemplate;
    }
    public void setListeGenStereotypeRefPourGenererParTemplate(List<GenStereotypeRefPourGenererParTemplate> listeGenStereotypeRefPourGenererParTemplate) {
        this.listeGenStereotypeRefPourGenererParTemplate = listeGenStereotypeRefPourGenererParTemplate;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
