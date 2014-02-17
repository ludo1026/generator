package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenGenerateByClasseTemplateGroupe 
{
	
	/** Récupération de l'élément parent */
	
	public GenGenerateByClasse getReferenceGenGenerateByClasse();
	
	public void setReferenceGenGenerateByClasse(GenGenerateByClasse referenceGenGenerateByClasse);
	
	/** Récupération des éléments fils */
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	public String getTemplateGroupeAsString();
	public void setTemplateGroupeAsString(String templateGroupeAsString);
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	public String getTemplateGroupe();
	public void setTemplateGroupe(String templateGroupe);
}
