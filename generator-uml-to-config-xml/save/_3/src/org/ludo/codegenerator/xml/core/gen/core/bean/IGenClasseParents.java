package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenClasseParents {
	
	/** Récupération de l'élément parent */
	
	public GenClasse getReferenceGenClasse();
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse);
	
	/** Récupération des éléments fils */
	
    public GenClasseParent getGenClasseParentByClasseGenId(String classeGenId);
    public void addGenClasseParent(GenClasseParent genClasseParent);
    public List getListeGenClasseParent();
    public void setListeGenClasseParent(List listeGenClasseParent);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
