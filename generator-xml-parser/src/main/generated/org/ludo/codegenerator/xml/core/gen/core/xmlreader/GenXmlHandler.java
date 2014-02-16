package org.ludo.codegenerator.xml.core.gen.core.xmlreader;

import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenTemplatesBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenTemplateBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenTemplateGroupesBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenTemplateGroupeBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenTemplateRefBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenStereotypesBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenStereotypeBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenClassesBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenClasseBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenProprieteClassesBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenProprieteClasseBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenAttributsBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenAttributBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenProprieteAttributsBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenProprieteAttributBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenStereotypeAttributsBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenStereotypeAttributBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenMethodesBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenMethodeBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenProprieteMethodesBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenProprieteMethodeBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenParametresBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenParametreBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenStereotypeMethodesBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenStereotypeMethodeBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenStereotypeClassesBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenStereotypeClasseBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenAssociationsBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenAssociationBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenAssociationAttributsBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenAssociationAttributBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenClasseDeAssociationBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenClasseParentsBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenClasseParentBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenGenerateBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenGenererParClassesBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenGenererParClasseBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenClasseRefPourGenererParClassesBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenClasseRefPourGenererParClasseBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenTemplateGroupeRefPourGenererParClassesBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenTemplateGroupeRefPourGenererParClasseBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenGenererParTemplatesBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenGenererParTemplateBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenTemplateGroupeRefPourGenererParTemplatesBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenTemplateGroupeRefPourGenererParTemplateBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenStereotypeRefPourGenererParTemplatesBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenStereotypeRefPourGenererParTemplateBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenGenererParStereotypesBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenGenererParStereotypeBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenStereotypeRefPourGenererParStereotypesBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenStereotypeRefPourGenererParStereotypeBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenTemplateGroupeRefPourGenererParStereotypesBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenTemplateGroupeRefPourGenererParStereotypeBean;

import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplates;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupe;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateRef;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasses;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenProprieteClasses;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenProprieteClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAttributs;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenProprieteAttributs;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenProprieteAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeAttributs;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenMethodes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenMethode;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenProprieteMethodes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenProprieteMethode;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenParametres;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenParametre;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeMethodes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeMethode;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeClasses;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAssociations;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAssociation;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAssociationAttributs;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAssociationAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseDeAssociation;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseParents;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseParent;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenerate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParClasses;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseRefPourGenererParClasses;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseRefPourGenererParClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeRefPourGenererParClasses;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeRefPourGenererParClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParTemplates;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeRefPourGenererParTemplates;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeRefPourGenererParTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeRefPourGenererParTemplates;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeRefPourGenererParTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParStereotypes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeRefPourGenererParStereotypes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeRefPourGenererParStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeRefPourGenererParStereotypes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeRefPourGenererParStereotype;

import org.apache.log4j.Logger;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import org.ludo.utils.LoggerManager;

public class GenXmlHandler extends DefaultHandler {
    
    private static Logger log = LoggerManager.getLogger(GenXmlHandler.class);
    
    private EnCours enCours = new EnCours();
    
    private class EnCours {
    
    	private String strValue = null;
    	
    	public String getStrValue() {
    		return this.strValue;
    	}
    	
    	public void setStrValue(String strValue) {
    		this.strValue = strValue;
    	}
    	
        private Gen Gen = null;
        private GenTemplates Gen_GenTemplates = null;
        private GenTemplate Gen_GenTemplates_GenTemplate = null;
        private GenTemplateGroupes Gen_GenTemplateGroupes = null;
        private GenTemplateGroupe Gen_GenTemplateGroupes_GenTemplateGroupe = null;
        private GenTemplateRef Gen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateRef = null;
        private GenStereotypes Gen_GenStereotypes = null;
        private GenStereotype Gen_GenStereotypes_GenStereotype = null;
        private GenClasses Gen_GenClasses = null;
        private GenClasse Gen_GenClasses_GenClasse = null;
        private GenProprieteClasses Gen_GenClasses_GenClasse_GenProprieteClasses = null;
        private GenProprieteClasse Gen_GenClasses_GenClasse_GenProprieteClasses_GenProprieteClasse = null;
        private GenAttributs Gen_GenClasses_GenClasse_GenAttributs = null;
        private GenAttribut Gen_GenClasses_GenClasse_GenAttributs_GenAttribut = null;
        private GenProprieteAttributs Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs = null;
        private GenProprieteAttribut Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs_GenProprieteAttribut = null;
        private GenStereotypeAttributs Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs = null;
        private GenStereotypeAttribut Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs_GenStereotypeAttribut = null;
        private GenMethodes Gen_GenClasses_GenClasse_GenMethodes = null;
        private GenMethode Gen_GenClasses_GenClasse_GenMethodes_GenMethode = null;
        private GenProprieteMethodes Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes = null;
        private GenProprieteMethode Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes_GenProprieteMethode = null;
        private GenParametres Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres = null;
        private GenParametre Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres_GenParametre = null;
        private GenStereotypeMethodes Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes = null;
        private GenStereotypeMethode Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes_GenStereotypeMethode = null;
        private GenStereotypeClasses Gen_GenClasses_GenClasse_GenStereotypeClasses = null;
        private GenStereotypeClasse Gen_GenClasses_GenClasse_GenStereotypeClasses_GenStereotypeClasse = null;
        private GenAssociations Gen_GenClasses_GenClasse_GenAssociations = null;
        private GenAssociation Gen_GenClasses_GenClasse_GenAssociations_GenAssociation = null;
        private GenAssociationAttributs Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs = null;
        private GenAssociationAttribut Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs_GenAssociationAttribut = null;
        private GenClasseDeAssociation Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenClasseDeAssociation = null;
        private GenClasseParents Gen_GenClasses_GenClasse_GenClasseParents = null;
        private GenClasseParent Gen_GenClasses_GenClasse_GenClasseParents_GenClasseParent = null;
        private GenGenerate Gen_GenGenerate = null;
        private GenGenererParClasses Gen_GenGenerate_GenGenererParClasses = null;
        private GenGenererParClasse Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse = null;
        private GenClasseRefPourGenererParClasses Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses = null;
        private GenClasseRefPourGenererParClasse Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses_GenClasseRefPourGenererParClasse = null;
        private GenTemplateGroupeRefPourGenererParClasses Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses = null;
        private GenTemplateGroupeRefPourGenererParClasse Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses_GenTemplateGroupeRefPourGenererParClasse = null;
        private GenGenererParTemplates Gen_GenGenerate_GenGenererParTemplates = null;
        private GenGenererParTemplate Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate = null;
        private GenTemplateGroupeRefPourGenererParTemplates Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates = null;
        private GenTemplateGroupeRefPourGenererParTemplate Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate = null;
        private GenStereotypeRefPourGenererParTemplates Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates = null;
        private GenStereotypeRefPourGenererParTemplate Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates_GenStereotypeRefPourGenererParTemplate = null;
        private GenGenererParStereotypes Gen_GenGenerate_GenGenererParStereotypes = null;
        private GenGenererParStereotype Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype = null;
        private GenStereotypeRefPourGenererParStereotypes Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes = null;
        private GenStereotypeRefPourGenererParStereotype Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype = null;
        private GenTemplateGroupeRefPourGenererParStereotypes Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes = null;
        private GenTemplateGroupeRefPourGenererParStereotype Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes_GenTemplateGroupeRefPourGenererParStereotype = null;
        
        public int posCompteur = 0;
        public int posGen = 0;
        public int posGen_GenTemplates = 0;
        public int posGen_GenTemplates_GenTemplate = 0;
        public int posGen_GenTemplateGroupes = 0;
        public int posGen_GenTemplateGroupes_GenTemplateGroupe = 0;
        public int posGen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateRef = 0;
        public int posGen_GenStereotypes = 0;
        public int posGen_GenStereotypes_GenStereotype = 0;
        public int posGen_GenClasses = 0;
        public int posGen_GenClasses_GenClasse = 0;
        public int posGen_GenClasses_GenClasse_GenProprieteClasses = 0;
        public int posGen_GenClasses_GenClasse_GenProprieteClasses_GenProprieteClasse = 0;
        public int posGen_GenClasses_GenClasse_GenAttributs = 0;
        public int posGen_GenClasses_GenClasse_GenAttributs_GenAttribut = 0;
        public int posGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs = 0;
        public int posGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs_GenProprieteAttribut = 0;
        public int posGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs = 0;
        public int posGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs_GenStereotypeAttribut = 0;
        public int posGen_GenClasses_GenClasse_GenMethodes = 0;
        public int posGen_GenClasses_GenClasse_GenMethodes_GenMethode = 0;
        public int posGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes = 0;
        public int posGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes_GenProprieteMethode = 0;
        public int posGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres = 0;
        public int posGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres_GenParametre = 0;
        public int posGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes = 0;
        public int posGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes_GenStereotypeMethode = 0;
        public int posGen_GenClasses_GenClasse_GenStereotypeClasses = 0;
        public int posGen_GenClasses_GenClasse_GenStereotypeClasses_GenStereotypeClasse = 0;
        public int posGen_GenClasses_GenClasse_GenAssociations = 0;
        public int posGen_GenClasses_GenClasse_GenAssociations_GenAssociation = 0;
        public int posGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs = 0;
        public int posGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs_GenAssociationAttribut = 0;
        public int posGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenClasseDeAssociation = 0;
        public int posGen_GenClasses_GenClasse_GenClasseParents = 0;
        public int posGen_GenClasses_GenClasse_GenClasseParents_GenClasseParent = 0;
        public int posGen_GenGenerate = 0;
        public int posGen_GenGenerate_GenGenererParClasses = 0;
        public int posGen_GenGenerate_GenGenererParClasses_GenGenererParClasse = 0;
        public int posGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses = 0;
        public int posGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses_GenClasseRefPourGenererParClasse = 0;
        public int posGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses = 0;
        public int posGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses_GenTemplateGroupeRefPourGenererParClasse = 0;
        public int posGen_GenGenerate_GenGenererParTemplates = 0;
        public int posGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate = 0;
        public int posGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates = 0;
        public int posGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate = 0;
        public int posGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates = 0;
        public int posGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates_GenStereotypeRefPourGenererParTemplate = 0;
        public int posGen_GenGenerate_GenGenererParStereotypes = 0;
        public int posGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype = 0;
        public int posGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes = 0;
        public int posGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype = 0;
        public int posGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes = 0;
        public int posGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes_GenTemplateGroupeRefPourGenererParStereotype = 0;

        public void definePosGen() { posGen = ++ posCompteur; }
        public void definePosGen_GenTemplates() { posGen_GenTemplates = ++ posCompteur; }
        public void definePosGen_GenTemplates_GenTemplate() { posGen_GenTemplates_GenTemplate = ++ posCompteur; }
        public void definePosGen_GenTemplateGroupes() { posGen_GenTemplateGroupes = ++ posCompteur; }
        public void definePosGen_GenTemplateGroupes_GenTemplateGroupe() { posGen_GenTemplateGroupes_GenTemplateGroupe = ++ posCompteur; }
        public void definePosGen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateRef() { posGen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateRef = ++ posCompteur; }
        public void definePosGen_GenStereotypes() { posGen_GenStereotypes = ++ posCompteur; }
        public void definePosGen_GenStereotypes_GenStereotype() { posGen_GenStereotypes_GenStereotype = ++ posCompteur; }
        public void definePosGen_GenClasses() { posGen_GenClasses = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse() { posGen_GenClasses_GenClasse = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse_GenProprieteClasses() { posGen_GenClasses_GenClasse_GenProprieteClasses = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse_GenProprieteClasses_GenProprieteClasse() { posGen_GenClasses_GenClasse_GenProprieteClasses_GenProprieteClasse = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse_GenAttributs() { posGen_GenClasses_GenClasse_GenAttributs = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse_GenAttributs_GenAttribut() { posGen_GenClasses_GenClasse_GenAttributs_GenAttribut = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs() { posGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs_GenProprieteAttribut() { posGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs_GenProprieteAttribut = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs() { posGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs_GenStereotypeAttribut() { posGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs_GenStereotypeAttribut = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse_GenMethodes() { posGen_GenClasses_GenClasse_GenMethodes = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse_GenMethodes_GenMethode() { posGen_GenClasses_GenClasse_GenMethodes_GenMethode = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes() { posGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes_GenProprieteMethode() { posGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes_GenProprieteMethode = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres() { posGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres_GenParametre() { posGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres_GenParametre = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes() { posGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes_GenStereotypeMethode() { posGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes_GenStereotypeMethode = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse_GenStereotypeClasses() { posGen_GenClasses_GenClasse_GenStereotypeClasses = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse_GenStereotypeClasses_GenStereotypeClasse() { posGen_GenClasses_GenClasse_GenStereotypeClasses_GenStereotypeClasse = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse_GenAssociations() { posGen_GenClasses_GenClasse_GenAssociations = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse_GenAssociations_GenAssociation() { posGen_GenClasses_GenClasse_GenAssociations_GenAssociation = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs() { posGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs_GenAssociationAttribut() { posGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs_GenAssociationAttribut = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenClasseDeAssociation() { posGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenClasseDeAssociation = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse_GenClasseParents() { posGen_GenClasses_GenClasse_GenClasseParents = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse_GenClasseParents_GenClasseParent() { posGen_GenClasses_GenClasse_GenClasseParents_GenClasseParent = ++ posCompteur; }
        public void definePosGen_GenGenerate() { posGen_GenGenerate = ++ posCompteur; }
        public void definePosGen_GenGenerate_GenGenererParClasses() { posGen_GenGenerate_GenGenererParClasses = ++ posCompteur; }
        public void definePosGen_GenGenerate_GenGenererParClasses_GenGenererParClasse() { posGen_GenGenerate_GenGenererParClasses_GenGenererParClasse = ++ posCompteur; }
        public void definePosGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses() { posGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses = ++ posCompteur; }
        public void definePosGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses_GenClasseRefPourGenererParClasse() { posGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses_GenClasseRefPourGenererParClasse = ++ posCompteur; }
        public void definePosGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses() { posGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses = ++ posCompteur; }
        public void definePosGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses_GenTemplateGroupeRefPourGenererParClasse() { posGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses_GenTemplateGroupeRefPourGenererParClasse = ++ posCompteur; }
        public void definePosGen_GenGenerate_GenGenererParTemplates() { posGen_GenGenerate_GenGenererParTemplates = ++ posCompteur; }
        public void definePosGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate() { posGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate = ++ posCompteur; }
        public void definePosGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates() { posGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates = ++ posCompteur; }
        public void definePosGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate() { posGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate = ++ posCompteur; }
        public void definePosGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates() { posGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates = ++ posCompteur; }
        public void definePosGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates_GenStereotypeRefPourGenererParTemplate() { posGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates_GenStereotypeRefPourGenererParTemplate = ++ posCompteur; }
        public void definePosGen_GenGenerate_GenGenererParStereotypes() { posGen_GenGenerate_GenGenererParStereotypes = ++ posCompteur; }
        public void definePosGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype() { posGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype = ++ posCompteur; }
        public void definePosGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes() { posGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes = ++ posCompteur; }
        public void definePosGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype() { posGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype = ++ posCompteur; }
        public void definePosGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes() { posGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes = ++ posCompteur; }
        public void definePosGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes_GenTemplateGroupeRefPourGenererParStereotype() { posGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes_GenTemplateGroupeRefPourGenererParStereotype = ++ posCompteur; }

        public int getPosGen() { return posGen; }
        public int getPosGen_GenTemplates() { return posGen_GenTemplates; }
        public int getPosGen_GenTemplates_GenTemplate() { return posGen_GenTemplates_GenTemplate; }
        public int getPosGen_GenTemplateGroupes() { return posGen_GenTemplateGroupes; }
        public int getPosGen_GenTemplateGroupes_GenTemplateGroupe() { return posGen_GenTemplateGroupes_GenTemplateGroupe; }
        public int getPosGen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateRef() { return posGen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateRef; }
        public int getPosGen_GenStereotypes() { return posGen_GenStereotypes; }
        public int getPosGen_GenStereotypes_GenStereotype() { return posGen_GenStereotypes_GenStereotype; }
        public int getPosGen_GenClasses() { return posGen_GenClasses; }
        public int getPosGen_GenClasses_GenClasse() { return posGen_GenClasses_GenClasse; }
        public int getPosGen_GenClasses_GenClasse_GenProprieteClasses() { return posGen_GenClasses_GenClasse_GenProprieteClasses; }
        public int getPosGen_GenClasses_GenClasse_GenProprieteClasses_GenProprieteClasse() { return posGen_GenClasses_GenClasse_GenProprieteClasses_GenProprieteClasse; }
        public int getPosGen_GenClasses_GenClasse_GenAttributs() { return posGen_GenClasses_GenClasse_GenAttributs; }
        public int getPosGen_GenClasses_GenClasse_GenAttributs_GenAttribut() { return posGen_GenClasses_GenClasse_GenAttributs_GenAttribut; }
        public int getPosGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs() { return posGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs; }
        public int getPosGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs_GenProprieteAttribut() { return posGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs_GenProprieteAttribut; }
        public int getPosGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs() { return posGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs; }
        public int getPosGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs_GenStereotypeAttribut() { return posGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs_GenStereotypeAttribut; }
        public int getPosGen_GenClasses_GenClasse_GenMethodes() { return posGen_GenClasses_GenClasse_GenMethodes; }
        public int getPosGen_GenClasses_GenClasse_GenMethodes_GenMethode() { return posGen_GenClasses_GenClasse_GenMethodes_GenMethode; }
        public int getPosGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes() { return posGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes; }
        public int getPosGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes_GenProprieteMethode() { return posGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes_GenProprieteMethode; }
        public int getPosGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres() { return posGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres; }
        public int getPosGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres_GenParametre() { return posGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres_GenParametre; }
        public int getPosGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes() { return posGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes; }
        public int getPosGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes_GenStereotypeMethode() { return posGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes_GenStereotypeMethode; }
        public int getPosGen_GenClasses_GenClasse_GenStereotypeClasses() { return posGen_GenClasses_GenClasse_GenStereotypeClasses; }
        public int getPosGen_GenClasses_GenClasse_GenStereotypeClasses_GenStereotypeClasse() { return posGen_GenClasses_GenClasse_GenStereotypeClasses_GenStereotypeClasse; }
        public int getPosGen_GenClasses_GenClasse_GenAssociations() { return posGen_GenClasses_GenClasse_GenAssociations; }
        public int getPosGen_GenClasses_GenClasse_GenAssociations_GenAssociation() { return posGen_GenClasses_GenClasse_GenAssociations_GenAssociation; }
        public int getPosGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs() { return posGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs; }
        public int getPosGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs_GenAssociationAttribut() { return posGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs_GenAssociationAttribut; }
        public int getPosGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenClasseDeAssociation() { return posGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenClasseDeAssociation; }
        public int getPosGen_GenClasses_GenClasse_GenClasseParents() { return posGen_GenClasses_GenClasse_GenClasseParents; }
        public int getPosGen_GenClasses_GenClasse_GenClasseParents_GenClasseParent() { return posGen_GenClasses_GenClasse_GenClasseParents_GenClasseParent; }
        public int getPosGen_GenGenerate() { return posGen_GenGenerate; }
        public int getPosGen_GenGenerate_GenGenererParClasses() { return posGen_GenGenerate_GenGenererParClasses; }
        public int getPosGen_GenGenerate_GenGenererParClasses_GenGenererParClasse() { return posGen_GenGenerate_GenGenererParClasses_GenGenererParClasse; }
        public int getPosGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses() { return posGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses; }
        public int getPosGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses_GenClasseRefPourGenererParClasse() { return posGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses_GenClasseRefPourGenererParClasse; }
        public int getPosGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses() { return posGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses; }
        public int getPosGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses_GenTemplateGroupeRefPourGenererParClasse() { return posGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses_GenTemplateGroupeRefPourGenererParClasse; }
        public int getPosGen_GenGenerate_GenGenererParTemplates() { return posGen_GenGenerate_GenGenererParTemplates; }
        public int getPosGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate() { return posGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate; }
        public int getPosGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates() { return posGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates; }
        public int getPosGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate() { return posGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate; }
        public int getPosGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates() { return posGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates; }
        public int getPosGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates_GenStereotypeRefPourGenererParTemplate() { return posGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates_GenStereotypeRefPourGenererParTemplate; }
        public int getPosGen_GenGenerate_GenGenererParStereotypes() { return posGen_GenGenerate_GenGenererParStereotypes; }
        public int getPosGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype() { return posGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype; }
        public int getPosGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes() { return posGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes; }
        public int getPosGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype() { return posGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype; }
        public int getPosGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes() { return posGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes; }
        public int getPosGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes_GenTemplateGroupeRefPourGenererParStereotype() { return posGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes_GenTemplateGroupeRefPourGenererParStereotype; }
        
		public final Gen getGen() { return Gen; }
		public final GenTemplates getGen_GenTemplates() { return Gen_GenTemplates; }
		public final GenTemplate getGen_GenTemplates_GenTemplate() { return Gen_GenTemplates_GenTemplate; }
		public final GenTemplateGroupes getGen_GenTemplateGroupes() { return Gen_GenTemplateGroupes; }
		public final GenTemplateGroupe getGen_GenTemplateGroupes_GenTemplateGroupe() { return Gen_GenTemplateGroupes_GenTemplateGroupe; }
		public final GenTemplateRef getGen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateRef() { return Gen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateRef; }
		public final GenStereotypes getGen_GenStereotypes() { return Gen_GenStereotypes; }
		public final GenStereotype getGen_GenStereotypes_GenStereotype() { return Gen_GenStereotypes_GenStereotype; }
		public final GenClasses getGen_GenClasses() { return Gen_GenClasses; }
		public final GenClasse getGen_GenClasses_GenClasse() { return Gen_GenClasses_GenClasse; }
		public final GenProprieteClasses getGen_GenClasses_GenClasse_GenProprieteClasses() { return Gen_GenClasses_GenClasse_GenProprieteClasses; }
		public final GenProprieteClasse getGen_GenClasses_GenClasse_GenProprieteClasses_GenProprieteClasse() { return Gen_GenClasses_GenClasse_GenProprieteClasses_GenProprieteClasse; }
		public final GenAttributs getGen_GenClasses_GenClasse_GenAttributs() { return Gen_GenClasses_GenClasse_GenAttributs; }
		public final GenAttribut getGen_GenClasses_GenClasse_GenAttributs_GenAttribut() { return Gen_GenClasses_GenClasse_GenAttributs_GenAttribut; }
		public final GenProprieteAttributs getGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs() { return Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs; }
		public final GenProprieteAttribut getGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs_GenProprieteAttribut() { return Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs_GenProprieteAttribut; }
		public final GenStereotypeAttributs getGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs() { return Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs; }
		public final GenStereotypeAttribut getGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs_GenStereotypeAttribut() { return Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs_GenStereotypeAttribut; }
		public final GenMethodes getGen_GenClasses_GenClasse_GenMethodes() { return Gen_GenClasses_GenClasse_GenMethodes; }
		public final GenMethode getGen_GenClasses_GenClasse_GenMethodes_GenMethode() { return Gen_GenClasses_GenClasse_GenMethodes_GenMethode; }
		public final GenProprieteMethodes getGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes() { return Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes; }
		public final GenProprieteMethode getGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes_GenProprieteMethode() { return Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes_GenProprieteMethode; }
		public final GenParametres getGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres() { return Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres; }
		public final GenParametre getGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres_GenParametre() { return Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres_GenParametre; }
		public final GenStereotypeMethodes getGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes() { return Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes; }
		public final GenStereotypeMethode getGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes_GenStereotypeMethode() { return Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes_GenStereotypeMethode; }
		public final GenStereotypeClasses getGen_GenClasses_GenClasse_GenStereotypeClasses() { return Gen_GenClasses_GenClasse_GenStereotypeClasses; }
		public final GenStereotypeClasse getGen_GenClasses_GenClasse_GenStereotypeClasses_GenStereotypeClasse() { return Gen_GenClasses_GenClasse_GenStereotypeClasses_GenStereotypeClasse; }
		public final GenAssociations getGen_GenClasses_GenClasse_GenAssociations() { return Gen_GenClasses_GenClasse_GenAssociations; }
		public final GenAssociation getGen_GenClasses_GenClasse_GenAssociations_GenAssociation() { return Gen_GenClasses_GenClasse_GenAssociations_GenAssociation; }
		public final GenAssociationAttributs getGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs() { return Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs; }
		public final GenAssociationAttribut getGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs_GenAssociationAttribut() { return Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs_GenAssociationAttribut; }
		public final GenClasseDeAssociation getGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenClasseDeAssociation() { return Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenClasseDeAssociation; }
		public final GenClasseParents getGen_GenClasses_GenClasse_GenClasseParents() { return Gen_GenClasses_GenClasse_GenClasseParents; }
		public final GenClasseParent getGen_GenClasses_GenClasse_GenClasseParents_GenClasseParent() { return Gen_GenClasses_GenClasse_GenClasseParents_GenClasseParent; }
		public final GenGenerate getGen_GenGenerate() { return Gen_GenGenerate; }
		public final GenGenererParClasses getGen_GenGenerate_GenGenererParClasses() { return Gen_GenGenerate_GenGenererParClasses; }
		public final GenGenererParClasse getGen_GenGenerate_GenGenererParClasses_GenGenererParClasse() { return Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse; }
		public final GenClasseRefPourGenererParClasses getGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses() { return Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses; }
		public final GenClasseRefPourGenererParClasse getGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses_GenClasseRefPourGenererParClasse() { return Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses_GenClasseRefPourGenererParClasse; }
		public final GenTemplateGroupeRefPourGenererParClasses getGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses() { return Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses; }
		public final GenTemplateGroupeRefPourGenererParClasse getGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses_GenTemplateGroupeRefPourGenererParClasse() { return Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses_GenTemplateGroupeRefPourGenererParClasse; }
		public final GenGenererParTemplates getGen_GenGenerate_GenGenererParTemplates() { return Gen_GenGenerate_GenGenererParTemplates; }
		public final GenGenererParTemplate getGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate() { return Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate; }
		public final GenTemplateGroupeRefPourGenererParTemplates getGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates() { return Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates; }
		public final GenTemplateGroupeRefPourGenererParTemplate getGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate() { return Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate; }
		public final GenStereotypeRefPourGenererParTemplates getGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates() { return Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates; }
		public final GenStereotypeRefPourGenererParTemplate getGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates_GenStereotypeRefPourGenererParTemplate() { return Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates_GenStereotypeRefPourGenererParTemplate; }
		public final GenGenererParStereotypes getGen_GenGenerate_GenGenererParStereotypes() { return Gen_GenGenerate_GenGenererParStereotypes; }
		public final GenGenererParStereotype getGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype() { return Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype; }
		public final GenStereotypeRefPourGenererParStereotypes getGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes() { return Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes; }
		public final GenStereotypeRefPourGenererParStereotype getGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype() { return Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype; }
		public final GenTemplateGroupeRefPourGenererParStereotypes getGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes() { return Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes; }
		public final GenTemplateGroupeRefPourGenererParStereotype getGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes_GenTemplateGroupeRefPourGenererParStereotype() { return Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes_GenTemplateGroupeRefPourGenererParStereotype; }
		
		public final void setGen(Gen Gen) {
			this.definePosGen();
			this.Gen = Gen;
		}
		public final void setGen_GenTemplates(GenTemplates Gen_GenTemplates) {
			this.definePosGen_GenTemplates();
			this.Gen_GenTemplates = Gen_GenTemplates;
		}
		public final void setGen_GenTemplates_GenTemplate(GenTemplate Gen_GenTemplates_GenTemplate) {
			this.definePosGen_GenTemplates_GenTemplate();
			this.Gen_GenTemplates_GenTemplate = Gen_GenTemplates_GenTemplate;
		}
		public final void setGen_GenTemplateGroupes(GenTemplateGroupes Gen_GenTemplateGroupes) {
			this.definePosGen_GenTemplateGroupes();
			this.Gen_GenTemplateGroupes = Gen_GenTemplateGroupes;
		}
		public final void setGen_GenTemplateGroupes_GenTemplateGroupe(GenTemplateGroupe Gen_GenTemplateGroupes_GenTemplateGroupe) {
			this.definePosGen_GenTemplateGroupes_GenTemplateGroupe();
			this.Gen_GenTemplateGroupes_GenTemplateGroupe = Gen_GenTemplateGroupes_GenTemplateGroupe;
		}
		public final void setGen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateRef(GenTemplateRef Gen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateRef) {
			this.definePosGen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateRef();
			this.Gen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateRef = Gen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateRef;
		}
		public final void setGen_GenStereotypes(GenStereotypes Gen_GenStereotypes) {
			this.definePosGen_GenStereotypes();
			this.Gen_GenStereotypes = Gen_GenStereotypes;
		}
		public final void setGen_GenStereotypes_GenStereotype(GenStereotype Gen_GenStereotypes_GenStereotype) {
			this.definePosGen_GenStereotypes_GenStereotype();
			this.Gen_GenStereotypes_GenStereotype = Gen_GenStereotypes_GenStereotype;
		}
		public final void setGen_GenClasses(GenClasses Gen_GenClasses) {
			this.definePosGen_GenClasses();
			this.Gen_GenClasses = Gen_GenClasses;
		}
		public final void setGen_GenClasses_GenClasse(GenClasse Gen_GenClasses_GenClasse) {
			this.definePosGen_GenClasses_GenClasse();
			this.Gen_GenClasses_GenClasse = Gen_GenClasses_GenClasse;
		}
		public final void setGen_GenClasses_GenClasse_GenProprieteClasses(GenProprieteClasses Gen_GenClasses_GenClasse_GenProprieteClasses) {
			this.definePosGen_GenClasses_GenClasse_GenProprieteClasses();
			this.Gen_GenClasses_GenClasse_GenProprieteClasses = Gen_GenClasses_GenClasse_GenProprieteClasses;
		}
		public final void setGen_GenClasses_GenClasse_GenProprieteClasses_GenProprieteClasse(GenProprieteClasse Gen_GenClasses_GenClasse_GenProprieteClasses_GenProprieteClasse) {
			this.definePosGen_GenClasses_GenClasse_GenProprieteClasses_GenProprieteClasse();
			this.Gen_GenClasses_GenClasse_GenProprieteClasses_GenProprieteClasse = Gen_GenClasses_GenClasse_GenProprieteClasses_GenProprieteClasse;
		}
		public final void setGen_GenClasses_GenClasse_GenAttributs(GenAttributs Gen_GenClasses_GenClasse_GenAttributs) {
			this.definePosGen_GenClasses_GenClasse_GenAttributs();
			this.Gen_GenClasses_GenClasse_GenAttributs = Gen_GenClasses_GenClasse_GenAttributs;
		}
		public final void setGen_GenClasses_GenClasse_GenAttributs_GenAttribut(GenAttribut Gen_GenClasses_GenClasse_GenAttributs_GenAttribut) {
			this.definePosGen_GenClasses_GenClasse_GenAttributs_GenAttribut();
			this.Gen_GenClasses_GenClasse_GenAttributs_GenAttribut = Gen_GenClasses_GenClasse_GenAttributs_GenAttribut;
		}
		public final void setGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs(GenProprieteAttributs Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs) {
			this.definePosGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs();
			this.Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs = Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs;
		}
		public final void setGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs_GenProprieteAttribut(GenProprieteAttribut Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs_GenProprieteAttribut) {
			this.definePosGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs_GenProprieteAttribut();
			this.Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs_GenProprieteAttribut = Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs_GenProprieteAttribut;
		}
		public final void setGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs(GenStereotypeAttributs Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs) {
			this.definePosGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs();
			this.Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs = Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs;
		}
		public final void setGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs_GenStereotypeAttribut(GenStereotypeAttribut Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs_GenStereotypeAttribut) {
			this.definePosGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs_GenStereotypeAttribut();
			this.Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs_GenStereotypeAttribut = Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs_GenStereotypeAttribut;
		}
		public final void setGen_GenClasses_GenClasse_GenMethodes(GenMethodes Gen_GenClasses_GenClasse_GenMethodes) {
			this.definePosGen_GenClasses_GenClasse_GenMethodes();
			this.Gen_GenClasses_GenClasse_GenMethodes = Gen_GenClasses_GenClasse_GenMethodes;
		}
		public final void setGen_GenClasses_GenClasse_GenMethodes_GenMethode(GenMethode Gen_GenClasses_GenClasse_GenMethodes_GenMethode) {
			this.definePosGen_GenClasses_GenClasse_GenMethodes_GenMethode();
			this.Gen_GenClasses_GenClasse_GenMethodes_GenMethode = Gen_GenClasses_GenClasse_GenMethodes_GenMethode;
		}
		public final void setGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes(GenProprieteMethodes Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes) {
			this.definePosGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes();
			this.Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes = Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes;
		}
		public final void setGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes_GenProprieteMethode(GenProprieteMethode Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes_GenProprieteMethode) {
			this.definePosGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes_GenProprieteMethode();
			this.Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes_GenProprieteMethode = Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes_GenProprieteMethode;
		}
		public final void setGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres(GenParametres Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres) {
			this.definePosGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres();
			this.Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres = Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres;
		}
		public final void setGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres_GenParametre(GenParametre Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres_GenParametre) {
			this.definePosGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres_GenParametre();
			this.Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres_GenParametre = Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres_GenParametre;
		}
		public final void setGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes(GenStereotypeMethodes Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes) {
			this.definePosGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes();
			this.Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes = Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes;
		}
		public final void setGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes_GenStereotypeMethode(GenStereotypeMethode Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes_GenStereotypeMethode) {
			this.definePosGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes_GenStereotypeMethode();
			this.Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes_GenStereotypeMethode = Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes_GenStereotypeMethode;
		}
		public final void setGen_GenClasses_GenClasse_GenStereotypeClasses(GenStereotypeClasses Gen_GenClasses_GenClasse_GenStereotypeClasses) {
			this.definePosGen_GenClasses_GenClasse_GenStereotypeClasses();
			this.Gen_GenClasses_GenClasse_GenStereotypeClasses = Gen_GenClasses_GenClasse_GenStereotypeClasses;
		}
		public final void setGen_GenClasses_GenClasse_GenStereotypeClasses_GenStereotypeClasse(GenStereotypeClasse Gen_GenClasses_GenClasse_GenStereotypeClasses_GenStereotypeClasse) {
			this.definePosGen_GenClasses_GenClasse_GenStereotypeClasses_GenStereotypeClasse();
			this.Gen_GenClasses_GenClasse_GenStereotypeClasses_GenStereotypeClasse = Gen_GenClasses_GenClasse_GenStereotypeClasses_GenStereotypeClasse;
		}
		public final void setGen_GenClasses_GenClasse_GenAssociations(GenAssociations Gen_GenClasses_GenClasse_GenAssociations) {
			this.definePosGen_GenClasses_GenClasse_GenAssociations();
			this.Gen_GenClasses_GenClasse_GenAssociations = Gen_GenClasses_GenClasse_GenAssociations;
		}
		public final void setGen_GenClasses_GenClasse_GenAssociations_GenAssociation(GenAssociation Gen_GenClasses_GenClasse_GenAssociations_GenAssociation) {
			this.definePosGen_GenClasses_GenClasse_GenAssociations_GenAssociation();
			this.Gen_GenClasses_GenClasse_GenAssociations_GenAssociation = Gen_GenClasses_GenClasse_GenAssociations_GenAssociation;
		}
		public final void setGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs(GenAssociationAttributs Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs) {
			this.definePosGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs();
			this.Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs = Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs;
		}
		public final void setGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs_GenAssociationAttribut(GenAssociationAttribut Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs_GenAssociationAttribut) {
			this.definePosGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs_GenAssociationAttribut();
			this.Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs_GenAssociationAttribut = Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs_GenAssociationAttribut;
		}
		public final void setGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenClasseDeAssociation(GenClasseDeAssociation Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenClasseDeAssociation) {
			this.definePosGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenClasseDeAssociation();
			this.Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenClasseDeAssociation = Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenClasseDeAssociation;
		}
		public final void setGen_GenClasses_GenClasse_GenClasseParents(GenClasseParents Gen_GenClasses_GenClasse_GenClasseParents) {
			this.definePosGen_GenClasses_GenClasse_GenClasseParents();
			this.Gen_GenClasses_GenClasse_GenClasseParents = Gen_GenClasses_GenClasse_GenClasseParents;
		}
		public final void setGen_GenClasses_GenClasse_GenClasseParents_GenClasseParent(GenClasseParent Gen_GenClasses_GenClasse_GenClasseParents_GenClasseParent) {
			this.definePosGen_GenClasses_GenClasse_GenClasseParents_GenClasseParent();
			this.Gen_GenClasses_GenClasse_GenClasseParents_GenClasseParent = Gen_GenClasses_GenClasse_GenClasseParents_GenClasseParent;
		}
		public final void setGen_GenGenerate(GenGenerate Gen_GenGenerate) {
			this.definePosGen_GenGenerate();
			this.Gen_GenGenerate = Gen_GenGenerate;
		}
		public final void setGen_GenGenerate_GenGenererParClasses(GenGenererParClasses Gen_GenGenerate_GenGenererParClasses) {
			this.definePosGen_GenGenerate_GenGenererParClasses();
			this.Gen_GenGenerate_GenGenererParClasses = Gen_GenGenerate_GenGenererParClasses;
		}
		public final void setGen_GenGenerate_GenGenererParClasses_GenGenererParClasse(GenGenererParClasse Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse) {
			this.definePosGen_GenGenerate_GenGenererParClasses_GenGenererParClasse();
			this.Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse = Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse;
		}
		public final void setGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses(GenClasseRefPourGenererParClasses Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses) {
			this.definePosGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses();
			this.Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses = Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses;
		}
		public final void setGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses_GenClasseRefPourGenererParClasse(GenClasseRefPourGenererParClasse Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses_GenClasseRefPourGenererParClasse) {
			this.definePosGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses_GenClasseRefPourGenererParClasse();
			this.Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses_GenClasseRefPourGenererParClasse = Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses_GenClasseRefPourGenererParClasse;
		}
		public final void setGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses(GenTemplateGroupeRefPourGenererParClasses Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses) {
			this.definePosGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses();
			this.Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses = Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses;
		}
		public final void setGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses_GenTemplateGroupeRefPourGenererParClasse(GenTemplateGroupeRefPourGenererParClasse Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses_GenTemplateGroupeRefPourGenererParClasse) {
			this.definePosGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses_GenTemplateGroupeRefPourGenererParClasse();
			this.Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses_GenTemplateGroupeRefPourGenererParClasse = Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses_GenTemplateGroupeRefPourGenererParClasse;
		}
		public final void setGen_GenGenerate_GenGenererParTemplates(GenGenererParTemplates Gen_GenGenerate_GenGenererParTemplates) {
			this.definePosGen_GenGenerate_GenGenererParTemplates();
			this.Gen_GenGenerate_GenGenererParTemplates = Gen_GenGenerate_GenGenererParTemplates;
		}
		public final void setGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate(GenGenererParTemplate Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate) {
			this.definePosGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate();
			this.Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate = Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate;
		}
		public final void setGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates(GenTemplateGroupeRefPourGenererParTemplates Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates) {
			this.definePosGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates();
			this.Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates = Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates;
		}
		public final void setGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate(GenTemplateGroupeRefPourGenererParTemplate Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate) {
			this.definePosGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate();
			this.Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate = Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate;
		}
		public final void setGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates(GenStereotypeRefPourGenererParTemplates Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates) {
			this.definePosGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates();
			this.Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates = Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates;
		}
		public final void setGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates_GenStereotypeRefPourGenererParTemplate(GenStereotypeRefPourGenererParTemplate Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates_GenStereotypeRefPourGenererParTemplate) {
			this.definePosGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates_GenStereotypeRefPourGenererParTemplate();
			this.Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates_GenStereotypeRefPourGenererParTemplate = Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates_GenStereotypeRefPourGenererParTemplate;
		}
		public final void setGen_GenGenerate_GenGenererParStereotypes(GenGenererParStereotypes Gen_GenGenerate_GenGenererParStereotypes) {
			this.definePosGen_GenGenerate_GenGenererParStereotypes();
			this.Gen_GenGenerate_GenGenererParStereotypes = Gen_GenGenerate_GenGenererParStereotypes;
		}
		public final void setGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype(GenGenererParStereotype Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype) {
			this.definePosGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype();
			this.Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype = Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype;
		}
		public final void setGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes(GenStereotypeRefPourGenererParStereotypes Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes) {
			this.definePosGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes();
			this.Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes = Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes;
		}
		public final void setGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype(GenStereotypeRefPourGenererParStereotype Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype) {
			this.definePosGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype();
			this.Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype = Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype;
		}
		public final void setGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes(GenTemplateGroupeRefPourGenererParStereotypes Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes) {
			this.definePosGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes();
			this.Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes = Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes;
		}
		public final void setGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes_GenTemplateGroupeRefPourGenererParStereotype(GenTemplateGroupeRefPourGenererParStereotype Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes_GenTemplateGroupeRefPourGenererParStereotype) {
			this.definePosGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes_GenTemplateGroupeRefPourGenererParStereotype();
			this.Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes_GenTemplateGroupeRefPourGenererParStereotype = Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes_GenTemplateGroupeRefPourGenererParStereotype;
		}
    };
    
    public Gen getGen() {
        return enCours.getGen();
    }
    
    /**
     * Receive notification of the start of an element.
     * @param namespaceURI - The Namespace URI, or the empty string if the element has no Namespace URI or if Namespace processing is not being performed.
     * @param localName - The local name (without prefix), or the empty string if Namespace processing is not being performed.
     * @param qName - The qualified name (with prefix), or the empty string if qualified names are not available.
     * @param atts - The attributes attached to the element. If there are no attributes, it shall be an empty Attributes object.
     * @throws SAXException - Any SAX exception, possibly wrapping another exception.
     */
    public void startElement(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
        if (GenXmlNoeud.N_Gen.equalsIgnoreCase(localName)){
            startElement_Gen(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen() != null
         && GenXmlNoeud.N_Gen_GenTemplates.equalsIgnoreCase(localName)){
            startElement_Gen_GenTemplates(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenTemplates() != null
         && GenXmlNoeud.N_Gen_GenTemplates_GenTemplate.equalsIgnoreCase(localName)){
            startElement_Gen_GenTemplates_GenTemplate(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen() != null
         && GenXmlNoeud.N_Gen_GenTemplateGroupes.equalsIgnoreCase(localName)){
            startElement_Gen_GenTemplateGroupes(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenTemplateGroupes() != null
         && GenXmlNoeud.N_Gen_GenTemplateGroupes_GenTemplateGroupe.equalsIgnoreCase(localName)){
            startElement_Gen_GenTemplateGroupes_GenTemplateGroupe(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenTemplateGroupes_GenTemplateGroupe() != null
         && GenXmlNoeud.N_Gen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateRef.equalsIgnoreCase(localName)){
            startElement_Gen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateRef(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen() != null
         && GenXmlNoeud.N_Gen_GenStereotypes.equalsIgnoreCase(localName)){
            startElement_Gen_GenStereotypes(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenStereotypes() != null
         && GenXmlNoeud.N_Gen_GenStereotypes_GenStereotype.equalsIgnoreCase(localName)){
            startElement_Gen_GenStereotypes_GenStereotype(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen() != null
         && GenXmlNoeud.N_Gen_GenClasses.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenClasses() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenClasses_GenClasse() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenProprieteClasses.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse_GenProprieteClasses(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenProprieteClasses() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenProprieteClasses_GenProprieteClasse.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse_GenProprieteClasses_GenProprieteClasse(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenClasses_GenClasse() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAttributs.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse_GenAttributs(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenAttributs() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenAttributs_GenAttribut() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs_GenProprieteAttribut.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs_GenProprieteAttribut(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenAttributs_GenAttribut() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs_GenStereotypeAttribut.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs_GenStereotypeAttribut(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenClasses_GenClasse() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenMethodes.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse_GenMethodes(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenMethodes() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse_GenMethodes_GenMethode(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenMethodes_GenMethode() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes_GenProprieteMethode.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes_GenProprieteMethode(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenMethodes_GenMethode() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres_GenParametre.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres_GenParametre(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenMethodes_GenMethode() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes_GenStereotypeMethode.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes_GenStereotypeMethode(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenClasses_GenClasse() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenStereotypeClasses.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse_GenStereotypeClasses(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenStereotypeClasses() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenStereotypeClasses_GenStereotypeClasse.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse_GenStereotypeClasses_GenStereotypeClasse(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenClasses_GenClasse() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAssociations.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse_GenAssociations(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenAssociations() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenAssociations_GenAssociation() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs_GenAssociationAttribut.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs_GenAssociationAttribut(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenAssociations_GenAssociation() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenClasseDeAssociation.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenClasseDeAssociation(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenClasses_GenClasse() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseParents.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse_GenClasseParents(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenClasseParents() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseParents_GenClasseParent.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse_GenClasseParents_GenClasseParent(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen() != null
         && GenXmlNoeud.N_Gen_GenGenerate.equalsIgnoreCase(localName)){
            startElement_Gen_GenGenerate(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenGenerate() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenererParClasses.equalsIgnoreCase(localName)){
            startElement_Gen_GenGenerate_GenGenererParClasses(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenGenerate_GenGenererParClasses() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse.equalsIgnoreCase(localName)){
            startElement_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenGenerate_GenGenererParClasses_GenGenererParClasse() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses.equalsIgnoreCase(localName)){
            startElement_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses_GenClasseRefPourGenererParClasse.equalsIgnoreCase(localName)){
            startElement_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses_GenClasseRefPourGenererParClasse(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenGenerate_GenGenererParClasses_GenGenererParClasse() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses.equalsIgnoreCase(localName)){
            startElement_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses_GenTemplateGroupeRefPourGenererParClasse.equalsIgnoreCase(localName)){
            startElement_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses_GenTemplateGroupeRefPourGenererParClasse(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenGenerate() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenererParTemplates.equalsIgnoreCase(localName)){
            startElement_Gen_GenGenerate_GenGenererParTemplates(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenGenerate_GenGenererParTemplates() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate.equalsIgnoreCase(localName)){
            startElement_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates.equalsIgnoreCase(localName)){
            startElement_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate.equalsIgnoreCase(localName)){
            startElement_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates.equalsIgnoreCase(localName)){
            startElement_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates_GenStereotypeRefPourGenererParTemplate.equalsIgnoreCase(localName)){
            startElement_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates_GenStereotypeRefPourGenererParTemplate(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenGenerate() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenererParStereotypes.equalsIgnoreCase(localName)){
            startElement_Gen_GenGenerate_GenGenererParStereotypes(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenGenerate_GenGenererParStereotypes() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype.equalsIgnoreCase(localName)){
            startElement_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes.equalsIgnoreCase(localName)){
            startElement_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype.equalsIgnoreCase(localName)){
            startElement_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes.equalsIgnoreCase(localName)){
            startElement_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes(namespaceURI, localName, qName, atts);
        }
        if (enCours.getGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes_GenTemplateGroupeRefPourGenererParStereotype.equalsIgnoreCase(localName)){
            startElement_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes_GenTemplateGroupeRefPourGenererParStereotype(namespaceURI, localName, qName, atts);
        }
    }

    public void startElement_Gen(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	Gen gen = new GenBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGen( gen );
    }
    
    public void startElement_Gen_GenTemplates(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenTemplates genTemplates = new GenTemplatesBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenTemplates_A_InDir.equalsIgnoreCase(attName)) {
            	genTemplates.setInDirAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenTemplates_A_OutDir.equalsIgnoreCase(attName)) {
            	genTemplates.setOutDirAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenTemplates_A_PackageJavaBase.equalsIgnoreCase(attName)) {
            	genTemplates.setPackageJavaBaseAsString(atts.getValue(i));
            }
        }
        enCours.setGen_GenTemplates( genTemplates );
    }
    
    public void startElement_Gen_GenTemplates_GenTemplate(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenTemplate genTemplate = new GenTemplateBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenTemplates_GenTemplate_A_Nom.equalsIgnoreCase(attName)) {
            	genTemplate.setNomAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenTemplates_GenTemplate_A_File.equalsIgnoreCase(attName)) {
            	genTemplate.setFileAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenTemplates_GenTemplate_A_OutDir.equalsIgnoreCase(attName)) {
            	genTemplate.setOutDirAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenTemplates_GenTemplate_A_OutFile.equalsIgnoreCase(attName)) {
            	genTemplate.setOutFileAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenTemplates_GenTemplate_A_PackageJava.equalsIgnoreCase(attName)) {
            	genTemplate.setPackageJavaAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenTemplates_GenTemplate_A_NomElementGenere.equalsIgnoreCase(attName)) {
            	genTemplate.setNomElementGenereAsString(atts.getValue(i));
            }
        }
        enCours.setGen_GenTemplates_GenTemplate( genTemplate );
    }
    
    public void startElement_Gen_GenTemplateGroupes(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenTemplateGroupes genTemplateGroupes = new GenTemplateGroupesBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGen_GenTemplateGroupes( genTemplateGroupes );
    }
    
    public void startElement_Gen_GenTemplateGroupes_GenTemplateGroupe(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenTemplateGroupe genTemplateGroupe = new GenTemplateGroupeBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenTemplateGroupes_GenTemplateGroupe_A_Nom.equalsIgnoreCase(attName)) {
            	genTemplateGroupe.setNomAsString(atts.getValue(i));
            }
        }
        enCours.setGen_GenTemplateGroupes_GenTemplateGroupe( genTemplateGroupe );
    }
    
    public void startElement_Gen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateRef(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenTemplateRef genTemplateRef = new GenTemplateRefBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateRef_A_Nom.equalsIgnoreCase(attName)) {
            	genTemplateRef.setNomAsString(atts.getValue(i));
            }
        }
        enCours.setGen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateRef( genTemplateRef );
    }
    
    public void startElement_Gen_GenStereotypes(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenStereotypes genStereotypes = new GenStereotypesBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGen_GenStereotypes( genStereotypes );
    }
    
    public void startElement_Gen_GenStereotypes_GenStereotype(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenStereotype genStereotype = new GenStereotypeBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenStereotypes_GenStereotype_A_Nom.equalsIgnoreCase(attName)) {
            	genStereotype.setNomAsString(atts.getValue(i));
            }
        }
        enCours.setGen_GenStereotypes_GenStereotype( genStereotype );
    }
    
    public void startElement_Gen_GenClasses(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenClasses genClasses = new GenClassesBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenClasses_A_PackageBase.equalsIgnoreCase(attName)) {
            	genClasses.setPackageBaseAsString(atts.getValue(i));
            }
        }
        enCours.setGen_GenClasses( genClasses );
    }
    
    public void startElement_Gen_GenClasses_GenClasse(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenClasse genClasse = new GenClasseBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_A_GenId.equalsIgnoreCase(attName)) {
            	genClasse.setGenIdAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_A_NomJava.equalsIgnoreCase(attName)) {
            	genClasse.setNomJavaAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_A_PackageJava.equalsIgnoreCase(attName)) {
            	genClasse.setPackageJavaAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_A_NomTable.equalsIgnoreCase(attName)) {
            	genClasse.setNomTableAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_A_NomVue.equalsIgnoreCase(attName)) {
            	genClasse.setNomVueAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_A_Description.equalsIgnoreCase(attName)) {
            	genClasse.setDescriptionAsString(atts.getValue(i));
            }
        }
        enCours.setGen_GenClasses_GenClasse( genClasse );
    }
    
    public void startElement_Gen_GenClasses_GenClasse_GenProprieteClasses(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenProprieteClasses genProprieteClasses = new GenProprieteClassesBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGen_GenClasses_GenClasse_GenProprieteClasses( genProprieteClasses );
    }
    
    public void startElement_Gen_GenClasses_GenClasse_GenProprieteClasses_GenProprieteClasse(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenProprieteClasse genProprieteClasse = new GenProprieteClasseBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenProprieteClasses_GenProprieteClasse_A_Nom.equalsIgnoreCase(attName)) {
            	genProprieteClasse.setNomAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenProprieteClasses_GenProprieteClasse_A_Valeur.equalsIgnoreCase(attName)) {
            	genProprieteClasse.setValeurAsString(atts.getValue(i));
            }
        }
        enCours.setGen_GenClasses_GenClasse_GenProprieteClasses_GenProprieteClasse( genProprieteClasse );
    }
    
    public void startElement_Gen_GenClasses_GenClasse_GenAttributs(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenAttributs genAttributs = new GenAttributsBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGen_GenClasses_GenClasse_GenAttributs( genAttributs );
    }
    
    public void startElement_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenAttribut genAttribut = new GenAttributBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_A_GenId.equalsIgnoreCase(attName)) {
            	genAttribut.setGenIdAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_A_NomJava.equalsIgnoreCase(attName)) {
            	genAttribut.setNomJavaAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_A_Type.equalsIgnoreCase(attName)) {
            	genAttribut.setTypeAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_A_NbMin.equalsIgnoreCase(attName)) {
            	genAttribut.setNbMinAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_A_NbMax.equalsIgnoreCase(attName)) {
            	genAttribut.setNbMaxAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_A_NomSQL.equalsIgnoreCase(attName)) {
            	genAttribut.setNomSQLAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_A_TypeSQL.equalsIgnoreCase(attName)) {
            	genAttribut.setTypeSQLAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_A_EstDansTable.equalsIgnoreCase(attName)) {
            	genAttribut.setEstDansTableAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_A_Size.equalsIgnoreCase(attName)) {
            	genAttribut.setSizeAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_A_EstClePrimaire.equalsIgnoreCase(attName)) {
            	genAttribut.setEstClePrimaireAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_A_EstCleIncrementee.equalsIgnoreCase(attName)) {
            	genAttribut.setEstCleIncrementeeAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_A_AssociationId.equalsIgnoreCase(attName)) {
            	genAttribut.setAssociationIdAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_A_Description.equalsIgnoreCase(attName)) {
            	genAttribut.setDescriptionAsString(atts.getValue(i));
            }
        }
        enCours.setGen_GenClasses_GenClasse_GenAttributs_GenAttribut( genAttribut );
    }
    
    public void startElement_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenProprieteAttributs genProprieteAttributs = new GenProprieteAttributsBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs( genProprieteAttributs );
    }
    
    public void startElement_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs_GenProprieteAttribut(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenProprieteAttribut genProprieteAttribut = new GenProprieteAttributBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs_GenProprieteAttribut_A_Nom.equalsIgnoreCase(attName)) {
            	genProprieteAttribut.setNomAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs_GenProprieteAttribut_A_Valeur.equalsIgnoreCase(attName)) {
            	genProprieteAttribut.setValeurAsString(atts.getValue(i));
            }
        }
        enCours.setGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs_GenProprieteAttribut( genProprieteAttribut );
    }
    
    public void startElement_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenStereotypeAttributs genStereotypeAttributs = new GenStereotypeAttributsBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs( genStereotypeAttributs );
    }
    
    public void startElement_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs_GenStereotypeAttribut(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenStereotypeAttribut genStereotypeAttribut = new GenStereotypeAttributBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs_GenStereotypeAttribut_A_Nom.equalsIgnoreCase(attName)) {
            	genStereotypeAttribut.setNomAsString(atts.getValue(i));
            }
        }
        enCours.setGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs_GenStereotypeAttribut( genStereotypeAttribut );
    }
    
    public void startElement_Gen_GenClasses_GenClasse_GenMethodes(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenMethodes genMethodes = new GenMethodesBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGen_GenClasses_GenClasse_GenMethodes( genMethodes );
    }
    
    public void startElement_Gen_GenClasses_GenClasse_GenMethodes_GenMethode(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenMethode genMethode = new GenMethodeBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_A_GenId.equalsIgnoreCase(attName)) {
            	genMethode.setGenIdAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_A_NomJava.equalsIgnoreCase(attName)) {
            	genMethode.setNomJavaAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_A_RetourType.equalsIgnoreCase(attName)) {
            	genMethode.setRetourTypeAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_A_Description.equalsIgnoreCase(attName)) {
            	genMethode.setDescriptionAsString(atts.getValue(i));
            }
        }
        enCours.setGen_GenClasses_GenClasse_GenMethodes_GenMethode( genMethode );
    }
    
    public void startElement_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenProprieteMethodes genProprieteMethodes = new GenProprieteMethodesBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes( genProprieteMethodes );
    }
    
    public void startElement_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes_GenProprieteMethode(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenProprieteMethode genProprieteMethode = new GenProprieteMethodeBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes_GenProprieteMethode_A_Nom.equalsIgnoreCase(attName)) {
            	genProprieteMethode.setNomAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes_GenProprieteMethode_A_Valeur.equalsIgnoreCase(attName)) {
            	genProprieteMethode.setValeurAsString(atts.getValue(i));
            }
        }
        enCours.setGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes_GenProprieteMethode( genProprieteMethode );
    }
    
    public void startElement_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenParametres genParametres = new GenParametresBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres( genParametres );
    }
    
    public void startElement_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres_GenParametre(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenParametre genParametre = new GenParametreBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres_GenParametre_A_GenId.equalsIgnoreCase(attName)) {
            	genParametre.setGenIdAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres_GenParametre_A_NomJava.equalsIgnoreCase(attName)) {
            	genParametre.setNomJavaAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres_GenParametre_A_Type.equalsIgnoreCase(attName)) {
            	genParametre.setTypeAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres_GenParametre_A_Description.equalsIgnoreCase(attName)) {
            	genParametre.setDescriptionAsString(atts.getValue(i));
            }
        }
        enCours.setGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres_GenParametre( genParametre );
    }
    
    public void startElement_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenStereotypeMethodes genStereotypeMethodes = new GenStereotypeMethodesBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes( genStereotypeMethodes );
    }
    
    public void startElement_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes_GenStereotypeMethode(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenStereotypeMethode genStereotypeMethode = new GenStereotypeMethodeBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes_GenStereotypeMethode_A_Nom.equalsIgnoreCase(attName)) {
            	genStereotypeMethode.setNomAsString(atts.getValue(i));
            }
        }
        enCours.setGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes_GenStereotypeMethode( genStereotypeMethode );
    }
    
    public void startElement_Gen_GenClasses_GenClasse_GenStereotypeClasses(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenStereotypeClasses genStereotypeClasses = new GenStereotypeClassesBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGen_GenClasses_GenClasse_GenStereotypeClasses( genStereotypeClasses );
    }
    
    public void startElement_Gen_GenClasses_GenClasse_GenStereotypeClasses_GenStereotypeClasse(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenStereotypeClasse genStereotypeClasse = new GenStereotypeClasseBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenStereotypeClasses_GenStereotypeClasse_A_Nom.equalsIgnoreCase(attName)) {
            	genStereotypeClasse.setNomAsString(atts.getValue(i));
            }
        }
        enCours.setGen_GenClasses_GenClasse_GenStereotypeClasses_GenStereotypeClasse( genStereotypeClasse );
    }
    
    public void startElement_Gen_GenClasses_GenClasse_GenAssociations(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenAssociations genAssociations = new GenAssociationsBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGen_GenClasses_GenClasse_GenAssociations( genAssociations );
    }
    
    public void startElement_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenAssociation genAssociation = new GenAssociationBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_A_GenId.equalsIgnoreCase(attName)) {
            	genAssociation.setGenIdAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_A_NomJava.equalsIgnoreCase(attName)) {
            	genAssociation.setNomJavaAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_A_ClasseGenId.equalsIgnoreCase(attName)) {
            	genAssociation.setClasseGenIdAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_A_NbMin.equalsIgnoreCase(attName)) {
            	genAssociation.setNbMinAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_A_NbMax.equalsIgnoreCase(attName)) {
            	genAssociation.setNbMaxAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_A_Description.equalsIgnoreCase(attName)) {
            	genAssociation.setDescriptionAsString(atts.getValue(i));
            }
        }
        enCours.setGen_GenClasses_GenClasse_GenAssociations_GenAssociation( genAssociation );
    }
    
    public void startElement_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenAssociationAttributs genAssociationAttributs = new GenAssociationAttributsBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs( genAssociationAttributs );
    }
    
    public void startElement_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs_GenAssociationAttribut(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenAssociationAttribut genAssociationAttribut = new GenAssociationAttributBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs_GenAssociationAttribut_A_GenId.equalsIgnoreCase(attName)) {
            	genAssociationAttribut.setGenIdAsString(atts.getValue(i));
            }
        }
        enCours.setGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs_GenAssociationAttribut( genAssociationAttribut );
    }
    
    public void startElement_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenClasseDeAssociation(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenClasseDeAssociation genClasseDeAssociation = new GenClasseDeAssociationBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenClasseDeAssociation_A__type.equalsIgnoreCase(attName)) {
            	genClasseDeAssociation.set_typeAsString(atts.getValue(i));
            }
        }
        enCours.setGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenClasseDeAssociation( genClasseDeAssociation );
    }
    
    public void startElement_Gen_GenClasses_GenClasse_GenClasseParents(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenClasseParents genClasseParents = new GenClasseParentsBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGen_GenClasses_GenClasse_GenClasseParents( genClasseParents );
    }
    
    public void startElement_Gen_GenClasses_GenClasse_GenClasseParents_GenClasseParent(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenClasseParent genClasseParent = new GenClasseParentBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseParents_GenClasseParent_A_ClasseGenId.equalsIgnoreCase(attName)) {
            	genClasseParent.setClasseGenIdAsString(atts.getValue(i));
            }
        }
        enCours.setGen_GenClasses_GenClasse_GenClasseParents_GenClasseParent( genClasseParent );
    }
    
    public void startElement_Gen_GenGenerate(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenGenerate genGenerate = new GenGenerateBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGen_GenGenerate( genGenerate );
    }
    
    public void startElement_Gen_GenGenerate_GenGenererParClasses(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenGenererParClasses genGenererParClasses = new GenGenererParClassesBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGen_GenGenerate_GenGenererParClasses( genGenererParClasses );
    }
    
    public void startElement_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenGenererParClasse genGenererParClasse = new GenGenererParClasseBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGen_GenGenerate_GenGenererParClasses_GenGenererParClasse( genGenererParClasse );
    }
    
    public void startElement_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenClasseRefPourGenererParClasses genClasseRefPourGenererParClasses = new GenClasseRefPourGenererParClassesBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses( genClasseRefPourGenererParClasses );
    }
    
    public void startElement_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses_GenClasseRefPourGenererParClasse(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenClasseRefPourGenererParClasse genClasseRefPourGenererParClasse = new GenClasseRefPourGenererParClasseBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses_GenClasseRefPourGenererParClasse_A_ClasseGenId.equalsIgnoreCase(attName)) {
            	genClasseRefPourGenererParClasse.setClasseGenIdAsString(atts.getValue(i));
            }
        }
        enCours.setGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses_GenClasseRefPourGenererParClasse( genClasseRefPourGenererParClasse );
    }
    
    public void startElement_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenTemplateGroupeRefPourGenererParClasses genTemplateGroupeRefPourGenererParClasses = new GenTemplateGroupeRefPourGenererParClassesBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses( genTemplateGroupeRefPourGenererParClasses );
    }
    
    public void startElement_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses_GenTemplateGroupeRefPourGenererParClasse(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenTemplateGroupeRefPourGenererParClasse genTemplateGroupeRefPourGenererParClasse = new GenTemplateGroupeRefPourGenererParClasseBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses_GenTemplateGroupeRefPourGenererParClasse_A_TemplateGroupeNom.equalsIgnoreCase(attName)) {
            	genTemplateGroupeRefPourGenererParClasse.setTemplateGroupeNomAsString(atts.getValue(i));
            }
        }
        enCours.setGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses_GenTemplateGroupeRefPourGenererParClasse( genTemplateGroupeRefPourGenererParClasse );
    }
    
    public void startElement_Gen_GenGenerate_GenGenererParTemplates(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenGenererParTemplates genGenererParTemplates = new GenGenererParTemplatesBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGen_GenGenerate_GenGenererParTemplates( genGenererParTemplates );
    }
    
    public void startElement_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenGenererParTemplate genGenererParTemplate = new GenGenererParTemplateBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate( genGenererParTemplate );
    }
    
    public void startElement_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenTemplateGroupeRefPourGenererParTemplates genTemplateGroupeRefPourGenererParTemplates = new GenTemplateGroupeRefPourGenererParTemplatesBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates( genTemplateGroupeRefPourGenererParTemplates );
    }
    
    public void startElement_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenTemplateGroupeRefPourGenererParTemplate genTemplateGroupeRefPourGenererParTemplate = new GenTemplateGroupeRefPourGenererParTemplateBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_A_TemplateGroupeNom.equalsIgnoreCase(attName)) {
            	genTemplateGroupeRefPourGenererParTemplate.setTemplateGroupeNomAsString(atts.getValue(i));
            }
        }
        enCours.setGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate( genTemplateGroupeRefPourGenererParTemplate );
    }
    
    public void startElement_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenStereotypeRefPourGenererParTemplates genStereotypeRefPourGenererParTemplates = new GenStereotypeRefPourGenererParTemplatesBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates( genStereotypeRefPourGenererParTemplates );
    }
    
    public void startElement_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates_GenStereotypeRefPourGenererParTemplate(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenStereotypeRefPourGenererParTemplate genStereotypeRefPourGenererParTemplate = new GenStereotypeRefPourGenererParTemplateBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates_GenStereotypeRefPourGenererParTemplate_A_StereotypeNom.equalsIgnoreCase(attName)) {
            	genStereotypeRefPourGenererParTemplate.setStereotypeNomAsString(atts.getValue(i));
            }
        }
        enCours.setGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates_GenStereotypeRefPourGenererParTemplate( genStereotypeRefPourGenererParTemplate );
    }
    
    public void startElement_Gen_GenGenerate_GenGenererParStereotypes(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenGenererParStereotypes genGenererParStereotypes = new GenGenererParStereotypesBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGen_GenGenerate_GenGenererParStereotypes( genGenererParStereotypes );
    }
    
    public void startElement_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenGenererParStereotype genGenererParStereotype = new GenGenererParStereotypeBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype( genGenererParStereotype );
    }
    
    public void startElement_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenStereotypeRefPourGenererParStereotypes genStereotypeRefPourGenererParStereotypes = new GenStereotypeRefPourGenererParStereotypesBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes( genStereotypeRefPourGenererParStereotypes );
    }
    
    public void startElement_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenStereotypeRefPourGenererParStereotype genStereotypeRefPourGenererParStereotype = new GenStereotypeRefPourGenererParStereotypeBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_A_StereotypeNom.equalsIgnoreCase(attName)) {
            	genStereotypeRefPourGenererParStereotype.setStereotypeNomAsString(atts.getValue(i));
            }
        }
        enCours.setGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype( genStereotypeRefPourGenererParStereotype );
    }
    
    public void startElement_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenTemplateGroupeRefPourGenererParStereotypes genTemplateGroupeRefPourGenererParStereotypes = new GenTemplateGroupeRefPourGenererParStereotypesBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes( genTemplateGroupeRefPourGenererParStereotypes );
    }
    
    public void startElement_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes_GenTemplateGroupeRefPourGenererParStereotype(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenTemplateGroupeRefPourGenererParStereotype genTemplateGroupeRefPourGenererParStereotype = new GenTemplateGroupeRefPourGenererParStereotypeBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes_GenTemplateGroupeRefPourGenererParStereotype_A_TemplateGroupeNom.equalsIgnoreCase(attName)) {
            	genTemplateGroupeRefPourGenererParStereotype.setTemplateGroupeNomAsString(atts.getValue(i));
            }
        }
        enCours.setGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes_GenTemplateGroupeRefPourGenererParStereotype( genTemplateGroupeRefPourGenererParStereotype );
    }
    
    
    /**
     * Receive notification of character data inside an element.
     * @param ch - The characters.
     * @param start - The start position in the character array.
     * @param length - The number of characters to use from the character array.
     * @throws SAXException - Any SAX exception, possibly wrapping another exception.
     */
    public void characters(char[] ch, int start, int length)
    throws SAXException {
        String strValue = new String(ch, start, length);
        enCours.setStrValue(strValue);
    }
    
    /**
     * Receive notification of the end of an element.
     * @param namespaceURI - The Namespace URI, or the empty string if the element has no Namespace URI or if Namespace processing is not being performed.
     * @param localName - The local name (without prefix), or the empty string if Namespace processing is not being performed.
     * @param qName - The qualified name (with prefix), or the empty string if qualified names are not available.
     * @throws SAXException - Any SAX exception, possibly wrapping another exception.
     */
    public void endElement(String namespaceURI, String localName, String qName)
    throws SAXException {
        if (enCours.getGen() != null
         && GenXmlNoeud.N_Gen.equalsIgnoreCase(localName)){
            endElement_Gen(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenTemplates() != null
         && GenXmlNoeud.N_Gen_GenTemplates.equalsIgnoreCase(localName)){
            endElement_Gen_GenTemplates(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenTemplates_GenTemplate() != null
         && GenXmlNoeud.N_Gen_GenTemplates_GenTemplate.equalsIgnoreCase(localName)){
            endElement_Gen_GenTemplates_GenTemplate(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenTemplateGroupes() != null
         && GenXmlNoeud.N_Gen_GenTemplateGroupes.equalsIgnoreCase(localName)){
            endElement_Gen_GenTemplateGroupes(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenTemplateGroupes_GenTemplateGroupe() != null
         && GenXmlNoeud.N_Gen_GenTemplateGroupes_GenTemplateGroupe.equalsIgnoreCase(localName)){
            endElement_Gen_GenTemplateGroupes_GenTemplateGroupe(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateRef() != null
         && GenXmlNoeud.N_Gen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateRef.equalsIgnoreCase(localName)){
            endElement_Gen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateRef(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenStereotypes() != null
         && GenXmlNoeud.N_Gen_GenStereotypes.equalsIgnoreCase(localName)){
            endElement_Gen_GenStereotypes(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenStereotypes_GenStereotype() != null
         && GenXmlNoeud.N_Gen_GenStereotypes_GenStereotype.equalsIgnoreCase(localName)){
            endElement_Gen_GenStereotypes_GenStereotype(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenClasses() != null
         && GenXmlNoeud.N_Gen_GenClasses.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenClasses_GenClasse() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenProprieteClasses() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenProprieteClasses.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse_GenProprieteClasses(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenProprieteClasses_GenProprieteClasse() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenProprieteClasses_GenProprieteClasse.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse_GenProprieteClasses_GenProprieteClasse(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenAttributs() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAttributs.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse_GenAttributs(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenAttributs_GenAttribut() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs_GenProprieteAttribut() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs_GenProprieteAttribut.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs_GenProprieteAttribut(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs_GenStereotypeAttribut() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs_GenStereotypeAttribut.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs_GenStereotypeAttribut(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenMethodes() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenMethodes.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse_GenMethodes(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenMethodes_GenMethode() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse_GenMethodes_GenMethode(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes_GenProprieteMethode() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes_GenProprieteMethode.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes_GenProprieteMethode(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres_GenParametre() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres_GenParametre.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres_GenParametre(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes_GenStereotypeMethode() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes_GenStereotypeMethode.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes_GenStereotypeMethode(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenStereotypeClasses() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenStereotypeClasses.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse_GenStereotypeClasses(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenStereotypeClasses_GenStereotypeClasse() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenStereotypeClasses_GenStereotypeClasse.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse_GenStereotypeClasses_GenStereotypeClasse(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenAssociations() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAssociations.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse_GenAssociations(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenAssociations_GenAssociation() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs_GenAssociationAttribut() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs_GenAssociationAttribut.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs_GenAssociationAttribut(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenClasseDeAssociation() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenClasseDeAssociation.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenClasseDeAssociation(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenClasseParents() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseParents.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse_GenClasseParents(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenClasses_GenClasse_GenClasseParents_GenClasseParent() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseParents_GenClasseParent.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse_GenClasseParents_GenClasseParent(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenGenerate() != null
         && GenXmlNoeud.N_Gen_GenGenerate.equalsIgnoreCase(localName)){
            endElement_Gen_GenGenerate(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenGenerate_GenGenererParClasses() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenererParClasses.equalsIgnoreCase(localName)){
            endElement_Gen_GenGenerate_GenGenererParClasses(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenGenerate_GenGenererParClasses_GenGenererParClasse() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse.equalsIgnoreCase(localName)){
            endElement_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses.equalsIgnoreCase(localName)){
            endElement_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses_GenClasseRefPourGenererParClasse() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses_GenClasseRefPourGenererParClasse.equalsIgnoreCase(localName)){
            endElement_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses_GenClasseRefPourGenererParClasse(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses.equalsIgnoreCase(localName)){
            endElement_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses_GenTemplateGroupeRefPourGenererParClasse() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses_GenTemplateGroupeRefPourGenererParClasse.equalsIgnoreCase(localName)){
            endElement_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses_GenTemplateGroupeRefPourGenererParClasse(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenGenerate_GenGenererParTemplates() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenererParTemplates.equalsIgnoreCase(localName)){
            endElement_Gen_GenGenerate_GenGenererParTemplates(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate.equalsIgnoreCase(localName)){
            endElement_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates.equalsIgnoreCase(localName)){
            endElement_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate.equalsIgnoreCase(localName)){
            endElement_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates.equalsIgnoreCase(localName)){
            endElement_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates_GenStereotypeRefPourGenererParTemplate() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates_GenStereotypeRefPourGenererParTemplate.equalsIgnoreCase(localName)){
            endElement_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates_GenStereotypeRefPourGenererParTemplate(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenGenerate_GenGenererParStereotypes() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenererParStereotypes.equalsIgnoreCase(localName)){
            endElement_Gen_GenGenerate_GenGenererParStereotypes(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype.equalsIgnoreCase(localName)){
            endElement_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes.equalsIgnoreCase(localName)){
            endElement_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype.equalsIgnoreCase(localName)){
            endElement_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes.equalsIgnoreCase(localName)){
            endElement_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes(namespaceURI, localName, qName);
        }
        if (enCours.getGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes_GenTemplateGroupeRefPourGenererParStereotype() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes_GenTemplateGroupeRefPourGenererParStereotype.equalsIgnoreCase(localName)){
            endElement_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes_GenTemplateGroupeRefPourGenererParStereotype(namespaceURI, localName, qName);
        }
    }

    public void endElement_Gen(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.setGen(enCours.getGen());
    }
    
    public void endElement_Gen_GenTemplates(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGen().setGenTemplates(enCours.getGen_GenTemplates());
    	enCours.setGen_GenTemplates(null);
    }
    
    public void endElement_Gen_GenTemplates_GenTemplate(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenTemplates() == null) {
    		enCours.setGen_GenTemplates(new GenTemplatesBean());
    	}
    	enCours.getGen_GenTemplates().addGenTemplate(enCours.getGen_GenTemplates_GenTemplate());
    	enCours.setGen_GenTemplates_GenTemplate(null);
    }
    
    public void endElement_Gen_GenTemplateGroupes(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGen().setGenTemplateGroupes(enCours.getGen_GenTemplateGroupes());
    	enCours.setGen_GenTemplateGroupes(null);
    }
    
    public void endElement_Gen_GenTemplateGroupes_GenTemplateGroupe(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenTemplateGroupes() == null) {
    		enCours.setGen_GenTemplateGroupes(new GenTemplateGroupesBean());
    	}
    	enCours.getGen_GenTemplateGroupes().addGenTemplateGroupe(enCours.getGen_GenTemplateGroupes_GenTemplateGroupe());
    	enCours.setGen_GenTemplateGroupes_GenTemplateGroupe(null);
    }
    
    public void endElement_Gen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateRef(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenTemplateGroupes_GenTemplateGroupe() == null) {
    		enCours.setGen_GenTemplateGroupes_GenTemplateGroupe(new GenTemplateGroupeBean());
    	}
    	enCours.getGen_GenTemplateGroupes_GenTemplateGroupe().addGenTemplateRef(enCours.getGen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateRef());
    	enCours.setGen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateRef(null);
    }
    
    public void endElement_Gen_GenStereotypes(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGen().setGenStereotypes(enCours.getGen_GenStereotypes());
    	enCours.setGen_GenStereotypes(null);
    }
    
    public void endElement_Gen_GenStereotypes_GenStereotype(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenStereotypes() == null) {
    		enCours.setGen_GenStereotypes(new GenStereotypesBean());
    	}
    	enCours.getGen_GenStereotypes().addGenStereotype(enCours.getGen_GenStereotypes_GenStereotype());
    	enCours.setGen_GenStereotypes_GenStereotype(null);
    }
    
    public void endElement_Gen_GenClasses(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGen().setGenClasses(enCours.getGen_GenClasses());
    	enCours.setGen_GenClasses(null);
    }
    
    public void endElement_Gen_GenClasses_GenClasse(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenClasses() == null) {
    		enCours.setGen_GenClasses(new GenClassesBean());
    	}
    	enCours.getGen_GenClasses().addGenClasse(enCours.getGen_GenClasses_GenClasse());
    	enCours.setGen_GenClasses_GenClasse(null);
    }
    
    public void endElement_Gen_GenClasses_GenClasse_GenProprieteClasses(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGen_GenClasses_GenClasse().setGenProprieteClasses(enCours.getGen_GenClasses_GenClasse_GenProprieteClasses());
    	enCours.setGen_GenClasses_GenClasse_GenProprieteClasses(null);
    }
    
    public void endElement_Gen_GenClasses_GenClasse_GenProprieteClasses_GenProprieteClasse(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenClasses_GenClasse_GenProprieteClasses() == null) {
    		enCours.setGen_GenClasses_GenClasse_GenProprieteClasses(new GenProprieteClassesBean());
    	}
    	enCours.getGen_GenClasses_GenClasse_GenProprieteClasses().addGenProprieteClasse(enCours.getGen_GenClasses_GenClasse_GenProprieteClasses_GenProprieteClasse());
    	enCours.setGen_GenClasses_GenClasse_GenProprieteClasses_GenProprieteClasse(null);
    }
    
    public void endElement_Gen_GenClasses_GenClasse_GenAttributs(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGen_GenClasses_GenClasse().setGenAttributs(enCours.getGen_GenClasses_GenClasse_GenAttributs());
    	enCours.setGen_GenClasses_GenClasse_GenAttributs(null);
    }
    
    public void endElement_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenClasses_GenClasse_GenAttributs() == null) {
    		enCours.setGen_GenClasses_GenClasse_GenAttributs(new GenAttributsBean());
    	}
    	enCours.getGen_GenClasses_GenClasse_GenAttributs().addGenAttribut(enCours.getGen_GenClasses_GenClasse_GenAttributs_GenAttribut());
    	enCours.setGen_GenClasses_GenClasse_GenAttributs_GenAttribut(null);
    }
    
    public void endElement_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGen_GenClasses_GenClasse_GenAttributs_GenAttribut().setGenProprieteAttributs(enCours.getGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs());
    	enCours.setGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs(null);
    }
    
    public void endElement_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs_GenProprieteAttribut(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs() == null) {
    		enCours.setGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs(new GenProprieteAttributsBean());
    	}
    	enCours.getGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs().addGenProprieteAttribut(enCours.getGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs_GenProprieteAttribut());
    	enCours.setGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs_GenProprieteAttribut(null);
    }
    
    public void endElement_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGen_GenClasses_GenClasse_GenAttributs_GenAttribut().setGenStereotypeAttributs(enCours.getGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs());
    	enCours.setGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs(null);
    }
    
    public void endElement_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs_GenStereotypeAttribut(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs() == null) {
    		enCours.setGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs(new GenStereotypeAttributsBean());
    	}
    	enCours.getGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs().addGenStereotypeAttribut(enCours.getGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs_GenStereotypeAttribut());
    	enCours.setGen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs_GenStereotypeAttribut(null);
    }
    
    public void endElement_Gen_GenClasses_GenClasse_GenMethodes(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGen_GenClasses_GenClasse().setGenMethodes(enCours.getGen_GenClasses_GenClasse_GenMethodes());
    	enCours.setGen_GenClasses_GenClasse_GenMethodes(null);
    }
    
    public void endElement_Gen_GenClasses_GenClasse_GenMethodes_GenMethode(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenClasses_GenClasse_GenMethodes() == null) {
    		enCours.setGen_GenClasses_GenClasse_GenMethodes(new GenMethodesBean());
    	}
    	enCours.getGen_GenClasses_GenClasse_GenMethodes().addGenMethode(enCours.getGen_GenClasses_GenClasse_GenMethodes_GenMethode());
    	enCours.setGen_GenClasses_GenClasse_GenMethodes_GenMethode(null);
    }
    
    public void endElement_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGen_GenClasses_GenClasse_GenMethodes_GenMethode().setGenProprieteMethodes(enCours.getGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes());
    	enCours.setGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes(null);
    }
    
    public void endElement_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes_GenProprieteMethode(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes() == null) {
    		enCours.setGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes(new GenProprieteMethodesBean());
    	}
    	enCours.getGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes().addGenProprieteMethode(enCours.getGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes_GenProprieteMethode());
    	enCours.setGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes_GenProprieteMethode(null);
    }
    
    public void endElement_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGen_GenClasses_GenClasse_GenMethodes_GenMethode().setGenParametres(enCours.getGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres());
    	enCours.setGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres(null);
    }
    
    public void endElement_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres_GenParametre(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres() == null) {
    		enCours.setGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres(new GenParametresBean());
    	}
    	enCours.getGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres().addGenParametre(enCours.getGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres_GenParametre());
    	enCours.setGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres_GenParametre(null);
    }
    
    public void endElement_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGen_GenClasses_GenClasse_GenMethodes_GenMethode().setGenStereotypeMethodes(enCours.getGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes());
    	enCours.setGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes(null);
    }
    
    public void endElement_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes_GenStereotypeMethode(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes() == null) {
    		enCours.setGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes(new GenStereotypeMethodesBean());
    	}
    	enCours.getGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes().addGenStereotypeMethode(enCours.getGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes_GenStereotypeMethode());
    	enCours.setGen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes_GenStereotypeMethode(null);
    }
    
    public void endElement_Gen_GenClasses_GenClasse_GenStereotypeClasses(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGen_GenClasses_GenClasse().setGenStereotypeClasses(enCours.getGen_GenClasses_GenClasse_GenStereotypeClasses());
    	enCours.setGen_GenClasses_GenClasse_GenStereotypeClasses(null);
    }
    
    public void endElement_Gen_GenClasses_GenClasse_GenStereotypeClasses_GenStereotypeClasse(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenClasses_GenClasse_GenStereotypeClasses() == null) {
    		enCours.setGen_GenClasses_GenClasse_GenStereotypeClasses(new GenStereotypeClassesBean());
    	}
    	enCours.getGen_GenClasses_GenClasse_GenStereotypeClasses().addGenStereotypeClasse(enCours.getGen_GenClasses_GenClasse_GenStereotypeClasses_GenStereotypeClasse());
    	enCours.setGen_GenClasses_GenClasse_GenStereotypeClasses_GenStereotypeClasse(null);
    }
    
    public void endElement_Gen_GenClasses_GenClasse_GenAssociations(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGen_GenClasses_GenClasse().setGenAssociations(enCours.getGen_GenClasses_GenClasse_GenAssociations());
    	enCours.setGen_GenClasses_GenClasse_GenAssociations(null);
    }
    
    public void endElement_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenClasses_GenClasse_GenAssociations() == null) {
    		enCours.setGen_GenClasses_GenClasse_GenAssociations(new GenAssociationsBean());
    	}
    	enCours.getGen_GenClasses_GenClasse_GenAssociations().addGenAssociation(enCours.getGen_GenClasses_GenClasse_GenAssociations_GenAssociation());
    	enCours.setGen_GenClasses_GenClasse_GenAssociations_GenAssociation(null);
    }
    
    public void endElement_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGen_GenClasses_GenClasse_GenAssociations_GenAssociation().setGenAssociationAttributs(enCours.getGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs());
    	enCours.setGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs(null);
    }
    
    public void endElement_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs_GenAssociationAttribut(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs() == null) {
    		enCours.setGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs(new GenAssociationAttributsBean());
    	}
    	enCours.getGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs().addGenAssociationAttribut(enCours.getGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs_GenAssociationAttribut());
    	enCours.setGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs_GenAssociationAttribut(null);
    }
    
    public void endElement_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenClasseDeAssociation(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGen_GenClasses_GenClasse_GenAssociations_GenAssociation().setGenClasseDeAssociation(enCours.getGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenClasseDeAssociation());
    	enCours.setGen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenClasseDeAssociation(null);
    }
    
    public void endElement_Gen_GenClasses_GenClasse_GenClasseParents(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGen_GenClasses_GenClasse().setGenClasseParents(enCours.getGen_GenClasses_GenClasse_GenClasseParents());
    	enCours.setGen_GenClasses_GenClasse_GenClasseParents(null);
    }
    
    public void endElement_Gen_GenClasses_GenClasse_GenClasseParents_GenClasseParent(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenClasses_GenClasse_GenClasseParents() == null) {
    		enCours.setGen_GenClasses_GenClasse_GenClasseParents(new GenClasseParentsBean());
    	}
    	enCours.getGen_GenClasses_GenClasse_GenClasseParents().addGenClasseParent(enCours.getGen_GenClasses_GenClasse_GenClasseParents_GenClasseParent());
    	enCours.setGen_GenClasses_GenClasse_GenClasseParents_GenClasseParent(null);
    }
    
    public void endElement_Gen_GenGenerate(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGen().setGenGenerate(enCours.getGen_GenGenerate());
    	enCours.setGen_GenGenerate(null);
    }
    
    public void endElement_Gen_GenGenerate_GenGenererParClasses(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGen_GenGenerate().setGenGenererParClasses(enCours.getGen_GenGenerate_GenGenererParClasses());
    	enCours.setGen_GenGenerate_GenGenererParClasses(null);
    }
    
    public void endElement_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenGenerate_GenGenererParClasses() == null) {
    		enCours.setGen_GenGenerate_GenGenererParClasses(new GenGenererParClassesBean());
    	}
    	enCours.getGen_GenGenerate_GenGenererParClasses().addGenGenererParClasse(enCours.getGen_GenGenerate_GenGenererParClasses_GenGenererParClasse());
    	enCours.setGen_GenGenerate_GenGenererParClasses_GenGenererParClasse(null);
    }
    
    public void endElement_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGen_GenGenerate_GenGenererParClasses_GenGenererParClasse().setGenClasseRefPourGenererParClasses(enCours.getGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses());
    	enCours.setGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses(null);
    }
    
    public void endElement_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses_GenClasseRefPourGenererParClasse(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses() == null) {
    		enCours.setGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses(new GenClasseRefPourGenererParClassesBean());
    	}
    	enCours.getGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses().addGenClasseRefPourGenererParClasse(enCours.getGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses_GenClasseRefPourGenererParClasse());
    	enCours.setGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses_GenClasseRefPourGenererParClasse(null);
    }
    
    public void endElement_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGen_GenGenerate_GenGenererParClasses_GenGenererParClasse().setGenTemplateGroupeRefPourGenererParClasses(enCours.getGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses());
    	enCours.setGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses(null);
    }
    
    public void endElement_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses_GenTemplateGroupeRefPourGenererParClasse(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses() == null) {
    		enCours.setGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses(new GenTemplateGroupeRefPourGenererParClassesBean());
    	}
    	enCours.getGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses().addGenTemplateGroupeRefPourGenererParClasse(enCours.getGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses_GenTemplateGroupeRefPourGenererParClasse());
    	enCours.setGen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses_GenTemplateGroupeRefPourGenererParClasse(null);
    }
    
    public void endElement_Gen_GenGenerate_GenGenererParTemplates(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGen_GenGenerate().setGenGenererParTemplates(enCours.getGen_GenGenerate_GenGenererParTemplates());
    	enCours.setGen_GenGenerate_GenGenererParTemplates(null);
    }
    
    public void endElement_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenGenerate_GenGenererParTemplates() == null) {
    		enCours.setGen_GenGenerate_GenGenererParTemplates(new GenGenererParTemplatesBean());
    	}
    	enCours.getGen_GenGenerate_GenGenererParTemplates().addGenGenererParTemplate(enCours.getGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate());
    	enCours.setGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate(null);
    }
    
    public void endElement_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate().setGenTemplateGroupeRefPourGenererParTemplates(enCours.getGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates());
    	enCours.setGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates(null);
    }
    
    public void endElement_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates() == null) {
    		enCours.setGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates(new GenTemplateGroupeRefPourGenererParTemplatesBean());
    	}
    	enCours.getGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates().addGenTemplateGroupeRefPourGenererParTemplate(enCours.getGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate());
    	enCours.setGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate(null);
    }
    
    public void endElement_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate().setGenStereotypeRefPourGenererParTemplates(enCours.getGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates());
    	enCours.setGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates(null);
    }
    
    public void endElement_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates_GenStereotypeRefPourGenererParTemplate(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates() == null) {
    		enCours.setGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates(new GenStereotypeRefPourGenererParTemplatesBean());
    	}
    	enCours.getGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates().addGenStereotypeRefPourGenererParTemplate(enCours.getGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates_GenStereotypeRefPourGenererParTemplate());
    	enCours.setGen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates_GenStereotypeRefPourGenererParTemplate(null);
    }
    
    public void endElement_Gen_GenGenerate_GenGenererParStereotypes(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGen_GenGenerate().setGenGenererParStereotypes(enCours.getGen_GenGenerate_GenGenererParStereotypes());
    	enCours.setGen_GenGenerate_GenGenererParStereotypes(null);
    }
    
    public void endElement_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenGenerate_GenGenererParStereotypes() == null) {
    		enCours.setGen_GenGenerate_GenGenererParStereotypes(new GenGenererParStereotypesBean());
    	}
    	enCours.getGen_GenGenerate_GenGenererParStereotypes().addGenGenererParStereotype(enCours.getGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype());
    	enCours.setGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype(null);
    }
    
    public void endElement_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype().setGenStereotypeRefPourGenererParStereotypes(enCours.getGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes());
    	enCours.setGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes(null);
    }
    
    public void endElement_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes() == null) {
    		enCours.setGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes(new GenStereotypeRefPourGenererParStereotypesBean());
    	}
    	enCours.getGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes().addGenStereotypeRefPourGenererParStereotype(enCours.getGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype());
    	enCours.setGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype(null);
    }
    
    public void endElement_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype().setGenTemplateGroupeRefPourGenererParStereotypes(enCours.getGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes());
    	enCours.setGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes(null);
    }
    
    public void endElement_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes_GenTemplateGroupeRefPourGenererParStereotype(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes() == null) {
    		enCours.setGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes(new GenTemplateGroupeRefPourGenererParStereotypesBean());
    	}
    	enCours.getGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes().addGenTemplateGroupeRefPourGenererParStereotype(enCours.getGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes_GenTemplateGroupeRefPourGenererParStereotype());
    	enCours.setGen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes_GenTemplateGroupeRefPourGenererParStereotype(null);
    }
    
	    
}
