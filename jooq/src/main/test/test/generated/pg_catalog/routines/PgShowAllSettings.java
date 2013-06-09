/**
 * This class is generated by jOOQ
 */
package test.generated.pg_catalog.routines;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class PgShowAllSettings extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 18328757;


	/**
	 * The procedure parameter <code>pg_catalog.pg_show_all_settings.name</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> NAME = createParameter("name", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * The procedure parameter <code>pg_catalog.pg_show_all_settings.setting</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> SETTING = createParameter("setting", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * The procedure parameter <code>pg_catalog.pg_show_all_settings.unit</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> UNIT = createParameter("unit", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * The procedure parameter <code>pg_catalog.pg_show_all_settings.category</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> CATEGORY = createParameter("category", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * The procedure parameter <code>pg_catalog.pg_show_all_settings.short_desc</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> SHORT_DESC = createParameter("short_desc", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * The procedure parameter <code>pg_catalog.pg_show_all_settings.extra_desc</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> EXTRA_DESC = createParameter("extra_desc", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * The procedure parameter <code>pg_catalog.pg_show_all_settings.context</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> CONTEXT = createParameter("context", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * The procedure parameter <code>pg_catalog.pg_show_all_settings.vartype</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> VARTYPE = createParameter("vartype", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * The procedure parameter <code>pg_catalog.pg_show_all_settings.source</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> SOURCE = createParameter("source", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * The procedure parameter <code>pg_catalog.pg_show_all_settings.min_val</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> MIN_VAL = createParameter("min_val", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * The procedure parameter <code>pg_catalog.pg_show_all_settings.max_val</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> MAX_VAL = createParameter("max_val", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * The procedure parameter <code>pg_catalog.pg_show_all_settings.enumvals</code>
	 */
	public static final org.jooq.Parameter<java.lang.String[]> ENUMVALS = createParameter("enumvals", org.jooq.impl.SQLDataType.CLOB.getArrayDataType());

	/**
	 * The procedure parameter <code>pg_catalog.pg_show_all_settings.boot_val</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> BOOT_VAL = createParameter("boot_val", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * The procedure parameter <code>pg_catalog.pg_show_all_settings.reset_val</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> RESET_VAL = createParameter("reset_val", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * The procedure parameter <code>pg_catalog.pg_show_all_settings.sourcefile</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> SOURCEFILE = createParameter("sourcefile", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * The procedure parameter <code>pg_catalog.pg_show_all_settings.sourceline</code>
	 */
	public static final org.jooq.Parameter<java.lang.Integer> SOURCELINE = createParameter("sourceline", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public PgShowAllSettings() {
		super("pg_show_all_settings", test.generated.pg_catalog.PgCatalog.PG_CATALOG);

		addOutParameter(NAME);
		addOutParameter(SETTING);
		addOutParameter(UNIT);
		addOutParameter(CATEGORY);
		addOutParameter(SHORT_DESC);
		addOutParameter(EXTRA_DESC);
		addOutParameter(CONTEXT);
		addOutParameter(VARTYPE);
		addOutParameter(SOURCE);
		addOutParameter(MIN_VAL);
		addOutParameter(MAX_VAL);
		addOutParameter(ENUMVALS);
		addOutParameter(BOOT_VAL);
		addOutParameter(RESET_VAL);
		addOutParameter(SOURCEFILE);
		addOutParameter(SOURCELINE);
	}

	/**
	 * Get the <code>name</code> parameter OUT value from the routine
	 */
	public java.lang.String getName_() {
		return getValue(NAME);
	}

	/**
	 * Get the <code>setting</code> parameter OUT value from the routine
	 */
	public java.lang.String getSetting() {
		return getValue(SETTING);
	}

	/**
	 * Get the <code>unit</code> parameter OUT value from the routine
	 */
	public java.lang.String getUnit() {
		return getValue(UNIT);
	}

	/**
	 * Get the <code>category</code> parameter OUT value from the routine
	 */
	public java.lang.String getCategory() {
		return getValue(CATEGORY);
	}

	/**
	 * Get the <code>short_desc</code> parameter OUT value from the routine
	 */
	public java.lang.String getShortDesc() {
		return getValue(SHORT_DESC);
	}

	/**
	 * Get the <code>extra_desc</code> parameter OUT value from the routine
	 */
	public java.lang.String getExtraDesc() {
		return getValue(EXTRA_DESC);
	}

	/**
	 * Get the <code>context</code> parameter OUT value from the routine
	 */
	public java.lang.String getContext() {
		return getValue(CONTEXT);
	}

	/**
	 * Get the <code>vartype</code> parameter OUT value from the routine
	 */
	public java.lang.String getVartype() {
		return getValue(VARTYPE);
	}

	/**
	 * Get the <code>source</code> parameter OUT value from the routine
	 */
	public java.lang.String getSource() {
		return getValue(SOURCE);
	}

	/**
	 * Get the <code>min_val</code> parameter OUT value from the routine
	 */
	public java.lang.String getMinVal() {
		return getValue(MIN_VAL);
	}

	/**
	 * Get the <code>max_val</code> parameter OUT value from the routine
	 */
	public java.lang.String getMaxVal() {
		return getValue(MAX_VAL);
	}

	/**
	 * Get the <code>enumvals</code> parameter OUT value from the routine
	 */
	public java.lang.String[] getEnumvals() {
		return getValue(ENUMVALS);
	}

	/**
	 * Get the <code>boot_val</code> parameter OUT value from the routine
	 */
	public java.lang.String getBootVal() {
		return getValue(BOOT_VAL);
	}

	/**
	 * Get the <code>reset_val</code> parameter OUT value from the routine
	 */
	public java.lang.String getResetVal() {
		return getValue(RESET_VAL);
	}

	/**
	 * Get the <code>sourcefile</code> parameter OUT value from the routine
	 */
	public java.lang.String getSourcefile() {
		return getValue(SOURCEFILE);
	}

	/**
	 * Get the <code>sourceline</code> parameter OUT value from the routine
	 */
	public java.lang.Integer getSourceline() {
		return getValue(SOURCELINE);
	}
}