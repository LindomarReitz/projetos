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
public class OctetLength4 extends org.jooq.impl.AbstractRoutine<java.lang.Integer> {

	private static final long serialVersionUID = -1392134396;


	/**
	 * The procedure parameter <code>pg_catalog.octet_length.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.lang.Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The procedure parameter <code>pg_catalog.octet_length._1</code>
	 */
	public static final org.jooq.Parameter<byte[]> _1 = createParameter("_1", org.jooq.impl.SQLDataType.BLOB);

	/**
	 * Create a new routine call instance
	 */
	public OctetLength4() {
		super("octet_length", test.generated.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.INTEGER);

		setReturnParameter(RETURN_VALUE);
		addInParameter(_1);
		setOverloaded(true);
	}

	/**
	 * Set the <code>_1</code> parameter IN value to the routine
	 */
	public void set__1(byte[] value) {
		setValue(test.generated.pg_catalog.routines.OctetLength4._1, value);
	}

	/**
	 * Set the <code>_1</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__1(org.jooq.Field<byte[]> field) {
		setField(_1, field);
	}
}