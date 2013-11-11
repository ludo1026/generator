package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenTemplateGroupes {
	
	/** Récupération de l'élément parent */
	
	public Gen getReferenceGen();
	
	public void setReferenceGen(Gen referenceGen);
	
	/** Récupération des éléments fils */
	
    public GenTemplateGroupe getGenTemplateGroupeByNom(String nom);
    public void addGenTemplateGroupe(GenTemplateGroupe genTemplateGroupe);
    public List getListeGenTemplateGroupe();
    public void setListeGenTemplateGroupe(List listeGenTemplateGroupe);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
