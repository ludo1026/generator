package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenAttributs 
	extends List<GenAttribut>
{
	
	/** Récupération de l'élément parent */
	
	public GenClasse getReferenceGenClasse();
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse);
	
	/** Récupération des éléments fils */
	
    public GenAttribut getGenAttributForGenId(String genId);
    public List<GenAttribut> getGenAttributsByGenId(String genId);
    public GenAttribut getGenAttributForNomJava(String nomJava);
    public List<GenAttribut> getGenAttributsByNomJava(String nomJava);
    public GenAttribut getGenAttributForType(String type);
    public List<GenAttribut> getGenAttributsByType(String type);
    public GenAttribut getGenAttributForNbMin(String nbMin);
    public List<GenAttribut> getGenAttributsByNbMin(String nbMin);
    public GenAttribut getGenAttributForNbMax(String nbMax);
    public List<GenAttribut> getGenAttributsByNbMax(String nbMax);
    public GenAttribut getGenAttributForNomSQL(String nomSQL);
    public List<GenAttribut> getGenAttributsByNomSQL(String nomSQL);
    public GenAttribut getGenAttributForTypeSQL(String typeSQL);
    public List<GenAttribut> getGenAttributsByTypeSQL(String typeSQL);
    public GenAttribut getGenAttributForEstDansTable(String estDansTable);
    public List<GenAttribut> getGenAttributsByEstDansTable(String estDansTable);
    public GenAttribut getGenAttributForSize(String size);
    public List<GenAttribut> getGenAttributsBySize(String size);
    public GenAttribut getGenAttributForEstClePrimaire(String estClePrimaire);
    public List<GenAttribut> getGenAttributsByEstClePrimaire(String estClePrimaire);
    public GenAttribut getGenAttributForEstCleIncrementee(String estCleIncrementee);
    public List<GenAttribut> getGenAttributsByEstCleIncrementee(String estCleIncrementee);
    public GenAttribut getGenAttributForAssociationId(String associationId);
    public List<GenAttribut> getGenAttributsByAssociationId(String associationId);
    public GenAttribut getGenAttributForDescription(String description);
    public List<GenAttribut> getGenAttributsByDescription(String description);
    public void addGenAttribut(GenAttribut genAttribut);
    public List<GenAttribut> getGenAttributs();
    public void setGenAttributs(List<GenAttribut> genAttribut);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
