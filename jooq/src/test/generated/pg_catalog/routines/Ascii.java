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
public class Ascii extends org.jooq.impl.AbstractRoutine<java.lang.Integer> {

	private static final long serialVersionUID = 1656333854;


	/**
	 * The procedure parameter <code>pg_catalog.ascii.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.lang.Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The procedure parameter <code>pg_catalog.ascii._1</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> _1 = createParameter("_1", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * Create a new routine call instance
	 */
	public Ascii() {
		super("ascii", test.generated.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.INTEGER);

		setReturnParameter(RETURN_VALUE);
		addInParameter(_1);
	}

	/**
	 * Set the <code>_1</code> parameter IN value to the routine
	 */
	public void set__1(java.lang.String value) {
		setValue(test.generated.pg_catalog.routines.Ascii._1, value);
	}

	/**
	 * Set the <code>_1</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__1(org.jooq.Field<java.lang.String> field) {
		setField(_1, field);
	}
}
