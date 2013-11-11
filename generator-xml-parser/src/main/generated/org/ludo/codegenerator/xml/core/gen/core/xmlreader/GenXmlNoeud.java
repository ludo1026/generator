package org.ludo.codegenerator.xml.core.gen.core.xmlreader;

public interface GenXmlNoeud {
    
    // description des champs 
    public final String N_Gen = "gen";
    public final String N_GenTemplates = "templates";
    public final String N_GenTemplates_A_InDir = "inDir";
    public final String N_GenTemplates_A_OutDir = "outDir";
    public final String N_GenTemplates_A_PackageJavaBase = "packageJavaBase";
    public final String N_GenTemplate = "template";
    public final String N_GenTemplate_A_Nom = "nom";
    public final String N_GenTemplate_A_File = "file";
    public final String N_GenTemplate_A_OutDir = "outDir";
    public final String N_GenTemplate_A_OutFile = "outFile";
    public final String N_GenTemplate_A_PackageJava = "packageJava";
    public final String N_GenTemplate_A_NomElementGenere = "nomElementGenere";
    public final String N_GenTemplateGroupes = "templateGroupes";
    public final String N_GenTemplateGroupe = "templateGroupe";
    public final String N_GenTemplateGroupe_A_Nom = "nom";
    public final String N_GenTemplateRef = "templateRef";
    public final String N_GenTemplateRef_A_Nom = "nom";
    public final String N_GenStereotypes = "stereotypes";
    public final String N_GenStereotype = "stereotype";
    public final String N_GenStereotype_A_Nom = "nom";
    public final String N_GenClasses = "classes";
    public final String N_GenClasses_A_PackageBase = "packageBase";
    public final String N_GenClasse = "classe";
    public final String N_GenClasse_A_GenId = "genId";
    public final String N_GenClasse_A_NomJava = "nomJava";
    public final String N_GenClasse_A_PackageJava = "packageJava";
    public final String N_GenClasse_A_NomTable = "nomTable";
    public final String N_GenClasse_A_NomVue = "nomVue";
    public final String N_GenClasse_A_Description = "description";
    public final String N_GenProprieteClasses = "proprieteClasses";
    public final String N_GenProprieteClasse = "proprieteClasse";
    public final String N_GenProprieteClasse_A_Nom = "nom";
    public final String N_GenProprieteClasse_A_Valeur = "valeur";
    public final String N_GenAttributs = "attributs";
    public final String N_GenAttribut = "attribut";
    public final String N_GenAttribut_A_GenId = "genId";
    public final String N_GenAttribut_A_NomJava = "nomJava";
    public final String N_GenAttribut_A_Type = "type";
    public final String N_GenAttribut_A_NbMin = "nbMin";
    public final String N_GenAttribut_A_NbMax = "nbMax";
    public final String N_GenAttribut_A_NomSQL = "nomSQL";
    public final String N_GenAttribut_A_TypeSQL = "typeSQL";
    public final String N_GenAttribut_A_EstDansTable = "estDansTable";
    public final String N_GenAttribut_A_Size = "size";
    public final String N_GenAttribut_A_EstClePrimaire = "estClePrimaire";
    public final String N_GenAttribut_A_EstCleIncrementee = "estCleIncrementee";
    public final String N_GenAttribut_A_Description = "description";
    public final String N_GenProprieteAttributs = "proprieteAttributs";
    public final String N_GenProprieteAttribut = "proprieteAttribut";
    public final String N_GenProprieteAttribut_A_Nom = "nom";
    public final String N_GenProprieteAttribut_A_Valeur = "valeur";
    public final String N_GenStereotypeAttributs = "stereotypeAttributs";
    public final String N_GenStereotypeAttribut = "stereotypeAttribut";
    public final String N_GenStereotypeAttribut_A_Nom = "nom";
    public final String N_GenMethodes = "methodes";
    public final String N_GenMethode = "methode";
    public final String N_GenMethode_A_GenId = "genId";
    public final String N_GenMethode_A_NomJava = "nomJava";
    public final String N_GenMethode_A_RetourType = "retourType";
    public final String N_GenMethode_A_Description = "description";
    public final String N_GenProprieteMethodes = "proprieteMethodes";
    public final String N_GenProprieteMethode = "proprieteMethode";
    public final String N_GenProprieteMethode_A_Nom = "nom";
    public final String N_GenProprieteMethode_A_Valeur = "valeur";
    public final String N_GenParametres = "parametres";
    public final String N_GenParametre = "parametre";
    public final String N_GenParametre_A_GenId = "genId";
    public final String N_GenParametre_A_NomJava = "nomJava";
    public final String N_GenParametre_A_Type = "type";
    public final String N_GenParametre_A_Description = "description";
    public final String N_GenStereotypeMethodes = "stereotypeMethodes";
    public final String N_GenStereotypeMethode = "stereotypeMethode";
    public final String N_GenStereotypeMethode_A_Nom = "nom";
    public final String N_GenStereotypeClasses = "stereotypeClasses";
    public final String N_GenStereotypeClasse = "stereotypeClasse";
    public final String N_GenStereotypeClasse_A_Nom = "nom";
    public final String N_GenAssociations = "associations";
    public final String N_GenAssociation = "association";
    public final String N_GenAssociation_A_GenId = "genId";
    public final String N_GenAssociation_A_NomJava = "nomJava";
    public final String N_GenAssociation_A_ClasseGenId = "classeGenId";
    public final String N_GenAssociation_A_NbMin = "nbMin";
    public final String N_GenAssociation_A_NbMax = "nbMax";
    public final String N_GenAssociation_A_Description = "description";
    public final String N_GenAssociationAttributs = "associationAttributs";
    public final String N_GenAssociationAttribut = "associationAttribut";
    public final String N_GenAssociationAttribut_A_GenId = "genId";
    public final String N_GenClasseDeAssociation = "classeDeAssociation";
    public final String N_GenClasseDeAssociation_A__type = "_type";
    public final String N_GenClasseParents = "classeParents";
    public final String N_GenClasseParent = "classeParent";
    public final String N_GenClasseParent_A_ClasseGenId = "classeGenId";
    public final String N_GenGenererGroupe = "genererGroupe";
    public final String N_GenGenererParClasses = "genererParClasses";
    public final String N_GenGenererParClasse = "genererParClasse";
    public final String N_GenClasseRefPourGenererParClasses = "classeRefPourGenererParClasses";
    public final String N_GenClasseRefPourGenererParClasse = "classeRefPourGenererParClasse";
    public final String N_GenClasseRefPourGenererParClasse_A_ClasseGenId = "classeGenId";
    public final String N_GenTemplateGroupeRefPourGenererParClasses = "templateGroupeRefPourGenererParClasses";
    public final String N_GenTemplateGroupeRefPourGenererParClasse = "templateGroupeRefPourGenererParClasse";
    public final String N_GenTemplateGroupeRefPourGenererParClasse_A_TemplateGroupeNom = "templateGroupeNom";
    public final String N_GenGenererParTemplates = "genererParTemplates";
    public final String N_GenGenererParTemplate = "genererParTemplate";
    public final String N_GenTemplateGroupeRefPourGenererParTemplates = "templateGroupeRefPourGenererParTemplates";
    public final String N_GenTemplateGroupeRefPourGenererParTemplate = "templateGroupeRefPourGenererParTemplate";
    public final String N_GenTemplateGroupeRefPourGenererParTemplate_A_TemplateGroupeNom = "templateGroupeNom";
    public final String N_GenStereotypeRefPourGenererParTemplates = "stereotypeRefPourGenererParTemplates";
    public final String N_GenStereotypeRefPourGenererParTemplate = "stereotypeRefPourGenererParTemplate";
    public final String N_GenStereotypeRefPourGenererParTemplate_A_StereotypeNom = "stereotypeNom";
    public final String N_GenGenererParStereotypes = "genererParStereotypes";
    public final String N_GenGenererParStereotype = "genererParStereotype";
    public final String N_GenStereotypeRefPourGenererParStereotypes = "stereotypeRefPourGenererParStereotypes";
    public final String N_GenStereotypeRefPourGenererParStereotype = "stereotypeRefPourGenererParStereotype";
    public final String N_GenStereotypeRefPourGenererParStereotype_A_StereotypeNom = "stereotypeNom";
    public final String N_GenTemplateGroupeRefPourGenererParStereotypes = "templateGroupeRefPourGenererParStereotypes";
    public final String N_GenTemplateGroupeRefPourGenererParStereotype = "templateGroupeRefPourGenererParStereotype";
    public final String N_GenTemplateGroupeRefPourGenererParStereotype_A_TemplateGroupeNom = "templateGroupeNom";
	    
}
