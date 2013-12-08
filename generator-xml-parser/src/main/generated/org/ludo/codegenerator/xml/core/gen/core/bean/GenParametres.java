package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenParametres 
	extends List<GenParametre>
{
	
	/** Récupération de l'élément parent */
	
	public GenMethode getReferenceGenMethode();
	
	public void setReferenceGenMethode(GenMethode referenceGenMethode);
	
	/** Récupération des éléments fils */
	
    public GenParametre getGenParametreForGenId(String genId);
    public GenParametre getGenParametreForNomJava(String nomJava);
    public GenParametre getGenParametreForType(String type);
    public GenParametre getGenParametreForDescription(String description);
    public void addGenParametre(GenParametre genParametre);
    public List<GenParametre> getGenParametres();
    public void setGenParametres(List<GenParametre> genParametre);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
