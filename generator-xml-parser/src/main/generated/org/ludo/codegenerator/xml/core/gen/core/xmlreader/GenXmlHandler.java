package org.ludo.codegenerator.xml.core.gen.core.xmlreader;

import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenTemplatesBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenTemplateBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenTemplateGroupesBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenTemplateGroupeBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenTemplateGroupeTemplateBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenStereotypesBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenStereotypeBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenClassesBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenClasseBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenClasseProprieteBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenClasseAttributBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenClasseAttributProprieteBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenClasseAttributStereotypeBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenClasseMethodeBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenClasseMethodeProprieteBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenClasseMethodeParametreBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenClasseMethodeStereotypeBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenClasseStereotypeBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenClasseAssociationBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenClasseAssociationAttributBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenClasseAssociationClasseDeAssociationBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenClasseParentBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenGenerateBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenGenerateByClasseBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenGenerateByClasseTemplateGroupeBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenGenerateByTemplateGroupeBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenGenerateByTemplateGroupeStereotypeBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenGenerateByStereotypeBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenGenerateByStereotypeTemplateGroupeBean;

import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplates;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupe;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasses;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClassePropriete;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseAttributPropriete;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseAttributStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseMethode;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseMethodePropriete;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseMethodeParametre;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseMethodeStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseAssociation;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseAssociationAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseAssociationClasseDeAssociation;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseParent;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenerate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenerateByClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenerateByClasseTemplateGroupe;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenerateByTemplateGroupe;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenerateByTemplateGroupeStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenerateByStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenerateByStereotypeTemplateGroupe;

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
        private GenTemplateGroupeTemplate Gen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateGroupeTemplate = null;
        private GenStereotypes Gen_GenStereotypes = null;
        private GenStereotype Gen_GenStereotypes_GenStereotype = null;
        private GenClasses Gen_GenClasses = null;
        private GenClasse Gen_GenClasses_GenClasse = null;
        private GenClassePropriete Gen_GenClasses_GenClasse_GenClassePropriete = null;
        private GenClasseAttribut Gen_GenClasses_GenClasse_GenClasseAttribut = null;
        private GenClasseAttributPropriete Gen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributPropriete = null;
        private GenClasseAttributStereotype Gen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributStereotype = null;
        private GenClasseMethode Gen_GenClasses_GenClasse_GenClasseMethode = null;
        private GenClasseMethodePropriete Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodePropriete = null;
        private GenClasseMethodeParametre Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeParametre = null;
        private GenClasseMethodeStereotype Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeStereotype = null;
        private GenClasseStereotype Gen_GenClasses_GenClasse_GenClasseStereotype = null;
        private GenClasseAssociation Gen_GenClasses_GenClasse_GenClasseAssociation = null;
        private GenClasseAssociationAttribut Gen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationAttribut = null;
        private GenClasseAssociationClasseDeAssociation Gen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationClasseDeAssociation = null;
        private GenClasseParent Gen_GenClasses_GenClasse_GenClasseParent = null;
        private GenGenerate Gen_GenGenerate = null;
        private GenGenerateByClasse Gen_GenGenerate_GenGenerateByClasse = null;
        private GenGenerateByClasseTemplateGroupe Gen_GenGenerate_GenGenerateByClasse_GenGenerateByClasseTemplateGroupe = null;
        private GenGenerateByTemplateGroupe Gen_GenGenerate_GenGenerateByTemplateGroupe = null;
        private GenGenerateByTemplateGroupeStereotype Gen_GenGenerate_GenGenerateByTemplateGroupe_GenGenerateByTemplateGroupeStereotype = null;
        private GenGenerateByStereotype Gen_GenGenerate_GenGenerateByStereotype = null;
        private GenGenerateByStereotypeTemplateGroupe Gen_GenGenerate_GenGenerateByStereotype_GenGenerateByStereotypeTemplateGroupe = null;
        
        public int posCompteur = 0;
        public int posGen = 0;
        public int posGen_GenTemplates = 0;
        public int posGen_GenTemplates_GenTemplate = 0;
        public int posGen_GenTemplateGroupes = 0;
        public int posGen_GenTemplateGroupes_GenTemplateGroupe = 0;
        public int posGen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateGroupeTemplate = 0;
        public int posGen_GenStereotypes = 0;
        public int posGen_GenStereotypes_GenStereotype = 0;
        public int posGen_GenClasses = 0;
        public int posGen_GenClasses_GenClasse = 0;
        public int posGen_GenClasses_GenClasse_GenClassePropriete = 0;
        public int posGen_GenClasses_GenClasse_GenClasseAttribut = 0;
        public int posGen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributPropriete = 0;
        public int posGen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributStereotype = 0;
        public int posGen_GenClasses_GenClasse_GenClasseMethode = 0;
        public int posGen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodePropriete = 0;
        public int posGen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeParametre = 0;
        public int posGen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeStereotype = 0;
        public int posGen_GenClasses_GenClasse_GenClasseStereotype = 0;
        public int posGen_GenClasses_GenClasse_GenClasseAssociation = 0;
        public int posGen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationAttribut = 0;
        public int posGen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationClasseDeAssociation = 0;
        public int posGen_GenClasses_GenClasse_GenClasseParent = 0;
        public int posGen_GenGenerate = 0;
        public int posGen_GenGenerate_GenGenerateByClasse = 0;
        public int posGen_GenGenerate_GenGenerateByClasse_GenGenerateByClasseTemplateGroupe = 0;
        public int posGen_GenGenerate_GenGenerateByTemplateGroupe = 0;
        public int posGen_GenGenerate_GenGenerateByTemplateGroupe_GenGenerateByTemplateGroupeStereotype = 0;
        public int posGen_GenGenerate_GenGenerateByStereotype = 0;
        public int posGen_GenGenerate_GenGenerateByStereotype_GenGenerateByStereotypeTemplateGroupe = 0;

        public void definePosGen() { posGen = ++ posCompteur; }
        public void definePosGen_GenTemplates() { posGen_GenTemplates = ++ posCompteur; }
        public void definePosGen_GenTemplates_GenTemplate() { posGen_GenTemplates_GenTemplate = ++ posCompteur; }
        public void definePosGen_GenTemplateGroupes() { posGen_GenTemplateGroupes = ++ posCompteur; }
        public void definePosGen_GenTemplateGroupes_GenTemplateGroupe() { posGen_GenTemplateGroupes_GenTemplateGroupe = ++ posCompteur; }
        public void definePosGen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateGroupeTemplate() { posGen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateGroupeTemplate = ++ posCompteur; }
        public void definePosGen_GenStereotypes() { posGen_GenStereotypes = ++ posCompteur; }
        public void definePosGen_GenStereotypes_GenStereotype() { posGen_GenStereotypes_GenStereotype = ++ posCompteur; }
        public void definePosGen_GenClasses() { posGen_GenClasses = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse() { posGen_GenClasses_GenClasse = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse_GenClassePropriete() { posGen_GenClasses_GenClasse_GenClassePropriete = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse_GenClasseAttribut() { posGen_GenClasses_GenClasse_GenClasseAttribut = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributPropriete() { posGen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributPropriete = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributStereotype() { posGen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributStereotype = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse_GenClasseMethode() { posGen_GenClasses_GenClasse_GenClasseMethode = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodePropriete() { posGen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodePropriete = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeParametre() { posGen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeParametre = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeStereotype() { posGen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeStereotype = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse_GenClasseStereotype() { posGen_GenClasses_GenClasse_GenClasseStereotype = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse_GenClasseAssociation() { posGen_GenClasses_GenClasse_GenClasseAssociation = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationAttribut() { posGen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationAttribut = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationClasseDeAssociation() { posGen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationClasseDeAssociation = ++ posCompteur; }
        public void definePosGen_GenClasses_GenClasse_GenClasseParent() { posGen_GenClasses_GenClasse_GenClasseParent = ++ posCompteur; }
        public void definePosGen_GenGenerate() { posGen_GenGenerate = ++ posCompteur; }
        public void definePosGen_GenGenerate_GenGenerateByClasse() { posGen_GenGenerate_GenGenerateByClasse = ++ posCompteur; }
        public void definePosGen_GenGenerate_GenGenerateByClasse_GenGenerateByClasseTemplateGroupe() { posGen_GenGenerate_GenGenerateByClasse_GenGenerateByClasseTemplateGroupe = ++ posCompteur; }
        public void definePosGen_GenGenerate_GenGenerateByTemplateGroupe() { posGen_GenGenerate_GenGenerateByTemplateGroupe = ++ posCompteur; }
        public void definePosGen_GenGenerate_GenGenerateByTemplateGroupe_GenGenerateByTemplateGroupeStereotype() { posGen_GenGenerate_GenGenerateByTemplateGroupe_GenGenerateByTemplateGroupeStereotype = ++ posCompteur; }
        public void definePosGen_GenGenerate_GenGenerateByStereotype() { posGen_GenGenerate_GenGenerateByStereotype = ++ posCompteur; }
        public void definePosGen_GenGenerate_GenGenerateByStereotype_GenGenerateByStereotypeTemplateGroupe() { posGen_GenGenerate_GenGenerateByStereotype_GenGenerateByStereotypeTemplateGroupe = ++ posCompteur; }

        public int getPosGen() { return posGen; }
        public int getPosGen_GenTemplates() { return posGen_GenTemplates; }
        public int getPosGen_GenTemplates_GenTemplate() { return posGen_GenTemplates_GenTemplate; }
        public int getPosGen_GenTemplateGroupes() { return posGen_GenTemplateGroupes; }
        public int getPosGen_GenTemplateGroupes_GenTemplateGroupe() { return posGen_GenTemplateGroupes_GenTemplateGroupe; }
        public int getPosGen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateGroupeTemplate() { return posGen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateGroupeTemplate; }
        public int getPosGen_GenStereotypes() { return posGen_GenStereotypes; }
        public int getPosGen_GenStereotypes_GenStereotype() { return posGen_GenStereotypes_GenStereotype; }
        public int getPosGen_GenClasses() { return posGen_GenClasses; }
        public int getPosGen_GenClasses_GenClasse() { return posGen_GenClasses_GenClasse; }
        public int getPosGen_GenClasses_GenClasse_GenClassePropriete() { return posGen_GenClasses_GenClasse_GenClassePropriete; }
        public int getPosGen_GenClasses_GenClasse_GenClasseAttribut() { return posGen_GenClasses_GenClasse_GenClasseAttribut; }
        public int getPosGen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributPropriete() { return posGen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributPropriete; }
        public int getPosGen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributStereotype() { return posGen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributStereotype; }
        public int getPosGen_GenClasses_GenClasse_GenClasseMethode() { return posGen_GenClasses_GenClasse_GenClasseMethode; }
        public int getPosGen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodePropriete() { return posGen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodePropriete; }
        public int getPosGen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeParametre() { return posGen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeParametre; }
        public int getPosGen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeStereotype() { return posGen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeStereotype; }
        public int getPosGen_GenClasses_GenClasse_GenClasseStereotype() { return posGen_GenClasses_GenClasse_GenClasseStereotype; }
        public int getPosGen_GenClasses_GenClasse_GenClasseAssociation() { return posGen_GenClasses_GenClasse_GenClasseAssociation; }
        public int getPosGen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationAttribut() { return posGen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationAttribut; }
        public int getPosGen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationClasseDeAssociation() { return posGen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationClasseDeAssociation; }
        public int getPosGen_GenClasses_GenClasse_GenClasseParent() { return posGen_GenClasses_GenClasse_GenClasseParent; }
        public int getPosGen_GenGenerate() { return posGen_GenGenerate; }
        public int getPosGen_GenGenerate_GenGenerateByClasse() { return posGen_GenGenerate_GenGenerateByClasse; }
        public int getPosGen_GenGenerate_GenGenerateByClasse_GenGenerateByClasseTemplateGroupe() { return posGen_GenGenerate_GenGenerateByClasse_GenGenerateByClasseTemplateGroupe; }
        public int getPosGen_GenGenerate_GenGenerateByTemplateGroupe() { return posGen_GenGenerate_GenGenerateByTemplateGroupe; }
        public int getPosGen_GenGenerate_GenGenerateByTemplateGroupe_GenGenerateByTemplateGroupeStereotype() { return posGen_GenGenerate_GenGenerateByTemplateGroupe_GenGenerateByTemplateGroupeStereotype; }
        public int getPosGen_GenGenerate_GenGenerateByStereotype() { return posGen_GenGenerate_GenGenerateByStereotype; }
        public int getPosGen_GenGenerate_GenGenerateByStereotype_GenGenerateByStereotypeTemplateGroupe() { return posGen_GenGenerate_GenGenerateByStereotype_GenGenerateByStereotypeTemplateGroupe; }
        
		public final Gen getGen() { return Gen; }
		public final GenTemplates getGen_GenTemplates() { return Gen_GenTemplates; }
		public final GenTemplate getGen_GenTemplates_GenTemplate() { return Gen_GenTemplates_GenTemplate; }
		public final GenTemplateGroupes getGen_GenTemplateGroupes() { return Gen_GenTemplateGroupes; }
		public final GenTemplateGroupe getGen_GenTemplateGroupes_GenTemplateGroupe() { return Gen_GenTemplateGroupes_GenTemplateGroupe; }
		public final GenTemplateGroupeTemplate getGen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateGroupeTemplate() { return Gen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateGroupeTemplate; }
		public final GenStereotypes getGen_GenStereotypes() { return Gen_GenStereotypes; }
		public final GenStereotype getGen_GenStereotypes_GenStereotype() { return Gen_GenStereotypes_GenStereotype; }
		public final GenClasses getGen_GenClasses() { return Gen_GenClasses; }
		public final GenClasse getGen_GenClasses_GenClasse() { return Gen_GenClasses_GenClasse; }
		public final GenClassePropriete getGen_GenClasses_GenClasse_GenClassePropriete() { return Gen_GenClasses_GenClasse_GenClassePropriete; }
		public final GenClasseAttribut getGen_GenClasses_GenClasse_GenClasseAttribut() { return Gen_GenClasses_GenClasse_GenClasseAttribut; }
		public final GenClasseAttributPropriete getGen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributPropriete() { return Gen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributPropriete; }
		public final GenClasseAttributStereotype getGen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributStereotype() { return Gen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributStereotype; }
		public final GenClasseMethode getGen_GenClasses_GenClasse_GenClasseMethode() { return Gen_GenClasses_GenClasse_GenClasseMethode; }
		public final GenClasseMethodePropriete getGen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodePropriete() { return Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodePropriete; }
		public final GenClasseMethodeParametre getGen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeParametre() { return Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeParametre; }
		public final GenClasseMethodeStereotype getGen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeStereotype() { return Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeStereotype; }
		public final GenClasseStereotype getGen_GenClasses_GenClasse_GenClasseStereotype() { return Gen_GenClasses_GenClasse_GenClasseStereotype; }
		public final GenClasseAssociation getGen_GenClasses_GenClasse_GenClasseAssociation() { return Gen_GenClasses_GenClasse_GenClasseAssociation; }
		public final GenClasseAssociationAttribut getGen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationAttribut() { return Gen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationAttribut; }
		public final GenClasseAssociationClasseDeAssociation getGen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationClasseDeAssociation() { return Gen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationClasseDeAssociation; }
		public final GenClasseParent getGen_GenClasses_GenClasse_GenClasseParent() { return Gen_GenClasses_GenClasse_GenClasseParent; }
		public final GenGenerate getGen_GenGenerate() { return Gen_GenGenerate; }
		public final GenGenerateByClasse getGen_GenGenerate_GenGenerateByClasse() { return Gen_GenGenerate_GenGenerateByClasse; }
		public final GenGenerateByClasseTemplateGroupe getGen_GenGenerate_GenGenerateByClasse_GenGenerateByClasseTemplateGroupe() { return Gen_GenGenerate_GenGenerateByClasse_GenGenerateByClasseTemplateGroupe; }
		public final GenGenerateByTemplateGroupe getGen_GenGenerate_GenGenerateByTemplateGroupe() { return Gen_GenGenerate_GenGenerateByTemplateGroupe; }
		public final GenGenerateByTemplateGroupeStereotype getGen_GenGenerate_GenGenerateByTemplateGroupe_GenGenerateByTemplateGroupeStereotype() { return Gen_GenGenerate_GenGenerateByTemplateGroupe_GenGenerateByTemplateGroupeStereotype; }
		public final GenGenerateByStereotype getGen_GenGenerate_GenGenerateByStereotype() { return Gen_GenGenerate_GenGenerateByStereotype; }
		public final GenGenerateByStereotypeTemplateGroupe getGen_GenGenerate_GenGenerateByStereotype_GenGenerateByStereotypeTemplateGroupe() { return Gen_GenGenerate_GenGenerateByStereotype_GenGenerateByStereotypeTemplateGroupe; }
		
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
		public final void setGen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateGroupeTemplate(GenTemplateGroupeTemplate Gen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateGroupeTemplate) {
			this.definePosGen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateGroupeTemplate();
			this.Gen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateGroupeTemplate = Gen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateGroupeTemplate;
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
		public final void setGen_GenClasses_GenClasse_GenClassePropriete(GenClassePropriete Gen_GenClasses_GenClasse_GenClassePropriete) {
			this.definePosGen_GenClasses_GenClasse_GenClassePropriete();
			this.Gen_GenClasses_GenClasse_GenClassePropriete = Gen_GenClasses_GenClasse_GenClassePropriete;
		}
		public final void setGen_GenClasses_GenClasse_GenClasseAttribut(GenClasseAttribut Gen_GenClasses_GenClasse_GenClasseAttribut) {
			this.definePosGen_GenClasses_GenClasse_GenClasseAttribut();
			this.Gen_GenClasses_GenClasse_GenClasseAttribut = Gen_GenClasses_GenClasse_GenClasseAttribut;
		}
		public final void setGen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributPropriete(GenClasseAttributPropriete Gen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributPropriete) {
			this.definePosGen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributPropriete();
			this.Gen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributPropriete = Gen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributPropriete;
		}
		public final void setGen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributStereotype(GenClasseAttributStereotype Gen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributStereotype) {
			this.definePosGen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributStereotype();
			this.Gen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributStereotype = Gen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributStereotype;
		}
		public final void setGen_GenClasses_GenClasse_GenClasseMethode(GenClasseMethode Gen_GenClasses_GenClasse_GenClasseMethode) {
			this.definePosGen_GenClasses_GenClasse_GenClasseMethode();
			this.Gen_GenClasses_GenClasse_GenClasseMethode = Gen_GenClasses_GenClasse_GenClasseMethode;
		}
		public final void setGen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodePropriete(GenClasseMethodePropriete Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodePropriete) {
			this.definePosGen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodePropriete();
			this.Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodePropriete = Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodePropriete;
		}
		public final void setGen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeParametre(GenClasseMethodeParametre Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeParametre) {
			this.definePosGen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeParametre();
			this.Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeParametre = Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeParametre;
		}
		public final void setGen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeStereotype(GenClasseMethodeStereotype Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeStereotype) {
			this.definePosGen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeStereotype();
			this.Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeStereotype = Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeStereotype;
		}
		public final void setGen_GenClasses_GenClasse_GenClasseStereotype(GenClasseStereotype Gen_GenClasses_GenClasse_GenClasseStereotype) {
			this.definePosGen_GenClasses_GenClasse_GenClasseStereotype();
			this.Gen_GenClasses_GenClasse_GenClasseStereotype = Gen_GenClasses_GenClasse_GenClasseStereotype;
		}
		public final void setGen_GenClasses_GenClasse_GenClasseAssociation(GenClasseAssociation Gen_GenClasses_GenClasse_GenClasseAssociation) {
			this.definePosGen_GenClasses_GenClasse_GenClasseAssociation();
			this.Gen_GenClasses_GenClasse_GenClasseAssociation = Gen_GenClasses_GenClasse_GenClasseAssociation;
		}
		public final void setGen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationAttribut(GenClasseAssociationAttribut Gen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationAttribut) {
			this.definePosGen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationAttribut();
			this.Gen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationAttribut = Gen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationAttribut;
		}
		public final void setGen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationClasseDeAssociation(GenClasseAssociationClasseDeAssociation Gen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationClasseDeAssociation) {
			this.definePosGen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationClasseDeAssociation();
			this.Gen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationClasseDeAssociation = Gen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationClasseDeAssociation;
		}
		public final void setGen_GenClasses_GenClasse_GenClasseParent(GenClasseParent Gen_GenClasses_GenClasse_GenClasseParent) {
			this.definePosGen_GenClasses_GenClasse_GenClasseParent();
			this.Gen_GenClasses_GenClasse_GenClasseParent = Gen_GenClasses_GenClasse_GenClasseParent;
		}
		public final void setGen_GenGenerate(GenGenerate Gen_GenGenerate) {
			this.definePosGen_GenGenerate();
			this.Gen_GenGenerate = Gen_GenGenerate;
		}
		public final void setGen_GenGenerate_GenGenerateByClasse(GenGenerateByClasse Gen_GenGenerate_GenGenerateByClasse) {
			this.definePosGen_GenGenerate_GenGenerateByClasse();
			this.Gen_GenGenerate_GenGenerateByClasse = Gen_GenGenerate_GenGenerateByClasse;
		}
		public final void setGen_GenGenerate_GenGenerateByClasse_GenGenerateByClasseTemplateGroupe(GenGenerateByClasseTemplateGroupe Gen_GenGenerate_GenGenerateByClasse_GenGenerateByClasseTemplateGroupe) {
			this.definePosGen_GenGenerate_GenGenerateByClasse_GenGenerateByClasseTemplateGroupe();
			this.Gen_GenGenerate_GenGenerateByClasse_GenGenerateByClasseTemplateGroupe = Gen_GenGenerate_GenGenerateByClasse_GenGenerateByClasseTemplateGroupe;
		}
		public final void setGen_GenGenerate_GenGenerateByTemplateGroupe(GenGenerateByTemplateGroupe Gen_GenGenerate_GenGenerateByTemplateGroupe) {
			this.definePosGen_GenGenerate_GenGenerateByTemplateGroupe();
			this.Gen_GenGenerate_GenGenerateByTemplateGroupe = Gen_GenGenerate_GenGenerateByTemplateGroupe;
		}
		public final void setGen_GenGenerate_GenGenerateByTemplateGroupe_GenGenerateByTemplateGroupeStereotype(GenGenerateByTemplateGroupeStereotype Gen_GenGenerate_GenGenerateByTemplateGroupe_GenGenerateByTemplateGroupeStereotype) {
			this.definePosGen_GenGenerate_GenGenerateByTemplateGroupe_GenGenerateByTemplateGroupeStereotype();
			this.Gen_GenGenerate_GenGenerateByTemplateGroupe_GenGenerateByTemplateGroupeStereotype = Gen_GenGenerate_GenGenerateByTemplateGroupe_GenGenerateByTemplateGroupeStereotype;
		}
		public final void setGen_GenGenerate_GenGenerateByStereotype(GenGenerateByStereotype Gen_GenGenerate_GenGenerateByStereotype) {
			this.definePosGen_GenGenerate_GenGenerateByStereotype();
			this.Gen_GenGenerate_GenGenerateByStereotype = Gen_GenGenerate_GenGenerateByStereotype;
		}
		public final void setGen_GenGenerate_GenGenerateByStereotype_GenGenerateByStereotypeTemplateGroupe(GenGenerateByStereotypeTemplateGroupe Gen_GenGenerate_GenGenerateByStereotype_GenGenerateByStereotypeTemplateGroupe) {
			this.definePosGen_GenGenerate_GenGenerateByStereotype_GenGenerateByStereotypeTemplateGroupe();
			this.Gen_GenGenerate_GenGenerateByStereotype_GenGenerateByStereotypeTemplateGroupe = Gen_GenGenerate_GenGenerateByStereotype_GenGenerateByStereotypeTemplateGroupe;
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
        if (enCours.getGen_GenGenerate_GenGenerateByStereotype() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenerateByStereotype_GenGenerateByStereotypeTemplateGroupe.equalsIgnoreCase(localName)){
            startElement_Gen_GenGenerate_GenGenerateByStereotype_GenGenerateByStereotypeTemplateGroupe(namespaceURI, localName, qName, atts);
            return;
        }
        if (enCours.getGen_GenGenerate() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenerateByStereotype.equalsIgnoreCase(localName)){
            startElement_Gen_GenGenerate_GenGenerateByStereotype(namespaceURI, localName, qName, atts);
            return;
        }
        if (enCours.getGen_GenGenerate_GenGenerateByTemplateGroupe() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenerateByTemplateGroupe_GenGenerateByTemplateGroupeStereotype.equalsIgnoreCase(localName)){
            startElement_Gen_GenGenerate_GenGenerateByTemplateGroupe_GenGenerateByTemplateGroupeStereotype(namespaceURI, localName, qName, atts);
            return;
        }
        if (enCours.getGen_GenGenerate() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenerateByTemplateGroupe.equalsIgnoreCase(localName)){
            startElement_Gen_GenGenerate_GenGenerateByTemplateGroupe(namespaceURI, localName, qName, atts);
            return;
        }
        if (enCours.getGen_GenGenerate_GenGenerateByClasse() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenerateByClasse_GenGenerateByClasseTemplateGroupe.equalsIgnoreCase(localName)){
            startElement_Gen_GenGenerate_GenGenerateByClasse_GenGenerateByClasseTemplateGroupe(namespaceURI, localName, qName, atts);
            return;
        }
        if (enCours.getGen_GenGenerate() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenerateByClasse.equalsIgnoreCase(localName)){
            startElement_Gen_GenGenerate_GenGenerateByClasse(namespaceURI, localName, qName, atts);
            return;
        }
        if (enCours.getGen() != null
         && GenXmlNoeud.N_Gen_GenGenerate.equalsIgnoreCase(localName)){
            startElement_Gen_GenGenerate(namespaceURI, localName, qName, atts);
            return;
        }
        if (enCours.getGen_GenClasses_GenClasse() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseParent.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse_GenClasseParent(namespaceURI, localName, qName, atts);
            return;
        }
        if (enCours.getGen_GenClasses_GenClasse_GenClasseAssociation() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationClasseDeAssociation.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationClasseDeAssociation(namespaceURI, localName, qName, atts);
            return;
        }
        if (enCours.getGen_GenClasses_GenClasse_GenClasseAssociation() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationAttribut.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationAttribut(namespaceURI, localName, qName, atts);
            return;
        }
        if (enCours.getGen_GenClasses_GenClasse() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAssociation.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse_GenClasseAssociation(namespaceURI, localName, qName, atts);
            return;
        }
        if (enCours.getGen_GenClasses_GenClasse() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseStereotype.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse_GenClasseStereotype(namespaceURI, localName, qName, atts);
            return;
        }
        if (enCours.getGen_GenClasses_GenClasse_GenClasseMethode() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeStereotype.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeStereotype(namespaceURI, localName, qName, atts);
            return;
        }
        if (enCours.getGen_GenClasses_GenClasse_GenClasseMethode() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeParametre.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeParametre(namespaceURI, localName, qName, atts);
            return;
        }
        if (enCours.getGen_GenClasses_GenClasse_GenClasseMethode() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodePropriete.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodePropriete(namespaceURI, localName, qName, atts);
            return;
        }
        if (enCours.getGen_GenClasses_GenClasse() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseMethode.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse_GenClasseMethode(namespaceURI, localName, qName, atts);
            return;
        }
        if (enCours.getGen_GenClasses_GenClasse_GenClasseAttribut() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributStereotype.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributStereotype(namespaceURI, localName, qName, atts);
            return;
        }
        if (enCours.getGen_GenClasses_GenClasse_GenClasseAttribut() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributPropriete.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributPropriete(namespaceURI, localName, qName, atts);
            return;
        }
        if (enCours.getGen_GenClasses_GenClasse() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse_GenClasseAttribut(namespaceURI, localName, qName, atts);
            return;
        }
        if (enCours.getGen_GenClasses_GenClasse() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClassePropriete.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse_GenClassePropriete(namespaceURI, localName, qName, atts);
            return;
        }
        if (enCours.getGen_GenClasses() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses_GenClasse(namespaceURI, localName, qName, atts);
            return;
        }
        if (enCours.getGen() != null
         && GenXmlNoeud.N_Gen_GenClasses.equalsIgnoreCase(localName)){
            startElement_Gen_GenClasses(namespaceURI, localName, qName, atts);
            return;
        }
        if (enCours.getGen_GenStereotypes() != null
         && GenXmlNoeud.N_Gen_GenStereotypes_GenStereotype.equalsIgnoreCase(localName)){
            startElement_Gen_GenStereotypes_GenStereotype(namespaceURI, localName, qName, atts);
            return;
        }
        if (enCours.getGen() != null
         && GenXmlNoeud.N_Gen_GenStereotypes.equalsIgnoreCase(localName)){
            startElement_Gen_GenStereotypes(namespaceURI, localName, qName, atts);
            return;
        }
        if (enCours.getGen_GenTemplateGroupes_GenTemplateGroupe() != null
         && GenXmlNoeud.N_Gen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateGroupeTemplate.equalsIgnoreCase(localName)){
            startElement_Gen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateGroupeTemplate(namespaceURI, localName, qName, atts);
            return;
        }
        if (enCours.getGen_GenTemplateGroupes() != null
         && GenXmlNoeud.N_Gen_GenTemplateGroupes_GenTemplateGroupe.equalsIgnoreCase(localName)){
            startElement_Gen_GenTemplateGroupes_GenTemplateGroupe(namespaceURI, localName, qName, atts);
            return;
        }
        if (enCours.getGen() != null
         && GenXmlNoeud.N_Gen_GenTemplateGroupes.equalsIgnoreCase(localName)){
            startElement_Gen_GenTemplateGroupes(namespaceURI, localName, qName, atts);
            return;
        }
        if (enCours.getGen_GenTemplates() != null
         && GenXmlNoeud.N_Gen_GenTemplates_GenTemplate.equalsIgnoreCase(localName)){
            startElement_Gen_GenTemplates_GenTemplate(namespaceURI, localName, qName, atts);
            return;
        }
        if (enCours.getGen() != null
         && GenXmlNoeud.N_Gen_GenTemplates.equalsIgnoreCase(localName)){
            startElement_Gen_GenTemplates(namespaceURI, localName, qName, atts);
            return;
        }
        if (GenXmlNoeud.N_Gen.equalsIgnoreCase(localName)){
            startElement_Gen(namespaceURI, localName, qName, atts);
            return;
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
            	genTemplates.setInDir(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenTemplates_A_OutDir.equalsIgnoreCase(attName)) {
            	genTemplates.setOutDir(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenTemplates_A_PackageJavaBase.equalsIgnoreCase(attName)) {
            	genTemplates.setPackageJavaBase(atts.getValue(i));
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
            	genTemplate.setNom(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenTemplates_GenTemplate_A_File.equalsIgnoreCase(attName)) {
            	genTemplate.setFile(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenTemplates_GenTemplate_A_OutDir.equalsIgnoreCase(attName)) {
            	genTemplate.setOutDir(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenTemplates_GenTemplate_A_OutFile.equalsIgnoreCase(attName)) {
            	genTemplate.setOutFile(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenTemplates_GenTemplate_A_PackageJava.equalsIgnoreCase(attName)) {
            	genTemplate.setPackageJava(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenTemplates_GenTemplate_A_NomElementGenere.equalsIgnoreCase(attName)) {
            	genTemplate.setNomElementGenere(atts.getValue(i));
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
            	genTemplateGroupe.setNom(atts.getValue(i));
            }
        }
        enCours.setGen_GenTemplateGroupes_GenTemplateGroupe( genTemplateGroupe );
    }
    
    public void startElement_Gen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateGroupeTemplate(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenTemplateGroupeTemplate genTemplateGroupeTemplate = new GenTemplateGroupeTemplateBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateGroupeTemplate_A_Nom.equalsIgnoreCase(attName)) {
            	genTemplateGroupeTemplate.setNom(atts.getValue(i));
            }
        }
        enCours.setGen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateGroupeTemplate( genTemplateGroupeTemplate );
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
            	genStereotype.setNom(atts.getValue(i));
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
            	genClasses.setPackageBase(atts.getValue(i));
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
            	genClasse.setGenId(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_A_NomJava.equalsIgnoreCase(attName)) {
            	genClasse.setNomJava(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_A_PackageJava.equalsIgnoreCase(attName)) {
            	genClasse.setPackageJava(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_A_NomTable.equalsIgnoreCase(attName)) {
            	genClasse.setNomTable(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_A_NomVue.equalsIgnoreCase(attName)) {
            	genClasse.setNomVue(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_A_Description.equalsIgnoreCase(attName)) {
            	genClasse.setDescription(atts.getValue(i));
            }
        }
        enCours.setGen_GenClasses_GenClasse( genClasse );
    }
    
    public void startElement_Gen_GenClasses_GenClasse_GenClassePropriete(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenClassePropriete genClassePropriete = new GenClasseProprieteBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClassePropriete_A_Nom.equalsIgnoreCase(attName)) {
            	genClassePropriete.setNom(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClassePropriete_A_Valeur.equalsIgnoreCase(attName)) {
            	genClassePropriete.setValeur(atts.getValue(i));
            }
        }
        enCours.setGen_GenClasses_GenClasse_GenClassePropriete( genClassePropriete );
    }
    
    public void startElement_Gen_GenClasses_GenClasse_GenClasseAttribut(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenClasseAttribut genClasseAttribut = new GenClasseAttributBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_GenId.equalsIgnoreCase(attName)) {
            	genClasseAttribut.setGenId(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_NomJava.equalsIgnoreCase(attName)) {
            	genClasseAttribut.setNomJava(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_Type.equalsIgnoreCase(attName)) {
            	genClasseAttribut.setType(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_NbMin.equalsIgnoreCase(attName)) {
            	genClasseAttribut.setNbMin(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_NbMax.equalsIgnoreCase(attName)) {
            	genClasseAttribut.setNbMax(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_NomSQL.equalsIgnoreCase(attName)) {
            	genClasseAttribut.setNomSQL(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_TypeSQL.equalsIgnoreCase(attName)) {
            	genClasseAttribut.setTypeSQL(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_EstDansTable.equalsIgnoreCase(attName)) {
            	genClasseAttribut.setEstDansTable(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_Size.equalsIgnoreCase(attName)) {
            	genClasseAttribut.setSize(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_EstClePrimaire.equalsIgnoreCase(attName)) {
            	genClasseAttribut.setEstClePrimaire(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_EstCleIncrementee.equalsIgnoreCase(attName)) {
            	genClasseAttribut.setEstCleIncrementee(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_AssociationId.equalsIgnoreCase(attName)) {
            	genClasseAttribut.setAssociationId(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_Description.equalsIgnoreCase(attName)) {
            	genClasseAttribut.setDescription(atts.getValue(i));
            }
        }
        enCours.setGen_GenClasses_GenClasse_GenClasseAttribut( genClasseAttribut );
    }
    
    public void startElement_Gen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributPropriete(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenClasseAttributPropriete genClasseAttributPropriete = new GenClasseAttributProprieteBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributPropriete_A_Nom.equalsIgnoreCase(attName)) {
            	genClasseAttributPropriete.setNom(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributPropriete_A_Valeur.equalsIgnoreCase(attName)) {
            	genClasseAttributPropriete.setValeur(atts.getValue(i));
            }
        }
        enCours.setGen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributPropriete( genClasseAttributPropriete );
    }
    
    public void startElement_Gen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributStereotype(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenClasseAttributStereotype genClasseAttributStereotype = new GenClasseAttributStereotypeBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributStereotype_A_Nom.equalsIgnoreCase(attName)) {
            	genClasseAttributStereotype.setNom(atts.getValue(i));
            }
        }
        enCours.setGen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributStereotype( genClasseAttributStereotype );
    }
    
    public void startElement_Gen_GenClasses_GenClasse_GenClasseMethode(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenClasseMethode genClasseMethode = new GenClasseMethodeBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseMethode_A_GenId.equalsIgnoreCase(attName)) {
            	genClasseMethode.setGenId(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseMethode_A_NomJava.equalsIgnoreCase(attName)) {
            	genClasseMethode.setNomJava(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseMethode_A_RetourType.equalsIgnoreCase(attName)) {
            	genClasseMethode.setRetourType(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseMethode_A_Description.equalsIgnoreCase(attName)) {
            	genClasseMethode.setDescription(atts.getValue(i));
            }
        }
        enCours.setGen_GenClasses_GenClasse_GenClasseMethode( genClasseMethode );
    }
    
    public void startElement_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodePropriete(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenClasseMethodePropriete genClasseMethodePropriete = new GenClasseMethodeProprieteBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodePropriete_A_Nom.equalsIgnoreCase(attName)) {
            	genClasseMethodePropriete.setNom(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodePropriete_A_Valeur.equalsIgnoreCase(attName)) {
            	genClasseMethodePropriete.setValeur(atts.getValue(i));
            }
        }
        enCours.setGen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodePropriete( genClasseMethodePropriete );
    }
    
    public void startElement_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeParametre(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenClasseMethodeParametre genClasseMethodeParametre = new GenClasseMethodeParametreBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeParametre_A_GenId.equalsIgnoreCase(attName)) {
            	genClasseMethodeParametre.setGenId(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeParametre_A_NomJava.equalsIgnoreCase(attName)) {
            	genClasseMethodeParametre.setNomJava(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeParametre_A_Type.equalsIgnoreCase(attName)) {
            	genClasseMethodeParametre.setType(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeParametre_A_Description.equalsIgnoreCase(attName)) {
            	genClasseMethodeParametre.setDescription(atts.getValue(i));
            }
        }
        enCours.setGen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeParametre( genClasseMethodeParametre );
    }
    
    public void startElement_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeStereotype(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenClasseMethodeStereotype genClasseMethodeStereotype = new GenClasseMethodeStereotypeBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeStereotype_A_Nom.equalsIgnoreCase(attName)) {
            	genClasseMethodeStereotype.setNom(atts.getValue(i));
            }
        }
        enCours.setGen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeStereotype( genClasseMethodeStereotype );
    }
    
    public void startElement_Gen_GenClasses_GenClasse_GenClasseStereotype(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenClasseStereotype genClasseStereotype = new GenClasseStereotypeBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseStereotype_A_Nom.equalsIgnoreCase(attName)) {
            	genClasseStereotype.setNom(atts.getValue(i));
            }
        }
        enCours.setGen_GenClasses_GenClasse_GenClasseStereotype( genClasseStereotype );
    }
    
    public void startElement_Gen_GenClasses_GenClasse_GenClasseAssociation(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenClasseAssociation genClasseAssociation = new GenClasseAssociationBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAssociation_A_GenId.equalsIgnoreCase(attName)) {
            	genClasseAssociation.setGenId(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAssociation_A_NomJava.equalsIgnoreCase(attName)) {
            	genClasseAssociation.setNomJava(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAssociation_A_ClasseGenId.equalsIgnoreCase(attName)) {
            	genClasseAssociation.setClasseGenId(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAssociation_A_NbMin.equalsIgnoreCase(attName)) {
            	genClasseAssociation.setNbMin(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAssociation_A_NbMax.equalsIgnoreCase(attName)) {
            	genClasseAssociation.setNbMax(atts.getValue(i));
            }
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAssociation_A_Description.equalsIgnoreCase(attName)) {
            	genClasseAssociation.setDescription(atts.getValue(i));
            }
        }
        enCours.setGen_GenClasses_GenClasse_GenClasseAssociation( genClasseAssociation );
    }
    
    public void startElement_Gen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationAttribut(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenClasseAssociationAttribut genClasseAssociationAttribut = new GenClasseAssociationAttributBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationAttribut_A_GenId.equalsIgnoreCase(attName)) {
            	genClasseAssociationAttribut.setGenId(atts.getValue(i));
            }
        }
        enCours.setGen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationAttribut( genClasseAssociationAttribut );
    }
    
    public void startElement_Gen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationClasseDeAssociation(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenClasseAssociationClasseDeAssociation genClasseAssociationClasseDeAssociation = new GenClasseAssociationClasseDeAssociationBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationClasseDeAssociation_A__type.equalsIgnoreCase(attName)) {
            	genClasseAssociationClasseDeAssociation.set_type(atts.getValue(i));
            }
        }
        enCours.setGen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationClasseDeAssociation( genClasseAssociationClasseDeAssociation );
    }
    
    public void startElement_Gen_GenClasses_GenClasse_GenClasseParent(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenClasseParent genClasseParent = new GenClasseParentBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseParent_A_ClasseGenId.equalsIgnoreCase(attName)) {
            	genClasseParent.setClasseGenId(atts.getValue(i));
            }
        }
        enCours.setGen_GenClasses_GenClasse_GenClasseParent( genClasseParent );
    }
    
    public void startElement_Gen_GenGenerate(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenGenerate genGenerate = new GenGenerateBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
        }
        enCours.setGen_GenGenerate( genGenerate );
    }
    
    public void startElement_Gen_GenGenerate_GenGenerateByClasse(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenGenerateByClasse genGenerateByClasse = new GenGenerateByClasseBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenGenerate_GenGenerateByClasse_A_ClasseGenId.equalsIgnoreCase(attName)) {
            	genGenerateByClasse.setClasseGenId(atts.getValue(i));
            }
        }
        enCours.setGen_GenGenerate_GenGenerateByClasse( genGenerateByClasse );
    }
    
    public void startElement_Gen_GenGenerate_GenGenerateByClasse_GenGenerateByClasseTemplateGroupe(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenGenerateByClasseTemplateGroupe genGenerateByClasseTemplateGroupe = new GenGenerateByClasseTemplateGroupeBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenGenerate_GenGenerateByClasse_GenGenerateByClasseTemplateGroupe_A_TemplateGroupe.equalsIgnoreCase(attName)) {
            	genGenerateByClasseTemplateGroupe.setTemplateGroupe(atts.getValue(i));
            }
        }
        enCours.setGen_GenGenerate_GenGenerateByClasse_GenGenerateByClasseTemplateGroupe( genGenerateByClasseTemplateGroupe );
    }
    
    public void startElement_Gen_GenGenerate_GenGenerateByTemplateGroupe(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenGenerateByTemplateGroupe genGenerateByTemplateGroupe = new GenGenerateByTemplateGroupeBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenGenerate_GenGenerateByTemplateGroupe_A_TemplateGroupe.equalsIgnoreCase(attName)) {
            	genGenerateByTemplateGroupe.setTemplateGroupe(atts.getValue(i));
            }
        }
        enCours.setGen_GenGenerate_GenGenerateByTemplateGroupe( genGenerateByTemplateGroupe );
    }
    
    public void startElement_Gen_GenGenerate_GenGenerateByTemplateGroupe_GenGenerateByTemplateGroupeStereotype(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenGenerateByTemplateGroupeStereotype genGenerateByTemplateGroupeStereotype = new GenGenerateByTemplateGroupeStereotypeBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenGenerate_GenGenerateByTemplateGroupe_GenGenerateByTemplateGroupeStereotype_A_Stereotype.equalsIgnoreCase(attName)) {
            	genGenerateByTemplateGroupeStereotype.setStereotype(atts.getValue(i));
            }
        }
        enCours.setGen_GenGenerate_GenGenerateByTemplateGroupe_GenGenerateByTemplateGroupeStereotype( genGenerateByTemplateGroupeStereotype );
    }
    
    public void startElement_Gen_GenGenerate_GenGenerateByStereotype(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenGenerateByStereotype genGenerateByStereotype = new GenGenerateByStereotypeBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenGenerate_GenGenerateByStereotype_A_Stereotype.equalsIgnoreCase(attName)) {
            	genGenerateByStereotype.setStereotype(atts.getValue(i));
            }
        }
        enCours.setGen_GenGenerate_GenGenerateByStereotype( genGenerateByStereotype );
    }
    
    public void startElement_Gen_GenGenerate_GenGenerateByStereotype_GenGenerateByStereotypeTemplateGroupe(String namespaceURI, String localName, String qName, Attributes atts)
    throws SAXException {
    	GenGenerateByStereotypeTemplateGroupe genGenerateByStereotypeTemplateGroupe = new GenGenerateByStereotypeTemplateGroupeBean();
        for(int i=0; i<atts.getLength(); i++) {
            String attName = atts.getQName(i);
            if(GenXmlNoeud.N_Gen_GenGenerate_GenGenerateByStereotype_GenGenerateByStereotypeTemplateGroupe_A_TemplateGroupe.equalsIgnoreCase(attName)) {
            	genGenerateByStereotypeTemplateGroupe.setTemplateGroupe(atts.getValue(i));
            }
        }
        enCours.setGen_GenGenerate_GenGenerateByStereotype_GenGenerateByStereotypeTemplateGroupe( genGenerateByStereotypeTemplateGroupe );
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
        if (enCours.getGen_GenGenerate_GenGenerateByStereotype_GenGenerateByStereotypeTemplateGroupe() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenerateByStereotype_GenGenerateByStereotypeTemplateGroupe.equalsIgnoreCase(localName)){
            endElement_Gen_GenGenerate_GenGenerateByStereotype_GenGenerateByStereotypeTemplateGroupe(namespaceURI, localName, qName);
            return;
        }
        if (enCours.getGen_GenGenerate_GenGenerateByStereotype() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenerateByStereotype.equalsIgnoreCase(localName)){
            endElement_Gen_GenGenerate_GenGenerateByStereotype(namespaceURI, localName, qName);
            return;
        }
        if (enCours.getGen_GenGenerate_GenGenerateByTemplateGroupe_GenGenerateByTemplateGroupeStereotype() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenerateByTemplateGroupe_GenGenerateByTemplateGroupeStereotype.equalsIgnoreCase(localName)){
            endElement_Gen_GenGenerate_GenGenerateByTemplateGroupe_GenGenerateByTemplateGroupeStereotype(namespaceURI, localName, qName);
            return;
        }
        if (enCours.getGen_GenGenerate_GenGenerateByTemplateGroupe() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenerateByTemplateGroupe.equalsIgnoreCase(localName)){
            endElement_Gen_GenGenerate_GenGenerateByTemplateGroupe(namespaceURI, localName, qName);
            return;
        }
        if (enCours.getGen_GenGenerate_GenGenerateByClasse_GenGenerateByClasseTemplateGroupe() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenerateByClasse_GenGenerateByClasseTemplateGroupe.equalsIgnoreCase(localName)){
            endElement_Gen_GenGenerate_GenGenerateByClasse_GenGenerateByClasseTemplateGroupe(namespaceURI, localName, qName);
            return;
        }
        if (enCours.getGen_GenGenerate_GenGenerateByClasse() != null
         && GenXmlNoeud.N_Gen_GenGenerate_GenGenerateByClasse.equalsIgnoreCase(localName)){
            endElement_Gen_GenGenerate_GenGenerateByClasse(namespaceURI, localName, qName);
            return;
        }
        if (enCours.getGen_GenGenerate() != null
         && GenXmlNoeud.N_Gen_GenGenerate.equalsIgnoreCase(localName)){
            endElement_Gen_GenGenerate(namespaceURI, localName, qName);
            return;
        }
        if (enCours.getGen_GenClasses_GenClasse_GenClasseParent() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseParent.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse_GenClasseParent(namespaceURI, localName, qName);
            return;
        }
        if (enCours.getGen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationClasseDeAssociation() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationClasseDeAssociation.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationClasseDeAssociation(namespaceURI, localName, qName);
            return;
        }
        if (enCours.getGen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationAttribut() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationAttribut.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationAttribut(namespaceURI, localName, qName);
            return;
        }
        if (enCours.getGen_GenClasses_GenClasse_GenClasseAssociation() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAssociation.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse_GenClasseAssociation(namespaceURI, localName, qName);
            return;
        }
        if (enCours.getGen_GenClasses_GenClasse_GenClasseStereotype() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseStereotype.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse_GenClasseStereotype(namespaceURI, localName, qName);
            return;
        }
        if (enCours.getGen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeStereotype() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeStereotype.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeStereotype(namespaceURI, localName, qName);
            return;
        }
        if (enCours.getGen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeParametre() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeParametre.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeParametre(namespaceURI, localName, qName);
            return;
        }
        if (enCours.getGen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodePropriete() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodePropriete.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodePropriete(namespaceURI, localName, qName);
            return;
        }
        if (enCours.getGen_GenClasses_GenClasse_GenClasseMethode() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseMethode.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse_GenClasseMethode(namespaceURI, localName, qName);
            return;
        }
        if (enCours.getGen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributStereotype() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributStereotype.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributStereotype(namespaceURI, localName, qName);
            return;
        }
        if (enCours.getGen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributPropriete() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributPropriete.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributPropriete(namespaceURI, localName, qName);
            return;
        }
        if (enCours.getGen_GenClasses_GenClasse_GenClasseAttribut() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse_GenClasseAttribut(namespaceURI, localName, qName);
            return;
        }
        if (enCours.getGen_GenClasses_GenClasse_GenClassePropriete() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClassePropriete.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse_GenClassePropriete(namespaceURI, localName, qName);
            return;
        }
        if (enCours.getGen_GenClasses_GenClasse() != null
         && GenXmlNoeud.N_Gen_GenClasses_GenClasse.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses_GenClasse(namespaceURI, localName, qName);
            return;
        }
        if (enCours.getGen_GenClasses() != null
         && GenXmlNoeud.N_Gen_GenClasses.equalsIgnoreCase(localName)){
            endElement_Gen_GenClasses(namespaceURI, localName, qName);
            return;
        }
        if (enCours.getGen_GenStereotypes_GenStereotype() != null
         && GenXmlNoeud.N_Gen_GenStereotypes_GenStereotype.equalsIgnoreCase(localName)){
            endElement_Gen_GenStereotypes_GenStereotype(namespaceURI, localName, qName);
            return;
        }
        if (enCours.getGen_GenStereotypes() != null
         && GenXmlNoeud.N_Gen_GenStereotypes.equalsIgnoreCase(localName)){
            endElement_Gen_GenStereotypes(namespaceURI, localName, qName);
            return;
        }
        if (enCours.getGen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateGroupeTemplate() != null
         && GenXmlNoeud.N_Gen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateGroupeTemplate.equalsIgnoreCase(localName)){
            endElement_Gen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateGroupeTemplate(namespaceURI, localName, qName);
            return;
        }
        if (enCours.getGen_GenTemplateGroupes_GenTemplateGroupe() != null
         && GenXmlNoeud.N_Gen_GenTemplateGroupes_GenTemplateGroupe.equalsIgnoreCase(localName)){
            endElement_Gen_GenTemplateGroupes_GenTemplateGroupe(namespaceURI, localName, qName);
            return;
        }
        if (enCours.getGen_GenTemplateGroupes() != null
         && GenXmlNoeud.N_Gen_GenTemplateGroupes.equalsIgnoreCase(localName)){
            endElement_Gen_GenTemplateGroupes(namespaceURI, localName, qName);
            return;
        }
        if (enCours.getGen_GenTemplates_GenTemplate() != null
         && GenXmlNoeud.N_Gen_GenTemplates_GenTemplate.equalsIgnoreCase(localName)){
            endElement_Gen_GenTemplates_GenTemplate(namespaceURI, localName, qName);
            return;
        }
        if (enCours.getGen_GenTemplates() != null
         && GenXmlNoeud.N_Gen_GenTemplates.equalsIgnoreCase(localName)){
            endElement_Gen_GenTemplates(namespaceURI, localName, qName);
            return;
        }
        if (enCours.getGen() != null
         && GenXmlNoeud.N_Gen.equalsIgnoreCase(localName)){
            endElement_Gen(namespaceURI, localName, qName);
            return;
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
    
    public void endElement_Gen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateGroupeTemplate(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenTemplateGroupes_GenTemplateGroupe() == null) {
    		enCours.setGen_GenTemplateGroupes_GenTemplateGroupe(new GenTemplateGroupeBean());
    	}
    	enCours.getGen_GenTemplateGroupes_GenTemplateGroupe().addGenTemplateGroupeTemplate(enCours.getGen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateGroupeTemplate());
    	enCours.setGen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateGroupeTemplate(null);
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
    
    public void endElement_Gen_GenClasses_GenClasse_GenClassePropriete(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenClasses_GenClasse() == null) {
    		enCours.setGen_GenClasses_GenClasse(new GenClasseBean());
    	}
    	enCours.getGen_GenClasses_GenClasse().addGenClassePropriete(enCours.getGen_GenClasses_GenClasse_GenClassePropriete());
    	enCours.setGen_GenClasses_GenClasse_GenClassePropriete(null);
    }
    
    public void endElement_Gen_GenClasses_GenClasse_GenClasseAttribut(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenClasses_GenClasse() == null) {
    		enCours.setGen_GenClasses_GenClasse(new GenClasseBean());
    	}
    	enCours.getGen_GenClasses_GenClasse().addGenClasseAttribut(enCours.getGen_GenClasses_GenClasse_GenClasseAttribut());
    	enCours.setGen_GenClasses_GenClasse_GenClasseAttribut(null);
    }
    
    public void endElement_Gen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributPropriete(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenClasses_GenClasse_GenClasseAttribut() == null) {
    		enCours.setGen_GenClasses_GenClasse_GenClasseAttribut(new GenClasseAttributBean());
    	}
    	enCours.getGen_GenClasses_GenClasse_GenClasseAttribut().addGenClasseAttributPropriete(enCours.getGen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributPropriete());
    	enCours.setGen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributPropriete(null);
    }
    
    public void endElement_Gen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributStereotype(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenClasses_GenClasse_GenClasseAttribut() == null) {
    		enCours.setGen_GenClasses_GenClasse_GenClasseAttribut(new GenClasseAttributBean());
    	}
    	enCours.getGen_GenClasses_GenClasse_GenClasseAttribut().addGenClasseAttributStereotype(enCours.getGen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributStereotype());
    	enCours.setGen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributStereotype(null);
    }
    
    public void endElement_Gen_GenClasses_GenClasse_GenClasseMethode(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenClasses_GenClasse() == null) {
    		enCours.setGen_GenClasses_GenClasse(new GenClasseBean());
    	}
    	enCours.getGen_GenClasses_GenClasse().addGenClasseMethode(enCours.getGen_GenClasses_GenClasse_GenClasseMethode());
    	enCours.setGen_GenClasses_GenClasse_GenClasseMethode(null);
    }
    
    public void endElement_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodePropriete(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenClasses_GenClasse_GenClasseMethode() == null) {
    		enCours.setGen_GenClasses_GenClasse_GenClasseMethode(new GenClasseMethodeBean());
    	}
    	enCours.getGen_GenClasses_GenClasse_GenClasseMethode().addGenClasseMethodePropriete(enCours.getGen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodePropriete());
    	enCours.setGen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodePropriete(null);
    }
    
    public void endElement_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeParametre(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenClasses_GenClasse_GenClasseMethode() == null) {
    		enCours.setGen_GenClasses_GenClasse_GenClasseMethode(new GenClasseMethodeBean());
    	}
    	enCours.getGen_GenClasses_GenClasse_GenClasseMethode().addGenClasseMethodeParametre(enCours.getGen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeParametre());
    	enCours.setGen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeParametre(null);
    }
    
    public void endElement_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeStereotype(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenClasses_GenClasse_GenClasseMethode() == null) {
    		enCours.setGen_GenClasses_GenClasse_GenClasseMethode(new GenClasseMethodeBean());
    	}
    	enCours.getGen_GenClasses_GenClasse_GenClasseMethode().addGenClasseMethodeStereotype(enCours.getGen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeStereotype());
    	enCours.setGen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeStereotype(null);
    }
    
    public void endElement_Gen_GenClasses_GenClasse_GenClasseStereotype(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenClasses_GenClasse() == null) {
    		enCours.setGen_GenClasses_GenClasse(new GenClasseBean());
    	}
    	enCours.getGen_GenClasses_GenClasse().addGenClasseStereotype(enCours.getGen_GenClasses_GenClasse_GenClasseStereotype());
    	enCours.setGen_GenClasses_GenClasse_GenClasseStereotype(null);
    }
    
    public void endElement_Gen_GenClasses_GenClasse_GenClasseAssociation(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenClasses_GenClasse() == null) {
    		enCours.setGen_GenClasses_GenClasse(new GenClasseBean());
    	}
    	enCours.getGen_GenClasses_GenClasse().addGenClasseAssociation(enCours.getGen_GenClasses_GenClasse_GenClasseAssociation());
    	enCours.setGen_GenClasses_GenClasse_GenClasseAssociation(null);
    }
    
    public void endElement_Gen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationAttribut(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenClasses_GenClasse_GenClasseAssociation() == null) {
    		enCours.setGen_GenClasses_GenClasse_GenClasseAssociation(new GenClasseAssociationBean());
    	}
    	enCours.getGen_GenClasses_GenClasse_GenClasseAssociation().addGenClasseAssociationAttribut(enCours.getGen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationAttribut());
    	enCours.setGen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationAttribut(null);
    }
    
    public void endElement_Gen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationClasseDeAssociation(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGen_GenClasses_GenClasse_GenClasseAssociation().setGenClasseAssociationClasseDeAssociation(enCours.getGen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationClasseDeAssociation());
    	enCours.setGen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationClasseDeAssociation(null);
    }
    
    public void endElement_Gen_GenClasses_GenClasse_GenClasseParent(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenClasses_GenClasse() == null) {
    		enCours.setGen_GenClasses_GenClasse(new GenClasseBean());
    	}
    	enCours.getGen_GenClasses_GenClasse().addGenClasseParent(enCours.getGen_GenClasses_GenClasse_GenClasseParent());
    	enCours.setGen_GenClasses_GenClasse_GenClasseParent(null);
    }
    
    public void endElement_Gen_GenGenerate(String namespaceURI, String localName, String qName)
    throws SAXException {
    	enCours.getGen().setGenGenerate(enCours.getGen_GenGenerate());
    	enCours.setGen_GenGenerate(null);
    }
    
    public void endElement_Gen_GenGenerate_GenGenerateByClasse(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenGenerate() == null) {
    		enCours.setGen_GenGenerate(new GenGenerateBean());
    	}
    	enCours.getGen_GenGenerate().addGenGenerateByClasse(enCours.getGen_GenGenerate_GenGenerateByClasse());
    	enCours.setGen_GenGenerate_GenGenerateByClasse(null);
    }
    
    public void endElement_Gen_GenGenerate_GenGenerateByClasse_GenGenerateByClasseTemplateGroupe(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenGenerate_GenGenerateByClasse() == null) {
    		enCours.setGen_GenGenerate_GenGenerateByClasse(new GenGenerateByClasseBean());
    	}
    	enCours.getGen_GenGenerate_GenGenerateByClasse().addGenGenerateByClasseTemplateGroupe(enCours.getGen_GenGenerate_GenGenerateByClasse_GenGenerateByClasseTemplateGroupe());
    	enCours.setGen_GenGenerate_GenGenerateByClasse_GenGenerateByClasseTemplateGroupe(null);
    }
    
    public void endElement_Gen_GenGenerate_GenGenerateByTemplateGroupe(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenGenerate() == null) {
    		enCours.setGen_GenGenerate(new GenGenerateBean());
    	}
    	enCours.getGen_GenGenerate().addGenGenerateByTemplateGroupe(enCours.getGen_GenGenerate_GenGenerateByTemplateGroupe());
    	enCours.setGen_GenGenerate_GenGenerateByTemplateGroupe(null);
    }
    
    public void endElement_Gen_GenGenerate_GenGenerateByTemplateGroupe_GenGenerateByTemplateGroupeStereotype(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenGenerate_GenGenerateByTemplateGroupe() == null) {
    		enCours.setGen_GenGenerate_GenGenerateByTemplateGroupe(new GenGenerateByTemplateGroupeBean());
    	}
    	enCours.getGen_GenGenerate_GenGenerateByTemplateGroupe().addGenGenerateByTemplateGroupeStereotype(enCours.getGen_GenGenerate_GenGenerateByTemplateGroupe_GenGenerateByTemplateGroupeStereotype());
    	enCours.setGen_GenGenerate_GenGenerateByTemplateGroupe_GenGenerateByTemplateGroupeStereotype(null);
    }
    
    public void endElement_Gen_GenGenerate_GenGenerateByStereotype(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenGenerate() == null) {
    		enCours.setGen_GenGenerate(new GenGenerateBean());
    	}
    	enCours.getGen_GenGenerate().addGenGenerateByStereotype(enCours.getGen_GenGenerate_GenGenerateByStereotype());
    	enCours.setGen_GenGenerate_GenGenerateByStereotype(null);
    }
    
    public void endElement_Gen_GenGenerate_GenGenerateByStereotype_GenGenerateByStereotypeTemplateGroupe(String namespaceURI, String localName, String qName)
    throws SAXException {
    	if(enCours.getGen_GenGenerate_GenGenerateByStereotype() == null) {
    		enCours.setGen_GenGenerate_GenGenerateByStereotype(new GenGenerateByStereotypeBean());
    	}
    	enCours.getGen_GenGenerate_GenGenerateByStereotype().addGenGenerateByStereotypeTemplateGroupe(enCours.getGen_GenGenerate_GenGenerateByStereotype_GenGenerateByStereotypeTemplateGroupe());
    	enCours.setGen_GenGenerate_GenGenerateByStereotype_GenGenerateByStereotypeTemplateGroupe(null);
    }
    
	    
}
