package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenClasseParent 
{
	
	/** Récupération de l'élément parent */
	
	public GenClasse getReferenceGenClasse();
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse);
	
	/** Récupération des éléments fils */
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	public String getClasseGenIdAsString();
	public void setClasseGenIdAsString(String classeGenIdAsString);
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	public String getClasseGenId();
	public void setClasseGenId(String classeGenId);
}
