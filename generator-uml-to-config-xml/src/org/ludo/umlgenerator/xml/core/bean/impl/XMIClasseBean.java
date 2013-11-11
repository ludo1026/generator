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
import org.ludo.umlgenerator.xml.core.bean.IXMITaggedValue;
import org.ludo.utils.AssertHelper;
import org.ludo.utils.IdGenerator;

public class XMIClasseBean implements IXMIClasse {

	private final String nom;
	private final String genId;
	private final String xmiId;
	private final IXMIPackage packageParent;
	private final List listeStereotype = new ArrayList();
    private final List listeTaggedValue = new ArrayList();
	private final List listeAttribut = new ArrayList();
	private final List listeOperation = new ArrayList();
	private final List listeAssociationEnd = new ArrayList();
	private final List listeClasseParent = new ArrayList();

	public XMIClasseBean(final String nom, final String xmiId, final IXMIPackage packageParent) {
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

    public List getListeTaggedValue() {
        return this.listeTaggedValue;
    }

    public void setListeTaggedValue(final List listeTaggedValue) {
        this.listeTaggedValue.clear();
        for(final Iterator iterTaggedValue = listeTaggedValue.iterator(); iterTaggedValue.hasNext(); ) {
            final IXMITaggedValue taggedValue = (IXMITaggedValue) iterTaggedValue.next();
            this.listeTaggedValue.add(taggedValue);
        }
    }

    public void addTaggedValue(final IXMITaggedValue taggedValue) {
        this.listeTaggedValue.add(taggedValue);
    }

    public IXMITaggedValue getTaggedValueByValeur(final String valeur) {
        AssertHelper.assertDefined(valeur, "valeur du taggedValue");
        IXMITaggedValue taggedValueTrouve = null;
        for(final Iterator iterTaggedValue = this.listeTaggedValue.iterator(); iterTaggedValue.hasNext() && (taggedValueTrouve == null); ) {
            final IXMITaggedValue taggedValue = (IXMITaggedValue) iterTaggedValue.next();
            AssertHelper.assertDefined(taggedValue.getValeur(), "valeur du taggedValue dans la liste");
            if( taggedValue.getValeur().equals(valeur) ) {
                taggedValueTrouve = taggedValue;
            }
        }
        AssertHelper.assertDefined(taggedValueTrouve, "le taggedValue recherché n'a pas été trouvé, valeur = '"+valeur+"'");
        return taggedValueTrouve;
    }

    public IXMITaggedValue getTaggedValueByXmiId(final String xmiId) {
        AssertHelper.assertDefined(xmiId, "xmiId du taggedValue");
        IXMITaggedValue taggedValueTrouve = null;
        for(final Iterator iterTaggedValue = this.listeTaggedValue.iterator(); iterTaggedValue.hasNext() && (taggedValueTrouve == null); ) {
            final IXMITaggedValue taggedValue = (IXMITaggedValue) iterTaggedValue.next();
            AssertHelper.assertDefined(taggedValue.getXmiId(), "xmiId du stéréotype dans la liste");
            if( taggedValue.getXmiId().equals(xmiId) ) {
                taggedValueTrouve = taggedValue;
            }
        }
        AssertHelper.assertDefined(taggedValueTrouve, "le taggedValue recherché n'a pas été trouvé, xmiId = '"+xmiId+"'");
        return taggedValueTrouve;
    }

	public List getListeAttribut() {
		return this.listeAttribut;
	}

	public void setListeAttribut(final List listeAttribut) {
		this.listeAttribut.clear();
		for(final Iterator iterAttribut = listeAttribut.iterator(); iterAttribut.hasNext(); ) {
			final IXMIAttribut attribut = (IXMIAttribut) iterAttribut.next();
			this.listeAttribut.add(attribut);
		}
	}

	public void addAttribut(final IXMIAttribut attribut) {
		this.listeAttribut.add(attribut);
	}

	public IXMIAttribut getAttributByNom(final String nom) {
		AssertHelper.assertDefined(nom, "nom du attribut");
		IXMIAttribut attributTrouve = null;
		for(final Iterator iterAttribut = this.listeAttribut.iterator(); iterAttribut.hasNext() && (attributTrouve == null); ) {
			final IXMIAttribut attribut = (IXMIAttribut) iterAttribut.next();
			AssertHelper.assertDefined(attribut.getNom(), "nom de l'attribut dans la liste");
			if( attribut.getNom().equals(nom) ) {
				attributTrouve = attribut;
			}
		}
		AssertHelper.assertDefined(attributTrouve, "le attribut recherché n'a pas été trouvé, nom = '"+nom+"'");
		return attributTrouve;
	}

	public IXMIAttribut getAttributByXmiId(final String xmiId) {
		AssertHelper.assertDefined(xmiId, "xmiId du attribut");
		IXMIAttribut attributTrouve = null;
		for(final Iterator iterAttribut = this.listeAttribut.iterator(); iterAttribut.hasNext() && (attributTrouve == null); ) {
			final IXMIAttribut attribut = (IXMIAttribut) iterAttribut.next();
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

	public void setListeOperation(final List listeOperation) {
		this.listeOperation.clear();
		for(final Iterator iterOperation = listeOperation.iterator(); iterOperation.hasNext(); ) {
			final IXMIOperation operation = (IXMIOperation) iterOperation.next();
			this.listeOperation.add(operation);
		}
	}

	public void addOperation(final IXMIOperation operation) {
		this.listeOperation.add(operation);
	}

	public IXMIOperation getOperationByNom(final String nom) {
		AssertHelper.assertDefined(nom, "nom du operation");
		IXMIOperation operationTrouve = null;
		for(final Iterator iterOperation = this.listeOperation.iterator(); iterOperation.hasNext() && (operationTrouve == null); ) {
			final IXMIOperation operation = (IXMIOperation) iterOperation.next();
			AssertHelper.assertDefined(operation.getNom(), "nom de l'operation dans la liste");
			if( operation.getNom().equals(nom) ) {
				operationTrouve = operation;
			}
		}
		AssertHelper.assertDefined(operationTrouve, "l'operation recherchée n'a pas été trouvée, nom = '"+nom+"'");
		return operationTrouve;
	}

	public IXMIOperation getOperationByXmiId(final String xmiId) {
		AssertHelper.assertDefined(xmiId, "xmiId du operation");
		IXMIOperation operationTrouve = null;
		for(final Iterator iterOperation = this.listeOperation.iterator(); iterOperation.hasNext() && (operationTrouve == null); ) {
			final IXMIOperation operation = (IXMIOperation) iterOperation.next();
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

	public void setListeAssociationEnd(final List listeAssociationEnd) {
		this.listeAssociationEnd.clear();
		for(final Iterator iterAssociationEnd = listeAssociationEnd.iterator(); iterAssociationEnd.hasNext(); ) {
			final IXMIAssociationEnd associationEnd = (IXMIAssociationEnd) iterAssociationEnd.next();
			this.listeAssociationEnd.add(associationEnd);
		}
	}

	public void addAssociationEnd(final IXMIAssociationEnd associationEnd) {
		this.listeAssociationEnd.add(associationEnd);
	}


	public List getListeClasseParent() {
		return this.listeClasseParent;
	}

	public void setListeClasseParent(final List listeClasseParent) {
		this.listeClasseParent.clear();
		for(final Iterator iterClasseParent = listeClasseParent.iterator(); iterClasseParent.hasNext(); ) {
			final IXMIClasse classeParent = (IXMIClasse) iterClasseParent.next();
			this.listeClasseParent.add(classeParent);
		}
	}

	public void addClasseParent(final IXMIClasse classeParent) {
		this.listeClasseParent.add(classeParent);
	}

}
