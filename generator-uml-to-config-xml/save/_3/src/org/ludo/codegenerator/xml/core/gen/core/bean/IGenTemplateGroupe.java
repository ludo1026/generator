package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenTemplateGroupe {
	
	/** Récupération de l'élément parent */
	
	public GenTemplateGroupes getReferenceGenTemplateGroupes();
	
	public void setReferenceGenTemplateGroupes(GenTemplateGroupes referenceGenTemplateGroupes);
	
	/** Récupération des éléments fils */
	
    public GenTemplateRef getGenTemplateRefByNom(String nom);
    public void addGenTemplateRef(GenTemplateRef genTemplateRef);
    public List getListeGenTemplateRef();
    public void setListeGenTemplateRef(List listeGenTemplateRef);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	public String getNomAsString();
	public void setNomAsString(String nomAsString);
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	public String getNom();
	public void setNom(String nom);
}
