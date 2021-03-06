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
public class Overlay1 extends org.jooq.impl.AbstractRoutine<java.lang.String> {

	private static final long serialVersionUID = -1556946917;


	/**
	 * The procedure parameter <code>pg_catalog.overlay.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * The procedure parameter <code>pg_catalog.overlay._1</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> _1 = createParameter("_1", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * The procedure parameter <code>pg_catalog.overlay._2</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> _2 = createParameter("_2", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * The procedure parameter <code>pg_catalog.overlay._3</code>
	 */
	public static final org.jooq.Parameter<java.lang.Integer> _3 = createParameter("_3", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The procedure parameter <code>pg_catalog.overlay._4</code>
	 */
	public static final org.jooq.Parameter<java.lang.Integer> _4 = createParameter("_4", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public Overlay1() {
		super("overlay", test.generated.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.CLOB);

		setReturnParameter(RETURN_VALUE);
		addInParameter(_1);
		addInParameter(_2);
		addInParameter(_3);
		addInParameter(_4);
		setOverloaded(true);
	}

	/**
	 * Set the <code>_1</code> parameter IN value to the routine
	 */
	public void set__1(java.lang.String value) {
		setValue(test.generated.pg_catalog.routines.Overlay1._1, value);
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
	public void set__2(java.lang.String value) {
		setValue(test.generated.pg_catalog.routines.Overlay1._2, value);
	}

	/**
	 * Set the <code>_2</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__2(org.jooq.Field<java.lang.String> field) {
		setField(_2, field);
	}

	/**
	 * Set the <code>_3</code> parameter IN value to the routine
	 */
	public void set__3(java.lang.Integer value) {
		setValue(test.generated.pg_catalog.routines.Overlay1._3, value);
	}

	/**
	 * Set the <code>_3</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__3(org.jooq.Field<java.lang.Integer> field) {
		setField(_3, field);
	}

	/**
	 * Set the <code>_4</code> parameter IN value to the routine
	 */
	public void set__4(java.lang.Integer value) {
		setValue(test.generated.pg_catalog.routines.Overlay1._4, value);
	}

	/**
	 * Set the <code>_4</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__4(org.jooq.Field<java.lang.Integer> field) {
		setField(_4, field);
	}
}
