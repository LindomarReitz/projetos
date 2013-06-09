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
public class SqlSizingProfiles extends org.jooq.impl.TableImpl<test.generated.information_schema.tables.records.SqlSizingProfilesRecord> {

	private static final long serialVersionUID = -1776588655;

	/**
	 * The singleton instance of information_schema.sql_sizing_profiles
	 */
	public static final test.generated.information_schema.tables.SqlSizingProfiles SQL_SIZING_PROFILES = new test.generated.information_schema.tables.SqlSizingProfiles();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.information_schema.tables.records.SqlSizingProfilesRecord> getRecordType() {
		return test.generated.information_schema.tables.records.SqlSizingProfilesRecord.class;
	}

	/**
	 * The table column <code>information_schema.sql_sizing_profiles.sizing_id</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.SqlSizingProfilesRecord, java.lang.Integer> SIZING_ID = createField("sizing_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>information_schema.sql_sizing_profiles.sizing_name</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.SqlSizingProfilesRecord, java.lang.String> SIZING_NAME = createField("sizing_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.sql_sizing_profiles.profile_id</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.SqlSizingProfilesRecord, java.lang.String> PROFILE_ID = createField("profile_id", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.sql_sizing_profiles.required_value</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.SqlSizingProfilesRecord, java.lang.Integer> REQUIRED_VALUE = createField("required_value", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>information_schema.sql_sizing_profiles.comments</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.SqlSizingProfilesRecord, java.lang.String> COMMENTS = createField("comments", org.jooq.impl.SQLDataType.VARCHAR, this);

	public SqlSizingProfiles() {
		super("sql_sizing_profiles", test.generated.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}

	public SqlSizingProfiles(java.lang.String alias) {
		super(alias, test.generated.information_schema.InformationSchema.INFORMATION_SCHEMA, test.generated.information_schema.tables.SqlSizingProfiles.SQL_SIZING_PROFILES);
	}

	@Override
	public test.generated.information_schema.tables.SqlSizingProfiles as(java.lang.String alias) {
		return new test.generated.information_schema.tables.SqlSizingProfiles(alias);
	}
}