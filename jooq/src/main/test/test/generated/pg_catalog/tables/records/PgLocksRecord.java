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
public class PgLocksRecord extends org.jooq.impl.TableRecordImpl<test.generated.pg_catalog.tables.records.PgLocksRecord> {

	private static final long serialVersionUID = 744786091;

	/**
	 * The table column <code>pg_catalog.pg_locks.locktype</code>
	 */
	public void setLocktype(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgLocks.PG_LOCKS.LOCKTYPE, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_locks.locktype</code>
	 */
	public java.lang.String getLocktype() {
		return getValue(test.generated.pg_catalog.tables.PgLocks.PG_LOCKS.LOCKTYPE);
	}

	/**
	 * The table column <code>pg_catalog.pg_locks.database</code>
	 */
	public void setDatabase(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgLocks.PG_LOCKS.DATABASE, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_locks.database</code>
	 */
	public java.lang.Long getDatabase() {
		return getValue(test.generated.pg_catalog.tables.PgLocks.PG_LOCKS.DATABASE);
	}

	/**
	 * The table column <code>pg_catalog.pg_locks.relation</code>
	 */
	public void setRelation(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgLocks.PG_LOCKS.RELATION, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_locks.relation</code>
	 */
	public java.lang.Long getRelation() {
		return getValue(test.generated.pg_catalog.tables.PgLocks.PG_LOCKS.RELATION);
	}

	/**
	 * The table column <code>pg_catalog.pg_locks.page</code>
	 */
	public void setPage(java.lang.Integer value) {
		setValue(test.generated.pg_catalog.tables.PgLocks.PG_LOCKS.PAGE, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_locks.page</code>
	 */
	public java.lang.Integer getPage() {
		return getValue(test.generated.pg_catalog.tables.PgLocks.PG_LOCKS.PAGE);
	}

	/**
	 * The table column <code>pg_catalog.pg_locks.tuple</code>
	 */
	public void setTuple(java.lang.Short value) {
		setValue(test.generated.pg_catalog.tables.PgLocks.PG_LOCKS.TUPLE, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_locks.tuple</code>
	 */
	public java.lang.Short getTuple() {
		return getValue(test.generated.pg_catalog.tables.PgLocks.PG_LOCKS.TUPLE);
	}

	/**
	 * The table column <code>pg_catalog.pg_locks.virtualxid</code>
	 */
	public void setVirtualxid(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgLocks.PG_LOCKS.VIRTUALXID, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_locks.virtualxid</code>
	 */
	public java.lang.String getVirtualxid() {
		return getValue(test.generated.pg_catalog.tables.PgLocks.PG_LOCKS.VIRTUALXID);
	}

	/**
	 * The table column <code>pg_catalog.pg_locks.transactionid</code>
	 */
	public void setTransactionid(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgLocks.PG_LOCKS.TRANSACTIONID, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_locks.transactionid</code>
	 */
	public java.lang.Long getTransactionid() {
		return getValue(test.generated.pg_catalog.tables.PgLocks.PG_LOCKS.TRANSACTIONID);
	}

	/**
	 * The table column <code>pg_catalog.pg_locks.classid</code>
	 */
	public void setClassid(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgLocks.PG_LOCKS.CLASSID, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_locks.classid</code>
	 */
	public java.lang.Long getClassid() {
		return getValue(test.generated.pg_catalog.tables.PgLocks.PG_LOCKS.CLASSID);
	}

	/**
	 * The table column <code>pg_catalog.pg_locks.objid</code>
	 */
	public void setObjid(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgLocks.PG_LOCKS.OBJID, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_locks.objid</code>
	 */
	public java.lang.Long getObjid() {
		return getValue(test.generated.pg_catalog.tables.PgLocks.PG_LOCKS.OBJID);
	}

	/**
	 * The table column <code>pg_catalog.pg_locks.objsubid</code>
	 */
	public void setObjsubid(java.lang.Short value) {
		setValue(test.generated.pg_catalog.tables.PgLocks.PG_LOCKS.OBJSUBID, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_locks.objsubid</code>
	 */
	public java.lang.Short getObjsubid() {
		return getValue(test.generated.pg_catalog.tables.PgLocks.PG_LOCKS.OBJSUBID);
	}

	/**
	 * The table column <code>pg_catalog.pg_locks.virtualtransaction</code>
	 */
	public void setVirtualtransaction(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgLocks.PG_LOCKS.VIRTUALTRANSACTION, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_locks.virtualtransaction</code>
	 */
	public java.lang.String getVirtualtransaction() {
		return getValue(test.generated.pg_catalog.tables.PgLocks.PG_LOCKS.VIRTUALTRANSACTION);
	}

	/**
	 * The table column <code>pg_catalog.pg_locks.pid</code>
	 */
	public void setPid(java.lang.Integer value) {
		setValue(test.generated.pg_catalog.tables.PgLocks.PG_LOCKS.PID, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_locks.pid</code>
	 */
	public java.lang.Integer getPid() {
		return getValue(test.generated.pg_catalog.tables.PgLocks.PG_LOCKS.PID);
	}

	/**
	 * The table column <code>pg_catalog.pg_locks.mode</code>
	 */
	public void setMode(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgLocks.PG_LOCKS.MODE, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_locks.mode</code>
	 */
	public java.lang.String getMode() {
		return getValue(test.generated.pg_catalog.tables.PgLocks.PG_LOCKS.MODE);
	}

	/**
	 * The table column <code>pg_catalog.pg_locks.granted</code>
	 */
	public void setGranted(java.lang.Boolean value) {
		setValue(test.generated.pg_catalog.tables.PgLocks.PG_LOCKS.GRANTED, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_locks.granted</code>
	 */
	public java.lang.Boolean getGranted() {
		return getValue(test.generated.pg_catalog.tables.PgLocks.PG_LOCKS.GRANTED);
	}

	/**
	 * Create a detached PgLocksRecord
	 */
	public PgLocksRecord() {
		super(test.generated.pg_catalog.tables.PgLocks.PG_LOCKS);
	}
}