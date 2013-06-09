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
public class PgTrigger extends org.jooq.impl.TableImpl<test.generated.pg_catalog.tables.records.PgTriggerRecord> {

	private static final long serialVersionUID = 1124311372;

	/**
	 * The singleton instance of pg_catalog.pg_trigger
	 */
	public static final test.generated.pg_catalog.tables.PgTrigger PG_TRIGGER = new test.generated.pg_catalog.tables.PgTrigger();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.pg_catalog.tables.records.PgTriggerRecord> getRecordType() {
		return test.generated.pg_catalog.tables.records.PgTriggerRecord.class;
	}

	/**
	 * The table column <code>pg_catalog.pg_trigger.tgrelid</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgTriggerRecord, java.lang.Long> TGRELID = createField("tgrelid", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_trigger.tgname</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgTriggerRecord, java.lang.String> TGNAME = createField("tgname", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_trigger.tgfoid</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgTriggerRecord, java.lang.Long> TGFOID = createField("tgfoid", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_trigger.tgtype</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgTriggerRecord, java.lang.Short> TGTYPE = createField("tgtype", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>pg_catalog.pg_trigger.tgenabled</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgTriggerRecord, java.lang.String> TGENABLED = createField("tgenabled", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_trigger.tgisinternal</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgTriggerRecord, java.lang.Boolean> TGISINTERNAL = createField("tgisinternal", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>pg_catalog.pg_trigger.tgconstrrelid</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgTriggerRecord, java.lang.Long> TGCONSTRRELID = createField("tgconstrrelid", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_trigger.tgconstrindid</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgTriggerRecord, java.lang.Long> TGCONSTRINDID = createField("tgconstrindid", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_trigger.tgconstraint</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgTriggerRecord, java.lang.Long> TGCONSTRAINT = createField("tgconstraint", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_trigger.tgdeferrable</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgTriggerRecord, java.lang.Boolean> TGDEFERRABLE = createField("tgdeferrable", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>pg_catalog.pg_trigger.tginitdeferred</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgTriggerRecord, java.lang.Boolean> TGINITDEFERRED = createField("tginitdeferred", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>pg_catalog.pg_trigger.tgnargs</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgTriggerRecord, java.lang.Short> TGNARGS = createField("tgnargs", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>pg_catalog.pg_trigger.tgattr</code>
	 * <p>
	 * The SQL type of this item (ARRAY, int2vector) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgTriggerRecord, java.lang.Object[]> TGATTR = createField("tgattr", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("int2vector").getArrayDataType(), this);

	/**
	 * The table column <code>pg_catalog.pg_trigger.tgargs</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgTriggerRecord, byte[]> TGARGS = createField("tgargs", org.jooq.impl.SQLDataType.BLOB, this);

	/**
	 * The table column <code>pg_catalog.pg_trigger.tgqual</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgTriggerRecord, java.lang.String> TGQUAL = createField("tgqual", org.jooq.impl.SQLDataType.CLOB, this);

	public PgTrigger() {
		super("pg_trigger", test.generated.pg_catalog.PgCatalog.PG_CATALOG);
	}

	public PgTrigger(java.lang.String alias) {
		super(alias, test.generated.pg_catalog.PgCatalog.PG_CATALOG, test.generated.pg_catalog.tables.PgTrigger.PG_TRIGGER);
	}

	@Override
	public test.generated.pg_catalog.tables.PgTrigger as(java.lang.String alias) {
		return new test.generated.pg_catalog.tables.PgTrigger(alias);
	}
}