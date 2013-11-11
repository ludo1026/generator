package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenStereotypesClasseRef {
	
	/** Récupération de l'élément parent */
	
	public GenClasse getReferenceGenClasse();
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse);
	
	/** Récupération des éléments fils */
	
    public GenStereotypeClasse getGenStereotypeClasseByNom(String Nom);
    public void addGenStereotypeClasse(GenStereotypeClasse genStereotypeClasse);
    public List<GenStereotypeClasse> getListeGenStereotypeClasse();
    public void setListeGenStereotypeClasse(List<GenStereotypeClasse> listeGenStereotypeClasse);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
