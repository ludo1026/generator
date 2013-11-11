package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseRefPourGenererParClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClassesRefPourGenererParClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParClasse;

public class AbstractGenClassesRefPourGenererParClasseBean implements GenClassesRefPourGenererParClasse {
	
	/** Récupération de l'élément parent */
	
	private GenGenererParClasse referenceGenGenererParClasse = null;
	
	public GenGenererParClasse getReferenceGenGenererParClasse() {
		return referenceGenGenererParClasse;
	}
	
	public void setReferenceGenGenererParClasse(GenGenererParClasse referenceGenGenererParClasse) {
		this.referenceGenGenererParClasse = referenceGenGenererParClasse;
	}
	
	/** Récupération des éléments fils */
	
    private List listeGenClasseRefPourGenererParClasse = new ArrayList();
	
    public GenClasseRefPourGenererParClasse getGenClasseRefPourGenererParClasseByClasseGenId(String classeGenId) {
        for(Iterator iter = listeGenClasseRefPourGenererParClasse.iterator(); iter.hasNext(); ) {
            GenClasseRefPourGenererParClasseBean genClasseRefPourGenererParClasse = (GenClasseRefPourGenererParClasseBean) iter.next();
            if(genClasseRefPourGenererParClasse.getClasseGenId().equalsIgnoreCase(classeGenId)) {
                return genClasseRefPourGenererParClasse;
            }
        }
        throw new IllegalStateException("La genClasseRefPourGenererParClasse n'est pas définie : classeGenId de genClasseRefPourGenererParClasse = "+classeGenId);
    }
    public void addGenClasseRefPourGenererParClasse(GenClasseRefPourGenererParClasse genClasseRefPourGenererParClasse) {
    	genClasseRefPourGenererParClasse.setReferenceGenClassesRefPourGenererParClasse(this);
        listeGenClasseRefPourGenererParClasse.add(genClasseRefPourGenererParClasse);
    }
    public List getListeGenClasseRefPourGenererParClasse() {
        return listeGenClasseRefPourGenererParClasse;
    }
    public void setListeGenClasseRefPourGenererParClasse(List listeGenClasseRefPourGenererParClasse) {
        this.listeGenClasseRefPourGenererParClasse = listeGenClasseRefPourGenererParClasse;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
