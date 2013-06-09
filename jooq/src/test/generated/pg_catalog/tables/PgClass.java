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
public class PgClass extends org.jooq.impl.TableImpl<test.generated.pg_catalog.tables.records.PgClassRecord> {

	private static final long serialVersionUID = 1661445864;

	/**
	 * The singleton instance of pg_catalog.pg_class
	 */
	public static final test.generated.pg_catalog.tables.PgClass PG_CLASS = new test.generated.pg_catalog.tables.PgClass();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.pg_catalog.tables.records.PgClassRecord> getRecordType() {
		return test.generated.pg_catalog.tables.records.PgClassRecord.class;
	}

	/**
	 * The table column <code>pg_catalog.pg_class.relname</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgClassRecord, java.lang.String> RELNAME = createField("relname", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_class.relnamespace</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgClassRecord, java.lang.Long> RELNAMESPACE = createField("relnamespace", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_class.reltype</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgClassRecord, java.lang.Long> RELTYPE = createField("reltype", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_class.reloftype</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgClassRecord, java.lang.Long> RELOFTYPE = createField("reloftype", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_class.relowner</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgClassRecord, java.lang.Long> RELOWNER = createField("relowner", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_class.relam</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgClassRecord, java.lang.Long> RELAM = createField("relam", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_class.relfilenode</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgClassRecord, java.lang.Long> RELFILENODE = createField("relfilenode", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_class.reltablespace</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgClassRecord, java.lang.Long> RELTABLESPACE = createField("reltablespace", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_class.relpages</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgClassRecord, java.lang.Integer> RELPAGES = createField("relpages", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>pg_catalog.pg_class.reltuples</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgClassRecord, java.lang.Float> RELTUPLES = createField("reltuples", org.jooq.impl.SQLDataType.REAL, this);

	/**
	 * The table column <code>pg_catalog.pg_class.reltoastrelid</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgClassRecord, java.lang.Long> RELTOASTRELID = createField("reltoastrelid", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_class.reltoastidxid</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgClassRecord, java.lang.Long> RELTOASTIDXID = createField("reltoastidxid", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_class.relhasindex</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgClassRecord, java.lang.Boolean> RELHASINDEX = createField("relhasindex", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>pg_catalog.pg_class.relisshared</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgClassRecord, java.lang.Boolean> RELISSHARED = createField("relisshared", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>pg_catalog.pg_class.relistemp</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgClassRecord, java.lang.Boolean> RELISTEMP = createField("relistemp", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>pg_catalog.pg_class.relkind</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgClassRecord, java.lang.String> RELKIND = createField("relkind", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_class.relnatts</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgClassRecord, java.lang.Short> RELNATTS = createField("relnatts", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>pg_catalog.pg_class.relchecks</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgClassRecord, java.lang.Short> RELCHECKS = createField("relchecks", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>pg_catalog.pg_class.relhasoids</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgClassRecord, java.lang.Boolean> RELHASOIDS = createField("relhasoids", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>pg_catalog.pg_class.relhaspkey</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgClassRecord, java.lang.Boolean> RELHASPKEY = createField("relhaspkey", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>pg_catalog.pg_class.relhasexclusion</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgClassRecord, java.lang.Boolean> RELHASEXCLUSION = createField("relhasexclusion", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>pg_catalog.pg_class.relhasrules</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgClassRecord, java.lang.Boolean> RELHASRULES = createField("relhasrules", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>pg_catalog.pg_class.relhastriggers</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgClassRecord, java.lang.Boolean> RELHASTRIGGERS = createField("relhastriggers", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>pg_catalog.pg_class.relhassubclass</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgClassRecord, java.lang.Boolean> RELHASSUBCLASS = createField("relhassubclass", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>pg_catalog.pg_class.relfrozenxid</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgClassRecord, java.lang.Long> RELFROZENXID = createField("relfrozenxid", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_class.relacl</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgClassRecord, java.lang.String[]> RELACL = createField("relacl", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this);

	/**
	 * The table column <code>pg_catalog.pg_class.reloptions</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgClassRecord, java.lang.String[]> RELOPTIONS = createField("reloptions", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this);

	public PgClass() {
		super("pg_class", test.generated.pg_catalog.PgCatalog.PG_CATALOG);
	}

	public PgClass(java.lang.String alias) {
		super(alias, test.generated.pg_catalog.PgCatalog.PG_CATALOG, test.generated.pg_catalog.tables.PgClass.PG_CLASS);
	}

	@Override
	public test.generated.pg_catalog.tables.PgClass as(java.lang.String alias) {
		return new test.generated.pg_catalog.tables.PgClass(alias);
	}
}
