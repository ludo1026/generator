package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenGenererParTemplates {
	
	/** Récupération de l'élément parent */
	
	public GenGenererGroupe getReferenceGenGenererGroupe();
	
	public void setReferenceGenGenererGroupe(GenGenererGroupe referenceGenGenererGroupe);
	
	/** Récupération des éléments fils */
	
    public void addGenGenererParTemplate(GenGenererParTemplate genGenererParTemplate);
    public List getListeGenGenererParTemplate();
    public void setListeGenGenererParTemplate(List listeGenGenererParTemplate);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
