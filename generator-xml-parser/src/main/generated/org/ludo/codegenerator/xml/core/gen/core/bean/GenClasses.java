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

	public String getPackageBase();
	public void setPackageBase(String packageBase);
}
