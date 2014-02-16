package org.ludo.codegenerator.xml.core.gen.core.xmlreader;

public interface GenXmlNoeud {
    
    // description des champs
    public final String N_Gen = "gen";

    public final String N_Gen_GenTemplates = "templates";
    public final String N_Gen_GenTemplates_A_InDir = "inDir";
    public final String N_Gen_GenTemplates_A_OutDir = "outDir";
    public final String N_Gen_GenTemplates_A_PackageJavaBase = "packageJavaBase";

    public final String N_Gen_GenTemplates_GenTemplate = "template";
    public final String N_Gen_GenTemplates_GenTemplate_A_Nom = "nom";
    public final String N_Gen_GenTemplates_GenTemplate_A_File = "file";
    public final String N_Gen_GenTemplates_GenTemplate_A_OutDir = "outDir";
    public final String N_Gen_GenTemplates_GenTemplate_A_OutFile = "outFile";
    public final String N_Gen_GenTemplates_GenTemplate_A_PackageJava = "packageJava";
    public final String N_Gen_GenTemplates_GenTemplate_A_NomElementGenere = "nomElementGenere";

    public final String N_Gen_GenTemplateGroupes = "templateGroupes";

    public final String N_Gen_GenTemplateGroupes_GenTemplateGroupe = "templateGroupe";
    public final String N_Gen_GenTemplateGroupes_GenTemplateGroupe_A_Nom = "nom";

    public final String N_Gen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateRef = "templateRef";
    public final String N_Gen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateRef_A_Nom = "nom";

    public final String N_Gen_GenStereotypes = "stereotypes";

    public final String N_Gen_GenStereotypes_GenStereotype = "stereotype";
    public final String N_Gen_GenStereotypes_GenStereotype_A_Nom = "nom";

    public final String N_Gen_GenClasses = "classes";
    public final String N_Gen_GenClasses_A_PackageBase = "packageBase";

    public final String N_Gen_GenClasses_GenClasse = "classe";
    public final String N_Gen_GenClasses_GenClasse_A_GenId = "genId";
    public final String N_Gen_GenClasses_GenClasse_A_NomJava = "nomJava";
    public final String N_Gen_GenClasses_GenClasse_A_PackageJava = "packageJava";
    public final String N_Gen_GenClasses_GenClasse_A_NomTable = "nomTable";
    public final String N_Gen_GenClasses_GenClasse_A_NomVue = "nomVue";
    public final String N_Gen_GenClasses_GenClasse_A_Description = "description";

    public final String N_Gen_GenClasses_GenClasse_GenProprieteClasses = "proprieteClasses";

    public final String N_Gen_GenClasses_GenClasse_GenProprieteClasses_GenProprieteClasse = "proprieteClasse";
    public final String N_Gen_GenClasses_GenClasse_GenProprieteClasses_GenProprieteClasse_A_Nom = "nom";
    public final String N_Gen_GenClasses_GenClasse_GenProprieteClasses_GenProprieteClasse_A_Valeur = "valeur";

    public final String N_Gen_GenClasses_GenClasse_GenAttributs = "attributs";

    public final String N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut = "attribut";
    public final String N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_A_GenId = "genId";
    public final String N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_A_NomJava = "nomJava";
    public final String N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_A_Type = "type";
    public final String N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_A_NbMin = "nbMin";
    public final String N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_A_NbMax = "nbMax";
    public final String N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_A_NomSQL = "nomSQL";
    public final String N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_A_TypeSQL = "typeSQL";
    public final String N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_A_EstDansTable = "estDansTable";
    public final String N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_A_Size = "size";
    public final String N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_A_EstClePrimaire = "estClePrimaire";
    public final String N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_A_EstCleIncrementee = "estCleIncrementee";
    public final String N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_A_AssociationId = "associationId";
    public final String N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_A_Description = "description";

    public final String N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs = "proprieteAttributs";

    public final String N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs_GenProprieteAttribut = "proprieteAttribut";
    public final String N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs_GenProprieteAttribut_A_Nom = "nom";
    public final String N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenProprieteAttributs_GenProprieteAttribut_A_Valeur = "valeur";

    public final String N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs = "stereotypeAttributs";

    public final String N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs_GenStereotypeAttribut = "stereotypeAttribut";
    public final String N_Gen_GenClasses_GenClasse_GenAttributs_GenAttribut_GenStereotypeAttributs_GenStereotypeAttribut_A_Nom = "nom";

    public final String N_Gen_GenClasses_GenClasse_GenMethodes = "methodes";

    public final String N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode = "methode";
    public final String N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_A_GenId = "genId";
    public final String N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_A_NomJava = "nomJava";
    public final String N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_A_RetourType = "retourType";
    public final String N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_A_Description = "description";

    public final String N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes = "proprieteMethodes";

    public final String N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes_GenProprieteMethode = "proprieteMethode";
    public final String N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes_GenProprieteMethode_A_Nom = "nom";
    public final String N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenProprieteMethodes_GenProprieteMethode_A_Valeur = "valeur";

    public final String N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres = "parametres";

    public final String N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres_GenParametre = "parametre";
    public final String N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres_GenParametre_A_GenId = "genId";
    public final String N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres_GenParametre_A_NomJava = "nomJava";
    public final String N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres_GenParametre_A_Type = "type";
    public final String N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenParametres_GenParametre_A_Description = "description";

    public final String N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes = "stereotypeMethodes";

    public final String N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes_GenStereotypeMethode = "stereotypeMethode";
    public final String N_Gen_GenClasses_GenClasse_GenMethodes_GenMethode_GenStereotypeMethodes_GenStereotypeMethode_A_Nom = "nom";

    public final String N_Gen_GenClasses_GenClasse_GenStereotypeClasses = "stereotypeClasses";

    public final String N_Gen_GenClasses_GenClasse_GenStereotypeClasses_GenStereotypeClasse = "stereotypeClasse";
    public final String N_Gen_GenClasses_GenClasse_GenStereotypeClasses_GenStereotypeClasse_A_Nom = "nom";

    public final String N_Gen_GenClasses_GenClasse_GenAssociations = "associations";

    public final String N_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation = "association";
    public final String N_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_A_GenId = "genId";
    public final String N_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_A_NomJava = "nomJava";
    public final String N_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_A_ClasseGenId = "classeGenId";
    public final String N_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_A_NbMin = "nbMin";
    public final String N_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_A_NbMax = "nbMax";
    public final String N_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_A_Description = "description";

    public final String N_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs = "associationAttributs";

    public final String N_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs_GenAssociationAttribut = "associationAttribut";
    public final String N_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenAssociationAttributs_GenAssociationAttribut_A_GenId = "genId";

    public final String N_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenClasseDeAssociation = "classeDeAssociation";
    public final String N_Gen_GenClasses_GenClasse_GenAssociations_GenAssociation_GenClasseDeAssociation_A__type = "_type";

    public final String N_Gen_GenClasses_GenClasse_GenClasseParents = "classeParents";

    public final String N_Gen_GenClasses_GenClasse_GenClasseParents_GenClasseParent = "classeParent";
    public final String N_Gen_GenClasses_GenClasse_GenClasseParents_GenClasseParent_A_ClasseGenId = "classeGenId";

    public final String N_Gen_GenGenerate = "generate";

    public final String N_Gen_GenGenerate_GenGenererParClasses = "genererParClasses";

    public final String N_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse = "genererParClasse";

    public final String N_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses = "classeRefPourGenererParClasses";

    public final String N_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses_GenClasseRefPourGenererParClasse = "classeRefPourGenererParClasse";
    public final String N_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenClasseRefPourGenererParClasses_GenClasseRefPourGenererParClasse_A_ClasseGenId = "classeGenId";

    public final String N_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses = "templateGroupeRefPourGenererParClasses";

    public final String N_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses_GenTemplateGroupeRefPourGenererParClasse = "templateGroupeRefPourGenererParClasse";
    public final String N_Gen_GenGenerate_GenGenererParClasses_GenGenererParClasse_GenTemplateGroupeRefPourGenererParClasses_GenTemplateGroupeRefPourGenererParClasse_A_TemplateGroupeNom = "templateGroupeNom";

    public final String N_Gen_GenGenerate_GenGenererParTemplates = "genererParTemplates";

    public final String N_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate = "genererParTemplate";

    public final String N_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates = "templateGroupeRefPourGenererParTemplates";

    public final String N_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate = "templateGroupeRefPourGenererParTemplate";
    public final String N_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_A_TemplateGroupeNom = "templateGroupeNom";

    public final String N_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates = "stereotypeRefPourGenererParTemplates";

    public final String N_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates_GenStereotypeRefPourGenererParTemplate = "stereotypeRefPourGenererParTemplate";
    public final String N_Gen_GenGenerate_GenGenererParTemplates_GenGenererParTemplate_GenTemplateGroupeRefPourGenererParTemplates_GenTemplateGroupeRefPourGenererParTemplate_GenStereotypeRefPourGenererParTemplates_GenStereotypeRefPourGenererParTemplate_A_StereotypeNom = "stereotypeNom";

    public final String N_Gen_GenGenerate_GenGenererParStereotypes = "genererParStereotypes";

    public final String N_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype = "genererParStereotype";

    public final String N_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes = "stereotypeRefPourGenererParStereotypes";

    public final String N_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype = "stereotypeRefPourGenererParStereotype";
    public final String N_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_A_StereotypeNom = "stereotypeNom";

    public final String N_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes = "templateGroupeRefPourGenererParStereotypes";

    public final String N_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes_GenTemplateGroupeRefPourGenererParStereotype = "templateGroupeRefPourGenererParStereotype";
    public final String N_Gen_GenGenerate_GenGenererParStereotypes_GenGenererParStereotype_GenStereotypeRefPourGenererParStereotypes_GenStereotypeRefPourGenererParStereotype_GenTemplateGroupeRefPourGenererParStereotypes_GenTemplateGroupeRefPourGenererParStereotype_A_TemplateGroupeNom = "templateGroupeNom";

	    
}
