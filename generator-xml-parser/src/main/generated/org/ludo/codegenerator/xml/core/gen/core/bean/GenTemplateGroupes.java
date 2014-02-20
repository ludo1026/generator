package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenTemplateGroupes 
	extends List<GenTemplateGroupe>
{
	
	/** Récupération de l'élément parent */
	
	public Gen getReferenceGen();
	
	public void setReferenceGen(Gen referenceGen);
	
	/** Récupération des éléments fils */
	
    public GenTemplateGroupe getGenTemplateGroupeForNom(String nom);
    public List<GenTemplateGroupe> getGenTemplateGroupesByNom(String nom);
    public void addGenTemplateGroupe(GenTemplateGroupe genTemplateGroupe);
    public List<GenTemplateGroupe> getGenTemplateGroupes();
    public void setGenTemplateGroupes(List<GenTemplateGroupe> genTemplateGroupe);
}
