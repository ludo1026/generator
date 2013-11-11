package org.ludo.jdbc.xml.mapping;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAssociation;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAssociationAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasses;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenAssociationAttributBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenAssociationBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenAttributBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenClasseBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenClassesBean;
import org.ludo.codegenerator.xml.core.gen.core.bean.impl.GenStereotypeClasseBean;
import org.ludo.jdbc.manager.bean.CleEtrangere;
import org.ludo.jdbc.manager.bean.Colonne;
import org.ludo.jdbc.manager.bean.Schema;
import org.ludo.jdbc.manager.bean.Table;
import org.springframework.stereotype.Component;

@Component
public class JdbcToXmlMapping {

	public Gen getGen(final Schema schema) {
		final Gen gen = new GenBean();
		final GenClasses genClasses = new GenClassesBean();
		gen.setGenClasses(genClasses);

		for (final Table table : schema.getTableByNoms().values()) {
			final GenClasse genClasse = this.getGenClasse(table);
			genClasses.addGenClasse(genClasse);
		}

		final Map<String, GenClasse> genClasseByNomTables = this.mapGenClasseByNomTables(genClasses);

		for (final Table table : schema.getTableByNoms().values()) {
			final GenClasse genClasseOrigine = genClasseByNomTables.get(table.getNom());
			for (final CleEtrangere cleEtrangere : table.getCleEtrangeres()) {
				final Table tableDestination = cleEtrangere.getTableDestination();
				final GenClasse genClasseDestination = genClasseByNomTables.get(tableDestination.getNom());
				final GenAssociation genAssociation = new GenAssociationBean();
				final String nomJava = this.nomSqlToJava(tableDestination.getNom());
				genAssociation.setGenId(nomJava);
				genAssociation.setClasseGenId(genClasseDestination.getGenId());
				genAssociation.setNomJava(nomJava);
				for (final Colonne colonne : cleEtrangere.getColonnes()) {
					final GenAssociationAttribut genAssociationAttribut = new GenAssociationAttributBean();
					genAssociationAttribut.setGenId(this.nomSqlToJava(colonne.getNom()));
					genAssociation.getGenAssociationAttributs().add(genAssociationAttribut);
				}

				genClasseOrigine.getGenAssociations().add(genAssociation);

			}
		}

		return gen;
	}

	private Map<String, GenClasse> mapGenClasseByNomTables(final GenClasses genClasses) {
		final Map<String, GenClasse> genClasseByNomTables = new HashMap<>();
		for (final GenClasse genClasse : genClasses.getGenClasses()) {
			genClasseByNomTables.put(genClasse.getNomTable(), genClasse);
		}
		return genClasseByNomTables;
	}

	public GenClasse getGenClasse(final Table table) {
		final GenClasse classe = new GenClasseBean();
		classe.setGenId(this.nomSqlToJava(table.getNom()));
		classe.setNomJava(this.nomSqlToJava(table.getNom()));
		classe.setNomTable(table.getNom());
		final GenStereotypeClasse stereotype = new GenStereotypeClasseBean();
		classe.getGenStereotypeClasses().add(stereotype);
		stereotype.setNom("bean");

		for (final Colonne colonne : table.getColonneByNames().values()) {
			final GenAttribut attribut = new GenAttributBean();
			final String nomJava = this.nomSqlToJava(colonne.getNom());
			attribut.setGenId(nomJava);
			attribut.setNomJava(nomJava);
			attribut.setType(this.getTypeJavaForTypeSQL(colonne.getType()));
			attribut.setNomSQL(colonne.getNom());
			attribut.setTypeSQL(colonne.getType());
			attribut.setSize(colonne.getSize());
			if (table.getClePrimaire().getColonnes().contains(colonne)) {
				attribut.setEstClePrimaire("true");
			} else {
				attribut.setEstClePrimaire("false");
			}
			classe.getGenAttributs().add(attribut);
		}

		return classe;
	}

	private String nomSqlToJava(final String nom) {
		String nomJava = "";
		final String[] nomSplitteds = nom.split("_");
		for (String nomSplitted : nomSplitteds) {
			nomSplitted = StringUtils.lowerCase(nomSplitted);
			nomSplitted = StringUtils.capitalize(nomSplitted);
			nomJava += nomSplitted;
		}
		return StringUtils.uncapitalize(nomJava);
	}

	private String getTypeJavaForTypeSQL(String typeSQL) {
		if (StringUtils.isBlank(typeSQL)) {
			return null;
		}
		typeSQL = StringUtils.lowerCase(typeSQL);
		if (typeSQL.startsWith("int")) {
			return "Integer";
		}
		if (typeSQL.startsWith("long")) {
			return "Long";
		}
		if (typeSQL.startsWith("number") || typeSQL.startsWith("float") || typeSQL.startsWith("double")) {
			return "BigDecimal";
		}
		if (typeSQL.startsWith("varchar") || typeSQL.startsWith("nchar")) {
			return "String";
		}
		if (typeSQL.startsWith("char") || typeSQL.startsWith("nchar")) {
			return "Character";
		}
		if (typeSQL.startsWith("date") || typeSQL.startsWith("time")) {
			return "Date";
		}
		if (typeSQL.startsWith("blob") || typeSQL.startsWith("lob")) {
			return "Blob";
		}
		return null;
	}
}
