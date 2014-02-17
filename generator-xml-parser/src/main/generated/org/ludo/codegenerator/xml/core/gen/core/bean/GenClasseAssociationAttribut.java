package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenClasseAssociationAttribut 
{
	
	/** Récupération de l'élément parent */
	
	public GenClasseAssociation getReferenceGenClasseAssociation();
	
	public void setReferenceGenClasseAssociation(GenClasseAssociation referenceGenClasseAssociation);
	
	/** Récupération des éléments fils */
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	public String getGenIdAsString();
	public void setGenIdAsString(String genIdAsString);
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	public String getGenId();
	public void setGenId(String genId);
}
