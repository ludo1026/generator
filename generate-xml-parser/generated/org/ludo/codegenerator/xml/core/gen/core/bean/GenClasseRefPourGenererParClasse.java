package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenClasseRefPourGenererParClasse 
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	public GenClasseRefPourGenererParClasses getReferenceGenClasseRefPourGenererParClasses();
	
	public void setReferenceGenClasseRefPourGenererParClasses(GenClasseRefPourGenererParClasses referenceGenClasseRefPourGenererParClasses);
	
	/** R�cup�ration des �l�ments fils */
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	public String getClasseGenIdAsString();
	public void setClasseGenIdAsString(String classeGenIdAsString);
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	

	public String getClasseGenId();
	public void setClasseGenId(String classeGenId);
}
