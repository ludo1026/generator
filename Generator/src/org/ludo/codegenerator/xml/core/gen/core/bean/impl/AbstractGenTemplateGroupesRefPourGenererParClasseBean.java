package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupesRefPourGenererParClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeRefPourGenererParClasse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AbstractGenTemplateGroupesRefPourGenererParClasseBean implements GenTemplateGroupesRefPourGenererParClasse {
	
	/** Récupération de l'élément parent */
	
	private GenGenererParClasse referenceGenGenererParClasse = null;
	
	public GenGenererParClasse getReferenceGenGenererParClasse() {
		return referenceGenGenererParClasse;
	}
	
	public void setReferenceGenGenererParClasse(GenGenererParClasse referenceGenGenererParClasse) {
		this.referenceGenGenererParClasse = referenceGenGenererParClasse;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenTemplateGroupeRefPourGenererParClasse> listeGenTemplateGroupeRefPourGenererParClasse = new ArrayList<GenTemplateGroupeRefPourGenererParClasse>();
	
    public GenTemplateGroupeRefPourGenererParClasse getGenTemplateGroupeRefPourGenererParClasseByTemplateGroupeNom(String templateGroupeNom) {
        for(GenTemplateGroupeRefPourGenererParClasse genTemplateGroupeRefPourGenererParClasse : listeGenTemplateGroupeRefPourGenererParClasse) {
            if(genTemplateGroupeRefPourGenererParClasse.getTemplateGroupeNom().equalsIgnoreCase(templateGroupeNom)) {
                return genTemplateGroupeRefPourGenererParClasse;
            }
        }
        throw new IllegalStateException("La genTemplateGroupeRefPourGenererParClasse n'est pas définie : templateGroupeNom de genTemplateGroupeRefPourGenererParClasse = "+templateGroupeNom);
    }
    public void addGenTemplateGroupeRefPourGenererParClasse(GenTemplateGroupeRefPourGenererParClasse genTemplateGroupeRefPourGenererParClasse) {
    	genTemplateGroupeRefPourGenererParClasse.setReferenceGenTemplateGroupesRefPourGenererParClasse(this);
        listeGenTemplateGroupeRefPourGenererParClasse.add(genTemplateGroupeRefPourGenererParClasse);
    }
    public List<GenTemplateGroupeRefPourGenererParClasse> getListeGenTemplateGroupeRefPourGenererParClasse() {
        return listeGenTemplateGroupeRefPourGenererParClasse;
    }
    public void setListeGenTemplateGroupeRefPourGenererParClasse(List<GenTemplateGroupeRefPourGenererParClasse> listeGenTemplateGroupeRefPourGenererParClasse) {
        this.listeGenTemplateGroupeRefPourGenererParClasse = listeGenTemplateGroupeRefPourGenererParClasse;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
