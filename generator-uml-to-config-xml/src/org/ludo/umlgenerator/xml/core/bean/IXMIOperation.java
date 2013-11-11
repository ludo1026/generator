package org.ludo.umlgenerator.xml.core.bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface IXMIOperation {

	public static class Manager {
		private static Map mapXMIOperationByXmiId = new HashMap();
		private static Map mapXMIOperationByGenId = new HashMap();
		public static void addXMIOperationToMap(final IXMIOperation operation) {
			mapXMIOperationByXmiId.put(operation.getXmiId(),operation);
			mapXMIOperationByGenId.put(operation.getGenId(),operation);
		}
		public static IXMIOperation getXMIOperationFromMapByXmiId(final String xmiId) {
			return (IXMIOperation) mapXMIOperationByXmiId.get(xmiId);
		}
		public static IXMIOperation getXMIOperationFromMapByGenId(final String genId) {
			return (IXMIOperation) mapXMIOperationByGenId.get(genId);
		}
	}

	public abstract String getNom();

	public abstract String getGenId();

	public abstract String getXmiId();

    public abstract List getListeStereotype();

    public abstract void setListeStereotype(List listeStereotype);

    public abstract void addStereotype(IXMIStereotype stereotype);

    public abstract IXMIStereotype getStereotypeByNom(String nom);

    public abstract IXMIStereotype getStereotypeByXmiId(String xmiId);

    public abstract List getListeTaggedValue();

    public abstract void setListeTaggedValue(List listeTaggedValue);

    public abstract void addTaggedValue(IXMITaggedValue taggedValue);

    public abstract IXMITaggedValue getTaggedValueByValeur(String valeur);

    public abstract IXMITaggedValue getTaggedValueByXmiId(String xmiId);

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