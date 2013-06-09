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
public class Int21 extends org.jooq.impl.AbstractRoutine<java.lang.Short> {

	private static final long serialVersionUID = 463715269;


	/**
	 * The procedure parameter <code>pg_catalog.int2.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.lang.Short> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.SMALLINT);

	/**
	 * The procedure parameter <code>pg_catalog.int2._1</code>
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> _1 = createParameter("_1", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * Create a new routine call instance
	 */
	public Int21() {
		super("int2", test.generated.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.SMALLINT);

		setReturnParameter(RETURN_VALUE);
		addInParameter(_1);
		setOverloaded(true);
	}

	/**
	 * Set the <code>_1</code> parameter IN value to the routine
	 */
	public void set__1(java.math.BigDecimal value) {
		setValue(test.generated.pg_catalog.routines.Int21._1, value);
	}

	/**
	 * Set the <code>_1</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__1(org.jooq.Field<java.math.BigDecimal> field) {
		setField(_1, field);
	}
}
