package org.ludo.umlgenerator.xml.core.bean;

import java.util.HashMap;
import java.util.Map;

public interface IXMIDatatype extends IXMIType {
	
	public static class Manager {
		private static Map mapXMIDatatypeByXmiId = new HashMap();
		private static Map mapXMIDatatypeByGenId = new HashMap();
		public static void addXMIDatatypeToMap(IXMIDatatype datatype) {
			mapXMIDatatypeByXmiId.put(datatype.getXmiId(),datatype);
			mapXMIDatatypeByGenId.put(datatype.getGenId(),datatype);
		}
		public static IXMIDatatype getXMIDatatypeFromMapByXmiId(String xmiId) {
			return (IXMIDatatype) mapXMIDatatypeByXmiId.get(xmiId);
		}
		public static IXMIDatatype getXMIDatatypeFromMapByGenId(String genId) {
			return (IXMIDatatype) mapXMIDatatypeByGenId.get(genId);
		}
	}

	String getNom();
	
	public abstract String getGenId();

	String getXmiId();

}