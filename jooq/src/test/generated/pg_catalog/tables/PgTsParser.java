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
public class PgTsParser extends org.jooq.impl.TableImpl<test.generated.pg_catalog.tables.records.PgTsParserRecord> {

	private static final long serialVersionUID = -1751643557;

	/**
	 * The singleton instance of pg_catalog.pg_ts_parser
	 */
	public static final test.generated.pg_catalog.tables.PgTsParser PG_TS_PARSER = new test.generated.pg_catalog.tables.PgTsParser();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.pg_catalog.tables.records.PgTsParserRecord> getRecordType() {
		return test.generated.pg_catalog.tables.records.PgTsParserRecord.class;
	}

	/**
	 * The table column <code>pg_catalog.pg_ts_parser.prsname</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgTsParserRecord, java.lang.String> PRSNAME = createField("prsname", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_ts_parser.prsnamespace</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgTsParserRecord, java.lang.Long> PRSNAMESPACE = createField("prsnamespace", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_ts_parser.prsstart</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgTsParserRecord, java.lang.String> PRSSTART = createField("prsstart", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_ts_parser.prstoken</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgTsParserRecord, java.lang.String> PRSTOKEN = createField("prstoken", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_ts_parser.prsend</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgTsParserRecord, java.lang.String> PRSEND = createField("prsend", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_ts_parser.prsheadline</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgTsParserRecord, java.lang.String> PRSHEADLINE = createField("prsheadline", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_ts_parser.prslextype</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgTsParserRecord, java.lang.String> PRSLEXTYPE = createField("prslextype", org.jooq.impl.SQLDataType.VARCHAR, this);

	public PgTsParser() {
		super("pg_ts_parser", test.generated.pg_catalog.PgCatalog.PG_CATALOG);
	}

	public PgTsParser(java.lang.String alias) {
		super(alias, test.generated.pg_catalog.PgCatalog.PG_CATALOG, test.generated.pg_catalog.tables.PgTsParser.PG_TS_PARSER);
	}

	@Override
	public test.generated.pg_catalog.tables.PgTsParser as(java.lang.String alias) {
		return new test.generated.pg_catalog.tables.PgTsParser(alias);
	}
}
