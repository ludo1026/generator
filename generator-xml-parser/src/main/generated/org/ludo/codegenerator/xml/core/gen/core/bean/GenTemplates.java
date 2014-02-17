package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenTemplates 
	extends List<GenTemplate>
{
	
	/** Récupération de l'élément parent */
	
	public Gen getReferenceGen();
	
	public void setReferenceGen(Gen referenceGen);
	
	/** Récupération des éléments fils */
	
    public GenTemplate getGenTemplateForNom(String nom);
    public List<GenTemplate> getGenTemplatesByNom(String nom);
    public GenTemplate getGenTemplateForFile(String file);
    public List<GenTemplate> getGenTemplatesByFile(String file);
    public GenTemplate getGenTemplateForOutDir(String outDir);
    public List<GenTemplate> getGenTemplatesByOutDir(String outDir);
    public GenTemplate getGenTemplateForOutFile(String outFile);
    public List<GenTemplate> getGenTemplatesByOutFile(String outFile);
    public GenTemplate getGenTemplateForPackageJava(String packageJava);
    public List<GenTemplate> getGenTemplatesByPackageJava(String packageJava);
    public GenTemplate getGenTemplateForNomElementGenere(String nomElementGenere);
    public List<GenTemplate> getGenTemplatesByNomElementGenere(String nomElementGenere);
    public void addGenTemplate(GenTemplate genTemplate);
    public List<GenTemplate> getGenTemplates();
    public void setGenTemplates(List<GenTemplate> genTemplate);
	
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
