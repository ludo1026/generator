package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface GenTemplate 
{
	
	/** Récupération de l'élément parent */
	
	public GenTemplates getReferenceGenTemplates();
	
	public void setReferenceGenTemplates(GenTemplates referenceGenTemplates);
	
	/** Récupération des éléments fils */

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
