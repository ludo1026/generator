package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenProprietesMethode {
	
	/** Récupération de l'élément parent */
	
	public GenMethode getReferenceGenMethode();
	
	public void setReferenceGenMethode(GenMethode referenceGenMethode);
	
	/** Récupération des éléments fils */
	
    public GenProprieteMethode getGenProprieteMethodeByNom(String nom);
    public GenProprieteMethode getGenProprieteMethodeByValeur(String valeur);
    public void addGenProprieteMethode(GenProprieteMethode genProprieteMethode);
    public List<GenProprieteMethode> getListeGenProprieteMethode();
    public void setListeGenProprieteMethode(List<GenProprieteMethode> listeGenProprieteMethode);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
