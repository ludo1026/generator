package org.ludo.umlgenerator.xml.core.bean;

import java.util.HashMap;
import java.util.Map;

public interface IXMITaggedValue {

	public static class Manager {
        private static Map mapXMITaggedValueByTag = new HashMap();
		private static Map mapXMITaggedValueByXmiId = new HashMap();
        public static void addXMITaggedValueToMap(final IXMITaggedValue taggedValue) {
            mapXMITaggedValueByTag.put(taggedValue.getTag(),taggedValue);
            mapXMITaggedValueByXmiId.put(taggedValue.getXmiId(),taggedValue);
        }
        public static IXMITaggedValue getXMITaggedValueFromMapByTag(final IXMITag tag) {
            return (IXMITaggedValue) mapXMITaggedValueByTag.get(tag);
        }
		public static IXMITaggedValue getXMITaggedValueFromMapByXmiId(final String xmiId) {
			return (IXMITaggedValue) mapXMITaggedValueByXmiId.get(xmiId);
		}
	}

	public String getValeur();

	public String getXmiId();

    public IXMITag getTag();

}