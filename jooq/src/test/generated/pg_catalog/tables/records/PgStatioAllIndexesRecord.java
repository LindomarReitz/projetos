/**
 * This class is generated by jOOQ
 */
package test.generated.pg_catalog.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class PgStatioAllIndexesRecord extends org.jooq.impl.TableRecordImpl<test.generated.pg_catalog.tables.records.PgStatioAllIndexesRecord> {

	private static final long serialVersionUID = 911170817;

	/**
	 * The table column <code>pg_catalog.pg_statio_all_indexes.relid</code>
	 */
	public void setRelid(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatioAllIndexes.PG_STATIO_ALL_INDEXES.RELID, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_statio_all_indexes.relid</code>
	 */
	public java.lang.Long getRelid() {
		return getValue(test.generated.pg_catalog.tables.PgStatioAllIndexes.PG_STATIO_ALL_INDEXES.RELID);
	}

	/**
	 * The table column <code>pg_catalog.pg_statio_all_indexes.indexrelid</code>
	 */
	public void setIndexrelid(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatioAllIndexes.PG_STATIO_ALL_INDEXES.INDEXRELID, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_statio_all_indexes.indexrelid</code>
	 */
	public java.lang.Long getIndexrelid() {
		return getValue(test.generated.pg_catalog.tables.PgStatioAllIndexes.PG_STATIO_ALL_INDEXES.INDEXRELID);
	}

	/**
	 * The table column <code>pg_catalog.pg_statio_all_indexes.schemaname</code>
	 */
	public void setSchemaname(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgStatioAllIndexes.PG_STATIO_ALL_INDEXES.SCHEMANAME, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_statio_all_indexes.schemaname</code>
	 */
	public java.lang.String getSchemaname() {
		return getValue(test.generated.pg_catalog.tables.PgStatioAllIndexes.PG_STATIO_ALL_INDEXES.SCHEMANAME);
	}

	/**
	 * The table column <code>pg_catalog.pg_statio_all_indexes.relname</code>
	 */
	public void setRelname(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgStatioAllIndexes.PG_STATIO_ALL_INDEXES.RELNAME, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_statio_all_indexes.relname</code>
	 */
	public java.lang.String getRelname() {
		return getValue(test.generated.pg_catalog.tables.PgStatioAllIndexes.PG_STATIO_ALL_INDEXES.RELNAME);
	}

	/**
	 * The table column <code>pg_catalog.pg_statio_all_indexes.indexrelname</code>
	 */
	public void setIndexrelname(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgStatioAllIndexes.PG_STATIO_ALL_INDEXES.INDEXRELNAME, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_statio_all_indexes.indexrelname</code>
	 */
	public java.lang.String getIndexrelname() {
		return getValue(test.generated.pg_catalog.tables.PgStatioAllIndexes.PG_STATIO_ALL_INDEXES.INDEXRELNAME);
	}

	/**
	 * The table column <code>pg_catalog.pg_statio_all_indexes.idx_blks_read</code>
	 */
	public void setIdxBlksRead(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatioAllIndexes.PG_STATIO_ALL_INDEXES.IDX_BLKS_READ, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_statio_all_indexes.idx_blks_read</code>
	 */
	public java.lang.Long getIdxBlksRead() {
		return getValue(test.generated.pg_catalog.tables.PgStatioAllIndexes.PG_STATIO_ALL_INDEXES.IDX_BLKS_READ);
	}

	/**
	 * The table column <code>pg_catalog.pg_statio_all_indexes.idx_blks_hit</code>
	 */
	public void setIdxBlksHit(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatioAllIndexes.PG_STATIO_ALL_INDEXES.IDX_BLKS_HIT, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_statio_all_indexes.idx_blks_hit</code>
	 */
	public java.lang.Long getIdxBlksHit() {
		return getValue(test.generated.pg_catalog.tables.PgStatioAllIndexes.PG_STATIO_ALL_INDEXES.IDX_BLKS_HIT);
	}

	/**
	 * Create a detached PgStatioAllIndexesRecord
	 */
	public PgStatioAllIndexesRecord() {
		super(test.generated.pg_catalog.tables.PgStatioAllIndexes.PG_STATIO_ALL_INDEXES);
	}
}