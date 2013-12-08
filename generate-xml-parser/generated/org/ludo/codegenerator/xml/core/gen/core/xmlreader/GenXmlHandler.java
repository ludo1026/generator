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
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenGenererGroupeBean;
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
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererGroupe;
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
    	
        private Gen gen = null;
        private GenTemplates genTemplates = null;
        private GenTemplate genTemplate = null;
        private GenTemplateGroupes genTemplateGroupes = null;
        private GenTemplateGroupe genTemplateGroupe = null;
        private GenTemplateRef genTemplateRef = null;
        private GenStereotypes genStereotypes = null;
        private GenStereotype genStereotype = null;
        private GenClasses genClasses = null;
        private GenClasse genClasse = null;
        private GenProprieteClasses genProprieteClasses = null;
        private GenProprieteClasse genProprieteClasse = null;
        private GenAttributs genAttributs = null;
        private GenAttribut genAttribut = null;
        private GenProprieteAttributs genProprieteAttributs = null;
        private GenProprieteAttribut genProprieteAttribut = null;
        private GenStereotypeAttributs genStereotypeAttributs = null;
        private GenStereotypeAttribut genStereotypeAttribut = null;
        private GenMethodes genMethodes = null;
        private GenMethode genMethode = null;
        private GenProprieteMethodes genProprieteMethodes = null;
        private GenProprieteMethode genProprieteMethode = null;
        private GenParametres genParametres = null;
        private GenParametre genParametre = null;
        private GenStereotypeMethodes genStereotypeMethodes = null;
        private GenStereotypeMethode genStereotypeMethode = null;
        private GenStereotypeClasses genStereotypeClasses = null;
        private GenStereotypeClasse genStereotypeClasse = null;
        private GenAssociations genAssociations = null;
        private GenAssociation genAssociation = null;
        private GenAssociationAttributs genAssociationAttributs = null;
        private GenAssociationAttribut genAssociationAttribut = null;
        private GenClasseDeAssociation genClasseDeAssociation = null;
        private GenClasseParents genClasseParents = null;
        private GenClasseParent genClasseParent = null;
        private GenGenererGroupe genGenererGroupe = null;
        private GenGenererParClasses genGenererParClasses = null;
        private GenGenererParClasse genGenererParClasse = null;
        private GenClasseRefPourGenererParClasses genClasseRefPourGenererParClasses = null;
        private GenClasseRefPourGenererParClasse genClasseRefPourGenererParClasse = null;
        private GenTemplateGroupeRefPourGenererParClasses genTemplateGroupeRefPourGenererParClasses = null;
        private GenTemplateGroupeRefPourGenererParClasse genTemplateGroupeRefPourGenererParClasse = null;
        private GenGenererParTemplates genGenererParTemplates = null;
        private GenGenererParTemplate genGenererParTemplate = null;
        private GenTemplateGroupeRefPourGenererParTemplates genTemplateGroupeRefPourGenererParTemplates = null;
        private GenTemplateGroupeRefPourGenererParTemplate genTemplateGroupeRefPourGenererParTemplate = null;
        private GenStereotypeRefPourGenererParTemplates genStereotypeRefPourGenererParTemplates = null;
        private GenStereotypeRefPourGenererParTemplate genStereotypeRefPourGenererParTemplate = null;
        private GenGenererParStereotypes genGenererParStereotypes = null;
        private GenGenererParStereotype genGenererParStereotype = null;
        private GenStereotypeRefPourGenererParStereotypes genStereotypeRefPourGenererParStereotypes = null;
        private GenStereotypeRefPourGenererParStereotype genStereotypeRefPourGenererParStereotype = null;
        private GenTemplateGroupeRefPourGenererParStereotypes genTemplateGroupeRefPourGenererParStereotypes = null;
        private GenTemplateGroupeRefPourGenererParStereotype genTemplateGroupeRefPourGenererParStereotype = null;
        
        public int posCompteur = 0;
        public int posGen = 0;
        public int posGenTemplates = 0;
        public int posGenTemplate = 0;
        public int posGenTemplateGroupes = 0;
        public int posGenTemplateGroupe = 0;
        public int posGenTemplateRef = 0;
        public int posGenStereotypes = 0;
        public int posGenStereotype = 0;
        public int posGenClasses = 0;
        public int posGenClasse = 0;
        public int posGenProprieteClasses = 0;
        public int posGenProprieteClasse = 0;
        public int posGenAttributs = 0;
        public int posGenAttribut = 0;
        public int posGenProprieteAttributs = 0;
        public int posGenProprieteAttribut = 0;
        public int posGenStereotypeAttributs = 0;
        public int posGenStereotypeAttribut = 0;
        public int posGenMethodes = 0;
        public int posGenMethode = 0;
        public int posGenProprieteMethodes = 0;
        public int posGenProprieteMethode = 0;
        public int posGenParametres = 0;
        public int posGenParametre = 0;
        public int posGenStereotypeMethodes = 0;
        public int posGenStereotypeMethode = 0;
        public int posGenStereotypeClasses = 0;
        public int posGenStereotypeClasse = 0;
        public int posGenAssociations = 0;
        public int posGenAssociation = 0;
        public int posGenAssociationAttributs = 0;
        public int posGenAssociationAttribut = 0;
        public int posGenClasseDeAssociation = 0;
        public int posGenClasseParents = 0;
        public int posGenClasseParent = 0;
        public int posGenGenererGroupe = 0;
        public int posGenGenererParClasses = 0;
        public int posGenGenererParClasse = 0;
        public int posGenClasseRefPourGenererParClasses = 0;
        public int posGenClasseRefPourGenererParClasse = 0;
        public int posGenTemplateGroupeRefPourGenererParClasses = 0;
        public int posGenTemplateGroupeRefPourGenererParClasse = 0;
        public int posGenGenererParTemplates = 0;
        public int posGenGenererParTemplate = 0;
        public int posGenTemplateGroupeRefPourGenererParTemplates = 0;
        public int posGenTemplateGroupeRefPourGenererParTemplate = 0;
        public int posGenStereotypeRefPourGenererParTemplates = 0;
        public int posGenStereotypeRefPourGenererParTemplate = 0;
        public int posGenGenererParStereotypes = 0;
        public int posGenGenererParStereotype = 0;
        public int posGenStereotypeRefPourGenererParStereotypes = 0;
        public int posGenStereotypeRefPourGenererParStereotype = 0;
        public int posGenTemplateGroupeRefPourGenererParStereotypes = 0;
        public int posGenTemplateGroupeRefPourGenererParStereotype = 0;

        public void definePosGen() { posGen = ++ posCompteur; }
        public void definePosGenTemplates() { posGenTemplates = ++ posCompteur; }
        public void definePosGenTemplate() { posGenTemplate = ++ posCompteur; }
        public void definePosGenTemplateGroupes() { posGenTemplateGroupes = ++ posCompteur; }
        public void definePosGenTemplateGroupe() { posGenTemplateGroupe = ++ posCompteur; }
        public void definePosGenTemplateRef() { posGenTemplateRef = ++ posCompteur; }
        public void definePosGenStereotypes() { posGenStereotypes = ++ posCompteur; }
        public void definePosGenStereotype() { posGenStereotype = ++ posCompteur; }
        public void definePosGenClasses() { posGenClasses = ++ posCompteur; }
        public void definePosGenClasse() { posGenClasse = ++ posCompteur; }
        public void definePosGenProprieteClasses() { posGenProprieteClasses = ++ posCompteur; }
        public void definePosGenProprieteClasse() { posGenProprieteClasse = ++ posCompteur; }
        public void definePosGenAttributs() { posGenAttributs = ++ posCompteur; }
        public void definePosGenAttribut() { posGenAttribut = ++ posCompteur; }
        public void definePosGenProprieteAttributs() { posGenProprieteAttributs = ++ posCompteur; }
        public void definePosGenProprieteAttribut() { posGenProprieteAttribut = ++ posCompteur; }
        public void definePosGenStereotypeAttributs() { posGenStereotypeAttributs = ++ posCompteur; }
        public void definePosGenStereotypeAttribut() { posGenStereotypeAttribut = ++ posCompteur; }
        public void definePosGenMethodes() { posGenMethodes = ++ posCompteur; }
        public void definePosGenMethode() { posGenMethode = ++ posCompteur; }
        public void definePosGenProprieteMethodes() { posGenProprieteMethodes = ++ posCompteur; }
        public void definePosGenProprieteMethode() { posGenProprieteMethode = ++ posCompteur; }
        public void definePosGenParametres() { posGenParametres = ++ posCompteur; }
        public void definePosGenParametre() { posGenParametre = ++ posCompteur; }
        public void definePosGenStereotypeMethodes() { posGenStereotypeMethodes = ++ posCompteur; }
        public void definePosGenStereotypeMethode() { posGenStereotypeMethode = ++ posCompteur; }
        public void definePosGenStereotypeClasses() { posGenStereotypeClasses = ++ posCompteur; }
        public void definePosGenStereotypeClasse() { posGenStereotypeClasse = ++ posCompteur; }
        public void definePosGenAssociations() { posGenAssociations = ++ posCompteur; }
        public void definePosGenAssociation() { posGenAssociation = ++ posCompteur; }
        public void definePosGenAssociationAttributs() { posGenAssociationAttributs = ++ posCompteur; }
        public void definePosGenAssociationAttribut() { posGenAssociationAttribut = ++ posCompteur; }
        public void definePosGenClasseDeAssociation() { posGenClasseDeAssociation = ++ posCompteur; }
        public void definePosGenClasseParents() { posGenClasseParents = ++ posCompteur; }
        public void definePosGenClasseParent() { posGenClasseParent = ++ posCompteur; }
        public void definePosGenGenererGroupe() { posGenGenererGroupe = ++ posCompteur; }
        public void definePosGenGenererParClasses() { posGenGenererParClasses = ++ posCompteur; }
        public void definePosGenGenererParClasse() { posGenGenererParClasse = ++ posCompteur; }
        public void definePosGenClasseRefPourGenererParClasses() { posGenClasseRefPourGenererParClasses = ++ posCompteur; }
        public void definePosGenClasseRefPourGenererParClasse() { posGenClasseRefPourGenererParClasse = ++ posCompteur; }
        public void definePosGenTemplateGroupeRefPourGenererParClasses() { posGenTemplateGroupeRefPourGenererParClasses = ++ posCompteur; }
        public void definePosGenTemplateGroupeRefPourGenererParClasse() { posGenTemplateGroupeRefPourGenererParClasse = ++ posCompteur; }
        public void definePosGenGenererParTemplates() { posGenGenererParTemplates = ++ posCompteur; }
        public void definePosGenGenererParTemplate() { posGenGenererParTemplate = ++ posCompteur; }
        public void definePosGenTemplateGroupeRefPourGenererParTemplates() { posGenTemplateGroupeRefPourGenererParTemplates = ++ posCompteur; }
        public void definePosGenTemplateGroupeRefPourGenererParTemplate() { posGenTemplateGroupeRefPourGenererParTemplate = ++ posCompteur; }
        public void definePosGenStereotypeRefPourGenererParTemplates() { posGenStereotypeRefPourGenererParTemplates = ++ posCompteur; }
        public void definePosGenStereotypeRefPourGenererParTemplate() { posGenStereotypeRefPourGenererParTemplate = ++ posCompteur; }
        public void definePosGenGenererParStereotypes() { posGenGenererParStereotypes = ++ posCompteur; }
        public void definePosGenGenererParStereotype() { posGenGenererParStereotype = ++ posCompteur; }
        public void definePosGenStereotypeRefPourGenererParStereotypes() { posGenStereotypeRefPourGenererParStereotypes = ++ posCompteur; }
        public void definePosGenStereotypeRefPourGenererParStereotype() { posGenStereotypeRefPourGenererParStereotype = ++ posCompteur; }
        public void definePosGenTemplateGroupeRefPourGenererParStereotypes() { posGenTemplateGroupeRefPourGenererParStereotypes = ++ posCompteur; }
        public void definePosGenTemplateGroupeRefPourGenererParStereotype() { posGenTemplateGroupeRefPourGenererParStereotype = ++ posCompteur; }

        public int getPosGen() { return posGen; }
        public int getPosGenTemplates() { return posGenTemplates; }
        public int getPosGenTemplate() { return posGenTemplate; }
        public int getPosGenTemplateGroupes() { return posGenTemplateGroupes; }
        public int getPosGenTemplateGroupe() { return posGenTemplateGroupe; }
        public int getPosGenTemplateRef() { return posGenTemplateRef; }
        public int getPosGenStereotypes() { return posGenStereotypes; }
        public int getPosGenStereotype() { return posGenStereotype; }
        public int getPosGenClasses() { return posGenClasses; }
        public int getPosGenClasse() { return posGenClasse; }
        public int getPosGenProprieteClasses() { return posGenProprieteClasses; }
        public int getPosGenProprieteClasse() { return posGenProprieteClasse; }
        public int getPosGenAttributs() { return posGenAttributs; }
        public int getPosGenAttribut() { return posGenAttribut; }
        public int getPosGenProprieteAttributs() { return posGenProprieteAttributs; }
        public int getPosGenProprieteAttribut() { return posGenProprieteAttribut; }
        public int getPosGenStereotypeAttributs() { return posGenStereotypeAttributs; }
        public int getPosGenStereotypeAttribut() { return posGenStereotypeAttribut; }
        public int getPosGenMethodes() { return posGenMethodes; }
        public int getPosGenMethode() { return posGenMethode; }
        public int getPosGenProprieteMethodes() { return posGenProprieteMethodes; }
        public int getPosGenProprieteMethode() { return posGenProprieteMethode; }
        public int getPosGenParametres() { return posGenParametres; }
        public int getPosGenParametre() { return posGenParametre; }
        public int getPosGenStereotypeMethodes() { return posGenStereotypeMethodes; }
        public int getPosGenStereotypeMethode() { return posGenStereotypeMethode; }
        public int getPosGenStereotypeClasses() { return posGenStereotypeClasses; }
        public int getPosGenStereotypeClasse() { return posGenStereotypeClasse; }
        public int getPosGenAssociations() { return posGenAssociations; }
        public int getPosGenAssociation() { return posGenAssociation; }
        public int getPosGenAssociationAttributs() { return posGenAssociationAttributs; }
        public int getPosGenAssociationAttribut() { return posGenAssociationAttribut; }
        public int getPosGenClasseDeAssociation() { return posGenClasseDeAssociation; }
        public int getPosGenClasseParents() { return posGenClasseParents; }
        public int getPosGenClasseParent() { return posGenClasseParent; }
        public int getPosGenGenererGroupe() { return posGenGenererGroupe; }
        public int getPosGenGenererParClasses() { return posGenGenererParClasses; }
        public int getPosGenGenererParClasse() { return posGenGenererParClasse; }
        public int getPosGenClasseRefPourGenererParClasses() { return posGenClasseRefPourGenererParClasses; }
        public int getPosGenClasseRefPourGenererParClasse() { return posGenClasseRefPourGenererParClasse; }
        public int getPosGenTemplateGroupeRefPourGenererParClasses() { return posGenTemplateGroupeRefPourGenererParClasses; }
        public int getPosGenTemplateGroupeRefPourGenererParClasse() { return posGenTemplateGroupeRefPourGenererParClasse; }
        public int getPosGenGenererParTemplates() { return posGenGenererParTemplates; }
        public int getPosGenGenererParTemplate() { return posGenGenererParTemplate; }
        public int getPosGenTemplateGroupeRefPourGenererParTemplates() { return posGenTemplateGroupeRefPourGenererParTemplates; }
        public int getPosGenTemplateGroupeRefPourGenererParTemplate() { return posGenTemplateGroupeRefPourGenererParTemplate; }
        public int getPosGenStereotypeRefPourGenererParTemplates() { return posGenStereotypeRefPourGenererParTemplates; }
        public int getPosGenStereotypeRefPourGenererParTemplate() { return posGenStereotypeRefPourGenererParTemplate; }
        public int getPosGenGenererParStereotypes() { return posGenGenererParStereotypes; }
        public int getPosGenGenererParStereotype() { return posGenGenererParStereotype; }
        public int getPosGenStereotypeRefPourGenererParStereotypes() { return posGenStereotypeRefPourGenererParStereotypes; }
        public int getPosGenStereotypeRefPourGenererParStereotype() { return posGenStereotypeRefPourGenererParStereotype; }
        public int getPosGenTemplateGroupeRefPourGenererParStereotypes() { return posGenTemplateGroupeRefPourGenererParStereotypes; }
        public int getPosGenTemplateGroupeRefPourGenererParStereotype() { return posGenTemplateGroupeRefPourGenererParStereotype; }
        
		public final Gen getGen() { return gen; }
		public final GenTemplates getGenTemplates() { return genTemplates; }
		public final GenTemplate getGenTemplate() { return genTemplate; }
		public final GenTemplateGroupes getGenTemplateGroupes() { return genTemplateGroupes; }
		public final GenTemplateGroupe getGenTemplateGroupe() { return genTemplateGroupe; }
		public final GenTemplateRef getGenTemplateRef() { return genTemplateRef; }
		public final GenStereotypes getGenStereotypes() { return genStereotypes; }
		public final GenStereotype getGenStereotype() { return genStereotype; }
		public final GenClasses getGenClasses() { return genClasses; }
		public final GenClasse getGenClasse() { return genClasse; }
		public final GenProprieteClasses getGenProprieteClasses() { return genProprieteClasses; }
		public final GenProprieteClasse getGenProprieteClasse() { return genProprieteClasse; }
		public final GenAttributs getGenAttributs() { return genAttributs; }
		public final GenAttribut getGenAttribut() { return genAttribut; }
		public final GenProprieteAttributs getGenProprieteAttributs() { return genProprieteAttributs; }
		public final GenProprieteAttribut getGenProprieteAttribut() { return genProprieteAttribut; }
		public final GenStereotypeAttributs getGenStereotypeAttributs() { return genStereotypeAttributs; }
		public final GenStereotypeAttribut getGenStereotypeAttribut() { return genStereotypeAttribut; }
		public final GenMethodes getGenMethodes() { return genMethodes; }
		public final GenMethode getGenMethode() { return genMethode; }
		public final GenProprieteMethodes getGenProprieteMethodes() { return genProprieteMethodes; }
		public final GenProprieteMethode getGenProprieteMethode() { return genProprieteMethode; }
		public final GenParametres getGenParametres() { return genParametres; }
		public final GenParametre getGenParametre() { return genParametre; }
		public final GenStereotypeMethodes getGenStereotypeMethodes() { return genStereotypeMethodes; }
		public final GenStereotypeMethode getGenStereotypeMethode() { return genStereotypeMethode; }
		public final GenStereotypeClasses getGenStereotypeClasses() { return genStereotypeClasses; }
		public final GenStereotypeClasse getGenStereotypeClasse() { return genStereotypeClasse; }
		public final GenAssociations getGenAssociations() { return genAssociations; }
		public final GenAssociation getGenAssociation() { return genAssociation; }
		public final GenAssociationAttributs getGenAssociationAttributs() { return genAssociationAttributs; }
		public final GenAssociationAttribut getGenAssociationAttribut() { return genAssociationAttribut; }
		public final GenClasseDeAssociation getGenClasseDeAssociation() { return genClasseDeAssociation; }
		public final GenClasseParents getGenClasseParents() { return genClasseParents; }
		public final GenClasseParent getGenClasseParent() { return genClasseParent; }
		public final GenGenererGroupe getGenGenererGroupe() { return genGenererGroupe; }
		public final GenGenererParClasses getGenGenererParClasses() { return genGenererParClasses; }
		public final GenGenererParClasse getGenGenererParClasse() { return genGenererParClasse; }
		public final GenClasseRefPourGenererParClasses getGenClasseRefPourGenererParClasses() { return genClasseRefPourGenererParClasses; }
		public final GenClasseRefPourGenererParClasse getGenClasseRefPourGenererParClasse() { return genClasseRefPourGenererParClasse; }
		public final GenTemplateGroupeRefPourGenererParClasses getGenTemplateGroupeRefPourGenererParClasses() { return genTemplateGroupeRefPourGenererParClasses; }
		public final GenTemplateGroupeRefPourGenererParClasse getGenTemplateGroupeRefPourGenererParClasse() { return genTemplateGroupeRefPourGenererParClasse; }
		public final GenGenererParTemplates getGenGenererParTemplates() { return genGenererParTemplates; }
		public final GenGenererParTemplate getGenGenererParTemplate() { return genGenererParTemplate; }
		public final GenTemplateGroupeRefPourGenererParTemplates getGenTemplateGroupeRefPourGenererParTemplates() { return genTemplateGroupeRefPourGenererParTemplates; }
		public final GenTemplateGroupeRefPourGenererParTemplate getGenTemplateGroupeRefPourGenererParTemplate() { return genTemplateGroupeRefPourGenererParTemplate; }
		public final GenStereotypeRefPourGenererParTemplates getGenStereotypeRefPourGenererParTemplates() { return genStereotypeRefPourGenererParTemplates; }
		public final GenStereotypeRefPourGenererParTemplate getGenStereotypeRefPourGenererParTemplate() { return genStereotypeRefPourGenererParTemplate; }
		public final GenGenererParStereotypes getGenGenererParStereotypes() { return genGenererParStereotypes; }
		public final GenGenererParStereotype getGenGenererParStereotype() { return genGenererParStereotype; }
		public final GenStereotypeRefPourGenererParStereotypes getGenStereotypeRefPourGenererParStereotypes() { return genStereotypeRefPourGenererParStereotypes; }
		public final GenStereotypeRefPourGenererParStereotype getGenStereotypeRefPourGenererParStereotype() { return genStereotypeRefPourGenererParStereotype; }
		public final GenTemplateGroupeRefPourGenererParStereotypes getGenTemplateGroupeRefPourGenererParStereotypes() { return genTemplateGroupeRefPourGenererParStereotypes; }
		public final GenTemplateGroupeRefPourGenererParStereotype getGenTemplateGroupeRefPourGenererParStereotype() { return genTemplateGroupeRefPourGenererParStereotype; }
		
		public final void setGen(Gen gen) {
			this.definePosGen();
			this.gen = gen;
		}
		public final void setGenTemplates(GenTemplates genTemplates) {
			this.definePosGenTemplates();
			this.genTemplates = genTemplates;
		}
		public final void setGenTemplate(GenTemplate genTemplate) {
			this.definePosGenTemplate();
			this.genTemplate = genTemplate;
		}
		public final void setGenTemplateGroupes(GenTemplateGroupes genTemplateGroupes) {
			this.definePosGenTemplateGroupes();
			this.genTemplateGroupes = genTemplateGroupes;
		}
		public final void setGenTemplateGroupe(GenTemplateGroupe genTemplateGroupe) {
			this.definePosGenTemplateGroupe();
			this.genTemplateGroupe = genTemplateGroupe;
		}
		public final void setGenTemplateRef(GenTemplateRef genTemplateRef) {
			this.definePosGenTemplateRef();
			this.genTemplateRef = genTemplateRef;
		}
		public final void setGenStereotypes(GenStereotypes genStereotypes) {
			this.definePosGenStereotypes();
			this.genStereotypes = genStereotypes;
		}
		public final void setGenStereotype(GenStereotype genStereotype) {
			this.definePosGenStereotype();
			this.genStereotype = genStereotype;
		}
		public final void setGenClasses(GenClasses genClasses) {
			this.definePosGenClasses();
			this.genClasses = genClasses;
		}
		public final void setGenClasse(GenClasse genClasse) {
			this.definePosGenClasse();
			this.genClasse = genClasse;
		}
		public final void setGenProprieteClasses(GenProprieteClasses genProprieteClasses) {
			this.definePosGenProprieteClasses();
			this.genProprieteClasses = genProprieteClasses;
		}
		public final void setGenProprieteClasse(GenProprieteClasse genProprieteClasse) {
			this.definePosGenProprieteClasse();
			this.genProprieteClasse = genProprieteClasse;
		}
		public final void setGenAttributs(GenAttributs genAttributs) {
			this.definePosGenAttributs();
			this.genAttributs = genAttributs;
		}
		public final void setGenAttribut(GenAttribut genAttribut) {
			this.definePosGenAttribut();
			this.genAttribut = genAttribut;
		}
		public final void setGenProprieteAttributs(GenProprieteAttributs genProprieteAttributs) {
			this.definePosGenProprieteAttributs();
			this.genProprieteAttributs = genProprieteAttributs;
		}
		public final void setGenProprieteAttribut(GenProprieteAttribut genProprieteAttribut) {
			this.definePosGenProprieteAttribut();
			this.genProprieteAttribut = genProprieteAttribut;
		}
		public final void setGenStereotypeAttributs(GenStereotypeAttributs genStereotypeAttributs) {
			this.definePosGenStereotypeAttributs();
			this.genStereotypeAttributs = genStereotypeAttributs;
		}
		public final void setGenStereotypeAttribut(GenStereotypeAttribut genStereotypeAttribut) {
			this.definePosGenStereotypeAttribut();
			this.genStereotypeAttribut = genStereotypeAttribut;
		}
		public final void setGenMethodes(GenMethodes genMethodes) {
			this.definePosGenMethodes();
			this.genMethodes = genMethodes;
		}
		public final void setGenMethode(GenMethode genMethode) {
			this.definePosGenMethode();
			this.genMethode = genMethode;
		}
		public final void setGenProprieteMethodes(GenProprieteMethodes genProprieteMethodes) {
			this.definePosGenProprieteMethodes();
			this.genProprieteMethodes = genProprieteMethodes;
		}
		public final void setGenProprieteMethode(GenProprieteMethode genProprieteMethode) {
			this.definePosGenProprieteMethode();
			this.genProprieteMethode = genProprieteMethode;
		}
		public final void setGenParametres(GenParametres genParametres) {
			this.definePosGenParametres();
			this.genParametres = genParametres;
		}
		public final void setGenParametre(GenParametre genParametre) {
			this.definePosGenParametre();
			this.genParametre = genParametre;
		}
		public final void setGenStereotypeMethodes(GenStereotypeMethodes genStereotypeMethodes) {
			this.definePosGenStereotypeMethodes();
			this.genStereotypeMethodes = genStereotypeMethodes;
		}
		public final void setGenStereotypeMethode(GenStereotypeMethode genStereotypeMethode) {
			this.definePosGenStereotypeMethode();
			this.genStereotypeMethode = genStereotypeMethode;
		}
		public final void setGenStereotypeClasses(GenStereotypeClasses genStereotypeClasses) {
			this.definePosGenStereotypeClasses();
			this.genStereotypeClasses = genStereotypeClasses;
		}
		public final void setGenStereotypeClasse(GenStereotypeClasse genStereotypeClasse) {
			this.definePosGenStereotypeClasse();
			this.genStereotypeClasse = genStereotypeClasse;
		}
		public final void setGenAssociations(GenAssociations genAssociations) {
			this.definePosGenAssociations();
			this.genAssociations = genAssociations;
		}
		public final void setGenAssociation(GenAssociation genAssociation) {
			this.definePosGenAssociation();
			this.genAssociation = genAssociation;
		}
		public final void setGenAssociationAttributs(GenAssociationAttributs genAssociationAttributs) {
			this.definePosGenAssociationAttributs();
			this.genAssociationAttributs = genAssociationAttributs;
		}
		public final void setGenAssociationAttribut(GenAssociationAttribut genAssociationAttribut) {
			this.definePosGenAssociationAttribut();
			this.genAssociationAttribut = genAssociationAttribut;
		}
		public final void setGenClasseDeAssociation(GenClasseDeAssociation genClasseDeAssociation) {
			this.definePosGenClasseDeAssociation();
			this.genClasseDeAssociation = genClasseDeAssociation;
		}
		public final void setGenClasseParents(GenClasseParents genClasseParents) {
			this.definePosGenClasseParents();
			this.genClasseParents = genClasseParents;
		}
		public final void setGenClasseParent(GenClasseParent genClasseParent) {
			this.definePosGenClasseParent();
			this.genClasseParent = genClasseParent;
		}
		public final void setGenGenererGroupe(GenGenererGroupe genGenererGroupe) {
			this.definePosGenGenererGroupe();
			this.genGenererGroupe = genGenererGroupe;
		}
		public final void setGenGenererParClasses(GenGenererParClasses genGenererParClasses) {
			this.definePosGenGenererParClasses();
			this.genGenererParClasses = genGenererParClasses;
		}
		public final void setGenGenererParClasse(GenGenererParClasse genGenererParClasse) {
			this.definePosGenGenererParClasse();
			this.genGenererParClasse = genGenererParClasse;
		}
		public final void setGenClasseRefPourGenererParClasses(GenClasseRefPourGenererParClasses genClasseRefPourGenererParClasses) {
			this.definePosGenClasseRefPourGenererParClasses();
			this.genClasseRefPourGenererParClasses = genClasseRefPourGenererParClasses;
		}
		public final void setGenClasseRefPourGenererParClasse(GenClasseRefPourGenererParClasse genClasseRefPourGenererParClasse) {
			this.definePosGenClasseRefPourGenererParClasse();
			this.genClasseRefPourGenererParClasse = genClasseRefPourGenererParClasse;
		}
		public final void setGenTemplateGroupeRefPourGenererParClasses(GenTemplateGroupeRefPourGenererParClasses genTemplateGroupeRefPourGenererParClasses) {
			this.definePosGenTemplateGroupeRefPourGenererParClasses();
			this.genTemplateGroupeRefPourGenererParClasses = genTemplateGroupeRefPourGenererParClasses;
		}
		public final void setGenTemplateGroupeRefPourGenererParClasse(GenTemplateGroupeRefPourGenererParClasse genTemplateGroupeRefPourGenererParClasse) {
			this.definePosGenTemplateGroupeRefPourGenererParClasse();
			this.genTemplateGroupeRefPourGenererParClasse = genTemplateGroupeRefPourGenererParClasse;
		}
		public final void setGenGenererParTemplates(GenGenererParTemplates genGenererParTemplates) {
			this.definePosGenGenererParTemplates();
			this.genGenererParTemplates = genGenererParTemplates;
		}
		public final void setGenGenererParTemplate(GenGenererParTemplate genGenererParTemplate) {
			this.definePosGenGenererParTemplate();
			this.genGenererParTemplate = genGenererParTemplate;
		}
		public final void setGenTemplateGroupeRefPourGenererParTemplates(GenTemplateGroupeRefPourGenererParTemplates genTemplateGroupeRefPourGenererParTemplates) {
			this.definePosGenTemplateGroupeRefPourGenererParTemplates();
			this.genTemplateGroupeRefPourGenererParTemplates = genTemplateGroupeRefPourGenererParTemplates;
		}
		public final void setGenTemplateGroupeRefPourGenererParTemplate(GenTemplateGroupeRefPourGenererParTemplate genTemplateGroupeRefPourGenererParTemplate) {
			this.definePosGenTemplateGroupeRefPourGenererParTemplate();
			this.genTemplateGroupeRefPourGenererParTemplate = genTemplateGroupeRefPourGenererParTemplate;
		}
		public final void setGenStereotypeRefPourGenererParTemplates(GenStereotypeRefPourGenererParTemplates genStereotypeRefPourGenererParTemplates) {
			this.definePosGenStereotypeRefPourGenererParTemplates();
			this.genStereotypeRefPourGenererParTemplates = genStereotypeRefPourGenererParTemplates;
		}
		public final void setGenStereotypeRefPourGenererParTemplate(GenStereotypeRefPourGenererParTemplate genStereotypeRefPourGenererParTemplate) {
			this.definePosGenStereotypeRefPourGenererParTemplate();
			this.genStereotypeRefPourGenererParTemplate = genStereotypeRefPourGenererParTemplate;
		}
		public final void setGenGenererParStereotypes(GenGenererParStereotypes genGenererParStereotypes) {
			this.definePosGenGenererParStereotypes();
			this.genGenererParStereotypes = genGenererParStereotypes;
		}
		public final void setGenGenererParStereotype(GenGenererParStereotype genGenererParStereotype) {
			this.definePosGenGenererParStereotype();
			this.genGenererParStereotype = genGenererParStereotype;
		}
		public final void setGenStereotypeRefPourGenererParStereotypes(GenStereotypeRefPourGenererParStereotypes genStereotypeRefPourGenererParStereotypes) {
			this.definePosGenStereotypeRefPourGenererParStereotypes();
			this.genStereotypeRefPourGenererParStereotypes = genStereotypeRefPourGenererParStereotypes;
		}
		public final void setGenStereotypeRefPourGenererParStereotype(GenStereotypeRefPourGenererParStereotype genStereotypeRefPourGenererParStereotype) {
			this.definePosGenStereotypeRefPourGenererParStereotype();
			this.genStereotypeRefPourGenererParStereotype = genStereotypeRefPourGenererParStereotype;
		}
		public final void setGenTemplateGroupeRefPourGenererParStereotypes(GenTemplateGroupeRefPourGenererParStereotypes genTemplateGroupeRefPourGenererParStereotypes) {
			this.definePosGenTemplateGroupeRefPourGenererParStereotypes();
			this.genTemplateGroupeRefPourGenererParStereotypes = genTemplateGroupeRefPourGenererParStereotypes;
		}
		public final void setGenTemplateGroupeRefPourGenererParStereotype(GenTemplateGroupeRefPourGenererParStereotype genTemplateGroupeRefPourGenererParStereotype) {
			this.definePosGenTemplateGroupeRefPourGenererParStereotype();
			this.genTemplateGroupeRefPourGenererParStereotype = genTemplateGroupeRefPourGenererParStereotype;
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
        if (GenXmlNoeud.N_GenTemplates.equalsIgnoreCase(localName)){
            startElement_GenTemplates(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenTemplate.equalsIgnoreCase(localName)){
            startElement_GenTemplate(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenTemplateGroupes.equalsIgnoreCase(localName)){
            startElement_GenTemplateGroupes(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenTemplateGroupe.equalsIgnoreCase(localName)){
            startElement_GenTemplateGroupe(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenTemplateRef.equalsIgnoreCase(localName)){
            startElement_GenTemplateRef(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenStereotypes.equalsIgnoreCase(localName)){
            startElement_GenStereotypes(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenStereotype.equalsIgnoreCase(localName)){
            startElement_GenStereotype(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenClasses.equalsIgnoreCase(localName)){
            startElement_GenClasses(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenClasse.equalsIgnoreCase(localName)){
            startElement_GenClasse(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenProprieteClasses.equalsIgnoreCase(localName)){
            startElement_GenProprieteClasses(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenProprieteClasse.equalsIgnoreCase(localName)){
            startElement_GenProprieteClasse(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenAttributs.equalsIgnoreCase(localName)){
            startElement_GenAttributs(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenAttribut.equalsIgnoreCase(localName)){
            startElement_GenAttribut(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenProprieteAttributs.equalsIgnoreCase(localName)){
            startElement_GenProprieteAttributs(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenProprieteAttribut.equalsIgnoreCase(localName)){
            startElement_GenProprieteAttribut(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenStereotypeAttributs.equalsIgnoreCase(localName)){
            startElement_GenStereotypeAttributs(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenStereotypeAttribut.equalsIgnoreCase(localName)){
            startElement_GenStereotypeAttribut(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenMethodes.equalsIgnoreCase(localName)){
            startElement_GenMethodes(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenMethode.equalsIgnoreCase(localName)){
            startElement_GenMethode(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenProprieteMethodes.equalsIgnoreCase(localName)){
            startElement_GenProprieteMethodes(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenProprieteMethode.equalsIgnoreCase(localName)){
            startElement_GenProprieteMethode(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenParametres.equalsIgnoreCase(localName)){
            startElement_GenParametres(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenParametre.equalsIgnoreCase(localName)){
            startElement_GenParametre(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenStereotypeMethodes.equalsIgnoreCase(localName)){
            startElement_GenStereotypeMethodes(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenStereotypeMethode.equalsIgnoreCase(localName)){
            startElement_GenStereotypeMethode(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenStereotypeClasses.equalsIgnoreCase(localName)){
            startElement_GenStereotypeClasses(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenStereotypeClasse.equalsIgnoreCase(localName)){
            startElement_GenStereotypeClasse(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenAssociations.equalsIgnoreCase(localName)){
            startElement_GenAssociations(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenAssociation.equalsIgnoreCase(localName)){
            startElement_GenAssociation(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenAssociationAttributs.equalsIgnoreCase(localName)){
            startElement_GenAssociationAttributs(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenAssociationAttribut.equalsIgnoreCase(localName)){
            startElement_GenAssociationAttribut(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenClasseDeAssociation.equalsIgnoreCase(localName)){
            startElement_GenClasseDeAssociation(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenClasseParents.equalsIgnoreCase(localName)){
            startElement_GenClasseParents(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenClasseParent.equalsIgnoreCase(localName)){
            startElement_GenClasseParent(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenGenererGroupe.equalsIgnoreCase(localName)){
            startElement_GenGenererGroupe(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenGenererParClasses.equalsIgnoreCase(localName)){
            startElement_GenGenererParClasses(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenGenererParClasse.equalsIgnoreCase(localName)){
            startElement_GenGenererParClasse(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenClasseRefPourGenererParClasses.equalsIgnoreCase(localName)){
            startElement_GenClasseRefPourGenererParClasses(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenClasseRefPourGenererParClasse.equalsIgnoreCase(localName)){
            startElement_GenClasseRefPourGenererParClasse(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenTemplateGroupeRefPourGenererParClasses.equalsIgnoreCase(localName)){
            startElement_GenTemplateGroupeRefPourGenererParClasses(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenTemplateGroupeRefPourGenererParClasse.equalsIgnoreCase(localName)){
            startElement_GenTemplateGroupeRefPourGenererParClasse(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenGenererParTemplates.equalsIgnoreCase(localName)){
            startElement_GenGenererParTemplates(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenGenererParTemplate.equalsIgnoreCase(localName)){
            startElement_GenGenererParTemplate(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenTemplateGroupeRefPourGenererParTemplates.equalsIgnoreCase(localName)){
            startElement_GenTemplateGroupeRefPourGenererParTemplates(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenTemplateGroupeRefPourGenererParTemplate.equalsIgnoreCase(localName)){
            startElement_GenTemplateGroupeRefPourGenererParTemplate(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenStereotypeRefPourGenererParTemplates.equalsIgnoreCase(localName)){
            startElement_GenStereotypeRefPourGenererParTemplates(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenStereotypeRefPourGenererParTemplate.equalsIgnoreCase(localName)){
            startElement_GenStereotypeRefPourGenererParTemplate(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenGenererParStereotypes.equalsIgnoreCase(localName)){
            startElement_GenGenererParStereotypes(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenGenererParStereotype.equalsIgnoreCase(localName)){
            startElement_GenGenererParStereotype(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenStereotypeRefPourGenererParStereotypes.equalsIgnoreCase(localName)){
            startElement_GenStereotypeRefPourGenererParStereotypes(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenStereotypeRefPourGenererParStereotype.equalsIgnoreCase(localName)){
            startElement_GenStereotypeRefPourGenererParStereotype(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenTemplateGroupeRefPourGenererParStereotypes.equalsIgnoreCase(localName)){
            startElement_GenTemplateGroupeRefPourGenererParStereotypes(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenTemplateGroupeRefPourGenererParStereotype.equalsIgnoreCase(localName)){
            startElement_GenTemplateGroupeRefPourGenererParStereotype(namespaceURI, localName, qName, atts);
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
    
    public void startElement_GenTemplates(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenTemplates genTemplates = new GenTemplatesBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_GenTemplates_A_InDir.equalsIgnoreCase(attName)) {
            	genTemplates.setInDirAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenTemplates_A_OutDir.equalsIgnoreCase(attName)) {
            	genTemplates.setOutDirAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenTemplates_A_PackageJavaBase.equalsIgnoreCase(attName)) {
            	genTemplates.setPackageJavaBaseAsString(atts.getValue(i));
            }
        }
        enCours.setGenTemplates( genTemplates );
    }
    
    public void startElement_GenTemplate(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenTemplate genTemplate = new GenTemplateBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_GenTemplate_A_Nom.equalsIgnoreCase(attName)) {
            	genTemplate.setNomAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenTemplate_A_File.equalsIgnoreCase(attName)) {
            	genTemplate.setFileAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenTemplate_A_OutDir.equalsIgnoreCase(attName)) {
            	genTemplate.setOutDirAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenTemplate_A_OutFile.equalsIgnoreCase(attName)) {
            	genTemplate.setOutFileAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenTemplate_A_PackageJava.equalsIgnoreCase(attName)) {
            	genTemplate.setPackageJavaAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenTemplate_A_NomElementGenere.equalsIgnoreCase(attName)) {
            	genTemplate.setNomElementGenereAsString(atts.getValue(i));
            }
        }
        enCours.setGenTemplate( genTemplate );
    }
    
    public void startElement_GenTemplateGroupes(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenTemplateGroupes genTemplateGroupes = new GenTemplateGroupesBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenTemplateGroupes( genTemplateGroupes );
    }
    
    public void startElement_GenTemplateGroupe(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenTemplateGroupe genTemplateGroupe = new GenTemplateGroupeBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_GenTemplateGroupe_A_Nom.equalsIgnoreCase(attName)) {
            	genTemplateGroupe.setNomAsString(atts.getValue(i));
            }
        }
        enCours.setGenTemplateGroupe( genTemplateGroupe );
    }
    
    public void startElement_GenTemplateRef(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenTemplateRef genTemplateRef = new GenTemplateRefBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_GenTemplateRef_A_Nom.equalsIgnoreCase(attName)) {
            	genTemplateRef.setNomAsString(atts.getValue(i));
            }
        }
        enCours.setGenTemplateRef( genTemplateRef );
    }
    
    public void startElement_GenStereotypes(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenStereotypes genStereotypes = new GenStereotypesBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenStereotypes( genStereotypes );
    }
    
    public void startElement_GenStereotype(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenStereotype genStereotype = new GenStereotypeBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_GenStereotype_A_Nom.equalsIgnoreCase(attName)) {
            	genStereotype.setNomAsString(atts.getValue(i));
            }
        }
        enCours.setGenStereotype( genStereotype );
    }
    
    public void startElement_GenClasses(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenClasses genClasses = new GenClassesBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_GenClasses_A_PackageBase.equalsIgnoreCase(attName)) {
            	genClasses.setPackageBaseAsString(atts.getValue(i));
            }
        }
        enCours.setGenClasses( genClasses );
    }
    
    public void startElement_GenClasse(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenClasse genClasse = new GenClasseBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_GenClasse_A_GenId.equalsIgnoreCase(attName)) {
            	genClasse.setGenIdAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenClasse_A_NomJava.equalsIgnoreCase(attName)) {
            	genClasse.setNomJavaAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenClasse_A_PackageJava.equalsIgnoreCase(attName)) {
            	genClasse.setPackageJavaAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenClasse_A_NomTable.equalsIgnoreCase(attName)) {
            	genClasse.setNomTableAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenClasse_A_NomVue.equalsIgnoreCase(attName)) {
            	genClasse.setNomVueAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenClasse_A_Description.equalsIgnoreCase(attName)) {
            	genClasse.setDescriptionAsString(atts.getValue(i));
            }
        }
        enCours.setGenClasse( genClasse );
    }
    
    public void startElement_GenProprieteClasses(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenProprieteClasses genProprieteClasses = new GenProprieteClassesBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenProprieteClasses( genProprieteClasses );
    }
    
    public void startElement_GenProprieteClasse(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenProprieteClasse genProprieteClasse = new GenProprieteClasseBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_GenProprieteClasse_A_Nom.equalsIgnoreCase(attName)) {
            	genProprieteClasse.setNomAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenProprieteClasse_A_Valeur.equalsIgnoreCase(attName)) {
            	genProprieteClasse.setValeurAsString(atts.getValue(i));
            }
        }
        enCours.setGenProprieteClasse( genProprieteClasse );
    }
    
    public void startElement_GenAttributs(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenAttributs genAttributs = new GenAttributsBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenAttributs( genAttributs );
    }
    
    public void startElement_GenAttribut(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenAttribut genAttribut = new GenAttributBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_GenAttribut_A_GenId.equalsIgnoreCase(attName)) {
            	genAttribut.setGenIdAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenAttribut_A_NomJava.equalsIgnoreCase(attName)) {
            	genAttribut.setNomJavaAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenAttribut_A_Type.equalsIgnoreCase(attName)) {
            	genAttribut.setTypeAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenAttribut_A_NbMin.equalsIgnoreCase(attName)) {
            	genAttribut.setNbMinAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenAttribut_A_NbMax.equalsIgnoreCase(attName)) {
            	genAttribut.setNbMaxAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenAttribut_A_NomSQL.equalsIgnoreCase(attName)) {
            	genAttribut.setNomSQLAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenAttribut_A_TypeSQL.equalsIgnoreCase(attName)) {
            	genAttribut.setTypeSQLAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenAttribut_A_EstDansTable.equalsIgnoreCase(attName)) {
            	genAttribut.setEstDansTableAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenAttribut_A_Size.equalsIgnoreCase(attName)) {
            	genAttribut.setSizeAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenAttribut_A_EstClePrimaire.equalsIgnoreCase(attName)) {
            	genAttribut.setEstClePrimaireAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenAttribut_A_EstCleIncrementee.equalsIgnoreCase(attName)) {
            	genAttribut.setEstCleIncrementeeAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenAttribut_A_Association.equalsIgnoreCase(attName)) {
            	genAttribut.setAssociationAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenAttribut_A_Description.equalsIgnoreCase(attName)) {
            	genAttribut.setDescriptionAsString(atts.getValue(i));
            }
        }
        enCours.setGenAttribut( genAttribut );
    }
    
    public void startElement_GenProprieteAttributs(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenProprieteAttributs genProprieteAttributs = new GenProprieteAttributsBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenProprieteAttributs( genProprieteAttributs );
    }
    
    public void startElement_GenProprieteAttribut(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenProprieteAttribut genProprieteAttribut = new GenProprieteAttributBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_GenProprieteAttribut_A_Nom.equalsIgnoreCase(attName)) {
            	genProprieteAttribut.setNomAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenProprieteAttribut_A_Valeur.equalsIgnoreCase(attName)) {
            	genProprieteAttribut.setValeurAsString(atts.getValue(i));
            }
        }
        enCours.setGenProprieteAttribut( genProprieteAttribut );
    }
    
    public void startElement_GenStereotypeAttributs(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenStereotypeAttributs genStereotypeAttributs = new GenStereotypeAttributsBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenStereotypeAttributs( genStereotypeAttributs );
    }
    
    public void startElement_GenStereotypeAttribut(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenStereotypeAttribut genStereotypeAttribut = new GenStereotypeAttributBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_GenStereotypeAttribut_A_Nom.equalsIgnoreCase(attName)) {
            	genStereotypeAttribut.setNomAsString(atts.getValue(i));
            }
        }
        enCours.setGenStereotypeAttribut( genStereotypeAttribut );
    }
    
    public void startElement_GenMethodes(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenMethodes genMethodes = new GenMethodesBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenMethodes( genMethodes );
    }
    
    public void startElement_GenMethode(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenMethode genMethode = new GenMethodeBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_GenMethode_A_GenId.equalsIgnoreCase(attName)) {
            	genMethode.setGenIdAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenMethode_A_NomJava.equalsIgnoreCase(attName)) {
            	genMethode.setNomJavaAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenMethode_A_RetourType.equalsIgnoreCase(attName)) {
            	genMethode.setRetourTypeAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenMethode_A_Description.equalsIgnoreCase(attName)) {
            	genMethode.setDescriptionAsString(atts.getValue(i));
            }
        }
        enCours.setGenMethode( genMethode );
    }
    
    public void startElement_GenProprieteMethodes(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenProprieteMethodes genProprieteMethodes = new GenProprieteMethodesBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenProprieteMethodes( genProprieteMethodes );
    }
    
    public void startElement_GenProprieteMethode(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenProprieteMethode genProprieteMethode = new GenProprieteMethodeBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_GenProprieteMethode_A_Nom.equalsIgnoreCase(attName)) {
            	genProprieteMethode.setNomAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenProprieteMethode_A_Valeur.equalsIgnoreCase(attName)) {
            	genProprieteMethode.setValeurAsString(atts.getValue(i));
            }
        }
        enCours.setGenProprieteMethode( genProprieteMethode );
    }
    
    public void startElement_GenParametres(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenParametres genParametres = new GenParametresBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenParametres( genParametres );
    }
    
    public void startElement_GenParametre(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenParametre genParametre = new GenParametreBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_GenParametre_A_GenId.equalsIgnoreCase(attName)) {
            	genParametre.setGenIdAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenParametre_A_NomJava.equalsIgnoreCase(attName)) {
            	genParametre.setNomJavaAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenParametre_A_Type.equalsIgnoreCase(attName)) {
            	genParametre.setTypeAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenParametre_A_Description.equalsIgnoreCase(attName)) {
            	genParametre.setDescriptionAsString(atts.getValue(i));
            }
        }
        enCours.setGenParametre( genParametre );
    }
    
    public void startElement_GenStereotypeMethodes(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenStereotypeMethodes genStereotypeMethodes = new GenStereotypeMethodesBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenStereotypeMethodes( genStereotypeMethodes );
    }
    
    public void startElement_GenStereotypeMethode(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenStereotypeMethode genStereotypeMethode = new GenStereotypeMethodeBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_GenStereotypeMethode_A_Nom.equalsIgnoreCase(attName)) {
            	genStereotypeMethode.setNomAsString(atts.getValue(i));
            }
        }
        enCours.setGenStereotypeMethode( genStereotypeMethode );
    }
    
    public void startElement_GenStereotypeClasses(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenStereotypeClasses genStereotypeClasses = new GenStereotypeClassesBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenStereotypeClasses( genStereotypeClasses );
    }
    
    public void startElement_GenStereotypeClasse(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenStereotypeClasse genStereotypeClasse = new GenStereotypeClasseBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_GenStereotypeClasse_A_Nom.equalsIgnoreCase(attName)) {
            	genStereotypeClasse.setNomAsString(atts.getValue(i));
            }
        }
        enCours.setGenStereotypeClasse( genStereotypeClasse );
    }
    
    public void startElement_GenAssociations(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenAssociations genAssociations = new GenAssociationsBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenAssociations( genAssociations );
    }
    
    public void startElement_GenAssociation(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenAssociation genAssociation = new GenAssociationBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_GenAssociation_A_GenId.equalsIgnoreCase(attName)) {
            	genAssociation.setGenIdAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenAssociation_A_NomJava.equalsIgnoreCase(attName)) {
            	genAssociation.setNomJavaAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenAssociation_A_ClasseGenId.equalsIgnoreCase(attName)) {
            	genAssociation.setClasseGenIdAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenAssociation_A_NbMin.equalsIgnoreCase(attName)) {
            	genAssociation.setNbMinAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenAssociation_A_NbMax.equalsIgnoreCase(attName)) {
            	genAssociation.setNbMaxAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenAssociation_A_Description.equalsIgnoreCase(attName)) {
            	genAssociation.setDescriptionAsString(atts.getValue(i));
            }
        }
        enCours.setGenAssociation( genAssociation );
    }
    
    public void startElement_GenAssociationAttributs(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenAssociationAttributs genAssociationAttributs = new GenAssociationAttributsBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenAssociationAttributs( genAssociationAttributs );
    }
    
    public void startElement_GenAssociationAttribut(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenAssociationAttribut genAssociationAttribut = new GenAssociationAttributBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_GenAssociationAttribut_A_GenId.equalsIgnoreCase(attName)) {
            	genAssociationAttribut.setGenIdAsString(atts.getValue(i));
            }
        }
        enCours.setGenAssociationAttribut( genAssociationAttribut );
    }
    
    public void startElement_GenClasseDeAssociation(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenClasseDeAssociation genClasseDeAssociation = new GenClasseDeAssociationBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_GenClasseDeAssociation_A__type.equalsIgnoreCase(attName)) {
            	genClasseDeAssociation.set_typeAsString(atts.getValue(i));
            }
        }
        enCours.setGenClasseDeAssociation( genClasseDeAssociation );
    }
    
    public void startElement_GenClasseParents(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenClasseParents genClasseParents = new GenClasseParentsBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenClasseParents( genClasseParents );
    }
    
    public void startElement_GenClasseParent(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenClasseParent genClasseParent = new GenClasseParentBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_GenClasseParent_A_ClasseGenId.equalsIgnoreCase(attName)) {
            	genClasseParent.setClasseGenIdAsString(atts.getValue(i));
            }
        }
        enCours.setGenClasseParent( genClasseParent );
    }
    
    public void startElement_GenGenererGroupe(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenGenererGroupe genGenererGroupe = new GenGenererGroupeBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenGenererGroupe( genGenererGroupe );
    }
    
    public void startElement_GenGenererParClasses(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenGenererParClasses genGenererParClasses = new GenGenererParClassesBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenGenererParClasses( genGenererParClasses );
    }
    
    public void startElement_GenGenererParClasse(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenGenererParClasse genGenererParClasse = new GenGenererParClasseBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenGenererParClasse( genGenererParClasse );
    }
    
    public void startElement_GenClasseRefPourGenererParClasses(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenClasseRefPourGenererParClasses genClasseRefPourGenererParClasses = new GenClasseRefPourGenererParClassesBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenClasseRefPourGenererParClasses( genClasseRefPourGenererParClasses );
    }
    
    public void startElement_GenClasseRefPourGenererParClasse(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenClasseRefPourGenererParClasse genClasseRefPourGenererParClasse = new GenClasseRefPourGenererParClasseBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_GenClasseRefPourGenererParClasse_A_ClasseGenId.equalsIgnoreCase(attName)) {
            	genClasseRefPourGenererParClasse.setClasseGenIdAsString(atts.getValue(i));
            }
        }
        enCours.setGenClasseRefPourGenererParClasse( genClasseRefPourGenererParClasse );
    }
    
    public void startElement_GenTemplateGroupeRefPourGenererParClasses(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenTemplateGroupeRefPourGenererParClasses genTemplateGroupeRefPourGenererParClasses = new GenTemplateGroupeRefPourGenererParClassesBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenTemplateGroupeRefPourGenererParClasses( genTemplateGroupeRefPourGenererParClasses );
    }
    
    public void startElement_GenTemplateGroupeRefPourGenererParClasse(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenTemplateGroupeRefPourGenererParClasse genTemplateGroupeRefPourGenererParClasse = new GenTemplateGroupeRefPourGenererParClasseBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_GenTemplateGroupeRefPourGenererParClasse_A_TemplateGroupeNom.equalsIgnoreCase(attName)) {
            	genTemplateGroupeRefPourGenererParClasse.setTemplateGroupeNomAsString(atts.getValue(i));
            }
        }
        enCours.setGenTemplateGroupeRefPourGenererParClasse( genTemplateGroupeRefPourGenererParClasse );
    }
    
    public void startElement_GenGenererParTemplates(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenGenererParTemplates genGenererParTemplates = new GenGenererParTemplatesBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenGenererParTemplates( genGenererParTemplates );
    }
    
    public void startElement_GenGenererParTemplate(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenGenererParTemplate genGenererParTemplate = new GenGenererParTemplateBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenGenererParTemplate( genGenererParTemplate );
    }
    
    public void startElement_GenTemplateGroupeRefPourGenererParTemplates(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenTemplateGroupeRefPourGenererParTemplates genTemplateGroupeRefPourGenererParTemplates = new GenTemplateGroupeRefPourGenererParTemplatesBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenTemplateGroupeRefPourGenererParTemplates( genTemplateGroupeRefPourGenererParTemplates );
    }
    
    public void startElement_GenTemplateGroupeRefPourGenererParTemplate(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenTemplateGroupeRefPourGenererParTemplate genTemplateGroupeRefPourGenererParTemplate = new GenTemplateGroupeRefPourGenererParTemplateBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_GenTemplateGroupeRefPourGenererParTemplate_A_TemplateGroupeNom.equalsIgnoreCase(attName)) {
            	genTemplateGroupeRefPourGenererParTemplate.setTemplateGroupeNomAsString(atts.getValue(i));
            }
        }
        enCours.setGenTemplateGroupeRefPourGenererParTemplate( genTemplateGroupeRefPourGenererParTemplate );
    }
    
    public void startElement_GenStereotypeRefPourGenererParTemplates(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenStereotypeRefPourGenererParTemplates genStereotypeRefPourGenererParTemplates = new GenStereotypeRefPourGenererParTemplatesBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenStereotypeRefPourGenererParTemplates( genStereotypeRefPourGenererParTemplates );
    }
    
    public void startElement_GenStereotypeRefPourGenererParTemplate(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenStereotypeRefPourGenererParTemplate genStereotypeRefPourGenererParTemplate = new GenStereotypeRefPourGenererParTemplateBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_GenStereotypeRefPourGenererParTemplate_A_StereotypeNom.equalsIgnoreCase(attName)) {
            	genStereotypeRefPourGenererParTemplate.setStereotypeNomAsString(atts.getValue(i));
            }
        }
        enCours.setGenStereotypeRefPourGenererParTemplate( genStereotypeRefPourGenererParTemplate );
    }
    
    public void startElement_GenGenererParStereotypes(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenGenererParStereotypes genGenererParStereotypes = new GenGenererParStereotypesBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenGenererParStereotypes( genGenererParStereotypes );
    }
    
    public void startElement_GenGenererParStereotype(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenGenererParStereotype genGenererParStereotype = new GenGenererParStereotypeBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenGenererParStereotype( genGenererParStereotype );
    }
    
    public void startElement_GenStereotypeRefPourGenererParStereotypes(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenStereotypeRefPourGenererParStereotypes genStereotypeRefPourGenererParStereotypes = new GenStereotypeRefPourGenererParStereotypesBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenStereotypeRefPourGenererParStereotypes( genStereotypeRefPourGenererParStereotypes );
    }
    
    public void startElement_GenStereotypeRefPourGenererParStereotype(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenStereotypeRefPourGenererParStereotype genStereotypeRefPourGenererParStereotype = new GenStereotypeRefPourGenererParStereotypeBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_GenStereotypeRefPourGenererParStereotype_A_StereotypeNom.equalsIgnoreCase(attName)) {
            	genStereotypeRefPourGenererParStereotype.setStereotypeNomAsString(atts.getValue(i));
            }
        }
        enCours.setGenStereotypeRefPourGenererParStereotype( genStereotypeRefPourGenererParStereotype );
    }
    
    public void startElement_GenTemplateGroupeRefPourGenererParStereotypes(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenTemplateGroupeRefPourGenererParStereotypes genTemplateGroupeRefPourGenererParStereotypes = new GenTemplateGroupeRefPourGenererParStereotypesBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenTemplateGroupeRefPourGenererParStereotypes( genTemplateGroupeRefPourGenererParStereotypes );
    }
    
    public void startElement_GenTemplateGroupeRefPourGenererParStereotype(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenTemplateGroupeRefPourGenererParStereotype genTemplateGroupeRefPourGenererParStereotype = new GenTemplateGroupeRefPourGenererParStereotypeBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_GenTemplateGroupeRefPourGenererParStereotype_A_TemplateGroupeNom.equalsIgnoreCase(attName)) {
            	genTemplateGroupeRefPourGenererParStereotype.setTemplateGroupeNomAsString(atts.getValue(i));
            }
        }
        enCours.setGenTemplateGroupeRefPourGenererParStereotype( genTemplateGroupeRefPourGenererParStereotype );
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
        if (GenXmlNoeud.N_Gen.equalsIgnoreCase(localName)){
            endElement_Gen(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenTemplates.equalsIgnoreCase(localName)){
            endElement_GenTemplates(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenTemplate.equalsIgnoreCase(localName)){
            endElement_GenTemplate(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenTemplateGroupes.equalsIgnoreCase(localName)){
            endElement_GenTemplateGroupes(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenTemplateGroupe.equalsIgnoreCase(localName)){
            endElement_GenTemplateGroupe(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenTemplateRef.equalsIgnoreCase(localName)){
            endElement_GenTemplateRef(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenStereotypes.equalsIgnoreCase(localName)){
            endElement_GenStereotypes(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenStereotype.equalsIgnoreCase(localName)){
            endElement_GenStereotype(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenClasses.equalsIgnoreCase(localName)){
            endElement_GenClasses(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenClasse.equalsIgnoreCase(localName)){
            endElement_GenClasse(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenProprieteClasses.equalsIgnoreCase(localName)){
            endElement_GenProprieteClasses(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenProprieteClasse.equalsIgnoreCase(localName)){
            endElement_GenProprieteClasse(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenAttributs.equalsIgnoreCase(localName)){
            endElement_GenAttributs(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenAttribut.equalsIgnoreCase(localName)){
            endElement_GenAttribut(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenProprieteAttributs.equalsIgnoreCase(localName)){
            endElement_GenProprieteAttributs(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenProprieteAttribut.equalsIgnoreCase(localName)){
            endElement_GenProprieteAttribut(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenStereotypeAttributs.equalsIgnoreCase(localName)){
            endElement_GenStereotypeAttributs(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenStereotypeAttribut.equalsIgnoreCase(localName)){
            endElement_GenStereotypeAttribut(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenMethodes.equalsIgnoreCase(localName)){
            endElement_GenMethodes(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenMethode.equalsIgnoreCase(localName)){
            endElement_GenMethode(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenProprieteMethodes.equalsIgnoreCase(localName)){
            endElement_GenProprieteMethodes(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenProprieteMethode.equalsIgnoreCase(localName)){
            endElement_GenProprieteMethode(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenParametres.equalsIgnoreCase(localName)){
            endElement_GenParametres(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenParametre.equalsIgnoreCase(localName)){
            endElement_GenParametre(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenStereotypeMethodes.equalsIgnoreCase(localName)){
            endElement_GenStereotypeMethodes(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenStereotypeMethode.equalsIgnoreCase(localName)){
            endElement_GenStereotypeMethode(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenStereotypeClasses.equalsIgnoreCase(localName)){
            endElement_GenStereotypeClasses(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenStereotypeClasse.equalsIgnoreCase(localName)){
            endElement_GenStereotypeClasse(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenAssociations.equalsIgnoreCase(localName)){
            endElement_GenAssociations(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenAssociation.equalsIgnoreCase(localName)){
            endElement_GenAssociation(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenAssociationAttributs.equalsIgnoreCase(localName)){
            endElement_GenAssociationAttributs(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenAssociationAttribut.equalsIgnoreCase(localName)){
            endElement_GenAssociationAttribut(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenClasseDeAssociation.equalsIgnoreCase(localName)){
            endElement_GenClasseDeAssociation(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenClasseParents.equalsIgnoreCase(localName)){
            endElement_GenClasseParents(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenClasseParent.equalsIgnoreCase(localName)){
            endElement_GenClasseParent(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenGenererGroupe.equalsIgnoreCase(localName)){
            endElement_GenGenererGroupe(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenGenererParClasses.equalsIgnoreCase(localName)){
            endElement_GenGenererParClasses(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenGenererParClasse.equalsIgnoreCase(localName)){
            endElement_GenGenererParClasse(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenClasseRefPourGenererParClasses.equalsIgnoreCase(localName)){
            endElement_GenClasseRefPourGenererParClasses(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenClasseRefPourGenererParClasse.equalsIgnoreCase(localName)){
            endElement_GenClasseRefPourGenererParClasse(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenTemplateGroupeRefPourGenererParClasses.equalsIgnoreCase(localName)){
            endElement_GenTemplateGroupeRefPourGenererParClasses(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenTemplateGroupeRefPourGenererParClasse.equalsIgnoreCase(localName)){
            endElement_GenTemplateGroupeRefPourGenererParClasse(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenGenererParTemplates.equalsIgnoreCase(localName)){
            endElement_GenGenererParTemplates(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenGenererParTemplate.equalsIgnoreCase(localName)){
            endElement_GenGenererParTemplate(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenTemplateGroupeRefPourGenererParTemplates.equalsIgnoreCase(localName)){
            endElement_GenTemplateGroupeRefPourGenererParTemplates(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenTemplateGroupeRefPourGenererParTemplate.equalsIgnoreCase(localName)){
            endElement_GenTemplateGroupeRefPourGenererParTemplate(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenStereotypeRefPourGenererParTemplates.equalsIgnoreCase(localName)){
            endElement_GenStereotypeRefPourGenererParTemplates(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenStereotypeRefPourGenererParTemplate.equalsIgnoreCase(localName)){
            endElement_GenStereotypeRefPourGenererParTemplate(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenGenererParStereotypes.equalsIgnoreCase(localName)){
            endElement_GenGenererParStereotypes(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenGenererParStereotype.equalsIgnoreCase(localName)){
            endElement_GenGenererParStereotype(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenStereotypeRefPourGenererParStereotypes.equalsIgnoreCase(localName)){
            endElement_GenStereotypeRefPourGenererParStereotypes(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenStereotypeRefPourGenererParStereotype.equalsIgnoreCase(localName)){
            endElement_GenStereotypeRefPourGenererParStereotype(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenTemplateGroupeRefPourGenererParStereotypes.equalsIgnoreCase(localName)){
            endElement_GenTemplateGroupeRefPourGenererParStereotypes(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenTemplateGroupeRefPourGenererParStereotype.equalsIgnoreCase(localName)){
            endElement_GenTemplateGroupeRefPourGenererParStereotype(namespaceURI, localName, qName);
        }
    }

    public void endElement_Gen(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.setGen(enCours.getGen());
    }
    
    public void endElement_GenTemplates(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGen().setGenTemplates(enCours.getGenTemplates());
    }
    
    public void endElement_GenTemplate(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGenTemplates() == null) {
    		enCours.setGenTemplates(new GenTemplatesBean());
    	}
    	enCours.getGenTemplates().addGenTemplate(enCours.getGenTemplate());
    }
    
    public void endElement_GenTemplateGroupes(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGen().setGenTemplateGroupes(enCours.getGenTemplateGroupes());
    }
    
    public void endElement_GenTemplateGroupe(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGenTemplateGroupes() == null) {
    		enCours.setGenTemplateGroupes(new GenTemplateGroupesBean());
    	}
    	enCours.getGenTemplateGroupes().addGenTemplateGroupe(enCours.getGenTemplateGroupe());
    }
    
    public void endElement_GenTemplateRef(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGenTemplateGroupe() == null) {
    		enCours.setGenTemplateGroupe(new GenTemplateGroupeBean());
    	}
    	enCours.getGenTemplateGroupe().addGenTemplateRef(enCours.getGenTemplateRef());
    }
    
    public void endElement_GenStereotypes(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGen().setGenStereotypes(enCours.getGenStereotypes());
    }
    
    public void endElement_GenStereotype(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGenStereotypes() == null) {
    		enCours.setGenStereotypes(new GenStereotypesBean());
    	}
    	enCours.getGenStereotypes().addGenStereotype(enCours.getGenStereotype());
    }
    
    public void endElement_GenClasses(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGen().setGenClasses(enCours.getGenClasses());
    }
    
    public void endElement_GenClasse(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGenClasses() == null) {
    		enCours.setGenClasses(new GenClassesBean());
    	}
    	enCours.getGenClasses().addGenClasse(enCours.getGenClasse());
    }
    
    public void endElement_GenProprieteClasses(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenClasse().setGenProprieteClasses(enCours.getGenProprieteClasses());
    }
    
    public void endElement_GenProprieteClasse(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGenProprieteClasses() == null) {
    		enCours.setGenProprieteClasses(new GenProprieteClassesBean());
    	}
    	enCours.getGenProprieteClasses().addGenProprieteClasse(enCours.getGenProprieteClasse());
    }
    
    public void endElement_GenAttributs(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenClasse().setGenAttributs(enCours.getGenAttributs());
    }
    
    public void endElement_GenAttribut(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGenAttributs() == null) {
    		enCours.setGenAttributs(new GenAttributsBean());
    	}
    	enCours.getGenAttributs().addGenAttribut(enCours.getGenAttribut());
    }
    
    public void endElement_GenProprieteAttributs(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenAttribut().setGenProprieteAttributs(enCours.getGenProprieteAttributs());
    }
    
    public void endElement_GenProprieteAttribut(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGenProprieteAttributs() == null) {
    		enCours.setGenProprieteAttributs(new GenProprieteAttributsBean());
    	}
    	enCours.getGenProprieteAttributs().addGenProprieteAttribut(enCours.getGenProprieteAttribut());
    }
    
    public void endElement_GenStereotypeAttributs(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenAttribut().setGenStereotypeAttributs(enCours.getGenStereotypeAttributs());
    }
    
    public void endElement_GenStereotypeAttribut(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGenStereotypeAttributs() == null) {
    		enCours.setGenStereotypeAttributs(new GenStereotypeAttributsBean());
    	}
    	enCours.getGenStereotypeAttributs().addGenStereotypeAttribut(enCours.getGenStereotypeAttribut());
    }
    
    public void endElement_GenMethodes(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenClasse().setGenMethodes(enCours.getGenMethodes());
    }
    
    public void endElement_GenMethode(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGenMethodes() == null) {
    		enCours.setGenMethodes(new GenMethodesBean());
    	}
    	enCours.getGenMethodes().addGenMethode(enCours.getGenMethode());
    }
    
    public void endElement_GenProprieteMethodes(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenMethode().setGenProprieteMethodes(enCours.getGenProprieteMethodes());
    }
    
    public void endElement_GenProprieteMethode(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGenProprieteMethodes() == null) {
    		enCours.setGenProprieteMethodes(new GenProprieteMethodesBean());
    	}
    	enCours.getGenProprieteMethodes().addGenProprieteMethode(enCours.getGenProprieteMethode());
    }
    
    public void endElement_GenParametres(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenMethode().setGenParametres(enCours.getGenParametres());
    }
    
    public void endElement_GenParametre(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGenParametres() == null) {
    		enCours.setGenParametres(new GenParametresBean());
    	}
    	enCours.getGenParametres().addGenParametre(enCours.getGenParametre());
    }
    
    public void endElement_GenStereotypeMethodes(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenMethode().setGenStereotypeMethodes(enCours.getGenStereotypeMethodes());
    }
    
    public void endElement_GenStereotypeMethode(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGenStereotypeMethodes() == null) {
    		enCours.setGenStereotypeMethodes(new GenStereotypeMethodesBean());
    	}
    	enCours.getGenStereotypeMethodes().addGenStereotypeMethode(enCours.getGenStereotypeMethode());
    }
    
    public void endElement_GenStereotypeClasses(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenClasse().setGenStereotypeClasses(enCours.getGenStereotypeClasses());
    }
    
    public void endElement_GenStereotypeClasse(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGenStereotypeClasses() == null) {
    		enCours.setGenStereotypeClasses(new GenStereotypeClassesBean());
    	}
    	enCours.getGenStereotypeClasses().addGenStereotypeClasse(enCours.getGenStereotypeClasse());
    }
    
    public void endElement_GenAssociations(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenClasse().setGenAssociations(enCours.getGenAssociations());
    }
    
    public void endElement_GenAssociation(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGenAssociations() == null) {
    		enCours.setGenAssociations(new GenAssociationsBean());
    	}
    	enCours.getGenAssociations().addGenAssociation(enCours.getGenAssociation());
    }
    
    public void endElement_GenAssociationAttributs(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenAssociation().setGenAssociationAttributs(enCours.getGenAssociationAttributs());
    }
    
    public void endElement_GenAssociationAttribut(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGenAssociationAttributs() == null) {
    		enCours.setGenAssociationAttributs(new GenAssociationAttributsBean());
    	}
    	enCours.getGenAssociationAttributs().addGenAssociationAttribut(enCours.getGenAssociationAttribut());
    }
    
    public void endElement_GenClasseDeAssociation(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenAssociation().setGenClasseDeAssociation(enCours.getGenClasseDeAssociation());
    }
    
    public void endElement_GenClasseParents(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenClasse().setGenClasseParents(enCours.getGenClasseParents());
    }
    
    public void endElement_GenClasseParent(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGenClasseParents() == null) {
    		enCours.setGenClasseParents(new GenClasseParentsBean());
    	}
    	enCours.getGenClasseParents().addGenClasseParent(enCours.getGenClasseParent());
    }
    
    public void endElement_GenGenererGroupe(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGen().setGenGenererGroupe(enCours.getGenGenererGroupe());
    }
    
    public void endElement_GenGenererParClasses(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenGenererGroupe().setGenGenererParClasses(enCours.getGenGenererParClasses());
    }
    
    public void endElement_GenGenererParClasse(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGenGenererParClasses() == null) {
    		enCours.setGenGenererParClasses(new GenGenererParClassesBean());
    	}
    	enCours.getGenGenererParClasses().addGenGenererParClasse(enCours.getGenGenererParClasse());
    }
    
    public void endElement_GenClasseRefPourGenererParClasses(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenGenererParClasse().setGenClasseRefPourGenererParClasses(enCours.getGenClasseRefPourGenererParClasses());
    }
    
    public void endElement_GenClasseRefPourGenererParClasse(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGenClasseRefPourGenererParClasses() == null) {
    		enCours.setGenClasseRefPourGenererParClasses(new GenClasseRefPourGenererParClassesBean());
    	}
    	enCours.getGenClasseRefPourGenererParClasses().addGenClasseRefPourGenererParClasse(enCours.getGenClasseRefPourGenererParClasse());
    }
    
    public void endElement_GenTemplateGroupeRefPourGenererParClasses(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenGenererParClasse().setGenTemplateGroupeRefPourGenererParClasses(enCours.getGenTemplateGroupeRefPourGenererParClasses());
    }
    
    public void endElement_GenTemplateGroupeRefPourGenererParClasse(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGenTemplateGroupeRefPourGenererParClasses() == null) {
    		enCours.setGenTemplateGroupeRefPourGenererParClasses(new GenTemplateGroupeRefPourGenererParClassesBean());
    	}
    	enCours.getGenTemplateGroupeRefPourGenererParClasses().addGenTemplateGroupeRefPourGenererParClasse(enCours.getGenTemplateGroupeRefPourGenererParClasse());
    }
    
    public void endElement_GenGenererParTemplates(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenGenererGroupe().setGenGenererParTemplates(enCours.getGenGenererParTemplates());
    }
    
    public void endElement_GenGenererParTemplate(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGenGenererParTemplates() == null) {
    		enCours.setGenGenererParTemplates(new GenGenererParTemplatesBean());
    	}
    	enCours.getGenGenererParTemplates().addGenGenererParTemplate(enCours.getGenGenererParTemplate());
    }
    
    public void endElement_GenTemplateGroupeRefPourGenererParTemplates(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenGenererParTemplate().setGenTemplateGroupeRefPourGenererParTemplates(enCours.getGenTemplateGroupeRefPourGenererParTemplates());
    }
    
    public void endElement_GenTemplateGroupeRefPourGenererParTemplate(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGenTemplateGroupeRefPourGenererParTemplates() == null) {
    		enCours.setGenTemplateGroupeRefPourGenererParTemplates(new GenTemplateGroupeRefPourGenererParTemplatesBean());
    	}
    	enCours.getGenTemplateGroupeRefPourGenererParTemplates().addGenTemplateGroupeRefPourGenererParTemplate(enCours.getGenTemplateGroupeRefPourGenererParTemplate());
    }
    
    public void endElement_GenStereotypeRefPourGenererParTemplates(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenTemplateGroupeRefPourGenererParTemplate().setGenStereotypeRefPourGenererParTemplates(enCours.getGenStereotypeRefPourGenererParTemplates());
    }
    
    public void endElement_GenStereotypeRefPourGenererParTemplate(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGenStereotypeRefPourGenererParTemplates() == null) {
    		enCours.setGenStereotypeRefPourGenererParTemplates(new GenStereotypeRefPourGenererParTemplatesBean());
    	}
    	enCours.getGenStereotypeRefPourGenererParTemplates().addGenStereotypeRefPourGenererParTemplate(enCours.getGenStereotypeRefPourGenererParTemplate());
    }
    
    public void endElement_GenGenererParStereotypes(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenGenererGroupe().setGenGenererParStereotypes(enCours.getGenGenererParStereotypes());
    }
    
    public void endElement_GenGenererParStereotype(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGenGenererParStereotypes() == null) {
    		enCours.setGenGenererParStereotypes(new GenGenererParStereotypesBean());
    	}
    	enCours.getGenGenererParStereotypes().addGenGenererParStereotype(enCours.getGenGenererParStereotype());
    }
    
    public void endElement_GenStereotypeRefPourGenererParStereotypes(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenGenererParStereotype().setGenStereotypeRefPourGenererParStereotypes(enCours.getGenStereotypeRefPourGenererParStereotypes());
    }
    
    public void endElement_GenStereotypeRefPourGenererParStereotype(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGenStereotypeRefPourGenererParStereotypes() == null) {
    		enCours.setGenStereotypeRefPourGenererParStereotypes(new GenStereotypeRefPourGenererParStereotypesBean());
    	}
    	enCours.getGenStereotypeRefPourGenererParStereotypes().addGenStereotypeRefPourGenererParStereotype(enCours.getGenStereotypeRefPourGenererParStereotype());
    }
    
    public void endElement_GenTemplateGroupeRefPourGenererParStereotypes(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenStereotypeRefPourGenererParStereotype().setGenTemplateGroupeRefPourGenererParStereotypes(enCours.getGenTemplateGroupeRefPourGenererParStereotypes());
    }
    
    public void endElement_GenTemplateGroupeRefPourGenererParStereotype(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGenTemplateGroupeRefPourGenererParStereotypes() == null) {
    		enCours.setGenTemplateGroupeRefPourGenererParStereotypes(new GenTemplateGroupeRefPourGenererParStereotypesBean());
    	}
    	enCours.getGenTemplateGroupeRefPourGenererParStereotypes().addGenTemplateGroupeRefPourGenererParStereotype(enCours.getGenTemplateGroupeRefPourGenererParStereotype());
    }
    
	    
}
