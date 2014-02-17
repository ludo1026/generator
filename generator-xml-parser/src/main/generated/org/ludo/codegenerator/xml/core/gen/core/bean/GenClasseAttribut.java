package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenClasseAttribut 
{
	
	/** Récupération de l'élément parent */
	
	public GenClasse getReferenceGenClasse();
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse);
	
	/** Récupération des éléments fils */
	
    public GenClasseAttributPropriete getGenClasseAttributProprieteForNom(String nom);
    public List<GenClasseAttributPropriete> getGenClasseAttributProprietesByNom(String nom);
    public GenClasseAttributPropriete getGenClasseAttributProprieteForValeur(String valeur);
    public List<GenClasseAttributPropriete> getGenClasseAttributProprietesByValeur(String valeur);
    public void addGenClasseAttributPropriete(GenClasseAttributPropriete genClasseAttributPropriete);
    public List<GenClasseAttributPropriete> getGenClasseAttributProprietes();
    public void setGenClasseAttributProprietes(List<GenClasseAttributPropriete> genClasseAttributPropriete);
	
    public GenClasseAttributStereotype getGenClasseAttributStereotypeForNom(String nom);
    public List<GenClasseAttributStereotype> getGenClasseAttributStereotypesByNom(String nom);
    public void addGenClasseAttributStereotype(GenClasseAttributStereotype genClasseAttributStereotype);
    public List<GenClasseAttributStereotype> getGenClasseAttributStereotypes();
    public void setGenClasseAttributStereotypes(List<GenClasseAttributStereotype> genClasseAttributStereotype);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	public String getGenIdAsString();
	public void setGenIdAsString(String genIdAsString);
	
	public String getNomJavaAsString();
	public void setNomJavaAsString(String nomJavaAsString);
	
	public String getTypeAsString();
	public void setTypeAsString(String typeAsString);
	
	public String getNbMinAsString();
	public void setNbMinAsString(String nbMinAsString);
	
	public String getNbMaxAsString();
	public void setNbMaxAsString(String nbMaxAsString);
	
	public String getNomSQLAsString();
	public void setNomSQLAsString(String nomSQLAsString);
	
	public String getTypeSQLAsString();
	public void setTypeSQLAsString(String typeSQLAsString);
	
	public String getEstDansTableAsString();
	public void setEstDansTableAsString(String estDansTableAsString);
	
	public String getSizeAsString();
	public void setSizeAsString(String sizeAsString);
	
	public String getEstClePrimaireAsString();
	public void setEstClePrimaireAsString(String estClePrimaireAsString);
	
	public String getEstCleIncrementeeAsString();
	public void setEstCleIncrementeeAsString(String estCleIncrementeeAsString);
	
	public String getAssociationIdAsString();
	public void setAssociationIdAsString(String associationIdAsString);
	
	public String getDescriptionAsString();
	public void setDescriptionAsString(String descriptionAsString);
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	public String getGenId();
	public void setGenId(String genId);

	public String getNomJava();
	public void setNomJava(String nomJava);

	public String getType();
	public void setType(String type);

	public String getNbMin();
	public void setNbMin(String nbMin);

	public String getNbMax();
	public void setNbMax(String nbMax);

	public String getNomSQL();
	public void setNomSQL(String nomSQL);

	public String getTypeSQL();
	public void setTypeSQL(String typeSQL);

	public String getEstDansTable();
	public void setEstDansTable(String estDansTable);

	public String getSize();
	public void setSize(String size);

	public String getEstClePrimaire();
	public void setEstClePrimaire(String estClePrimaire);

	public String getEstCleIncrementee();
	public void setEstCleIncrementee(String estCleIncrementee);

	public String getAssociationId();
	public void setAssociationId(String associationId);

	public String getDescription();
	public void setDescription(String description);
}
