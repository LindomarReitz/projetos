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
public class DateCmpTimestamp extends org.jooq.impl.AbstractRoutine<java.lang.Integer> {

	private static final long serialVersionUID = -1093138838;


	/**
	 * The procedure parameter <code>pg_catalog.date_cmp_timestamp.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.lang.Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The procedure parameter <code>pg_catalog.date_cmp_timestamp._1</code>
	 */
	public static final org.jooq.Parameter<java.sql.Date> _1 = createParameter("_1", org.jooq.impl.SQLDataType.DATE);

	/**
	 * The procedure parameter <code>pg_catalog.date_cmp_timestamp._2</code>
	 */
	public static final org.jooq.Parameter<java.sql.Timestamp> _2 = createParameter("_2", org.jooq.impl.SQLDataType.TIMESTAMP);

	/**
	 * Create a new routine call instance
	 */
	public DateCmpTimestamp() {
		super("date_cmp_timestamp", test.generated.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.INTEGER);

		setReturnParameter(RETURN_VALUE);
		addInParameter(_1);
		addInParameter(_2);
	}

	/**
	 * Set the <code>_1</code> parameter IN value to the routine
	 */
	public void set__1(java.sql.Date value) {
		setValue(test.generated.pg_catalog.routines.DateCmpTimestamp._1, value);
	}

	/**
	 * Set the <code>_1</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__1(org.jooq.Field<java.sql.Date> field) {
		setField(_1, field);
	}

	/**
	 * Set the <code>_2</code> parameter IN value to the routine
	 */
	public void set__2(java.sql.Timestamp value) {
		setValue(test.generated.pg_catalog.routines.DateCmpTimestamp._2, value);
	}

	/**
	 * Set the <code>_2</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__2(org.jooq.Field<java.sql.Timestamp> field) {
		setField(_2, field);
	}
}
