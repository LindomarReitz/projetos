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
public class PgStatioUserTablesRecord extends org.jooq.impl.TableRecordImpl<test.generated.pg_catalog.tables.records.PgStatioUserTablesRecord> {

	private static final long serialVersionUID = 1341581585;

	/**
	 * The table column <code>pg_catalog.pg_statio_user_tables.relid</code>
	 */
	public void setRelid(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatioUserTables.PG_STATIO_USER_TABLES.RELID, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_statio_user_tables.relid</code>
	 */
	public java.lang.Long getRelid() {
		return getValue(test.generated.pg_catalog.tables.PgStatioUserTables.PG_STATIO_USER_TABLES.RELID);
	}

	/**
	 * The table column <code>pg_catalog.pg_statio_user_tables.schemaname</code>
	 */
	public void setSchemaname(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgStatioUserTables.PG_STATIO_USER_TABLES.SCHEMANAME, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_statio_user_tables.schemaname</code>
	 */
	public java.lang.String getSchemaname() {
		return getValue(test.generated.pg_catalog.tables.PgStatioUserTables.PG_STATIO_USER_TABLES.SCHEMANAME);
	}

	/**
	 * The table column <code>pg_catalog.pg_statio_user_tables.relname</code>
	 */
	public void setRelname(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgStatioUserTables.PG_STATIO_USER_TABLES.RELNAME, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_statio_user_tables.relname</code>
	 */
	public java.lang.String getRelname() {
		return getValue(test.generated.pg_catalog.tables.PgStatioUserTables.PG_STATIO_USER_TABLES.RELNAME);
	}

	/**
	 * The table column <code>pg_catalog.pg_statio_user_tables.heap_blks_read</code>
	 */
	public void setHeapBlksRead(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatioUserTables.PG_STATIO_USER_TABLES.HEAP_BLKS_READ, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_statio_user_tables.heap_blks_read</code>
	 */
	public java.lang.Long getHeapBlksRead() {
		return getValue(test.generated.pg_catalog.tables.PgStatioUserTables.PG_STATIO_USER_TABLES.HEAP_BLKS_READ);
	}

	/**
	 * The table column <code>pg_catalog.pg_statio_user_tables.heap_blks_hit</code>
	 */
	public void setHeapBlksHit(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatioUserTables.PG_STATIO_USER_TABLES.HEAP_BLKS_HIT, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_statio_user_tables.heap_blks_hit</code>
	 */
	public java.lang.Long getHeapBlksHit() {
		return getValue(test.generated.pg_catalog.tables.PgStatioUserTables.PG_STATIO_USER_TABLES.HEAP_BLKS_HIT);
	}

	/**
	 * The table column <code>pg_catalog.pg_statio_user_tables.idx_blks_read</code>
	 */
	public void setIdxBlksRead(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatioUserTables.PG_STATIO_USER_TABLES.IDX_BLKS_READ, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_statio_user_tables.idx_blks_read</code>
	 */
	public java.lang.Long getIdxBlksRead() {
		return getValue(test.generated.pg_catalog.tables.PgStatioUserTables.PG_STATIO_USER_TABLES.IDX_BLKS_READ);
	}

	/**
	 * The table column <code>pg_catalog.pg_statio_user_tables.idx_blks_hit</code>
	 */
	public void setIdxBlksHit(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatioUserTables.PG_STATIO_USER_TABLES.IDX_BLKS_HIT, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_statio_user_tables.idx_blks_hit</code>
	 */
	public java.lang.Long getIdxBlksHit() {
		return getValue(test.generated.pg_catalog.tables.PgStatioUserTables.PG_STATIO_USER_TABLES.IDX_BLKS_HIT);
	}

	/**
	 * The table column <code>pg_catalog.pg_statio_user_tables.toast_blks_read</code>
	 */
	public void setToastBlksRead(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatioUserTables.PG_STATIO_USER_TABLES.TOAST_BLKS_READ, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_statio_user_tables.toast_blks_read</code>
	 */
	public java.lang.Long getToastBlksRead() {
		return getValue(test.generated.pg_catalog.tables.PgStatioUserTables.PG_STATIO_USER_TABLES.TOAST_BLKS_READ);
	}

	/**
	 * The table column <code>pg_catalog.pg_statio_user_tables.toast_blks_hit</code>
	 */
	public void setToastBlksHit(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatioUserTables.PG_STATIO_USER_TABLES.TOAST_BLKS_HIT, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_statio_user_tables.toast_blks_hit</code>
	 */
	public java.lang.Long getToastBlksHit() {
		return getValue(test.generated.pg_catalog.tables.PgStatioUserTables.PG_STATIO_USER_TABLES.TOAST_BLKS_HIT);
	}

	/**
	 * The table column <code>pg_catalog.pg_statio_user_tables.tidx_blks_read</code>
	 */
	public void setTidxBlksRead(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatioUserTables.PG_STATIO_USER_TABLES.TIDX_BLKS_READ, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_statio_user_tables.tidx_blks_read</code>
	 */
	public java.lang.Long getTidxBlksRead() {
		return getValue(test.generated.pg_catalog.tables.PgStatioUserTables.PG_STATIO_USER_TABLES.TIDX_BLKS_READ);
	}

	/**
	 * The table column <code>pg_catalog.pg_statio_user_tables.tidx_blks_hit</code>
	 */
	public void setTidxBlksHit(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatioUserTables.PG_STATIO_USER_TABLES.TIDX_BLKS_HIT, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_statio_user_tables.tidx_blks_hit</code>
	 */
	public java.lang.Long getTidxBlksHit() {
		return getValue(test.generated.pg_catalog.tables.PgStatioUserTables.PG_STATIO_USER_TABLES.TIDX_BLKS_HIT);
	}

	/**
	 * Create a detached PgStatioUserTablesRecord
	 */
	public PgStatioUserTablesRecord() {
		super(test.generated.pg_catalog.tables.PgStatioUserTables.PG_STATIO_USER_TABLES);
	}
}