package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenGenererParStereotype 
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	public GenGenererParStereotypes getReferenceGenGenererParStereotypes();
	
	public void setReferenceGenGenererParStereotypes(GenGenererParStereotypes referenceGenGenererParStereotypes);
	
	/** R�cup�ration des �l�ments fils */

    public GenStereotypeRefPourGenererParStereotypes getGenStereotypeRefPourGenererParStereotypes();
    
    public void setGenStereotypeRefPourGenererParStereotypes(GenStereotypeRefPourGenererParStereotypes genStereotypeRefPourGenererParStereotypes);
	
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	
}
