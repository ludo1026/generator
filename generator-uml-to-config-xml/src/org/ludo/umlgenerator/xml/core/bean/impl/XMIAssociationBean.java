package org.ludo.umlgenerator.xml.core.bean.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.ludo.umlgenerator.xml.core.bean.IXMIAssociation;
import org.ludo.umlgenerator.xml.core.bean.IXMIAssociationEnd;
import org.ludo.utils.AssertHelper;

public class XMIAssociationBean implements IXMIAssociation {
	
	private final String xmiId;
	private final List listeXMIAssociationEnd = new ArrayList();
	
	public XMIAssociationBean(String xmiId) {
		AssertHelper.assertDefined(xmiId, "xmiId");
		this.xmiId = xmiId;
		/*
		AssertHelper.assertDefined(listeXMIAssociationEnd,"liste des participants de l'association n'est pas définie");
		AssertHelper.assertBoolean(listeXMIAssociationEnd.size()>1,"le nombre de participants à l'association n'est pas supérieur à 1");
		if( listeXMIAssociationEnd != null ) {
			for(Iterator iterXMIAssociationEnd = listeXMIAssociationEnd.iterator(); iterXMIAssociationEnd.hasNext(); ) {
				Object objectXMIAssociationEnd = iterXMIAssociationEnd.next();
				AssertHelper.assertInstanceOf(objectXMIAssociationEnd, XMIAssociationEndBean.class, "objet d'un participant de la liste");
				IXMIAssociationEnd xmiAssociationEnd = (IXMIAssociationEnd) objectXMIAssociationEnd;
				this.listeXMIAssociationEnd.add(xmiAssociationEnd);
			}
		}
		*/
		Manager.addXMIAssociationToMap(this);
	}
	
	public String getXmiId() {
		return xmiId;
	}
	
	public void addXMIAssociationEnd(IXMIAssociationEnd xmiAssociationEnd) {
		this.listeXMIAssociationEnd.add(xmiAssociationEnd);
	}
	
	public List getListeXMIAssociationEnd() {
		return listeXMIAssociationEnd;
	}
	
	public IXMIAssociationEnd getXMIAssociationEndByXMIIdRef(String xmiIdRef) {
		IXMIAssociationEnd xmiAssociationEndTrouve = null;
		for(Iterator iterXMIAssociationEnd = listeXMIAssociationEnd.iterator(); iterXMIAssociationEnd.hasNext(); ) {
			IXMIAssociationEnd xmiAssociationEnd = (IXMIAssociationEnd) iterXMIAssociationEnd.next();
			if( xmiIdRef.equals(xmiAssociationEnd.getXMIIdRef()) ) {
				xmiAssociationEndTrouve = xmiAssociationEnd;
			}
		}
		AssertHelper.assertDefined(xmiAssociationEndTrouve, "l'objet xmiAssociationEnd correspondant au code xmiIdRef = '"+xmiIdRef+"'");
		return xmiAssociationEndTrouve;
	}
	
	public List getListeXMIAssociationEndByNotEqualToXMIIdRef(String xmiIdRef) {
		List listeXMIAssociationEndNotEqualToXMIIdRef = new ArrayList();
		for(Iterator iterXMIAssociationEnd = listeXMIAssociationEnd.iterator(); iterXMIAssociationEnd.hasNext(); ) {
			IXMIAssociationEnd xmiAssociationEnd = (IXMIAssociationEnd) iterXMIAssociationEnd.next();
			if( ! xmiIdRef.equals(xmiAssociationEnd.getXMIIdRef()) ) {
				listeXMIAssociationEndNotEqualToXMIIdRef.add(xmiAssociationEnd);
			}
		}
		return listeXMIAssociationEndNotEqualToXMIIdRef;
	}
	
}
