package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenClasseAssociationClasseDeAssociation 
{
	
	/** Récupération de l'élément parent */
	
	public GenClasseAssociation getReferenceGenClasseAssociation();
	
	public void setReferenceGenClasseAssociation(GenClasseAssociation referenceGenClasseAssociation);
	
	/** Récupération des éléments fils */
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	public String get_typeAsString();
	public void set_typeAsString(String _typeAsString);
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	public String get_type();
	public void set_type(String _type);
}
