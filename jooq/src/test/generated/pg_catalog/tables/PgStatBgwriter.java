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
public class PgStatBgwriter extends org.jooq.impl.TableImpl<test.generated.pg_catalog.tables.records.PgStatBgwriterRecord> {

	private static final long serialVersionUID = -509067425;

	/**
	 * The singleton instance of pg_catalog.pg_stat_bgwriter
	 */
	public static final test.generated.pg_catalog.tables.PgStatBgwriter PG_STAT_BGWRITER = new test.generated.pg_catalog.tables.PgStatBgwriter();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.pg_catalog.tables.records.PgStatBgwriterRecord> getRecordType() {
		return test.generated.pg_catalog.tables.records.PgStatBgwriterRecord.class;
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_bgwriter.checkpoints_timed</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatBgwriterRecord, java.lang.Long> CHECKPOINTS_TIMED = createField("checkpoints_timed", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_stat_bgwriter.checkpoints_req</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatBgwriterRecord, java.lang.Long> CHECKPOINTS_REQ = createField("checkpoints_req", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_stat_bgwriter.buffers_checkpoint</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatBgwriterRecord, java.lang.Long> BUFFERS_CHECKPOINT = createField("buffers_checkpoint", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_stat_bgwriter.buffers_clean</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatBgwriterRecord, java.lang.Long> BUFFERS_CLEAN = createField("buffers_clean", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_stat_bgwriter.maxwritten_clean</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatBgwriterRecord, java.lang.Long> MAXWRITTEN_CLEAN = createField("maxwritten_clean", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_stat_bgwriter.buffers_backend</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatBgwriterRecord, java.lang.Long> BUFFERS_BACKEND = createField("buffers_backend", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_stat_bgwriter.buffers_alloc</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatBgwriterRecord, java.lang.Long> BUFFERS_ALLOC = createField("buffers_alloc", org.jooq.impl.SQLDataType.BIGINT, this);

	public PgStatBgwriter() {
		super("pg_stat_bgwriter", test.generated.pg_catalog.PgCatalog.PG_CATALOG);
	}

	public PgStatBgwriter(java.lang.String alias) {
		super(alias, test.generated.pg_catalog.PgCatalog.PG_CATALOG, test.generated.pg_catalog.tables.PgStatBgwriter.PG_STAT_BGWRITER);
	}

	@Override
	public test.generated.pg_catalog.tables.PgStatBgwriter as(java.lang.String alias) {
		return new test.generated.pg_catalog.tables.PgStatBgwriter(alias);
	}
}