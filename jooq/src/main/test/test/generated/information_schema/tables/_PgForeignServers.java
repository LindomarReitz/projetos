/**
 * This class is generated by jOOQ
 */
package test.generated.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class _PgForeignServers extends org.jooq.impl.TableImpl<test.generated.information_schema.tables.records._PgForeignServersRecord> {

	private static final long serialVersionUID = -1762589455;

	/**
	 * The singleton instance of information_schema._pg_foreign_servers
	 */
	public static final test.generated.information_schema.tables._PgForeignServers _PG_FOREIGN_SERVERS = new test.generated.information_schema.tables._PgForeignServers();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.information_schema.tables.records._PgForeignServersRecord> getRecordType() {
		return test.generated.information_schema.tables.records._PgForeignServersRecord.class;
	}

	/**
	 * The table column <code>information_schema._pg_foreign_servers.oid</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records._PgForeignServersRecord, java.lang.Long> OID = createField("oid", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>information_schema._pg_foreign_servers.srvoptions</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records._PgForeignServersRecord, java.lang.String[]> SRVOPTIONS = createField("srvoptions", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this);

	/**
	 * The table column <code>information_schema._pg_foreign_servers.foreign_server_catalog</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records._PgForeignServersRecord, java.lang.String> FOREIGN_SERVER_CATALOG = createField("foreign_server_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema._pg_foreign_servers.foreign_server_name</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records._PgForeignServersRecord, java.lang.String> FOREIGN_SERVER_NAME = createField("foreign_server_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema._pg_foreign_servers.foreign_data_wrapper_catalog</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records._PgForeignServersRecord, java.lang.String> FOREIGN_DATA_WRAPPER_CATALOG = createField("foreign_data_wrapper_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema._pg_foreign_servers.foreign_data_wrapper_name</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records._PgForeignServersRecord, java.lang.String> FOREIGN_DATA_WRAPPER_NAME = createField("foreign_data_wrapper_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema._pg_foreign_servers.foreign_server_type</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records._PgForeignServersRecord, java.lang.String> FOREIGN_SERVER_TYPE = createField("foreign_server_type", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema._pg_foreign_servers.foreign_server_version</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records._PgForeignServersRecord, java.lang.String> FOREIGN_SERVER_VERSION = createField("foreign_server_version", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema._pg_foreign_servers.authorization_identifier</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records._PgForeignServersRecord, java.lang.String> AUTHORIZATION_IDENTIFIER = createField("authorization_identifier", org.jooq.impl.SQLDataType.VARCHAR, this);

	public _PgForeignServers() {
		super("_pg_foreign_servers", test.generated.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}

	public _PgForeignServers(java.lang.String alias) {
		super(alias, test.generated.information_schema.InformationSchema.INFORMATION_SCHEMA, test.generated.information_schema.tables._PgForeignServers._PG_FOREIGN_SERVERS);
	}

	@Override
	public test.generated.information_schema.tables._PgForeignServers as(java.lang.String alias) {
		return new test.generated.information_schema.tables._PgForeignServers(alias);
	}
}
