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

	public String getClasseGenId();
	public void setClasseGenId(String classeGenId);
}
