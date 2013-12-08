package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenTemplateGroupeRefPourGenererParStereotypes 
	extends List<GenTemplateGroupeRefPourGenererParStereotype>
{
	
	/** Récupération de l'élément parent */
	
	public GenStereotypeRefPourGenererParStereotype getReferenceGenStereotypeRefPourGenererParStereotype();
	
	public void setReferenceGenStereotypeRefPourGenererParStereotype(GenStereotypeRefPourGenererParStereotype referenceGenStereotypeRefPourGenererParStereotype);
	
	/** Récupération des éléments fils */
	
    public GenTemplateGroupeRefPourGenererParStereotype getGenTemplateGroupeRefPourGenererParStereotypeForTemplateGroupeNom(String templateGroupeNom);
    public void addGenTemplateGroupeRefPourGenererParStereotype(GenTemplateGroupeRefPourGenererParStereotype genTemplateGroupeRefPourGenererParStereotype);
    public List<GenTemplateGroupeRefPourGenererParStereotype> getGenTemplateGroupeRefPourGenererParStereotypes();
    public void setGenTemplateGroupeRefPourGenererParStereotypes(List<GenTemplateGroupeRefPourGenererParStereotype> genTemplateGroupeRefPourGenererParStereotype);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
