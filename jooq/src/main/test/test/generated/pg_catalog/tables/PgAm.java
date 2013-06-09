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
public class PgAm extends org.jooq.impl.TableImpl<test.generated.pg_catalog.tables.records.PgAmRecord> {

	private static final long serialVersionUID = 98420445;

	/**
	 * The singleton instance of pg_catalog.pg_am
	 */
	public static final test.generated.pg_catalog.tables.PgAm PG_AM = new test.generated.pg_catalog.tables.PgAm();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.pg_catalog.tables.records.PgAmRecord> getRecordType() {
		return test.generated.pg_catalog.tables.records.PgAmRecord.class;
	}

	/**
	 * The table column <code>pg_catalog.pg_am.amname</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAmRecord, java.lang.String> AMNAME = createField("amname", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_am.amstrategies</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAmRecord, java.lang.Short> AMSTRATEGIES = createField("amstrategies", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>pg_catalog.pg_am.amsupport</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAmRecord, java.lang.Short> AMSUPPORT = createField("amsupport", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>pg_catalog.pg_am.amcanorder</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAmRecord, java.lang.Boolean> AMCANORDER = createField("amcanorder", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>pg_catalog.pg_am.amcanbackward</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAmRecord, java.lang.Boolean> AMCANBACKWARD = createField("amcanbackward", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>pg_catalog.pg_am.amcanunique</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAmRecord, java.lang.Boolean> AMCANUNIQUE = createField("amcanunique", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>pg_catalog.pg_am.amcanmulticol</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAmRecord, java.lang.Boolean> AMCANMULTICOL = createField("amcanmulticol", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>pg_catalog.pg_am.amoptionalkey</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAmRecord, java.lang.Boolean> AMOPTIONALKEY = createField("amoptionalkey", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>pg_catalog.pg_am.amindexnulls</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAmRecord, java.lang.Boolean> AMINDEXNULLS = createField("amindexnulls", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>pg_catalog.pg_am.amsearchnulls</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAmRecord, java.lang.Boolean> AMSEARCHNULLS = createField("amsearchnulls", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>pg_catalog.pg_am.amstorage</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAmRecord, java.lang.Boolean> AMSTORAGE = createField("amstorage", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>pg_catalog.pg_am.amclusterable</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAmRecord, java.lang.Boolean> AMCLUSTERABLE = createField("amclusterable", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>pg_catalog.pg_am.amkeytype</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAmRecord, java.lang.Long> AMKEYTYPE = createField("amkeytype", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_am.aminsert</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAmRecord, java.lang.String> AMINSERT = createField("aminsert", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_am.ambeginscan</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAmRecord, java.lang.String> AMBEGINSCAN = createField("ambeginscan", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_am.amgettuple</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAmRecord, java.lang.String> AMGETTUPLE = createField("amgettuple", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_am.amgetbitmap</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAmRecord, java.lang.String> AMGETBITMAP = createField("amgetbitmap", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_am.amrescan</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAmRecord, java.lang.String> AMRESCAN = createField("amrescan", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_am.amendscan</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAmRecord, java.lang.String> AMENDSCAN = createField("amendscan", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_am.ammarkpos</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAmRecord, java.lang.String> AMMARKPOS = createField("ammarkpos", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_am.amrestrpos</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAmRecord, java.lang.String> AMRESTRPOS = createField("amrestrpos", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_am.ambuild</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAmRecord, java.lang.String> AMBUILD = createField("ambuild", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_am.ambulkdelete</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAmRecord, java.lang.String> AMBULKDELETE = createField("ambulkdelete", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_am.amvacuumcleanup</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAmRecord, java.lang.String> AMVACUUMCLEANUP = createField("amvacuumcleanup", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_am.amcostestimate</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAmRecord, java.lang.String> AMCOSTESTIMATE = createField("amcostestimate", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_am.amoptions</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAmRecord, java.lang.String> AMOPTIONS = createField("amoptions", org.jooq.impl.SQLDataType.VARCHAR, this);

	public PgAm() {
		super("pg_am", test.generated.pg_catalog.PgCatalog.PG_CATALOG);
	}

	public PgAm(java.lang.String alias) {
		super(alias, test.generated.pg_catalog.PgCatalog.PG_CATALOG, test.generated.pg_catalog.tables.PgAm.PG_AM);
	}

	@Override
	public test.generated.pg_catalog.tables.PgAm as(java.lang.String alias) {
		return new test.generated.pg_catalog.tables.PgAm(alias);
	}
}
