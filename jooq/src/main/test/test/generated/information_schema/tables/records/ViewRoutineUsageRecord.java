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
public class ViewRoutineUsageRecord extends org.jooq.impl.TableRecordImpl<test.generated.information_schema.tables.records.ViewRoutineUsageRecord> {

	private static final long serialVersionUID = 850059873;

	/**
	 * The table column <code>information_schema.view_routine_usage.table_catalog</code>
	 */
	public void setTableCatalog(java.lang.String value) {
		setValue(test.generated.information_schema.tables.ViewRoutineUsage.VIEW_ROUTINE_USAGE.TABLE_CATALOG, value);
	}

	/**
	 * The table column <code>information_schema.view_routine_usage.table_catalog</code>
	 */
	public java.lang.String getTableCatalog() {
		return getValue(test.generated.information_schema.tables.ViewRoutineUsage.VIEW_ROUTINE_USAGE.TABLE_CATALOG);
	}

	/**
	 * The table column <code>information_schema.view_routine_usage.table_schema</code>
	 */
	public void setTableSchema(java.lang.String value) {
		setValue(test.generated.information_schema.tables.ViewRoutineUsage.VIEW_ROUTINE_USAGE.TABLE_SCHEMA, value);
	}

	/**
	 * The table column <code>information_schema.view_routine_usage.table_schema</code>
	 */
	public java.lang.String getTableSchema() {
		return getValue(test.generated.information_schema.tables.ViewRoutineUsage.VIEW_ROUTINE_USAGE.TABLE_SCHEMA);
	}

	/**
	 * The table column <code>information_schema.view_routine_usage.table_name</code>
	 */
	public void setTableName(java.lang.String value) {
		setValue(test.generated.information_schema.tables.ViewRoutineUsage.VIEW_ROUTINE_USAGE.TABLE_NAME, value);
	}

	/**
	 * The table column <code>information_schema.view_routine_usage.table_name</code>
	 */
	public java.lang.String getTableName() {
		return getValue(test.generated.information_schema.tables.ViewRoutineUsage.VIEW_ROUTINE_USAGE.TABLE_NAME);
	}

	/**
	 * The table column <code>information_schema.view_routine_usage.specific_catalog</code>
	 */
	public void setSpecificCatalog(java.lang.String value) {
		setValue(test.generated.information_schema.tables.ViewRoutineUsage.VIEW_ROUTINE_USAGE.SPECIFIC_CATALOG, value);
	}

	/**
	 * The table column <code>information_schema.view_routine_usage.specific_catalog</code>
	 */
	public java.lang.String getSpecificCatalog() {
		return getValue(test.generated.information_schema.tables.ViewRoutineUsage.VIEW_ROUTINE_USAGE.SPECIFIC_CATALOG);
	}

	/**
	 * The table column <code>information_schema.view_routine_usage.specific_schema</code>
	 */
	public void setSpecificSchema(java.lang.String value) {
		setValue(test.generated.information_schema.tables.ViewRoutineUsage.VIEW_ROUTINE_USAGE.SPECIFIC_SCHEMA, value);
	}

	/**
	 * The table column <code>information_schema.view_routine_usage.specific_schema</code>
	 */
	public java.lang.String getSpecificSchema() {
		return getValue(test.generated.information_schema.tables.ViewRoutineUsage.VIEW_ROUTINE_USAGE.SPECIFIC_SCHEMA);
	}

	/**
	 * The table column <code>information_schema.view_routine_usage.specific_name</code>
	 */
	public void setSpecificName(java.lang.String value) {
		setValue(test.generated.information_schema.tables.ViewRoutineUsage.VIEW_ROUTINE_USAGE.SPECIFIC_NAME, value);
	}

	/**
	 * The table column <code>information_schema.view_routine_usage.specific_name</code>
	 */
	public java.lang.String getSpecificName() {
		return getValue(test.generated.information_schema.tables.ViewRoutineUsage.VIEW_ROUTINE_USAGE.SPECIFIC_NAME);
	}

	/**
	 * Create a detached ViewRoutineUsageRecord
	 */
	public ViewRoutineUsageRecord() {
		super(test.generated.information_schema.tables.ViewRoutineUsage.VIEW_ROUTINE_USAGE);
	}
}
