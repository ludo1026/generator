package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenStereotypeMethode {
	
	/** Récupération de l'élément parent */
	
	public GenStereotypesMethodeRef getReferenceGenStereotypesMethodeRef();
	
	public void setReferenceGenStereotypesMethodeRef(GenStereotypesMethodeRef referenceGenStereotypesMethodeRef);
	
	/** Récupération des éléments fils */
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	public String getNomAsString();
	public void setNomAsString(String NomAsString);
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	public String getNom();
	public void setNom(String Nom);
}
