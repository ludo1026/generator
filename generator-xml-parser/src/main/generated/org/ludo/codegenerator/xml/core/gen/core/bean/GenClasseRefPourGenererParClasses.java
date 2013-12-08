package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenClasseRefPourGenererParClasses 
	extends List<GenClasseRefPourGenererParClasse>
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	public GenGenererParClasse getReferenceGenGenererParClasse();
	
	public void setReferenceGenGenererParClasse(GenGenererParClasse referenceGenGenererParClasse);
	
	/** R�cup�ration des �l�ments fils */
	
    public GenClasseRefPourGenererParClasse getGenClasseRefPourGenererParClasseForClasseGenId(String classeGenId);
    public void addGenClasseRefPourGenererParClasse(GenClasseRefPourGenererParClasse genClasseRefPourGenererParClasse);
    public List<GenClasseRefPourGenererParClasse> getGenClasseRefPourGenererParClasses();
    public void setGenClasseRefPourGenererParClasses(List<GenClasseRefPourGenererParClasse> genClasseRefPourGenererParClasse);
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	
}
