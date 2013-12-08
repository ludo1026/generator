package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenTemplateRef 
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	public GenTemplateGroupe getReferenceGenTemplateGroupe();
	
	public void setReferenceGenTemplateGroupe(GenTemplateGroupe referenceGenTemplateGroupe);
	
	/** R�cup�ration des �l�ments fils */
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	public String getNomAsString();
	public void setNomAsString(String nomAsString);
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	

	public String getNom();
	public void setNom(String nom);
}
