package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenStereotypeRefPourGenererParStereotypes 
	extends List<GenStereotypeRefPourGenererParStereotype>
{
	
	/** Récupération de l'élément parent */
	
	public GenGenererParStereotype getReferenceGenGenererParStereotype();
	
	public void setReferenceGenGenererParStereotype(GenGenererParStereotype referenceGenGenererParStereotype);
	
	/** Récupération des éléments fils */
	
    public GenStereotypeRefPourGenererParStereotype getGenStereotypeRefPourGenererParStereotypeForStereotypeNom(String stereotypeNom);
    public List<GenStereotypeRefPourGenererParStereotype> getGenStereotypeRefPourGenererParStereotypesByStereotypeNom(String stereotypeNom);
    public void addGenStereotypeRefPourGenererParStereotype(GenStereotypeRefPourGenererParStereotype genStereotypeRefPourGenererParStereotype);
    public List<GenStereotypeRefPourGenererParStereotype> getGenStereotypeRefPourGenererParStereotypes();
    public void setGenStereotypeRefPourGenererParStereotypes(List<GenStereotypeRefPourGenererParStereotype> genStereotypeRefPourGenererParStereotype);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
