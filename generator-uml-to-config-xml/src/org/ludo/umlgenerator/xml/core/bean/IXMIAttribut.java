package org.ludo.umlgenerator.xml.core.bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface IXMIAttribut {

	public static class Manager {
		private static Map mapXMIAttributByXmiId = new HashMap();
		private static Map mapXMIAttributByGenId = new HashMap();
		public static void addXMIAttributToMap(final IXMIAttribut attribut) {
			mapXMIAttributByXmiId.put(attribut.getXmiId(),attribut);
			mapXMIAttributByGenId.put(attribut.getGenId(),attribut);
		}
		public static IXMIAttribut getXMIAttributFromMapByXmiId(final String xmiId) {
			return (IXMIAttribut) mapXMIAttributByXmiId.get(xmiId);
		}
		public static IXMIAttribut getXMIAttributFromMapByGenId(final String genId) {
			return (IXMIAttribut) mapXMIAttributByGenId.get(genId);
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

	public IXMIDatatype getXmiDatatype();

	public IXMIMultiplicity getXmiMultiplicity();

	public IXMIClasse getXmiClasse();

	public IXMIClasse getXmiClasseParent();

}