package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupesRefPourGenererParTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeRefPourGenererParTemplate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AbstractGenTemplateGroupesRefPourGenererParTemplateBean implements GenTemplateGroupesRefPourGenererParTemplate {
	
	/** Récupération de l'élément parent */
	
	private GenGenererParTemplate referenceGenGenererParTemplate = null;
	
	public GenGenererParTemplate getReferenceGenGenererParTemplate() {
		return referenceGenGenererParTemplate;
	}
	
	public void setReferenceGenGenererParTemplate(GenGenererParTemplate referenceGenGenererParTemplate) {
		this.referenceGenGenererParTemplate = referenceGenGenererParTemplate;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenTemplateGroupeRefPourGenererParTemplate> listeGenTemplateGroupeRefPourGenererParTemplate = new ArrayList<GenTemplateGroupeRefPourGenererParTemplate>();
	
    public GenTemplateGroupeRefPourGenererParTemplate getGenTemplateGroupeRefPourGenererParTemplateByTemplateGroupeNom(String templateGroupeNom) {
        for(GenTemplateGroupeRefPourGenererParTemplate genTemplateGroupeRefPourGenererParTemplate : listeGenTemplateGroupeRefPourGenererParTemplate) {
            if(genTemplateGroupeRefPourGenererParTemplate.getTemplateGroupeNom().equalsIgnoreCase(templateGroupeNom)) {
                return genTemplateGroupeRefPourGenererParTemplate;
            }
        }
        throw new IllegalStateException("La genTemplateGroupeRefPourGenererParTemplate n'est pas définie : templateGroupeNom de genTemplateGroupeRefPourGenererParTemplate = "+templateGroupeNom);
    }
    public void addGenTemplateGroupeRefPourGenererParTemplate(GenTemplateGroupeRefPourGenererParTemplate genTemplateGroupeRefPourGenererParTemplate) {
    	genTemplateGroupeRefPourGenererParTemplate.setReferenceGenTemplateGroupesRefPourGenererParTemplate(this);
        listeGenTemplateGroupeRefPourGenererParTemplate.add(genTemplateGroupeRefPourGenererParTemplate);
    }
    public List<GenTemplateGroupeRefPourGenererParTemplate> getListeGenTemplateGroupeRefPourGenererParTemplate() {
        return listeGenTemplateGroupeRefPourGenererParTemplate;
    }
    public void setListeGenTemplateGroupeRefPourGenererParTemplate(List<GenTemplateGroupeRefPourGenererParTemplate> listeGenTemplateGroupeRefPourGenererParTemplate) {
        this.listeGenTemplateGroupeRefPourGenererParTemplate = listeGenTemplateGroupeRefPourGenererParTemplate;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
