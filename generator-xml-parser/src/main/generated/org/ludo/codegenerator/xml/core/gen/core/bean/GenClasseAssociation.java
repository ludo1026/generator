package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenClasseAssociation 
{
	
	/** Récupération de l'élément parent */
	
	public GenClasse getReferenceGenClasse();
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse);
	
	/** Récupération des éléments fils */
	
    public GenClasseAssociationAttribut getGenClasseAssociationAttributForGenId(String genId);
    public List<GenClasseAssociationAttribut> getGenClasseAssociationAttributsByGenId(String genId);
    public void addGenClasseAssociationAttribut(GenClasseAssociationAttribut genClasseAssociationAttribut);
    public List<GenClasseAssociationAttribut> getGenClasseAssociationAttributs();
    public void setGenClasseAssociationAttributs(List<GenClasseAssociationAttribut> genClasseAssociationAttribut);

    public GenClasseAssociationClasseDeAssociation getGenClasseAssociationClasseDeAssociation();
    
    public void setGenClasseAssociationClasseDeAssociation(GenClasseAssociationClasseDeAssociation genClasseAssociationClasseDeAssociation);
	
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	public String getGenIdAsString();
	public void setGenIdAsString(String genIdAsString);
	
	public String getNomJavaAsString();
	public void setNomJavaAsString(String nomJavaAsString);
	
	public String getClasseGenIdAsString();
	public void setClasseGenIdAsString(String classeGenIdAsString);
	
	public String getNbMinAsString();
	public void setNbMinAsString(String nbMinAsString);
	
	public String getNbMaxAsString();
	public void setNbMaxAsString(String nbMaxAsString);
	
	public String getDescriptionAsString();
	public void setDescriptionAsString(String descriptionAsString);
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	public String getGenId();
	public void setGenId(String genId);

	public String getNomJava();
	public void setNomJava(String nomJava);

	public String getClasseGenId();
	public void setClasseGenId(String classeGenId);

	public String getNbMin();
	public void setNbMin(String nbMin);

	public String getNbMax();
	public void setNbMax(String nbMax);

	public String getDescription();
	public void setDescription(String description);
}
