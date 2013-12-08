package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenGenererParStereotype 
{
	
	/** Récupération de l'élément parent */
	
	public GenGenererParStereotypes getReferenceGenGenererParStereotypes();
	
	public void setReferenceGenGenererParStereotypes(GenGenererParStereotypes referenceGenGenererParStereotypes);
	
	/** Récupération des éléments fils */

    public GenStereotypeRefPourGenererParStereotypes getGenStereotypeRefPourGenererParStereotypes();
    
    public void setGenStereotypeRefPourGenererParStereotypes(GenStereotypeRefPourGenererParStereotypes genStereotypeRefPourGenererParStereotypes);
	
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
