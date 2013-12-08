package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenMethodes 
	extends List<GenMethode>
{
	
	/** Récupération de l'élément parent */
	
	public GenClasse getReferenceGenClasse();
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse);
	
	/** Récupération des éléments fils */
	
    public GenMethode getGenMethodeForGenId(String genId);
    public GenMethode getGenMethodeForNomJava(String nomJava);
    public GenMethode getGenMethodeForRetourType(String retourType);
    public GenMethode getGenMethodeForDescription(String description);
    public void addGenMethode(GenMethode genMethode);
    public List<GenMethode> getGenMethodes();
    public void setGenMethodes(List<GenMethode> genMethode);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
