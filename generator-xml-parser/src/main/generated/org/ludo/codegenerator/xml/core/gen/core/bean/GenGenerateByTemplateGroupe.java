package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenGenerateByTemplateGroupe 
	extends List<GenGenerateByTemplateGroupeStereotype>
{
	
	/** Récupération de l'élément parent */
	
	public GenGenerate getReferenceGenGenerate();
	
	public void setReferenceGenGenerate(GenGenerate referenceGenGenerate);
	
	/** Récupération des éléments fils */
	
    public GenGenerateByTemplateGroupeStereotype getGenGenerateByTemplateGroupeStereotypeForStereotype(String stereotype);
    public List<GenGenerateByTemplateGroupeStereotype> getGenGenerateByTemplateGroupeStereotypesByStereotype(String stereotype);
    public void addGenGenerateByTemplateGroupeStereotype(GenGenerateByTemplateGroupeStereotype genGenerateByTemplateGroupeStereotype);
    public List<GenGenerateByTemplateGroupeStereotype> getGenGenerateByTemplateGroupeStereotypes();
    public void setGenGenerateByTemplateGroupeStereotypes(List<GenGenerateByTemplateGroupeStereotype> genGenerateByTemplateGroupeStereotype);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	public String getTemplateGroupeAsString();
	public void setTemplateGroupeAsString(String templateGroupeAsString);
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	public String getTemplateGroupe();
	public void setTemplateGroupe(String templateGroupe);
}
