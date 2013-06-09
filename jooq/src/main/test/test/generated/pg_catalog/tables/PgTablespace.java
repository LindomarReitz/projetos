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
public class PgTablespace extends org.jooq.impl.TableImpl<test.generated.pg_catalog.tables.records.PgTablespaceRecord> {

	private static final long serialVersionUID = -320515729;

	/**
	 * The singleton instance of pg_catalog.pg_tablespace
	 */
	public static final test.generated.pg_catalog.tables.PgTablespace PG_TABLESPACE = new test.generated.pg_catalog.tables.PgTablespace();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.pg_catalog.tables.records.PgTablespaceRecord> getRecordType() {
		return test.generated.pg_catalog.tables.records.PgTablespaceRecord.class;
	}

	/**
	 * The table column <code>pg_catalog.pg_tablespace.spcname</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgTablespaceRecord, java.lang.String> SPCNAME = createField("spcname", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_tablespace.spcowner</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgTablespaceRecord, java.lang.Long> SPCOWNER = createField("spcowner", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_tablespace.spclocation</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgTablespaceRecord, java.lang.String> SPCLOCATION = createField("spclocation", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The table column <code>pg_catalog.pg_tablespace.spcacl</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgTablespaceRecord, java.lang.String[]> SPCACL = createField("spcacl", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this);

	/**
	 * The table column <code>pg_catalog.pg_tablespace.spcoptions</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgTablespaceRecord, java.lang.String[]> SPCOPTIONS = createField("spcoptions", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this);

	public PgTablespace() {
		super("pg_tablespace", test.generated.pg_catalog.PgCatalog.PG_CATALOG);
	}

	public PgTablespace(java.lang.String alias) {
		super(alias, test.generated.pg_catalog.PgCatalog.PG_CATALOG, test.generated.pg_catalog.tables.PgTablespace.PG_TABLESPACE);
	}

	@Override
	public test.generated.pg_catalog.tables.PgTablespace as(java.lang.String alias) {
		return new test.generated.pg_catalog.tables.PgTablespace(alias);
	}
}
