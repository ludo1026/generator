package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenStereotypeRefPourGenererParTemplate 
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	public GenStereotypeRefPourGenererParTemplates getReferenceGenStereotypeRefPourGenererParTemplates();
	
	public void setReferenceGenStereotypeRefPourGenererParTemplates(GenStereotypeRefPourGenererParTemplates referenceGenStereotypeRefPourGenererParTemplates);
	
	/** R�cup�ration des �l�ments fils */
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	public String getStereotypeNomAsString();
	public void setStereotypeNomAsString(String stereotypeNomAsString);
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	

	public String getStereotypeNom();
	public void setStereotypeNom(String stereotypeNom);
}
