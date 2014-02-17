package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenGenerateByStereotype 
	extends List<GenGenerateByStereotypeTemplateGroup>
{
	
	/** Récupération de l'élément parent */
	
	public GenGenerate getReferenceGenGenerate();
	
	public void setReferenceGenGenerate(GenGenerate referenceGenGenerate);
	
	/** Récupération des éléments fils */
	
    public GenGenerateByStereotypeTemplateGroup getGenGenerateByStereotypeTemplateGroupForTemplateGroup(String templateGroup);
    public List<GenGenerateByStereotypeTemplateGroup> getGenGenerateByStereotypeTemplateGroupsByTemplateGroup(String templateGroup);
    public void addGenGenerateByStereotypeTemplateGroup(GenGenerateByStereotypeTemplateGroup genGenerateByStereotypeTemplateGroup);
    public List<GenGenerateByStereotypeTemplateGroup> getGenGenerateByStereotypeTemplateGroups();
    public void setGenGenerateByStereotypeTemplateGroups(List<GenGenerateByStereotypeTemplateGroup> genGenerateByStereotypeTemplateGroup);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	public String getStereotypeAsString();
	public void setStereotypeAsString(String stereotypeAsString);
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	public String getStereotype();
	public void setStereotype(String stereotype);
}
