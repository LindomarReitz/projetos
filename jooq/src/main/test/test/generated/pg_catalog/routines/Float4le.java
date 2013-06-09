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
public class Float4le extends org.jooq.impl.AbstractRoutine<java.lang.Boolean> {

	private static final long serialVersionUID = -174172724;


	/**
	 * The procedure parameter <code>pg_catalog.float4le.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.lang.Boolean> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BOOLEAN);

	/**
	 * The procedure parameter <code>pg_catalog.float4le._1</code>
	 */
	public static final org.jooq.Parameter<java.lang.Float> _1 = createParameter("_1", org.jooq.impl.SQLDataType.REAL);

	/**
	 * The procedure parameter <code>pg_catalog.float4le._2</code>
	 */
	public static final org.jooq.Parameter<java.lang.Float> _2 = createParameter("_2", org.jooq.impl.SQLDataType.REAL);

	/**
	 * Create a new routine call instance
	 */
	public Float4le() {
		super("float4le", test.generated.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.BOOLEAN);

		setReturnParameter(RETURN_VALUE);
		addInParameter(_1);
		addInParameter(_2);
	}

	/**
	 * Set the <code>_1</code> parameter IN value to the routine
	 */
	public void set__1(java.lang.Float value) {
		setValue(test.generated.pg_catalog.routines.Float4le._1, value);
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
		setValue(test.generated.pg_catalog.routines.Float4le._2, value);
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
