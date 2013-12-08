package com.bnpparibas.phenics.common.workflow.util;

/**
 * Attributs modifiable pour l'entite : LienJourBar.
 */
public enum AttributLienJourBarEnum {
	barIdBar("BAR_ID_BAR",Type.INTEGER),
	jourIdJour("JOUR_ID_JOUR",Type.INTEGER),

	jour("jourIdJour",Type.INTEGER),
	bar("barIdBar",Type.INTEGER),
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
	private AttributLienJourBarEnum(String nomSQL, Type type) {
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
	public static AttributLienJourBarEnum getEnumForNomSQL(String nomSQL) {
		nomSQL = StringUtils.trimToEmpty(nomSQL);
		for(AttributLienJourBarEnum attributLienJourBarEnum : values()) {
			if(StringUtils.equalsIgnoreCase(attributLienJourBarEnum.getNomSQL(), nomSQL)) {
				return attributLienJourBarEnum;
			}
		}
		return null;
	}

}