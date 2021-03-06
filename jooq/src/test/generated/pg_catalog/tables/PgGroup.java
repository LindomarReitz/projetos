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
public class PgGroup extends org.jooq.impl.TableImpl<test.generated.pg_catalog.tables.records.PgGroupRecord> {

	private static final long serialVersionUID = -1810317425;

	/**
	 * The singleton instance of pg_catalog.pg_group
	 */
	public static final test.generated.pg_catalog.tables.PgGroup PG_GROUP = new test.generated.pg_catalog.tables.PgGroup();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.pg_catalog.tables.records.PgGroupRecord> getRecordType() {
		return test.generated.pg_catalog.tables.records.PgGroupRecord.class;
	}

	/**
	 * The table column <code>pg_catalog.pg_group.groname</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgGroupRecord, java.lang.String> GRONAME = createField("groname", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_group.grosysid</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgGroupRecord, java.lang.Long> GROSYSID = createField("grosysid", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_group.grolist</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgGroupRecord, java.lang.Long[]> GROLIST = createField("grolist", org.jooq.impl.SQLDataType.BIGINT.getArrayDataType(), this);

	public PgGroup() {
		super("pg_group", test.generated.pg_catalog.PgCatalog.PG_CATALOG);
	}

	public PgGroup(java.lang.String alias) {
		super(alias, test.generated.pg_catalog.PgCatalog.PG_CATALOG, test.generated.pg_catalog.tables.PgGroup.PG_GROUP);
	}

	@Override
	public test.generated.pg_catalog.tables.PgGroup as(java.lang.String alias) {
		return new test.generated.pg_catalog.tables.PgGroup(alias);
	}
}
