package org.ludo.umlgenerator.xml.core.bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface IXMIClasse extends IXMIType {

	public static class Manager {
		private static Map mapXMIClasseByXmiId = new HashMap();
		private static Map mapXMIClasseByGenId = new HashMap();
		public static void addXMIClasseToMap(final IXMIClasse classe) {
			mapXMIClasseByXmiId.put(classe.getXmiId(),classe);
			mapXMIClasseByGenId.put(classe.getGenId(),classe);
		}
		public static IXMIClasse getXMIClasseFromMapByXmiId(final String xmiId) {
			return (IXMIClasse) mapXMIClasseByXmiId.get(xmiId);
		}
		public static IXMIClasse getXMIClasseFromMapByGenId(final String genId) {
			return (IXMIClasse) mapXMIClasseByGenId.get(genId);
		}
	}

	public abstract String getNom();

	public abstract String getGenId();

	public abstract String getXmiId();

	public abstract IXMIPackage getPackageParent();

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

	public abstract List getListeAttribut();

	public abstract void setListeAttribut(List listeAttribut);

	public abstract void addAttribut(IXMIAttribut attribut);

	public abstract IXMIAttribut getAttributByNom(String nom);

	public abstract IXMIAttribut getAttributByXmiId(String xmiId);

	public abstract List getListeOperation();

	public abstract void setListeOperation(List listeOperation);

	public abstract void addOperation(IXMIOperation operation);

	public abstract IXMIOperation getOperationByNom(String nom);

	public abstract IXMIOperation getOperationByXmiId(String xmiId);

	public List getListeAssociationEnd();

	public void setListeAssociationEnd(List listeAssociationEnd);

	public void addAssociationEnd(IXMIAssociationEnd associationEnd);

	public List getListeClasseParent();

	public void setListeClasseParent(List listeClasseParent);

	public void addClasseParent(IXMIClasse classeParent);
}