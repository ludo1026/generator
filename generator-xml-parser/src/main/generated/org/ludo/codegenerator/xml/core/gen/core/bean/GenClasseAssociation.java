package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenClasseAssociation 
{
	
	/** Récupération de l'élément parent */
	
	public GenClasse getReferenceGenClasse();
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse);
	
	/** Récupération des éléments fils */
	
    public GenClasseAssociationAttribut getGenClasseAssociationAttributForGenId(String genId);
    public List<GenClasseAssociationAttribut> getGenClasseAssociationAttributsByGenId(String genId);
    public void addGenClasseAssociationAttribut(GenClasseAssociationAttribut genClasseAssociationAttribut);
    public List<GenClasseAssociationAttribut> getGenClasseAssociationAttributs();
    public void setGenClasseAssociationAttributs(List<GenClasseAssociationAttribut> genClasseAssociationAttribut);

    public GenClasseAssociationClasseDeAssociation getGenClasseAssociationClasseDeAssociation();
    
    public void setGenClasseAssociationClasseDeAssociation(GenClasseAssociationClasseDeAssociation genClasseAssociationClasseDeAssociation);
	

	public String getGenId();
	public void setGenId(String genId);

	public String getNomJava();
	public void setNomJava(String nomJava);

	public String getClasseGenId();
	public void setClasseGenId(String classeGenId);

	public String getNbMin();
	public void setNbMin(String nbMin);

	public String getNbMax();
	public void setNbMax(String nbMax);

	public String getDescription();
	public void setDescription(String description);
}
