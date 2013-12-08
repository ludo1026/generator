package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenTemplateGroupeRefPourGenererParClasses 
	extends List<GenTemplateGroupeRefPourGenererParClasse>
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	public GenGenererParClasse getReferenceGenGenererParClasse();
	
	public void setReferenceGenGenererParClasse(GenGenererParClasse referenceGenGenererParClasse);
	
	/** R�cup�ration des �l�ments fils */
	
    public GenTemplateGroupeRefPourGenererParClasse getGenTemplateGroupeRefPourGenererParClasseForTemplateGroupeNom(String templateGroupeNom);
    public void addGenTemplateGroupeRefPourGenererParClasse(GenTemplateGroupeRefPourGenererParClasse genTemplateGroupeRefPourGenererParClasse);
    public List<GenTemplateGroupeRefPourGenererParClasse> getGenTemplateGroupeRefPourGenererParClasses();
    public void setGenTemplateGroupeRefPourGenererParClasses(List<GenTemplateGroupeRefPourGenererParClasse> genTemplateGroupeRefPourGenererParClasse);
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	
}
