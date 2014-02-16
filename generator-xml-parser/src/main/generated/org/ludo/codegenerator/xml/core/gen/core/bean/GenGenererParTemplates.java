package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenGenererParTemplates 
	extends List<GenGenererParTemplate>
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	public GenGenerate getReferenceGenGenerate();
	
	public void setReferenceGenGenerate(GenGenerate referenceGenGenerate);
	
	/** R�cup�ration des �l�ments fils */
	
    public void addGenGenererParTemplate(GenGenererParTemplate genGenererParTemplate);
    public List<GenGenererParTemplate> getGenGenererParTemplates();
    public void setGenGenererParTemplates(List<GenGenererParTemplate> genGenererParTemplate);
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	
}
