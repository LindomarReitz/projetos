/**
 * This class is generated by jOOQ
 */
package test.generated.pg_catalog.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class PgForeignServer extends org.jooq.impl.TableImpl<test.generated.pg_catalog.tables.records.PgForeignServerRecord> {

	private static final long serialVersionUID = 373877818;

	/**
	 * The singleton instance of pg_catalog.pg_foreign_server
	 */
	public static final test.generated.pg_catalog.tables.PgForeignServer PG_FOREIGN_SERVER = new test.generated.pg_catalog.tables.PgForeignServer();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.pg_catalog.tables.records.PgForeignServerRecord> getRecordType() {
		return test.generated.pg_catalog.tables.records.PgForeignServerRecord.class;
	}

	/**
	 * The table column <code>pg_catalog.pg_foreign_server.srvname</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgForeignServerRecord, java.lang.String> SRVNAME = createField("srvname", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_foreign_server.srvowner</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgForeignServerRecord, java.lang.Long> SRVOWNER = createField("srvowner", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_foreign_server.srvfdw</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgForeignServerRecord, java.lang.Long> SRVFDW = createField("srvfdw", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_foreign_server.srvtype</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgForeignServerRecord, java.lang.String> SRVTYPE = createField("srvtype", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The table column <code>pg_catalog.pg_foreign_server.srvversion</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgForeignServerRecord, java.lang.String> SRVVERSION = createField("srvversion", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The table column <code>pg_catalog.pg_foreign_server.srvacl</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgForeignServerRecord, java.lang.String[]> SRVACL = createField("srvacl", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this);

	/**
	 * The table column <code>pg_catalog.pg_foreign_server.srvoptions</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgForeignServerRecord, java.lang.String[]> SRVOPTIONS = createField("srvoptions", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this);

	public PgForeignServer() {
		super("pg_foreign_server", test.generated.pg_catalog.PgCatalog.PG_CATALOG);
	}

	public PgForeignServer(java.lang.String alias) {
		super(alias, test.generated.pg_catalog.PgCatalog.PG_CATALOG, test.generated.pg_catalog.tables.PgForeignServer.PG_FOREIGN_SERVER);
	}

	@Override
	public test.generated.pg_catalog.tables.PgForeignServer as(java.lang.String alias) {
		return new test.generated.pg_catalog.tables.PgForeignServer(alias);
	}
}
