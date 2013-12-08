package com.bnpparibas.phenics.common.workflow.util;

/**
 * Attributs modifiable pour l'entite : Adresse.
 */
public enum AttributAdresseEnum {
	complement("COMPLEMENT",Type.STRING),
	ville("VILLE",Type.STRING),
	idAdresse("ID_ADRESSE",Type.INTEGER),
	cp("CP",Type.INTEGER),
	nomRue("NOM_RUE",Type.STRING),
	contact("CONTACT",Type.STRING),
	numRue("NUM_RUE",Type.INTEGER),

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
	private AttributAdresseEnum(String nomSQL, Type type) {
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
	public static AttributAdresseEnum getEnumForNomSQL(String nomSQL) {
		nomSQL = StringUtils.trimToEmpty(nomSQL);
		for(AttributAdresseEnum attributAdresseEnum : values()) {
			if(StringUtils.equalsIgnoreCase(attributAdresseEnum.getNomSQL(), nomSQL)) {
				return attributAdresseEnum;
			}
		}
		return null;
	}

}