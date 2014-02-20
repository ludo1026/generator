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
