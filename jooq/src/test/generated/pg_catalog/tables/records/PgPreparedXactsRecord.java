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
public class PgPreparedXactsRecord extends org.jooq.impl.TableRecordImpl<test.generated.pg_catalog.tables.records.PgPreparedXactsRecord> {

	private static final long serialVersionUID = 1680121232;

	/**
	 * The table column <code>pg_catalog.pg_prepared_xacts.transaction</code>
	 */
	public void setTransaction(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgPreparedXacts.PG_PREPARED_XACTS.TRANSACTION, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_prepared_xacts.transaction</code>
	 */
	public java.lang.Long getTransaction() {
		return getValue(test.generated.pg_catalog.tables.PgPreparedXacts.PG_PREPARED_XACTS.TRANSACTION);
	}

	/**
	 * The table column <code>pg_catalog.pg_prepared_xacts.gid</code>
	 */
	public void setGid(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgPreparedXacts.PG_PREPARED_XACTS.GID, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_prepared_xacts.gid</code>
	 */
	public java.lang.String getGid() {
		return getValue(test.generated.pg_catalog.tables.PgPreparedXacts.PG_PREPARED_XACTS.GID);
	}

	/**
	 * The table column <code>pg_catalog.pg_prepared_xacts.prepared</code>
	 */
	public void setPrepared(java.sql.Timestamp value) {
		setValue(test.generated.pg_catalog.tables.PgPreparedXacts.PG_PREPARED_XACTS.PREPARED, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_prepared_xacts.prepared</code>
	 */
	public java.sql.Timestamp getPrepared() {
		return getValue(test.generated.pg_catalog.tables.PgPreparedXacts.PG_PREPARED_XACTS.PREPARED);
	}

	/**
	 * The table column <code>pg_catalog.pg_prepared_xacts.owner</code>
	 */
	public void setOwner(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgPreparedXacts.PG_PREPARED_XACTS.OWNER, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_prepared_xacts.owner</code>
	 */
	public java.lang.String getOwner() {
		return getValue(test.generated.pg_catalog.tables.PgPreparedXacts.PG_PREPARED_XACTS.OWNER);
	}

	/**
	 * The table column <code>pg_catalog.pg_prepared_xacts.database</code>
	 */
	public void setDatabase(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgPreparedXacts.PG_PREPARED_XACTS.DATABASE, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_prepared_xacts.database</code>
	 */
	public java.lang.String getDatabase() {
		return getValue(test.generated.pg_catalog.tables.PgPreparedXacts.PG_PREPARED_XACTS.DATABASE);
	}

	/**
	 * Create a detached PgPreparedXactsRecord
	 */
	public PgPreparedXactsRecord() {
		super(test.generated.pg_catalog.tables.PgPreparedXacts.PG_PREPARED_XACTS);
	}
}
