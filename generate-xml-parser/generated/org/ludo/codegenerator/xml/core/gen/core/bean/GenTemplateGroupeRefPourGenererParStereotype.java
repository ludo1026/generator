package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenTemplateGroupeRefPourGenererParStereotype 
{
	
	/** Récupération de l'élément parent */
	
	public GenTemplateGroupeRefPourGenererParStereotypes getReferenceGenTemplateGroupeRefPourGenererParStereotypes();
	
	public void setReferenceGenTemplateGroupeRefPourGenererParStereotypes(GenTemplateGroupeRefPourGenererParStereotypes referenceGenTemplateGroupeRefPourGenererParStereotypes);
	
	/** Récupération des éléments fils */
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	public String getTemplateGroupeNomAsString();
	public void setTemplateGroupeNomAsString(String templateGroupeNomAsString);
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	public String getTemplateGroupeNom();
	public void setTemplateGroupeNom(String templateGroupeNom);
}
