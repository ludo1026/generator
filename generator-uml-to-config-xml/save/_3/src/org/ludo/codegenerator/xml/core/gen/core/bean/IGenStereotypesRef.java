package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenStereotypesRef {
	
	/** Récupération de l'élément parent */
	
	public GenClasse getReferenceGenClasse();
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse);
	
	/** Récupération des éléments fils */
	
    public GenStereotypeRef getGenStereotypeRefByStereotypeNom(String stereotypeNom);
    public void addGenStereotypeRef(GenStereotypeRef genStereotypeRef);
    public List getListeGenStereotypeRef();
    public void setListeGenStereotypeRef(List listeGenStereotypeRef);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
