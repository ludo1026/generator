package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenAttributs {
	
	/** Récupération de l'élément parent */
	
	public GenClasse getReferenceGenClasse();
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse);
	
	/** Récupération des éléments fils */
	
    public GenAttribut getGenAttributByGenId(String genId);
    public GenAttribut getGenAttributByNomJava(String nomJava);
    public GenAttribut getGenAttributByType(String type);
    public GenAttribut getGenAttributByNombreMinimum(String nombreMinimum);
    public GenAttribut getGenAttributByNombreMaximum(String nombreMaximum);
    public GenAttribut getGenAttributByNomSQL(String nomSQL);
    public GenAttribut getGenAttributByTypeSQL(String typeSQL);
    public GenAttribut getGenAttributByEstDansTable(String estDansTable);
    public GenAttribut getGenAttributBySize(String size);
    public GenAttribut getGenAttributByEstClePrimaire(String estClePrimaire);
    public GenAttribut getGenAttributByEstCleIncrementee(String estCleIncrementee);
    public void addGenAttribut(GenAttribut genAttribut);
    public List getListeGenAttribut();
    public void setListeGenAttribut(List listeGenAttribut);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
