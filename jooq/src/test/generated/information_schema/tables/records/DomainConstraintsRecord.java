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
public class DomainConstraintsRecord extends org.jooq.impl.TableRecordImpl<test.generated.information_schema.tables.records.DomainConstraintsRecord> {

	private static final long serialVersionUID = 1221355376;

	/**
	 * The table column <code>information_schema.domain_constraints.constraint_catalog</code>
	 */
	public void setConstraintCatalog(java.lang.String value) {
		setValue(test.generated.information_schema.tables.DomainConstraints.DOMAIN_CONSTRAINTS.CONSTRAINT_CATALOG, value);
	}

	/**
	 * The table column <code>information_schema.domain_constraints.constraint_catalog</code>
	 */
	public java.lang.String getConstraintCatalog() {
		return getValue(test.generated.information_schema.tables.DomainConstraints.DOMAIN_CONSTRAINTS.CONSTRAINT_CATALOG);
	}

	/**
	 * The table column <code>information_schema.domain_constraints.constraint_schema</code>
	 */
	public void setConstraintSchema(java.lang.String value) {
		setValue(test.generated.information_schema.tables.DomainConstraints.DOMAIN_CONSTRAINTS.CONSTRAINT_SCHEMA, value);
	}

	/**
	 * The table column <code>information_schema.domain_constraints.constraint_schema</code>
	 */
	public java.lang.String getConstraintSchema() {
		return getValue(test.generated.information_schema.tables.DomainConstraints.DOMAIN_CONSTRAINTS.CONSTRAINT_SCHEMA);
	}

	/**
	 * The table column <code>information_schema.domain_constraints.constraint_name</code>
	 */
	public void setConstraintName(java.lang.String value) {
		setValue(test.generated.information_schema.tables.DomainConstraints.DOMAIN_CONSTRAINTS.CONSTRAINT_NAME, value);
	}

	/**
	 * The table column <code>information_schema.domain_constraints.constraint_name</code>
	 */
	public java.lang.String getConstraintName() {
		return getValue(test.generated.information_schema.tables.DomainConstraints.DOMAIN_CONSTRAINTS.CONSTRAINT_NAME);
	}

	/**
	 * The table column <code>information_schema.domain_constraints.domain_catalog</code>
	 */
	public void setDomainCatalog(java.lang.String value) {
		setValue(test.generated.information_schema.tables.DomainConstraints.DOMAIN_CONSTRAINTS.DOMAIN_CATALOG, value);
	}

	/**
	 * The table column <code>information_schema.domain_constraints.domain_catalog</code>
	 */
	public java.lang.String getDomainCatalog() {
		return getValue(test.generated.information_schema.tables.DomainConstraints.DOMAIN_CONSTRAINTS.DOMAIN_CATALOG);
	}

	/**
	 * The table column <code>information_schema.domain_constraints.domain_schema</code>
	 */
	public void setDomainSchema(java.lang.String value) {
		setValue(test.generated.information_schema.tables.DomainConstraints.DOMAIN_CONSTRAINTS.DOMAIN_SCHEMA, value);
	}

	/**
	 * The table column <code>information_schema.domain_constraints.domain_schema</code>
	 */
	public java.lang.String getDomainSchema() {
		return getValue(test.generated.information_schema.tables.DomainConstraints.DOMAIN_CONSTRAINTS.DOMAIN_SCHEMA);
	}

	/**
	 * The table column <code>information_schema.domain_constraints.domain_name</code>
	 */
	public void setDomainName(java.lang.String value) {
		setValue(test.generated.information_schema.tables.DomainConstraints.DOMAIN_CONSTRAINTS.DOMAIN_NAME, value);
	}

	/**
	 * The table column <code>information_schema.domain_constraints.domain_name</code>
	 */
	public java.lang.String getDomainName() {
		return getValue(test.generated.information_schema.tables.DomainConstraints.DOMAIN_CONSTRAINTS.DOMAIN_NAME);
	}

	/**
	 * The table column <code>information_schema.domain_constraints.is_deferrable</code>
	 */
	public void setIsDeferrable(java.lang.String value) {
		setValue(test.generated.information_schema.tables.DomainConstraints.DOMAIN_CONSTRAINTS.IS_DEFERRABLE, value);
	}

	/**
	 * The table column <code>information_schema.domain_constraints.is_deferrable</code>
	 */
	public java.lang.String getIsDeferrable() {
		return getValue(test.generated.information_schema.tables.DomainConstraints.DOMAIN_CONSTRAINTS.IS_DEFERRABLE);
	}

	/**
	 * The table column <code>information_schema.domain_constraints.initially_deferred</code>
	 */
	public void setInitiallyDeferred(java.lang.String value) {
		setValue(test.generated.information_schema.tables.DomainConstraints.DOMAIN_CONSTRAINTS.INITIALLY_DEFERRED, value);
	}

	/**
	 * The table column <code>information_schema.domain_constraints.initially_deferred</code>
	 */
	public java.lang.String getInitiallyDeferred() {
		return getValue(test.generated.information_schema.tables.DomainConstraints.DOMAIN_CONSTRAINTS.INITIALLY_DEFERRED);
	}

	/**
	 * Create a detached DomainConstraintsRecord
	 */
	public DomainConstraintsRecord() {
		super(test.generated.information_schema.tables.DomainConstraints.DOMAIN_CONSTRAINTS);
	}
}
