package com.bnpparibas.phenics.common.workflow.util;

/**
 * Attributs modifiable pour l'entite : Boisson.
 */
public enum AttributBoissonEnum {
	nomBoisson("NOM_BOISSON",Type.STRING),
	prixBoisson("PRIX_BOISSON",Type.),
	idBoisson("ID_BOISSON",Type.INTEGER),

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
	private AttributBoissonEnum(String nomSQL, Type type) {
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
	public static AttributBoissonEnum getEnumForNomSQL(String nomSQL) {
		nomSQL = StringUtils.trimToEmpty(nomSQL);
		for(AttributBoissonEnum attributBoissonEnum : values()) {
			if(StringUtils.equalsIgnoreCase(attributBoissonEnum.getNomSQL(), nomSQL)) {
				return attributBoissonEnum;
			}
		}
		return null;
	}

}