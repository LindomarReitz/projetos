/**
 * This class is generated by jOOQ
 */
package test.generated.pg_catalog.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class PgEnum extends org.jooq.impl.TableImpl<test.generated.pg_catalog.tables.records.PgEnumRecord> {

	private static final long serialVersionUID = 561879105;

	/**
	 * The singleton instance of pg_catalog.pg_enum
	 */
	public static final test.generated.pg_catalog.tables.PgEnum PG_ENUM = new test.generated.pg_catalog.tables.PgEnum();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.pg_catalog.tables.records.PgEnumRecord> getRecordType() {
		return test.generated.pg_catalog.tables.records.PgEnumRecord.class;
	}

	/**
	 * The table column <code>pg_catalog.pg_enum.enumtypid</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgEnumRecord, java.lang.Long> ENUMTYPID = createField("enumtypid", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_enum.enumlabel</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgEnumRecord, java.lang.String> ENUMLABEL = createField("enumlabel", org.jooq.impl.SQLDataType.VARCHAR, this);

	public PgEnum() {
		super("pg_enum", test.generated.pg_catalog.PgCatalog.PG_CATALOG);
	}

	public PgEnum(java.lang.String alias) {
		super(alias, test.generated.pg_catalog.PgCatalog.PG_CATALOG, test.generated.pg_catalog.tables.PgEnum.PG_ENUM);
	}

	@Override
	public test.generated.pg_catalog.tables.PgEnum as(java.lang.String alias) {
		return new test.generated.pg_catalog.tables.PgEnum(alias);
	}
}