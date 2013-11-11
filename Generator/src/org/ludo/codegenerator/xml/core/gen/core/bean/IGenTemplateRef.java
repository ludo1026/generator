package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenTemplateRef {
	
	/** Récupération de l'élément parent */
	
	public GenTemplateGroupe getReferenceGenTemplateGroupe();
	
	public void setReferenceGenTemplateGroupe(GenTemplateGroupe referenceGenTemplateGroupe);
	
	/** Récupération des éléments fils */
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	public String getNomAsString();
	public void setNomAsString(String nomAsString);
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	public String getNom();
	public void setNom(String nom);
}
