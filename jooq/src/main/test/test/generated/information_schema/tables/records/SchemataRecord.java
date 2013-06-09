/**
 * This class is generated by jOOQ
 */
package test.generated.information_schema.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class SchemataRecord extends org.jooq.impl.TableRecordImpl<test.generated.information_schema.tables.records.SchemataRecord> {

	private static final long serialVersionUID = 1415257481;

	/**
	 * The table column <code>information_schema.schemata.catalog_name</code>
	 */
	public void setCatalogName(java.lang.String value) {
		setValue(test.generated.information_schema.tables.Schemata.SCHEMATA.CATALOG_NAME, value);
	}

	/**
	 * The table column <code>information_schema.schemata.catalog_name</code>
	 */
	public java.lang.String getCatalogName() {
		return getValue(test.generated.information_schema.tables.Schemata.SCHEMATA.CATALOG_NAME);
	}

	/**
	 * The table column <code>information_schema.schemata.schema_name</code>
	 */
	public void setSchemaName(java.lang.String value) {
		setValue(test.generated.information_schema.tables.Schemata.SCHEMATA.SCHEMA_NAME, value);
	}

	/**
	 * The table column <code>information_schema.schemata.schema_name</code>
	 */
	public java.lang.String getSchemaName() {
		return getValue(test.generated.information_schema.tables.Schemata.SCHEMATA.SCHEMA_NAME);
	}

	/**
	 * The table column <code>information_schema.schemata.schema_owner</code>
	 */
	public void setSchemaOwner(java.lang.String value) {
		setValue(test.generated.information_schema.tables.Schemata.SCHEMATA.SCHEMA_OWNER, value);
	}

	/**
	 * The table column <code>information_schema.schemata.schema_owner</code>
	 */
	public java.lang.String getSchemaOwner() {
		return getValue(test.generated.information_schema.tables.Schemata.SCHEMATA.SCHEMA_OWNER);
	}

	/**
	 * The table column <code>information_schema.schemata.default_character_set_catalog</code>
	 */
	public void setDefaultCharacterSetCatalog(java.lang.String value) {
		setValue(test.generated.information_schema.tables.Schemata.SCHEMATA.DEFAULT_CHARACTER_SET_CATALOG, value);
	}

	/**
	 * The table column <code>information_schema.schemata.default_character_set_catalog</code>
	 */
	public java.lang.String getDefaultCharacterSetCatalog() {
		return getValue(test.generated.information_schema.tables.Schemata.SCHEMATA.DEFAULT_CHARACTER_SET_CATALOG);
	}

	/**
	 * The table column <code>information_schema.schemata.default_character_set_schema</code>
	 */
	public void setDefaultCharacterSetSchema(java.lang.String value) {
		setValue(test.generated.information_schema.tables.Schemata.SCHEMATA.DEFAULT_CHARACTER_SET_SCHEMA, value);
	}

	/**
	 * The table column <code>information_schema.schemata.default_character_set_schema</code>
	 */
	public java.lang.String getDefaultCharacterSetSchema() {
		return getValue(test.generated.information_schema.tables.Schemata.SCHEMATA.DEFAULT_CHARACTER_SET_SCHEMA);
	}

	/**
	 * The table column <code>information_schema.schemata.default_character_set_name</code>
	 */
	public void setDefaultCharacterSetName(java.lang.String value) {
		setValue(test.generated.information_schema.tables.Schemata.SCHEMATA.DEFAULT_CHARACTER_SET_NAME, value);
	}

	/**
	 * The table column <code>information_schema.schemata.default_character_set_name</code>
	 */
	public java.lang.String getDefaultCharacterSetName() {
		return getValue(test.generated.information_schema.tables.Schemata.SCHEMATA.DEFAULT_CHARACTER_SET_NAME);
	}

	/**
	 * The table column <code>information_schema.schemata.sql_path</code>
	 */
	public void setSqlPath(java.lang.String value) {
		setValue(test.generated.information_schema.tables.Schemata.SCHEMATA.SQL_PATH, value);
	}

	/**
	 * The table column <code>information_schema.schemata.sql_path</code>
	 */
	public java.lang.String getSqlPath() {
		return getValue(test.generated.information_schema.tables.Schemata.SCHEMATA.SQL_PATH);
	}

	/**
	 * Create a detached SchemataRecord
	 */
	public SchemataRecord() {
		super(test.generated.information_schema.tables.Schemata.SCHEMATA);
	}
}
