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
public class Notlike3 extends org.jooq.impl.AbstractRoutine<java.lang.Boolean> {

	private static final long serialVersionUID = -1694231883;


	/**
	 * The procedure parameter <code>pg_catalog.notlike.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.lang.Boolean> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BOOLEAN);

	/**
	 * The procedure parameter <code>pg_catalog.notlike._1</code>
	 */
	public static final org.jooq.Parameter<byte[]> _1 = createParameter("_1", org.jooq.impl.SQLDataType.BLOB);

	/**
	 * The procedure parameter <code>pg_catalog.notlike._2</code>
	 */
	public static final org.jooq.Parameter<byte[]> _2 = createParameter("_2", org.jooq.impl.SQLDataType.BLOB);

	/**
	 * Create a new routine call instance
	 */
	public Notlike3() {
		super("notlike", test.generated.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.BOOLEAN);

		setReturnParameter(RETURN_VALUE);
		addInParameter(_1);
		addInParameter(_2);
		setOverloaded(true);
	}

	/**
	 * Set the <code>_1</code> parameter IN value to the routine
	 */
	public void set__1(byte[] value) {
		setValue(test.generated.pg_catalog.routines.Notlike3._1, value);
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
		setValue(test.generated.pg_catalog.routines.Notlike3._2, value);
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
