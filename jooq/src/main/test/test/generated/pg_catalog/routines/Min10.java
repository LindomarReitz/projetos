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
public class Min10 extends org.jooq.impl.AbstractRoutine<java.sql.Time> {

	private static final long serialVersionUID = -1116826683;


	/**
	 * The procedure parameter <code>pg_catalog.min.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.sql.Time> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.TIME);

	/**
	 * The procedure parameter <code>pg_catalog.min._1</code>
	 */
	public static final org.jooq.Parameter<java.sql.Time> _1 = createParameter("_1", org.jooq.impl.SQLDataType.TIME);

	/**
	 * Create a new routine call instance
	 */
	public Min10() {
		super("min", test.generated.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.TIME);

		setReturnParameter(RETURN_VALUE);
		addInParameter(_1);
		setOverloaded(true);
	}

	/**
	 * Set the <code>_1</code> parameter IN value to the routine
	 */
	public void set__1(java.sql.Time value) {
		setValue(test.generated.pg_catalog.routines.Min10._1, value);
	}

	/**
	 * Set the <code>_1</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__1(org.jooq.Field<java.sql.Time> field) {
		setField(_1, field);
	}
}
