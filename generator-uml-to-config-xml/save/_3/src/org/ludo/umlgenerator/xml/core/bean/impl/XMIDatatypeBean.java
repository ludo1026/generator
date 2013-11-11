package org.ludo.umlgenerator.xml.core.bean.impl;

import org.ludo.umlgenerator.xml.core.bean.IXMIDatatype;
import org.ludo.utils.AssertHelper;
import org.ludo.utils.IdGenerator;

public class XMIDatatypeBean implements IXMIDatatype {
	
	private final String nom;
	private final String genId;
	private final String xmiId;
	
	public XMIDatatypeBean(String nom, String xmiId) {
		AssertHelper.assertDefined(nom,"nom du datatype");
		this.nom = nom;
		this.genId = IdGenerator.getNewId(nom);
		AssertHelper.assertDefined(this.genId,"genId du datatype");
		AssertHelper.assertDefined(xmiId,"xmiId du datatype");
		this.xmiId = xmiId;
		Manager.addXMIDatatypeToMap(this);
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
	
}
