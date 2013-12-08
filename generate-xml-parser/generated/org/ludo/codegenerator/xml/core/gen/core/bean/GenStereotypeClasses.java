package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenStereotypeClasses 
	extends List<GenStereotypeClasse>
{
	
	/** Récupération de l'élément parent */
	
	public GenClasse getReferenceGenClasse();
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse);
	
	/** Récupération des éléments fils */
	
    public GenStereotypeClasse getGenStereotypeClasseForNom(String nom);
    public void addGenStereotypeClasse(GenStereotypeClasse genStereotypeClasse);
    public List<GenStereotypeClasse> getGenStereotypeClasses();
    public void setGenStereotypeClasses(List<GenStereotypeClasse> genStereotypeClasse);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
