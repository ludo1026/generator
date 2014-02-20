package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenGenerateByTemplateGroupeStereotype 
{
	
	/** Récupération de l'élément parent */
	
	public GenGenerateByTemplateGroupe getReferenceGenGenerateByTemplateGroupe();
	
	public void setReferenceGenGenerateByTemplateGroupe(GenGenerateByTemplateGroupe referenceGenGenerateByTemplateGroupe);
	
	/** Récupération des éléments fils */

	public String getStereotype();
	public void setStereotype(String stereotype);
}
