package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenTemplateGroupeRefPourGenererParTemplates 
	extends List<GenTemplateGroupeRefPourGenererParTemplate>
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	public GenGenererParTemplate getReferenceGenGenererParTemplate();
	
	public void setReferenceGenGenererParTemplate(GenGenererParTemplate referenceGenGenererParTemplate);
	
	/** R�cup�ration des �l�ments fils */
	
    public GenTemplateGroupeRefPourGenererParTemplate getGenTemplateGroupeRefPourGenererParTemplateForTemplateGroupeNom(String templateGroupeNom);
    public List<GenTemplateGroupeRefPourGenererParTemplate> getGenTemplateGroupeRefPourGenererParTemplatesByTemplateGroupeNom(String templateGroupeNom);
    public void addGenTemplateGroupeRefPourGenererParTemplate(GenTemplateGroupeRefPourGenererParTemplate genTemplateGroupeRefPourGenererParTemplate);
    public List<GenTemplateGroupeRefPourGenererParTemplate> getGenTemplateGroupeRefPourGenererParTemplates();
    public void setGenTemplateGroupeRefPourGenererParTemplates(List<GenTemplateGroupeRefPourGenererParTemplate> genTemplateGroupeRefPourGenererParTemplate);
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	
}
