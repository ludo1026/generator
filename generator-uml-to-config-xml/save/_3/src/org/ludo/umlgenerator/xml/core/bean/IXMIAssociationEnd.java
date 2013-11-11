package org.ludo.umlgenerator.xml.core.bean;

import java.util.HashMap;
import java.util.Map;


public interface IXMIAssociationEnd {
	
	public static class Manager {
		private static Map mapXMIAssociationEndByXmiId = new HashMap();
		public static void addXMIAssociationEndToMap(IXMIAssociationEnd associationEnd) {
			mapXMIAssociationEndByXmiId.put(associationEnd.getXMIIdRef(),associationEnd);
		}
		public static IXMIAssociationEnd getXMIAssociationEndFromMap(String xmiId) {
			return (IXMIAssociationEnd) mapXMIAssociationEndByXmiId.get(xmiId);
		}
	}

	public abstract IXMIAssociation getXMIAssociation();
	
	public abstract String getNomChamp();

	public abstract String getGenId();

	public abstract String getXMIIdRef();
	
	public abstract IXMIClasse getXMIClasseRef();

	public IXMIMultiplicity getXmiMultiplicity();

}