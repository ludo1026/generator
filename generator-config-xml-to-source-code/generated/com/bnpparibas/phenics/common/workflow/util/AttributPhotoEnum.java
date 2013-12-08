package com.bnpparibas.phenics.common.workflow.util;

/**
 * Attributs modifiable pour l'entite : Photo.
 */
public enum AttributPhotoEnum {
	idPhoto("ID_PHOTO",Type.INTEGER),
	urlPhoto("URL_PHOTO",Type.STRING),

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
	private AttributPhotoEnum(String nomSQL, Type type) {
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
	public static AttributPhotoEnum getEnumForNomSQL(String nomSQL) {
		nomSQL = StringUtils.trimToEmpty(nomSQL);
		for(AttributPhotoEnum attributPhotoEnum : values()) {
			if(StringUtils.equalsIgnoreCase(attributPhotoEnum.getNomSQL(), nomSQL)) {
				return attributPhotoEnum;
			}
		}
		return null;
	}

}