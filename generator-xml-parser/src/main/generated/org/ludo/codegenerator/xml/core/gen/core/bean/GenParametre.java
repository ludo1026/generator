package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenParametre 
{
	
	/** Récupération de l'élément parent */
	
	public GenParametres getReferenceGenParametres();
	
	public void setReferenceGenParametres(GenParametres referenceGenParametres);
	
	/** Récupération des éléments fils */
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	public String getGenIdAsString();
	public void setGenIdAsString(String genIdAsString);
	
	public String getNomJavaAsString();
	public void setNomJavaAsString(String nomJavaAsString);
	
	public String getTypeAsString();
	public void setTypeAsString(String typeAsString);
	
	public String getDescriptionAsString();
	public void setDescriptionAsString(String descriptionAsString);
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	public String getGenId();
	public void setGenId(String genId);

	public String getNomJava();
	public void setNomJava(String nomJava);

	public String getType();
	public void setType(String type);

	public String getDescription();
	public void setDescription(String description);
}
