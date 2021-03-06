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
public class PgSettings extends org.jooq.impl.TableImpl<test.generated.pg_catalog.tables.records.PgSettingsRecord> {

	private static final long serialVersionUID = -363524301;

	/**
	 * The singleton instance of pg_catalog.pg_settings
	 */
	public static final test.generated.pg_catalog.tables.PgSettings PG_SETTINGS = new test.generated.pg_catalog.tables.PgSettings();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.pg_catalog.tables.records.PgSettingsRecord> getRecordType() {
		return test.generated.pg_catalog.tables.records.PgSettingsRecord.class;
	}

	/**
	 * The table column <code>pg_catalog.pg_settings.name</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgSettingsRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The table column <code>pg_catalog.pg_settings.setting</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgSettingsRecord, java.lang.String> SETTING = createField("setting", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The table column <code>pg_catalog.pg_settings.unit</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgSettingsRecord, java.lang.String> UNIT = createField("unit", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The table column <code>pg_catalog.pg_settings.category</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgSettingsRecord, java.lang.String> CATEGORY = createField("category", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The table column <code>pg_catalog.pg_settings.short_desc</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgSettingsRecord, java.lang.String> SHORT_DESC = createField("short_desc", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The table column <code>pg_catalog.pg_settings.extra_desc</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgSettingsRecord, java.lang.String> EXTRA_DESC = createField("extra_desc", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The table column <code>pg_catalog.pg_settings.context</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgSettingsRecord, java.lang.String> CONTEXT = createField("context", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The table column <code>pg_catalog.pg_settings.vartype</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgSettingsRecord, java.lang.String> VARTYPE = createField("vartype", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The table column <code>pg_catalog.pg_settings.source</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgSettingsRecord, java.lang.String> SOURCE = createField("source", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The table column <code>pg_catalog.pg_settings.min_val</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgSettingsRecord, java.lang.String> MIN_VAL = createField("min_val", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The table column <code>pg_catalog.pg_settings.max_val</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgSettingsRecord, java.lang.String> MAX_VAL = createField("max_val", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The table column <code>pg_catalog.pg_settings.enumvals</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgSettingsRecord, java.lang.String[]> ENUMVALS = createField("enumvals", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this);

	/**
	 * The table column <code>pg_catalog.pg_settings.boot_val</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgSettingsRecord, java.lang.String> BOOT_VAL = createField("boot_val", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The table column <code>pg_catalog.pg_settings.reset_val</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgSettingsRecord, java.lang.String> RESET_VAL = createField("reset_val", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The table column <code>pg_catalog.pg_settings.sourcefile</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgSettingsRecord, java.lang.String> SOURCEFILE = createField("sourcefile", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The table column <code>pg_catalog.pg_settings.sourceline</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgSettingsRecord, java.lang.Integer> SOURCELINE = createField("sourceline", org.jooq.impl.SQLDataType.INTEGER, this);

	public PgSettings() {
		super("pg_settings", test.generated.pg_catalog.PgCatalog.PG_CATALOG);
	}

	public PgSettings(java.lang.String alias) {
		super(alias, test.generated.pg_catalog.PgCatalog.PG_CATALOG, test.generated.pg_catalog.tables.PgSettings.PG_SETTINGS);
	}

	@Override
	public test.generated.pg_catalog.tables.PgSettings as(java.lang.String alias) {
		return new test.generated.pg_catalog.tables.PgSettings(alias);
	}
}
