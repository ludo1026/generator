package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenClasseMethode 
{
	
	/** Récupération de l'élément parent */
	
	public GenClasse getReferenceGenClasse();
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse);
	
	/** Récupération des éléments fils */
	
    public GenClasseMethodePropriete getGenClasseMethodeProprieteForNom(String nom);
    public List<GenClasseMethodePropriete> getGenClasseMethodeProprietesByNom(String nom);
    public GenClasseMethodePropriete getGenClasseMethodeProprieteForValeur(String valeur);
    public List<GenClasseMethodePropriete> getGenClasseMethodeProprietesByValeur(String valeur);
    public void addGenClasseMethodePropriete(GenClasseMethodePropriete genClasseMethodePropriete);
    public List<GenClasseMethodePropriete> getGenClasseMethodeProprietes();
    public void setGenClasseMethodeProprietes(List<GenClasseMethodePropriete> genClasseMethodePropriete);
	
    public GenClasseMethodeParametre getGenClasseMethodeParametreForGenId(String genId);
    public List<GenClasseMethodeParametre> getGenClasseMethodeParametresByGenId(String genId);
    public GenClasseMethodeParametre getGenClasseMethodeParametreForNomJava(String nomJava);
    public List<GenClasseMethodeParametre> getGenClasseMethodeParametresByNomJava(String nomJava);
    public GenClasseMethodeParametre getGenClasseMethodeParametreForType(String type);
    public List<GenClasseMethodeParametre> getGenClasseMethodeParametresByType(String type);
    public GenClasseMethodeParametre getGenClasseMethodeParametreForDescription(String description);
    public List<GenClasseMethodeParametre> getGenClasseMethodeParametresByDescription(String description);
    public void addGenClasseMethodeParametre(GenClasseMethodeParametre genClasseMethodeParametre);
    public List<GenClasseMethodeParametre> getGenClasseMethodeParametres();
    public void setGenClasseMethodeParametres(List<GenClasseMethodeParametre> genClasseMethodeParametre);
	
    public GenClasseMethodeStereotype getGenClasseMethodeStereotypeForNom(String nom);
    public List<GenClasseMethodeStereotype> getGenClasseMethodeStereotypesByNom(String nom);
    public void addGenClasseMethodeStereotype(GenClasseMethodeStereotype genClasseMethodeStereotype);
    public List<GenClasseMethodeStereotype> getGenClasseMethodeStereotypes();
    public void setGenClasseMethodeStereotypes(List<GenClasseMethodeStereotype> genClasseMethodeStereotype);

	public String getGenId();
	public void setGenId(String genId);

	public String getNomJava();
	public void setNomJava(String nomJava);

	public String getRetourType();
	public void setRetourType(String retourType);

	public String getDescription();
	public void setDescription(String description);
}
