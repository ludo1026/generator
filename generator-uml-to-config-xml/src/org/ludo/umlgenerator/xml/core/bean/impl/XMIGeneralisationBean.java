package org.ludo.umlgenerator.xml.core.bean.impl;

import org.ludo.umlgenerator.xml.core.bean.IXMGeneralisation;
import org.ludo.umlgenerator.xml.core.bean.IXMIType;
import org.ludo.utils.AssertHelper;

public class XMGeneralisationBean implements IXMGeneralisation {
	
	private final IXMIType xmiTypeParent;
	private final IXMIType xmiTypeEnfant;
	
	public XMGeneralisationBean(IXMIType xmiTypeParent, IXMIType xmiTypeEnfant) {
		//AssertHelper.assertDefined(nomChamp,"nom du champ de l'association");
		//AssertHelper.assertNotNull(nomChamp,"nom du champ de l'association");
		this.xmiTypeParent = xmiTypeParent;
		AssertHelper.assertDefined(xmiTypeParent,"type du parent");
		this.xmiTypeEnfant = xmiTypeEnfant;
		AssertHelper.assertDefined(xmiTypeEnfant,"type de l'enfant");
		//Manager.addXMGeneralisationToMap(this);
	}

	public final IXMIType getXmiTypeParent() {
		return xmiTypeParent;
	}

	public final IXMIType getXmiTypeEnfant() {
		return xmiTypeEnfant;
	}
	
}
