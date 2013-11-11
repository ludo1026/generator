package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenStereotypesRefPourGenererParStereotype {
	
	/** Récupération de l'élément parent */
	
	public GenGenererParStereotype getReferenceGenGenererParStereotype();
	
	public void setReferenceGenGenererParStereotype(GenGenererParStereotype referenceGenGenererParStereotype);
	
	/** Récupération des éléments fils */
	
    public GenStereotypeRefPourGenererParStereotype getGenStereotypeRefPourGenererParStereotypeByStereotypeNom(String stereotypeNom);
    public void addGenStereotypeRefPourGenererParStereotype(GenStereotypeRefPourGenererParStereotype genStereotypeRefPourGenererParStereotype);
    public List<GenStereotypeRefPourGenererParStereotype> getListeGenStereotypeRefPourGenererParStereotype();
    public void setListeGenStereotypeRefPourGenererParStereotype(List<GenStereotypeRefPourGenererParStereotype> listeGenStereotypeRefPourGenererParStereotype);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
