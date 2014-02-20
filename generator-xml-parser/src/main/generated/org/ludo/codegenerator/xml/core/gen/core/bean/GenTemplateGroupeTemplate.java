package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenTemplateGroupeTemplate 
{
	
	/** Récupération de l'élément parent */
	
	public GenTemplateGroupe getReferenceGenTemplateGroupe();
	
	public void setReferenceGenTemplateGroupe(GenTemplateGroupe referenceGenTemplateGroupe);
	
	/** Récupération des éléments fils */

	public String getNom();
	public void setNom(String nom);
}
