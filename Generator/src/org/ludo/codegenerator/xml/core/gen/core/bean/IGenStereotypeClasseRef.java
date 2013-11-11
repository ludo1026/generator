package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenStereotypeClasse {
	
	/** Récupération de l'élément parent */
	
	public GenStereotypesClasseRef getReferenceGenStereotypesClasseRef();
	
	public void setReferenceGenStereotypesClasseRef(GenStereotypesClasseRef referenceGenStereotypesClasseRef);
	
	/** Récupération des éléments fils */
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	public String getNomAsString();
	public void setNomAsString(String NomAsString);
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	public String getNom();
	public void setNom(String Nom);
}
