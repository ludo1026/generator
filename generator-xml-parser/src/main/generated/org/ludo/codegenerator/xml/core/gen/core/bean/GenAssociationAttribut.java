package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenAssociationAttribut 
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	public GenAssociationAttributs getReferenceGenAssociationAttributs();
	
	public void setReferenceGenAssociationAttributs(GenAssociationAttributs referenceGenAssociationAttributs);
	
	/** R�cup�ration des �l�ments fils */
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	public String getGenIdAsString();
	public void setGenIdAsString(String genIdAsString);
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	

	public String getGenId();
	public void setGenId(String genId);
}
