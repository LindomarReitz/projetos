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
public class PgUser extends org.jooq.impl.TableImpl<test.generated.pg_catalog.tables.records.PgUserRecord> {

	private static final long serialVersionUID = -1943111837;

	/**
	 * The singleton instance of pg_catalog.pg_user
	 */
	public static final test.generated.pg_catalog.tables.PgUser PG_USER = new test.generated.pg_catalog.tables.PgUser();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.pg_catalog.tables.records.PgUserRecord> getRecordType() {
		return test.generated.pg_catalog.tables.records.PgUserRecord.class;
	}

	/**
	 * The table column <code>pg_catalog.pg_user.usename</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgUserRecord, java.lang.String> USENAME = createField("usename", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_user.usesysid</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgUserRecord, java.lang.Long> USESYSID = createField("usesysid", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_user.usecreatedb</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgUserRecord, java.lang.Boolean> USECREATEDB = createField("usecreatedb", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>pg_catalog.pg_user.usesuper</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgUserRecord, java.lang.Boolean> USESUPER = createField("usesuper", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>pg_catalog.pg_user.usecatupd</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgUserRecord, java.lang.Boolean> USECATUPD = createField("usecatupd", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>pg_catalog.pg_user.passwd</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgUserRecord, java.lang.String> PASSWD = createField("passwd", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The table column <code>pg_catalog.pg_user.valuntil</code>
	 * <p>
	 * The SQL type of this item (abstime) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgUserRecord, java.lang.Object> VALUNTIL = createField("valuntil", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("abstime"), this);

	/**
	 * The table column <code>pg_catalog.pg_user.useconfig</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgUserRecord, java.lang.String[]> USECONFIG = createField("useconfig", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this);

	public PgUser() {
		super("pg_user", test.generated.pg_catalog.PgCatalog.PG_CATALOG);
	}

	public PgUser(java.lang.String alias) {
		super(alias, test.generated.pg_catalog.PgCatalog.PG_CATALOG, test.generated.pg_catalog.tables.PgUser.PG_USER);
	}

	@Override
	public test.generated.pg_catalog.tables.PgUser as(java.lang.String alias) {
		return new test.generated.pg_catalog.tables.PgUser(alias);
	}
}
