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
public class PgShdependRecord extends org.jooq.impl.TableRecordImpl<test.generated.pg_catalog.tables.records.PgShdependRecord> {

	private static final long serialVersionUID = 139008803;

	/**
	 * The table column <code>pg_catalog.pg_shdepend.dbid</code>
	 */
	public void setDbid(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgShdepend.PG_SHDEPEND.DBID, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_shdepend.dbid</code>
	 */
	public java.lang.Long getDbid() {
		return getValue(test.generated.pg_catalog.tables.PgShdepend.PG_SHDEPEND.DBID);
	}

	/**
	 * The table column <code>pg_catalog.pg_shdepend.classid</code>
	 */
	public void setClassid(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgShdepend.PG_SHDEPEND.CLASSID, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_shdepend.classid</code>
	 */
	public java.lang.Long getClassid() {
		return getValue(test.generated.pg_catalog.tables.PgShdepend.PG_SHDEPEND.CLASSID);
	}

	/**
	 * The table column <code>pg_catalog.pg_shdepend.objid</code>
	 */
	public void setObjid(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgShdepend.PG_SHDEPEND.OBJID, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_shdepend.objid</code>
	 */
	public java.lang.Long getObjid() {
		return getValue(test.generated.pg_catalog.tables.PgShdepend.PG_SHDEPEND.OBJID);
	}

	/**
	 * The table column <code>pg_catalog.pg_shdepend.objsubid</code>
	 */
	public void setObjsubid(java.lang.Integer value) {
		setValue(test.generated.pg_catalog.tables.PgShdepend.PG_SHDEPEND.OBJSUBID, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_shdepend.objsubid</code>
	 */
	public java.lang.Integer getObjsubid() {
		return getValue(test.generated.pg_catalog.tables.PgShdepend.PG_SHDEPEND.OBJSUBID);
	}

	/**
	 * The table column <code>pg_catalog.pg_shdepend.refclassid</code>
	 */
	public void setRefclassid(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgShdepend.PG_SHDEPEND.REFCLASSID, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_shdepend.refclassid</code>
	 */
	public java.lang.Long getRefclassid() {
		return getValue(test.generated.pg_catalog.tables.PgShdepend.PG_SHDEPEND.REFCLASSID);
	}

	/**
	 * The table column <code>pg_catalog.pg_shdepend.refobjid</code>
	 */
	public void setRefobjid(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgShdepend.PG_SHDEPEND.REFOBJID, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_shdepend.refobjid</code>
	 */
	public java.lang.Long getRefobjid() {
		return getValue(test.generated.pg_catalog.tables.PgShdepend.PG_SHDEPEND.REFOBJID);
	}

	/**
	 * The table column <code>pg_catalog.pg_shdepend.deptype</code>
	 */
	public void setDeptype(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgShdepend.PG_SHDEPEND.DEPTYPE, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_shdepend.deptype</code>
	 */
	public java.lang.String getDeptype() {
		return getValue(test.generated.pg_catalog.tables.PgShdepend.PG_SHDEPEND.DEPTYPE);
	}

	/**
	 * Create a detached PgShdependRecord
	 */
	public PgShdependRecord() {
		super(test.generated.pg_catalog.tables.PgShdepend.PG_SHDEPEND);
	}
}
