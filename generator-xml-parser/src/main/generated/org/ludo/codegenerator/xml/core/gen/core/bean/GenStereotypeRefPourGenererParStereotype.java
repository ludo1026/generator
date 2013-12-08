package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenStereotypeRefPourGenererParStereotype 
{
	
	/** Récupération de l'élément parent */
	
	public GenStereotypeRefPourGenererParStereotypes getReferenceGenStereotypeRefPourGenererParStereotypes();
	
	public void setReferenceGenStereotypeRefPourGenererParStereotypes(GenStereotypeRefPourGenererParStereotypes referenceGenStereotypeRefPourGenererParStereotypes);
	
	/** Récupération des éléments fils */

    public GenTemplateGroupeRefPourGenererParStereotypes getGenTemplateGroupeRefPourGenererParStereotypes();
    
    public void setGenTemplateGroupeRefPourGenererParStereotypes(GenTemplateGroupeRefPourGenererParStereotypes genTemplateGroupeRefPourGenererParStereotypes);
	
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	public String getStereotypeNomAsString();
	public void setStereotypeNomAsString(String stereotypeNomAsString);
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	public String getStereotypeNom();
	public void setStereotypeNom(String stereotypeNom);
}
