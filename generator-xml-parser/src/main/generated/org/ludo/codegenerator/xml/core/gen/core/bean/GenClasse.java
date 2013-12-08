package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenClasse 
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	public GenClasses getReferenceGenClasses();
	
	public void setReferenceGenClasses(GenClasses referenceGenClasses);
	
	/** R�cup�ration des �l�ments fils */

    public GenProprieteClasses getGenProprieteClasses();
    
    public void setGenProprieteClasses(GenProprieteClasses genProprieteClasses);
	

    public GenAttributs getGenAttributs();
    
    public void setGenAttributs(GenAttributs genAttributs);
	

    public GenMethodes getGenMethodes();
    
    public void setGenMethodes(GenMethodes genMethodes);
	

    public GenStereotypeClasses getGenStereotypeClasses();
    
    public void setGenStereotypeClasses(GenStereotypeClasses genStereotypeClasses);
	

    public GenAssociations getGenAssociations();
    
    public void setGenAssociations(GenAssociations genAssociations);
	

    public GenClasseParents getGenClasseParents();
    
    public void setGenClasseParents(GenClasseParents genClasseParents);
	
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
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
	
	public String getDescriptionAsString();
	public void setDescriptionAsString(String descriptionAsString);
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	

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

	public String getDescription();
	public void setDescription(String description);
}
