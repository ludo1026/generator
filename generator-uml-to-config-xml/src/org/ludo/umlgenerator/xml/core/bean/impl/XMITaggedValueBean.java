package org.ludo.umlgenerator.xml.core.bean.impl;

import org.ludo.umlgenerator.xml.core.bean.IXMITag;
import org.ludo.umlgenerator.xml.core.bean.IXMITaggedValue;
import org.ludo.utils.AssertHelper;

public class XMITaggedValueBean implements IXMITaggedValue {

	private final String valeur;
	private final String xmiId;
	private final IXMITag tag;

	public XMITaggedValueBean(final String valeur, final String xmiId, final IXMITag tag) {
		//AssertHelper.assertDefined(valeur, "valeur du taggedValue à créer");
		this.valeur = valeur;
		AssertHelper.assertDefined(xmiId, "xmiId du taggedValue à créer");
		this.xmiId = xmiId;
        AssertHelper.assertDefined(tag, "tag du taggedValue à créer");
        this.tag = tag;
		Manager.addXMITaggedValueToMap(this);
	}

	public String getValeur() {
		return this.valeur;
	}

	public String getXmiId() {
		return this.xmiId;
	}

    public IXMITag getTag() {
        return this.tag;
    }

}
