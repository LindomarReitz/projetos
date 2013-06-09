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
public class PgStatActivity extends org.jooq.impl.TableImpl<test.generated.pg_catalog.tables.records.PgStatActivityRecord> {

	private static final long serialVersionUID = -1895265119;

	/**
	 * The singleton instance of pg_catalog.pg_stat_activity
	 */
	public static final test.generated.pg_catalog.tables.PgStatActivity PG_STAT_ACTIVITY = new test.generated.pg_catalog.tables.PgStatActivity();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.pg_catalog.tables.records.PgStatActivityRecord> getRecordType() {
		return test.generated.pg_catalog.tables.records.PgStatActivityRecord.class;
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_activity.datid</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatActivityRecord, java.lang.Long> DATID = createField("datid", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_stat_activity.datname</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatActivityRecord, java.lang.String> DATNAME = createField("datname", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_stat_activity.procpid</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatActivityRecord, java.lang.Integer> PROCPID = createField("procpid", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>pg_catalog.pg_stat_activity.usesysid</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatActivityRecord, java.lang.Long> USESYSID = createField("usesysid", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_stat_activity.usename</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatActivityRecord, java.lang.String> USENAME = createField("usename", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_stat_activity.application_name</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatActivityRecord, java.lang.String> APPLICATION_NAME = createField("application_name", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The table column <code>pg_catalog.pg_stat_activity.client_addr</code>
	 * <p>
	 * The SQL type of this item (inet) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatActivityRecord, java.lang.Object> CLIENT_ADDR = createField("client_addr", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("inet"), this);

	/**
	 * The table column <code>pg_catalog.pg_stat_activity.client_port</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatActivityRecord, java.lang.Integer> CLIENT_PORT = createField("client_port", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>pg_catalog.pg_stat_activity.backend_start</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatActivityRecord, java.sql.Timestamp> BACKEND_START = createField("backend_start", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The table column <code>pg_catalog.pg_stat_activity.xact_start</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatActivityRecord, java.sql.Timestamp> XACT_START = createField("xact_start", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The table column <code>pg_catalog.pg_stat_activity.query_start</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatActivityRecord, java.sql.Timestamp> QUERY_START = createField("query_start", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The table column <code>pg_catalog.pg_stat_activity.waiting</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatActivityRecord, java.lang.Boolean> WAITING = createField("waiting", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>pg_catalog.pg_stat_activity.current_query</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatActivityRecord, java.lang.String> CURRENT_QUERY = createField("current_query", org.jooq.impl.SQLDataType.CLOB, this);

	public PgStatActivity() {
		super("pg_stat_activity", test.generated.pg_catalog.PgCatalog.PG_CATALOG);
	}

	public PgStatActivity(java.lang.String alias) {
		super(alias, test.generated.pg_catalog.PgCatalog.PG_CATALOG, test.generated.pg_catalog.tables.PgStatActivity.PG_STAT_ACTIVITY);
	}

	@Override
	public test.generated.pg_catalog.tables.PgStatActivity as(java.lang.String alias) {
		return new test.generated.pg_catalog.tables.PgStatActivity(alias);
	}
}
