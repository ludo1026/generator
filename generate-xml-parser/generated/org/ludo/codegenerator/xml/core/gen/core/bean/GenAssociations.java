package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenAssociations 
	extends List<GenAssociation>
{
	
	/** Récupération de l'élément parent */
	
	public GenClasse getReferenceGenClasse();
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse);
	
	/** Récupération des éléments fils */
	
    public GenAssociation getGenAssociationForGenId(String genId);
    public GenAssociation getGenAssociationForNomJava(String nomJava);
    public GenAssociation getGenAssociationForClasseGenId(String classeGenId);
    public GenAssociation getGenAssociationForNbMin(String nbMin);
    public GenAssociation getGenAssociationForNbMax(String nbMax);
    public GenAssociation getGenAssociationForDescription(String description);
    public void addGenAssociation(GenAssociation genAssociation);
    public List<GenAssociation> getGenAssociations();
    public void setGenAssociations(List<GenAssociation> genAssociation);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
