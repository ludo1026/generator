package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenClasseStereotype 
{
	
	/** Récupération de l'élément parent */
	
	public GenClasse getReferenceGenClasse();
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse);
	
	/** Récupération des éléments fils */

	public String getNom();
	public void setNom(String nom);
}
