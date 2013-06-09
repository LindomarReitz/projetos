/**
 * This class is generated by jOOQ
 */
package test.generated.information_schema.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class TableConstraintsRecord extends org.jooq.impl.TableRecordImpl<test.generated.information_schema.tables.records.TableConstraintsRecord> {

	private static final long serialVersionUID = 1167327506;

	/**
	 * The table column <code>information_schema.table_constraints.constraint_catalog</code>
	 */
	public void setConstraintCatalog(java.lang.String value) {
		setValue(test.generated.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS.CONSTRAINT_CATALOG, value);
	}

	/**
	 * The table column <code>information_schema.table_constraints.constraint_catalog</code>
	 */
	public java.lang.String getConstraintCatalog() {
		return getValue(test.generated.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS.CONSTRAINT_CATALOG);
	}

	/**
	 * The table column <code>information_schema.table_constraints.constraint_schema</code>
	 */
	public void setConstraintSchema(java.lang.String value) {
		setValue(test.generated.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS.CONSTRAINT_SCHEMA, value);
	}

	/**
	 * The table column <code>information_schema.table_constraints.constraint_schema</code>
	 */
	public java.lang.String getConstraintSchema() {
		return getValue(test.generated.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS.CONSTRAINT_SCHEMA);
	}

	/**
	 * The table column <code>information_schema.table_constraints.constraint_name</code>
	 */
	public void setConstraintName(java.lang.String value) {
		setValue(test.generated.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS.CONSTRAINT_NAME, value);
	}

	/**
	 * The table column <code>information_schema.table_constraints.constraint_name</code>
	 */
	public java.lang.String getConstraintName() {
		return getValue(test.generated.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS.CONSTRAINT_NAME);
	}

	/**
	 * The table column <code>information_schema.table_constraints.table_catalog</code>
	 */
	public void setTableCatalog(java.lang.String value) {
		setValue(test.generated.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS.TABLE_CATALOG, value);
	}

	/**
	 * The table column <code>information_schema.table_constraints.table_catalog</code>
	 */
	public java.lang.String getTableCatalog() {
		return getValue(test.generated.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS.TABLE_CATALOG);
	}

	/**
	 * The table column <code>information_schema.table_constraints.table_schema</code>
	 */
	public void setTableSchema(java.lang.String value) {
		setValue(test.generated.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS.TABLE_SCHEMA, value);
	}

	/**
	 * The table column <code>information_schema.table_constraints.table_schema</code>
	 */
	public java.lang.String getTableSchema() {
		return getValue(test.generated.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS.TABLE_SCHEMA);
	}

	/**
	 * The table column <code>information_schema.table_constraints.table_name</code>
	 */
	public void setTableName(java.lang.String value) {
		setValue(test.generated.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS.TABLE_NAME, value);
	}

	/**
	 * The table column <code>information_schema.table_constraints.table_name</code>
	 */
	public java.lang.String getTableName() {
		return getValue(test.generated.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS.TABLE_NAME);
	}

	/**
	 * The table column <code>information_schema.table_constraints.constraint_type</code>
	 */
	public void setConstraintType(java.lang.String value) {
		setValue(test.generated.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS.CONSTRAINT_TYPE, value);
	}

	/**
	 * The table column <code>information_schema.table_constraints.constraint_type</code>
	 */
	public java.lang.String getConstraintType() {
		return getValue(test.generated.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS.CONSTRAINT_TYPE);
	}

	/**
	 * The table column <code>information_schema.table_constraints.is_deferrable</code>
	 */
	public void setIsDeferrable(java.lang.String value) {
		setValue(test.generated.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS.IS_DEFERRABLE, value);
	}

	/**
	 * The table column <code>information_schema.table_constraints.is_deferrable</code>
	 */
	public java.lang.String getIsDeferrable() {
		return getValue(test.generated.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS.IS_DEFERRABLE);
	}

	/**
	 * The table column <code>information_schema.table_constraints.initially_deferred</code>
	 */
	public void setInitiallyDeferred(java.lang.String value) {
		setValue(test.generated.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS.INITIALLY_DEFERRED, value);
	}

	/**
	 * The table column <code>information_schema.table_constraints.initially_deferred</code>
	 */
	public java.lang.String getInitiallyDeferred() {
		return getValue(test.generated.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS.INITIALLY_DEFERRED);
	}

	/**
	 * Create a detached TableConstraintsRecord
	 */
	public TableConstraintsRecord() {
		super(test.generated.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS);
	}
}