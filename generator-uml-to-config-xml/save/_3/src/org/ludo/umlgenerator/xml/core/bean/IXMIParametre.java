package org.ludo.umlgenerator.xml.core.bean;

import java.util.HashMap;
import java.util.Map;

public interface IXMIParametre {
	
	public static class Manager {
		private static Map mapXMIParametreByXmiId = new HashMap();
		private static Map mapXMIParametreByGenId = new HashMap();
		public static void addXMIParametreToMap(IXMIParametre parametre) {
			mapXMIParametreByXmiId.put(parametre.getXmiId(),parametre);
			mapXMIParametreByXmiId.put(parametre.getGenId(),parametre);
		}
		public static IXMIParametre getXMIParametreFromMapByXmiId(String xmiId) {
			return (IXMIParametre) mapXMIParametreByXmiId.get(xmiId);
		}
		public static IXMIParametre getXMIParametreFromMapByGenId(String genId) {
			return (IXMIParametre) mapXMIParametreByGenId.get(genId);
		}
	}

	public abstract String getNom();
	
	public abstract String getGenId();

	public abstract String getXmiId();
	
	public IXMIDatatype getXmiDatatype();

	public IXMIClasse getXmiClasse();

	public IXMIOperation getXmiOperation();
}