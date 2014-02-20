package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenClasseAssociationClasseDeAssociation 
{
	
	/** Récupération de l'élément parent */
	
	public GenClasseAssociation getReferenceGenClasseAssociation();
	
	public void setReferenceGenClasseAssociation(GenClasseAssociation referenceGenClasseAssociation);
	
	/** Récupération des éléments fils */

	public String get_type();
	public void set_type(String _type);
}
