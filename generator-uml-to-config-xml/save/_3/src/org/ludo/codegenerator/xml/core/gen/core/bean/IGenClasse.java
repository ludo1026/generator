package org.ludo.codegenerator.xml.core.gen.core.bean;


public interface GenClasse {
	
	/** Récupération de l'élément parent */
	
	public GenClasses getReferenceGenClasses();
	
	public void setReferenceGenClasses(GenClasses referenceGenClasses);
	
	/** Récupération des éléments fils */

    public GenAttributs getGenAttributs();
    
    public void setGenAttributs(GenAttributs genAttributs);
	

    public GenMethodes getGenMethodes();
    
    public void setGenMethodes(GenMethodes genMethodes);
	

    public GenStereotypesRef getGenStereotypesRef();
    
    public void setGenStereotypesRef(GenStereotypesRef genStereotypesRef);
	

    public GenAssociations getGenAssociations();
    
    public void setGenAssociations(GenAssociations genAssociations);
	

    public GenClasseParents getGenClasseParents();
    
    public void setGenClasseParents(GenClasseParents genClasseParents);
	
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	public String getGenIdAsString();
	public void setGenIdAsString(String genIdAsString);
	
	public String getNomJavaAsString();
	public void setNomJavaAsString(String nomJavaAsString);
	
	public String getPackageJavaAsString();
	public void setPackageJavaAsString(String packageJavaAsString);
	
	public String getNomTableAsString();
	public void setNomTableAsString(String nomTableAsString);
	
	public String getNomVueAsString();
	public void setNomVueAsString(String nomVueAsString);
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	public String getGenId();
	public void setGenId(String genId);

	public String getNomJava();
	public void setNomJava(String nomJava);

	public String getPackageJava();
	public void setPackageJava(String packageJava);

	public String getNomTable();
	public void setNomTable(String nomTable);

	public String getNomVue();
	public void setNomVue(String nomVue);
}
