package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenClasseAttributPropriete 
{
	
	/** Récupération de l'élément parent */
	
	public GenClasseAttribut getReferenceGenClasseAttribut();
	
	public void setReferenceGenClasseAttribut(GenClasseAttribut referenceGenClasseAttribut);
	
	/** Récupération des éléments fils */

	public String getNom();
	public void setNom(String nom);

	public String getValeur();
	public void setValeur(String valeur);
}
