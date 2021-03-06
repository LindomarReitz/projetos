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
public class PgStatioSysSequences extends org.jooq.impl.TableImpl<test.generated.pg_catalog.tables.records.PgStatioSysSequencesRecord> {

	private static final long serialVersionUID = 1171842594;

	/**
	 * The singleton instance of pg_catalog.pg_statio_sys_sequences
	 */
	public static final test.generated.pg_catalog.tables.PgStatioSysSequences PG_STATIO_SYS_SEQUENCES = new test.generated.pg_catalog.tables.PgStatioSysSequences();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.pg_catalog.tables.records.PgStatioSysSequencesRecord> getRecordType() {
		return test.generated.pg_catalog.tables.records.PgStatioSysSequencesRecord.class;
	}

	/**
	 * The table column <code>pg_catalog.pg_statio_sys_sequences.relid</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatioSysSequencesRecord, java.lang.Long> RELID = createField("relid", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_statio_sys_sequences.schemaname</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatioSysSequencesRecord, java.lang.String> SCHEMANAME = createField("schemaname", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_statio_sys_sequences.relname</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatioSysSequencesRecord, java.lang.String> RELNAME = createField("relname", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_statio_sys_sequences.blks_read</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatioSysSequencesRecord, java.lang.Long> BLKS_READ = createField("blks_read", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_statio_sys_sequences.blks_hit</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatioSysSequencesRecord, java.lang.Long> BLKS_HIT = createField("blks_hit", org.jooq.impl.SQLDataType.BIGINT, this);

	public PgStatioSysSequences() {
		super("pg_statio_sys_sequences", test.generated.pg_catalog.PgCatalog.PG_CATALOG);
	}

	public PgStatioSysSequences(java.lang.String alias) {
		super(alias, test.generated.pg_catalog.PgCatalog.PG_CATALOG, test.generated.pg_catalog.tables.PgStatioSysSequences.PG_STATIO_SYS_SEQUENCES);
	}

	@Override
	public test.generated.pg_catalog.tables.PgStatioSysSequences as(java.lang.String alias) {
		return new test.generated.pg_catalog.tables.PgStatioSysSequences(alias);
	}
}
