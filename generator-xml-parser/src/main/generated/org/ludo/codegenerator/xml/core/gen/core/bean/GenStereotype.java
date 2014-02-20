package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenStereotype 
{
	
	/** Récupération de l'élément parent */
	
	public GenStereotypes getReferenceGenStereotypes();
	
	public void setReferenceGenStereotypes(GenStereotypes referenceGenStereotypes);
	
	/** Récupération des éléments fils */

	public String getNom();
	public void setNom(String nom);
}
