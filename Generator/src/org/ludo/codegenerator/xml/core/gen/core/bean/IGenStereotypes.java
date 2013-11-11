package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenStereotypes {
	
	/** Récupération de l'élément parent */
	
	public Gen getReferenceGen();
	
	public void setReferenceGen(Gen referenceGen);
	
	/** Récupération des éléments fils */
	
    public GenStereotype getGenStereotypeByNom(String nom);
    public void addGenStereotype(GenStereotype genStereotype);
    public List<GenStereotype> getListeGenStereotype();
    public void setListeGenStereotype(List<GenStereotype> listeGenStereotype);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
