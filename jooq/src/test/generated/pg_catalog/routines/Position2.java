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
public class Position2 extends org.jooq.impl.AbstractRoutine<java.lang.Integer> {

	private static final long serialVersionUID = -1372206983;


	/**
	 * The procedure parameter <code>pg_catalog.position.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.lang.Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The procedure parameter <code>pg_catalog.position._1</code>
	 */
	public static final org.jooq.Parameter<byte[]> _1 = createParameter("_1", org.jooq.impl.SQLDataType.BLOB);

	/**
	 * The procedure parameter <code>pg_catalog.position._2</code>
	 */
	public static final org.jooq.Parameter<byte[]> _2 = createParameter("_2", org.jooq.impl.SQLDataType.BLOB);

	/**
	 * Create a new routine call instance
	 */
	public Position2() {
		super("position", test.generated.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.INTEGER);

		setReturnParameter(RETURN_VALUE);
		addInParameter(_1);
		addInParameter(_2);
		setOverloaded(true);
	}

	/**
	 * Set the <code>_1</code> parameter IN value to the routine
	 */
	public void set__1(byte[] value) {
		setValue(test.generated.pg_catalog.routines.Position2._1, value);
	}

	/**
	 * Set the <code>_1</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__1(org.jooq.Field<byte[]> field) {
		setField(_1, field);
	}

	/**
	 * Set the <code>_2</code> parameter IN value to the routine
	 */
	public void set__2(byte[] value) {
		setValue(test.generated.pg_catalog.routines.Position2._2, value);
	}

	/**
	 * Set the <code>_2</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__2(org.jooq.Field<byte[]> field) {
		setField(_2, field);
	}
}
