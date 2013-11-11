package org.ludo.codegenerator.xml.core.gen.core.bean;


public interface GenStereotypeRef {
	
	/** Récupération de l'élément parent */
	
	public GenStereotypesRef getReferenceGenStereotypesRef();
	
	public void setReferenceGenStereotypesRef(GenStereotypesRef referenceGenStereotypesRef);
	
	/** Récupération des éléments fils */
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	public String getStereotypeNomAsString();
	public void setStereotypeNomAsString(String stereotypeNomAsString);
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	public String getStereotypeNom();
	public void setStereotypeNom(String stereotypeNom);
}
