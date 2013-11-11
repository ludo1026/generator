package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenTemplates {
	
	/** Récupération de l'élément parent */
	
	public Gen getReferenceGen();
	
	public void setReferenceGen(Gen referenceGen);
	
	/** Récupération des éléments fils */
	
    public GenTemplate getGenTemplateByNom(String nom);
    public GenTemplate getGenTemplateByFile(String file);
    public GenTemplate getGenTemplateByOutDir(String outDir);
    public GenTemplate getGenTemplateByOutFile(String outFile);
    public GenTemplate getGenTemplateByPackageJava(String packageJava);
    public GenTemplate getGenTemplateByNomElementGenere(String nomElementGenere);
    public void addGenTemplate(GenTemplate genTemplate);
    public List getListeGenTemplate();
    public void setListeGenTemplate(List listeGenTemplate);
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	public String getInDirAsString();
	public void setInDirAsString(String inDirAsString);
	
	public String getOutDirAsString();
	public void setOutDirAsString(String outDirAsString);
	
	public String getPackageJavaBaseAsString();
	public void setPackageJavaBaseAsString(String packageJavaBaseAsString);
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	public String getInDir();
	public void setInDir(String inDir);

	public String getOutDir();
	public void setOutDir(String outDir);

	public String getPackageJavaBase();
	public void setPackageJavaBase(String packageJavaBase);
}
