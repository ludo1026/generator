package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenParametres {
	
	/** Récupération de l'élément parent */
	
	public GenMethode getReferenceGenMethode();
	
	public void setReferenceGenMethode(GenMethode referenceGenMethode);
	
	/** Récupération des éléments fils */
	
    public GenParametre getGenParametreByGenId(String genId);
    public GenParametre getGenParametreByNomJava(String nomJava);
    public GenParametre getGenParametreByType(String type);
    public GenParametre getGenParametreByDescription(String description);
    public void addGenParametre(GenParametre genParametre);
    public List<GenParametre> getListeGenParametre();
    public void setListeGenParametre(List<GenParametre> listeGenParametre);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
