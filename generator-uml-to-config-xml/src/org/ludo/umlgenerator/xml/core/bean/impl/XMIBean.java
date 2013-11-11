package org.ludo.umlgenerator.xml.core.bean.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.ludo.umlgenerator.xml.core.bean.IXMI;
import org.ludo.umlgenerator.xml.core.bean.IXMIAssociation;
import org.ludo.umlgenerator.xml.core.bean.IXMIAssociationEnd;
import org.ludo.umlgenerator.xml.core.bean.IXMIDatatype;
import org.ludo.umlgenerator.xml.core.bean.IXMGeneralisation;
import org.ludo.umlgenerator.xml.core.bean.IXMIPackage;
import org.ludo.umlgenerator.xml.core.bean.IXMIStereotype;
import org.ludo.umlgenerator.xml.core.bean.IXMITag;
import org.ludo.utils.AssertHelper;


public class XMIBean implements IXMI {

	private final List listeStereotype = new ArrayList();
    private final List listeTag = new ArrayList();
	private final List listePackageFils = new ArrayList();
	private final List listeDatatype = new ArrayList();
	private final List listeAssociation = new ArrayList();
	private final Map mapAssociationByXMIIdRef = new HashMap();
	private final List listeGeneralisation = new ArrayList();

	public XMIBean() {

	}

	public List getListeStereotype() {
		return this.listeStereotype;
	}

	public void setListeStereotype(final List listeStereotype) {
		this.listeStereotype.clear();
		for(final Iterator iterStereotype = listeStereotype.iterator(); iterStereotype.hasNext(); ) {
			final IXMIStereotype stereotype = (IXMIStereotype) iterStereotype.next();
			this.listeStereotype.add(stereotype);
		}
	}

	public void addStereotype(final IXMIStereotype stereotype) {
		this.listeStereotype.add(stereotype);
	}

	public IXMIStereotype getStereotypeByNom(final String nom) {
		AssertHelper.assertDefined(nom, "nom du stereotype");
		IXMIStereotype stereotypeTrouve = null;
		for(final Iterator iterStereotype = this.listeStereotype.iterator(); iterStereotype.hasNext() && (stereotypeTrouve == null); ) {
			final IXMIStereotype stereotype = (IXMIStereotype) iterStereotype.next();
			AssertHelper.assertDefined(stereotype.getNom(), "nom du stéréotype dans la liste");
			if( stereotype.getNom().equals(nom) ) {
				stereotypeTrouve = stereotype;
			}
		}
		AssertHelper.assertDefined(stereotypeTrouve, "le stereotype recherché n'a pas été trouvé, nom = '"+nom+"'");
		return stereotypeTrouve;
	}

	public IXMIStereotype getStereotypeByXmiId(final String xmiId) {
		AssertHelper.assertDefined(xmiId, "xmiId du stereotype");
		IXMIStereotype stereotypeTrouve = null;
		for(final Iterator iterStereotype = this.listeStereotype.iterator(); iterStereotype.hasNext() && (stereotypeTrouve == null); ) {
			final IXMIStereotype stereotype = (IXMIStereotype) iterStereotype.next();
			AssertHelper.assertDefined(stereotype.getXmiId(), "xmiId du stéréotype dans la liste");
			if( stereotype.getXmiId().equals(xmiId) ) {
				stereotypeTrouve = stereotype;
			}
		}
		AssertHelper.assertDefined(stereotypeTrouve, "le stereotype recherché n'a pas été trouvé, xmiId = '"+xmiId+"'");
		return stereotypeTrouve;
	}

    public List getListeTag() {
        return this.listeTag;
    }

    public void setListeTag(final List listeTag) {
        this.listeTag.clear();
        for(final Iterator iterTag = listeTag.iterator(); iterTag.hasNext(); ) {
            final IXMITag tag = (IXMITag) iterTag.next();
            this.listeTag.add(tag);
        }
    }

    public void addTag(final IXMITag tag) {
        this.listeTag.add(tag);
    }

    public IXMITag getTagByNom(final String nom) {
        AssertHelper.assertDefined(nom, "nom du tag");
        IXMITag tagTrouve = null;
        for(final Iterator iterTag = this.listeTag.iterator(); iterTag.hasNext() && (tagTrouve == null); ) {
            final IXMITag tag = (IXMITag) iterTag.next();
            AssertHelper.assertDefined(tag.getNom(), "nom du tag dans la liste");
            if( tag.getNom().equals(nom) ) {
                tagTrouve = tag;
            }
        }
        AssertHelper.assertDefined(tagTrouve, "le tag recherché n'a pas été trouvé, nom = '"+nom+"'");
        return tagTrouve;
    }

    public IXMITag getTagByXmiId(final String xmiId) {
        AssertHelper.assertDefined(xmiId, "xmiId du tag");
        IXMITag tagTrouve = null;
        for(final Iterator iterTag = this.listeTag.iterator(); iterTag.hasNext() && (tagTrouve == null); ) {
            final IXMITag tag = (IXMITag) iterTag.next();
            AssertHelper.assertDefined(tag.getXmiId(), "xmiId du tag dans la liste");
            if( tag.getXmiId().equals(xmiId) ) {
                tagTrouve = tag;
            }
        }
        AssertHelper.assertDefined(tagTrouve, "le tag recherché n'a pas été trouvé, xmiId = '"+xmiId+"'");
        return tagTrouve;
    }

	public List getListeDatatype() {
		return this.listeDatatype;
	}

	public void setListeDatatype(final List listeDatatype) {
		this.listeDatatype.clear();
		for(final Iterator iterDatatype = listeDatatype.iterator(); iterDatatype.hasNext(); ) {
			final IXMIDatatype datatype = (IXMIDatatype) iterDatatype.next();
			this.listeDatatype.add(datatype);
		}
	}

	public void addDatatype(final IXMIDatatype datatype) {
		this.listeDatatype.add(datatype);
	}

	public IXMIDatatype getDatatypeByNom(final String nom) {
		AssertHelper.assertDefined(nom, "nom du datatype");
		IXMIDatatype datatypeTrouve = null;
		for(final Iterator iterDatatype = this.listeDatatype.iterator(); iterDatatype.hasNext() && (datatypeTrouve == null); ) {
			final IXMIDatatype datatype = (IXMIDatatype) iterDatatype.next();
			AssertHelper.assertDefined(datatype.getNom(), "nom du datatype dans la liste");
			if( datatype.getNom().equals(nom) ) {
				datatypeTrouve = datatype;
			}
		}
		AssertHelper.assertDefined(datatypeTrouve, "le datatype recherché n'a pas été trouvé, nom = '"+nom+"'");
		return datatypeTrouve;
	}

	public IXMIDatatype getDatatypeByXmiId(final String xmiId) {
		AssertHelper.assertDefined(xmiId, "xmiId du datatype");
		IXMIDatatype datatypeTrouve = null;
		for(final Iterator iterDatatype = this.listeDatatype.iterator(); iterDatatype.hasNext() && (datatypeTrouve == null); ) {
			final IXMIDatatype datatype = (IXMIDatatype) iterDatatype.next();
			AssertHelper.assertDefined(datatype.getXmiId(), "xmiId du datatype dans la liste");
			if( datatype.getXmiId().equals(xmiId) ) {
				datatypeTrouve = datatype;
			}
		}
		AssertHelper.assertDefined(datatypeTrouve, "le datatype recherché n'a pas été trouvé, xmiId = '"+xmiId+"'");
		return datatypeTrouve;
	}

	public List getListePackageFils() {
		return this.listePackageFils;
	}

	public void setListePackageFils(final List listePackageFils) {
		this.listePackageFils.clear();
		for(final Iterator iterPackageFils = listePackageFils.iterator(); iterPackageFils.hasNext(); ) {
			final IXMIPackage packageFils = (IXMIPackage) iterPackageFils.next();
			this.listePackageFils.add(packageFils);
		}
	}

	public void addPackageFils(final IXMIPackage packageFils) {
		this.listePackageFils.add(packageFils);
	}

	public IXMIPackage getPackageFilsByNom(final String nom) {
		AssertHelper.assertDefined(nom, "nom du packageFils");
		IXMIPackage packageFilsTrouve = null;
		for(final Iterator iterPackageFils = this.listePackageFils.iterator(); iterPackageFils.hasNext() && (packageFilsTrouve == null); ) {
			final IXMIPackage packageFils = (IXMIPackage) iterPackageFils.next();
			AssertHelper.assertDefined(packageFils.getNom(), "nom du package fils dans la liste");
			if( packageFils.getNom().equals(nom) ) {
				packageFilsTrouve = packageFils;
			}
		}
		AssertHelper.assertDefined(packageFilsTrouve, "le packageFils recherché n'a pas été trouvé, nom = '"+nom+"'");
		return packageFilsTrouve;
	}

	public IXMIPackage getPackageFilsByXmiId(final String xmiId) {
		AssertHelper.assertDefined(xmiId, "xmiId du packageFils");
		IXMIPackage packageFilsTrouve = null;
		for(final Iterator iterPackageFils = this.listePackageFils.iterator(); iterPackageFils.hasNext() && (packageFilsTrouve == null); ) {
			final IXMIPackage packageFils = (IXMIPackage) iterPackageFils.next();
			AssertHelper.assertDefined(packageFils.getXmiId(), "xmiId du package fils dans la liste");
			if( packageFils.getXmiId().equals(xmiId) ) {
				packageFilsTrouve = packageFils;
			}
		}
		AssertHelper.assertDefined(packageFilsTrouve, "le packageFils recherché n'a pas été trouvé, xmiId = '"+xmiId+"'");
		return packageFilsTrouve;
	}

	public void addAssociation(final IXMIAssociation xmiAssociation) {
		AssertHelper.assertNotNullArgument(xmiAssociation, "l'objet xmiAssociation", "getMapXMIAsociationParXMINoeud");
		this.listeAssociation.add(xmiAssociation);
		final List listeXMIAssociationEnd = xmiAssociation.getListeXMIAssociationEnd();
		AssertHelper.assertDefined(listeXMIAssociationEnd, "liste des XMIAssociationEnd");
		AssertHelper.assertBoolean(listeXMIAssociationEnd.size()>0, "liste des XMIAssociationEnd est vide");
		for(final Iterator iterXMIAssociationEnd = listeXMIAssociationEnd.iterator(); iterXMIAssociationEnd.hasNext(); ) {
			final IXMIAssociationEnd xmiAssociationEnd = (IXMIAssociationEnd) iterXMIAssociationEnd.next();
			final String xmiIdRef = xmiAssociationEnd.getXMIIdRef();
			List listeXMIAssociationPourXMINoeud = null;
			if( this.mapAssociationByXMIIdRef.containsKey(xmiIdRef) ) {
				listeXMIAssociationPourXMINoeud = (List) this.mapAssociationByXMIIdRef.get(xmiIdRef);
			} else {
				listeXMIAssociationPourXMINoeud = new ArrayList();
			}
			listeXMIAssociationPourXMINoeud.add(xmiAssociation);
			this.mapAssociationByXMIIdRef.put(xmiIdRef, listeXMIAssociationPourXMINoeud);
		}
	}

	public List getListeAssociation() {
		return this.listeAssociation;
	}

	public Map getMapAssociationByXMIIdRef() {
		return this.mapAssociationByXMIIdRef;
	}

	public List getAssociationByXMIIdRef(final String xmiIdRef) {
		return (List) this.mapAssociationByXMIIdRef.get(xmiIdRef);
	}

	public void addGeneralisation(final IXMGeneralisation xmGeneralisation) {
		AssertHelper.assertNotNullArgument(xmGeneralisation, "l'objet xmGeneralisation", "getMapXMIAsociationParXMINoeud");
		this.listeGeneralisation.add(xmGeneralisation);
	}

	public List getListeGeneralisation() {
		return this.listeGeneralisation;
	}

}
