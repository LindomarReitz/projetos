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
public class PgStatAllIndexesRecord extends org.jooq.impl.TableRecordImpl<test.generated.pg_catalog.tables.records.PgStatAllIndexesRecord> {

	private static final long serialVersionUID = 811429505;

	/**
	 * The table column <code>pg_catalog.pg_stat_all_indexes.relid</code>
	 */
	public void setRelid(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatAllIndexes.PG_STAT_ALL_INDEXES.RELID, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_indexes.relid</code>
	 */
	public java.lang.Long getRelid() {
		return getValue(test.generated.pg_catalog.tables.PgStatAllIndexes.PG_STAT_ALL_INDEXES.RELID);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_indexes.indexrelid</code>
	 */
	public void setIndexrelid(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatAllIndexes.PG_STAT_ALL_INDEXES.INDEXRELID, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_indexes.indexrelid</code>
	 */
	public java.lang.Long getIndexrelid() {
		return getValue(test.generated.pg_catalog.tables.PgStatAllIndexes.PG_STAT_ALL_INDEXES.INDEXRELID);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_indexes.schemaname</code>
	 */
	public void setSchemaname(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgStatAllIndexes.PG_STAT_ALL_INDEXES.SCHEMANAME, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_indexes.schemaname</code>
	 */
	public java.lang.String getSchemaname() {
		return getValue(test.generated.pg_catalog.tables.PgStatAllIndexes.PG_STAT_ALL_INDEXES.SCHEMANAME);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_indexes.relname</code>
	 */
	public void setRelname(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgStatAllIndexes.PG_STAT_ALL_INDEXES.RELNAME, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_indexes.relname</code>
	 */
	public java.lang.String getRelname() {
		return getValue(test.generated.pg_catalog.tables.PgStatAllIndexes.PG_STAT_ALL_INDEXES.RELNAME);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_indexes.indexrelname</code>
	 */
	public void setIndexrelname(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgStatAllIndexes.PG_STAT_ALL_INDEXES.INDEXRELNAME, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_indexes.indexrelname</code>
	 */
	public java.lang.String getIndexrelname() {
		return getValue(test.generated.pg_catalog.tables.PgStatAllIndexes.PG_STAT_ALL_INDEXES.INDEXRELNAME);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_indexes.idx_scan</code>
	 */
	public void setIdxScan(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatAllIndexes.PG_STAT_ALL_INDEXES.IDX_SCAN, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_indexes.idx_scan</code>
	 */
	public java.lang.Long getIdxScan() {
		return getValue(test.generated.pg_catalog.tables.PgStatAllIndexes.PG_STAT_ALL_INDEXES.IDX_SCAN);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_indexes.idx_tup_read</code>
	 */
	public void setIdxTupRead(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatAllIndexes.PG_STAT_ALL_INDEXES.IDX_TUP_READ, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_indexes.idx_tup_read</code>
	 */
	public java.lang.Long getIdxTupRead() {
		return getValue(test.generated.pg_catalog.tables.PgStatAllIndexes.PG_STAT_ALL_INDEXES.IDX_TUP_READ);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_indexes.idx_tup_fetch</code>
	 */
	public void setIdxTupFetch(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatAllIndexes.PG_STAT_ALL_INDEXES.IDX_TUP_FETCH, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_indexes.idx_tup_fetch</code>
	 */
	public java.lang.Long getIdxTupFetch() {
		return getValue(test.generated.pg_catalog.tables.PgStatAllIndexes.PG_STAT_ALL_INDEXES.IDX_TUP_FETCH);
	}

	/**
	 * Create a detached PgStatAllIndexesRecord
	 */
	public PgStatAllIndexesRecord() {
		super(test.generated.pg_catalog.tables.PgStatAllIndexes.PG_STAT_ALL_INDEXES);
	}
}