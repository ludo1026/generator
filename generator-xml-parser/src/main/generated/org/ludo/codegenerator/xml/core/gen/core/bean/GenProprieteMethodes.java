package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenProprieteMethodes 
	extends List<GenProprieteMethode>
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	public GenMethode getReferenceGenMethode();
	
	public void setReferenceGenMethode(GenMethode referenceGenMethode);
	
	/** R�cup�ration des �l�ments fils */
	
    public GenProprieteMethode getGenProprieteMethodeForNom(String nom);
    public List<GenProprieteMethode> getGenProprieteMethodesByNom(String nom);
    public GenProprieteMethode getGenProprieteMethodeForValeur(String valeur);
    public List<GenProprieteMethode> getGenProprieteMethodesByValeur(String valeur);
    public void addGenProprieteMethode(GenProprieteMethode genProprieteMethode);
    public List<GenProprieteMethode> getGenProprieteMethodes();
    public void setGenProprieteMethodes(List<GenProprieteMethode> genProprieteMethode);
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	
}
