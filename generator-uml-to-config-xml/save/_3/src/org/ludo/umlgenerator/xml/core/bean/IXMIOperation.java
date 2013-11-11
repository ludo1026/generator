package org.ludo.umlgenerator.xml.core.bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface IXMIOperation {
	
	public static class Manager {
		private static Map mapXMIOperationByXmiId = new HashMap();
		private static Map mapXMIOperationByGenId = new HashMap();
		public static void addXMIOperationToMap(IXMIOperation operation) {
			mapXMIOperationByXmiId.put(operation.getXmiId(),operation);
			mapXMIOperationByGenId.put(operation.getGenId(),operation);
		}
		public static IXMIOperation getXMIOperationFromMapByXmiId(String xmiId) {
			return (IXMIOperation) mapXMIOperationByXmiId.get(xmiId);
		}
		public static IXMIOperation getXMIOperationFromMapByGenId(String genId) {
			return (IXMIOperation) mapXMIOperationByGenId.get(genId);
		}
	}

	public abstract String getNom();
	
	public abstract String getGenId();

	public abstract String getXmiId();

	public abstract IXMIParametre getParametreRetour();
	
	public abstract void setParametreRetour(IXMIParametre parametreRetour);
	
	public abstract List getListeParametre();

	public abstract void setListeParametre(List listeParametre);

	public abstract void addParametre(IXMIParametre parametre);

	public abstract IXMIParametre getParametreByNom(String nom);
/*
	public abstract IXMIParametre getParametreByDatatypeXmiId(
			String datatypeXmiId);

	public abstract IXMIParametre getParametreByDatatypeNom(String datatypeNom);
*/
}