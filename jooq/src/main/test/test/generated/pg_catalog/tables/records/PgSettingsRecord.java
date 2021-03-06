/**
 * This class is generated by jOOQ
 */
package test.generated.pg_catalog.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class PgSettingsRecord extends org.jooq.impl.TableRecordImpl<test.generated.pg_catalog.tables.records.PgSettingsRecord> {

	private static final long serialVersionUID = -97405153;

	/**
	 * The table column <code>pg_catalog.pg_settings.name</code>
	 */
	public void setName(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgSettings.PG_SETTINGS.NAME, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_settings.name</code>
	 */
	public java.lang.String getName() {
		return getValue(test.generated.pg_catalog.tables.PgSettings.PG_SETTINGS.NAME);
	}

	/**
	 * The table column <code>pg_catalog.pg_settings.setting</code>
	 */
	public void setSetting(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgSettings.PG_SETTINGS.SETTING, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_settings.setting</code>
	 */
	public java.lang.String getSetting() {
		return getValue(test.generated.pg_catalog.tables.PgSettings.PG_SETTINGS.SETTING);
	}

	/**
	 * The table column <code>pg_catalog.pg_settings.unit</code>
	 */
	public void setUnit(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgSettings.PG_SETTINGS.UNIT, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_settings.unit</code>
	 */
	public java.lang.String getUnit() {
		return getValue(test.generated.pg_catalog.tables.PgSettings.PG_SETTINGS.UNIT);
	}

	/**
	 * The table column <code>pg_catalog.pg_settings.category</code>
	 */
	public void setCategory(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgSettings.PG_SETTINGS.CATEGORY, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_settings.category</code>
	 */
	public java.lang.String getCategory() {
		return getValue(test.generated.pg_catalog.tables.PgSettings.PG_SETTINGS.CATEGORY);
	}

	/**
	 * The table column <code>pg_catalog.pg_settings.short_desc</code>
	 */
	public void setShortDesc(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgSettings.PG_SETTINGS.SHORT_DESC, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_settings.short_desc</code>
	 */
	public java.lang.String getShortDesc() {
		return getValue(test.generated.pg_catalog.tables.PgSettings.PG_SETTINGS.SHORT_DESC);
	}

	/**
	 * The table column <code>pg_catalog.pg_settings.extra_desc</code>
	 */
	public void setExtraDesc(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgSettings.PG_SETTINGS.EXTRA_DESC, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_settings.extra_desc</code>
	 */
	public java.lang.String getExtraDesc() {
		return getValue(test.generated.pg_catalog.tables.PgSettings.PG_SETTINGS.EXTRA_DESC);
	}

	/**
	 * The table column <code>pg_catalog.pg_settings.context</code>
	 */
	public void setContext(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgSettings.PG_SETTINGS.CONTEXT, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_settings.context</code>
	 */
	public java.lang.String getContext() {
		return getValue(test.generated.pg_catalog.tables.PgSettings.PG_SETTINGS.CONTEXT);
	}

	/**
	 * The table column <code>pg_catalog.pg_settings.vartype</code>
	 */
	public void setVartype(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgSettings.PG_SETTINGS.VARTYPE, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_settings.vartype</code>
	 */
	public java.lang.String getVartype() {
		return getValue(test.generated.pg_catalog.tables.PgSettings.PG_SETTINGS.VARTYPE);
	}

	/**
	 * The table column <code>pg_catalog.pg_settings.source</code>
	 */
	public void setSource(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgSettings.PG_SETTINGS.SOURCE, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_settings.source</code>
	 */
	public java.lang.String getSource() {
		return getValue(test.generated.pg_catalog.tables.PgSettings.PG_SETTINGS.SOURCE);
	}

	/**
	 * The table column <code>pg_catalog.pg_settings.min_val</code>
	 */
	public void setMinVal(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgSettings.PG_SETTINGS.MIN_VAL, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_settings.min_val</code>
	 */
	public java.lang.String getMinVal() {
		return getValue(test.generated.pg_catalog.tables.PgSettings.PG_SETTINGS.MIN_VAL);
	}

	/**
	 * The table column <code>pg_catalog.pg_settings.max_val</code>
	 */
	public void setMaxVal(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgSettings.PG_SETTINGS.MAX_VAL, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_settings.max_val</code>
	 */
	public java.lang.String getMaxVal() {
		return getValue(test.generated.pg_catalog.tables.PgSettings.PG_SETTINGS.MAX_VAL);
	}

	/**
	 * The table column <code>pg_catalog.pg_settings.enumvals</code>
	 */
	public void setEnumvals(java.lang.String[] value) {
		setValue(test.generated.pg_catalog.tables.PgSettings.PG_SETTINGS.ENUMVALS, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_settings.enumvals</code>
	 */
	public java.lang.String[] getEnumvals() {
		return getValue(test.generated.pg_catalog.tables.PgSettings.PG_SETTINGS.ENUMVALS);
	}

	/**
	 * The table column <code>pg_catalog.pg_settings.boot_val</code>
	 */
	public void setBootVal(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgSettings.PG_SETTINGS.BOOT_VAL, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_settings.boot_val</code>
	 */
	public java.lang.String getBootVal() {
		return getValue(test.generated.pg_catalog.tables.PgSettings.PG_SETTINGS.BOOT_VAL);
	}

	/**
	 * The table column <code>pg_catalog.pg_settings.reset_val</code>
	 */
	public void setResetVal(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgSettings.PG_SETTINGS.RESET_VAL, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_settings.reset_val</code>
	 */
	public java.lang.String getResetVal() {
		return getValue(test.generated.pg_catalog.tables.PgSettings.PG_SETTINGS.RESET_VAL);
	}

	/**
	 * The table column <code>pg_catalog.pg_settings.sourcefile</code>
	 */
	public void setSourcefile(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgSettings.PG_SETTINGS.SOURCEFILE, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_settings.sourcefile</code>
	 */
	public java.lang.String getSourcefile() {
		return getValue(test.generated.pg_catalog.tables.PgSettings.PG_SETTINGS.SOURCEFILE);
	}

	/**
	 * The table column <code>pg_catalog.pg_settings.sourceline</code>
	 */
	public void setSourceline(java.lang.Integer value) {
		setValue(test.generated.pg_catalog.tables.PgSettings.PG_SETTINGS.SOURCELINE, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_settings.sourceline</code>
	 */
	public java.lang.Integer getSourceline() {
		return getValue(test.generated.pg_catalog.tables.PgSettings.PG_SETTINGS.SOURCELINE);
	}

	/**
	 * Create a detached PgSettingsRecord
	 */
	public PgSettingsRecord() {
		super(test.generated.pg_catalog.tables.PgSettings.PG_SETTINGS);
	}
}
