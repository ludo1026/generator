package org.ludo.codegenerator.xml.core.gen.core.xmlreader;

import org.apache.log4j.Logger;
import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAssociation;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAssociations;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAttributs;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseDeAssociation;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseParent;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseParents;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseRefPourGenererParClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasses;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClassesRefPourGenererParClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererGroupe;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParClasses;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParStereotypes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParTemplates;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenMethode;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenMethodes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenParametre;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenParametres;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeRef;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeRefPourGenererParStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeRefPourGenererParTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypesRef;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypesRefPourGenererParStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypesRefPourGenererParTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupe;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeRefPourGenererParClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeRefPourGenererParStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeRefPourGenererParTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupesRefPourGenererParClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupesRefPourGenererParStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupesRefPourGenererParTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateRef;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplates;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenAssociationBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenAssociationsBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenAttributBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenAttributsBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenClasseBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenClasseDeAssociationBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenClasseParentBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenClasseParentsBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenClasseRefPourGenererParClasseBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenClassesBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenClassesRefPourGenererParClasseBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenGenererGroupeBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenGenererParClasseBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenGenererParClassesBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenGenererParStereotypeBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenGenererParStereotypesBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenGenererParTemplateBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenGenererParTemplatesBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenMethodeBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenMethodesBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenParametreBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenParametresBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenStereotypeBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenStereotypeRefBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenStereotypeRefPourGenererParStereotypeBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenStereotypeRefPourGenererParTemplateBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenStereotypesBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenStereotypesRefBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenStereotypesRefPourGenererParStereotypeBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenStereotypesRefPourGenererParTemplateBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenTemplateBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenTemplateGroupeBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenTemplateGroupeRefPourGenererParClasseBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenTemplateGroupeRefPourGenererParStereotypeBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenTemplateGroupeRefPourGenererParTemplateBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenTemplateGroupesBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenTemplateGroupesRefPourGenererParClasseBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenTemplateGroupesRefPourGenererParStereotypeBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenTemplateGroupesRefPourGenererParTemplateBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenTemplateRefBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenTemplatesBean;
import org.ludo.utils.LoggerManager;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class GenXmlHandler extends DefaultHandler {
    
    private static Logger log = LoggerManager.getLogger(GenXmlHandler.class);
    
    private EnCours enCours = new EnCours();
    
    private class EnCours {
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
        private GenAttributs genAttributs = null;
        private GenAttribut genAttribut = null;
        private GenMethodes genMethodes = null;
        private GenMethode genMethode = null;
        private GenParametres genParametres = null;
        private GenParametre genParametre = null;
        private GenStereotypesRef genStereotypesRef = null;
        private GenStereotypeRef genStereotypeRef = null;
        private GenAssociations genAssociations = null;
        private GenAssociation genAssociation = null;
        private GenClasseDeAssociation genClasseDeAssociation = null;
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
        public int posGenAttributs = 0;
        public int posGenAttribut = 0;
        public int posGenMethodes = 0;
        public int posGenMethode = 0;
        public int posGenParametres = 0;
        public int posGenParametre = 0;
        public int posGenStereotypesRef = 0;
        public int posGenStereotypeRef = 0;
        public int posGenAssociations = 0;
        public int posGenAssociation = 0;
        public int posGenClasseDeAssociation = 0;
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
        public void definePosGenAttributs() { posGenAttributs = ++ posCompteur; }
        public void definePosGenAttribut() { posGenAttribut = ++ posCompteur; }
        public void definePosGenMethodes() { posGenMethodes = ++ posCompteur; }
        public void definePosGenMethode() { posGenMethode = ++ posCompteur; }
        public void definePosGenParametres() { posGenParametres = ++ posCompteur; }
        public void definePosGenParametre() { posGenParametre = ++ posCompteur; }
        public void definePosGenStereotypesRef() { posGenStereotypesRef = ++ posCompteur; }
        public void definePosGenStereotypeRef() { posGenStereotypeRef = ++ posCompteur; }
        public void definePosGenAssociations() { posGenAssociations = ++ posCompteur; }
        public void definePosGenAssociation() { posGenAssociation = ++ posCompteur; }
        public void definePosGenClasseDeAssociation() { posGenClasseDeAssociation = ++ posCompteur; }
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
        public int getPosGenAttributs() { return posGenAttributs; }
        public int getPosGenAttribut() { return posGenAttribut; }
        public int getPosGenMethodes() { return posGenMethodes; }
        public int getPosGenMethode() { return posGenMethode; }
        public int getPosGenParametres() { return posGenParametres; }
        public int getPosGenParametre() { return posGenParametre; }
        public int getPosGenStereotypesRef() { return posGenStereotypesRef; }
        public int getPosGenStereotypeRef() { return posGenStereotypeRef; }
        public int getPosGenAssociations() { return posGenAssociations; }
        public int getPosGenAssociation() { return posGenAssociation; }
        public int getPosGenClasseDeAssociation() { return posGenClasseDeAssociation; }
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
		public final GenAttributs getGenAttributs() { return genAttributs; }
		public final GenAttribut getGenAttribut() { return genAttribut; }
		public final GenMethodes getGenMethodes() { return genMethodes; }
		public final GenMethode getGenMethode() { return genMethode; }
		public final GenParametres getGenParametres() { return genParametres; }
		public final GenParametre getGenParametre() { return genParametre; }
		public final GenStereotypesRef getGenStereotypesRef() { return genStereotypesRef; }
		public final GenStereotypeRef getGenStereotypeRef() { return genStereotypeRef; }
		public final GenAssociations getGenAssociations() { return genAssociations; }
		public final GenAssociation getGenAssociation() { return genAssociation; }
		public final GenClasseDeAssociation getGenClasseDeAssociation() { return genClasseDeAssociation; }
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
		public final void setGenAttributs(GenAttributs genAttributs) {
			this.definePosGenAttributs();
			this.genAttributs = genAttributs;
		}
		public final void setGenAttribut(GenAttribut genAttribut) {
			this.definePosGenAttribut();
			this.genAttribut = genAttribut;
		}
		public final void setGenMethodes(GenMethodes genMethodes) {
			this.definePosGenMethodes();
			this.genMethodes = genMethodes;
		}
		public final void setGenMethode(GenMethode genMethode) {
			this.definePosGenMethode();
			this.genMethode = genMethode;
		}
		public final void setGenParametres(GenParametres genParametres) {
			this.definePosGenParametres();
			this.genParametres = genParametres;
		}
		public final void setGenParametre(GenParametre genParametre) {
			this.definePosGenParametre();
			this.genParametre = genParametre;
		}
		public final void setGenStereotypesRef(GenStereotypesRef genStereotypesRef) {
			this.definePosGenStereotypesRef();
			this.genStereotypesRef = genStereotypesRef;
		}
		public final void setGenStereotypeRef(GenStereotypeRef genStereotypeRef) {
			this.definePosGenStereotypeRef();
			this.genStereotypeRef = genStereotypeRef;
		}
		public final void setGenAssociations(GenAssociations genAssociations) {
			this.definePosGenAssociations();
			this.genAssociations = genAssociations;
		}
		public final void setGenAssociation(GenAssociation genAssociation) {
			this.definePosGenAssociation();
			this.genAssociation = genAssociation;
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
        if (GenXmlNoeud.N_GenAttributs.equalsIgnoreCase(localName)){
            startElement_GenAttributs(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenAttribut.equalsIgnoreCase(localName)){
            startElement_GenAttribut(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenMethodes.equalsIgnoreCase(localName)){
            startElement_GenMethodes(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenMethode.equalsIgnoreCase(localName)){
            startElement_GenMethode(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenParametres.equalsIgnoreCase(localName)){
            startElement_GenParametres(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenParametre.equalsIgnoreCase(localName)){
            startElement_GenParametre(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenStereotypesRef.equalsIgnoreCase(localName)){
            startElement_GenStereotypesRef(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenStereotypeRef.equalsIgnoreCase(localName)){
            startElement_GenStereotypeRef(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenAssociations.equalsIgnoreCase(localName)){
            startElement_GenAssociations(namespaceURI, localName, qName, atts);
        }
        if (GenXmlNoeud.N_GenAssociation.equalsIgnoreCase(localName)){
            startElement_GenAssociation(namespaceURI, localName, qName, atts);
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
        }
        enCours.setGenClasse( genClasse );
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
            if(GenXmlNoeud.N_GenAttribut_A_NombreMinimum.equalsIgnoreCase(attName)) {
            	genAttribut.setNombreMinimumAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenAttribut_A_NombreMaximum.equalsIgnoreCase(attName)) {
            	genAttribut.setNombreMaximumAsString(atts.getValue(i));
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
        }
        enCours.setGenAttribut( genAttribut );
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
        }
        enCours.setGenMethode( genMethode );
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
        }
        enCours.setGenParametre( genParametre );
    }
    
    public void startElement_GenStereotypesRef(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenStereotypesRef genStereotypesRef = new GenStereotypesRefBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGenStereotypesRef( genStereotypesRef );
    }
    
    public void startElement_GenStereotypeRef(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenStereotypeRef genStereotypeRef = new GenStereotypeRefBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_GenStereotypeRef_A_StereotypeNom.equalsIgnoreCase(attName)) {
            	genStereotypeRef.setStereotypeNomAsString(atts.getValue(i));
            }
        }
        enCours.setGenStereotypeRef( genStereotypeRef );
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
            if(GenXmlNoeud.N_GenAssociation_A_NomJavaChamp.equalsIgnoreCase(attName)) {
            	genAssociation.setNomJavaChampAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenAssociation_A_ClasseGenId.equalsIgnoreCase(attName)) {
            	genAssociation.setClasseGenIdAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenAssociation_A_NombreMinimum.equalsIgnoreCase(attName)) {
            	genAssociation.setNombreMinimumAsString(atts.getValue(i));
            }
            if(GenXmlNoeud.N_GenAssociation_A_NombreMaximum.equalsIgnoreCase(attName)) {
            	genAssociation.setNombreMaximumAsString(atts.getValue(i));
            }
        }
        enCours.setGenAssociation( genAssociation );
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
        //String strValue = new String(ch, start, length);
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
        if (GenXmlNoeud.N_GenAttributs.equalsIgnoreCase(localName)){
            endElement_GenAttributs(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenAttribut.equalsIgnoreCase(localName)){
            endElement_GenAttribut(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenMethodes.equalsIgnoreCase(localName)){
            endElement_GenMethodes(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenMethode.equalsIgnoreCase(localName)){
            endElement_GenMethode(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenParametres.equalsIgnoreCase(localName)){
            endElement_GenParametres(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenParametre.equalsIgnoreCase(localName)){
            endElement_GenParametre(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenStereotypesRef.equalsIgnoreCase(localName)){
            endElement_GenStereotypesRef(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenStereotypeRef.equalsIgnoreCase(localName)){
            endElement_GenStereotypeRef(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenAssociations.equalsIgnoreCase(localName)){
            endElement_GenAssociations(namespaceURI, localName, qName);
        }
        if (GenXmlNoeud.N_GenAssociation.equalsIgnoreCase(localName)){
            endElement_GenAssociation(namespaceURI, localName, qName);
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
    
    public void endElement_GenAttributs(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenClasse().setGenAttributs(enCours.getGenAttributs());
    }
    
    public void endElement_GenAttribut(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenAttributs().addGenAttribut(enCours.getGenAttribut());
    }
    
    public void endElement_GenMethodes(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenClasse().setGenMethodes(enCours.getGenMethodes());
    }
    
    public void endElement_GenMethode(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenMethodes().addGenMethode(enCours.getGenMethode());
    }
    
    public void endElement_GenParametres(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenMethode().setGenParametres(enCours.getGenParametres());
    }
    
    public void endElement_GenParametre(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenParametres().addGenParametre(enCours.getGenParametre());
    }
    
    public void endElement_GenStereotypesRef(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenClasse().setGenStereotypesRef(enCours.getGenStereotypesRef());
    }
    
    public void endElement_GenStereotypeRef(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenStereotypesRef().addGenStereotypeRef(enCours.getGenStereotypeRef());
    }
    
    public void endElement_GenAssociations(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenClasse().setGenAssociations(enCours.getGenAssociations());
    }
    
    public void endElement_GenAssociation(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGenAssociations().addGenAssociation(enCours.getGenAssociation());
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
