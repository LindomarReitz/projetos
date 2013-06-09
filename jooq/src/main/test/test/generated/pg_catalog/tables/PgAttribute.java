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
public class PgAttribute extends org.jooq.impl.TableImpl<test.generated.pg_catalog.tables.records.PgAttributeRecord> {

	private static final long serialVersionUID = -638345661;

	/**
	 * The singleton instance of pg_catalog.pg_attribute
	 */
	public static final test.generated.pg_catalog.tables.PgAttribute PG_ATTRIBUTE = new test.generated.pg_catalog.tables.PgAttribute();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.pg_catalog.tables.records.PgAttributeRecord> getRecordType() {
		return test.generated.pg_catalog.tables.records.PgAttributeRecord.class;
	}

	/**
	 * The table column <code>pg_catalog.pg_attribute.attrelid</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAttributeRecord, java.lang.Long> ATTRELID = createField("attrelid", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_attribute.attname</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAttributeRecord, java.lang.String> ATTNAME = createField("attname", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_attribute.atttypid</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAttributeRecord, java.lang.Long> ATTTYPID = createField("atttypid", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_attribute.attstattarget</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAttributeRecord, java.lang.Integer> ATTSTATTARGET = createField("attstattarget", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>pg_catalog.pg_attribute.attlen</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAttributeRecord, java.lang.Short> ATTLEN = createField("attlen", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>pg_catalog.pg_attribute.attnum</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAttributeRecord, java.lang.Short> ATTNUM = createField("attnum", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>pg_catalog.pg_attribute.attndims</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAttributeRecord, java.lang.Integer> ATTNDIMS = createField("attndims", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>pg_catalog.pg_attribute.attcacheoff</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAttributeRecord, java.lang.Integer> ATTCACHEOFF = createField("attcacheoff", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>pg_catalog.pg_attribute.atttypmod</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAttributeRecord, java.lang.Integer> ATTTYPMOD = createField("atttypmod", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>pg_catalog.pg_attribute.attbyval</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAttributeRecord, java.lang.Boolean> ATTBYVAL = createField("attbyval", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>pg_catalog.pg_attribute.attstorage</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAttributeRecord, java.lang.String> ATTSTORAGE = createField("attstorage", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_attribute.attalign</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAttributeRecord, java.lang.String> ATTALIGN = createField("attalign", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_attribute.attnotnull</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAttributeRecord, java.lang.Boolean> ATTNOTNULL = createField("attnotnull", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>pg_catalog.pg_attribute.atthasdef</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAttributeRecord, java.lang.Boolean> ATTHASDEF = createField("atthasdef", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>pg_catalog.pg_attribute.attisdropped</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAttributeRecord, java.lang.Boolean> ATTISDROPPED = createField("attisdropped", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>pg_catalog.pg_attribute.attislocal</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAttributeRecord, java.lang.Boolean> ATTISLOCAL = createField("attislocal", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>pg_catalog.pg_attribute.attinhcount</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAttributeRecord, java.lang.Integer> ATTINHCOUNT = createField("attinhcount", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>pg_catalog.pg_attribute.attacl</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAttributeRecord, java.lang.String[]> ATTACL = createField("attacl", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this);

	/**
	 * The table column <code>pg_catalog.pg_attribute.attoptions</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgAttributeRecord, java.lang.String[]> ATTOPTIONS = createField("attoptions", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this);

	public PgAttribute() {
		super("pg_attribute", test.generated.pg_catalog.PgCatalog.PG_CATALOG);
	}

	public PgAttribute(java.lang.String alias) {
		super(alias, test.generated.pg_catalog.PgCatalog.PG_CATALOG, test.generated.pg_catalog.tables.PgAttribute.PG_ATTRIBUTE);
	}

	@Override
	public test.generated.pg_catalog.tables.PgAttribute as(java.lang.String alias) {
		return new test.generated.pg_catalog.tables.PgAttribute(alias);
	}
}