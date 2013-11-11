package org.ludo.codegenerator.xml.core.gen.core.bean;


public interface GenAttribut {
	
	/** Récupération de l'élément parent */
	
	public GenAttributs getReferenceGenAttributs();
	
	public void setReferenceGenAttributs(GenAttributs referenceGenAttributs);
	
	/** Récupération des éléments fils */
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	public String getGenIdAsString();
	public void setGenIdAsString(String genIdAsString);
	
	public String getNomJavaAsString();
	public void setNomJavaAsString(String nomJavaAsString);
	
	public String getTypeAsString();
	public void setTypeAsString(String typeAsString);
	
	public String getNombreMinimumAsString();
	public void setNombreMinimumAsString(String nombreMinimumAsString);
	
	public String getNombreMaximumAsString();
	public void setNombreMaximumAsString(String nombreMaximumAsString);
	
	public String getNomSQLAsString();
	public void setNomSQLAsString(String nomSQLAsString);
	
	public String getTypeSQLAsString();
	public void setTypeSQLAsString(String typeSQLAsString);
	
	public String getEstDansTableAsString();
	public void setEstDansTableAsString(String estDansTableAsString);
	
	public String getSizeAsString();
	public void setSizeAsString(String sizeAsString);
	
	public String getEstClePrimaireAsString();
	public void setEstClePrimaireAsString(String estClePrimaireAsString);
	
	public String getEstCleIncrementeeAsString();
	public void setEstCleIncrementeeAsString(String estCleIncrementeeAsString);
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	public String getGenId();
	public void setGenId(String genId);

	public String getNomJava();
	public void setNomJava(String nomJava);

	public String getType();
	public void setType(String type);

	public String getNombreMinimum();
	public void setNombreMinimum(String nombreMinimum);

	public String getNombreMaximum();
	public void setNombreMaximum(String nombreMaximum);

	public String getNomSQL();
	public void setNomSQL(String nomSQL);

	public String getTypeSQL();
	public void setTypeSQL(String typeSQL);

	public String getEstDansTable();
	public void setEstDansTable(String estDansTable);

	public String getSize();
	public void setSize(String size);

	public String getEstClePrimaire();
	public void setEstClePrimaire(String estClePrimaire);

	public String getEstCleIncrementee();
	public void setEstCleIncrementee(String estCleIncrementee);
}
