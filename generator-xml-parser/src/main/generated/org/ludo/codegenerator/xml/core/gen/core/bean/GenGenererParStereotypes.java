package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenGenererParStereotypes 
	extends List<GenGenererParStereotype>
{
	
	/** Récupération de l'élément parent */
	
	public GenGenererGroupe getReferenceGenGenererGroupe();
	
	public void setReferenceGenGenererGroupe(GenGenererGroupe referenceGenGenererGroupe);
	
	/** Récupération des éléments fils */
	
    public void addGenGenererParStereotype(GenGenererParStereotype genGenererParStereotype);
    public List<GenGenererParStereotype> getGenGenererParStereotypes();
    public void setGenGenererParStereotypes(List<GenGenererParStereotype> genGenererParStereotype);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
