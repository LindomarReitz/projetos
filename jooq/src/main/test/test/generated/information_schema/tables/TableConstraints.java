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
public class TableConstraints extends org.jooq.impl.TableImpl<test.generated.information_schema.tables.records.TableConstraintsRecord> {

	private static final long serialVersionUID = 83655683;

	/**
	 * The singleton instance of information_schema.table_constraints
	 */
	public static final test.generated.information_schema.tables.TableConstraints TABLE_CONSTRAINTS = new test.generated.information_schema.tables.TableConstraints();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.information_schema.tables.records.TableConstraintsRecord> getRecordType() {
		return test.generated.information_schema.tables.records.TableConstraintsRecord.class;
	}

	/**
	 * The table column <code>information_schema.table_constraints.constraint_catalog</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.TableConstraintsRecord, java.lang.String> CONSTRAINT_CATALOG = createField("constraint_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.table_constraints.constraint_schema</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.TableConstraintsRecord, java.lang.String> CONSTRAINT_SCHEMA = createField("constraint_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.table_constraints.constraint_name</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.TableConstraintsRecord, java.lang.String> CONSTRAINT_NAME = createField("constraint_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.table_constraints.table_catalog</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.TableConstraintsRecord, java.lang.String> TABLE_CATALOG = createField("table_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.table_constraints.table_schema</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.TableConstraintsRecord, java.lang.String> TABLE_SCHEMA = createField("table_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.table_constraints.table_name</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.TableConstraintsRecord, java.lang.String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.table_constraints.constraint_type</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.TableConstraintsRecord, java.lang.String> CONSTRAINT_TYPE = createField("constraint_type", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.table_constraints.is_deferrable</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.TableConstraintsRecord, java.lang.String> IS_DEFERRABLE = createField("is_deferrable", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.table_constraints.initially_deferred</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.TableConstraintsRecord, java.lang.String> INITIALLY_DEFERRED = createField("initially_deferred", org.jooq.impl.SQLDataType.VARCHAR, this);

	public TableConstraints() {
		super("table_constraints", test.generated.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}

	public TableConstraints(java.lang.String alias) {
		super(alias, test.generated.information_schema.InformationSchema.INFORMATION_SCHEMA, test.generated.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS);
	}

	@Override
	public test.generated.information_schema.tables.TableConstraints as(java.lang.String alias) {
		return new test.generated.information_schema.tables.TableConstraints(alias);
	}
}
