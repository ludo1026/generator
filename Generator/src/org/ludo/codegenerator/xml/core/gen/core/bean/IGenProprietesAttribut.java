package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenProprietesAttribut {
	
	/** Récupération de l'élément parent */
	
	public GenAttribut getReferenceGenAttribut();
	
	public void setReferenceGenAttribut(GenAttribut referenceGenAttribut);
	
	/** Récupération des éléments fils */
	
    public GenProprieteAttribut getGenProprieteAttributByNom(String nom);
    public GenProprieteAttribut getGenProprieteAttributByValeur(String valeur);
    public void addGenProprieteAttribut(GenProprieteAttribut genProprieteAttribut);
    public List<GenProprieteAttribut> getListeGenProprieteAttribut();
    public void setListeGenProprieteAttribut(List<GenProprieteAttribut> listeGenProprieteAttribut);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
