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
public class PgShadow extends org.jooq.impl.TableImpl<test.generated.pg_catalog.tables.records.PgShadowRecord> {

	private static final long serialVersionUID = 1311607162;

	/**
	 * The singleton instance of pg_catalog.pg_shadow
	 */
	public static final test.generated.pg_catalog.tables.PgShadow PG_SHADOW = new test.generated.pg_catalog.tables.PgShadow();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.pg_catalog.tables.records.PgShadowRecord> getRecordType() {
		return test.generated.pg_catalog.tables.records.PgShadowRecord.class;
	}

	/**
	 * The table column <code>pg_catalog.pg_shadow.usename</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgShadowRecord, java.lang.String> USENAME = createField("usename", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_shadow.usesysid</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgShadowRecord, java.lang.Long> USESYSID = createField("usesysid", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_shadow.usecreatedb</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgShadowRecord, java.lang.Boolean> USECREATEDB = createField("usecreatedb", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>pg_catalog.pg_shadow.usesuper</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgShadowRecord, java.lang.Boolean> USESUPER = createField("usesuper", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>pg_catalog.pg_shadow.usecatupd</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgShadowRecord, java.lang.Boolean> USECATUPD = createField("usecatupd", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>pg_catalog.pg_shadow.passwd</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgShadowRecord, java.lang.String> PASSWD = createField("passwd", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The table column <code>pg_catalog.pg_shadow.valuntil</code>
	 * <p>
	 * The SQL type of this item (abstime) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgShadowRecord, java.lang.Object> VALUNTIL = createField("valuntil", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("abstime"), this);

	/**
	 * The table column <code>pg_catalog.pg_shadow.useconfig</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgShadowRecord, java.lang.String[]> USECONFIG = createField("useconfig", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this);

	public PgShadow() {
		super("pg_shadow", test.generated.pg_catalog.PgCatalog.PG_CATALOG);
	}

	public PgShadow(java.lang.String alias) {
		super(alias, test.generated.pg_catalog.PgCatalog.PG_CATALOG, test.generated.pg_catalog.tables.PgShadow.PG_SHADOW);
	}

	@Override
	public test.generated.pg_catalog.tables.PgShadow as(java.lang.String alias) {
		return new test.generated.pg_catalog.tables.PgShadow(alias);
	}
}
