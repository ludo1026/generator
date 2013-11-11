package org.ludo.umlgenerator.xml.core.bean.impl;

import org.ludo.umlgenerator.xml.core.bean.IXMITag;
import org.ludo.utils.AssertHelper;

public class XMITagBean implements IXMITag {

	private final String nom;
	private final String xmiId;

	public XMITagBean(final String nom, final String xmiId) {
		AssertHelper.assertDefined(nom, "nom du tag à créer");
		this.nom = nom;
		AssertHelper.assertDefined(xmiId, "xmiId du tag à créer");
		this.xmiId = xmiId;
		Manager.addXMITagToMap(this);
	}

	public String getNom() {
		return this.nom;
	}

	public String getXmiId() {
		return this.xmiId;
	}

}
