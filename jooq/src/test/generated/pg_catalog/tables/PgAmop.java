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
public class PgAmop extends org.jooq.impl.TableImpl<test.generated.pg_catalog.tables.records.PgAmopRecord> {

	private static final long serialVersionUID = -595456745;

	/**
	 * The singleton instance of pg_catalog.pg_amop
	 */
	public static final test.generated.pg_catalog.tables.PgAmop PG_AMOP = new test.generated.pg_catalog.tables.PgAmop();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.pg_catalog.tables.records.PgAmopRecord> getRecordType() {
		return test.generated.pg_catalog.tables.records.PgAmopRecord.class;
	}

	/**
	 * The table column <code>pg_catalog.pg_amop.amopfamily</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAmopRecord, java.lang.Long> AMOPFAMILY = createField("amopfamily", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_amop.amoplefttype</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAmopRecord, java.lang.Long> AMOPLEFTTYPE = createField("amoplefttype", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_amop.amoprighttype</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAmopRecord, java.lang.Long> AMOPRIGHTTYPE = createField("amoprighttype", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_amop.amopstrategy</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAmopRecord, java.lang.Short> AMOPSTRATEGY = createField("amopstrategy", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>pg_catalog.pg_amop.amopopr</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAmopRecord, java.lang.Long> AMOPOPR = createField("amopopr", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_amop.amopmethod</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAmopRecord, java.lang.Long> AMOPMETHOD = createField("amopmethod", org.jooq.impl.SQLDataType.BIGINT, this);

	public PgAmop() {
		super("pg_amop", test.generated.pg_catalog.PgCatalog.PG_CATALOG);
	}

	public PgAmop(java.lang.String alias) {
		super(alias, test.generated.pg_catalog.PgCatalog.PG_CATALOG, test.generated.pg_catalog.tables.PgAmop.PG_AMOP);
	}

	@Override
	public test.generated.pg_catalog.tables.PgAmop as(java.lang.String alias) {
		return new test.generated.pg_catalog.tables.PgAmop(alias);
	}
}
