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
public class SqlSizing extends org.jooq.impl.TableImpl<test.generated.information_schema.tables.records.SqlSizingRecord> {

	private static final long serialVersionUID = -1699244768;

	/**
	 * The singleton instance of information_schema.sql_sizing
	 */
	public static final test.generated.information_schema.tables.SqlSizing SQL_SIZING = new test.generated.information_schema.tables.SqlSizing();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.information_schema.tables.records.SqlSizingRecord> getRecordType() {
		return test.generated.information_schema.tables.records.SqlSizingRecord.class;
	}

	/**
	 * The table column <code>information_schema.sql_sizing.sizing_id</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.SqlSizingRecord, java.lang.Integer> SIZING_ID = createField("sizing_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>information_schema.sql_sizing.sizing_name</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.SqlSizingRecord, java.lang.String> SIZING_NAME = createField("sizing_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.sql_sizing.supported_value</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.SqlSizingRecord, java.lang.Integer> SUPPORTED_VALUE = createField("supported_value", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>information_schema.sql_sizing.comments</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.SqlSizingRecord, java.lang.String> COMMENTS = createField("comments", org.jooq.impl.SQLDataType.VARCHAR, this);

	public SqlSizing() {
		super("sql_sizing", test.generated.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}

	public SqlSizing(java.lang.String alias) {
		super(alias, test.generated.information_schema.InformationSchema.INFORMATION_SCHEMA, test.generated.information_schema.tables.SqlSizing.SQL_SIZING);
	}

	@Override
	public test.generated.information_schema.tables.SqlSizing as(java.lang.String alias) {
		return new test.generated.information_schema.tables.SqlSizing(alias);
	}
}
