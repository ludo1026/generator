package org.ludo.jdbc.manager;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.apache.commons.lang.StringUtils;
import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;
import org.ludo.codegenerator.xml.core.gen.core.xmlwriter.GenXmlWriterManager;
import org.ludo.jdbc.manager.bean.CleEtrangere;
import org.ludo.jdbc.manager.bean.Colonne;
import org.ludo.jdbc.manager.bean.Schema;
import org.ludo.jdbc.manager.bean.Table;
import org.ludo.jdbc.xml.mapping.JdbcToXmlMapping;
import org.ludo.utils.AssertHelper;
import org.springframework.stereotype.Component;

@Component("jdbcManager")
public class JDBCManager {

	@Resource(name = "dataSource")
	private DataSource dataSource;

	@Resource
	private JdbcToXmlMapping jdbcToXmlMapping;

	/**
	 * Méthode principale.
	 */
	public void main(final String fileXmlOrig, final String fileXmlDest) {
		try {
			final Connection connection = this.dataSource.getConnection();
			final DatabaseMetaData meta = connection.getMetaData();

			final Schema schema = this.getSchema(connection, meta);

			final Gen gen = this.jdbcToXmlMapping.getGen(schema);

			final GenXmlWriterManager genXmlWriterManager = GenXmlWriterManager.getGenWriterManager(fileXmlOrig);
			genXmlWriterManager.write(gen);
			genXmlWriterManager.save(fileXmlDest);

		} catch (final Throwable e) {
			throw new IllegalStateException(e);
		}
	}

	private Schema getSchema(final Connection connection, final DatabaseMetaData meta) throws SQLException {
		final Schema schema = new Schema();
		getTables(connection, meta, schema, "FLU%");
		getTables(connection, meta, schema, "IHM%");
		getTables(connection, meta, schema, "SWD%");

		for (final Table table : schema.getTableByNoms().values()) {
			this.defineColonnes(connection, meta, table);
			this.defineClePrimaire(connection, meta, table);
			System.out.println(table);
		}
		for (final Table table : schema.getTableByNoms().values()) {
			this.defineCleEtrangere(connection, meta, table, schema);
		}

		return schema;
	}

	private void getTables(final Connection connection, final DatabaseMetaData meta, final Schema schema, String tableName) throws SQLException {
		final ResultSet rs = meta.getTables(connection.getCatalog(), null, tableName, new String[] { "TABLE" });
		while (rs.next()) {
			final Table table = new Table();
			for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
				final String key = rs.getMetaData().getColumnName(i + 1);
				final Object val = rs.getObject(i + 1);
				table.getInfos().put(key, val);
			}
			table.setNom(rs.getString("table_name"));
			table.setDescription(rs.getString("remarks"));
			schema.addTable(table);
		}
	}

	/**
	 * ImportedKeys : <br/>
	 * pktable_cat = null <br/>
	 * pktable_schem = public <br/>
	 * pktable_name = utilisateur <br/>
	 * pkcolumn_name = id <br/>
	 * fktable_cat = null <br/>
	 * fktable_schem = public <br/>
	 * fktable_name = utilisateur_profil <br/>
	 * fkcolumn_name = utilisateur_id <br/>
	 * key_seq = 1 <br/>
	 * update_rule = 3 <br/>
	 * delete_rule = 3 <br/>
	 * fk_name = fk8646b8b7c88f1f <br/>
	 * pk_name = utilisateur_pkey <br/>
	 * deferrability = 7 <br/>
	 * <br/>
	 * ExportedKeys : <br/>
	 * pktable_cat = null <br/>
	 * pktable_schem = public <br/>
	 * pktable_name = utilisateur <br/>
	 * pkcolumn_name = id <br/>
	 * fktable_cat = null <br/>
	 * fktable_schem = public <br/>
	 * fktable_name = utilisateur_profil <br/>
	 * fkcolumn_name = utilisateur_id <br/>
	 * key_seq = 1 <br/>
	 * update_rule = 3 <br/>
	 * delete_rule = 3 <br/>
	 * fk_name = fk8646b8b7c88f1f <br/>
	 * pk_name = utilisateur_pkey <br/>
	 * deferrability = 7 <br/>
	 * 
	 * @param connection
	 * @param meta
	 * @param tableDestination
	 * @throws SQLException
	 */
	private void defineCleEtrangere(final Connection connection, final DatabaseMetaData meta, final Table tableDestination, final Schema schema) throws SQLException {
		final ResultSet rs = meta.getExportedKeys(connection.getCatalog(), null, tableDestination.getNom());
		final Map<String, List<String>> columnNamesByTableNames = new HashMap<>();
		while (rs.next()) {
			// for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
			// final String key = rs.getMetaData().getColumnName(i + 1);
			// final Object val = rs.getObject(i + 1);
			// System.out.println(key + " = " + val + " <br/>");
			// }
			final String pkTableName = rs.getString("PKTABLE_NAME");
			final String fkTableName = rs.getString("FKTABLE_NAME");
			final String fkColumnName = rs.getString("FKCOLUMN_NAME");
			// final int fkSequence = rs.getInt("KEY_SEQ");
			// System.out.println("getExportedKeys(): fkTableName=" +
			// fkTableName);
			// System.out.println("getExportedKeys(): fkColumnName=" +
			// fkColumnName);
			// System.out.println("getExportedKeys(): fkSequence=" +
			// fkSequence);
			if (columnNamesByTableNames.get(fkTableName) == null) {
				columnNamesByTableNames.put(fkTableName, new ArrayList<String>());
			}
			columnNamesByTableNames.get(fkTableName).add(fkColumnName);
		}
		for (final String tableName : columnNamesByTableNames.keySet()) {
			final Table tableWithForeignKey = schema.getTableByNoms().get(tableName);
			final List<String> columnNames = columnNamesByTableNames.get(tableName);
			final List<Colonne> colonnes = new ArrayList<Colonne>();
			for (final String columnName : columnNames) {
				final Colonne colonne = tableWithForeignKey.getColonneByNames().get(columnName);
				AssertHelper.assertDefined(colonne,
						"Colonne de la clé étrangère : '" + columnName + "' pour la table : '" + tableWithForeignKey.getNom() + "' vers la table : '" + tableDestination.getNom() + "'");
				colonnes.add(colonne);
			}
			final CleEtrangere cleEtrangere = new CleEtrangere();
			cleEtrangere.setTableDestination(tableDestination);
			cleEtrangere.setColonnes(colonnes);
			tableWithForeignKey.getCleEtrangeres().add(cleEtrangere);
		}
	}

	private void defineClePrimaire(final Connection connection, final DatabaseMetaData meta, final Table table) throws SQLException {
		final ResultSet rs = meta.getPrimaryKeys(connection.getCatalog(), null, table.getNom());
		while (rs.next()) {
			table.addToClePrimaire(rs.getString("COLUMN_NAME"));
		}
	}

	/**
	 * TABLE_CAT = null <br/>
	 * TABLE_SCHEM = public <br/>
	 * TABLE_NAME = utilisateur_profil <br/>
	 * COLUMN_NAME = profils_id <br/>
	 * DATA_TYPE = -5 <br/>
	 * TYPE_NAME = int8 <br/>
	 * COLUMN_SIZE = 19 <br/>
	 * BUFFER_LENGTH = null <br/>
	 * DECIMAL_DIGITS = 0 <br/>
	 * NUM_PREC_RADIX = 10 <br/>
	 * NULLABLE = 0 <br/>
	 * REMARKS = null <br/>
	 * COLUMN_DEF = null <br/>
	 * SQL_DATA_TYPE = null <br/>
	 * SQL_DATETIME_SUB = null <br/>
	 * CHAR_OCTET_LENGTH = 19 <br/>
	 * ORDINAL_POSITION = 2 <br/>
	 * IS_NULLABLE = NO <br/>
	 * SCOPE_CATLOG = null <br/>
	 * SCOPE_SCHEMA = null <br/>
	 * SCOPE_TABLE = null <br/>
	 * SOURCE_DATA_TYPE = null <br/>
	 * IS_AUTOINCREMENT = NO <br/>
	 * 
	 * @param connection
	 * @param meta
	 * @param table
	 * @throws SQLException
	 */
	private void defineColonnes(final Connection connection, final DatabaseMetaData meta, final Table table) throws SQLException {
		final List<Colonne> colonnes = new ArrayList<>();
		final ResultSet resultat = meta.getColumns(connection.getCatalog(), null, table.getNom(), "%");
		final ResultSetMetaData rsmd = resultat.getMetaData();
		while (resultat.next()) {
			final Colonne colonne = new Colonne();
			for (int i = 0; i < rsmd.getColumnCount(); i++) {
				final String col = rsmd.getColumnName(i + 1);
				final Object val = resultat.getObject(i + 1);
				colonne.getInfos().put(col, val);
				colonnes.add(colonne);
			}
			colonne.setNom(resultat.getString("COLUMN_NAME"));
			colonne.setType(resultat.getString("TYPE_NAME"));
			colonne.setSize(resultat.getString("COLUMN_SIZE"));
			colonne.setDescription(resultat.getString("REMARKS"));
			String isNullableAsString = resultat.getString("IS_NULLABLE");
			boolean isNullable = StringUtils.equalsIgnoreCase(isNullableAsString, "YES");
			colonne.setIsNullable(isNullable);
			table.addColonne(colonne);
		}
	}

}
