/**
 * This class is generated by jOOQ
 */
package test.generated.pg_catalog.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class PgDatabaseRecord extends org.jooq.impl.TableRecordImpl<test.generated.pg_catalog.tables.records.PgDatabaseRecord> {

	private static final long serialVersionUID = 1955854173;

	/**
	 * The table column <code>pg_catalog.pg_database.datname</code>
	 */
	public void setDatname(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgDatabase.PG_DATABASE.DATNAME, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_database.datname</code>
	 */
	public java.lang.String getDatname() {
		return getValue(test.generated.pg_catalog.tables.PgDatabase.PG_DATABASE.DATNAME);
	}

	/**
	 * The table column <code>pg_catalog.pg_database.datdba</code>
	 */
	public void setDatdba(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgDatabase.PG_DATABASE.DATDBA, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_database.datdba</code>
	 */
	public java.lang.Long getDatdba() {
		return getValue(test.generated.pg_catalog.tables.PgDatabase.PG_DATABASE.DATDBA);
	}

	/**
	 * The table column <code>pg_catalog.pg_database.encoding</code>
	 */
	public void setEncoding(java.lang.Integer value) {
		setValue(test.generated.pg_catalog.tables.PgDatabase.PG_DATABASE.ENCODING, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_database.encoding</code>
	 */
	public java.lang.Integer getEncoding() {
		return getValue(test.generated.pg_catalog.tables.PgDatabase.PG_DATABASE.ENCODING);
	}

	/**
	 * The table column <code>pg_catalog.pg_database.datcollate</code>
	 */
	public void setDatcollate(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgDatabase.PG_DATABASE.DATCOLLATE, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_database.datcollate</code>
	 */
	public java.lang.String getDatcollate() {
		return getValue(test.generated.pg_catalog.tables.PgDatabase.PG_DATABASE.DATCOLLATE);
	}

	/**
	 * The table column <code>pg_catalog.pg_database.datctype</code>
	 */
	public void setDatctype(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgDatabase.PG_DATABASE.DATCTYPE, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_database.datctype</code>
	 */
	public java.lang.String getDatctype() {
		return getValue(test.generated.pg_catalog.tables.PgDatabase.PG_DATABASE.DATCTYPE);
	}

	/**
	 * The table column <code>pg_catalog.pg_database.datistemplate</code>
	 */
	public void setDatistemplate(java.lang.Boolean value) {
		setValue(test.generated.pg_catalog.tables.PgDatabase.PG_DATABASE.DATISTEMPLATE, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_database.datistemplate</code>
	 */
	public java.lang.Boolean getDatistemplate() {
		return getValue(test.generated.pg_catalog.tables.PgDatabase.PG_DATABASE.DATISTEMPLATE);
	}

	/**
	 * The table column <code>pg_catalog.pg_database.datallowconn</code>
	 */
	public void setDatallowconn(java.lang.Boolean value) {
		setValue(test.generated.pg_catalog.tables.PgDatabase.PG_DATABASE.DATALLOWCONN, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_database.datallowconn</code>
	 */
	public java.lang.Boolean getDatallowconn() {
		return getValue(test.generated.pg_catalog.tables.PgDatabase.PG_DATABASE.DATALLOWCONN);
	}

	/**
	 * The table column <code>pg_catalog.pg_database.datconnlimit</code>
	 */
	public void setDatconnlimit(java.lang.Integer value) {
		setValue(test.generated.pg_catalog.tables.PgDatabase.PG_DATABASE.DATCONNLIMIT, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_database.datconnlimit</code>
	 */
	public java.lang.Integer getDatconnlimit() {
		return getValue(test.generated.pg_catalog.tables.PgDatabase.PG_DATABASE.DATCONNLIMIT);
	}

	/**
	 * The table column <code>pg_catalog.pg_database.datlastsysoid</code>
	 */
	public void setDatlastsysoid(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgDatabase.PG_DATABASE.DATLASTSYSOID, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_database.datlastsysoid</code>
	 */
	public java.lang.Long getDatlastsysoid() {
		return getValue(test.generated.pg_catalog.tables.PgDatabase.PG_DATABASE.DATLASTSYSOID);
	}

	/**
	 * The table column <code>pg_catalog.pg_database.datfrozenxid</code>
	 */
	public void setDatfrozenxid(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgDatabase.PG_DATABASE.DATFROZENXID, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_database.datfrozenxid</code>
	 */
	public java.lang.Long getDatfrozenxid() {
		return getValue(test.generated.pg_catalog.tables.PgDatabase.PG_DATABASE.DATFROZENXID);
	}

	/**
	 * The table column <code>pg_catalog.pg_database.dattablespace</code>
	 */
	public void setDattablespace(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgDatabase.PG_DATABASE.DATTABLESPACE, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_database.dattablespace</code>
	 */
	public java.lang.Long getDattablespace() {
		return getValue(test.generated.pg_catalog.tables.PgDatabase.PG_DATABASE.DATTABLESPACE);
	}

	/**
	 * The table column <code>pg_catalog.pg_database.datacl</code>
	 */
	public void setDatacl(java.lang.String[] value) {
		setValue(test.generated.pg_catalog.tables.PgDatabase.PG_DATABASE.DATACL, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_database.datacl</code>
	 */
	public java.lang.String[] getDatacl() {
		return getValue(test.generated.pg_catalog.tables.PgDatabase.PG_DATABASE.DATACL);
	}

	/**
	 * Create a detached PgDatabaseRecord
	 */
	public PgDatabaseRecord() {
		super(test.generated.pg_catalog.tables.PgDatabase.PG_DATABASE);
	}
}
