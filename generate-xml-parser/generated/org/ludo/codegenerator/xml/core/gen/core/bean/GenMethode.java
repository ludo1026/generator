package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenMethode 
{
	
	/** Récupération de l'élément parent */
	
	public GenMethodes getReferenceGenMethodes();
	
	public void setReferenceGenMethodes(GenMethodes referenceGenMethodes);
	
	/** Récupération des éléments fils */

    public GenProprieteMethodes getGenProprieteMethodes();
    
    public void setGenProprieteMethodes(GenProprieteMethodes genProprieteMethodes);
	

    public GenParametres getGenParametres();
    
    public void setGenParametres(GenParametres genParametres);
	

    public GenStereotypeMethodes getGenStereotypeMethodes();
    
    public void setGenStereotypeMethodes(GenStereotypeMethodes genStereotypeMethodes);
	
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	public String getGenIdAsString();
	public void setGenIdAsString(String genIdAsString);
	
	public String getNomJavaAsString();
	public void setNomJavaAsString(String nomJavaAsString);
	
	public String getRetourTypeAsString();
	public void setRetourTypeAsString(String retourTypeAsString);
	
	public String getDescriptionAsString();
	public void setDescriptionAsString(String descriptionAsString);
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	public String getGenId();
	public void setGenId(String genId);

	public String getNomJava();
	public void setNomJava(String nomJava);

	public String getRetourType();
	public void setRetourType(String retourType);

	public String getDescription();
	public void setDescription(String description);
}
