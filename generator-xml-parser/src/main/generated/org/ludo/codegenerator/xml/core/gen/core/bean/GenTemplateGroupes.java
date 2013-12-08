package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenTemplateGroupes 
	extends List<GenTemplateGroupe>
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	public Gen getReferenceGen();
	
	public void setReferenceGen(Gen referenceGen);
	
	/** R�cup�ration des �l�ments fils */
	
    public GenTemplateGroupe getGenTemplateGroupeForNom(String nom);
    public void addGenTemplateGroupe(GenTemplateGroupe genTemplateGroupe);
    public List<GenTemplateGroupe> getGenTemplateGroupes();
    public void setGenTemplateGroupes(List<GenTemplateGroupe> genTemplateGroupe);
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	
}
