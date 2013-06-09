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
public class RegrCount extends org.jooq.impl.AbstractRoutine<java.lang.Long> {

	private static final long serialVersionUID = 341220318;


	/**
	 * The procedure parameter <code>pg_catalog.regr_count.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.lang.Long> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * The procedure parameter <code>pg_catalog.regr_count._1</code>
	 */
	public static final org.jooq.Parameter<java.lang.Double> _1 = createParameter("_1", org.jooq.impl.SQLDataType.DOUBLE);

	/**
	 * The procedure parameter <code>pg_catalog.regr_count._2</code>
	 */
	public static final org.jooq.Parameter<java.lang.Double> _2 = createParameter("_2", org.jooq.impl.SQLDataType.DOUBLE);

	/**
	 * Create a new routine call instance
	 */
	public RegrCount() {
		super("regr_count", test.generated.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.BIGINT);

		setReturnParameter(RETURN_VALUE);
		addInParameter(_1);
		addInParameter(_2);
	}

	/**
	 * Set the <code>_1</code> parameter IN value to the routine
	 */
	public void set__1(java.lang.Double value) {
		setValue(test.generated.pg_catalog.routines.RegrCount._1, value);
	}

	/**
	 * Set the <code>_1</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__1(org.jooq.Field<java.lang.Double> field) {
		setField(_1, field);
	}

	/**
	 * Set the <code>_2</code> parameter IN value to the routine
	 */
	public void set__2(java.lang.Double value) {
		setValue(test.generated.pg_catalog.routines.RegrCount._2, value);
	}

	/**
	 * Set the <code>_2</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__2(org.jooq.Field<java.lang.Double> field) {
		setField(_2, field);
	}
}