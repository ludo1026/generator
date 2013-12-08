package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenParametre 
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	public GenParametres getReferenceGenParametres();
	
	public void setReferenceGenParametres(GenParametres referenceGenParametres);
	
	/** R�cup�ration des �l�ments fils */
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	public String getGenIdAsString();
	public void setGenIdAsString(String genIdAsString);
	
	public String getNomJavaAsString();
	public void setNomJavaAsString(String nomJavaAsString);
	
	public String getTypeAsString();
	public void setTypeAsString(String typeAsString);
	
	public String getDescriptionAsString();
	public void setDescriptionAsString(String descriptionAsString);
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	

	public String getGenId();
	public void setGenId(String genId);

	public String getNomJava();
	public void setNomJava(String nomJava);

	public String getType();
	public void setType(String type);

	public String getDescription();
	public void setDescription(String description);
}
