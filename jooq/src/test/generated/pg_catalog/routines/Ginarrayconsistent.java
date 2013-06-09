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
public class Ginarrayconsistent extends org.jooq.impl.AbstractRoutine<java.lang.Boolean> {

	private static final long serialVersionUID = -1177976930;


	/**
	 * The procedure parameter <code>pg_catalog.ginarrayconsistent.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.lang.Boolean> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BOOLEAN);

	/**
	 * The procedure parameter <code>pg_catalog.ginarrayconsistent._1</code>
	 * <p>
	 * The SQL type of this item (internal) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.Parameter<java.lang.Object> _1 = createParameter("_1", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("internal"));

	/**
	 * The procedure parameter <code>pg_catalog.ginarrayconsistent._2</code>
	 */
	public static final org.jooq.Parameter<java.lang.Short> _2 = createParameter("_2", org.jooq.impl.SQLDataType.SMALLINT);

	/**
	 * The procedure parameter <code>pg_catalog.ginarrayconsistent._3</code>
	 * <p>
	 * The SQL type of this item (anyarray) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.Parameter<java.lang.Object> _3 = createParameter("_3", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("anyarray"));

	/**
	 * The procedure parameter <code>pg_catalog.ginarrayconsistent._4</code>
	 */
	public static final org.jooq.Parameter<java.lang.Integer> _4 = createParameter("_4", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The procedure parameter <code>pg_catalog.ginarrayconsistent._5</code>
	 * <p>
	 * The SQL type of this item (internal) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.Parameter<java.lang.Object> _5 = createParameter("_5", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("internal"));

	/**
	 * The procedure parameter <code>pg_catalog.ginarrayconsistent._6</code>
	 * <p>
	 * The SQL type of this item (internal) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.Parameter<java.lang.Object> _6 = createParameter("_6", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("internal"));

	/**
	 * Create a new routine call instance
	 */
	public Ginarrayconsistent() {
		super("ginarrayconsistent", test.generated.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.BOOLEAN);

		setReturnParameter(RETURN_VALUE);
		addInParameter(_1);
		addInParameter(_2);
		addInParameter(_3);
		addInParameter(_4);
		addInParameter(_5);
		addInParameter(_6);
	}

	/**
	 * Set the <code>_1</code> parameter IN value to the routine
	 */
	public void set__1(java.lang.Object value) {
		setValue(test.generated.pg_catalog.routines.Ginarrayconsistent._1, value);
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
	public void set__2(java.lang.Short value) {
		setValue(test.generated.pg_catalog.routines.Ginarrayconsistent._2, value);
	}

	/**
	 * Set the <code>_2</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__2(org.jooq.Field<java.lang.Short> field) {
		setField(_2, field);
	}

	/**
	 * Set the <code>_3</code> parameter IN value to the routine
	 */
	public void set__3(java.lang.Object value) {
		setValue(test.generated.pg_catalog.routines.Ginarrayconsistent._3, value);
	}

	/**
	 * Set the <code>_3</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__3(org.jooq.Field<java.lang.Object> field) {
		setField(_3, field);
	}

	/**
	 * Set the <code>_4</code> parameter IN value to the routine
	 */
	public void set__4(java.lang.Integer value) {
		setValue(test.generated.pg_catalog.routines.Ginarrayconsistent._4, value);
	}

	/**
	 * Set the <code>_4</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__4(org.jooq.Field<java.lang.Integer> field) {
		setField(_4, field);
	}

	/**
	 * Set the <code>_5</code> parameter IN value to the routine
	 */
	public void set__5(java.lang.Object value) {
		setValue(test.generated.pg_catalog.routines.Ginarrayconsistent._5, value);
	}

	/**
	 * Set the <code>_5</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__5(org.jooq.Field<java.lang.Object> field) {
		setField(_5, field);
	}

	/**
	 * Set the <code>_6</code> parameter IN value to the routine
	 */
	public void set__6(java.lang.Object value) {
		setValue(test.generated.pg_catalog.routines.Ginarrayconsistent._6, value);
	}

	/**
	 * Set the <code>_6</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__6(org.jooq.Field<java.lang.Object> field) {
		setField(_6, field);
	}
}
