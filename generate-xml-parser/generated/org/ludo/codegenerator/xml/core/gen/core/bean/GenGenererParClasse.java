package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenGenererParClasse 
{
	
	/** Récupération de l'élément parent */
	
	public GenGenererParClasses getReferenceGenGenererParClasses();
	
	public void setReferenceGenGenererParClasses(GenGenererParClasses referenceGenGenererParClasses);
	
	/** Récupération des éléments fils */

    public GenClasseRefPourGenererParClasses getGenClasseRefPourGenererParClasses();
    
    public void setGenClasseRefPourGenererParClasses(GenClasseRefPourGenererParClasses genClasseRefPourGenererParClasses);
	

    public GenTemplateGroupeRefPourGenererParClasses getGenTemplateGroupeRefPourGenererParClasses();
    
    public void setGenTemplateGroupeRefPourGenererParClasses(GenTemplateGroupeRefPourGenererParClasses genTemplateGroupeRefPourGenererParClasses);
	
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
