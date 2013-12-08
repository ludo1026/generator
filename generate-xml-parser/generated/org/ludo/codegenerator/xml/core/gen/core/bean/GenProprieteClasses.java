package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenProprieteClasses 
	extends List<GenProprieteClasse>
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	public GenClasse getReferenceGenClasse();
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse);
	
	/** R�cup�ration des �l�ments fils */
	
    public GenProprieteClasse getGenProprieteClasseForNom(String nom);
    public GenProprieteClasse getGenProprieteClasseForValeur(String valeur);
    public void addGenProprieteClasse(GenProprieteClasse genProprieteClasse);
    public List<GenProprieteClasse> getGenProprieteClasses();
    public void setGenProprieteClasses(List<GenProprieteClasse> genProprieteClasse);
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	
}
