package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenAssociationAttributs 
	extends List<GenAssociationAttribut>
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	public GenAssociation getReferenceGenAssociation();
	
	public void setReferenceGenAssociation(GenAssociation referenceGenAssociation);
	
	/** R�cup�ration des �l�ments fils */
	
    public GenAssociationAttribut getGenAssociationAttributForGenId(String genId);
    public List<GenAssociationAttribut> getGenAssociationAttributsByGenId(String genId);
    public void addGenAssociationAttribut(GenAssociationAttribut genAssociationAttribut);
    public List<GenAssociationAttribut> getGenAssociationAttributs();
    public void setGenAssociationAttributs(List<GenAssociationAttribut> genAssociationAttribut);
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	
}
