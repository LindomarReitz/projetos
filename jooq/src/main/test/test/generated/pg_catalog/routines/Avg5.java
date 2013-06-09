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
public class Avg5 extends org.jooq.impl.AbstractRoutine<java.lang.Double> {

	private static final long serialVersionUID = -1733648909;


	/**
	 * The procedure parameter <code>pg_catalog.avg.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.lang.Double> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.DOUBLE);

	/**
	 * The procedure parameter <code>pg_catalog.avg._1</code>
	 */
	public static final org.jooq.Parameter<java.lang.Float> _1 = createParameter("_1", org.jooq.impl.SQLDataType.REAL);

	/**
	 * Create a new routine call instance
	 */
	public Avg5() {
		super("avg", test.generated.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.DOUBLE);

		setReturnParameter(RETURN_VALUE);
		addInParameter(_1);
		setOverloaded(true);
	}

	/**
	 * Set the <code>_1</code> parameter IN value to the routine
	 */
	public void set__1(java.lang.Float value) {
		setValue(test.generated.pg_catalog.routines.Avg5._1, value);
	}

	/**
	 * Set the <code>_1</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__1(org.jooq.Field<java.lang.Float> field) {
		setField(_1, field);
	}
}