package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenStereotypeRefPourGenererParTemplates 
	extends List<GenStereotypeRefPourGenererParTemplate>
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	public GenTemplateGroupeRefPourGenererParTemplate getReferenceGenTemplateGroupeRefPourGenererParTemplate();
	
	public void setReferenceGenTemplateGroupeRefPourGenererParTemplate(GenTemplateGroupeRefPourGenererParTemplate referenceGenTemplateGroupeRefPourGenererParTemplate);
	
	/** R�cup�ration des �l�ments fils */
	
    public GenStereotypeRefPourGenererParTemplate getGenStereotypeRefPourGenererParTemplateForStereotypeNom(String stereotypeNom);
    public void addGenStereotypeRefPourGenererParTemplate(GenStereotypeRefPourGenererParTemplate genStereotypeRefPourGenererParTemplate);
    public List<GenStereotypeRefPourGenererParTemplate> getGenStereotypeRefPourGenererParTemplates();
    public void setGenStereotypeRefPourGenererParTemplates(List<GenStereotypeRefPourGenererParTemplate> genStereotypeRefPourGenererParTemplate);
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	
}
