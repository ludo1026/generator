package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenGenerateByClasseTemplateGroupe 
{
	
	/** Récupération de l'élément parent */
	
	public GenGenerateByClasse getReferenceGenGenerateByClasse();
	
	public void setReferenceGenGenerateByClasse(GenGenerateByClasse referenceGenGenerateByClasse);
	
	/** Récupération des éléments fils */

	public String getTemplateGroupe();
	public void setTemplateGroupe(String templateGroupe);
}
