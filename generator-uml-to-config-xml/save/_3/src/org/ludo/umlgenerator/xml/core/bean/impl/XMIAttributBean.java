package org.ludo.umlgenerator.xml.core.bean.impl;

import org.ludo.umlgenerator.xml.core.bean.IXMIAttribut;
import org.ludo.umlgenerator.xml.core.bean.IXMIClasse;
import org.ludo.umlgenerator.xml.core.bean.IXMIDatatype;
import org.ludo.umlgenerator.xml.core.bean.IXMIMultiplicity;
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
	
	public XMIAttributBean(
						String nom,
						String xmiId,
						IXMIType xmiType,
						IXMIMultiplicity xmiMultiplicity,
						IXMIClasse xmiClasseParent) {
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
	
	public String getNom() {
		return nom;
	}

	public String getGenId() {
		return genId;
	}

	public String getXmiId() {
		return xmiId;
	}

	public IXMIDatatype getXmiDatatype() {
		return xmiDatatype;
	}

	public IXMIMultiplicity getXmiMultiplicity() {
		return xmiMultiplicity;
	}

	public IXMIClasse getXmiClasse() {
		return xmiClasse;
	}

	public IXMIClasse getXmiClasseParent() {
		return xmiClasseParent;
	}
	
}
