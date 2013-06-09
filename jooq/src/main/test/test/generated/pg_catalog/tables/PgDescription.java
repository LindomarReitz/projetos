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
public class PgDescription extends org.jooq.impl.TableImpl<test.generated.pg_catalog.tables.records.PgDescriptionRecord> {

	private static final long serialVersionUID = -958296521;

	/**
	 * The singleton instance of pg_catalog.pg_description
	 */
	public static final test.generated.pg_catalog.tables.PgDescription PG_DESCRIPTION = new test.generated.pg_catalog.tables.PgDescription();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.pg_catalog.tables.records.PgDescriptionRecord> getRecordType() {
		return test.generated.pg_catalog.tables.records.PgDescriptionRecord.class;
	}

	/**
	 * The table column <code>pg_catalog.pg_description.objoid</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgDescriptionRecord, java.lang.Long> OBJOID = createField("objoid", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_description.classoid</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgDescriptionRecord, java.lang.Long> CLASSOID = createField("classoid", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_description.objsubid</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgDescriptionRecord, java.lang.Integer> OBJSUBID = createField("objsubid", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>pg_catalog.pg_description.description</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgDescriptionRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this);

	public PgDescription() {
		super("pg_description", test.generated.pg_catalog.PgCatalog.PG_CATALOG);
	}

	public PgDescription(java.lang.String alias) {
		super(alias, test.generated.pg_catalog.PgCatalog.PG_CATALOG, test.generated.pg_catalog.tables.PgDescription.PG_DESCRIPTION);
	}

	@Override
	public test.generated.pg_catalog.tables.PgDescription as(java.lang.String alias) {
		return new test.generated.pg_catalog.tables.PgDescription(alias);
	}
}
