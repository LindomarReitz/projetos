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
public class PgRewrite extends org.jooq.impl.TableImpl<test.generated.pg_catalog.tables.records.PgRewriteRecord> {

	private static final long serialVersionUID = 2028515367;

	/**
	 * The singleton instance of pg_catalog.pg_rewrite
	 */
	public static final test.generated.pg_catalog.tables.PgRewrite PG_REWRITE = new test.generated.pg_catalog.tables.PgRewrite();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.pg_catalog.tables.records.PgRewriteRecord> getRecordType() {
		return test.generated.pg_catalog.tables.records.PgRewriteRecord.class;
	}

	/**
	 * The table column <code>pg_catalog.pg_rewrite.rulename</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgRewriteRecord, java.lang.String> RULENAME = createField("rulename", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_rewrite.ev_class</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgRewriteRecord, java.lang.Long> EV_CLASS = createField("ev_class", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_rewrite.ev_attr</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgRewriteRecord, java.lang.Short> EV_ATTR = createField("ev_attr", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>pg_catalog.pg_rewrite.ev_type</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgRewriteRecord, java.lang.String> EV_TYPE = createField("ev_type", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_rewrite.ev_enabled</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgRewriteRecord, java.lang.String> EV_ENABLED = createField("ev_enabled", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_rewrite.is_instead</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgRewriteRecord, java.lang.Boolean> IS_INSTEAD = createField("is_instead", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>pg_catalog.pg_rewrite.ev_qual</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgRewriteRecord, java.lang.String> EV_QUAL = createField("ev_qual", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The table column <code>pg_catalog.pg_rewrite.ev_action</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgRewriteRecord, java.lang.String> EV_ACTION = createField("ev_action", org.jooq.impl.SQLDataType.CLOB, this);

	public PgRewrite() {
		super("pg_rewrite", test.generated.pg_catalog.PgCatalog.PG_CATALOG);
	}

	public PgRewrite(java.lang.String alias) {
		super(alias, test.generated.pg_catalog.PgCatalog.PG_CATALOG, test.generated.pg_catalog.tables.PgRewrite.PG_REWRITE);
	}

	@Override
	public test.generated.pg_catalog.tables.PgRewrite as(java.lang.String alias) {
		return new test.generated.pg_catalog.tables.PgRewrite(alias);
	}
}