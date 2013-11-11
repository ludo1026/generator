package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenAssociationAttributs 
	extends List<GenAssociationAttribut>
{
	
	/** Récupération de l'élément parent */
	
	public GenAssociation getReferenceGenAssociation();
	
	public void setReferenceGenAssociation(GenAssociation referenceGenAssociation);
	
	/** Récupération des éléments fils */
	
    public GenAssociationAttribut getGenAssociationAttributForGenId(String genId);
    public void addGenAssociationAttribut(GenAssociationAttribut genAssociationAttribut);
    public List<GenAssociationAttribut> getGenAssociationAttributs();
    public void setGenAssociationAttributs(List<GenAssociationAttribut> genAssociationAttribut);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
