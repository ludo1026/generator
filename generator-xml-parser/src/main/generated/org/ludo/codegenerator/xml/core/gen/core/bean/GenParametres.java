package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenParametres 
	extends List<GenParametre>
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	public GenMethode getReferenceGenMethode();
	
	public void setReferenceGenMethode(GenMethode referenceGenMethode);
	
	/** R�cup�ration des �l�ments fils */
	
    public GenParametre getGenParametreForGenId(String genId);
    public List<GenParametre> getGenParametresByGenId(String genId);
    public GenParametre getGenParametreForNomJava(String nomJava);
    public List<GenParametre> getGenParametresByNomJava(String nomJava);
    public GenParametre getGenParametreForType(String type);
    public List<GenParametre> getGenParametresByType(String type);
    public GenParametre getGenParametreForDescription(String description);
    public List<GenParametre> getGenParametresByDescription(String description);
    public void addGenParametre(GenParametre genParametre);
    public List<GenParametre> getGenParametres();
    public void setGenParametres(List<GenParametre> genParametre);
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	
}
