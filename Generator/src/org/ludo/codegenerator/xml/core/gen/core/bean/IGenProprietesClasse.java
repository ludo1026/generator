package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenProprietesClasse {
	
	/** Récupération de l'élément parent */
	
	public GenClasse getReferenceGenClasse();
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse);
	
	/** Récupération des éléments fils */
	
    public GenProprieteClasse getGenProprieteClasseByNom(String nom);
    public GenProprieteClasse getGenProprieteClasseByValeur(String valeur);
    public void addGenProprieteClasse(GenProprieteClasse genProprieteClasse);
    public List<GenProprieteClasse> getListeGenProprieteClasse();
    public void setListeGenProprieteClasse(List<GenProprieteClasse> listeGenProprieteClasse);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
