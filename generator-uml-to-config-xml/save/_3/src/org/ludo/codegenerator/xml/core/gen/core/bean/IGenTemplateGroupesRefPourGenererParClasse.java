package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenTemplateGroupesRefPourGenererParClasse {
	
	/** Récupération de l'élément parent */
	
	public GenGenererParClasse getReferenceGenGenererParClasse();
	
	public void setReferenceGenGenererParClasse(GenGenererParClasse referenceGenGenererParClasse);
	
	/** Récupération des éléments fils */
	
    public GenTemplateGroupeRefPourGenererParClasse getGenTemplateGroupeRefPourGenererParClasseByTemplateGroupeNom(String templateGroupeNom);
    public void addGenTemplateGroupeRefPourGenererParClasse(GenTemplateGroupeRefPourGenererParClasse genTemplateGroupeRefPourGenererParClasse);
    public List getListeGenTemplateGroupeRefPourGenererParClasse();
    public void setListeGenTemplateGroupeRefPourGenererParClasse(List listeGenTemplateGroupeRefPourGenererParClasse);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
