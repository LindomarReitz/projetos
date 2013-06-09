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
public class CashDivInt2 extends org.jooq.impl.AbstractRoutine<java.math.BigDecimal> {

	private static final long serialVersionUID = -962829530;


	/**
	 * The procedure parameter <code>pg_catalog.cash_div_int2.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * The procedure parameter <code>pg_catalog.cash_div_int2._1</code>
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> _1 = createParameter("_1", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * The procedure parameter <code>pg_catalog.cash_div_int2._2</code>
	 */
	public static final org.jooq.Parameter<java.lang.Short> _2 = createParameter("_2", org.jooq.impl.SQLDataType.SMALLINT);

	/**
	 * Create a new routine call instance
	 */
	public CashDivInt2() {
		super("cash_div_int2", test.generated.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(_1);
		addInParameter(_2);
	}

	/**
	 * Set the <code>_1</code> parameter IN value to the routine
	 */
	public void set__1(java.math.BigDecimal value) {
		setValue(test.generated.pg_catalog.routines.CashDivInt2._1, value);
	}

	/**
	 * Set the <code>_1</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__1(org.jooq.Field<java.math.BigDecimal> field) {
		setField(_1, field);
	}

	/**
	 * Set the <code>_2</code> parameter IN value to the routine
	 */
	public void set__2(java.lang.Short value) {
		setValue(test.generated.pg_catalog.routines.CashDivInt2._2, value);
	}

	/**
	 * Set the <code>_2</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__2(org.jooq.Field<java.lang.Short> field) {
		setField(_2, field);
	}
}
