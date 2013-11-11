package org.ludo.umlgenerator.xml.core.bean.impl;

import org.ludo.umlgenerator.xml.core.bean.IXMIClasse;
import org.ludo.umlgenerator.xml.core.bean.IXMIDatatype;
import org.ludo.umlgenerator.xml.core.bean.IXMIOperation;
import org.ludo.umlgenerator.xml.core.bean.IXMIParametre;
import org.ludo.umlgenerator.xml.core.bean.IXMIType;
import org.ludo.utils.AssertHelper;
import org.ludo.utils.IdGenerator;

public class XMIParametreBean implements IXMIParametre {
	
	private final String nom;
	private final String genId;
	private final String xmiId;
	private final IXMIDatatype xmiDatatype;
	private final IXMIClasse xmiClasse;
	private final IXMIOperation xmiOperation;
	
	public XMIParametreBean(
				String nom,
				String xmiId,
				IXMIType xmiType,
				IXMIOperation xmiOperation
			) {
		AssertHelper.assertDefined(nom, "nom du paramètre");
		this.nom = nom;
		AssertHelper.assertDefined(nom, "xmiId du paramètre");
		this.xmiId = xmiId;
		AssertHelper.assertDefined(xmiType,"type du paramètre");
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
		AssertHelper.assertDefined(xmiOperation, "opération contenant le paramètre");
		this.xmiOperation = xmiOperation;
		this.genId = IdGenerator.getNewId(xmiOperation.getGenId()+"."+nom);
		AssertHelper.assertDefined(this.genId,"genId du paramètre");
		Manager.addXMIParametreToMap(this);
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
		return xmiDatatype;
	}

	public IXMIClasse getXmiClasse() {
		return xmiClasse;
	}

	public IXMIOperation getXmiOperation() {
		return xmiOperation;
	}
	
}
