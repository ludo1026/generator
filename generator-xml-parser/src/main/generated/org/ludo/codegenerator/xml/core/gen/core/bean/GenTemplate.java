package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenTemplate 
{
	
	/** Récupération de l'élément parent */
	
	public GenTemplates getReferenceGenTemplates();
	
	public void setReferenceGenTemplates(GenTemplates referenceGenTemplates);
	
	/** Récupération des éléments fils */
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	public String getNomAsString();
	public void setNomAsString(String nomAsString);
	
	public String getFileAsString();
	public void setFileAsString(String fileAsString);
	
	public String getOutDirAsString();
	public void setOutDirAsString(String outDirAsString);
	
	public String getOutFileAsString();
	public void setOutFileAsString(String outFileAsString);
	
	public String getPackageJavaAsString();
	public void setPackageJavaAsString(String packageJavaAsString);
	
	public String getNomElementGenereAsString();
	public void setNomElementGenereAsString(String nomElementGenereAsString);
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	public String getNom();
	public void setNom(String nom);

	public String getFile();
	public void setFile(String file);

	public String getOutDir();
	public void setOutDir(String outDir);

	public String getOutFile();
	public void setOutFile(String outFile);

	public String getPackageJava();
	public void setPackageJava(String packageJava);

	public String getNomElementGenere();
	public void setNomElementGenere(String nomElementGenere);
}
