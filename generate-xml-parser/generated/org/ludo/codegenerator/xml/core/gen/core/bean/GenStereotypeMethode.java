package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenStereotypeMethode 
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	public GenStereotypeMethodes getReferenceGenStereotypeMethodes();
	
	public void setReferenceGenStereotypeMethodes(GenStereotypeMethodes referenceGenStereotypeMethodes);
	
	/** R�cup�ration des �l�ments fils */
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	public String getNomAsString();
	public void setNomAsString(String nomAsString);
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	

	public String getNom();
	public void setNom(String nom);
}
