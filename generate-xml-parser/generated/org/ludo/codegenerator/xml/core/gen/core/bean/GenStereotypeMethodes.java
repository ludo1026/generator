package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenStereotypeMethodes 
	extends List<GenStereotypeMethode>
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	public GenMethode getReferenceGenMethode();
	
	public void setReferenceGenMethode(GenMethode referenceGenMethode);
	
	/** R�cup�ration des �l�ments fils */
	
    public GenStereotypeMethode getGenStereotypeMethodeForNom(String nom);
    public void addGenStereotypeMethode(GenStereotypeMethode genStereotypeMethode);
    public List<GenStereotypeMethode> getGenStereotypeMethodes();
    public void setGenStereotypeMethodes(List<GenStereotypeMethode> genStereotypeMethode);
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	
}
