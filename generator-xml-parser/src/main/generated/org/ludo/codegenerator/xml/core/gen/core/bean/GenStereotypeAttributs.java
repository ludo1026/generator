package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenStereotypeAttributs 
	extends List<GenStereotypeAttribut>
{
	
	/** Récupération de l'élément parent */
	
	public GenAttribut getReferenceGenAttribut();
	
	public void setReferenceGenAttribut(GenAttribut referenceGenAttribut);
	
	/** Récupération des éléments fils */
	
    public GenStereotypeAttribut getGenStereotypeAttributForNom(String nom);
    public void addGenStereotypeAttribut(GenStereotypeAttribut genStereotypeAttribut);
    public List<GenStereotypeAttribut> getGenStereotypeAttributs();
    public void setGenStereotypeAttributs(List<GenStereotypeAttribut> genStereotypeAttribut);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
