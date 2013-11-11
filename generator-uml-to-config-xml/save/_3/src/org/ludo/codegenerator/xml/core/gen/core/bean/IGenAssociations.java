package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenAssociations {
	
	/** Récupération de l'élément parent */
	
	public GenClasse getReferenceGenClasse();
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse);
	
	/** Récupération des éléments fils */
	
    public GenAssociation getGenAssociationByGenId(String genId);
    public GenAssociation getGenAssociationByNomJavaChamp(String nomJavaChamp);
    public GenAssociation getGenAssociationByClasseGenId(String classeGenId);
    public GenAssociation getGenAssociationByNombreMinimum(String nombreMinimum);
    public GenAssociation getGenAssociationByNombreMaximum(String nombreMaximum);
    public void addGenAssociation(GenAssociation genAssociation);
    public List getListeGenAssociation();
    public void setListeGenAssociation(List listeGenAssociation);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
