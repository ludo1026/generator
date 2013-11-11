package org.ludo.umlgenerator.xml.core.bean.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.ludo.umlgenerator.xml.core.bean.IXMIAttribut;
import org.ludo.umlgenerator.xml.core.bean.IXMIClasse;
import org.ludo.umlgenerator.xml.core.bean.IXMIDatatype;
import org.ludo.umlgenerator.xml.core.bean.IXMIMultiplicity;
import org.ludo.umlgenerator.xml.core.bean.IXMIStereotype;
import org.ludo.umlgenerator.xml.core.bean.IXMITaggedValue;
import org.ludo.umlgenerator.xml.core.bean.IXMIType;
import org.ludo.utils.AssertHelper;
import org.ludo.utils.IdGenerator;

public class XMIAttributBean implements IXMIAttribut {

	private final String nom;
	private final String genId;
	private final String xmiId;
	private final IXMIDatatype xmiDatatype;
	private final IXMIClasse xmiClasse;
	private final IXMIMultiplicity xmiMultiplicity;
	private final IXMIClasse xmiClasseParent;
    private final List listeStereotype = new ArrayList();
    private final List listeTaggedValue = new ArrayList();

	public XMIAttributBean(
						final String nom,
						final String xmiId,
						final IXMIType xmiType,
						final IXMIMultiplicity xmiMultiplicity,
						final IXMIClasse xmiClasseParent) {
		AssertHelper.assertDefined(nom,"nom de l'attribut");
		this.nom = nom;
		AssertHelper.assertDefined(xmiId,"xmiId de l'attribut");
		this.xmiId = xmiId;
		AssertHelper.assertDefined(xmiType,"type de l'attribut");
		if( xmiType instanceof IXMIDatatype ) {
			this.xmiDatatype = (IXMIDatatype) xmiType;
			this.xmiClasse = null;
		}
		else
		if( xmiType instanceof IXMIClasse ) {
			this.xmiClasse = (IXMIClasse) xmiType;
			this.xmiDatatype = null;
		}
		else {
			AssertHelper.assertBoolean(false,"le type de xmiType n'est pas pris en charge");
			this.xmiDatatype = null;
			this.xmiClasse = null;
		}
		AssertHelper.assertDefined(xmiMultiplicity,"multiplicité de l'attribut");
		this.xmiMultiplicity = xmiMultiplicity;
		AssertHelper.assertDefined(xmiClasseParent,"classe contenant l'attribut");
		this.xmiClasseParent = xmiClasseParent;
		this.genId = IdGenerator.getNewId(xmiClasseParent.getGenId()+"."+nom);
		AssertHelper.assertDefined(this.genId,"genId de l'attribut");
		Manager.addXMIAttributToMap(this);
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
            AssertHelper.assertDefined(taggedValue.getValeur(), "valeur du stéréotype dans la liste");
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

	public String getNom() {
		return this.nom;
	}

	public String getGenId() {
		return this.genId;
	}

	public String getXmiId() {
		return this.xmiId;
	}

	public IXMIDatatype getXmiDatatype() {
		return this.xmiDatatype;
	}

	public IXMIMultiplicity getXmiMultiplicity() {
		return this.xmiMultiplicity;
	}

	public IXMIClasse getXmiClasse() {
		return this.xmiClasse;
	}

	public IXMIClasse getXmiClasseParent() {
		return this.xmiClasseParent;
	}

}
