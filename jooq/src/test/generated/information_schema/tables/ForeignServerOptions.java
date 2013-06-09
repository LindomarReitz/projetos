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
public class ForeignServerOptions extends org.jooq.impl.TableImpl<test.generated.information_schema.tables.records.ForeignServerOptionsRecord> {

	private static final long serialVersionUID = 2099793911;

	/**
	 * The singleton instance of information_schema.foreign_server_options
	 */
	public static final test.generated.information_schema.tables.ForeignServerOptions FOREIGN_SERVER_OPTIONS = new test.generated.information_schema.tables.ForeignServerOptions();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.information_schema.tables.records.ForeignServerOptionsRecord> getRecordType() {
		return test.generated.information_schema.tables.records.ForeignServerOptionsRecord.class;
	}

	/**
	 * The table column <code>information_schema.foreign_server_options.foreign_server_catalog</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ForeignServerOptionsRecord, java.lang.String> FOREIGN_SERVER_CATALOG = createField("foreign_server_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.foreign_server_options.foreign_server_name</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ForeignServerOptionsRecord, java.lang.String> FOREIGN_SERVER_NAME = createField("foreign_server_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.foreign_server_options.option_name</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ForeignServerOptionsRecord, java.lang.String> OPTION_NAME = createField("option_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.foreign_server_options.option_value</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ForeignServerOptionsRecord, java.lang.String> OPTION_VALUE = createField("option_value", org.jooq.impl.SQLDataType.VARCHAR, this);

	public ForeignServerOptions() {
		super("foreign_server_options", test.generated.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}

	public ForeignServerOptions(java.lang.String alias) {
		super(alias, test.generated.information_schema.InformationSchema.INFORMATION_SCHEMA, test.generated.information_schema.tables.ForeignServerOptions.FOREIGN_SERVER_OPTIONS);
	}

	@Override
	public test.generated.information_schema.tables.ForeignServerOptions as(java.lang.String alias) {
		return new test.generated.information_schema.tables.ForeignServerOptions(alias);
	}
}