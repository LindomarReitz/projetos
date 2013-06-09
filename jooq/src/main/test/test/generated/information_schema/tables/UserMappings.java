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
public class UserMappings extends org.jooq.impl.TableImpl<test.generated.information_schema.tables.records.UserMappingsRecord> {

	private static final long serialVersionUID = -160555871;

	/**
	 * The singleton instance of information_schema.user_mappings
	 */
	public static final test.generated.information_schema.tables.UserMappings USER_MAPPINGS = new test.generated.information_schema.tables.UserMappings();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.information_schema.tables.records.UserMappingsRecord> getRecordType() {
		return test.generated.information_schema.tables.records.UserMappingsRecord.class;
	}

	/**
	 * The table column <code>information_schema.user_mappings.authorization_identifier</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.UserMappingsRecord, java.lang.String> AUTHORIZATION_IDENTIFIER = createField("authorization_identifier", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.user_mappings.foreign_server_catalog</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.UserMappingsRecord, java.lang.String> FOREIGN_SERVER_CATALOG = createField("foreign_server_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.user_mappings.foreign_server_name</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.UserMappingsRecord, java.lang.String> FOREIGN_SERVER_NAME = createField("foreign_server_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	public UserMappings() {
		super("user_mappings", test.generated.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}

	public UserMappings(java.lang.String alias) {
		super(alias, test.generated.information_schema.InformationSchema.INFORMATION_SCHEMA, test.generated.information_schema.tables.UserMappings.USER_MAPPINGS);
	}

	@Override
	public test.generated.information_schema.tables.UserMappings as(java.lang.String alias) {
		return new test.generated.information_schema.tables.UserMappings(alias);
	}
}
