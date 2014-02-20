package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenGenerate 
{
	
	/** Récupération de l'élément parent */
	
	public Gen getReferenceGen();
	
	public void setReferenceGen(Gen referenceGen);
	
	/** Récupération des éléments fils */
	
    public GenGenerateByClasse getGenGenerateByClasseForClasseGenId(String classeGenId);
    public List<GenGenerateByClasse> getGenGenerateByClassesByClasseGenId(String classeGenId);
    public void addGenGenerateByClasse(GenGenerateByClasse genGenerateByClasse);
    public List<GenGenerateByClasse> getGenGenerateByClasses();
    public void setGenGenerateByClasses(List<GenGenerateByClasse> genGenerateByClasse);
	
    public GenGenerateByTemplateGroupe getGenGenerateByTemplateGroupeForTemplateGroupe(String templateGroupe);
    public List<GenGenerateByTemplateGroupe> getGenGenerateByTemplateGroupesByTemplateGroupe(String templateGroupe);
    public void addGenGenerateByTemplateGroupe(GenGenerateByTemplateGroupe genGenerateByTemplateGroupe);
    public List<GenGenerateByTemplateGroupe> getGenGenerateByTemplateGroupes();
    public void setGenGenerateByTemplateGroupes(List<GenGenerateByTemplateGroupe> genGenerateByTemplateGroupe);
	
    public GenGenerateByStereotype getGenGenerateByStereotypeForStereotype(String stereotype);
    public List<GenGenerateByStereotype> getGenGenerateByStereotypesByStereotype(String stereotype);
    public void addGenGenerateByStereotype(GenGenerateByStereotype genGenerateByStereotype);
    public List<GenGenerateByStereotype> getGenGenerateByStereotypes();
    public void setGenGenerateByStereotypes(List<GenGenerateByStereotype> genGenerateByStereotype);
}
