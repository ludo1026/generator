package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenStereotypeAttributs 
	extends List<GenStereotypeAttribut>
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	public GenAttribut getReferenceGenAttribut();
	
	public void setReferenceGenAttribut(GenAttribut referenceGenAttribut);
	
	/** R�cup�ration des �l�ments fils */
	
    public GenStereotypeAttribut getGenStereotypeAttributForNom(String nom);
    public void addGenStereotypeAttribut(GenStereotypeAttribut genStereotypeAttribut);
    public List<GenStereotypeAttribut> getGenStereotypeAttributs();
    public void setGenStereotypeAttributs(List<GenStereotypeAttribut> genStereotypeAttribut);
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	
}
