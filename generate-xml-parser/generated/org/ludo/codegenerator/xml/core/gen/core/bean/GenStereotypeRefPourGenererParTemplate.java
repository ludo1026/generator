package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenStereotypeRefPourGenererParTemplate 
{
	
	/** Récupération de l'élément parent */
	
	public GenStereotypeRefPourGenererParTemplates getReferenceGenStereotypeRefPourGenererParTemplates();
	
	public void setReferenceGenStereotypeRefPourGenererParTemplates(GenStereotypeRefPourGenererParTemplates referenceGenStereotypeRefPourGenererParTemplates);
	
	/** Récupération des éléments fils */
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	public String getStereotypeNomAsString();
	public void setStereotypeNomAsString(String stereotypeNomAsString);
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	public String getStereotypeNom();
	public void setStereotypeNom(String stereotypeNom);
}
