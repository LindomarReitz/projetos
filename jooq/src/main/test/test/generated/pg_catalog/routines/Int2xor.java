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
public class Int2xor extends org.jooq.impl.AbstractRoutine<java.lang.Short> {

	private static final long serialVersionUID = 2022518632;


	/**
	 * The procedure parameter <code>pg_catalog.int2xor.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.lang.Short> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.SMALLINT);

	/**
	 * The procedure parameter <code>pg_catalog.int2xor._1</code>
	 */
	public static final org.jooq.Parameter<java.lang.Short> _1 = createParameter("_1", org.jooq.impl.SQLDataType.SMALLINT);

	/**
	 * The procedure parameter <code>pg_catalog.int2xor._2</code>
	 */
	public static final org.jooq.Parameter<java.lang.Short> _2 = createParameter("_2", org.jooq.impl.SQLDataType.SMALLINT);

	/**
	 * Create a new routine call instance
	 */
	public Int2xor() {
		super("int2xor", test.generated.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.SMALLINT);

		setReturnParameter(RETURN_VALUE);
		addInParameter(_1);
		addInParameter(_2);
	}

	/**
	 * Set the <code>_1</code> parameter IN value to the routine
	 */
	public void set__1(java.lang.Short value) {
		setValue(test.generated.pg_catalog.routines.Int2xor._1, value);
	}

	/**
	 * Set the <code>_1</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__1(org.jooq.Field<java.lang.Short> field) {
		setField(_1, field);
	}

	/**
	 * Set the <code>_2</code> parameter IN value to the routine
	 */
	public void set__2(java.lang.Short value) {
		setValue(test.generated.pg_catalog.routines.Int2xor._2, value);
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
