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
public class ViewsRecord extends org.jooq.impl.TableRecordImpl<test.generated.information_schema.tables.records.ViewsRecord> {

	private static final long serialVersionUID = -1266276329;

	/**
	 * The table column <code>information_schema.views.table_catalog</code>
	 */
	public void setTableCatalog(java.lang.String value) {
		setValue(test.generated.information_schema.tables.Views.VIEWS.TABLE_CATALOG, value);
	}

	/**
	 * The table column <code>information_schema.views.table_catalog</code>
	 */
	public java.lang.String getTableCatalog() {
		return getValue(test.generated.information_schema.tables.Views.VIEWS.TABLE_CATALOG);
	}

	/**
	 * The table column <code>information_schema.views.table_schema</code>
	 */
	public void setTableSchema(java.lang.String value) {
		setValue(test.generated.information_schema.tables.Views.VIEWS.TABLE_SCHEMA, value);
	}

	/**
	 * The table column <code>information_schema.views.table_schema</code>
	 */
	public java.lang.String getTableSchema() {
		return getValue(test.generated.information_schema.tables.Views.VIEWS.TABLE_SCHEMA);
	}

	/**
	 * The table column <code>information_schema.views.table_name</code>
	 */
	public void setTableName(java.lang.String value) {
		setValue(test.generated.information_schema.tables.Views.VIEWS.TABLE_NAME, value);
	}

	/**
	 * The table column <code>information_schema.views.table_name</code>
	 */
	public java.lang.String getTableName() {
		return getValue(test.generated.information_schema.tables.Views.VIEWS.TABLE_NAME);
	}

	/**
	 * The table column <code>information_schema.views.view_definition</code>
	 */
	public void setViewDefinition(java.lang.String value) {
		setValue(test.generated.information_schema.tables.Views.VIEWS.VIEW_DEFINITION, value);
	}

	/**
	 * The table column <code>information_schema.views.view_definition</code>
	 */
	public java.lang.String getViewDefinition() {
		return getValue(test.generated.information_schema.tables.Views.VIEWS.VIEW_DEFINITION);
	}

	/**
	 * The table column <code>information_schema.views.check_option</code>
	 */
	public void setCheckOption(java.lang.String value) {
		setValue(test.generated.information_schema.tables.Views.VIEWS.CHECK_OPTION, value);
	}

	/**
	 * The table column <code>information_schema.views.check_option</code>
	 */
	public java.lang.String getCheckOption() {
		return getValue(test.generated.information_schema.tables.Views.VIEWS.CHECK_OPTION);
	}

	/**
	 * The table column <code>information_schema.views.is_updatable</code>
	 */
	public void setIsUpdatable(java.lang.String value) {
		setValue(test.generated.information_schema.tables.Views.VIEWS.IS_UPDATABLE, value);
	}

	/**
	 * The table column <code>information_schema.views.is_updatable</code>
	 */
	public java.lang.String getIsUpdatable() {
		return getValue(test.generated.information_schema.tables.Views.VIEWS.IS_UPDATABLE);
	}

	/**
	 * The table column <code>information_schema.views.is_insertable_into</code>
	 */
	public void setIsInsertableInto(java.lang.String value) {
		setValue(test.generated.information_schema.tables.Views.VIEWS.IS_INSERTABLE_INTO, value);
	}

	/**
	 * The table column <code>information_schema.views.is_insertable_into</code>
	 */
	public java.lang.String getIsInsertableInto() {
		return getValue(test.generated.information_schema.tables.Views.VIEWS.IS_INSERTABLE_INTO);
	}

	/**
	 * The table column <code>information_schema.views.is_trigger_updatable</code>
	 */
	public void setIsTriggerUpdatable(java.lang.String value) {
		setValue(test.generated.information_schema.tables.Views.VIEWS.IS_TRIGGER_UPDATABLE, value);
	}

	/**
	 * The table column <code>information_schema.views.is_trigger_updatable</code>
	 */
	public java.lang.String getIsTriggerUpdatable() {
		return getValue(test.generated.information_schema.tables.Views.VIEWS.IS_TRIGGER_UPDATABLE);
	}

	/**
	 * The table column <code>information_schema.views.is_trigger_deletable</code>
	 */
	public void setIsTriggerDeletable(java.lang.String value) {
		setValue(test.generated.information_schema.tables.Views.VIEWS.IS_TRIGGER_DELETABLE, value);
	}

	/**
	 * The table column <code>information_schema.views.is_trigger_deletable</code>
	 */
	public java.lang.String getIsTriggerDeletable() {
		return getValue(test.generated.information_schema.tables.Views.VIEWS.IS_TRIGGER_DELETABLE);
	}

	/**
	 * The table column <code>information_schema.views.is_trigger_insertable_into</code>
	 */
	public void setIsTriggerInsertableInto(java.lang.String value) {
		setValue(test.generated.information_schema.tables.Views.VIEWS.IS_TRIGGER_INSERTABLE_INTO, value);
	}

	/**
	 * The table column <code>information_schema.views.is_trigger_insertable_into</code>
	 */
	public java.lang.String getIsTriggerInsertableInto() {
		return getValue(test.generated.information_schema.tables.Views.VIEWS.IS_TRIGGER_INSERTABLE_INTO);
	}

	/**
	 * Create a detached ViewsRecord
	 */
	public ViewsRecord() {
		super(test.generated.information_schema.tables.Views.VIEWS);
	}
}
