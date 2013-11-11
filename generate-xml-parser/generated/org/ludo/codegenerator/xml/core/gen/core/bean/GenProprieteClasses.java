package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenProprieteClasses 
	extends List<GenProprieteClasse>
{
	
	/** Récupération de l'élément parent */
	
	public GenClasse getReferenceGenClasse();
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse);
	
	/** Récupération des éléments fils */
	
    public GenProprieteClasse getGenProprieteClasseForNom(String nom);
    public GenProprieteClasse getGenProprieteClasseForValeur(String valeur);
    public void addGenProprieteClasse(GenProprieteClasse genProprieteClasse);
    public List<GenProprieteClasse> getGenProprieteClasses();
    public void setGenProprieteClasses(List<GenProprieteClasse> genProprieteClasse);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
