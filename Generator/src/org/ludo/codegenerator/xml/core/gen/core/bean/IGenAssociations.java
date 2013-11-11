package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenAssociations {
	
	/** Récupération de l'élément parent */
	
	public GenClasse getReferenceGenClasse();
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse);
	
	/** Récupération des éléments fils */
	
    public GenAssociation getGenAssociationByGenId(String genId);
    public GenAssociation getGenAssociationByNomJava(String nomJava);
    public GenAssociation getGenAssociationByClasseGenId(String classeGenId);
    public GenAssociation getGenAssociationByNbMin(String nbMin);
    public GenAssociation getGenAssociationByNbMax(String nbMax);
    public GenAssociation getGenAssociationByDescription(String description);
    public void addGenAssociation(GenAssociation genAssociation);
    public List<GenAssociation> getListeGenAssociation();
    public void setListeGenAssociation(List<GenAssociation> listeGenAssociation);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
