package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenTemplateGroupeRefPourGenererParStereotypes 
	extends List<GenTemplateGroupeRefPourGenererParStereotype>
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	public GenStereotypeRefPourGenererParStereotype getReferenceGenStereotypeRefPourGenererParStereotype();
	
	public void setReferenceGenStereotypeRefPourGenererParStereotype(GenStereotypeRefPourGenererParStereotype referenceGenStereotypeRefPourGenererParStereotype);
	
	/** R�cup�ration des �l�ments fils */
	
    public GenTemplateGroupeRefPourGenererParStereotype getGenTemplateGroupeRefPourGenererParStereotypeForTemplateGroupeNom(String templateGroupeNom);
    public void addGenTemplateGroupeRefPourGenererParStereotype(GenTemplateGroupeRefPourGenererParStereotype genTemplateGroupeRefPourGenererParStereotype);
    public List<GenTemplateGroupeRefPourGenererParStereotype> getGenTemplateGroupeRefPourGenererParStereotypes();
    public void setGenTemplateGroupeRefPourGenererParStereotypes(List<GenTemplateGroupeRefPourGenererParStereotype> genTemplateGroupeRefPourGenererParStereotype);
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	
}
