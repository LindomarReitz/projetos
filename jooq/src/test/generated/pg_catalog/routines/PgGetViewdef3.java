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
public class PgGetViewdef3 extends org.jooq.impl.AbstractRoutine<java.lang.String> {

	private static final long serialVersionUID = 346101262;


	/**
	 * The procedure parameter <code>pg_catalog.pg_get_viewdef.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * The procedure parameter <code>pg_catalog.pg_get_viewdef._1</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> _1 = createParameter("_1", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * The procedure parameter <code>pg_catalog.pg_get_viewdef._2</code>
	 */
	public static final org.jooq.Parameter<java.lang.Boolean> _2 = createParameter("_2", org.jooq.impl.SQLDataType.BOOLEAN);

	/**
	 * Create a new routine call instance
	 */
	public PgGetViewdef3() {
		super("pg_get_viewdef", test.generated.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.CLOB);

		setReturnParameter(RETURN_VALUE);
		addInParameter(_1);
		addInParameter(_2);
		setOverloaded(true);
	}

	/**
	 * Set the <code>_1</code> parameter IN value to the routine
	 */
	public void set__1(java.lang.String value) {
		setValue(test.generated.pg_catalog.routines.PgGetViewdef3._1, value);
	}

	/**
	 * Set the <code>_1</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__1(org.jooq.Field<java.lang.String> field) {
		setField(_1, field);
	}

	/**
	 * Set the <code>_2</code> parameter IN value to the routine
	 */
	public void set__2(java.lang.Boolean value) {
		setValue(test.generated.pg_catalog.routines.PgGetViewdef3._2, value);
	}

	/**
	 * Set the <code>_2</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__2(org.jooq.Field<java.lang.Boolean> field) {
		setField(_2, field);
	}
}