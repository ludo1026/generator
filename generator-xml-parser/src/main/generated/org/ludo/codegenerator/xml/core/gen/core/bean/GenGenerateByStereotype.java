package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenGenerateByStereotype 
	extends List<GenGenerateByStereotypeTemplateGroupe>
{
	
	/** Récupération de l'élément parent */
	
	public GenGenerate getReferenceGenGenerate();
	
	public void setReferenceGenGenerate(GenGenerate referenceGenGenerate);
	
	/** Récupération des éléments fils */
	
    public GenGenerateByStereotypeTemplateGroupe getGenGenerateByStereotypeTemplateGroupeForTemplateGroupe(String templateGroupe);
    public List<GenGenerateByStereotypeTemplateGroupe> getGenGenerateByStereotypeTemplateGroupesByTemplateGroupe(String templateGroupe);
    public void addGenGenerateByStereotypeTemplateGroupe(GenGenerateByStereotypeTemplateGroupe genGenerateByStereotypeTemplateGroupe);
    public List<GenGenerateByStereotypeTemplateGroupe> getGenGenerateByStereotypeTemplateGroupes();
    public void setGenGenerateByStereotypeTemplateGroupes(List<GenGenerateByStereotypeTemplateGroupe> genGenerateByStereotypeTemplateGroupe);

	public String getStereotype();
	public void setStereotype(String stereotype);
}
