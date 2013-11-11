package com.bnpparibas.phenics.common.workflow.util;

/**
 * Attributs modifiable pour l'entite : IhmFacUtilisation.
 */
public enum AttributIhmFacUtilisationEnum {
	idFacilite("ID_FACILITE",Type.STRING),
	idSiSource("ID_SI_SOURCE",Type.BIGDECIMAL),
	mtIntCouruNonEchu("MT_INT_COURU_NON_ECHU",Type.BIGDECIMAL),
	mtUtil9mAvDefaut("MT_UTIL_9M_AV_DEFAUT",Type.BIGDECIMAL),
	idPhotoFacilite("ID_PHOTO_FACILITE",Type.STRING),
	idMotifModifAuto("ID_MOTIF_MODIF_AUTO",Type.BIGDECIMAL),
	mtUtil12mAvDefaut("MT_UTIL_12M_AV_DEFAUT",Type.BIGDECIMAL),
	mtUtil3mAvDefaut("MT_UTIL_3M_AV_DEFAUT",Type.BIGDECIMAL),
	indTiersCatadri("IND_TIERS_CATADRI",Type.STRING),
	idTypEnreg("ID_TYP_ENREG",Type.BIGDECIMAL),
	indBilan("IND_BILAN",Type.STRING),
	idPhotoUtilisation("ID_PHOTO_UTILISATION",Type.STRING),
	cdSiteRsk("CD_SITE_RSK",Type.STRING),
	cdDevise("CD_DEVISE",Type.STRING),
	cdSiteRskFacilite("CD_SITE_RSK_FACILITE",Type.STRING),
	cdSiteRskUtilisation("CD_SITE_RSK_UTILISATION",Type.STRING),
	indMigBdi("IND_MIG_BDI",Type.STRING),
	mtUtilAvDefaut("MT_UTIL_AV_DEFAUT",Type.BIGDECIMAL),
	blDelete("BL_DELETE",Type.BIGDECIMAL),
	idDossierDefaut("ID_DOSSIER_DEFAUT",Type.STRING),
	mtIntImpaye("MT_INT_IMPAYE",Type.BIGDECIMAL),
	idPhoto("ID_PHOTO",Type.STRING),
	idUtilisateurMaj("ID_UTILISATEUR_MAJ",Type.BIGDECIMAL),
	tsDelete("TS_DELETE",Type.DATE),
	mtUtil6mAvDefaut("MT_UTIL_6M_AV_DEFAUT",Type.BIGDECIMAL),
	coUtilisation("CO_UTILISATION",Type.STRING),
	dtArrete("DT_ARRETE",Type.DATE),
	idTechUtilisation("ID_TECH_UTILISATION",Type.BIGDECIMAL),
	mtUtilDefaut("MT_UTIL_DEFAUT",Type.BIGDECIMAL),
	dtUtilAvDefaut("DT_UTIL_AV_DEFAUT",Type.DATE),
	idUtilisationLocal("ID_UTILISATION_LOCAL",Type.STRING),
	cdTpEncours("CD_TP_ENCOURS",Type.STRING),

	ihmFacilite("idFacilite",Type.STRING),
	ihmFacilite("idPhotoFacilite",Type.STRING),
	ihmFacilite("cdSiteRsk",Type.STRING),
	ihmRefSquSiteRisque("cdSiteRskUtilisation",Type.STRING),
	ihmRefIntSiSource("idSiSource",Type.BIGDECIMAL),
	ihmRefSquTypEncours("cdTpEncours",Type.STRING),
	ihmAdmUtilisateur("idUtilisateurMaj",Type.BIGDECIMAL),
	ihmRefIntMotifModifAuto("idMotifModifAuto",Type.BIGDECIMAL),
	ihmRefSquCodDevise("cdDevise",Type.STRING),
	ihmDossierDeDefaut("idPhoto",Type.STRING),
	ihmDossierDeDefaut("idDossierDefaut",Type.STRING),
	ihmRefIntTypEnreg("idTypEnreg",Type.BIGDECIMAL),
	;

	/**
	 * Nom du champ en base de données.
	 */
	private final String nomSQL;

	/**
	 * Type du champ en base de données.
	 */
	private final Type type;
	
	/**
	 * Constructeur.
	 * @param nomSQL Nom du champ SQL.
	 */
	private AttributIhmFacUtilisationEnum(String nomSQL, Type type) {
		this.nomSQL = nomSQL;
		this.type = type;
	}

	public String getNomSQL() {
		return nomSQL;
	}
	
	public Type getType() {
		return type;
	}
	
	/**
	 * Retourne la valeur de l'énumération en fonction du nom SQL.
	 * @param nomSQL Nom SQL de l'attribut.
	 * @return Valeur de l'énumération.
	 */
	public static AttributIhmFacUtilisationEnum getEnumForNomSQL(String nomSQL) {
		nomSQL = StringUtils.trimToEmpty(nomSQL);
		for(AttributIhmFacUtilisationEnum attributIhmFacUtilisationEnum : values()) {
			if(StringUtils.equalsIgnoreCase(attributIhmFacUtilisationEnum.getNomSQL(), nomSQL)) {
				return attributIhmFacUtilisationEnum;
			}
		}
		return null;
	}

}