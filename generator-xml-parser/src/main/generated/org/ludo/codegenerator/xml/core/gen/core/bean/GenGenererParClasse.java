package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenGenererParClasse 
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	public GenGenererParClasses getReferenceGenGenererParClasses();
	
	public void setReferenceGenGenererParClasses(GenGenererParClasses referenceGenGenererParClasses);
	
	/** R�cup�ration des �l�ments fils */

    public GenClasseRefPourGenererParClasses getGenClasseRefPourGenererParClasses();
    
    public void setGenClasseRefPourGenererParClasses(GenClasseRefPourGenererParClasses genClasseRefPourGenererParClasses);
	

    public GenTemplateGroupeRefPourGenererParClasses getGenTemplateGroupeRefPourGenererParClasses();
    
    public void setGenTemplateGroupeRefPourGenererParClasses(GenTemplateGroupeRefPourGenererParClasses genTemplateGroupeRefPourGenererParClasses);
	
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	
}
