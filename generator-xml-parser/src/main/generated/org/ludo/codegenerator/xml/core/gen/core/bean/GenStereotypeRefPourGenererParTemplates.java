package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenStereotypeRefPourGenererParTemplates 
	extends List<GenStereotypeRefPourGenererParTemplate>
{
	
	/** Récupération de l'élément parent */
	
	public GenTemplateGroupeRefPourGenererParTemplate getReferenceGenTemplateGroupeRefPourGenererParTemplate();
	
	public void setReferenceGenTemplateGroupeRefPourGenererParTemplate(GenTemplateGroupeRefPourGenererParTemplate referenceGenTemplateGroupeRefPourGenererParTemplate);
	
	/** Récupération des éléments fils */
	
    public GenStereotypeRefPourGenererParTemplate getGenStereotypeRefPourGenererParTemplateForStereotypeNom(String stereotypeNom);
    public void addGenStereotypeRefPourGenererParTemplate(GenStereotypeRefPourGenererParTemplate genStereotypeRefPourGenererParTemplate);
    public List<GenStereotypeRefPourGenererParTemplate> getGenStereotypeRefPourGenererParTemplates();
    public void setGenStereotypeRefPourGenererParTemplates(List<GenStereotypeRefPourGenererParTemplate> genStereotypeRefPourGenererParTemplate);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
