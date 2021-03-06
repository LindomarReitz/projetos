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
public class Int4Accum extends org.jooq.impl.AbstractRoutine<java.math.BigDecimal[]> {

	private static final long serialVersionUID = 1778561782;


	/**
	 * The procedure parameter <code>pg_catalog.int4_accum.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal[]> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC.getArrayDataType());

	/**
	 * The procedure parameter <code>pg_catalog.int4_accum._1</code>
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal[]> _1 = createParameter("_1", org.jooq.impl.SQLDataType.NUMERIC.getArrayDataType());

	/**
	 * The procedure parameter <code>pg_catalog.int4_accum._2</code>
	 */
	public static final org.jooq.Parameter<java.lang.Integer> _2 = createParameter("_2", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public Int4Accum() {
		super("int4_accum", test.generated.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.NUMERIC.getArrayDataType());

		setReturnParameter(RETURN_VALUE);
		addInParameter(_1);
		addInParameter(_2);
	}

	/**
	 * Set the <code>_1</code> parameter IN value to the routine
	 */
	public void set__1(java.math.BigDecimal[] value) {
		setValue(test.generated.pg_catalog.routines.Int4Accum._1, value);
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
	public void set__2(java.lang.Integer value) {
		setValue(test.generated.pg_catalog.routines.Int4Accum._2, value);
	}

	/**
	 * Set the <code>_2</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__2(org.jooq.Field<java.lang.Integer> field) {
		setField(_2, field);
	}
}
