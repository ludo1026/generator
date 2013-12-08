package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenStereotypeClasses 
	extends List<GenStereotypeClasse>
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	public GenClasse getReferenceGenClasse();
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse);
	
	/** R�cup�ration des �l�ments fils */
	
    public GenStereotypeClasse getGenStereotypeClasseForNom(String nom);
    public void addGenStereotypeClasse(GenStereotypeClasse genStereotypeClasse);
    public List<GenStereotypeClasse> getGenStereotypeClasses();
    public void setGenStereotypeClasses(List<GenStereotypeClasse> genStereotypeClasse);
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	
}
