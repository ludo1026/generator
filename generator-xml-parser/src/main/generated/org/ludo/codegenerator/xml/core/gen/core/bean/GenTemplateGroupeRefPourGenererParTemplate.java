package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenTemplateGroupeRefPourGenererParTemplate 
{
	
	/** Récupération de l'élément parent */
	
	public GenTemplateGroupeRefPourGenererParTemplates getReferenceGenTemplateGroupeRefPourGenererParTemplates();
	
	public void setReferenceGenTemplateGroupeRefPourGenererParTemplates(GenTemplateGroupeRefPourGenererParTemplates referenceGenTemplateGroupeRefPourGenererParTemplates);
	
	/** Récupération des éléments fils */

    public GenStereotypeRefPourGenererParTemplates getGenStereotypeRefPourGenererParTemplates();
    
    public void setGenStereotypeRefPourGenererParTemplates(GenStereotypeRefPourGenererParTemplates genStereotypeRefPourGenererParTemplates);
	
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	public String getTemplateGroupeNomAsString();
	public void setTemplateGroupeNomAsString(String templateGroupeNomAsString);
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	public String getTemplateGroupeNom();
	public void setTemplateGroupeNom(String templateGroupeNom);
}
