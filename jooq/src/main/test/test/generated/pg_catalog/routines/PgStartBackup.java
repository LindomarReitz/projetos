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
public class PgStartBackup extends org.jooq.impl.AbstractRoutine<java.lang.String> {

	private static final long serialVersionUID = 1088777201;


	/**
	 * The procedure parameter <code>pg_catalog.pg_start_backup.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * The procedure parameter <code>pg_catalog.pg_start_backup.label</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> LABEL = createParameter("label", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * The procedure parameter <code>pg_catalog.pg_start_backup.fast</code>
	 */
	public static final org.jooq.Parameter<java.lang.Boolean> FAST = createParameter("fast", org.jooq.impl.SQLDataType.BOOLEAN);

	/**
	 * Create a new routine call instance
	 */
	public PgStartBackup() {
		super("pg_start_backup", test.generated.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.CLOB);

		setReturnParameter(RETURN_VALUE);
		addInParameter(LABEL);
		addInParameter(FAST);
	}

	/**
	 * Set the <code>label</code> parameter IN value to the routine
	 */
	public void setLabel(java.lang.String value) {
		setValue(test.generated.pg_catalog.routines.PgStartBackup.LABEL, value);
	}

	/**
	 * Set the <code>label</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setLabel(org.jooq.Field<java.lang.String> field) {
		setField(LABEL, field);
	}

	/**
	 * Set the <code>fast</code> parameter IN value to the routine
	 */
	public void setFast(java.lang.Boolean value) {
		setValue(test.generated.pg_catalog.routines.PgStartBackup.FAST, value);
	}

	/**
	 * Set the <code>fast</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setFast(org.jooq.Field<java.lang.Boolean> field) {
		setField(FAST, field);
	}
}
