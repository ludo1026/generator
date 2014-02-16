package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenAssociations 
	extends List<GenAssociation>
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	public GenClasse getReferenceGenClasse();
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse);
	
	/** R�cup�ration des �l�ments fils */
	
    public GenAssociation getGenAssociationForGenId(String genId);
    public List<GenAssociation> getGenAssociationsByGenId(String genId);
    public GenAssociation getGenAssociationForNomJava(String nomJava);
    public List<GenAssociation> getGenAssociationsByNomJava(String nomJava);
    public GenAssociation getGenAssociationForClasseGenId(String classeGenId);
    public List<GenAssociation> getGenAssociationsByClasseGenId(String classeGenId);
    public GenAssociation getGenAssociationForNbMin(String nbMin);
    public List<GenAssociation> getGenAssociationsByNbMin(String nbMin);
    public GenAssociation getGenAssociationForNbMax(String nbMax);
    public List<GenAssociation> getGenAssociationsByNbMax(String nbMax);
    public GenAssociation getGenAssociationForDescription(String description);
    public List<GenAssociation> getGenAssociationsByDescription(String description);
    public void addGenAssociation(GenAssociation genAssociation);
    public List<GenAssociation> getGenAssociations();
    public void setGenAssociations(List<GenAssociation> genAssociation);
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	
}
