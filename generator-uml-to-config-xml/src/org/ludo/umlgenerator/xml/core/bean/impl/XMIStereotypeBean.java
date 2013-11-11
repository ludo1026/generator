package org.ludo.umlgenerator.xml.core.bean.impl;

import org.ludo.umlgenerator.xml.core.bean.IXMIStereotype;
import org.ludo.utils.AssertHelper;

public class XMIStereotypeBean implements IXMIStereotype {
	
	private final String nom;
	private final String xmiId;
	
	public XMIStereotypeBean(String nom, String xmiId) {
		AssertHelper.assertDefined(nom, "nom du stereotype à créer");
		this.nom = nom;
		AssertHelper.assertDefined(xmiId, "xmiId du stereotype à créer");
		this.xmiId = xmiId;
		Manager.addXMIStereotypeToMap(this);
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getXmiId() {
		return this.xmiId;
	}
	
}
