package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenStereotypeClasse 
{
	
	/** Récupération de l'élément parent */
	
	public GenStereotypeClasses getReferenceGenStereotypeClasses();
	
	public void setReferenceGenStereotypeClasses(GenStereotypeClasses referenceGenStereotypeClasses);
	
	/** Récupération des éléments fils */
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	public String getNomAsString();
	public void setNomAsString(String nomAsString);
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	public String getNom();
	public void setNom(String nom);
}
