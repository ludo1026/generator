package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenGenererParTemplate 
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	public GenGenererParTemplates getReferenceGenGenererParTemplates();
	
	public void setReferenceGenGenererParTemplates(GenGenererParTemplates referenceGenGenererParTemplates);
	
	/** R�cup�ration des �l�ments fils */

    public GenTemplateGroupeRefPourGenererParTemplates getGenTemplateGroupeRefPourGenererParTemplates();
    
    public void setGenTemplateGroupeRefPourGenererParTemplates(GenTemplateGroupeRefPourGenererParTemplates genTemplateGroupeRefPourGenererParTemplates);
	
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	
}
