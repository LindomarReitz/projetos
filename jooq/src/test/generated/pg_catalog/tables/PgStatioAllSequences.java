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
public class PgStatioAllSequences extends org.jooq.impl.TableImpl<test.generated.pg_catalog.tables.records.PgStatioAllSequencesRecord> {

	private static final long serialVersionUID = -102415314;

	/**
	 * The singleton instance of pg_catalog.pg_statio_all_sequences
	 */
	public static final test.generated.pg_catalog.tables.PgStatioAllSequences PG_STATIO_ALL_SEQUENCES = new test.generated.pg_catalog.tables.PgStatioAllSequences();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.pg_catalog.tables.records.PgStatioAllSequencesRecord> getRecordType() {
		return test.generated.pg_catalog.tables.records.PgStatioAllSequencesRecord.class;
	}

	/**
	 * The table column <code>pg_catalog.pg_statio_all_sequences.relid</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatioAllSequencesRecord, java.lang.Long> RELID = createField("relid", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_statio_all_sequences.schemaname</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatioAllSequencesRecord, java.lang.String> SCHEMANAME = createField("schemaname", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_statio_all_sequences.relname</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatioAllSequencesRecord, java.lang.String> RELNAME = createField("relname", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_statio_all_sequences.blks_read</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatioAllSequencesRecord, java.lang.Long> BLKS_READ = createField("blks_read", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_statio_all_sequences.blks_hit</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgStatioAllSequencesRecord, java.lang.Long> BLKS_HIT = createField("blks_hit", org.jooq.impl.SQLDataType.BIGINT, this);

	public PgStatioAllSequences() {
		super("pg_statio_all_sequences", test.generated.pg_catalog.PgCatalog.PG_CATALOG);
	}

	public PgStatioAllSequences(java.lang.String alias) {
		super(alias, test.generated.pg_catalog.PgCatalog.PG_CATALOG, test.generated.pg_catalog.tables.PgStatioAllSequences.PG_STATIO_ALL_SEQUENCES);
	}

	@Override
	public test.generated.pg_catalog.tables.PgStatioAllSequences as(java.lang.String alias) {
		return new test.generated.pg_catalog.tables.PgStatioAllSequences(alias);
	}
}