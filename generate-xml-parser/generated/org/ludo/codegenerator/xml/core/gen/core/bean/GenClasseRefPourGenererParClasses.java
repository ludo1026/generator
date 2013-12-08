package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenClasseRefPourGenererParClasses 
	extends List<GenClasseRefPourGenererParClasse>
{
	
	/** Récupération de l'élément parent */
	
	public GenGenererParClasse getReferenceGenGenererParClasse();
	
	public void setReferenceGenGenererParClasse(GenGenererParClasse referenceGenGenererParClasse);
	
	/** Récupération des éléments fils */
	
    public GenClasseRefPourGenererParClasse getGenClasseRefPourGenererParClasseForClasseGenId(String classeGenId);
    public void addGenClasseRefPourGenererParClasse(GenClasseRefPourGenererParClasse genClasseRefPourGenererParClasse);
    public List<GenClasseRefPourGenererParClasse> getGenClasseRefPourGenererParClasses();
    public void setGenClasseRefPourGenererParClasses(List<GenClasseRefPourGenererParClasse> genClasseRefPourGenererParClasse);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
