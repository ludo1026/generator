package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenStereotypeRefPourGenererParStereotype 
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	public GenStereotypeRefPourGenererParStereotypes getReferenceGenStereotypeRefPourGenererParStereotypes();
	
	public void setReferenceGenStereotypeRefPourGenererParStereotypes(GenStereotypeRefPourGenererParStereotypes referenceGenStereotypeRefPourGenererParStereotypes);
	
	/** R�cup�ration des �l�ments fils */

    public GenTemplateGroupeRefPourGenererParStereotypes getGenTemplateGroupeRefPourGenererParStereotypes();
    
    public void setGenTemplateGroupeRefPourGenererParStereotypes(GenTemplateGroupeRefPourGenererParStereotypes genTemplateGroupeRefPourGenererParStereotypes);
	
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	public String getStereotypeNomAsString();
	public void setStereotypeNomAsString(String stereotypeNomAsString);
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	

	public String getStereotypeNom();
	public void setStereotypeNom(String stereotypeNom);
}
