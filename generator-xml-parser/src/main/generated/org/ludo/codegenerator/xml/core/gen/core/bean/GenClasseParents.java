package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenClasseParents 
	extends List<GenClasseParent>
{
	
	/** Récupération de l'élément parent */
	
	public GenClasse getReferenceGenClasse();
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse);
	
	/** Récupération des éléments fils */
	
    public GenClasseParent getGenClasseParentForClasseGenId(String classeGenId);
    public List<GenClasseParent> getGenClasseParentsByClasseGenId(String classeGenId);
    public void addGenClasseParent(GenClasseParent genClasseParent);
    public List<GenClasseParent> getGenClasseParents();
    public void setGenClasseParents(List<GenClasseParent> genClasseParent);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
