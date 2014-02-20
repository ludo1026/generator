package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenTemplateGroupe 
	extends List<GenTemplateGroupeTemplate>
{
	
	/** Récupération de l'élément parent */
	
	public GenTemplateGroupes getReferenceGenTemplateGroupes();
	
	public void setReferenceGenTemplateGroupes(GenTemplateGroupes referenceGenTemplateGroupes);
	
	/** Récupération des éléments fils */
	
    public GenTemplateGroupeTemplate getGenTemplateGroupeTemplateForNom(String nom);
    public List<GenTemplateGroupeTemplate> getGenTemplateGroupeTemplatesByNom(String nom);
    public void addGenTemplateGroupeTemplate(GenTemplateGroupeTemplate genTemplateGroupeTemplate);
    public List<GenTemplateGroupeTemplate> getGenTemplateGroupeTemplates();
    public void setGenTemplateGroupeTemplates(List<GenTemplateGroupeTemplate> genTemplateGroupeTemplate);

	public String getNom();
	public void setNom(String nom);
}
