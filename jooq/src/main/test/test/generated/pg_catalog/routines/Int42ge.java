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
public class Int42ge extends org.jooq.impl.AbstractRoutine<java.lang.Boolean> {

	private static final long serialVersionUID = -1574709776;


	/**
	 * The procedure parameter <code>pg_catalog.int42ge.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.lang.Boolean> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BOOLEAN);

	/**
	 * The procedure parameter <code>pg_catalog.int42ge._1</code>
	 */
	public static final org.jooq.Parameter<java.lang.Integer> _1 = createParameter("_1", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The procedure parameter <code>pg_catalog.int42ge._2</code>
	 */
	public static final org.jooq.Parameter<java.lang.Short> _2 = createParameter("_2", org.jooq.impl.SQLDataType.SMALLINT);

	/**
	 * Create a new routine call instance
	 */
	public Int42ge() {
		super("int42ge", test.generated.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.BOOLEAN);

		setReturnParameter(RETURN_VALUE);
		addInParameter(_1);
		addInParameter(_2);
	}

	/**
	 * Set the <code>_1</code> parameter IN value to the routine
	 */
	public void set__1(java.lang.Integer value) {
		setValue(test.generated.pg_catalog.routines.Int42ge._1, value);
	}

	/**
	 * Set the <code>_1</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__1(org.jooq.Field<java.lang.Integer> field) {
		setField(_1, field);
	}

	/**
	 * Set the <code>_2</code> parameter IN value to the routine
	 */
	public void set__2(java.lang.Short value) {
		setValue(test.generated.pg_catalog.routines.Int42ge._2, value);
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
