package org.ludo.codegenerator.xml.core.gen.core.bean;


public interface GenClasseParent {
	
	/** Récupération de l'élément parent */
	
	public GenClasseParents getReferenceGenClasseParents();
	
	public void setReferenceGenClasseParents(GenClasseParents referenceGenClasseParents);
	
	/** Récupération des éléments fils */
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	public String getClasseGenIdAsString();
	public void setClasseGenIdAsString(String classeGenIdAsString);
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	public String getClasseGenId();
	public void setClasseGenId(String classeGenId);
}
