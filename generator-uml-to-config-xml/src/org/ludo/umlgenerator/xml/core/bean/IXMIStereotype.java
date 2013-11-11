package org.ludo.umlgenerator.xml.core.bean;

import java.util.HashMap;
import java.util.Map;

public interface IXMIStereotype {
	
	public static class Manager {
		private static Map mapXMIStereotypeByXmiId = new HashMap();
		public static void addXMIStereotypeToMap(IXMIStereotype stereotype) {
			mapXMIStereotypeByXmiId.put(stereotype.getXmiId(),stereotype);
		}
		public static IXMIStereotype getXMIStereotypeFromMapByXmiId(String xmiId) {
			return (IXMIStereotype) mapXMIStereotypeByXmiId.get(xmiId);
		}
	}
	
	public String getNom();
	
	public String getXmiId();
	
}