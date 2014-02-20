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

    public final String N_Gen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateGroupeTemplate = "template";
    public final String N_Gen_GenTemplateGroupes_GenTemplateGroupe_GenTemplateGroupeTemplate_A_Nom = "nom";

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

    public final String N_Gen_GenClasses_GenClasse_GenClassePropriete = "propriete";
    public final String N_Gen_GenClasses_GenClasse_GenClassePropriete_A_Nom = "nom";
    public final String N_Gen_GenClasses_GenClasse_GenClassePropriete_A_Valeur = "valeur";

    public final String N_Gen_GenClasses_GenClasse_GenClasseAttribut = "attribut";
    public final String N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_GenId = "genId";
    public final String N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_NomJava = "nomJava";
    public final String N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_Type = "type";
    public final String N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_NbMin = "nbMin";
    public final String N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_NbMax = "nbMax";
    public final String N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_NomSQL = "nomSQL";
    public final String N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_TypeSQL = "typeSQL";
    public final String N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_EstDansTable = "estDansTable";
    public final String N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_Size = "size";
    public final String N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_EstClePrimaire = "estClePrimaire";
    public final String N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_EstCleIncrementee = "estCleIncrementee";
    public final String N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_AssociationId = "associationId";
    public final String N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_Description = "description";

    public final String N_Gen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributPropriete = "propriete";
    public final String N_Gen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributPropriete_A_Nom = "nom";
    public final String N_Gen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributPropriete_A_Valeur = "valeur";

    public final String N_Gen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributStereotype = "stereotype";
    public final String N_Gen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributStereotype_A_Nom = "nom";

    public final String N_Gen_GenClasses_GenClasse_GenClasseMethode = "methode";
    public final String N_Gen_GenClasses_GenClasse_GenClasseMethode_A_GenId = "genId";
    public final String N_Gen_GenClasses_GenClasse_GenClasseMethode_A_NomJava = "nomJava";
    public final String N_Gen_GenClasses_GenClasse_GenClasseMethode_A_RetourType = "retourType";
    public final String N_Gen_GenClasses_GenClasse_GenClasseMethode_A_Description = "description";

    public final String N_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodePropriete = "propriete";
    public final String N_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodePropriete_A_Nom = "nom";
    public final String N_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodePropriete_A_Valeur = "valeur";

    public final String N_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeParametre = "parametre";
    public final String N_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeParametre_A_GenId = "genId";
    public final String N_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeParametre_A_NomJava = "nomJava";
    public final String N_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeParametre_A_Type = "type";
    public final String N_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeParametre_A_Description = "description";

    public final String N_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeStereotype = "stereotype";
    public final String N_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeStereotype_A_Nom = "nom";

    public final String N_Gen_GenClasses_GenClasse_GenClasseStereotype = "stereotype";
    public final String N_Gen_GenClasses_GenClasse_GenClasseStereotype_A_Nom = "nom";

    public final String N_Gen_GenClasses_GenClasse_GenClasseAssociation = "association";
    public final String N_Gen_GenClasses_GenClasse_GenClasseAssociation_A_GenId = "genId";
    public final String N_Gen_GenClasses_GenClasse_GenClasseAssociation_A_NomJava = "nomJava";
    public final String N_Gen_GenClasses_GenClasse_GenClasseAssociation_A_ClasseGenId = "classeGenId";
    public final String N_Gen_GenClasses_GenClasse_GenClasseAssociation_A_NbMin = "nbMin";
    public final String N_Gen_GenClasses_GenClasse_GenClasseAssociation_A_NbMax = "nbMax";
    public final String N_Gen_GenClasses_GenClasse_GenClasseAssociation_A_Description = "description";

    public final String N_Gen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationAttribut = "attribut";
    public final String N_Gen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationAttribut_A_GenId = "genId";

    public final String N_Gen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationClasseDeAssociation = "classeDeAssociation";
    public final String N_Gen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationClasseDeAssociation_A__type = "_type";

    public final String N_Gen_GenClasses_GenClasse_GenClasseParent = "parent";
    public final String N_Gen_GenClasses_GenClasse_GenClasseParent_A_ClasseGenId = "classeGenId";

    public final String N_Gen_GenGenerate = "generate";

    public final String N_Gen_GenGenerate_GenGenerateByClasse = "byClasse";
    public final String N_Gen_GenGenerate_GenGenerateByClasse_A_ClasseGenId = "classeGenId";

    public final String N_Gen_GenGenerate_GenGenerateByClasse_GenGenerateByClasseTemplateGroupe = "templateGroupe";
    public final String N_Gen_GenGenerate_GenGenerateByClasse_GenGenerateByClasseTemplateGroupe_A_TemplateGroupe = "templateGroupe";

    public final String N_Gen_GenGenerate_GenGenerateByTemplateGroupe = "byTemplateGroupe";
    public final String N_Gen_GenGenerate_GenGenerateByTemplateGroupe_A_TemplateGroupe = "templateGroupe";

    public final String N_Gen_GenGenerate_GenGenerateByTemplateGroupe_GenGenerateByTemplateGroupeStereotype = "stereotype";
    public final String N_Gen_GenGenerate_GenGenerateByTemplateGroupe_GenGenerateByTemplateGroupeStereotype_A_Stereotype = "stereotype";

    public final String N_Gen_GenGenerate_GenGenerateByStereotype = "byStereotype";
    public final String N_Gen_GenGenerate_GenGenerateByStereotype_A_Stereotype = "stereotype";

    public final String N_Gen_GenGenerate_GenGenerateByStereotype_GenGenerateByStereotypeTemplateGroupe = "templateGroupe";
    public final String N_Gen_GenGenerate_GenGenerateByStereotype_GenGenerateByStereotypeTemplateGroupe_A_TemplateGroupe = "templateGroupe";

	    
}
