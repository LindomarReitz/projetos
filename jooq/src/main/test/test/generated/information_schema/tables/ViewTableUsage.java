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
public class ViewTableUsage extends org.jooq.impl.TableImpl<test.generated.information_schema.tables.records.ViewTableUsageRecord> {

	private static final long serialVersionUID = 922998957;

	/**
	 * The singleton instance of information_schema.view_table_usage
	 */
	public static final test.generated.information_schema.tables.ViewTableUsage VIEW_TABLE_USAGE = new test.generated.information_schema.tables.ViewTableUsage();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.information_schema.tables.records.ViewTableUsageRecord> getRecordType() {
		return test.generated.information_schema.tables.records.ViewTableUsageRecord.class;
	}

	/**
	 * The table column <code>information_schema.view_table_usage.view_catalog</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ViewTableUsageRecord, java.lang.String> VIEW_CATALOG = createField("view_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.view_table_usage.view_schema</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ViewTableUsageRecord, java.lang.String> VIEW_SCHEMA = createField("view_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.view_table_usage.view_name</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ViewTableUsageRecord, java.lang.String> VIEW_NAME = createField("view_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.view_table_usage.table_catalog</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ViewTableUsageRecord, java.lang.String> TABLE_CATALOG = createField("table_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.view_table_usage.table_schema</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ViewTableUsageRecord, java.lang.String> TABLE_SCHEMA = createField("table_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.view_table_usage.table_name</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ViewTableUsageRecord, java.lang.String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	public ViewTableUsage() {
		super("view_table_usage", test.generated.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}

	public ViewTableUsage(java.lang.String alias) {
		super(alias, test.generated.information_schema.InformationSchema.INFORMATION_SCHEMA, test.generated.information_schema.tables.ViewTableUsage.VIEW_TABLE_USAGE);
	}

	@Override
	public test.generated.information_schema.tables.ViewTableUsage as(java.lang.String alias) {
		return new test.generated.information_schema.tables.ViewTableUsage(alias);
	}
}
