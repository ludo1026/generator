package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenProprieteMethodes 
	extends List<GenProprieteMethode>
{
	
	/** Récupération de l'élément parent */
	
	public GenMethode getReferenceGenMethode();
	
	public void setReferenceGenMethode(GenMethode referenceGenMethode);
	
	/** Récupération des éléments fils */
	
    public GenProprieteMethode getGenProprieteMethodeForNom(String nom);
    public List<GenProprieteMethode> getGenProprieteMethodesByNom(String nom);
    public GenProprieteMethode getGenProprieteMethodeForValeur(String valeur);
    public List<GenProprieteMethode> getGenProprieteMethodesByValeur(String valeur);
    public void addGenProprieteMethode(GenProprieteMethode genProprieteMethode);
    public List<GenProprieteMethode> getGenProprieteMethodes();
    public void setGenProprieteMethodes(List<GenProprieteMethode> genProprieteMethode);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
