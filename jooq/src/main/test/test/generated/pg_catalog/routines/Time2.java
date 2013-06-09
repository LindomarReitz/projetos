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
public class Time2 extends org.jooq.impl.AbstractRoutine<java.sql.Time> {

	private static final long serialVersionUID = 983181566;


	/**
	 * The procedure parameter <code>pg_catalog.time.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.sql.Time> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.TIME);

	/**
	 * The procedure parameter <code>pg_catalog.time._1</code>
	 * <p>
	 * The SQL type of this item (abstime) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.Parameter<java.lang.Object> _1 = createParameter("_1", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("abstime"));

	/**
	 * Create a new routine call instance
	 */
	public Time2() {
		super("time", test.generated.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.TIME);

		setReturnParameter(RETURN_VALUE);
		addInParameter(_1);
		setOverloaded(true);
	}

	/**
	 * Set the <code>_1</code> parameter IN value to the routine
	 */
	public void set__1(java.lang.Object value) {
		setValue(test.generated.pg_catalog.routines.Time2._1, value);
	}

	/**
	 * Set the <code>_1</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__1(org.jooq.Field<java.lang.Object> field) {
		setField(_1, field);
	}
}
