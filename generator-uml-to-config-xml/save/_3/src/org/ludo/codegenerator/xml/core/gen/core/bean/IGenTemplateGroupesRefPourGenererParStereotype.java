package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenTemplateGroupesRefPourGenererParStereotype {
	
	/** Récupération de l'élément parent */
	
	public GenStereotypeRefPourGenererParStereotype getReferenceGenStereotypeRefPourGenererParStereotype();
	
	public void setReferenceGenStereotypeRefPourGenererParStereotype(GenStereotypeRefPourGenererParStereotype referenceGenStereotypeRefPourGenererParStereotype);
	
	/** Récupération des éléments fils */
	
    public GenTemplateGroupeRefPourGenererParStereotype getGenTemplateGroupeRefPourGenererParStereotypeByTemplateGroupeNom(String templateGroupeNom);
    public void addGenTemplateGroupeRefPourGenererParStereotype(GenTemplateGroupeRefPourGenererParStereotype genTemplateGroupeRefPourGenererParStereotype);
    public List getListeGenTemplateGroupeRefPourGenererParStereotype();
    public void setListeGenTemplateGroupeRefPourGenererParStereotype(List listeGenTemplateGroupeRefPourGenererParStereotype);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
