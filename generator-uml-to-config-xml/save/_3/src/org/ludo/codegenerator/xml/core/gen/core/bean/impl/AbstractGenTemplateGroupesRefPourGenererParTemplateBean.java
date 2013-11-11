package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeRefPourGenererParTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupesRefPourGenererParTemplate;

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
	
    private List listeGenTemplateGroupeRefPourGenererParTemplate = new ArrayList();
	
    public GenTemplateGroupeRefPourGenererParTemplate getGenTemplateGroupeRefPourGenererParTemplateByTemplateGroupeNom(String templateGroupeNom) {
        for(Iterator iter = listeGenTemplateGroupeRefPourGenererParTemplate.iterator(); iter.hasNext(); ) {
            GenTemplateGroupeRefPourGenererParTemplateBean genTemplateGroupeRefPourGenererParTemplate = (GenTemplateGroupeRefPourGenererParTemplateBean) iter.next();
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
    public List getListeGenTemplateGroupeRefPourGenererParTemplate() {
        return listeGenTemplateGroupeRefPourGenererParTemplate;
    }
    public void setListeGenTemplateGroupeRefPourGenererParTemplate(List listeGenTemplateGroupeRefPourGenererParTemplate) {
        this.listeGenTemplateGroupeRefPourGenererParTemplate = listeGenTemplateGroupeRefPourGenererParTemplate;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
