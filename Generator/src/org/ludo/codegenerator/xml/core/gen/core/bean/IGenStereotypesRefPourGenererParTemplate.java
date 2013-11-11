package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenStereotypesRefPourGenererParTemplate {
	
	/** Récupération de l'élément parent */
	
	public GenTemplateGroupeRefPourGenererParTemplate getReferenceGenTemplateGroupeRefPourGenererParTemplate();
	
	public void setReferenceGenTemplateGroupeRefPourGenererParTemplate(GenTemplateGroupeRefPourGenererParTemplate referenceGenTemplateGroupeRefPourGenererParTemplate);
	
	/** Récupération des éléments fils */
	
    public GenStereotypeRefPourGenererParTemplate getGenStereotypeRefPourGenererParTemplateByStereotypeNom(String stereotypeNom);
    public void addGenStereotypeRefPourGenererParTemplate(GenStereotypeRefPourGenererParTemplate genStereotypeRefPourGenererParTemplate);
    public List<GenStereotypeRefPourGenererParTemplate> getListeGenStereotypeRefPourGenererParTemplate();
    public void setListeGenStereotypeRefPourGenererParTemplate(List<GenStereotypeRefPourGenererParTemplate> listeGenStereotypeRefPourGenererParTemplate);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
