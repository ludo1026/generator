package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenGenerateByStereotypeTemplateGroup 
{
	
	/** Récupération de l'élément parent */
	
	public GenGenerateByStereotype getReferenceGenGenerateByStereotype();
	
	public void setReferenceGenGenerateByStereotype(GenGenerateByStereotype referenceGenGenerateByStereotype);
	
	/** Récupération des éléments fils */
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	public String getTemplateGroupAsString();
	public void setTemplateGroupAsString(String templateGroupAsString);
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	public String getTemplateGroup();
	public void setTemplateGroup(String templateGroup);
}
