package org.ludo.codegenerator.xml.core.gen.core.bean;


public interface GenGenererParStereotype {
	
	/** Récupération de l'élément parent */
	
	public GenGenererParStereotypes getReferenceGenGenererParStereotypes();
	
	public void setReferenceGenGenererParStereotypes(GenGenererParStereotypes referenceGenGenererParStereotypes);
	
	/** Récupération des éléments fils */

    public GenStereotypesRefPourGenererParStereotype getGenStereotypesRefPourGenererParStereotype();
    
    public void setGenStereotypesRefPourGenererParStereotype(GenStereotypesRefPourGenererParStereotype genStereotypesRefPourGenererParStereotype);
	
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
