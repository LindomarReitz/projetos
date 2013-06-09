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
public class ViewRoutineUsage extends org.jooq.impl.TableImpl<test.generated.information_schema.tables.records.ViewRoutineUsageRecord> {

	private static final long serialVersionUID = -2111345940;

	/**
	 * The singleton instance of information_schema.view_routine_usage
	 */
	public static final test.generated.information_schema.tables.ViewRoutineUsage VIEW_ROUTINE_USAGE = new test.generated.information_schema.tables.ViewRoutineUsage();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.information_schema.tables.records.ViewRoutineUsageRecord> getRecordType() {
		return test.generated.information_schema.tables.records.ViewRoutineUsageRecord.class;
	}

	/**
	 * The table column <code>information_schema.view_routine_usage.table_catalog</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ViewRoutineUsageRecord, java.lang.String> TABLE_CATALOG = createField("table_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.view_routine_usage.table_schema</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ViewRoutineUsageRecord, java.lang.String> TABLE_SCHEMA = createField("table_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.view_routine_usage.table_name</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ViewRoutineUsageRecord, java.lang.String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.view_routine_usage.specific_catalog</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ViewRoutineUsageRecord, java.lang.String> SPECIFIC_CATALOG = createField("specific_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.view_routine_usage.specific_schema</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ViewRoutineUsageRecord, java.lang.String> SPECIFIC_SCHEMA = createField("specific_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.view_routine_usage.specific_name</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ViewRoutineUsageRecord, java.lang.String> SPECIFIC_NAME = createField("specific_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	public ViewRoutineUsage() {
		super("view_routine_usage", test.generated.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}

	public ViewRoutineUsage(java.lang.String alias) {
		super(alias, test.generated.information_schema.InformationSchema.INFORMATION_SCHEMA, test.generated.information_schema.tables.ViewRoutineUsage.VIEW_ROUTINE_USAGE);
	}

	@Override
	public test.generated.information_schema.tables.ViewRoutineUsage as(java.lang.String alias) {
		return new test.generated.information_schema.tables.ViewRoutineUsage(alias);
	}
}
