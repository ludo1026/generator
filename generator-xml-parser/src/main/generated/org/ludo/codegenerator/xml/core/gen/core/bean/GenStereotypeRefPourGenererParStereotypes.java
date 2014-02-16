package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenStereotypeRefPourGenererParStereotypes 
	extends List<GenStereotypeRefPourGenererParStereotype>
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	public GenGenererParStereotype getReferenceGenGenererParStereotype();
	
	public void setReferenceGenGenererParStereotype(GenGenererParStereotype referenceGenGenererParStereotype);
	
	/** R�cup�ration des �l�ments fils */
	
    public GenStereotypeRefPourGenererParStereotype getGenStereotypeRefPourGenererParStereotypeForStereotypeNom(String stereotypeNom);
    public List<GenStereotypeRefPourGenererParStereotype> getGenStereotypeRefPourGenererParStereotypesByStereotypeNom(String stereotypeNom);
    public void addGenStereotypeRefPourGenererParStereotype(GenStereotypeRefPourGenererParStereotype genStereotypeRefPourGenererParStereotype);
    public List<GenStereotypeRefPourGenererParStereotype> getGenStereotypeRefPourGenererParStereotypes();
    public void setGenStereotypeRefPourGenererParStereotypes(List<GenStereotypeRefPourGenererParStereotype> genStereotypeRefPourGenererParStereotype);
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	
}
