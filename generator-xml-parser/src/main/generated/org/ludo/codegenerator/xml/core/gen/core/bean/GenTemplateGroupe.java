package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenTemplateGroupe 
	extends List<GenTemplateRef>
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	public GenTemplateGroupes getReferenceGenTemplateGroupes();
	
	public void setReferenceGenTemplateGroupes(GenTemplateGroupes referenceGenTemplateGroupes);
	
	/** R�cup�ration des �l�ments fils */
	
    public GenTemplateRef getGenTemplateRefForNom(String nom);
    public List<GenTemplateRef> getGenTemplateRefsByNom(String nom);
    public void addGenTemplateRef(GenTemplateRef genTemplateRef);
    public List<GenTemplateRef> getGenTemplateRefs();
    public void setGenTemplateRefs(List<GenTemplateRef> genTemplateRef);
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	public String getNomAsString();
	public void setNomAsString(String nomAsString);
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	

	public String getNom();
	public void setNom(String nom);
}
