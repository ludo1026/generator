package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenGenererParClasses 
	extends List<GenGenererParClasse>
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	public GenGenerate getReferenceGenGenerate();
	
	public void setReferenceGenGenerate(GenGenerate referenceGenGenerate);
	
	/** R�cup�ration des �l�ments fils */
	
    public void addGenGenererParClasse(GenGenererParClasse genGenererParClasse);
    public List<GenGenererParClasse> getGenGenererParClasses();
    public void setGenGenererParClasses(List<GenGenererParClasse> genGenererParClasse);
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	
}
