package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenClasseDeAssociation 
{
	
	/** Récupération de l'élément parent */
	
	public GenAssociation getReferenceGenAssociation();
	
	public void setReferenceGenAssociation(GenAssociation referenceGenAssociation);
	
	/** Récupération des éléments fils */
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	public String get_typeAsString();
	public void set_typeAsString(String _typeAsString);
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	public String get_type();
	public void set_type(String _type);
}
