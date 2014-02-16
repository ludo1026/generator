package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenGenerate 
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	public Gen getReferenceGen();
	
	public void setReferenceGen(Gen referenceGen);
	
	/** R�cup�ration des �l�ments fils */

    public GenGenererParClasses getGenGenererParClasses();
    
    public void setGenGenererParClasses(GenGenererParClasses genGenererParClasses);
	

    public GenGenererParTemplates getGenGenererParTemplates();
    
    public void setGenGenererParTemplates(GenGenererParTemplates genGenererParTemplates);
	

    public GenGenererParStereotypes getGenGenererParStereotypes();
    
    public void setGenGenererParStereotypes(GenGenererParStereotypes genGenererParStereotypes);
	
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	
}
