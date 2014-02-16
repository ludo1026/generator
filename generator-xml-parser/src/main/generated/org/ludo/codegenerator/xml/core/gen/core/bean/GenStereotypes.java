package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenStereotypes 
	extends List<GenStereotype>
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	public Gen getReferenceGen();
	
	public void setReferenceGen(Gen referenceGen);
	
	/** R�cup�ration des �l�ments fils */
	
    public GenStereotype getGenStereotypeForNom(String nom);
    public List<GenStereotype> getGenStereotypesByNom(String nom);
    public void addGenStereotype(GenStereotype genStereotype);
    public List<GenStereotype> getGenStereotypes();
    public void setGenStereotypes(List<GenStereotype> genStereotype);
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	
}
