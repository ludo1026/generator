package org.ludo.umlgenerator.xml.core.bean;



public interface IXMGeneralisation {
	/*
	public static class Manager {
		private static Map mapXMGeneralisationByTypeParentXmiId = new HashMap();
		private static Map mapXMGeneralisationByTypeParentGenId = new HashMap();
		private static Map mapXMGeneralisationByTypeFilleXmiId = new HashMap();
		private static Map mapXMGeneralisationByTypeFilleGenId = new HashMap();
		public static void addXMGeneralisationToMap(IXMGeneralisation generalisation) {
			mapXMGeneralisationByTypeParentXmiId.put(generalisation.getXmiTypeParent().getXmiId(),generalisation);
			mapXMGeneralisationByTypeParentGenId.put(generalisation.getXmiTypeParent().getGenId(),generalisation);
			mapXMGeneralisationByTypeFilleXmiId.put(generalisation.getXmiTypeFille().getXmiId(),generalisation);
			mapXMGeneralisationByTypeFilleGenId.put(generalisation.getXmiTypeFille().getGenId(),generalisation);
		}
		public static IXMGeneralisation getXMGeneralisationFromMapByTypeParentXmiId(String typeParentXmiId) {
			return (IXMGeneralisation) mapXMGeneralisationByTypeParentXmiId.get(typeParentXmiId);
		}
		public static IXMGeneralisation getXMGeneralisationFromMapByTypeParentGenId(String typeParentGenId) {
			return (IXMGeneralisation) mapXMGeneralisationByTypeParentGenId.get(typeParentGenId);
		}
		public static IXMGeneralisation getXMGeneralisationFromMapByTypeFilleXmiId(String typeFilleXmiId) {
			return (IXMGeneralisation) mapXMGeneralisationByTypeFilleXmiId.get(typeFilleXmiId);
		}
		public static IXMGeneralisation getXMGeneralisationFromMapByTypeFilleGenId(String typeFilleGenId) {
			return (IXMGeneralisation) mapXMGeneralisationByTypeFilleGenId.get(typeFilleGenId);
		}
	}
	*/

	public IXMIType getXmiTypeParent();

	public IXMIType getXmiTypeEnfant();


}