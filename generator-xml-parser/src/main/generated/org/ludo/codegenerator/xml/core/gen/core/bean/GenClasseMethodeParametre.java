package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenClasseMethodeParametre 
{
	
	/** Récupération de l'élément parent */
	
	public GenClasseMethode getReferenceGenClasseMethode();
	
	public void setReferenceGenClasseMethode(GenClasseMethode referenceGenClasseMethode);
	
	/** Récupération des éléments fils */

	public String getGenId();
	public void setGenId(String genId);

	public String getNomJava();
	public void setNomJava(String nomJava);

	public String getType();
	public void setType(String type);

	public String getDescription();
	public void setDescription(String description);
}
