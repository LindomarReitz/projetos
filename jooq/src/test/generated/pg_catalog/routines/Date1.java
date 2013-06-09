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
public class Date1 extends org.jooq.impl.AbstractRoutine<java.sql.Date> {

	private static final long serialVersionUID = -1276719307;


	/**
	 * The procedure parameter <code>pg_catalog.date.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.sql.Date> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.DATE);

	/**
	 * The procedure parameter <code>pg_catalog.date._1</code>
	 */
	public static final org.jooq.Parameter<java.sql.Timestamp> _1 = createParameter("_1", org.jooq.impl.SQLDataType.TIMESTAMP);

	/**
	 * Create a new routine call instance
	 */
	public Date1() {
		super("date", test.generated.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.DATE);

		setReturnParameter(RETURN_VALUE);
		addInParameter(_1);
		setOverloaded(true);
	}

	/**
	 * Set the <code>_1</code> parameter IN value to the routine
	 */
	public void set__1(java.sql.Timestamp value) {
		setValue(test.generated.pg_catalog.routines.Date1._1, value);
	}

	/**
	 * Set the <code>_1</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__1(org.jooq.Field<java.sql.Timestamp> field) {
		setField(_1, field);
	}
}
