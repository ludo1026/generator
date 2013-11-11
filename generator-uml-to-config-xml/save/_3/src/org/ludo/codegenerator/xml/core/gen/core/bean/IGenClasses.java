package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenClasses {
	
	/** Récupération de l'élément parent */
	
	public Gen getReferenceGen();
	
	public void setReferenceGen(Gen referenceGen);
	
	/** Récupération des éléments fils */
	
    public GenClasse getGenClasseByGenId(String genId);
    public GenClasse getGenClasseByNomJava(String nomJava);
    public GenClasse getGenClasseByPackageJava(String packageJava);
    public GenClasse getGenClasseByNomTable(String nomTable);
    public GenClasse getGenClasseByNomVue(String nomVue);
    public void addGenClasse(GenClasse genClasse);
    public List getListeGenClasse();
    public void setListeGenClasse(List listeGenClasse);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	public String getPackageBaseAsString();
	public void setPackageBaseAsString(String packageBaseAsString);
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	public String getPackageBase();
	public void setPackageBase(String packageBase);
}
