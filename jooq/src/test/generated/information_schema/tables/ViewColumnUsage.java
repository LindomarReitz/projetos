/**
 * This class is generated by jOOQ
 */
package test.generated.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class ViewColumnUsage extends org.jooq.impl.TableImpl<test.generated.information_schema.tables.records.ViewColumnUsageRecord> {

	private static final long serialVersionUID = 154493340;

	/**
	 * The singleton instance of information_schema.view_column_usage
	 */
	public static final test.generated.information_schema.tables.ViewColumnUsage VIEW_COLUMN_USAGE = new test.generated.information_schema.tables.ViewColumnUsage();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.information_schema.tables.records.ViewColumnUsageRecord> getRecordType() {
		return test.generated.information_schema.tables.records.ViewColumnUsageRecord.class;
	}

	/**
	 * The table column <code>information_schema.view_column_usage.view_catalog</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ViewColumnUsageRecord, java.lang.String> VIEW_CATALOG = createField("view_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.view_column_usage.view_schema</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ViewColumnUsageRecord, java.lang.String> VIEW_SCHEMA = createField("view_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.view_column_usage.view_name</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ViewColumnUsageRecord, java.lang.String> VIEW_NAME = createField("view_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.view_column_usage.table_catalog</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ViewColumnUsageRecord, java.lang.String> TABLE_CATALOG = createField("table_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.view_column_usage.table_schema</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ViewColumnUsageRecord, java.lang.String> TABLE_SCHEMA = createField("table_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.view_column_usage.table_name</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ViewColumnUsageRecord, java.lang.String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.view_column_usage.column_name</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ViewColumnUsageRecord, java.lang.String> COLUMN_NAME = createField("column_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	public ViewColumnUsage() {
		super("view_column_usage", test.generated.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}

	public ViewColumnUsage(java.lang.String alias) {
		super(alias, test.generated.information_schema.InformationSchema.INFORMATION_SCHEMA, test.generated.information_schema.tables.ViewColumnUsage.VIEW_COLUMN_USAGE);
	}

	@Override
	public test.generated.information_schema.tables.ViewColumnUsage as(java.lang.String alias) {
		return new test.generated.information_schema.tables.ViewColumnUsage(alias);
	}
}
