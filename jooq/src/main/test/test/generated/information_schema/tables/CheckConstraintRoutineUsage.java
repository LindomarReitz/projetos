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
public class CheckConstraintRoutineUsage extends org.jooq.impl.TableImpl<test.generated.information_schema.tables.records.CheckConstraintRoutineUsageRecord> {

	private static final long serialVersionUID = -1296153173;

	/**
	 * The singleton instance of information_schema.check_constraint_routine_usage
	 */
	public static final test.generated.information_schema.tables.CheckConstraintRoutineUsage CHECK_CONSTRAINT_ROUTINE_USAGE = new test.generated.information_schema.tables.CheckConstraintRoutineUsage();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.information_schema.tables.records.CheckConstraintRoutineUsageRecord> getRecordType() {
		return test.generated.information_schema.tables.records.CheckConstraintRoutineUsageRecord.class;
	}

	/**
	 * The table column <code>information_schema.check_constraint_routine_usage.constraint_catalog</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.CheckConstraintRoutineUsageRecord, java.lang.String> CONSTRAINT_CATALOG = createField("constraint_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.check_constraint_routine_usage.constraint_schema</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.CheckConstraintRoutineUsageRecord, java.lang.String> CONSTRAINT_SCHEMA = createField("constraint_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.check_constraint_routine_usage.constraint_name</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.CheckConstraintRoutineUsageRecord, java.lang.String> CONSTRAINT_NAME = createField("constraint_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.check_constraint_routine_usage.specific_catalog</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.CheckConstraintRoutineUsageRecord, java.lang.String> SPECIFIC_CATALOG = createField("specific_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.check_constraint_routine_usage.specific_schema</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.CheckConstraintRoutineUsageRecord, java.lang.String> SPECIFIC_SCHEMA = createField("specific_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.check_constraint_routine_usage.specific_name</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.CheckConstraintRoutineUsageRecord, java.lang.String> SPECIFIC_NAME = createField("specific_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	public CheckConstraintRoutineUsage() {
		super("check_constraint_routine_usage", test.generated.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}

	public CheckConstraintRoutineUsage(java.lang.String alias) {
		super(alias, test.generated.information_schema.InformationSchema.INFORMATION_SCHEMA, test.generated.information_schema.tables.CheckConstraintRoutineUsage.CHECK_CONSTRAINT_ROUTINE_USAGE);
	}

	@Override
	public test.generated.information_schema.tables.CheckConstraintRoutineUsage as(java.lang.String alias) {
		return new test.generated.information_schema.tables.CheckConstraintRoutineUsage(alias);
	}
}
