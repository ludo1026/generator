package org.ludo.codegenerator.core.gen.manager;

import java.util.Iterator;
import java.util.List;

import org.ludo.codegenerator.core.gen.bean.IAssociation;
import org.ludo.codegenerator.core.gen.bean.IAttribut;
import org.ludo.codegenerator.core.gen.bean.IClasse;
import org.ludo.codegenerator.core.gen.bean.IMethode;
import org.ludo.codegenerator.core.gen.bean.IParametre;
import org.ludo.codegenerator.core.gen.bean.IStereotype;
import org.ludo.codegenerator.core.gen.bean.ITemplateGeneration;
import org.ludo.codegenerator.core.gen.bean.IType;
import org.ludo.codegenerator.core.gen.bean.impl.AssociationBean;
import org.ludo.codegenerator.core.gen.bean.impl.AttributBean;
import org.ludo.codegenerator.core.gen.bean.impl.ClasseBean;
import org.ludo.codegenerator.core.gen.bean.impl.MethodeBean;
import org.ludo.codegenerator.core.gen.bean.impl.ParametreBean;
import org.ludo.codegenerator.core.gen.bean.impl.StereotypeBean;
import org.ludo.codegenerator.core.gen.bean.impl.TypeBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAssociation;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAssociations;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAttributs;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenMethode;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenMethodes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenParametre;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenParametres;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeRef;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypesRef;
import org.ludo.utils.AssertHelper;

public class BeanTemplateManager {
	
	private final Gen gen;
	private final List listeTemplateGeneration;
	
	public BeanTemplateManager(Gen gen, List listeTemplateGeneration) {
		AssertHelper.assertDefined(gen, "objet gen");
		this.gen = gen;
		AssertHelper.assertNotNull(listeTemplateGeneration, "objet liste des générations de template");
		if( ! listeTemplateGeneration.isEmpty() ) {
			AssertHelper.assertInstanceOf(listeTemplateGeneration.get(0), ITemplateGeneration.class, "objet liste des générations de template");
		}
		this.listeTemplateGeneration = listeTemplateGeneration;
		this.buildBeanTemplateManager();
	}
	
	private final void buildBeanTemplateManager() {
		this.defineListeTemplateGeneration(this.listeTemplateGeneration);
	}
	
	private BeanTemplateReferentielManager getReferentielManager() {
		return TemplateGenerationManager.getInstance().getBeanTemplateReferentielManager();
	}

	
	private void defineListeTemplateGeneration(List listeTemplateGeneration) {
		for(Iterator iterTemplateGeneration = listeTemplateGeneration.iterator(); iterTemplateGeneration.hasNext(); ) {
			ITemplateGeneration templateGeneration = (ITemplateGeneration) iterTemplateGeneration.next();
			switch(templateGeneration.getTypeTemplateGeneration()) {
			case ITemplateGeneration.TYPE_GENERATION__PAR_CLASSE :
				createClasseOfTemplateGeneration(templateGeneration);
				break;
			case ITemplateGeneration.TYPE_GENERATION__PAR_STEREOTYPE :
				createStereotypeOfTemplateGeneration(templateGeneration);
				break;
			//case ITemplateGeneration.TYPE_GENERATION__PAR_TEMPLATE :
			//	createStereotypeOfTemplateGeneration(templateGeneration);
			//	break;
			}
		}
		for(Iterator iterTemplateGeneration = listeTemplateGeneration.iterator(); iterTemplateGeneration.hasNext(); ) {
			ITemplateGeneration templateGeneration = (ITemplateGeneration) iterTemplateGeneration.next();
			switch(templateGeneration.getTypeTemplateGeneration()) {
			case ITemplateGeneration.TYPE_GENERATION__PAR_CLASSE :
				defineClasseOfTemplateGeneration(templateGeneration);
				break;
			case ITemplateGeneration.TYPE_GENERATION__PAR_STEREOTYPE :
				defineStereotypeOfTemplateGeneration(templateGeneration);
				break;
			//case ITemplateGeneration.TYPE_GENERATION__PAR_TEMPLATE :
			//	createStereotypeOfTemplateGeneration(templateGeneration);
			//	break;
			}
		}
	}
	
	private ITemplateGeneration createClasseOfTemplateGeneration(ITemplateGeneration templateGeneration)
	{
		GenClasse genClasse = templateGeneration.getGenClasse();
		IClasse classe = new ClasseBean();
		templateGeneration.setClasse(classe);
		getReferentielManager().addClasse(classe);
		classe.setGenId(classe.getGenId());
		classe.setNom(genClasse.getNomJava());
		classe.setNomPackage(genClasse.getPackageJava());
		
		return templateGeneration;
	}
	
	private ITemplateGeneration defineClasseOfTemplateGeneration(ITemplateGeneration templateGeneration)
	{
		IClasse classe = templateGeneration.getClasse();
		GenClasse genClasse = templateGeneration.getGenClasse();
		
		GenAttributs genAttributs = genClasse.getGenAttributs();
		List listeGenAttribut = genAttributs.getListeGenAttribut();
		AssertHelper.assertNotNull(listeGenAttribut, "liste des attributs à générer");
		for( Iterator iterGenAttribut = listeGenAttribut.iterator(); iterGenAttribut.hasNext(); ) {
			GenAttribut genAttribut = (GenAttribut) iterGenAttribut.next();
			IAttribut attribut = new AttributBean();
			classe.addAttribut(attribut);
			attribut.setClasse(classe);
			attribut.setGenId(genAttribut.getGenId());
			attribut.setNom(genAttribut.getNomJava());
			IType type = new TypeBean();
			type.setNomComplet(genAttribut.getType());
			attribut.setType(type);
			//attribut.setEstClePrimaire(genAttribut.getEstClePrimaire());
			
		}
		
		GenMethodes genMethodes = genClasse.getGenMethodes();
		List listeGenMethode = genMethodes.getListeGenMethode();
		AssertHelper.assertNotNull(listeGenMethode, "liste des methodes à générer");
		for( Iterator iterGenMethode = listeGenMethode.iterator(); iterGenMethode.hasNext(); ) {
			GenMethode genMethode = (GenMethode) iterGenMethode.next();
			IMethode methode = new MethodeBean();
			classe.addMethode(methode);
			methode.setClasse(classe);
			methode.setGenId(genMethode.getGenId());
			methode.setNom(genMethode.getNomJava());
			IType retourType = new TypeBean();
			retourType.setNomComplet(genMethode.getRetourType());
			methode.setRetourType(retourType);
			
			GenParametres genParametres = genMethode.getGenParametres();
			List listeGenParametre = genParametres.getListeGenParametre();
			AssertHelper.assertNotNull(listeGenParametre, "liste des parametres à générer");
			for( Iterator iterGenParametre = listeGenParametre.iterator(); iterGenParametre.hasNext(); ) {
				GenParametre genParametre = (GenParametre) iterGenParametre.next();
				IParametre parametre = new ParametreBean();
				methode.addParametre(parametre);
				parametre.setMethode(methode);
				parametre.setGenId(genParametre.getGenId());
				parametre.setNom(genParametre.getNomJava());
				IType type = new TypeBean();
				type.setNomComplet(genParametre.getType());
				parametre.setType(type);
			}
		}
		
		GenStereotypesRef genStereotypesRef = genClasse.getGenStereotypesRef();
		List listeGenStereotypeRef = genStereotypesRef.getListeGenStereotypeRef();
		AssertHelper.assertNotNull(listeGenStereotypeRef, "liste des stereotypeRef à générer");
		for( Iterator iterGenStereotypeRef = listeGenStereotypeRef.iterator(); iterGenStereotypeRef.hasNext(); ) {
			GenStereotypeRef genStereotypeRef = (GenStereotypeRef) iterGenStereotypeRef.next();
			GenStereotypes genStereotypes = gen.getGenStereotypes();
			GenStereotype genStereotype = genStereotypes.getGenStereotypeByNom(genStereotypeRef.getStereotypeNom());
			
			IStereotype stereotype = new StereotypeBean();
			classe.addStereotype(stereotype);
			stereotype.setNom(genStereotype.getNom());
			stereotype.addClasse(classe);
		}
		
		GenAssociations genAssociations = genClasse.getGenAssociations();
		List listeGenAssociation = genAssociations.getListeGenAssociation();
		AssertHelper.assertNotNull(listeGenAssociation, "liste des associations à générer");
		for( Iterator iterGenAssociation = listeGenAssociation.iterator(); iterGenAssociation.hasNext(); ) {
			GenAssociation genAssociation = (GenAssociation) iterGenAssociation.next();
			IAssociation association = new AssociationBean();
			classe.addAssociation(association);
			association.setClasse(classe);
			String classeGenId = genAssociation.getClasseGenId();
			IClasse classeReference = getReferentielManager().getClasseByGenId(classeGenId);
			association.setClasseReference(classeReference);
			association.setGenId(genAssociation.getGenId());
			association.setClasseReferenceFromClasseGenIdOfGenAssociation(genAssociation.getClasseGenId());
			association.setNombreMinimumFromNombreMinimumOfGenAssociation(genAssociation.getNombreMinimum());
			association.setNombreMaximumFromNombreMaximumOfGenAssociation(genAssociation.getNombreMaximum());
			
		}
		
		return templateGeneration;
	}

	private ITemplateGeneration createStereotypeOfTemplateGeneration(ITemplateGeneration templateGeneration)
	{
		GenStereotype genStereotype = templateGeneration.getGenStereotype();
		IStereotype stereotype = new StereotypeBean();
		templateGeneration.setStereotype(stereotype);
		stereotype.setGenId(stereotype.getGenId());
		stereotype.setNom(genStereotype.getNom());
		
		return templateGeneration;
	}
	
	
	private ITemplateGeneration defineStereotypeOfTemplateGeneration(ITemplateGeneration templateGeneration)
	{
		IClasse classe = templateGeneration.getClasse();
		GenClasse genClasse = templateGeneration.getGenClasse();
		
		GenAttributs genAttributs = genClasse.getGenAttributs();
		List listeGenAttribut = genAttributs.getListeGenAttribut();
		AssertHelper.assertNotNull(listeGenAttribut, "liste des attributs à générer");
		
		return templateGeneration;
	}
	
}
