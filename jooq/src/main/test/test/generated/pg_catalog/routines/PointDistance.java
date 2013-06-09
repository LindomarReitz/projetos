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
public class PointDistance extends org.jooq.impl.AbstractRoutine<java.lang.Double> {

	private static final long serialVersionUID = -1700878462;


	/**
	 * The procedure parameter <code>pg_catalog.point_distance.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.lang.Double> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.DOUBLE);

	/**
	 * The procedure parameter <code>pg_catalog.point_distance._1</code>
	 * <p>
	 * The SQL type of this item (point) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.Parameter<java.lang.Object> _1 = createParameter("_1", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("point"));

	/**
	 * The procedure parameter <code>pg_catalog.point_distance._2</code>
	 * <p>
	 * The SQL type of this item (point) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.Parameter<java.lang.Object> _2 = createParameter("_2", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("point"));

	/**
	 * Create a new routine call instance
	 */
	public PointDistance() {
		super("point_distance", test.generated.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.DOUBLE);

		setReturnParameter(RETURN_VALUE);
		addInParameter(_1);
		addInParameter(_2);
	}

	/**
	 * Set the <code>_1</code> parameter IN value to the routine
	 */
	public void set__1(java.lang.Object value) {
		setValue(test.generated.pg_catalog.routines.PointDistance._1, value);
	}

	/**
	 * Set the <code>_1</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__1(org.jooq.Field<java.lang.Object> field) {
		setField(_1, field);
	}

	/**
	 * Set the <code>_2</code> parameter IN value to the routine
	 */
	public void set__2(java.lang.Object value) {
		setValue(test.generated.pg_catalog.routines.PointDistance._2, value);
	}

	/**
	 * Set the <code>_2</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__2(org.jooq.Field<java.lang.Object> field) {
		setField(_2, field);
	}
}
