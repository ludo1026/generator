package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenGenererParStereotypes 
	extends List<GenGenererParStereotype>
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	public GenGenerate getReferenceGenGenerate();
	
	public void setReferenceGenGenerate(GenGenerate referenceGenGenerate);
	
	/** R�cup�ration des �l�ments fils */
	
    public void addGenGenererParStereotype(GenGenererParStereotype genGenererParStereotype);
    public List<GenGenererParStereotype> getGenGenererParStereotypes();
    public void setGenGenererParStereotypes(List<GenGenererParStereotype> genGenererParStereotype);
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	
}
