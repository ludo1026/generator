package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenClassesRefPourGenererParClasse {
	
	/** Récupération de l'élément parent */
	
	public GenGenererParClasse getReferenceGenGenererParClasse();
	
	public void setReferenceGenGenererParClasse(GenGenererParClasse referenceGenGenererParClasse);
	
	/** Récupération des éléments fils */
	
    public GenClasseRefPourGenererParClasse getGenClasseRefPourGenererParClasseByClasseGenId(String classeGenId);
    public void addGenClasseRefPourGenererParClasse(GenClasseRefPourGenererParClasse genClasseRefPourGenererParClasse);
    public List<GenClasseRefPourGenererParClasse> getListeGenClasseRefPourGenererParClasse();
    public void setListeGenClasseRefPourGenererParClasse(List<GenClasseRefPourGenererParClasse> listeGenClasseRefPourGenererParClasse);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
