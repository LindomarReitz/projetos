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
public class NumericAvgAccum extends org.jooq.impl.AbstractRoutine<java.math.BigDecimal[]> {

	private static final long serialVersionUID = 698612664;


	/**
	 * The procedure parameter <code>pg_catalog.numeric_avg_accum.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal[]> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC.getArrayDataType());

	/**
	 * The procedure parameter <code>pg_catalog.numeric_avg_accum._1</code>
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal[]> _1 = createParameter("_1", org.jooq.impl.SQLDataType.NUMERIC.getArrayDataType());

	/**
	 * The procedure parameter <code>pg_catalog.numeric_avg_accum._2</code>
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> _2 = createParameter("_2", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * Create a new routine call instance
	 */
	public NumericAvgAccum() {
		super("numeric_avg_accum", test.generated.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.NUMERIC.getArrayDataType());

		setReturnParameter(RETURN_VALUE);
		addInParameter(_1);
		addInParameter(_2);
	}

	/**
	 * Set the <code>_1</code> parameter IN value to the routine
	 */
	public void set__1(java.math.BigDecimal[] value) {
		setValue(test.generated.pg_catalog.routines.NumericAvgAccum._1, value);
	}

	/**
	 * Set the <code>_1</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__1(org.jooq.Field<java.math.BigDecimal[]> field) {
		setField(_1, field);
	}

	/**
	 * Set the <code>_2</code> parameter IN value to the routine
	 */
	public void set__2(java.math.BigDecimal value) {
		setValue(test.generated.pg_catalog.routines.NumericAvgAccum._2, value);
	}

	/**
	 * Set the <code>_2</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__2(org.jooq.Field<java.math.BigDecimal> field) {
		setField(_2, field);
	}
}
