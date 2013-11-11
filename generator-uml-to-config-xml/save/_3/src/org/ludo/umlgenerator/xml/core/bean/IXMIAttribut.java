package org.ludo.umlgenerator.xml.core.bean;

import java.util.HashMap;
import java.util.Map;

public interface IXMIAttribut {
	
	public static class Manager {
		private static Map mapXMIAttributByXmiId = new HashMap();
		private static Map mapXMIAttributByGenId = new HashMap();
		public static void addXMIAttributToMap(IXMIAttribut attribut) {
			mapXMIAttributByXmiId.put(attribut.getXmiId(),attribut);
			mapXMIAttributByGenId.put(attribut.getGenId(),attribut);
		}
		public static IXMIAttribut getXMIAttributFromMapByXmiId(String xmiId) {
			return (IXMIAttribut) mapXMIAttributByXmiId.get(xmiId);
		}
		public static IXMIAttribut getXMIAttributFromMapByGenId(String genId) {
			return (IXMIAttribut) mapXMIAttributByGenId.get(genId);
		}
	}

	public abstract String getNom();
	
	public abstract String getGenId();

	public abstract String getXmiId();

	public IXMIDatatype getXmiDatatype();

	public IXMIMultiplicity getXmiMultiplicity();

	public IXMIClasse getXmiClasse();

	public IXMIClasse getXmiClasseParent();
	
}