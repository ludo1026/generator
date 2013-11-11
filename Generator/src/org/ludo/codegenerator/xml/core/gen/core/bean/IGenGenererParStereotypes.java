package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenGenererParStereotypes {
	
	/** Récupération de l'élément parent */
	
	public GenGenererGroupe getReferenceGenGenererGroupe();
	
	public void setReferenceGenGenererGroupe(GenGenererGroupe referenceGenGenererGroupe);
	
	/** Récupération des éléments fils */
	
    public void addGenGenererParStereotype(GenGenererParStereotype genGenererParStereotype);
    public List<GenGenererParStereotype> getListeGenGenererParStereotype();
    public void setListeGenGenererParStereotype(List<GenGenererParStereotype> listeGenGenererParStereotype);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
