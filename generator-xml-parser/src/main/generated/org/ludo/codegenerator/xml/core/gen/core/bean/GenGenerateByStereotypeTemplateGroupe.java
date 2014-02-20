package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenGenerateByStereotypeTemplateGroupe 
{
	
	/** Récupération de l'élément parent */
	
	public GenGenerateByStereotype getReferenceGenGenerateByStereotype();
	
	public void setReferenceGenGenerateByStereotype(GenGenerateByStereotype referenceGenGenerateByStereotype);
	
	/** Récupération des éléments fils */

	public String getTemplateGroupe();
	public void setTemplateGroupe(String templateGroupe);
}
