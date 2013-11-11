package com.bnpparibas.phenics.common.workflow.util;

/**
 * Attributs modifiable pour l'entite : IhmFacRecuperation.
 */
public enum AttributIhmFacRecuperationEnum {
	idSiSource("ID_SI_SOURCE",Type.BIGDECIMAL),
	idFacilite("ID_FACILITE",Type.STRING),
	idRecupLocal("ID_RECUP_LOCAL",Type.STRING),
	idPhotoFacilite("ID_PHOTO_FACILITE",Type.STRING),
	blDelete("BL_DELETE",Type.BIGDECIMAL),
	idMotifModifAuto("ID_MOTIF_MODIF_AUTO",Type.BIGDECIMAL),
	cdTypMnt("CD_TYP_MNT",Type.STRING),
	idFoncDefaut("ID_FONC_DEFAUT",Type.STRING),
	idUtilisateurMaj("ID_UTILISATEUR_MAJ",Type.BIGDECIMAL),
	idPhoto("ID_PHOTO",Type.STRING),
	coRecup("CO_RECUP",Type.STRING),
	tsDelete("TS_DELETE",Type.DATE),
	idPhotoGarantie("ID_PHOTO_GARANTIE",Type.STRING),
	idTypEnreg("ID_TYP_ENREG",Type.BIGDECIMAL),
	dtArrete("DT_ARRETE",Type.DATE),
	cdTypo("CD_TYPO",Type.BIGDECIMAL),
	mtRecup("MT_RECUP",Type.BIGDECIMAL),
	cdDevise("CD_DEVISE",Type.STRING),
	cdSiteRsk("CD_SITE_RSK",Type.STRING),
	dtPaieRecup("DT_PAIE_RECUP",Type.DATE),
	idPhotoDefaut("ID_PHOTO_DEFAUT",Type.STRING),
	indStatQualRecup("IND_STAT_QUAL_RECUP",Type.STRING),
	idGarantie("ID_GARANTIE",Type.STRING),
	indMigBdi("IND_MIG_BDI",Type.STRING),

	ihmFacilite("idFacilite",Type.STRING),
	ihmFacilite("idPhotoFacilite",Type.STRING),
	ihmFacilite("cdSiteRsk",Type.STRING),
	ihmRefExtTypMontant("cdTypMnt",Type.STRING),
	ihmRefIntSiSource("idSiSource",Type.BIGDECIMAL),
	ihmAdmUtilisateur("idUtilisateurMaj",Type.BIGDECIMAL),
	ihmRefIntMotifModifAuto("idMotifModifAuto",Type.BIGDECIMAL),
	ihmRefSquCodDevise("cdDevise",Type.STRING),
	ihmDossierDeDefaut("idPhotoDefaut",Type.STRING),
	ihmDossierDeDefaut("idFoncDefaut",Type.STRING),
	ihmRefSquTypRecup("cdTypo",Type.BIGDECIMAL),
	ihmRefIntTypEnreg("idTypEnreg",Type.BIGDECIMAL),
	ihmFacGarantie("idPhotoGarantie",Type.STRING),
	ihmFacGarantie("idGarantie",Type.STRING),
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
	private AttributIhmFacRecuperationEnum(String nomSQL, Type type) {
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
	public static AttributIhmFacRecuperationEnum getEnumForNomSQL(String nomSQL) {
		nomSQL = StringUtils.trimToEmpty(nomSQL);
		for(AttributIhmFacRecuperationEnum attributIhmFacRecuperationEnum : values()) {
			if(StringUtils.equalsIgnoreCase(attributIhmFacRecuperationEnum.getNomSQL(), nomSQL)) {
				return attributIhmFacRecuperationEnum;
			}
		}
		return null;
	}

}