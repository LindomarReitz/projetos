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
public class Int2out extends org.jooq.impl.AbstractRoutine<java.lang.Object> {

	private static final long serialVersionUID = 1558887970;


	/**
	 * The procedure parameter <code>pg_catalog.int2out.RETURN_VALUE</code>
	 * <p>
	 * The SQL type of this item (cstring) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.Parameter<java.lang.Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("cstring"));

	/**
	 * The procedure parameter <code>pg_catalog.int2out._1</code>
	 */
	public static final org.jooq.Parameter<java.lang.Short> _1 = createParameter("_1", org.jooq.impl.SQLDataType.SMALLINT);

	/**
	 * Create a new routine call instance
	 */
	public Int2out() {
		super("int2out", test.generated.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.util.postgres.PostgresDataType.getDefaultDataType("cstring"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(_1);
	}

	/**
	 * Set the <code>_1</code> parameter IN value to the routine
	 */
	public void set__1(java.lang.Short value) {
		setValue(test.generated.pg_catalog.routines.Int2out._1, value);
	}

	/**
	 * Set the <code>_1</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__1(org.jooq.Field<java.lang.Short> field) {
		setField(_1, field);
	}
}
