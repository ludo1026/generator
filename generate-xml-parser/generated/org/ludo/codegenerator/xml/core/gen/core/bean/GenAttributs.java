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
    public GenAttribut getGenAttributForNomJava(String nomJava);
    public GenAttribut getGenAttributForType(String type);
    public GenAttribut getGenAttributForNbMin(String nbMin);
    public GenAttribut getGenAttributForNbMax(String nbMax);
    public GenAttribut getGenAttributForNomSQL(String nomSQL);
    public GenAttribut getGenAttributForTypeSQL(String typeSQL);
    public GenAttribut getGenAttributForEstDansTable(String estDansTable);
    public GenAttribut getGenAttributForSize(String size);
    public GenAttribut getGenAttributForEstClePrimaire(String estClePrimaire);
    public GenAttribut getGenAttributForEstCleIncrementee(String estCleIncrementee);
    public GenAttribut getGenAttributForAssociation(String association);
    public GenAttribut getGenAttributForDescription(String description);
    public void addGenAttribut(GenAttribut genAttribut);
    public List<GenAttribut> getGenAttributs();
    public void setGenAttributs(List<GenAttribut> genAttribut);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
