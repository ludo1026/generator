package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenStereotypesAttributRef {
	
	/** Récupération de l'élément parent */
	
	public GenAttribut getReferenceGenAttribut();
	
	public void setReferenceGenAttribut(GenAttribut referenceGenAttribut);
	
	/** Récupération des éléments fils */
	
    public GenStereotypeAttribut getGenStereotypeAttributByNom(String Nom);
    public void addGenStereotypeAttribut(GenStereotypeAttribut genStereotypeAttribut);
    public List<GenStereotypeAttribut> getListeGenStereotypeAttribut();
    public void setListeGenStereotypeAttribut(List<GenStereotypeAttribut> listeGenStereotypeAttribut);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
