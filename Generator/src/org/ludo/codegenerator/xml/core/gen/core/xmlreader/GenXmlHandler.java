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
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenProprietesClasseBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenProprieteClasseBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenAttributsBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenAttributBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenProprietesAttributBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenProprieteAttributBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenStereotypesAttributRefBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenStereotypeAttributBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenMethodesBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenMethodeBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenProprietesMethodeBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenProprieteMethodeBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenParametresBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenParametreBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenStereotypesMethodeRefBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenStereotypeMethodeBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenStereotypesClasseRefBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenStereotypeClasseBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenAssociationsBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenAssociationBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenAssociationAttributeBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenClasseParentsBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenClasseParentBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenGenererGroupeBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenGenererParClassesBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenGenererParClasseBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenClassesRefPourGenererParClasseBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenClasseRefPourGenererParClasseBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenTemplateGroupesRefPourGenererParClasseBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenTemplateGroupeRefPourGenererParClasseBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenGenererParTemplatesBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenGenererParTemplateBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenTemplateGroupesRefPourGenererParTemplateBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenTemplateGroupeRefPourGenererParTemplateBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenStereotypesRefPourGenererParTemplateBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenStereotypeRefPourGenererParTemplateBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenGenererParStereotypesBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenGenererParStereotypeBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenStereotypesRefPourGenererParStereotypeBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenStereotypeRefPourGenererParStereotypeBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenTemplateGroupesRefPourGenererParStereotypeBean;
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
import org.ludo.codegenerator.xml.core.gen.core.bean.GenProprietesClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenProprieteClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAttributs;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenProprietesAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenProprieteAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypesAttributRef;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenMethodes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenMethode;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenProprietesMethode;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenProprieteMethode;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenParametres;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenParametre;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypesMethodeRef;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeMethode;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypesClasseRef;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAssociations;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAssociation;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAssociationAttribute;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseParents;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseParent;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererGroupe;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParClasses;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClassesRefPourGenererParClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseRefPourGenererParClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupesRefPourGenererParClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeRefPourGenererParClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParTemplates;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupesRefPourGenererParTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeRefPourGenererParTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypesRefPourGenererParTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeRefPourGenererParTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParStereotypes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypesRefPourGenererParStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeRefPourGenererParStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupesRefPourGenererParStereotype;
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
        private GenProprietesClasse genProprietesClasse = null;
        private GenProprieteClasse genProprieteClasse = null;
        private GenAttributs genAttributs = null;
        private GenAttribut genAttribut = null;
        private GenProprietesAttribut genProprietesAttribut = null;
        private GenProprieteAttribut genProprieteAttribut = null;
        private GenStereotypesAttributRef genStereotypesAttributRef = null;
        private GenStereotypeAttribut genStereotypeAttribut = null;
        private GenMethodes genMethodes = null;
        private GenMethode genMethode = null;
        private GenProprietesMethode genProprietesMethode = null;
        private GenProprieteMethode genProprieteMethode = null;
        private GenParametres genParametres = null;
        private GenParametre genParametre = null;
        private GenStereotypesMethodeRef genStereotypesMethodeRef = null;
        private GenStereotypeMethode genStereotypeMethode = null;
        private GenStereotypesClasseRef genStereotypesClasseRef = null;
        private GenStereotypeClasse genStereotypeClasse = null;
        private GenAssociations genAssociations = null;
        private GenAssociation genAssociation = null;
        private GenAssociationAttribute genAssociationAttribute = null;
        private GenClasseParents genClasseParents = null;
        private GenClasseParent genClasseParent = null;
        private GenGenererGroupe genGenererGroupe = null;
        private GenGenererParClasses genGenererParClasses = null;
        private GenGenererParClasse genGenererParClasse = null;
        private GenClassesRefPourGenererParClasse genClassesRefPourGenererParClasse = null;
        private GenClasseRefPourGenererParClasse genClasseRefPourGenererParClasse = null;
        private GenTemplateGroupesRefPourGenererParClasse genTemplateGroupesRefPourGenererParClasse = null;
        private GenTemplateGroupeRefPourGenererParClasse genTemplateGroupeRefPourGenererParClasse = null;
        private GenGenererParTemplates genGenererParTemplates = null;
        private GenGenererParTemplate genGenererParTemplate = null;
        private GenTemplateGroupesRefPourGenererParTemplate genTemplateGroupesRefPourGenererParTemplate = null;
        private GenTemplateGroupeRefPourGenererParTemplate genTemplateGroupeRefPourGenererParTemplate = null;
        private GenStereotypesRefPourGenererParTemplate genStereotypesRefPourGenererParTemplate = null;
        private GenStereotypeRefPourGenererParTemplate genStereotypeRefPourGenererParTemplate = null;
        private GenGenererParStereotypes genGenererParStereotypes = null;
        private GenGenererParStereotype genGenererParStereotype = null;
        private GenStereotypesRefPourGenererParStereotype genStereotypesRefPourGenererParStereotype = null;
        private GenStereotypeRefPourGenererParStereotype genStereotypeRefPourGenererParStereotype = null;
        private GenTemplateGroupesRefPourGenererParStereotype genTemplateGroupesRefPourGenererParStereotype = null;
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
        public int posGenProprietesClasse = 0;
        public int posGenProprieteClasse = 0;
        public int posGenAttributs = 0;
        public int posGenAttribut = 0;
        public int posGenProprietesAttribut = 0;
        public int posGenProprieteAttribut = 0;
        public int posGenStereotypesAttributRef = 0;
        public int posGenStereotypeAttribut = 0;
        public int posGenMethodes = 0;
        public int posGenMethode = 0;
        public int posGenProprietesMethode = 0;
        public int posGenProprieteMethode = 0;
        public int posGenParametres = 0;
        public int posGenParametre = 0;
        public int posGenStereotypesMethodeRef = 0;
        public int posGenStereotypeMethode = 0;
        public int posGenStereotypesClasseRef = 0;
        public int posGenStereotypeClasse = 0;
        public int posGenAssociations = 0;
        public int posGenAssociation = 0;
        public int posGenAssociationAttribute = 0;
        public int posGenClasseParents = 0;
        public int posGenClasseParent = 0;
        public int posGenGenererGroupe = 0;
        public int posGenGenererParClasses = 0;
        public int posGenGenererParClasse = 0;
        public int posGenClassesRefPourGenererParClasse = 0;
        public int posGenClasseRefPourGenererParClasse = 0;
        public int posGenTemplateGroupesRefPourGenererParClasse = 0;
        public int posGenTemplateGroupeRefPourGenererParClasse = 0;
        public int posGenGenererParTemplates = 0;
        public int posGenGenererParTemplate = 0;
        public int posGenTemplateGroupesRefPourGenererParTemplate = 0;
        public int posGenTemplateGroupeRefPourGenererParTemplate = 0;
        public int posGenStereotypesRefPourGenererParTemplate = 0;
        public int posGenStereotypeRefPourGenererParTemplate = 0;
        public int posGenGenererParStereotypes = 0;
        public int posGenGenererParStereotype = 0;
        public int posGenStereotypesRefPourGenererParStereotype = 0;
        public int posGenStereotypeRefPourGenererParStereotype = 0;
        public int posGenTemplateGroupesRefPourGenererParStereotype = 0;
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
        public void definePosGenProprietesClasse() { posGenProprietesClasse = ++ posCompteur; }
        public void definePosGenProprieteClasse() { posGenProprieteClasse = ++ posCompteur; }
        public void definePosGenAttributs() { posGenAttributs = ++ posCompteur; }
        public void definePosGenAttribut() { posGenAttribut = ++ posCompteur; }
        public void definePosGenProprietesAttribut() { posGenProprietesAttribut = ++ posCompteur; }
        public void definePosGenProprieteAttribut() { posGenProprieteAttribut = ++ posCompteur; }
        public void definePosGenStereotypesAttributRef() { posGenStereotypesAttributRef = ++ posCompteur; }
        public void definePosGenStereotypeAttribut() { posGenStereotypeAttribut = ++ posCompteur; }
        public void definePosGenMethodes() { posGenMethodes = ++ posCompteur; }
        public void definePosGenMethode() { posGenMethode = ++ posCompteur; }
        public void definePosGenProprietesMethode() { posGenProprietesMethode = ++ posCompteur; }
        public void definePosGenProprieteMethode() { posGenProprieteMethode = ++ posCompteur; }
        public void definePosGenParametres() { posGenParametres = ++ posCompteur; }
        public void definePosGenParametre() { posGenParametre = ++ posCompteur; }
        public void definePosGenStereotypesMethodeRef() { posGenStereotypesMethodeRef = ++ posCompteur; }
        public void definePosGenStereotypeMethode() { posGenStereotypeMethode = ++ posCompteur; }
        public void definePosGenStereotypesClasseRef() { posGenStereotypesClasseRef = ++ posCompteur; }
        public void definePosGenStereotypeClasse() { posGenStereotypeClasse = ++ posCompteur; }
        public void definePosGenAssociations() { posGenAssociations = ++ posCompteur; }
        public void definePosGenAssociation() { posGenAssociation = ++ posCompteur; }
        public void definePosGenAssociationAttribute() { posGenAssociationAttribute = ++ posCompteur; }
        public void definePosGenClasseParents() { posGenClasseParents = ++ posCompteur; }
        public void definePosGenClasseParent() { posGenClasseParent = ++ posCompteur; }
        public void definePosGenGenererGroupe() { posGenGenererGroupe = ++ posCompteur; }
        public void definePosGenGenererParClasses() { posGenGenererParClasses = ++ posCompteur; }
        public void definePosGenGenererParClasse() { posGenGenererParClasse = ++ posCompteur; }
        public void definePosGenClassesRefPourGenererParClasse() { posGenClassesRefPourGenererParClasse = ++ posCompteur; }
        public void definePosGenClasseRefPourGenererParClasse() { posGenClasseRefPourGenererParClasse = ++ posCompteur; }
        public void definePosGenTemplateGroupesRefPourGenererParClasse() { posGenTemplateGroupesRefPourGenererParClasse = ++ posCompteur; }
        public void definePosGenTemplateGroupeRefPourGenererParClasse() { posGenTemplateGroupeRefPourGenererParClasse = ++ posCompteur; }
        public void definePosGenGenererParTemplates() { posGenGenererParTemplates = ++ posCompteur; }
        public void definePosGenGenererParTemplate() { posGenGenererParTemplate = ++ posCompteur; }
        public void definePosGenTemplateGroupesRefPourGenererParTemplate() { posGenTemplateGroupesRefPourGenererParTemplate = ++ posCompteur; }
        public void definePosGenTemplateGroupeRefPourGenererParTemplate() { posGenTemplateGroupeRefPourGenererParTemplate = ++ posCompteur; }
        public void definePosGenStereotypesRefPourGenererParTemplate() { posGenStereotypesRefPourGenererParTemplate = ++ posCompteur; }
        public void definePosGenStereotypeRefPourGenererParTemplate() { posGenStereotypeRefPourGenererParTemplate = ++ posCompteur; }
        public void definePosGenGenererParStereotypes() { posGenGenererParStereotypes = ++ posCompteur; }
        public void definePosGenGenererParStereotype() { posGenGenererParStereotype = ++ posCompteur; }
        public void definePosGenStereotypesRefPourGenererParStereotype() { posGenStereotypesRefPourGenererParStereotype = ++ posCompteur; }
        public void definePosGenStereotypeRefPourGenererParStereotype() { posGenStereotypeRefPourGenererParStereotype = ++ posCompteur; }
        public void definePosGenTemplateGroupesRefPourGenererParStereotype() { posGenTemplateGroupesRefPourGenererParStereotype = ++ posCompteur; }
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
        public int getPosGenProprietesClasse() { return posGenProprietesClasse; }
        public int getPosGenProprieteClasse() { return posGenProprieteClasse; }
        public int getPosGenAttributs() { return posGenAttributs; }
        public int getPosGenAttribut() { return posGenAttribut; }
        public int getPosGenProprietesAttribut() { return posGenProprietesAttribut; }
        public int getPosGenProprieteAttribut() { return posGenProprieteAttribut; }
        public int getPosGenStereotypesAttributRef() { return posGenStereotypesAttributRef; }
        public int getPosGenStereotypeAttribut() { return posGenStereotypeAttribut; }
        public int getPosGenMethodes() { return posGenMethodes; }
        public int getPosGenMethode() { return posGenMethode; }
        public int getPosGenProprietesMethode() { return posGenProprietesMethode; }
        public int getPosGenProprieteMethode() { return posGenProprieteMethode; }
        public int getPosGenParametres() { return posGenParametres; }
        public int getPosGenParametre() { return posGenParametre; }
        public int getPosGenStereotypesMethodeRef() { return posGenStereotypesMethodeRef; }
        public int getPosGenStereotypeMethode() { return posGenStereotypeMethode; }
        public int getPosGenStereotypesClasseRef() { return posGenStereotypesClasseRef; }
        public int getPosGenStereotypeClasse() { return posGenStereotypeClasse; }
        public int getPosGenAssociations() { return posGenAssociations; }
        public int getPosGenAssociation() { return posGenAssociation; }
        public int getPosGenAssociationAttribute() { return posGenAssociationAttribute; }
        public int getPosGenClasseParents() { return posGenClasseParents; }
        public int getPosGenClasseParent() { return posGenClasseParent; }
        public int getPosGenGenererGroupe() { return posGenGenererGroupe; }
        public int getPosGenGenererParClasses() { return posGenGenererParClasses; }
        public int getPosGenGenererParClasse() { return posGenGenererParClasse; }
        public int getPosGenClassesRefPourGenererParClasse() { return posGenClassesRefPourGenererParClasse; }
        public int getPosGenClasseRefPourGenererParClasse() { return posGenClasseRefPourGenererParClasse; }
        public int getPosGenTemplateGroupesRefPourGenererParClasse() { return posGenTemplateGroupesRefPourGenererParClasse; }
        public int getPosGenTemplateGroupeRefPourGenererParClasse() { return posGenTemplateGroupeRefPourGenererParClasse; }
        public int getPosGenGenererParTemplates() { return posGenGenererParTemplates; }
        public int getPosGenGenererParTemplate() { return posGenGenererParTemplate; }
        public int getPosGenTemplateGroupesRefPourGenererParTemplate() { return posGenTemplateGroupesRefPourGenererParTemplate; }
        public int getPosGenTemplateGroupeRefPourGenererParTemplate() { return posGenTemplateGroupeRefPourGenererParTemplate; }
        public int getPosGenStereotypesRefPourGenererParTemplate() { return posGenStereotypesRefPourGenererParTemplate; }
        public int getPosGenStereotypeRefPourGenererParTemplate() { return posGenStereotypeRefPourGenererParTemplate; }
        public int getPosGenGenererParStereotypes() { return posGenGenererParStereotypes; }
        public int getPosGenGenererParStereotype() { return posGenGenererParStereotype; }
        public int getPosGenStereotypesRefPourGenererParStereotype() { return posGenStereotypesRefPourGenererParStereotype; }
        public int getPosGenStereotypeRefPourGenererParStereotype() { return posGenStereotypeRefPourGenererParStereotype; }
        public int getPosGenTemplateGroupesRefPourGenererParStereotype() { return posGenTemplateGroupesRefPourGenererParStereotype; }
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
		public final GenProprietesClasse getGenProprietesClasse() { return genProprietesClasse; }
		public final GenProprieteClasse getGenProprieteClasse() { return genProprieteClasse; }
		public final GenAttributs getGenAttributs() { return genAttributs; }
		public final GenAttribut getGenAttribut() { return genAttribut; }
		public final GenProprietesAttribut getGenProprietesAttribut() { return genProprietesAttribut; }
		public final GenProprieteAttribut getGenProprieteAttribut() { return genProprieteAttribut; }
		public final GenStereotypesAttributRef getGenStereotypesAttributRef() { return genStereotypesAttributRef; }
		public final GenStereotypeAttribut getGenStereotypeAttribut() { return genStereotypeAttribut; }
		public final GenMethodes getGenMethodes() { return genMethodes; }
		public final GenMethode getGenMethode() { return genMethode; }
		public final GenProprietesMethode getGenProprietesMethode() { return genProprietesMethode; }
		public final GenProprieteMethode getGenProprieteMethode() { return genProprieteMethode; }
		public final GenParametres getGenParametres() { return genParametres; }
		public final GenParametre getGenParametre() { return genParametre; }
		public final GenStereotypesMethodeRef getGenStereotypesMethodeRef() { return genStereotypesMethodeRef; }
		public final GenStereotypeMethode getGenStereotypeMethode() { return genStereotypeMethode; }
		public final GenStereotypesClasseRef getGenStereotypesClasseRef() { return genStereotypesClasseRef; }
		public final GenStereotypeClasse getGenStereotypeClasse() { return genStereotypeClasse; }
		public final GenAssociations getGenAssociations() { return genAssociations; }
		public final GenAssociation getGenAssociation() { return genAssociation; }
		public final GenAssociationAttribute getGenAssociationAttribute() { return genAssociationAttribute; }
		public final GenClasseParents getGenClasseParents() { return genClasseParents; }
		public final GenClasseParent getGenClasseParent() { return genClasseParent; }
		public final GenGenererGroupe getGenGenererGroupe() { return genGenererGroupe; }
		public final GenGenererParClasses getGenGenererParClasses() { return genGenererParClasses; }
		public final GenGenererParClasse getGenGenererParClasse() { return genGenererParClasse; }
		public final GenClassesRefPourGenererParClasse getGenClassesRefPourGenererParClasse() { return genClassesRefPourGenererParClasse; }
		public final GenClasseRefPourGenererParClasse getGenClasseRefPourGenererParClasse() { return genClasseRefPourGenererParClasse; }
		public final GenTemplateGroupesRefPourGenererParClasse getGenTemplateGroupesRefPourGenererParClasse() { return genTemplateGroupesRefPourGenererParClasse; }
		public final GenTemplateGroupeRefPourGenererParClasse getGenTemplateGroupeRefPourGenererParClasse() { return genTemplateGroupeRefPourGenererParClasse; }
		public final GenGenererParTemplates getGenGenererParTemplates() { return genGenererParTemplates; }
		public final GenGenererParTemplate getGenGenererParTemplate() { return genGenererParTemplate; }
		public final GenTemplateGroupesRefPourGenererParTemplate getGenTemplateGroupesRefPourGenererParTemplate() { return genTemplateGroupesRefPourGenererParTemplate; }
		public final GenTemplateGroupeRefPourGenererParTemplate getGenTemplateGroupeRefPourGenererParTemplate() { return genTemplateGroupeRefPourGenererParTemplate; }
		public final GenStereotypesRefPourGenererParTemplate getGenStereotypesRefPourGenererParTemplate() { return genStereotypesRefPourGenererParTemplate; }
		public final GenStereotypeRefPourGenererParTemplate getGenStereotypeRefPourGenererParTemplate() { return genStereotypeRefPourGenererParTemplate; }
		public final GenGenererParStereotypes getGenGenererParStereotypes() { return genGenererParStereotypes; }
		public final GenGenererParStereotype getGenGenererParStereotype() { return genGenererParStereotype; }
		public final GenStereotypesRefPourGenererParStereotype getGenStereotypesRefPourGenererParStereotype() { return genStereotypesRefPourGenererParStereotype; }
		public final GenStereotypeRefPourGenererParStereotype getGenStereotypeRefPourGenererParStereotype() { return genStereotypeRefPourGenererParStereotype; }
		public final GenTemplateGroupesRefPourGenererParStereotype getGenTemplateGroupesRefPourGenererParStereotype() { return genTemplateGroupesRefPourGenererParStereotype; }
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
		public final void setGenProprietesClasse(GenProprietesClasse genProprietesClasse) {
			this.definePosGenProprietesClasse();
			this.genProprietesClasse = genProprietesClasse;
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
		public final void setGenProprietesAttribut(GenProprietesAttribut genProprietesAttribut) {
			this.definePosGenProprietesAttribut();
			this.genProprietesAttribut = genProprietesAttribut;
		}
		public final void setGenProprieteAttribut(GenProprieteAttribut genProprieteAttribut) {
			this.definePosGenProprieteAttribut();
			this.genProprieteAttribut = genProprieteAttribut;
		}
		public final void setGenStereotypesAttributRef(GenStereotypesAttributRef genStereotypesAttributRef) {
			this.definePosGenStereotypesAttributRef();
			this.genStereotypesAttributRef = genStereotypesAttributRef;
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
		public final void setGenProprietesMethode(GenProprietesMethode genProprietesMethode) {
			this.definePosGenProprietesMethode();
			this.genProprietesMethode = genProprietesMethode;
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
		public final void setGenStereotypesMethodeRef(GenStereotypesMethodeRef genStereotypesMethodeRef) {
			this.definePosGenStereotypesMethodeRef();
			this.genStereotypesMethodeRef = genStereotypesMethodeRef;
		}
		public final void setGenStereotypeMethode(GenStereotypeMethode genStereotypeMethode) {
			this.definePosGenStereotypeMethode();
			this.genStereotypeMethode = genStereotypeMethode;
		}
		public final void setGenStereotypesClasseRef(GenStereotypesClasseRef genStereotypesClasseRef) {
			this.definePosGenStereotypesClasseRef();
			this.genStereotypesClasseRef = genStereotypesClasseRef;
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
		public final void setGenAssociationAttribute(GenAssociationAttribute genAssociationAttribute) {
			this.definePosGenAssociationAttribute();
			this.genAssociationAttribute = genAssociationAttribute;
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
		public final void setGenClassesRefPourGenererParClasse(GenClassesRefPourGenererParClasse genClassesRefPourGenererParClasse) {
			this.definePosGenClassesRefPourGenererParClasse();
			this.genClassesRefPourGenererParClasse = genClassesRefPourGenererParClasse;
		}
		public final void setGenClasseRefPourGenererParClasse(GenClasseRefPourGenererParClasse genClasseRefPourGenererParClasse) {
			this.definePosGenClasseRefPourGenererParClasse();
			this.genClasseRefPourGenererParClasse = genClasseRefPourGenererParClasse;
		}
		public final void setGenTemplateGroupesRefPourGenererParClasse(GenTemplateGroupesRefPourGenererParClasse genTemplateGroupesRefPourGenererParClasse) {
			this.definePosGenTemplateGroupesRefPourGenererParClasse();
			this.genTemplateGroupesRefPourGenererParClasse = genTemplateGroupesRefPourGenererParClasse;
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
		public final void setGenTemplateGroupesRefPourGenererParTemplate(GenTemplateGroupesRefPourGenererParTemplate genTemplateGroupesRefPourGenererParTemplate) {
			this.definePosGenTemplateGroupesRefPourGenererParTemplate();
			this.genTemplateGroupesRefPourGenererParTemplate = genTemplateGroupesRefPourGenererParTemplate;
		}
		public final void setGenTemplateGroupeRefPourGenererParTemplate(GenTemplateGroupeRefPourGenererParTemplate genTemplateGroupeRefPourGenererParTemplate) {
			this.definePosGenTemplateGroupeRefPourGenererParTemplate();
			this.genTemplateGroupeRefPourGenererParTemplate = genTemplateGroupeRefPourGenererParTemplate;
		}
		public final void setGenStereotypesRefPourGenererParTemplate(GenStereotypesRefPourGenererParTemplate genStereotypesRefPourGenererParTemplate) {
			this.definePosGenStereotypesRefPourGenererParTemplate();
			this.genStereotypesRefPourGenererParTemplate = genStereotypesRefPourGenererParTemplate;
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
		public final void setGenStereotypesRefPourGenererParStereotype(GenStereotypesRefPourGenererParStereotype genStereotypesRefPourGenererParStereotype) {
			this.definePosGenStereotypesRefPourGenererParStereotype();
			this.genStereotypesRefPourGenererParStereotype = genStereotypesRefPourGenererParStereotype;
		}
		public final void setGenStereotypeRefPourGenererParStereotype(GenStereotypeRefPourGenererParStereotype genStereotypeRefPourGenererParStereotype) {
			this.definePosGenStereotypeRefPourGenererParStereotype();
			this.genStereotypeRefPourGenererParStereotype = genStereotypeRefPourGenererParStereotype;
		}
		public final void setGenTemplateGroupesRefPourGenererParStereotype(GenTemplateGroupesRefPourGenererParStereotype genTemplateGroupesRefPourGenererParStereotype) {
			this.definePosGenTemplateGroupesRefPourGenererParStereotype();
			this.genTemplateGroupesRefPourGenererParStereotype = genTemplateGroupesRefPourGenererParStereotype;
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
        if (GenXmlNoeud.N_GenProprietesClasse.equalsIgnoreCase(localName)){
            startElement_GenProprietesClasse(namespaceURI, localName, qName, atts);
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
        if (GenXmlNoeud.N_GenProprietesAttribut.equalsIgnoreCase(localName)){
            startElement_GenProprietesAttribut(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenProprieteAttribut.equalsIgnoreCase(localName)){
            startElement_GenProprieteAttribut(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenStereotypesAttributRef.equalsIgnoreCase(localName)){
            startElement_GenStereotypesAttributRef(namespaceURI, localName, qName, atts);
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
        if (GenXmlNoeud.N_GenProprietesMethode.equalsIgnoreCase(localName)){
            startElement_GenProprietesMethode(namespaceURI, localName, qName, atts);
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
        if (GenXmlNoeud.N_GenStereotypesMethodeRef.equalsIgnoreCase(localName)){
            startElement_GenStereotypesMethodeRef(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenStereotypeMethode.equalsIgnoreCase(localName)){
            startElement_GenStereotypeMethode(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenStereotypesClasseRef.equalsIgnoreCase(localName)){
            startElement_GenStereotypesClasseRef(namespaceURI, localName, qName, atts);
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
        if (GenXmlNoeud.N_GenAssociationAttribute.equalsIgnoreCase(localName)){
            startElement_GenAssociationAttribute(namespaceURI, localName, qName, atts);
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
        if (GenXmlNoeud.N_GenClassesRefPourGenererParClasse.equalsIgnoreCase(localName)){
            startElement_GenClassesRefPourGenererParClasse(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenClasseRefPourGenererParClasse.equalsIgnoreCase(localName)){
            startElement_GenClasseRefPourGenererParClasse(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenTemplateGroupesRefPourGenererParClasse.equalsIgnoreCase(localName)){
            startElement_GenTemplateGroupesRefPourGenererParClasse(namespaceURI, localName, qName, atts);
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
        if (GenXmlNoeud.N_GenTemplateGroupesRefPourGenererParTemplate.equalsIgnoreCase(localName)){
            startElement_GenTemplateGroupesRefPourGenererParTemplate(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenTemplateGroupeRefPourGenererParTemplate.equalsIgnoreCase(localName)){
            startElement_GenTemplateGroupeRefPourGenererParTemplate(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenStereotypesRefPourGenererParTemplate.equalsIgnoreCase(localName)){
            startElement_GenStereotypesRefPourGenererParTemplate(namespaceURI, localName, qName, atts);
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
        if (GenXmlNoeud.N_GenStereotypesRefPourGenererParStereotype.equalsIgnoreCase(localName)){
            startElement_GenStereotypesRefPourGenererParStereotype(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenStereotypeRefPourGenererParStereotype.equalsIgnoreCase(localName)){
            startElement_GenStereotypeRefPourGenererParStereotype(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenTemplateGroupesRefPourGenererParStereotype.equalsIgnoreCase(localName)){
            startElement_GenTemplateGroupesRefPourGenererParStereotype(namespaceURI, localName, qName, atts);
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
    
    public void startElement_GenProprietesClasse(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenProprietesClasse genProprietesClasse = new GenProprietesClasseBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenProprietesClasse( genProprietesClasse );
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
            if(GenXmlNoeud.N_GenAttribut_A_Description.equalsIgnoreCase(attName)) {
            	genAttribut.setDescriptionAsString(atts.getValue(i));
            }
        }
        enCours.setGenAttribut( genAttribut );
    }
    
    public void startElement_GenProprietesAttribut(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenProprietesAttribut genProprietesAttribut = new GenProprietesAttributBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenProprietesAttribut( genProprietesAttribut );
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
    
    public void startElement_GenStereotypesAttributRef(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenStereotypesAttributRef genStereotypesAttributRef = new GenStereotypesAttributRefBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenStereotypesAttributRef( genStereotypesAttributRef );
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
    
    public void startElement_GenProprietesMethode(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenProprietesMethode genProprietesMethode = new GenProprietesMethodeBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenProprietesMethode( genProprietesMethode );
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
    
    public void startElement_GenStereotypesMethodeRef(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenStereotypesMethodeRef genStereotypesMethodeRef = new GenStereotypesMethodeRefBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenStereotypesMethodeRef( genStereotypesMethodeRef );
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
    
    public void startElement_GenStereotypesClasseRef(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenStereotypesClasseRef genStereotypesClasseRef = new GenStereotypesClasseRefBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenStereotypesClasseRef( genStereotypesClasseRef );
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
    
    public void startElement_GenAssociationAttribute(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenAssociationAttribute genAssociationAttribute = new GenAssociationAttributeBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_GenAssociationAttribute_A_GenId.equalsIgnoreCase(attName)) {
            	genAssociationAttribute.setGenIdAsString(atts.getValue(i));
            }
        }
        enCours.setGenAssociationAttribute( genAssociationAttribute );
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
    
    public void startElement_GenClassesRefPourGenererParClasse(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenClassesRefPourGenererParClasse genClassesRefPourGenererParClasse = new GenClassesRefPourGenererParClasseBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenClassesRefPourGenererParClasse( genClassesRefPourGenererParClasse );
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
    
    public void startElement_GenTemplateGroupesRefPourGenererParClasse(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenTemplateGroupesRefPourGenererParClasse genTemplateGroupesRefPourGenererParClasse = new GenTemplateGroupesRefPourGenererParClasseBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenTemplateGroupesRefPourGenererParClasse( genTemplateGroupesRefPourGenererParClasse );
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
    
    public void startElement_GenTemplateGroupesRefPourGenererParTemplate(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenTemplateGroupesRefPourGenererParTemplate genTemplateGroupesRefPourGenererParTemplate = new GenTemplateGroupesRefPourGenererParTemplateBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenTemplateGroupesRefPourGenererParTemplate( genTemplateGroupesRefPourGenererParTemplate );
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
    
    public void startElement_GenStereotypesRefPourGenererParTemplate(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenStereotypesRefPourGenererParTemplate genStereotypesRefPourGenererParTemplate = new GenStereotypesRefPourGenererParTemplateBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenStereotypesRefPourGenererParTemplate( genStereotypesRefPourGenererParTemplate );
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
    
    public void startElement_GenStereotypesRefPourGenererParStereotype(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenStereotypesRefPourGenererParStereotype genStereotypesRefPourGenererParStereotype = new GenStereotypesRefPourGenererParStereotypeBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenStereotypesRefPourGenererParStereotype( genStereotypesRefPourGenererParStereotype );
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
    
    public void startElement_GenTemplateGroupesRefPourGenererParStereotype(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenTemplateGroupesRefPourGenererParStereotype genTemplateGroupesRefPourGenererParStereotype = new GenTemplateGroupesRefPourGenererParStereotypeBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenTemplateGroupesRefPourGenererParStereotype( genTemplateGroupesRefPourGenererParStereotype );
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
        if (GenXmlNoeud.N_GenProprietesClasse.equalsIgnoreCase(localName)){
            endElement_GenProprietesClasse(namespaceURI, localName, qName);
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
        if (GenXmlNoeud.N_GenProprietesAttribut.equalsIgnoreCase(localName)){
            endElement_GenProprietesAttribut(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenProprieteAttribut.equalsIgnoreCase(localName)){
            endElement_GenProprieteAttribut(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenStereotypesAttributRef.equalsIgnoreCase(localName)){
            endElement_GenStereotypesAttributRef(namespaceURI, localName, qName);
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
        if (GenXmlNoeud.N_GenProprietesMethode.equalsIgnoreCase(localName)){
            endElement_GenProprietesMethode(namespaceURI, localName, qName);
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
        if (GenXmlNoeud.N_GenStereotypesMethodeRef.equalsIgnoreCase(localName)){
            endElement_GenStereotypesMethodeRef(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenStereotypeMethode.equalsIgnoreCase(localName)){
            endElement_GenStereotypeMethode(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenStereotypesClasseRef.equalsIgnoreCase(localName)){
            endElement_GenStereotypesClasseRef(namespaceURI, localName, qName);
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
        if (GenXmlNoeud.N_GenAssociationAttribute.equalsIgnoreCase(localName)){
            endElement_GenAssociationAttribute(namespaceURI, localName, qName);
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
        if (GenXmlNoeud.N_GenClassesRefPourGenererParClasse.equalsIgnoreCase(localName)){
            endElement_GenClassesRefPourGenererParClasse(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenClasseRefPourGenererParClasse.equalsIgnoreCase(localName)){
            endElement_GenClasseRefPourGenererParClasse(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenTemplateGroupesRefPourGenererParClasse.equalsIgnoreCase(localName)){
            endElement_GenTemplateGroupesRefPourGenererParClasse(namespaceURI, localName, qName);
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
        if (GenXmlNoeud.N_GenTemplateGroupesRefPourGenererParTemplate.equalsIgnoreCase(localName)){
            endElement_GenTemplateGroupesRefPourGenererParTemplate(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenTemplateGroupeRefPourGenererParTemplate.equalsIgnoreCase(localName)){
            endElement_GenTemplateGroupeRefPourGenererParTemplate(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenStereotypesRefPourGenererParTemplate.equalsIgnoreCase(localName)){
            endElement_GenStereotypesRefPourGenererParTemplate(namespaceURI, localName, qName);
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
        if (GenXmlNoeud.N_GenStereotypesRefPourGenererParStereotype.equalsIgnoreCase(localName)){
            endElement_GenStereotypesRefPourGenererParStereotype(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenStereotypeRefPourGenererParStereotype.equalsIgnoreCase(localName)){
            endElement_GenStereotypeRefPourGenererParStereotype(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenTemplateGroupesRefPourGenererParStereotype.equalsIgnoreCase(localName)){
            endElement_GenTemplateGroupesRefPourGenererParStereotype(namespaceURI, localName, qName);
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
    	enCours.getGenTemplates().addGenTemplate(enCours.getGenTemplate());
    }
    
    public void endElement_GenTemplateGroupes(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGen().setGenTemplateGroupes(enCours.getGenTemplateGroupes());
    }
    
    public void endElement_GenTemplateGroupe(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenTemplateGroupes().addGenTemplateGroupe(enCours.getGenTemplateGroupe());
    }
    
    public void endElement_GenTemplateRef(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenTemplateGroupe().addGenTemplateRef(enCours.getGenTemplateRef());
    }
    
    public void endElement_GenStereotypes(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGen().setGenStereotypes(enCours.getGenStereotypes());
    }
    
    public void endElement_GenStereotype(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenStereotypes().addGenStereotype(enCours.getGenStereotype());
    }
    
    public void endElement_GenClasses(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGen().setGenClasses(enCours.getGenClasses());
    }
    
    public void endElement_GenClasse(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenClasses().addGenClasse(enCours.getGenClasse());
    }
    
    public void endElement_GenProprietesClasse(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenClasse().setGenProprietesClasse(enCours.getGenProprietesClasse());
    }
    
    public void endElement_GenProprieteClasse(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenProprietesClasse().addGenProprieteClasse(enCours.getGenProprieteClasse());
    }
    
    public void endElement_GenAttributs(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenClasse().setGenAttributs(enCours.getGenAttributs());
    }
    
    public void endElement_GenAttribut(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenAttributs().addGenAttribut(enCours.getGenAttribut());
    }
    
    public void endElement_GenProprietesAttribut(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenAttribut().setGenProprietesAttribut(enCours.getGenProprietesAttribut());
    }
    
    public void endElement_GenProprieteAttribut(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenProprietesAttribut().addGenProprieteAttribut(enCours.getGenProprieteAttribut());
    }
    
    public void endElement_GenStereotypesAttributRef(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenAttribut().setGenStereotypesAttributRef(enCours.getGenStereotypesAttributRef());
    }
    
    public void endElement_GenStereotypeAttribut(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenStereotypesAttributRef().addGenStereotypeAttribut(enCours.getGenStereotypeAttribut());
    }
    
    public void endElement_GenMethodes(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenClasse().setGenMethodes(enCours.getGenMethodes());
    }
    
    public void endElement_GenMethode(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenMethodes().addGenMethode(enCours.getGenMethode());
    }
    
    public void endElement_GenProprietesMethode(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenMethode().setGenProprietesMethode(enCours.getGenProprietesMethode());
    }
    
    public void endElement_GenProprieteMethode(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenProprietesMethode().addGenProprieteMethode(enCours.getGenProprieteMethode());
    }
    
    public void endElement_GenParametres(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenMethode().setGenParametres(enCours.getGenParametres());
    }
    
    public void endElement_GenParametre(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenParametres().addGenParametre(enCours.getGenParametre());
    }
    
    public void endElement_GenStereotypesMethodeRef(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenMethode().setGenStereotypesMethodeRef(enCours.getGenStereotypesMethodeRef());
    }
    
    public void endElement_GenStereotypeMethode(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenStereotypesMethodeRef().addGenStereotypeMethode(enCours.getGenStereotypeMethode());
    }
    
    public void endElement_GenStereotypesClasseRef(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenClasse().setGenStereotypesClasseRef(enCours.getGenStereotypesClasseRef());
    }
    
    public void endElement_GenStereotypeClasse(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenStereotypesClasseRef().addGenStereotypeClasse(enCours.getGenStereotypeClasse());
    }
    
    public void endElement_GenAssociations(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenClasse().setGenAssociations(enCours.getGenAssociations());
    }
    
    public void endElement_GenAssociation(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenAssociations().addGenAssociation(enCours.getGenAssociation());
    }
    
    public void endElement_GenAssociationAttribute(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenAssociation().addGenAssociationAttribute(enCours.getGenAssociationAttribute());
    }
    
    public void endElement_GenClasseParents(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenClasse().setGenClasseParents(enCours.getGenClasseParents());
    }
    
    public void endElement_GenClasseParent(String namespaceURI, String localName, String qName)
    throws SAXException {
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
    	enCours.getGenGenererParClasses().addGenGenererParClasse(enCours.getGenGenererParClasse());
    }
    
    public void endElement_GenClassesRefPourGenererParClasse(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenGenererParClasse().setGenClassesRefPourGenererParClasse(enCours.getGenClassesRefPourGenererParClasse());
    }
    
    public void endElement_GenClasseRefPourGenererParClasse(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenClassesRefPourGenererParClasse().addGenClasseRefPourGenererParClasse(enCours.getGenClasseRefPourGenererParClasse());
    }
    
    public void endElement_GenTemplateGroupesRefPourGenererParClasse(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenGenererParClasse().setGenTemplateGroupesRefPourGenererParClasse(enCours.getGenTemplateGroupesRefPourGenererParClasse());
    }
    
    public void endElement_GenTemplateGroupeRefPourGenererParClasse(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenTemplateGroupesRefPourGenererParClasse().addGenTemplateGroupeRefPourGenererParClasse(enCours.getGenTemplateGroupeRefPourGenererParClasse());
    }
    
    public void endElement_GenGenererParTemplates(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenGenererGroupe().setGenGenererParTemplates(enCours.getGenGenererParTemplates());
    }
    
    public void endElement_GenGenererParTemplate(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenGenererParTemplates().addGenGenererParTemplate(enCours.getGenGenererParTemplate());
    }
    
    public void endElement_GenTemplateGroupesRefPourGenererParTemplate(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenGenererParTemplate().setGenTemplateGroupesRefPourGenererParTemplate(enCours.getGenTemplateGroupesRefPourGenererParTemplate());
    }
    
    public void endElement_GenTemplateGroupeRefPourGenererParTemplate(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenTemplateGroupesRefPourGenererParTemplate().addGenTemplateGroupeRefPourGenererParTemplate(enCours.getGenTemplateGroupeRefPourGenererParTemplate());
    }
    
    public void endElement_GenStereotypesRefPourGenererParTemplate(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenTemplateGroupeRefPourGenererParTemplate().setGenStereotypesRefPourGenererParTemplate(enCours.getGenStereotypesRefPourGenererParTemplate());
    }
    
    public void endElement_GenStereotypeRefPourGenererParTemplate(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenStereotypesRefPourGenererParTemplate().addGenStereotypeRefPourGenererParTemplate(enCours.getGenStereotypeRefPourGenererParTemplate());
    }
    
    public void endElement_GenGenererParStereotypes(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenGenererGroupe().setGenGenererParStereotypes(enCours.getGenGenererParStereotypes());
    }
    
    public void endElement_GenGenererParStereotype(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenGenererParStereotypes().addGenGenererParStereotype(enCours.getGenGenererParStereotype());
    }
    
    public void endElement_GenStereotypesRefPourGenererParStereotype(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenGenererParStereotype().setGenStereotypesRefPourGenererParStereotype(enCours.getGenStereotypesRefPourGenererParStereotype());
    }
    
    public void endElement_GenStereotypeRefPourGenererParStereotype(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenStereotypesRefPourGenererParStereotype().addGenStereotypeRefPourGenererParStereotype(enCours.getGenStereotypeRefPourGenererParStereotype());
    }
    
    public void endElement_GenTemplateGroupesRefPourGenererParStereotype(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenStereotypeRefPourGenererParStereotype().setGenTemplateGroupesRefPourGenererParStereotype(enCours.getGenTemplateGroupesRefPourGenererParStereotype());
    }
    
    public void endElement_GenTemplateGroupeRefPourGenererParStereotype(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenTemplateGroupesRefPourGenererParStereotype().addGenTemplateGroupeRefPourGenererParStereotype(enCours.getGenTemplateGroupeRefPourGenererParStereotype());
    }
    
	    
}
