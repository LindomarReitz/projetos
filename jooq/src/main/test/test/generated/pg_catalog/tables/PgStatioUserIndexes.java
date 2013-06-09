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
public class PgStatioUserIndexes extends org.jooq.impl.TableImpl<test.generated.pg_catalog.tables.records.PgStatioUserIndexesRecord> {

	private static final long serialVersionUID = -2062638261;

	/**
	 * The singleton instance of pg_catalog.pg_statio_user_indexes
	 */
	public static final test.generated.pg_catalog.tables.PgStatioUserIndexes PG_STATIO_USER_INDEXES = new test.generated.pg_catalog.tables.PgStatioUserIndexes();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.pg_catalog.tables.records.PgStatioUserIndexesRecord> getRecordType() {
		return test.generated.pg_catalog.tables.records.PgStatioUserIndexesRecord.class;
	}

	/**
	 * The table column <code>pg_catalog.pg_statio_user_indexes.relid</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatioUserIndexesRecord, java.lang.Long> RELID = createField("relid", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_statio_user_indexes.indexrelid</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatioUserIndexesRecord, java.lang.Long> INDEXRELID = createField("indexrelid", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_statio_user_indexes.schemaname</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatioUserIndexesRecord, java.lang.String> SCHEMANAME = createField("schemaname", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_statio_user_indexes.relname</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatioUserIndexesRecord, java.lang.String> RELNAME = createField("relname", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_statio_user_indexes.indexrelname</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatioUserIndexesRecord, java.lang.String> INDEXRELNAME = createField("indexrelname", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_statio_user_indexes.idx_blks_read</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatioUserIndexesRecord, java.lang.Long> IDX_BLKS_READ = createField("idx_blks_read", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_statio_user_indexes.idx_blks_hit</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatioUserIndexesRecord, java.lang.Long> IDX_BLKS_HIT = createField("idx_blks_hit", org.jooq.impl.SQLDataType.BIGINT, this);

	public PgStatioUserIndexes() {
		super("pg_statio_user_indexes", test.generated.pg_catalog.PgCatalog.PG_CATALOG);
	}

	public PgStatioUserIndexes(java.lang.String alias) {
		super(alias, test.generated.pg_catalog.PgCatalog.PG_CATALOG, test.generated.pg_catalog.tables.PgStatioUserIndexes.PG_STATIO_USER_INDEXES);
	}

	@Override
	public test.generated.pg_catalog.tables.PgStatioUserIndexes as(java.lang.String alias) {
		return new test.generated.pg_catalog.tables.PgStatioUserIndexes(alias);
	}
}
