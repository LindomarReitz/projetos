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
public class PtContainedCircle extends org.jooq.impl.AbstractRoutine<java.lang.Boolean> {

	private static final long serialVersionUID = 239833282;


	/**
	 * The procedure parameter <code>pg_catalog.pt_contained_circle.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.lang.Boolean> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BOOLEAN);

	/**
	 * The procedure parameter <code>pg_catalog.pt_contained_circle._1</code>
	 * <p>
	 * The SQL type of this item (point) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.Parameter<java.lang.Object> _1 = createParameter("_1", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("point"));

	/**
	 * The procedure parameter <code>pg_catalog.pt_contained_circle._2</code>
	 * <p>
	 * The SQL type of this item (circle) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.Parameter<java.lang.Object> _2 = createParameter("_2", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("circle"));

	/**
	 * Create a new routine call instance
	 */
	public PtContainedCircle() {
		super("pt_contained_circle", test.generated.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.BOOLEAN);

		setReturnParameter(RETURN_VALUE);
		addInParameter(_1);
		addInParameter(_2);
	}

	/**
	 * Set the <code>_1</code> parameter IN value to the routine
	 */
	public void set__1(java.lang.Object value) {
		setValue(test.generated.pg_catalog.routines.PtContainedCircle._1, value);
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
		setValue(test.generated.pg_catalog.routines.PtContainedCircle._2, value);
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
