package org.ludo.codegenerator.xml.core.gen.core.bean;


public interface GenStereotypeRefPourGenererParStereotype {
	
	/** Récupération de l'élément parent */
	
	public GenStereotypesRefPourGenererParStereotype getReferenceGenStereotypesRefPourGenererParStereotype();
	
	public void setReferenceGenStereotypesRefPourGenererParStereotype(GenStereotypesRefPourGenererParStereotype referenceGenStereotypesRefPourGenererParStereotype);
	
	/** Récupération des éléments fils */

    public GenTemplateGroupesRefPourGenererParStereotype getGenTemplateGroupesRefPourGenererParStereotype();
    
    public void setGenTemplateGroupesRefPourGenererParStereotype(GenTemplateGroupesRefPourGenererParStereotype genTemplateGroupesRefPourGenererParStereotype);
	
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	public String getStereotypeNomAsString();
	public void setStereotypeNomAsString(String stereotypeNomAsString);
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	public String getStereotypeNom();
	public void setStereotypeNom(String stereotypeNom);
}
