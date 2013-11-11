package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenGenererGroupe {
	
	/** Récupération de l'élément parent */
	
	public Gen getReferenceGen();
	
	public void setReferenceGen(Gen referenceGen);
	
	/** Récupération des éléments fils */

    public GenGenererParClasses getGenGenererParClasses();
    
    public void setGenGenererParClasses(GenGenererParClasses genGenererParClasses);
	

    public GenGenererParTemplates getGenGenererParTemplates();
    
    public void setGenGenererParTemplates(GenGenererParTemplates genGenererParTemplates);
	

    public GenGenererParStereotypes getGenGenererParStereotypes();
    
    public void setGenGenererParStereotypes(GenGenererParStereotypes genGenererParStereotypes);
	
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
