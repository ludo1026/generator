package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenGenererParClasses 
	extends List<GenGenererParClasse>
{
	
	/** Récupération de l'élément parent */
	
	public GenGenererGroupe getReferenceGenGenererGroupe();
	
	public void setReferenceGenGenererGroupe(GenGenererGroupe referenceGenGenererGroupe);
	
	/** Récupération des éléments fils */
	
    public void addGenGenererParClasse(GenGenererParClasse genGenererParClasse);
    public List<GenGenererParClasse> getGenGenererParClasses();
    public void setGenGenererParClasses(List<GenGenererParClasse> genGenererParClasse);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
