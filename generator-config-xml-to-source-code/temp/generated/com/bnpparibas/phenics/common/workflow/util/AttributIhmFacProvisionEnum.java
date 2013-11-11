package com.bnpparibas.phenics.common.workflow.util;

/**
 * Attributs modifiable pour l'entite : IhmFacProvision.
 */
public enum AttributIhmFacProvisionEnum {
	idFacilite("ID_FACILITE",Type.STRING),
	idSiSource("ID_SI_SOURCE",Type.BIGDECIMAL),
	idPhotoFacilite("ID_PHOTO_FACILITE",Type.STRING),
	cdNatMvtProv("CD_NAT_MVT_PROV",Type.STRING),
	blDelete("BL_DELETE",Type.BIGDECIMAL),
	idMotifModifAuto("ID_MOTIF_MODIF_AUTO",Type.BIGDECIMAL),
	idFoncDefaut("ID_FONC_DEFAUT",Type.STRING),
	idUtilisateurMaj("ID_UTILISATEUR_MAJ",Type.BIGDECIMAL),
	tsDelete("TS_DELETE",Type.DATE),
	coProv("CO_PROV",Type.STRING),
	mtProvision("MT_PROVISION",Type.BIGDECIMAL),
	lbMiroUtilisateur("LB_MIRO_UTILISATEUR",Type.STRING),
	idTypEnreg("ID_TYP_ENREG",Type.BIGDECIMAL),
	dtArrete("DT_ARRETE",Type.DATE),
	dtProvision("DT_PROVISION",Type.DATE),
	indMiroEvnt("IND_MIRO_EVNT",Type.STRING),
	idProvision("ID_PROVISION",Type.BIGDECIMAL),
	dtValidation("DT_VALIDATION",Type.DATE),
	cdDevise("CD_DEVISE",Type.STRING),
	cdSiteRsk("CD_SITE_RSK",Type.STRING),
	idPhotoDefaut("ID_PHOTO_DEFAUT",Type.STRING),
	idPhotoProvision("ID_PHOTO_PROVISION",Type.STRING),
	indMigBdi("IND_MIG_BDI",Type.STRING),
	cdTpProvBmrc("CD_TP_PROV_BMRC",Type.STRING),

	ihmFacilite("idFacilite",Type.STRING),
	ihmFacilite("idPhotoFacilite",Type.STRING),
	ihmFacilite("cdSiteRsk",Type.STRING),
	ihmRefSquSiteRisque("cdSiteRsk",Type.STRING),
	ihmRefIntNatMvtProv("cdNatMvtProv",Type.STRING),
	ihmRefIntSiSource("idSiSource",Type.BIGDECIMAL),
	ihmAdmUtilisateur("idUtilisateurMaj",Type.BIGDECIMAL),
	ihmRefIntMotifModifAuto("idMotifModifAuto",Type.BIGDECIMAL),
	ihmRefSquCodDevise("cdDevise",Type.STRING),
	ihmDossierDeDefaut("idPhotoDefaut",Type.STRING),
	ihmDossierDeDefaut("idFoncDefaut",Type.STRING),
	ihmRefIntTypEnreg("idTypEnreg",Type.BIGDECIMAL),
	ihmRefSquTypProvision("cdTpProvBmrc",Type.STRING),
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
	private AttributIhmFacProvisionEnum(String nomSQL, Type type) {
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
	public static AttributIhmFacProvisionEnum getEnumForNomSQL(String nomSQL) {
		nomSQL = StringUtils.trimToEmpty(nomSQL);
		for(AttributIhmFacProvisionEnum attributIhmFacProvisionEnum : values()) {
			if(StringUtils.equalsIgnoreCase(attributIhmFacProvisionEnum.getNomSQL(), nomSQL)) {
				return attributIhmFacProvisionEnum;
			}
		}
		return null;
	}

}