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
public class _PgForeignServersRecord extends org.jooq.impl.TableRecordImpl<test.generated.information_schema.tables.records._PgForeignServersRecord> {

	private static final long serialVersionUID = -1572196873;

	/**
	 * The table column <code>information_schema._pg_foreign_servers.oid</code>
	 */
	public void setOid(java.lang.Long value) {
		setValue(test.generated.information_schema.tables._PgForeignServers._PG_FOREIGN_SERVERS.OID, value);
	}

	/**
	 * The table column <code>information_schema._pg_foreign_servers.oid</code>
	 */
	public java.lang.Long getOid() {
		return getValue(test.generated.information_schema.tables._PgForeignServers._PG_FOREIGN_SERVERS.OID);
	}

	/**
	 * The table column <code>information_schema._pg_foreign_servers.srvoptions</code>
	 */
	public void setSrvoptions(java.lang.String[] value) {
		setValue(test.generated.information_schema.tables._PgForeignServers._PG_FOREIGN_SERVERS.SRVOPTIONS, value);
	}

	/**
	 * The table column <code>information_schema._pg_foreign_servers.srvoptions</code>
	 */
	public java.lang.String[] getSrvoptions() {
		return getValue(test.generated.information_schema.tables._PgForeignServers._PG_FOREIGN_SERVERS.SRVOPTIONS);
	}

	/**
	 * The table column <code>information_schema._pg_foreign_servers.foreign_server_catalog</code>
	 */
	public void setForeignServerCatalog(java.lang.String value) {
		setValue(test.generated.information_schema.tables._PgForeignServers._PG_FOREIGN_SERVERS.FOREIGN_SERVER_CATALOG, value);
	}

	/**
	 * The table column <code>information_schema._pg_foreign_servers.foreign_server_catalog</code>
	 */
	public java.lang.String getForeignServerCatalog() {
		return getValue(test.generated.information_schema.tables._PgForeignServers._PG_FOREIGN_SERVERS.FOREIGN_SERVER_CATALOG);
	}

	/**
	 * The table column <code>information_schema._pg_foreign_servers.foreign_server_name</code>
	 */
	public void setForeignServerName(java.lang.String value) {
		setValue(test.generated.information_schema.tables._PgForeignServers._PG_FOREIGN_SERVERS.FOREIGN_SERVER_NAME, value);
	}

	/**
	 * The table column <code>information_schema._pg_foreign_servers.foreign_server_name</code>
	 */
	public java.lang.String getForeignServerName() {
		return getValue(test.generated.information_schema.tables._PgForeignServers._PG_FOREIGN_SERVERS.FOREIGN_SERVER_NAME);
	}

	/**
	 * The table column <code>information_schema._pg_foreign_servers.foreign_data_wrapper_catalog</code>
	 */
	public void setForeignDataWrapperCatalog(java.lang.String value) {
		setValue(test.generated.information_schema.tables._PgForeignServers._PG_FOREIGN_SERVERS.FOREIGN_DATA_WRAPPER_CATALOG, value);
	}

	/**
	 * The table column <code>information_schema._pg_foreign_servers.foreign_data_wrapper_catalog</code>
	 */
	public java.lang.String getForeignDataWrapperCatalog() {
		return getValue(test.generated.information_schema.tables._PgForeignServers._PG_FOREIGN_SERVERS.FOREIGN_DATA_WRAPPER_CATALOG);
	}

	/**
	 * The table column <code>information_schema._pg_foreign_servers.foreign_data_wrapper_name</code>
	 */
	public void setForeignDataWrapperName(java.lang.String value) {
		setValue(test.generated.information_schema.tables._PgForeignServers._PG_FOREIGN_SERVERS.FOREIGN_DATA_WRAPPER_NAME, value);
	}

	/**
	 * The table column <code>information_schema._pg_foreign_servers.foreign_data_wrapper_name</code>
	 */
	public java.lang.String getForeignDataWrapperName() {
		return getValue(test.generated.information_schema.tables._PgForeignServers._PG_FOREIGN_SERVERS.FOREIGN_DATA_WRAPPER_NAME);
	}

	/**
	 * The table column <code>information_schema._pg_foreign_servers.foreign_server_type</code>
	 */
	public void setForeignServerType(java.lang.String value) {
		setValue(test.generated.information_schema.tables._PgForeignServers._PG_FOREIGN_SERVERS.FOREIGN_SERVER_TYPE, value);
	}

	/**
	 * The table column <code>information_schema._pg_foreign_servers.foreign_server_type</code>
	 */
	public java.lang.String getForeignServerType() {
		return getValue(test.generated.information_schema.tables._PgForeignServers._PG_FOREIGN_SERVERS.FOREIGN_SERVER_TYPE);
	}

	/**
	 * The table column <code>information_schema._pg_foreign_servers.foreign_server_version</code>
	 */
	public void setForeignServerVersion(java.lang.String value) {
		setValue(test.generated.information_schema.tables._PgForeignServers._PG_FOREIGN_SERVERS.FOREIGN_SERVER_VERSION, value);
	}

	/**
	 * The table column <code>information_schema._pg_foreign_servers.foreign_server_version</code>
	 */
	public java.lang.String getForeignServerVersion() {
		return getValue(test.generated.information_schema.tables._PgForeignServers._PG_FOREIGN_SERVERS.FOREIGN_SERVER_VERSION);
	}

	/**
	 * The table column <code>information_schema._pg_foreign_servers.authorization_identifier</code>
	 */
	public void setAuthorizationIdentifier(java.lang.String value) {
		setValue(test.generated.information_schema.tables._PgForeignServers._PG_FOREIGN_SERVERS.AUTHORIZATION_IDENTIFIER, value);
	}

	/**
	 * The table column <code>information_schema._pg_foreign_servers.authorization_identifier</code>
	 */
	public java.lang.String getAuthorizationIdentifier() {
		return getValue(test.generated.information_schema.tables._PgForeignServers._PG_FOREIGN_SERVERS.AUTHORIZATION_IDENTIFIER);
	}

	/**
	 * Create a detached _PgForeignServersRecord
	 */
	public _PgForeignServersRecord() {
		super(test.generated.information_schema.tables._PgForeignServers._PG_FOREIGN_SERVERS);
	}
}
