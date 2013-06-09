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
public class Point2 extends org.jooq.impl.AbstractRoutine<java.lang.Object> {

	private static final long serialVersionUID = 1479169202;


	/**
	 * The procedure parameter <code>pg_catalog.point.RETURN_VALUE</code>
	 * <p>
	 * The SQL type of this item (point) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.Parameter<java.lang.Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("point"));

	/**
	 * The procedure parameter <code>pg_catalog.point._1</code>
	 */
	public static final org.jooq.Parameter<java.lang.Double> _1 = createParameter("_1", org.jooq.impl.SQLDataType.DOUBLE);

	/**
	 * The procedure parameter <code>pg_catalog.point._2</code>
	 */
	public static final org.jooq.Parameter<java.lang.Double> _2 = createParameter("_2", org.jooq.impl.SQLDataType.DOUBLE);

	/**
	 * Create a new routine call instance
	 */
	public Point2() {
		super("point", test.generated.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.util.postgres.PostgresDataType.getDefaultDataType("point"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(_1);
		addInParameter(_2);
		setOverloaded(true);
	}

	/**
	 * Set the <code>_1</code> parameter IN value to the routine
	 */
	public void set__1(java.lang.Double value) {
		setValue(test.generated.pg_catalog.routines.Point2._1, value);
	}

	/**
	 * Set the <code>_1</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__1(org.jooq.Field<java.lang.Double> field) {
		setField(_1, field);
	}

	/**
	 * Set the <code>_2</code> parameter IN value to the routine
	 */
	public void set__2(java.lang.Double value) {
		setValue(test.generated.pg_catalog.routines.Point2._2, value);
	}

	/**
	 * Set the <code>_2</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__2(org.jooq.Field<java.lang.Double> field) {
		setField(_2, field);
	}
}