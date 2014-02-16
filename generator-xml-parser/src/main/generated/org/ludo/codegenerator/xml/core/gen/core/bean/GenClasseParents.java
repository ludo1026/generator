package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenClasseParents 
	extends List<GenClasseParent>
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	public GenClasse getReferenceGenClasse();
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse);
	
	/** R�cup�ration des �l�ments fils */
	
    public GenClasseParent getGenClasseParentForClasseGenId(String classeGenId);
    public List<GenClasseParent> getGenClasseParentsByClasseGenId(String classeGenId);
    public void addGenClasseParent(GenClasseParent genClasseParent);
    public List<GenClasseParent> getGenClasseParents();
    public void setGenClasseParents(List<GenClasseParent> genClasseParent);
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	
}
