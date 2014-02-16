package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenProprieteAttributs 
	extends List<GenProprieteAttribut>
{
	
	/** Récupération de l'élément parent */
	
	public GenAttribut getReferenceGenAttribut();
	
	public void setReferenceGenAttribut(GenAttribut referenceGenAttribut);
	
	/** Récupération des éléments fils */
	
    public GenProprieteAttribut getGenProprieteAttributForNom(String nom);
    public List<GenProprieteAttribut> getGenProprieteAttributsByNom(String nom);
    public GenProprieteAttribut getGenProprieteAttributForValeur(String valeur);
    public List<GenProprieteAttribut> getGenProprieteAttributsByValeur(String valeur);
    public void addGenProprieteAttribut(GenProprieteAttribut genProprieteAttribut);
    public List<GenProprieteAttribut> getGenProprieteAttributs();
    public void setGenProprieteAttributs(List<GenProprieteAttribut> genProprieteAttribut);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
