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
public class PgStatAllTablesRecord extends org.jooq.impl.TableRecordImpl<test.generated.pg_catalog.tables.records.PgStatAllTablesRecord> {

	private static final long serialVersionUID = 92895979;

	/**
	 * The table column <code>pg_catalog.pg_stat_all_tables.relid</code>
	 */
	public void setRelid(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatAllTables.PG_STAT_ALL_TABLES.RELID, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_tables.relid</code>
	 */
	public java.lang.Long getRelid() {
		return getValue(test.generated.pg_catalog.tables.PgStatAllTables.PG_STAT_ALL_TABLES.RELID);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_tables.schemaname</code>
	 */
	public void setSchemaname(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgStatAllTables.PG_STAT_ALL_TABLES.SCHEMANAME, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_tables.schemaname</code>
	 */
	public java.lang.String getSchemaname() {
		return getValue(test.generated.pg_catalog.tables.PgStatAllTables.PG_STAT_ALL_TABLES.SCHEMANAME);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_tables.relname</code>
	 */
	public void setRelname(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgStatAllTables.PG_STAT_ALL_TABLES.RELNAME, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_tables.relname</code>
	 */
	public java.lang.String getRelname() {
		return getValue(test.generated.pg_catalog.tables.PgStatAllTables.PG_STAT_ALL_TABLES.RELNAME);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_tables.seq_scan</code>
	 */
	public void setSeqScan(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatAllTables.PG_STAT_ALL_TABLES.SEQ_SCAN, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_tables.seq_scan</code>
	 */
	public java.lang.Long getSeqScan() {
		return getValue(test.generated.pg_catalog.tables.PgStatAllTables.PG_STAT_ALL_TABLES.SEQ_SCAN);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_tables.seq_tup_read</code>
	 */
	public void setSeqTupRead(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatAllTables.PG_STAT_ALL_TABLES.SEQ_TUP_READ, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_tables.seq_tup_read</code>
	 */
	public java.lang.Long getSeqTupRead() {
		return getValue(test.generated.pg_catalog.tables.PgStatAllTables.PG_STAT_ALL_TABLES.SEQ_TUP_READ);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_tables.idx_scan</code>
	 */
	public void setIdxScan(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatAllTables.PG_STAT_ALL_TABLES.IDX_SCAN, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_tables.idx_scan</code>
	 */
	public java.lang.Long getIdxScan() {
		return getValue(test.generated.pg_catalog.tables.PgStatAllTables.PG_STAT_ALL_TABLES.IDX_SCAN);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_tables.idx_tup_fetch</code>
	 */
	public void setIdxTupFetch(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatAllTables.PG_STAT_ALL_TABLES.IDX_TUP_FETCH, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_tables.idx_tup_fetch</code>
	 */
	public java.lang.Long getIdxTupFetch() {
		return getValue(test.generated.pg_catalog.tables.PgStatAllTables.PG_STAT_ALL_TABLES.IDX_TUP_FETCH);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_tables.n_tup_ins</code>
	 */
	public void setNTupIns(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatAllTables.PG_STAT_ALL_TABLES.N_TUP_INS, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_tables.n_tup_ins</code>
	 */
	public java.lang.Long getNTupIns() {
		return getValue(test.generated.pg_catalog.tables.PgStatAllTables.PG_STAT_ALL_TABLES.N_TUP_INS);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_tables.n_tup_upd</code>
	 */
	public void setNTupUpd(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatAllTables.PG_STAT_ALL_TABLES.N_TUP_UPD, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_tables.n_tup_upd</code>
	 */
	public java.lang.Long getNTupUpd() {
		return getValue(test.generated.pg_catalog.tables.PgStatAllTables.PG_STAT_ALL_TABLES.N_TUP_UPD);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_tables.n_tup_del</code>
	 */
	public void setNTupDel(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatAllTables.PG_STAT_ALL_TABLES.N_TUP_DEL, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_tables.n_tup_del</code>
	 */
	public java.lang.Long getNTupDel() {
		return getValue(test.generated.pg_catalog.tables.PgStatAllTables.PG_STAT_ALL_TABLES.N_TUP_DEL);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_tables.n_tup_hot_upd</code>
	 */
	public void setNTupHotUpd(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatAllTables.PG_STAT_ALL_TABLES.N_TUP_HOT_UPD, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_tables.n_tup_hot_upd</code>
	 */
	public java.lang.Long getNTupHotUpd() {
		return getValue(test.generated.pg_catalog.tables.PgStatAllTables.PG_STAT_ALL_TABLES.N_TUP_HOT_UPD);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_tables.n_live_tup</code>
	 */
	public void setNLiveTup(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatAllTables.PG_STAT_ALL_TABLES.N_LIVE_TUP, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_tables.n_live_tup</code>
	 */
	public java.lang.Long getNLiveTup() {
		return getValue(test.generated.pg_catalog.tables.PgStatAllTables.PG_STAT_ALL_TABLES.N_LIVE_TUP);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_tables.n_dead_tup</code>
	 */
	public void setNDeadTup(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatAllTables.PG_STAT_ALL_TABLES.N_DEAD_TUP, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_tables.n_dead_tup</code>
	 */
	public java.lang.Long getNDeadTup() {
		return getValue(test.generated.pg_catalog.tables.PgStatAllTables.PG_STAT_ALL_TABLES.N_DEAD_TUP);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_tables.last_vacuum</code>
	 */
	public void setLastVacuum(java.sql.Timestamp value) {
		setValue(test.generated.pg_catalog.tables.PgStatAllTables.PG_STAT_ALL_TABLES.LAST_VACUUM, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_tables.last_vacuum</code>
	 */
	public java.sql.Timestamp getLastVacuum() {
		return getValue(test.generated.pg_catalog.tables.PgStatAllTables.PG_STAT_ALL_TABLES.LAST_VACUUM);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_tables.last_autovacuum</code>
	 */
	public void setLastAutovacuum(java.sql.Timestamp value) {
		setValue(test.generated.pg_catalog.tables.PgStatAllTables.PG_STAT_ALL_TABLES.LAST_AUTOVACUUM, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_tables.last_autovacuum</code>
	 */
	public java.sql.Timestamp getLastAutovacuum() {
		return getValue(test.generated.pg_catalog.tables.PgStatAllTables.PG_STAT_ALL_TABLES.LAST_AUTOVACUUM);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_tables.last_analyze</code>
	 */
	public void setLastAnalyze(java.sql.Timestamp value) {
		setValue(test.generated.pg_catalog.tables.PgStatAllTables.PG_STAT_ALL_TABLES.LAST_ANALYZE, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_tables.last_analyze</code>
	 */
	public java.sql.Timestamp getLastAnalyze() {
		return getValue(test.generated.pg_catalog.tables.PgStatAllTables.PG_STAT_ALL_TABLES.LAST_ANALYZE);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_tables.last_autoanalyze</code>
	 */
	public void setLastAutoanalyze(java.sql.Timestamp value) {
		setValue(test.generated.pg_catalog.tables.PgStatAllTables.PG_STAT_ALL_TABLES.LAST_AUTOANALYZE, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_all_tables.last_autoanalyze</code>
	 */
	public java.sql.Timestamp getLastAutoanalyze() {
		return getValue(test.generated.pg_catalog.tables.PgStatAllTables.PG_STAT_ALL_TABLES.LAST_AUTOANALYZE);
	}

	/**
	 * Create a detached PgStatAllTablesRecord
	 */
	public PgStatAllTablesRecord() {
		super(test.generated.pg_catalog.tables.PgStatAllTables.PG_STAT_ALL_TABLES);
	}
}
