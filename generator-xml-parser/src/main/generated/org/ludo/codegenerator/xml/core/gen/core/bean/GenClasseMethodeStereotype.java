package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenClasseMethodeStereotype 
{
	
	/** Récupération de l'élément parent */
	
	public GenClasseMethode getReferenceGenClasseMethode();
	
	public void setReferenceGenClasseMethode(GenClasseMethode referenceGenClasseMethode);
	
	/** Récupération des éléments fils */

	public String getNom();
	public void setNom(String nom);
}
