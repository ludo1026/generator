package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenTemplateGroupeRefPourGenererParClasses 
	extends List<GenTemplateGroupeRefPourGenererParClasse>
{
	
	/** Récupération de l'élément parent */
	
	public GenGenererParClasse getReferenceGenGenererParClasse();
	
	public void setReferenceGenGenererParClasse(GenGenererParClasse referenceGenGenererParClasse);
	
	/** Récupération des éléments fils */
	
    public GenTemplateGroupeRefPourGenererParClasse getGenTemplateGroupeRefPourGenererParClasseForTemplateGroupeNom(String templateGroupeNom);
    public void addGenTemplateGroupeRefPourGenererParClasse(GenTemplateGroupeRefPourGenererParClasse genTemplateGroupeRefPourGenererParClasse);
    public List<GenTemplateGroupeRefPourGenererParClasse> getGenTemplateGroupeRefPourGenererParClasses();
    public void setGenTemplateGroupeRefPourGenererParClasses(List<GenTemplateGroupeRefPourGenererParClasse> genTemplateGroupeRefPourGenererParClasse);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
