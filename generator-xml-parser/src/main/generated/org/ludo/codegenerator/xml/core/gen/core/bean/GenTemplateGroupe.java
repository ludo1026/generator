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
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	public String getNomAsString();
	public void setNomAsString(String nomAsString);
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	public String getNom();
	public void setNom(String nom);
}
