package com.bnpparibas.phenics.common.workflow.util;

/**
 * Attributs modifiable pour l'entite : LienBarBoisson.
 */
public enum AttributLienBarBoissonEnum {
	boissonsIdBoisson("Boissons_ID_BOISSON",Type.INTEGER),
	barIdBar("Bar_ID_BAR",Type.INTEGER),

	boisson("boissonsIdBoisson",Type.INTEGER),
	bar("barIdBar",Type.INTEGER),
	;

	/**
	 * Nom du champ en base de donn�es.
	 */
	private final String nomSQL;

	/**
	 * Type du champ en base de donn�es.
	 */
	private final Type type;
	
	/**
	 * Constructeur.
	 * @param nomSQL Nom du champ SQL.
	 */
	private AttributLienBarBoissonEnum(String nomSQL, Type type) {
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
	 * Retourne la valeur de l'�num�ration en fonction du nom SQL.
	 * @param nomSQL Nom SQL de l'attribut.
	 * @return Valeur de l'�num�ration.
	 */
	public static AttributLienBarBoissonEnum getEnumForNomSQL(String nomSQL) {
		nomSQL = StringUtils.trimToEmpty(nomSQL);
		for(AttributLienBarBoissonEnum attributLienBarBoissonEnum : values()) {
			if(StringUtils.equalsIgnoreCase(attributLienBarBoissonEnum.getNomSQL(), nomSQL)) {
				return attributLienBarBoissonEnum;
			}
		}
		return null;
	}

}