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
public class PgConstraintRecord extends org.jooq.impl.TableRecordImpl<test.generated.pg_catalog.tables.records.PgConstraintRecord> {

	private static final long serialVersionUID = -259932047;

	/**
	 * The table column <code>pg_catalog.pg_constraint.conname</code>
	 */
	public void setConname(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONNAME, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.conname</code>
	 */
	public java.lang.String getConname() {
		return getValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONNAME);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.connamespace</code>
	 */
	public void setConnamespace(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONNAMESPACE, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.connamespace</code>
	 */
	public java.lang.Long getConnamespace() {
		return getValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONNAMESPACE);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.contype</code>
	 */
	public void setContype(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONTYPE, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.contype</code>
	 */
	public java.lang.String getContype() {
		return getValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONTYPE);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.condeferrable</code>
	 */
	public void setCondeferrable(java.lang.Boolean value) {
		setValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONDEFERRABLE, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.condeferrable</code>
	 */
	public java.lang.Boolean getCondeferrable() {
		return getValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONDEFERRABLE);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.condeferred</code>
	 */
	public void setCondeferred(java.lang.Boolean value) {
		setValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONDEFERRED, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.condeferred</code>
	 */
	public java.lang.Boolean getCondeferred() {
		return getValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONDEFERRED);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.conrelid</code>
	 */
	public void setConrelid(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONRELID, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.conrelid</code>
	 */
	public java.lang.Long getConrelid() {
		return getValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONRELID);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.contypid</code>
	 */
	public void setContypid(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONTYPID, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.contypid</code>
	 */
	public java.lang.Long getContypid() {
		return getValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONTYPID);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.conindid</code>
	 */
	public void setConindid(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONINDID, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.conindid</code>
	 */
	public java.lang.Long getConindid() {
		return getValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONINDID);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.confrelid</code>
	 */
	public void setConfrelid(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONFRELID, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.confrelid</code>
	 */
	public java.lang.Long getConfrelid() {
		return getValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONFRELID);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.confupdtype</code>
	 */
	public void setConfupdtype(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONFUPDTYPE, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.confupdtype</code>
	 */
	public java.lang.String getConfupdtype() {
		return getValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONFUPDTYPE);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.confdeltype</code>
	 */
	public void setConfdeltype(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONFDELTYPE, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.confdeltype</code>
	 */
	public java.lang.String getConfdeltype() {
		return getValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONFDELTYPE);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.confmatchtype</code>
	 */
	public void setConfmatchtype(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONFMATCHTYPE, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.confmatchtype</code>
	 */
	public java.lang.String getConfmatchtype() {
		return getValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONFMATCHTYPE);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.conislocal</code>
	 */
	public void setConislocal(java.lang.Boolean value) {
		setValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONISLOCAL, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.conislocal</code>
	 */
	public java.lang.Boolean getConislocal() {
		return getValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONISLOCAL);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.coninhcount</code>
	 */
	public void setConinhcount(java.lang.Integer value) {
		setValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONINHCOUNT, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.coninhcount</code>
	 */
	public java.lang.Integer getConinhcount() {
		return getValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONINHCOUNT);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.conkey</code>
	 */
	public void setConkey(java.lang.Short[] value) {
		setValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONKEY, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.conkey</code>
	 */
	public java.lang.Short[] getConkey() {
		return getValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONKEY);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.confkey</code>
	 */
	public void setConfkey(java.lang.Short[] value) {
		setValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONFKEY, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.confkey</code>
	 */
	public java.lang.Short[] getConfkey() {
		return getValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONFKEY);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.conpfeqop</code>
	 */
	public void setConpfeqop(java.lang.Long[] value) {
		setValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONPFEQOP, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.conpfeqop</code>
	 */
	public java.lang.Long[] getConpfeqop() {
		return getValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONPFEQOP);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.conppeqop</code>
	 */
	public void setConppeqop(java.lang.Long[] value) {
		setValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONPPEQOP, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.conppeqop</code>
	 */
	public java.lang.Long[] getConppeqop() {
		return getValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONPPEQOP);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.conffeqop</code>
	 */
	public void setConffeqop(java.lang.Long[] value) {
		setValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONFFEQOP, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.conffeqop</code>
	 */
	public java.lang.Long[] getConffeqop() {
		return getValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONFFEQOP);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.conexclop</code>
	 */
	public void setConexclop(java.lang.Long[] value) {
		setValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONEXCLOP, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.conexclop</code>
	 */
	public java.lang.Long[] getConexclop() {
		return getValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONEXCLOP);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.conbin</code>
	 */
	public void setConbin(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONBIN, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.conbin</code>
	 */
	public java.lang.String getConbin() {
		return getValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONBIN);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.consrc</code>
	 */
	public void setConsrc(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONSRC, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.consrc</code>
	 */
	public java.lang.String getConsrc() {
		return getValue(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT.CONSRC);
	}

	/**
	 * Create a detached PgConstraintRecord
	 */
	public PgConstraintRecord() {
		super(test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT);
	}
}
