package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenClasse 
{
	
	/** Récupération de l'élément parent */
	
	public GenClasses getReferenceGenClasses();
	
	public void setReferenceGenClasses(GenClasses referenceGenClasses);
	
	/** Récupération des éléments fils */
	
    public GenClassePropriete getGenClasseProprieteForNom(String nom);
    public List<GenClassePropriete> getGenClasseProprietesByNom(String nom);
    public GenClassePropriete getGenClasseProprieteForValeur(String valeur);
    public List<GenClassePropriete> getGenClasseProprietesByValeur(String valeur);
    public void addGenClassePropriete(GenClassePropriete genClassePropriete);
    public List<GenClassePropriete> getGenClasseProprietes();
    public void setGenClasseProprietes(List<GenClassePropriete> genClassePropriete);
	
    public GenClasseAttribut getGenClasseAttributForGenId(String genId);
    public List<GenClasseAttribut> getGenClasseAttributsByGenId(String genId);
    public GenClasseAttribut getGenClasseAttributForNomJava(String nomJava);
    public List<GenClasseAttribut> getGenClasseAttributsByNomJava(String nomJava);
    public GenClasseAttribut getGenClasseAttributForType(String type);
    public List<GenClasseAttribut> getGenClasseAttributsByType(String type);
    public GenClasseAttribut getGenClasseAttributForNbMin(String nbMin);
    public List<GenClasseAttribut> getGenClasseAttributsByNbMin(String nbMin);
    public GenClasseAttribut getGenClasseAttributForNbMax(String nbMax);
    public List<GenClasseAttribut> getGenClasseAttributsByNbMax(String nbMax);
    public GenClasseAttribut getGenClasseAttributForNomSQL(String nomSQL);
    public List<GenClasseAttribut> getGenClasseAttributsByNomSQL(String nomSQL);
    public GenClasseAttribut getGenClasseAttributForTypeSQL(String typeSQL);
    public List<GenClasseAttribut> getGenClasseAttributsByTypeSQL(String typeSQL);
    public GenClasseAttribut getGenClasseAttributForEstDansTable(String estDansTable);
    public List<GenClasseAttribut> getGenClasseAttributsByEstDansTable(String estDansTable);
    public GenClasseAttribut getGenClasseAttributForSize(String size);
    public List<GenClasseAttribut> getGenClasseAttributsBySize(String size);
    public GenClasseAttribut getGenClasseAttributForEstClePrimaire(String estClePrimaire);
    public List<GenClasseAttribut> getGenClasseAttributsByEstClePrimaire(String estClePrimaire);
    public GenClasseAttribut getGenClasseAttributForEstCleIncrementee(String estCleIncrementee);
    public List<GenClasseAttribut> getGenClasseAttributsByEstCleIncrementee(String estCleIncrementee);
    public GenClasseAttribut getGenClasseAttributForAssociationId(String associationId);
    public List<GenClasseAttribut> getGenClasseAttributsByAssociationId(String associationId);
    public GenClasseAttribut getGenClasseAttributForDescription(String description);
    public List<GenClasseAttribut> getGenClasseAttributsByDescription(String description);
    public void addGenClasseAttribut(GenClasseAttribut genClasseAttribut);
    public List<GenClasseAttribut> getGenClasseAttributs();
    public void setGenClasseAttributs(List<GenClasseAttribut> genClasseAttribut);
	
    public GenClasseMethode getGenClasseMethodeForGenId(String genId);
    public List<GenClasseMethode> getGenClasseMethodesByGenId(String genId);
    public GenClasseMethode getGenClasseMethodeForNomJava(String nomJava);
    public List<GenClasseMethode> getGenClasseMethodesByNomJava(String nomJava);
    public GenClasseMethode getGenClasseMethodeForRetourType(String retourType);
    public List<GenClasseMethode> getGenClasseMethodesByRetourType(String retourType);
    public GenClasseMethode getGenClasseMethodeForDescription(String description);
    public List<GenClasseMethode> getGenClasseMethodesByDescription(String description);
    public void addGenClasseMethode(GenClasseMethode genClasseMethode);
    public List<GenClasseMethode> getGenClasseMethodes();
    public void setGenClasseMethodes(List<GenClasseMethode> genClasseMethode);
	
    public GenClasseStereotype getGenClasseStereotypeForNom(String nom);
    public List<GenClasseStereotype> getGenClasseStereotypesByNom(String nom);
    public void addGenClasseStereotype(GenClasseStereotype genClasseStereotype);
    public List<GenClasseStereotype> getGenClasseStereotypes();
    public void setGenClasseStereotypes(List<GenClasseStereotype> genClasseStereotype);
	
    public GenClasseAssociation getGenClasseAssociationForGenId(String genId);
    public List<GenClasseAssociation> getGenClasseAssociationsByGenId(String genId);
    public GenClasseAssociation getGenClasseAssociationForNomJava(String nomJava);
    public List<GenClasseAssociation> getGenClasseAssociationsByNomJava(String nomJava);
    public GenClasseAssociation getGenClasseAssociationForClasseGenId(String classeGenId);
    public List<GenClasseAssociation> getGenClasseAssociationsByClasseGenId(String classeGenId);
    public GenClasseAssociation getGenClasseAssociationForNbMin(String nbMin);
    public List<GenClasseAssociation> getGenClasseAssociationsByNbMin(String nbMin);
    public GenClasseAssociation getGenClasseAssociationForNbMax(String nbMax);
    public List<GenClasseAssociation> getGenClasseAssociationsByNbMax(String nbMax);
    public GenClasseAssociation getGenClasseAssociationForDescription(String description);
    public List<GenClasseAssociation> getGenClasseAssociationsByDescription(String description);
    public void addGenClasseAssociation(GenClasseAssociation genClasseAssociation);
    public List<GenClasseAssociation> getGenClasseAssociations();
    public void setGenClasseAssociations(List<GenClasseAssociation> genClasseAssociation);
	
    public GenClasseParent getGenClasseParentForClasseGenId(String classeGenId);
    public List<GenClasseParent> getGenClasseParentsByClasseGenId(String classeGenId);
    public void addGenClasseParent(GenClasseParent genClasseParent);
    public List<GenClasseParent> getGenClasseParents();
    public void setGenClasseParents(List<GenClasseParent> genClasseParent);

	public String getGenId();
	public void setGenId(String genId);

	public String getNomJava();
	public void setNomJava(String nomJava);

	public String getPackageJava();
	public void setPackageJava(String packageJava);

	public String getNomTable();
	public void setNomTable(String nomTable);

	public String getNomVue();
	public void setNomVue(String nomVue);

	public String getDescription();
	public void setDescription(String description);
}
