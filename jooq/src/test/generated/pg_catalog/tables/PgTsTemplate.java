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
public class PgTsTemplate extends org.jooq.impl.TableImpl<test.generated.pg_catalog.tables.records.PgTsTemplateRecord> {

	private static final long serialVersionUID = -1706360988;

	/**
	 * The singleton instance of pg_catalog.pg_ts_template
	 */
	public static final test.generated.pg_catalog.tables.PgTsTemplate PG_TS_TEMPLATE = new test.generated.pg_catalog.tables.PgTsTemplate();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.pg_catalog.tables.records.PgTsTemplateRecord> getRecordType() {
		return test.generated.pg_catalog.tables.records.PgTsTemplateRecord.class;
	}

	/**
	 * The table column <code>pg_catalog.pg_ts_template.tmplname</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgTsTemplateRecord, java.lang.String> TMPLNAME = createField("tmplname", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_ts_template.tmplnamespace</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgTsTemplateRecord, java.lang.Long> TMPLNAMESPACE = createField("tmplnamespace", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_ts_template.tmplinit</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgTsTemplateRecord, java.lang.String> TMPLINIT = createField("tmplinit", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_ts_template.tmpllexize</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgTsTemplateRecord, java.lang.String> TMPLLEXIZE = createField("tmpllexize", org.jooq.impl.SQLDataType.VARCHAR, this);

	public PgTsTemplate() {
		super("pg_ts_template", test.generated.pg_catalog.PgCatalog.PG_CATALOG);
	}

	public PgTsTemplate(java.lang.String alias) {
		super(alias, test.generated.pg_catalog.PgCatalog.PG_CATALOG, test.generated.pg_catalog.tables.PgTsTemplate.PG_TS_TEMPLATE);
	}

	@Override
	public test.generated.pg_catalog.tables.PgTsTemplate as(java.lang.String alias) {
		return new test.generated.pg_catalog.tables.PgTsTemplate(alias);
	}
}