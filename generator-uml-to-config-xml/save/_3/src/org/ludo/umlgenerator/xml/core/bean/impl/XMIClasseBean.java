package org.ludo.umlgenerator.xml.core.bean.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.ludo.umlgenerator.xml.core.bean.IXMIAssociationEnd;
import org.ludo.umlgenerator.xml.core.bean.IXMIAttribut;
import org.ludo.umlgenerator.xml.core.bean.IXMIClasse;
import org.ludo.umlgenerator.xml.core.bean.IXMIOperation;
import org.ludo.umlgenerator.xml.core.bean.IXMIPackage;
import org.ludo.umlgenerator.xml.core.bean.IXMIStereotype;
import org.ludo.utils.AssertHelper;
import org.ludo.utils.IdGenerator;

public class XMIClasseBean implements IXMIClasse {
	
	private final String nom;
	private final String genId;
	private final String xmiId;
	private final IXMIPackage packageParent;
	private final List listeStereotype = new ArrayList();
	private final List listeAttribut = new ArrayList();
	private final List listeOperation = new ArrayList();
	private final List listeAssociationEnd = new ArrayList();
	private final List listeClasseParent = new ArrayList();
	
	public XMIClasseBean(String nom, String xmiId, IXMIPackage packageParent) {
		AssertHelper.assertDefined(nom,"nom de la classe");
		this.nom = nom;
		this.genId = IdGenerator.getNewId(nom);
		AssertHelper.assertDefined(this.genId,"genId de la classe");
		AssertHelper.assertDefined(xmiId,"xmiId de la classe");
		this.xmiId = xmiId;
		AssertHelper.assertDefined(packageParent,"package parent de la classe");
		this.packageParent = packageParent;
		Manager.addXMIClasseToMap(this);
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getGenId() {
		return this.genId;
	}
	
	public String getXmiId() {
		return this.xmiId;
	}
	
	public IXMIPackage getPackageParent() {
		return this.packageParent;
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
	
	public List getListeAttribut() {
		return this.listeAttribut;
	}
	
	public void setListeAttribut(List listeAttribut) {
		this.listeAttribut.clear();
		for(Iterator iterAttribut = listeAttribut.iterator(); iterAttribut.hasNext(); ) {
			IXMIAttribut attribut = (IXMIAttribut) iterAttribut.next();
			this.listeAttribut.add(attribut);
		}
	}
	
	public void addAttribut(IXMIAttribut attribut) {
		listeAttribut.add(attribut);
	}
	
	public IXMIAttribut getAttributByNom(String nom) {
		AssertHelper.assertDefined(nom, "nom du attribut");
		IXMIAttribut attributTrouve = null;
		for(Iterator iterAttribut = listeAttribut.iterator(); iterAttribut.hasNext() && attributTrouve == null; ) {
			IXMIAttribut attribut = (IXMIAttribut) iterAttribut.next();
			AssertHelper.assertDefined(attribut.getNom(), "nom de l'attribut dans la liste");
			if( attribut.getNom().equals(nom) ) {
				attributTrouve = attribut;
			}
		}
		AssertHelper.assertDefined(attributTrouve, "le attribut recherché n'a pas été trouvé, nom = '"+nom+"'");
		return attributTrouve;
	}
	
	public IXMIAttribut getAttributByXmiId(String xmiId) {
		AssertHelper.assertDefined(xmiId, "xmiId du attribut");
		IXMIAttribut attributTrouve = null;
		for(Iterator iterAttribut = listeAttribut.iterator(); iterAttribut.hasNext() && attributTrouve == null; ) {
			IXMIAttribut attribut = (IXMIAttribut) iterAttribut.next();
			AssertHelper.assertDefined(attribut.getXmiId(), "xmiId de l'attribut dans la liste");
			if( attribut.getXmiId().equals(xmiId) ) {
				attributTrouve = attribut;
			}
		}
		AssertHelper.assertDefined(attributTrouve, "le attribut recherché n'a pas été trouvé, xmiId = '"+xmiId+"'");
		return attributTrouve;
	}
	
	public List getListeOperation() {
		return this.listeOperation;
	}
	
	public void setListeOperation(List listeOperation) {
		this.listeOperation.clear();
		for(Iterator iterOperation = listeOperation.iterator(); iterOperation.hasNext(); ) {
			IXMIOperation operation = (IXMIOperation) iterOperation.next();
			this.listeOperation.add(operation);
		}
	}
	
	public void addOperation(IXMIOperation operation) {
		listeOperation.add(operation);
	}
	
	public IXMIOperation getOperationByNom(String nom) {
		AssertHelper.assertDefined(nom, "nom du operation");
		IXMIOperation operationTrouve = null;
		for(Iterator iterOperation = listeOperation.iterator(); iterOperation.hasNext() && operationTrouve == null; ) {
			IXMIOperation operation = (IXMIOperation) iterOperation.next();
			AssertHelper.assertDefined(operation.getNom(), "nom de l'operation dans la liste");
			if( operation.getNom().equals(nom) ) {
				operationTrouve = operation;
			}
		}
		AssertHelper.assertDefined(operationTrouve, "l'operation recherchée n'a pas été trouvée, nom = '"+nom+"'");
		return operationTrouve;
	}
	
	public IXMIOperation getOperationByXmiId(String xmiId) {
		AssertHelper.assertDefined(xmiId, "xmiId du operation");
		IXMIOperation operationTrouve = null;
		for(Iterator iterOperation = listeOperation.iterator(); iterOperation.hasNext() && operationTrouve == null; ) {
			IXMIOperation operation = (IXMIOperation) iterOperation.next();
			AssertHelper.assertDefined(operation.getXmiId(), "xmiId de l'operation dans la liste");
			if( operation.getXmiId().equals(xmiId) ) {
				operationTrouve = operation;
			}
		}
		AssertHelper.assertDefined(operationTrouve, "l'operation recherchée n'a pas été trouvée, xmiId = '"+xmiId+"'");
		return operationTrouve;
	}
	
	
	public List getListeAssociationEnd() {
		return this.listeAssociationEnd;
	}
	
	public void setListeAssociationEnd(List listeAssociationEnd) {
		this.listeAssociationEnd.clear();
		for(Iterator iterAssociationEnd = listeAssociationEnd.iterator(); iterAssociationEnd.hasNext(); ) {
			IXMIAssociationEnd associationEnd = (IXMIAssociationEnd) iterAssociationEnd.next();
			this.listeAssociationEnd.add(associationEnd);
		}
	}
	
	public void addAssociationEnd(IXMIAssociationEnd associationEnd) {
		listeAssociationEnd.add(associationEnd);
	}
	
	
	public List getListeClasseParent() {
		return this.listeClasseParent;
	}
	
	public void setListeClasseParent(List listeClasseParent) {
		this.listeClasseParent.clear();
		for(Iterator iterClasseParent = listeClasseParent.iterator(); iterClasseParent.hasNext(); ) {
			IXMIClasse classeParent = (IXMIClasse) iterClasseParent.next();
			this.listeClasseParent.add(classeParent);
		}
	}
	
	public void addClasseParent(IXMIClasse classeParent) {
		listeClasseParent.add(classeParent);
	}
	
}
