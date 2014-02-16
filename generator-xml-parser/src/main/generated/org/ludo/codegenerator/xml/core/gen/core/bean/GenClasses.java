package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenClasses 
	extends List<GenClasse>
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	public Gen getReferenceGen();
	
	public void setReferenceGen(Gen referenceGen);
	
	/** R�cup�ration des �l�ments fils */
	
    public GenClasse getGenClasseForGenId(String genId);
    public List<GenClasse> getGenClassesByGenId(String genId);
    public GenClasse getGenClasseForNomJava(String nomJava);
    public List<GenClasse> getGenClassesByNomJava(String nomJava);
    public GenClasse getGenClasseForPackageJava(String packageJava);
    public List<GenClasse> getGenClassesByPackageJava(String packageJava);
    public GenClasse getGenClasseForNomTable(String nomTable);
    public List<GenClasse> getGenClassesByNomTable(String nomTable);
    public GenClasse getGenClasseForNomVue(String nomVue);
    public List<GenClasse> getGenClassesByNomVue(String nomVue);
    public GenClasse getGenClasseForDescription(String description);
    public List<GenClasse> getGenClassesByDescription(String description);
    public void addGenClasse(GenClasse genClasse);
    public List<GenClasse> getGenClasses();
    public void setGenClasses(List<GenClasse> genClasse);
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	public String getPackageBaseAsString();
	public void setPackageBaseAsString(String packageBaseAsString);
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	

	public String getPackageBase();
	public void setPackageBase(String packageBase);
}
