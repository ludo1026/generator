package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenClasses 
	extends List<GenClasse>
{
	
	/** Récupération de l'élément parent */
	
	public Gen getReferenceGen();
	
	public void setReferenceGen(Gen referenceGen);
	
	/** Récupération des éléments fils */
	
    public GenClasse getGenClasseForGenId(String genId);
    public GenClasse getGenClasseForNomJava(String nomJava);
    public GenClasse getGenClasseForPackageJava(String packageJava);
    public GenClasse getGenClasseForNomTable(String nomTable);
    public GenClasse getGenClasseForNomVue(String nomVue);
    public GenClasse getGenClasseForDescription(String description);
    public void addGenClasse(GenClasse genClasse);
    public List<GenClasse> getGenClasses();
    public void setGenClasses(List<GenClasse> genClasse);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	public String getPackageBaseAsString();
	public void setPackageBaseAsString(String packageBaseAsString);
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	public String getPackageBase();
	public void setPackageBase(String packageBase);
}
