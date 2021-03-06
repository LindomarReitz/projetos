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
public class PgIndexes extends org.jooq.impl.TableImpl<test.generated.pg_catalog.tables.records.PgIndexesRecord> {

	private static final long serialVersionUID = 637028441;

	/**
	 * The singleton instance of pg_catalog.pg_indexes
	 */
	public static final test.generated.pg_catalog.tables.PgIndexes PG_INDEXES = new test.generated.pg_catalog.tables.PgIndexes();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.pg_catalog.tables.records.PgIndexesRecord> getRecordType() {
		return test.generated.pg_catalog.tables.records.PgIndexesRecord.class;
	}

	/**
	 * The table column <code>pg_catalog.pg_indexes.schemaname</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgIndexesRecord, java.lang.String> SCHEMANAME = createField("schemaname", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_indexes.tablename</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgIndexesRecord, java.lang.String> TABLENAME = createField("tablename", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_indexes.indexname</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgIndexesRecord, java.lang.String> INDEXNAME = createField("indexname", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_indexes.tablespace</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgIndexesRecord, java.lang.String> TABLESPACE = createField("tablespace", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_indexes.indexdef</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgIndexesRecord, java.lang.String> INDEXDEF = createField("indexdef", org.jooq.impl.SQLDataType.CLOB, this);

	public PgIndexes() {
		super("pg_indexes", test.generated.pg_catalog.PgCatalog.PG_CATALOG);
	}

	public PgIndexes(java.lang.String alias) {
		super(alias, test.generated.pg_catalog.PgCatalog.PG_CATALOG, test.generated.pg_catalog.tables.PgIndexes.PG_INDEXES);
	}

	@Override
	public test.generated.pg_catalog.tables.PgIndexes as(java.lang.String alias) {
		return new test.generated.pg_catalog.tables.PgIndexes(alias);
	}
}
