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
public class DataTypePrivileges extends org.jooq.impl.TableImpl<test.generated.information_schema.tables.records.DataTypePrivilegesRecord> {

	private static final long serialVersionUID = -690901082;

	/**
	 * The singleton instance of information_schema.data_type_privileges
	 */
	public static final test.generated.information_schema.tables.DataTypePrivileges DATA_TYPE_PRIVILEGES = new test.generated.information_schema.tables.DataTypePrivileges();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.information_schema.tables.records.DataTypePrivilegesRecord> getRecordType() {
		return test.generated.information_schema.tables.records.DataTypePrivilegesRecord.class;
	}

	/**
	 * The table column <code>information_schema.data_type_privileges.object_catalog</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.DataTypePrivilegesRecord, java.lang.String> OBJECT_CATALOG = createField("object_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.data_type_privileges.object_schema</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.DataTypePrivilegesRecord, java.lang.String> OBJECT_SCHEMA = createField("object_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.data_type_privileges.object_name</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.DataTypePrivilegesRecord, java.lang.String> OBJECT_NAME = createField("object_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.data_type_privileges.object_type</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.DataTypePrivilegesRecord, java.lang.String> OBJECT_TYPE = createField("object_type", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.data_type_privileges.dtd_identifier</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.DataTypePrivilegesRecord, java.lang.String> DTD_IDENTIFIER = createField("dtd_identifier", org.jooq.impl.SQLDataType.VARCHAR, this);

	public DataTypePrivileges() {
		super("data_type_privileges", test.generated.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}

	public DataTypePrivileges(java.lang.String alias) {
		super(alias, test.generated.information_schema.InformationSchema.INFORMATION_SCHEMA, test.generated.information_schema.tables.DataTypePrivileges.DATA_TYPE_PRIVILEGES);
	}

	@Override
	public test.generated.information_schema.tables.DataTypePrivileges as(java.lang.String alias) {
		return new test.generated.information_schema.tables.DataTypePrivileges(alias);
	}
}
