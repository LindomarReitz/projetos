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
public class _PgForeignDataWrappers extends org.jooq.impl.TableImpl<test.generated.information_schema.tables.records._PgForeignDataWrappersRecord> {

	private static final long serialVersionUID = 436502727;

	/**
	 * The singleton instance of information_schema._pg_foreign_data_wrappers
	 */
	public static final test.generated.information_schema.tables._PgForeignDataWrappers _PG_FOREIGN_DATA_WRAPPERS = new test.generated.information_schema.tables._PgForeignDataWrappers();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.information_schema.tables.records._PgForeignDataWrappersRecord> getRecordType() {
		return test.generated.information_schema.tables.records._PgForeignDataWrappersRecord.class;
	}

	/**
	 * The table column <code>information_schema._pg_foreign_data_wrappers.oid</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records._PgForeignDataWrappersRecord, java.lang.Long> OID = createField("oid", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>information_schema._pg_foreign_data_wrappers.fdwowner</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records._PgForeignDataWrappersRecord, java.lang.Long> FDWOWNER = createField("fdwowner", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>information_schema._pg_foreign_data_wrappers.fdwoptions</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records._PgForeignDataWrappersRecord, java.lang.String[]> FDWOPTIONS = createField("fdwoptions", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this);

	/**
	 * The table column <code>information_schema._pg_foreign_data_wrappers.foreign_data_wrapper_catalog</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records._PgForeignDataWrappersRecord, java.lang.String> FOREIGN_DATA_WRAPPER_CATALOG = createField("foreign_data_wrapper_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema._pg_foreign_data_wrappers.foreign_data_wrapper_name</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records._PgForeignDataWrappersRecord, java.lang.String> FOREIGN_DATA_WRAPPER_NAME = createField("foreign_data_wrapper_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema._pg_foreign_data_wrappers.authorization_identifier</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records._PgForeignDataWrappersRecord, java.lang.String> AUTHORIZATION_IDENTIFIER = createField("authorization_identifier", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema._pg_foreign_data_wrappers.foreign_data_wrapper_language</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records._PgForeignDataWrappersRecord, java.lang.String> FOREIGN_DATA_WRAPPER_LANGUAGE = createField("foreign_data_wrapper_language", org.jooq.impl.SQLDataType.VARCHAR, this);

	public _PgForeignDataWrappers() {
		super("_pg_foreign_data_wrappers", test.generated.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}

	public _PgForeignDataWrappers(java.lang.String alias) {
		super(alias, test.generated.information_schema.InformationSchema.INFORMATION_SCHEMA, test.generated.information_schema.tables._PgForeignDataWrappers._PG_FOREIGN_DATA_WRAPPERS);
	}

	@Override
	public test.generated.information_schema.tables._PgForeignDataWrappers as(java.lang.String alias) {
		return new test.generated.information_schema.tables._PgForeignDataWrappers(alias);
	}
}