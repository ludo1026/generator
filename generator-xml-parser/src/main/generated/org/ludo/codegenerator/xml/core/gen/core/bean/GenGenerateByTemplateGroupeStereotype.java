package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenGenerateByTemplateGroupeStereotype 
{
	
	/** Récupération de l'élément parent */
	
	public GenGenerateByTemplateGroupe getReferenceGenGenerateByTemplateGroupe();
	
	public void setReferenceGenGenerateByTemplateGroupe(GenGenerateByTemplateGroupe referenceGenGenerateByTemplateGroupe);
	
	/** Récupération des éléments fils */
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	public String getStereotypeAsString();
	public void setStereotypeAsString(String stereotypeAsString);
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	public String getStereotype();
	public void setStereotype(String stereotype);
}
