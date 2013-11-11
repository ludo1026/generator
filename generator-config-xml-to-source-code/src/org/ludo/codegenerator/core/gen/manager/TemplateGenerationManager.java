package org.ludo.codegenerator.core.gen.manager;

import java.util.List;

import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;
import org.ludo.utils.AssertHelper;

public class TemplateGenerationManager {
	
	private static TemplateGenerationManager templateGenerationManager = null;
	
	public static TemplateGenerationManager getInstance() {
		AssertHelper.assertDefined(templateGenerationManager, "objet instance de TemplateGenerationManager (doit être initialisé par l'appel à sa méthode 'defineAndGetNewInstance')");
		return templateGenerationManager;
	}
	
	public static TemplateGenerationManager defineAndGetNewInstance(
									Gen gen,
									List listeTemplateGeneration,
									TemplateGenerationMap templateGenerationMap
								)
	{
		templateGenerationManager = 
			new TemplateGenerationManager(
				gen,
				listeTemplateGeneration,
				templateGenerationMap
			);
		return templateGenerationManager;
	}
	
	/**
	 * Instance
	 */
	
	private final Gen gen;
	private final List listeTemplateGeneration;
	private final TemplateGenerationMap templateGenerationMap;

	private TemplateGenerationManager(
							Gen gen,
							List listeTemplateGeneration,
							TemplateGenerationMap templateGenerationMap
						)
	{
		AssertHelper.assertDefined(gen, "objet racine des beans de lecture du fichier config.xml de génération du code");
		this.gen = gen;
		AssertHelper.assertDefined(listeTemplateGeneration, "liste des beans de génération de template");
		this.listeTemplateGeneration = listeTemplateGeneration;
		AssertHelper.assertDefined(templateGenerationMap, "table des beans de génération de template");
		this.templateGenerationMap = templateGenerationMap;
	}
	
	public Gen getGen() {
		return gen;
	}

	public List getListeTemplateGeneration() {
		return listeTemplateGeneration;
	}

	public TemplateGenerationMap getTemplateGenerationMap() {
		return templateGenerationMap;
	}
	
}
