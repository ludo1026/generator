package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface IGenAttributAssociation {
	
	/** Récupération de l'élément parent */
	
	public IGenAssociation getReferenceGenAssociation();
	
	public void setReferenceGenAssociation(IGenAssociation referenceGenAssociation);
	
	/** Récupération des éléments fils */
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	public String getGenIdAsString();
	public void setGenIdAsString(String genIdAsString);
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	public String getGenId();
	public void setGenId(String genId);
}
