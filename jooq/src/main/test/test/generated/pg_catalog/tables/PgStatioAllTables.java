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
public class PgStatioAllTables extends org.jooq.impl.TableImpl<test.generated.pg_catalog.tables.records.PgStatioAllTablesRecord> {

	private static final long serialVersionUID = 744256320;

	/**
	 * The singleton instance of pg_catalog.pg_statio_all_tables
	 */
	public static final test.generated.pg_catalog.tables.PgStatioAllTables PG_STATIO_ALL_TABLES = new test.generated.pg_catalog.tables.PgStatioAllTables();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.pg_catalog.tables.records.PgStatioAllTablesRecord> getRecordType() {
		return test.generated.pg_catalog.tables.records.PgStatioAllTablesRecord.class;
	}

	/**
	 * The table column <code>pg_catalog.pg_statio_all_tables.relid</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatioAllTablesRecord, java.lang.Long> RELID = createField("relid", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_statio_all_tables.schemaname</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatioAllTablesRecord, java.lang.String> SCHEMANAME = createField("schemaname", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_statio_all_tables.relname</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatioAllTablesRecord, java.lang.String> RELNAME = createField("relname", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_statio_all_tables.heap_blks_read</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatioAllTablesRecord, java.lang.Long> HEAP_BLKS_READ = createField("heap_blks_read", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_statio_all_tables.heap_blks_hit</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatioAllTablesRecord, java.lang.Long> HEAP_BLKS_HIT = createField("heap_blks_hit", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_statio_all_tables.idx_blks_read</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatioAllTablesRecord, java.lang.Long> IDX_BLKS_READ = createField("idx_blks_read", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_statio_all_tables.idx_blks_hit</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatioAllTablesRecord, java.lang.Long> IDX_BLKS_HIT = createField("idx_blks_hit", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_statio_all_tables.toast_blks_read</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatioAllTablesRecord, java.lang.Long> TOAST_BLKS_READ = createField("toast_blks_read", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_statio_all_tables.toast_blks_hit</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatioAllTablesRecord, java.lang.Long> TOAST_BLKS_HIT = createField("toast_blks_hit", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_statio_all_tables.tidx_blks_read</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatioAllTablesRecord, java.lang.Long> TIDX_BLKS_READ = createField("tidx_blks_read", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_statio_all_tables.tidx_blks_hit</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatioAllTablesRecord, java.lang.Long> TIDX_BLKS_HIT = createField("tidx_blks_hit", org.jooq.impl.SQLDataType.BIGINT, this);

	public PgStatioAllTables() {
		super("pg_statio_all_tables", test.generated.pg_catalog.PgCatalog.PG_CATALOG);
	}

	public PgStatioAllTables(java.lang.String alias) {
		super(alias, test.generated.pg_catalog.PgCatalog.PG_CATALOG, test.generated.pg_catalog.tables.PgStatioAllTables.PG_STATIO_ALL_TABLES);
	}

	@Override
	public test.generated.pg_catalog.tables.PgStatioAllTables as(java.lang.String alias) {
		return new test.generated.pg_catalog.tables.PgStatioAllTables(alias);
	}
}