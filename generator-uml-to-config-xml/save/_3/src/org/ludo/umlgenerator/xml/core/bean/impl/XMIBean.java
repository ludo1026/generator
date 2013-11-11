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
import org.ludo.utils.AssertHelper;


public class XMIBean implements IXMI {
	
	private final List listeStereotype = new ArrayList();
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
	
	public void setListeStereotype(List listeStereotype) {
		this.listeStereotype.clear();
		for(Iterator iterStereotype = listeStereotype.iterator(); iterStereotype.hasNext(); ) {
			IXMIStereotype stereotype = (IXMIStereotype) iterStereotype.next();
			this.listeStereotype.add(stereotype);
		}
	}
	
	public void addStereotype(IXMIStereotype stereotype) {
		listeStereotype.add(stereotype);
	}
	
	public IXMIStereotype getStereotypeByNom(String nom) {
		AssertHelper.assertDefined(nom, "nom du stereotype");
		IXMIStereotype stereotypeTrouve = null;
		for(Iterator iterStereotype = listeStereotype.iterator(); iterStereotype.hasNext() && stereotypeTrouve == null; ) {
			IXMIStereotype stereotype = (IXMIStereotype) iterStereotype.next();
			AssertHelper.assertDefined(stereotype.getNom(), "nom du stéréotype dans la liste");
			if( stereotype.getNom().equals(nom) ) {
				stereotypeTrouve = stereotype;
			}
		}
		AssertHelper.assertDefined(stereotypeTrouve, "le stereotype recherché n'a pas été trouvé, nom = '"+nom+"'");
		return stereotypeTrouve;
	}
	
	public IXMIStereotype getStereotypeByXmiId(String xmiId) {
		AssertHelper.assertDefined(xmiId, "xmiId du stereotype");
		IXMIStereotype stereotypeTrouve = null;
		for(Iterator iterStereotype = listeStereotype.iterator(); iterStereotype.hasNext() && stereotypeTrouve == null; ) {
			IXMIStereotype stereotype = (IXMIStereotype) iterStereotype.next();
			AssertHelper.assertDefined(stereotype.getXmiId(), "xmiId du stéréotype dans la liste");
			if( stereotype.getXmiId().equals(xmiId) ) {
				stereotypeTrouve = stereotype;
			}
		}
		AssertHelper.assertDefined(stereotypeTrouve, "le stereotype recherché n'a pas été trouvé, xmiId = '"+xmiId+"'");
		return stereotypeTrouve;
	}
	
	public List getListeDatatype() {
		return this.listeDatatype;
	}
	
	public void setListeDatatype(List listeDatatype) {
		this.listeDatatype.clear();
		for(Iterator iterDatatype = listeDatatype.iterator(); iterDatatype.hasNext(); ) {
			IXMIDatatype datatype = (IXMIDatatype) iterDatatype.next();
			this.listeDatatype.add(datatype);
		}
	}
	
	public void addDatatype(IXMIDatatype datatype) {
		listeDatatype.add(datatype);
	}
	
	public IXMIDatatype getDatatypeByNom(String nom) {
		AssertHelper.assertDefined(nom, "nom du datatype");
		IXMIDatatype datatypeTrouve = null;
		for(Iterator iterDatatype = listeDatatype.iterator(); iterDatatype.hasNext() && datatypeTrouve == null; ) {
			IXMIDatatype datatype = (IXMIDatatype) iterDatatype.next();
			AssertHelper.assertDefined(datatype.getNom(), "nom du datatype dans la liste");
			if( datatype.getNom().equals(nom) ) {
				datatypeTrouve = datatype;
			}
		}
		AssertHelper.assertDefined(datatypeTrouve, "le datatype recherché n'a pas été trouvé, nom = '"+nom+"'");
		return datatypeTrouve;
	}
	
	public IXMIDatatype getDatatypeByXmiId(String xmiId) {
		AssertHelper.assertDefined(xmiId, "xmiId du datatype");
		IXMIDatatype datatypeTrouve = null;
		for(Iterator iterDatatype = listeDatatype.iterator(); iterDatatype.hasNext() && datatypeTrouve == null; ) {
			IXMIDatatype datatype = (IXMIDatatype) iterDatatype.next();
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
	
	public void setListePackageFils(List listePackageFils) {
		this.listePackageFils.clear();
		for(Iterator iterPackageFils = listePackageFils.iterator(); iterPackageFils.hasNext(); ) {
			IXMIPackage packageFils = (IXMIPackage) iterPackageFils.next();
			this.listePackageFils.add(packageFils);
		}
	}
	
	public void addPackageFils(IXMIPackage packageFils) {
		listePackageFils.add(packageFils);
	}
	
	public IXMIPackage getPackageFilsByNom(String nom) {
		AssertHelper.assertDefined(nom, "nom du packageFils");
		IXMIPackage packageFilsTrouve = null;
		for(Iterator iterPackageFils = listePackageFils.iterator(); iterPackageFils.hasNext() && packageFilsTrouve == null; ) {
			IXMIPackage packageFils = (IXMIPackage) iterPackageFils.next();
			AssertHelper.assertDefined(packageFils.getNom(), "nom du package fils dans la liste");
			if( packageFils.getNom().equals(nom) ) {
				packageFilsTrouve = packageFils;
			}
		}
		AssertHelper.assertDefined(packageFilsTrouve, "le packageFils recherché n'a pas été trouvé, nom = '"+nom+"'");
		return packageFilsTrouve;
	}
	
	public IXMIPackage getPackageFilsByXmiId(String xmiId) {
		AssertHelper.assertDefined(xmiId, "xmiId du packageFils");
		IXMIPackage packageFilsTrouve = null;
		for(Iterator iterPackageFils = listePackageFils.iterator(); iterPackageFils.hasNext() && packageFilsTrouve == null; ) {
			IXMIPackage packageFils = (IXMIPackage) iterPackageFils.next();
			AssertHelper.assertDefined(packageFils.getXmiId(), "xmiId du package fils dans la liste");
			if( packageFils.getXmiId().equals(xmiId) ) {
				packageFilsTrouve = packageFils;
			}
		}
		AssertHelper.assertDefined(packageFilsTrouve, "le packageFils recherché n'a pas été trouvé, xmiId = '"+xmiId+"'");
		return packageFilsTrouve;
	}

	public void addAssociation(IXMIAssociation xmiAssociation) {
		AssertHelper.assertNotNullArgument(xmiAssociation, "l'objet xmiAssociation", "getMapXMIAsociationParXMINoeud");
		listeAssociation.add(xmiAssociation);
		List listeXMIAssociationEnd = xmiAssociation.getListeXMIAssociationEnd();
		AssertHelper.assertDefined(listeXMIAssociationEnd, "liste des XMIAssociationEnd");
		AssertHelper.assertBoolean(listeXMIAssociationEnd.size()>0, "liste des XMIAssociationEnd est vide");
		for(Iterator iterXMIAssociationEnd = listeXMIAssociationEnd.iterator(); iterXMIAssociationEnd.hasNext(); ) {
			IXMIAssociationEnd xmiAssociationEnd = (IXMIAssociationEnd) iterXMIAssociationEnd.next();
			String xmiIdRef = xmiAssociationEnd.getXMIIdRef();
			List listeXMIAssociationPourXMINoeud = null;
			if( mapAssociationByXMIIdRef.containsKey(xmiIdRef) ) {
				listeXMIAssociationPourXMINoeud = (List) mapAssociationByXMIIdRef.get(xmiIdRef);
			} else {
				listeXMIAssociationPourXMINoeud = new ArrayList();
			}
			listeXMIAssociationPourXMINoeud.add(xmiAssociation);
			mapAssociationByXMIIdRef.put(xmiIdRef, listeXMIAssociationPourXMINoeud);
		}
	}
	
	public List getListeAssociation() {
		return listeAssociation;
	}

	public Map getMapAssociationByXMIIdRef() {
		return mapAssociationByXMIIdRef;
	}

	public List getAssociationByXMIIdRef(String xmiIdRef) {
		return (List) mapAssociationByXMIIdRef.get(xmiIdRef);
	}

	public void addGeneralisation(IXMGeneralisation xmGeneralisation) {
		AssertHelper.assertNotNullArgument(xmGeneralisation, "l'objet xmGeneralisation", "getMapXMIAsociationParXMINoeud");
		listeGeneralisation.add(xmGeneralisation);
	}
	
	public List getListeGeneralisation() {
		return listeGeneralisation;
	}
	
}
