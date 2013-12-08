package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenProprieteAttribut 
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	public GenProprieteAttributs getReferenceGenProprieteAttributs();
	
	public void setReferenceGenProprieteAttributs(GenProprieteAttributs referenceGenProprieteAttributs);
	
	/** R�cup�ration des �l�ments fils */
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	public String getNomAsString();
	public void setNomAsString(String nomAsString);
	
	public String getValeurAsString();
	public void setValeurAsString(String valeurAsString);
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	

	public String getNom();
	public void setNom(String nom);

	public String getValeur();
	public void setValeur(String valeur);
}
