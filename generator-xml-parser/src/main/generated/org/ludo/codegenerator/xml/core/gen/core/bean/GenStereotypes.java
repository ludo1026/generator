package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenStereotypes 
	extends List<GenStereotype>
{
	
	/** Récupération de l'élément parent */
	
	public Gen getReferenceGen();
	
	public void setReferenceGen(Gen referenceGen);
	
	/** Récupération des éléments fils */
	
    public GenStereotype getGenStereotypeForNom(String nom);
    public List<GenStereotype> getGenStereotypesByNom(String nom);
    public void addGenStereotype(GenStereotype genStereotype);
    public List<GenStereotype> getGenStereotypes();
    public void setGenStereotypes(List<GenStereotype> genStereotype);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
