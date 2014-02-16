package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenTemplateGroupe 
	extends List<GenTemplateRef>
{
	
	/** Récupération de l'élément parent */
	
	public GenTemplateGroupes getReferenceGenTemplateGroupes();
	
	public void setReferenceGenTemplateGroupes(GenTemplateGroupes referenceGenTemplateGroupes);
	
	/** Récupération des éléments fils */
	
    public GenTemplateRef getGenTemplateRefForNom(String nom);
    public List<GenTemplateRef> getGenTemplateRefsByNom(String nom);
    public void addGenTemplateRef(GenTemplateRef genTemplateRef);
    public List<GenTemplateRef> getGenTemplateRefs();
    public void setGenTemplateRefs(List<GenTemplateRef> genTemplateRef);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	public String getNomAsString();
	public void setNomAsString(String nomAsString);
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	public String getNom();
	public void setNom(String nom);
}
