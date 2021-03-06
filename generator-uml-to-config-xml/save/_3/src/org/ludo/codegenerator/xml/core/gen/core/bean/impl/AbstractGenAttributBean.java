package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAttributs;

public class AbstractGenAttributBean implements GenAttribut {
	
	/** Récupération de l'élément parent */
	
	private GenAttributs referenceGenAttributs = null;
	
	public GenAttributs getReferenceGenAttributs() {
		return referenceGenAttributs;
	}
	
	public void setReferenceGenAttributs(GenAttributs referenceGenAttributs) {
		this.referenceGenAttributs = referenceGenAttributs;
	}
	
	/** Récupération des éléments fils */
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	

	public String getGenIdAsString() {
		return this.genId;
	}
	public void setGenIdAsString(String genIdAsString) {
		this.genId = genIdAsString;
	}

	public String getNomJavaAsString() {
		return this.nomJava;
	}
	public void setNomJavaAsString(String nomJavaAsString) {
		this.nomJava = nomJavaAsString;
	}

	public String getTypeAsString() {
		return this.type;
	}
	public void setTypeAsString(String typeAsString) {
		this.type = typeAsString;
	}

	public String getNombreMinimumAsString() {
		return this.nombreMinimum;
	}
	public void setNombreMinimumAsString(String nombreMinimumAsString) {
		this.nombreMinimum = nombreMinimumAsString;
	}

	public String getNombreMaximumAsString() {
		return this.nombreMaximum;
	}
	public void setNombreMaximumAsString(String nombreMaximumAsString) {
		this.nombreMaximum = nombreMaximumAsString;
	}

	public String getNomSQLAsString() {
		return this.nomSQL;
	}
	public void setNomSQLAsString(String nomSQLAsString) {
		this.nomSQL = nomSQLAsString;
	}

	public String getTypeSQLAsString() {
		return this.typeSQL;
	}
	public void setTypeSQLAsString(String typeSQLAsString) {
		this.typeSQL = typeSQLAsString;
	}

	public String getEstDansTableAsString() {
		return this.estDansTable;
	}
	public void setEstDansTableAsString(String estDansTableAsString) {
		this.estDansTable = estDansTableAsString;
	}

	public String getSizeAsString() {
		return this.size;
	}
	public void setSizeAsString(String sizeAsString) {
		this.size = sizeAsString;
	}

	public String getEstClePrimaireAsString() {
		return this.estClePrimaire;
	}
	public void setEstClePrimaireAsString(String estClePrimaireAsString) {
		this.estClePrimaire = estClePrimaireAsString;
	}

	public String getEstCleIncrementeeAsString() {
		return this.estCleIncrementee;
	}
	public void setEstCleIncrementeeAsString(String estCleIncrementeeAsString) {
		this.estCleIncrementee = estCleIncrementeeAsString;
	}
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
	private String genId = null;
	private String nomJava = null;
	private String type = null;
	private String nombreMinimum = null;
	private String nombreMaximum = null;
	private String nomSQL = null;
	private String typeSQL = null;
	private String estDansTable = null;
	private String size = null;
	private String estClePrimaire = null;
	private String estCleIncrementee = null;

	public String getGenId() {
		return this.genId;
	}
	public void setGenId(String genId) {
		this.genId = genId;
	}

	public String getNomJava() {
		return this.nomJava;
	}
	public void setNomJava(String nomJava) {
		this.nomJava = nomJava;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getNombreMinimum() {
		return this.nombreMinimum;
	}
	public void setNombreMinimum(String nombreMinimum) {
		this.nombreMinimum = nombreMinimum;
	}

	public String getNombreMaximum() {
		return this.nombreMaximum;
	}
	public void setNombreMaximum(String nombreMaximum) {
		this.nombreMaximum = nombreMaximum;
	}

	public String getNomSQL() {
		return this.nomSQL;
	}
	public void setNomSQL(String nomSQL) {
		this.nomSQL = nomSQL;
	}

	public String getTypeSQL() {
		return this.typeSQL;
	}
	public void setTypeSQL(String typeSQL) {
		this.typeSQL = typeSQL;
	}

	public String getEstDansTable() {
		return this.estDansTable;
	}
	public void setEstDansTable(String estDansTable) {
		this.estDansTable = estDansTable;
	}

	public String getSize() {
		return this.size;
	}
	public void setSize(String size) {
		this.size = size;
	}

	public String getEstClePrimaire() {
		return this.estClePrimaire;
	}
	public void setEstClePrimaire(String estClePrimaire) {
		this.estClePrimaire = estClePrimaire;
	}

	public String getEstCleIncrementee() {
		return this.estCleIncrementee;
	}
	public void setEstCleIncrementee(String estCleIncrementee) {
		this.estCleIncrementee = estCleIncrementee;
	}
}
