package org.ludo.umlgenerator.xml.core.bean;

import java.util.HashMap;
import java.util.Map;

public interface IXMITag {

	public static class Manager {
		private static Map mapXMITagByXmiId = new HashMap();
		public static void addXMITagToMap(final IXMITag tag) {
			mapXMITagByXmiId.put(tag.getXmiId(),tag);
		}
		public static IXMITag getXMITagFromMapByXmiId(final String xmiId) {
			return (IXMITag) mapXMITagByXmiId.get(xmiId);
		}
	}

	public String getNom();

	public String getXmiId();

}