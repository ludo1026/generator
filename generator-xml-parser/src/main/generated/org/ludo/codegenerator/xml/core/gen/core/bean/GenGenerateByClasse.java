package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenGenerateByClasse 
	extends List<GenGenerateByClasseTemplateGroupe>
{
	
	/** Récupération de l'élément parent */
	
	public GenGenerate getReferenceGenGenerate();
	
	public void setReferenceGenGenerate(GenGenerate referenceGenGenerate);
	
	/** Récupération des éléments fils */
	
    public GenGenerateByClasseTemplateGroupe getGenGenerateByClasseTemplateGroupeForTemplateGroupe(String templateGroupe);
    public List<GenGenerateByClasseTemplateGroupe> getGenGenerateByClasseTemplateGroupesByTemplateGroupe(String templateGroupe);
    public void addGenGenerateByClasseTemplateGroupe(GenGenerateByClasseTemplateGroupe genGenerateByClasseTemplateGroupe);
    public List<GenGenerateByClasseTemplateGroupe> getGenGenerateByClasseTemplateGroupes();
    public void setGenGenerateByClasseTemplateGroupes(List<GenGenerateByClasseTemplateGroupe> genGenerateByClasseTemplateGroupe);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	public String getClasseGenIdAsString();
	public void setClasseGenIdAsString(String classeGenIdAsString);
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	public String getClasseGenId();
	public void setClasseGenId(String classeGenId);
}
