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
public class PgStatBgwriterRecord extends org.jooq.impl.TableRecordImpl<test.generated.pg_catalog.tables.records.PgStatBgwriterRecord> {

	private static final long serialVersionUID = 383327506;

	/**
	 * The table column <code>pg_catalog.pg_stat_bgwriter.checkpoints_timed</code>
	 */
	public void setCheckpointsTimed(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatBgwriter.PG_STAT_BGWRITER.CHECKPOINTS_TIMED, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_bgwriter.checkpoints_timed</code>
	 */
	public java.lang.Long getCheckpointsTimed() {
		return getValue(test.generated.pg_catalog.tables.PgStatBgwriter.PG_STAT_BGWRITER.CHECKPOINTS_TIMED);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_bgwriter.checkpoints_req</code>
	 */
	public void setCheckpointsReq(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatBgwriter.PG_STAT_BGWRITER.CHECKPOINTS_REQ, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_bgwriter.checkpoints_req</code>
	 */
	public java.lang.Long getCheckpointsReq() {
		return getValue(test.generated.pg_catalog.tables.PgStatBgwriter.PG_STAT_BGWRITER.CHECKPOINTS_REQ);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_bgwriter.buffers_checkpoint</code>
	 */
	public void setBuffersCheckpoint(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatBgwriter.PG_STAT_BGWRITER.BUFFERS_CHECKPOINT, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_bgwriter.buffers_checkpoint</code>
	 */
	public java.lang.Long getBuffersCheckpoint() {
		return getValue(test.generated.pg_catalog.tables.PgStatBgwriter.PG_STAT_BGWRITER.BUFFERS_CHECKPOINT);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_bgwriter.buffers_clean</code>
	 */
	public void setBuffersClean(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatBgwriter.PG_STAT_BGWRITER.BUFFERS_CLEAN, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_bgwriter.buffers_clean</code>
	 */
	public java.lang.Long getBuffersClean() {
		return getValue(test.generated.pg_catalog.tables.PgStatBgwriter.PG_STAT_BGWRITER.BUFFERS_CLEAN);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_bgwriter.maxwritten_clean</code>
	 */
	public void setMaxwrittenClean(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatBgwriter.PG_STAT_BGWRITER.MAXWRITTEN_CLEAN, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_bgwriter.maxwritten_clean</code>
	 */
	public java.lang.Long getMaxwrittenClean() {
		return getValue(test.generated.pg_catalog.tables.PgStatBgwriter.PG_STAT_BGWRITER.MAXWRITTEN_CLEAN);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_bgwriter.buffers_backend</code>
	 */
	public void setBuffersBackend(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatBgwriter.PG_STAT_BGWRITER.BUFFERS_BACKEND, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_bgwriter.buffers_backend</code>
	 */
	public java.lang.Long getBuffersBackend() {
		return getValue(test.generated.pg_catalog.tables.PgStatBgwriter.PG_STAT_BGWRITER.BUFFERS_BACKEND);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_bgwriter.buffers_alloc</code>
	 */
	public void setBuffersAlloc(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatBgwriter.PG_STAT_BGWRITER.BUFFERS_ALLOC, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_bgwriter.buffers_alloc</code>
	 */
	public java.lang.Long getBuffersAlloc() {
		return getValue(test.generated.pg_catalog.tables.PgStatBgwriter.PG_STAT_BGWRITER.BUFFERS_ALLOC);
	}

	/**
	 * Create a detached PgStatBgwriterRecord
	 */
	public PgStatBgwriterRecord() {
		super(test.generated.pg_catalog.tables.PgStatBgwriter.PG_STAT_BGWRITER);
	}
}
