package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenStereotypeMethodes 
	extends List<GenStereotypeMethode>
{
	
	/** Récupération de l'élément parent */
	
	public GenMethode getReferenceGenMethode();
	
	public void setReferenceGenMethode(GenMethode referenceGenMethode);
	
	/** Récupération des éléments fils */
	
    public GenStereotypeMethode getGenStereotypeMethodeForNom(String nom);
    public void addGenStereotypeMethode(GenStereotypeMethode genStereotypeMethode);
    public List<GenStereotypeMethode> getGenStereotypeMethodes();
    public void setGenStereotypeMethodes(List<GenStereotypeMethode> genStereotypeMethode);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
