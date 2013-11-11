package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenProprieteClasse {
	
	/** Récupération de l'élément parent */
	
	public GenProprietesClasse getReferenceGenProprietesClasse();
	
	public void setReferenceGenProprietesClasse(GenProprietesClasse referenceGenProprietesClasse);
	
	/** Récupération des éléments fils */
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	public String getNomAsString();
	public void setNomAsString(String nomAsString);
	
	public String getValeurAsString();
	public void setValeurAsString(String valeurAsString);
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	public String getNom();
	public void setNom(String nom);

	public String getValeur();
	public void setValeur(String valeur);
}
