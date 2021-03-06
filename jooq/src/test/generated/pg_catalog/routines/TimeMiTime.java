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
public class TimeMiTime extends org.jooq.impl.AbstractRoutine<java.lang.Object> {

	private static final long serialVersionUID = -2053203058;


	/**
	 * The procedure parameter <code>pg_catalog.time_mi_time.RETURN_VALUE</code>
	 * <p>
	 * The SQL type of this item (interval) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.Parameter<java.lang.Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("interval"));

	/**
	 * The procedure parameter <code>pg_catalog.time_mi_time._1</code>
	 */
	public static final org.jooq.Parameter<java.sql.Time> _1 = createParameter("_1", org.jooq.impl.SQLDataType.TIME);

	/**
	 * The procedure parameter <code>pg_catalog.time_mi_time._2</code>
	 */
	public static final org.jooq.Parameter<java.sql.Time> _2 = createParameter("_2", org.jooq.impl.SQLDataType.TIME);

	/**
	 * Create a new routine call instance
	 */
	public TimeMiTime() {
		super("time_mi_time", test.generated.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.util.postgres.PostgresDataType.getDefaultDataType("interval"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(_1);
		addInParameter(_2);
	}

	/**
	 * Set the <code>_1</code> parameter IN value to the routine
	 */
	public void set__1(java.sql.Time value) {
		setValue(test.generated.pg_catalog.routines.TimeMiTime._1, value);
	}

	/**
	 * Set the <code>_1</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__1(org.jooq.Field<java.sql.Time> field) {
		setField(_1, field);
	}

	/**
	 * Set the <code>_2</code> parameter IN value to the routine
	 */
	public void set__2(java.sql.Time value) {
		setValue(test.generated.pg_catalog.routines.TimeMiTime._2, value);
	}

	/**
	 * Set the <code>_2</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__2(org.jooq.Field<java.sql.Time> field) {
		setField(_2, field);
	}
}
