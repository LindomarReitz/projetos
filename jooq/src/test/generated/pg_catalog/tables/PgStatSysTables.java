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
public class PgStatSysTables extends org.jooq.impl.TableImpl<test.generated.pg_catalog.tables.records.PgStatSysTablesRecord> {

	private static final long serialVersionUID = 1623912953;

	/**
	 * The singleton instance of pg_catalog.pg_stat_sys_tables
	 */
	public static final test.generated.pg_catalog.tables.PgStatSysTables PG_STAT_SYS_TABLES = new test.generated.pg_catalog.tables.PgStatSysTables();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.pg_catalog.tables.records.PgStatSysTablesRecord> getRecordType() {
		return test.generated.pg_catalog.tables.records.PgStatSysTablesRecord.class;
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_sys_tables.relid</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatSysTablesRecord, java.lang.Long> RELID = createField("relid", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_stat_sys_tables.schemaname</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatSysTablesRecord, java.lang.String> SCHEMANAME = createField("schemaname", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_stat_sys_tables.relname</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatSysTablesRecord, java.lang.String> RELNAME = createField("relname", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_stat_sys_tables.seq_scan</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatSysTablesRecord, java.lang.Long> SEQ_SCAN = createField("seq_scan", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_stat_sys_tables.seq_tup_read</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatSysTablesRecord, java.lang.Long> SEQ_TUP_READ = createField("seq_tup_read", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_stat_sys_tables.idx_scan</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatSysTablesRecord, java.lang.Long> IDX_SCAN = createField("idx_scan", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_stat_sys_tables.idx_tup_fetch</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatSysTablesRecord, java.lang.Long> IDX_TUP_FETCH = createField("idx_tup_fetch", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_stat_sys_tables.n_tup_ins</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatSysTablesRecord, java.lang.Long> N_TUP_INS = createField("n_tup_ins", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_stat_sys_tables.n_tup_upd</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatSysTablesRecord, java.lang.Long> N_TUP_UPD = createField("n_tup_upd", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_stat_sys_tables.n_tup_del</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatSysTablesRecord, java.lang.Long> N_TUP_DEL = createField("n_tup_del", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_stat_sys_tables.n_tup_hot_upd</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatSysTablesRecord, java.lang.Long> N_TUP_HOT_UPD = createField("n_tup_hot_upd", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_stat_sys_tables.n_live_tup</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatSysTablesRecord, java.lang.Long> N_LIVE_TUP = createField("n_live_tup", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_stat_sys_tables.n_dead_tup</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatSysTablesRecord, java.lang.Long> N_DEAD_TUP = createField("n_dead_tup", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_stat_sys_tables.last_vacuum</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatSysTablesRecord, java.sql.Timestamp> LAST_VACUUM = createField("last_vacuum", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The table column <code>pg_catalog.pg_stat_sys_tables.last_autovacuum</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatSysTablesRecord, java.sql.Timestamp> LAST_AUTOVACUUM = createField("last_autovacuum", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The table column <code>pg_catalog.pg_stat_sys_tables.last_analyze</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatSysTablesRecord, java.sql.Timestamp> LAST_ANALYZE = createField("last_analyze", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The table column <code>pg_catalog.pg_stat_sys_tables.last_autoanalyze</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatSysTablesRecord, java.sql.Timestamp> LAST_AUTOANALYZE = createField("last_autoanalyze", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	public PgStatSysTables() {
		super("pg_stat_sys_tables", test.generated.pg_catalog.PgCatalog.PG_CATALOG);
	}

	public PgStatSysTables(java.lang.String alias) {
		super(alias, test.generated.pg_catalog.PgCatalog.PG_CATALOG, test.generated.pg_catalog.tables.PgStatSysTables.PG_STAT_SYS_TABLES);
	}

	@Override
	public test.generated.pg_catalog.tables.PgStatSysTables as(java.lang.String alias) {
		return new test.generated.pg_catalog.tables.PgStatSysTables(alias);
	}
}