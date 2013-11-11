package org.ludo.umlgenerator.xml.core.bean.impl;

import org.ludo.umlgenerator.xml.core.bean.IXMIAssociation;
import org.ludo.umlgenerator.xml.core.bean.IXMIAssociationEnd;
import org.ludo.umlgenerator.xml.core.bean.IXMIClasse;
import org.ludo.umlgenerator.xml.core.bean.IXMIMultiplicity;
import org.ludo.utils.AssertHelper;
import org.ludo.utils.IdGenerator;

public class XMIAssociationEndBean implements IXMIAssociationEnd {
	
	private IXMIAssociation xmiAssociation = null;
	private final String nomChamp;
	private final String genId;
	private final String xmiIdRef;
	private final IXMIClasse xmiClasseRef;
	private final IXMIMultiplicity xmiMultiplicity;
	
	public XMIAssociationEndBean(String nomChamp, String xmiIdRef, IXMIClasse xmiClasseRef, IXMIMultiplicity xmiMultiplicity, IXMIAssociation xmiAssociation) {
		//AssertHelper.assertDefined(nomChamp,"nom du champ de l'association");
		//AssertHelper.assertNotNull(nomChamp,"nom du champ de l'association");
		if(nomChamp==null) {
			this.nomChamp = "";
		} else {
			this.nomChamp = nomChamp;
		}
		AssertHelper.assertDefined(xmiIdRef,"xmiIdRef de l'élément participant à l'association");
		this.xmiIdRef = xmiIdRef;
		AssertHelper.assertDefined(xmiClasseRef,"xmiClasseRef de l'élément participant à l'association");
		this.xmiClasseRef = xmiClasseRef;
		AssertHelper.assertDefined(xmiMultiplicity,"multiplicité de l'attribut");
		this.xmiMultiplicity = xmiMultiplicity;
		AssertHelper.assertDefined(xmiAssociation,"l'association");
		this.xmiAssociation = xmiAssociation;
		this.genId = IdGenerator.getNewId(xmiClasseRef.getGenId()+"."+nomChamp);
		AssertHelper.assertDefined(genId,"genId de l'élément participant à l'association");
		Manager.addXMIAssociationEndToMap(this);
	}

	public String getNomChamp() {
		return nomChamp;
	}

	public String getGenId() {
		return genId;
	}

	public String getXMIIdRef() {
		return xmiIdRef;
	}

	public IXMIClasse getXMIClasseRef() {
		return xmiClasseRef;
	}

	public IXMIMultiplicity getXmiMultiplicity() {
		return xmiMultiplicity;
	}

	public IXMIAssociation getXMIAssociation() {
		return xmiAssociation;
	}
	
}
