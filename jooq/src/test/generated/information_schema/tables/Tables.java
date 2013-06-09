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
public class Tables extends org.jooq.impl.TableImpl<test.generated.information_schema.tables.records.TablesRecord> {

	private static final long serialVersionUID = 2054156054;

	/**
	 * The singleton instance of information_schema.tables
	 */
	public static final test.generated.information_schema.tables.Tables TABLES = new test.generated.information_schema.tables.Tables();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.information_schema.tables.records.TablesRecord> getRecordType() {
		return test.generated.information_schema.tables.records.TablesRecord.class;
	}

	/**
	 * The table column <code>information_schema.tables.table_catalog</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.TablesRecord, java.lang.String> TABLE_CATALOG = createField("table_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.tables.table_schema</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.TablesRecord, java.lang.String> TABLE_SCHEMA = createField("table_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.tables.table_name</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.TablesRecord, java.lang.String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.tables.table_type</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.TablesRecord, java.lang.String> TABLE_TYPE = createField("table_type", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.tables.self_referencing_column_name</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.TablesRecord, java.lang.String> SELF_REFERENCING_COLUMN_NAME = createField("self_referencing_column_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.tables.reference_generation</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.TablesRecord, java.lang.String> REFERENCE_GENERATION = createField("reference_generation", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.tables.user_defined_type_catalog</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.TablesRecord, java.lang.String> USER_DEFINED_TYPE_CATALOG = createField("user_defined_type_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.tables.user_defined_type_schema</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.TablesRecord, java.lang.String> USER_DEFINED_TYPE_SCHEMA = createField("user_defined_type_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.tables.user_defined_type_name</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.TablesRecord, java.lang.String> USER_DEFINED_TYPE_NAME = createField("user_defined_type_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.tables.is_insertable_into</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.TablesRecord, java.lang.String> IS_INSERTABLE_INTO = createField("is_insertable_into", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.tables.is_typed</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.TablesRecord, java.lang.String> IS_TYPED = createField("is_typed", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.tables.commit_action</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.TablesRecord, java.lang.String> COMMIT_ACTION = createField("commit_action", org.jooq.impl.SQLDataType.VARCHAR, this);

	public Tables() {
		super("tables", test.generated.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}

	public Tables(java.lang.String alias) {
		super(alias, test.generated.information_schema.InformationSchema.INFORMATION_SCHEMA, test.generated.information_schema.tables.Tables.TABLES);
	}

	@Override
	public test.generated.information_schema.tables.Tables as(java.lang.String alias) {
		return new test.generated.information_schema.tables.Tables(alias);
	}
}