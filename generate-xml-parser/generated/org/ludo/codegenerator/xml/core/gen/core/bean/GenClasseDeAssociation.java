package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenClasseDeAssociation 
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	public GenAssociation getReferenceGenAssociation();
	
	public void setReferenceGenAssociation(GenAssociation referenceGenAssociation);
	
	/** R�cup�ration des �l�ments fils */
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	public String get_typeAsString();
	public void set_typeAsString(String _typeAsString);
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	

	public String get_type();
	public void set_type(String _type);
}
