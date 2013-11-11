package org.ludo.umlgenerator.xml.core.bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface IXMIAssociation {
	
	public static class Manager {
		private static Map mapXMIAssociationByXmiId = new HashMap();
		public static void addXMIAssociationToMap(IXMIAssociation association) {
			mapXMIAssociationByXmiId.put(association.getXmiId(),association);
		}
		public static IXMIAssociation getXMIAssociationFromMap(String xmiId) {
			return (IXMIAssociation) mapXMIAssociationByXmiId.get(xmiId);
		}
	}
	
	public String getXmiId();
	
	public void addXMIAssociationEnd(IXMIAssociationEnd xmiAssociationEnd);
	
	public abstract List getListeXMIAssociationEnd();
	
	public IXMIAssociationEnd getXMIAssociationEndByXMIIdRef(String xmiIdRef);
	
	public List getListeXMIAssociationEndByNotEqualToXMIIdRef(String xmiIdRef);

}