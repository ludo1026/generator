package org.ludo.umlgenerator.xml.core.bean;

import java.util.List;
import java.util.Map;


public interface IXMI {

	public abstract List getListeStereotype();

	public abstract void setListeStereotype(List listeStereotype);

	public abstract void addStereotype(IXMIStereotype stereotype);

	public abstract IXMIStereotype getStereotypeByNom(String nom);

	public abstract IXMIStereotype getStereotypeByXmiId(String xmiId);

    public abstract List getListeTag();

    public abstract void setListeTag(List listeTag);

    public abstract void addTag(IXMITag tag);

    public abstract IXMITag getTagByNom(String nom);

    public abstract IXMITag getTagByXmiId(String xmiId);

	public abstract List getListeDatatype();

	public abstract void setListeDatatype(List listeDatatype);

	public abstract void addDatatype(IXMIDatatype datatype);

	public abstract IXMIDatatype getDatatypeByNom(String nom);

	public abstract IXMIDatatype getDatatypeByXmiId(String xmiId);

	public abstract List getListePackageFils();

	public abstract void setListePackageFils(List listePackageFils);

	public abstract void addPackageFils(IXMIPackage packageFils);

	public abstract IXMIPackage getPackageFilsByNom(String nom);

	public abstract IXMIPackage getPackageFilsByXmiId(String xmiId);

	public void addAssociation(IXMIAssociation xmiAssociation);

	public List getListeAssociation();

	public Map getMapAssociationByXMIIdRef();

	public List getAssociationByXMIIdRef(String xmiIdRef);

	public void addGeneralisation(IXMGeneralisation xmGeneralisation);

	public List getListeGeneralisation();

}