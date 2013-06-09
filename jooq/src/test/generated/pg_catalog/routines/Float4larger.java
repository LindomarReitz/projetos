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
public class Float4larger extends org.jooq.impl.AbstractRoutine<java.lang.Float> {

	private static final long serialVersionUID = -1391716374;


	/**
	 * The procedure parameter <code>pg_catalog.float4larger.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.lang.Float> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.REAL);

	/**
	 * The procedure parameter <code>pg_catalog.float4larger._1</code>
	 */
	public static final org.jooq.Parameter<java.lang.Float> _1 = createParameter("_1", org.jooq.impl.SQLDataType.REAL);

	/**
	 * The procedure parameter <code>pg_catalog.float4larger._2</code>
	 */
	public static final org.jooq.Parameter<java.lang.Float> _2 = createParameter("_2", org.jooq.impl.SQLDataType.REAL);

	/**
	 * Create a new routine call instance
	 */
	public Float4larger() {
		super("float4larger", test.generated.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.REAL);

		setReturnParameter(RETURN_VALUE);
		addInParameter(_1);
		addInParameter(_2);
	}

	/**
	 * Set the <code>_1</code> parameter IN value to the routine
	 */
	public void set__1(java.lang.Float value) {
		setValue(test.generated.pg_catalog.routines.Float4larger._1, value);
	}

	/**
	 * Set the <code>_1</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__1(org.jooq.Field<java.lang.Float> field) {
		setField(_1, field);
	}

	/**
	 * Set the <code>_2</code> parameter IN value to the routine
	 */
	public void set__2(java.lang.Float value) {
		setValue(test.generated.pg_catalog.routines.Float4larger._2, value);
	}

	/**
	 * Set the <code>_2</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__2(org.jooq.Field<java.lang.Float> field) {
		setField(_2, field);
	}
}
