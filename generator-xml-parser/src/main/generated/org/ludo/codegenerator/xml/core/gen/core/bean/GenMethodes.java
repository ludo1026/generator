package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenMethodes 
	extends List<GenMethode>
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	public GenClasse getReferenceGenClasse();
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse);
	
	/** R�cup�ration des �l�ments fils */
	
    public GenMethode getGenMethodeForGenId(String genId);
    public List<GenMethode> getGenMethodesByGenId(String genId);
    public GenMethode getGenMethodeForNomJava(String nomJava);
    public List<GenMethode> getGenMethodesByNomJava(String nomJava);
    public GenMethode getGenMethodeForRetourType(String retourType);
    public List<GenMethode> getGenMethodesByRetourType(String retourType);
    public GenMethode getGenMethodeForDescription(String description);
    public List<GenMethode> getGenMethodesByDescription(String description);
    public void addGenMethode(GenMethode genMethode);
    public List<GenMethode> getGenMethodes();
    public void setGenMethodes(List<GenMethode> genMethode);
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	
}
