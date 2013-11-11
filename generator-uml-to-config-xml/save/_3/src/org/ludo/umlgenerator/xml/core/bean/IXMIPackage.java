package org.ludo.umlgenerator.xml.core.bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface IXMIPackage {
	
	public static class Manager {
		private static Map mapXMIPackageByXmiId = new HashMap();
		private static Map mapXMIPackageByGenId = new HashMap();
		public static void addXMIPackageToMap(IXMIPackage _package) {
			mapXMIPackageByXmiId.put(_package.getXmiId(),_package);
			mapXMIPackageByGenId.put(_package.getGenId(),_package);
		}
		public static IXMIPackage getXMIPackageFromMapByXmiId(String xmiId) {
			return (IXMIPackage) mapXMIPackageByXmiId.get(xmiId);
		}
		public static IXMIPackage getXMIPackageFromMapByGenId(String genId) {
			return (IXMIPackage) mapXMIPackageByGenId.get(genId);
		}
	}
	
	String getNom();
	
	public abstract String getGenId();

	String getXmiId();
	
	public IXMIPackage getPackageParent();
	
	public String getNomPackageComplet();
	
	List getListePackageFils();

	void setListePackageFils(List listePackage);

	void addPackage(IXMIPackage packageFils);

	IXMIPackage getPackageByNom(String nom);

	IXMIPackage getPackageByXmiId(String xmiId);

	List getListeClasse();

	void setListeClasse(List listeClasse);

	void addClasse(IXMIClasse classe);

	IXMIClasse getClasseByNom(String nom);

	IXMIClasse getClasseByXmiId(String xmiId);

}