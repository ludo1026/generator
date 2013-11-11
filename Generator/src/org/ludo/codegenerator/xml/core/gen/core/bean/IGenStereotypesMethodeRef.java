package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenStereotypesMethodeRef {
	
	/** Récupération de l'élément parent */
	
	public GenMethode getReferenceGenMethode();
	
	public void setReferenceGenMethode(GenMethode referenceGenMethode);
	
	/** Récupération des éléments fils */
	
    public GenStereotypeMethode getGenStereotypeMethodeByNom(String Nom);
    public void addGenStereotypeMethode(GenStereotypeMethode genStereotypeMethode);
    public List<GenStereotypeMethode> getListeGenStereotypeMethode();
    public void setListeGenStereotypeMethode(List<GenStereotypeMethode> listeGenStereotypeMethode);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
