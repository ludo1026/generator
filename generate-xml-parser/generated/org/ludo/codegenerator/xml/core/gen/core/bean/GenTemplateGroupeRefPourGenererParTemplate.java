package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenTemplateGroupeRefPourGenererParTemplate 
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	public GenTemplateGroupeRefPourGenererParTemplates getReferenceGenTemplateGroupeRefPourGenererParTemplates();
	
	public void setReferenceGenTemplateGroupeRefPourGenererParTemplates(GenTemplateGroupeRefPourGenererParTemplates referenceGenTemplateGroupeRefPourGenererParTemplates);
	
	/** R�cup�ration des �l�ments fils */

    public GenStereotypeRefPourGenererParTemplates getGenStereotypeRefPourGenererParTemplates();
    
    public void setGenStereotypeRefPourGenererParTemplates(GenStereotypeRefPourGenererParTemplates genStereotypeRefPourGenererParTemplates);
	
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	public String getTemplateGroupeNomAsString();
	public void setTemplateGroupeNomAsString(String templateGroupeNomAsString);
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	

	public String getTemplateGroupeNom();
	public void setTemplateGroupeNom(String templateGroupeNom);
}
