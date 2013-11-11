package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenGenererParClasse {
	
	/** Récupération de l'élément parent */
	
	public GenGenererParClasses getReferenceGenGenererParClasses();
	
	public void setReferenceGenGenererParClasses(GenGenererParClasses referenceGenGenererParClasses);
	
	/** Récupération des éléments fils */

    public GenClassesRefPourGenererParClasse getGenClassesRefPourGenererParClasse();
    
    public void setGenClassesRefPourGenererParClasse(GenClassesRefPourGenererParClasse genClassesRefPourGenererParClasse);
	

    public GenTemplateGroupesRefPourGenererParClasse getGenTemplateGroupesRefPourGenererParClasse();
    
    public void setGenTemplateGroupesRefPourGenererParClasse(GenTemplateGroupesRefPourGenererParClasse genTemplateGroupesRefPourGenererParClasse);
	
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
