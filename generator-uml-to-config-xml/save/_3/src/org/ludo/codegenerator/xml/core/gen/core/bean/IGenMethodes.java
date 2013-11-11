package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenMethodes {
	
	/** Récupération de l'élément parent */
	
	public GenClasse getReferenceGenClasse();
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse);
	
	/** Récupération des éléments fils */
	
    public GenMethode getGenMethodeByGenId(String genId);
    public GenMethode getGenMethodeByNomJava(String nomJava);
    public GenMethode getGenMethodeByRetourType(String retourType);
    public void addGenMethode(GenMethode genMethode);
    public List getListeGenMethode();
    public void setListeGenMethode(List listeGenMethode);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
