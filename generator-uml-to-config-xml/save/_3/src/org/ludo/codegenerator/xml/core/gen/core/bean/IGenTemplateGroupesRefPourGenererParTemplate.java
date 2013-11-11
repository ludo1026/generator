package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenTemplateGroupesRefPourGenererParTemplate {
	
	/** Récupération de l'élément parent */
	
	public GenGenererParTemplate getReferenceGenGenererParTemplate();
	
	public void setReferenceGenGenererParTemplate(GenGenererParTemplate referenceGenGenererParTemplate);
	
	/** Récupération des éléments fils */
	
    public GenTemplateGroupeRefPourGenererParTemplate getGenTemplateGroupeRefPourGenererParTemplateByTemplateGroupeNom(String templateGroupeNom);
    public void addGenTemplateGroupeRefPourGenererParTemplate(GenTemplateGroupeRefPourGenererParTemplate genTemplateGroupeRefPourGenererParTemplate);
    public List getListeGenTemplateGroupeRefPourGenererParTemplate();
    public void setListeGenTemplateGroupeRefPourGenererParTemplate(List listeGenTemplateGroupeRefPourGenererParTemplate);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
