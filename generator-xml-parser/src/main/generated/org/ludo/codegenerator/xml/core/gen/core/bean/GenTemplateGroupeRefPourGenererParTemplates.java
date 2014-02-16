package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenTemplateGroupeRefPourGenererParTemplates 
	extends List<GenTemplateGroupeRefPourGenererParTemplate>
{
	
	/** Récupération de l'élément parent */
	
	public GenGenererParTemplate getReferenceGenGenererParTemplate();
	
	public void setReferenceGenGenererParTemplate(GenGenererParTemplate referenceGenGenererParTemplate);
	
	/** Récupération des éléments fils */
	
    public GenTemplateGroupeRefPourGenererParTemplate getGenTemplateGroupeRefPourGenererParTemplateForTemplateGroupeNom(String templateGroupeNom);
    public List<GenTemplateGroupeRefPourGenererParTemplate> getGenTemplateGroupeRefPourGenererParTemplatesByTemplateGroupeNom(String templateGroupeNom);
    public void addGenTemplateGroupeRefPourGenererParTemplate(GenTemplateGroupeRefPourGenererParTemplate genTemplateGroupeRefPourGenererParTemplate);
    public List<GenTemplateGroupeRefPourGenererParTemplate> getGenTemplateGroupeRefPourGenererParTemplates();
    public void setGenTemplateGroupeRefPourGenererParTemplates(List<GenTemplateGroupeRefPourGenererParTemplate> genTemplateGroupeRefPourGenererParTemplate);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
