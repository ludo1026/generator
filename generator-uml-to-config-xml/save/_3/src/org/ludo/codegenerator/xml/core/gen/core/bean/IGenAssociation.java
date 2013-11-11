package org.ludo.codegenerator.xml.core.gen.core.bean;


public interface GenAssociation {
	
	/** Récupération de l'élément parent */
	
	public GenAssociations getReferenceGenAssociations();
	
	public void setReferenceGenAssociations(GenAssociations referenceGenAssociations);
	
	/** Récupération des éléments fils */

    public GenClasseDeAssociation getGenClasseDeAssociation();
    
    public void setGenClasseDeAssociation(GenClasseDeAssociation genClasseDeAssociation);
	
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	public String getGenIdAsString();
	public void setGenIdAsString(String genIdAsString);
	
	public String getNomJavaChampAsString();
	public void setNomJavaChampAsString(String nomJavaChampAsString);
	
	public String getClasseGenIdAsString();
	public void setClasseGenIdAsString(String classeGenIdAsString);
	
	public String getNombreMinimumAsString();
	public void setNombreMinimumAsString(String nombreMinimumAsString);
	
	public String getNombreMaximumAsString();
	public void setNombreMaximumAsString(String nombreMaximumAsString);
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	public String getGenId();
	public void setGenId(String genId);

	public String getNomJavaChamp();
	public void setNomJavaChamp(String nomJavaChamp);

	public String getClasseGenId();
	public void setClasseGenId(String classeGenId);

	public String getNombreMinimum();
	public void setNombreMinimum(String nombreMinimum);

	public String getNombreMaximum();
	public void setNombreMaximum(String nombreMaximum);
}
