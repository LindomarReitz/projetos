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
public class Gincostestimate extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -484865446;


	/**
	 * The procedure parameter <code>pg_catalog.gincostestimate._1</code>
	 * <p>
	 * The SQL type of this item (internal) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.Parameter<java.lang.Object> _1 = createParameter("_1", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("internal"));

	/**
	 * The procedure parameter <code>pg_catalog.gincostestimate._2</code>
	 * <p>
	 * The SQL type of this item (internal) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.Parameter<java.lang.Object> _2 = createParameter("_2", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("internal"));

	/**
	 * The procedure parameter <code>pg_catalog.gincostestimate._3</code>
	 * <p>
	 * The SQL type of this item (internal) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.Parameter<java.lang.Object> _3 = createParameter("_3", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("internal"));

	/**
	 * The procedure parameter <code>pg_catalog.gincostestimate._4</code>
	 * <p>
	 * The SQL type of this item (internal) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.Parameter<java.lang.Object> _4 = createParameter("_4", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("internal"));

	/**
	 * The procedure parameter <code>pg_catalog.gincostestimate._5</code>
	 * <p>
	 * The SQL type of this item (internal) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.Parameter<java.lang.Object> _5 = createParameter("_5", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("internal"));

	/**
	 * The procedure parameter <code>pg_catalog.gincostestimate._6</code>
	 * <p>
	 * The SQL type of this item (internal) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.Parameter<java.lang.Object> _6 = createParameter("_6", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("internal"));

	/**
	 * The procedure parameter <code>pg_catalog.gincostestimate._7</code>
	 * <p>
	 * The SQL type of this item (internal) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.Parameter<java.lang.Object> _7 = createParameter("_7", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("internal"));

	/**
	 * The procedure parameter <code>pg_catalog.gincostestimate._8</code>
	 * <p>
	 * The SQL type of this item (internal) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.Parameter<java.lang.Object> _8 = createParameter("_8", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("internal"));

	/**
	 * Create a new routine call instance
	 */
	public Gincostestimate() {
		super("gincostestimate", test.generated.pg_catalog.PgCatalog.PG_CATALOG);

		addInParameter(_1);
		addInParameter(_2);
		addInParameter(_3);
		addInParameter(_4);
		addInParameter(_5);
		addInParameter(_6);
		addInParameter(_7);
		addInParameter(_8);
	}

	/**
	 * Set the <code>_1</code> parameter IN value to the routine
	 */
	public void set__1(java.lang.Object value) {
		setValue(test.generated.pg_catalog.routines.Gincostestimate._1, value);
	}

	/**
	 * Set the <code>_2</code> parameter IN value to the routine
	 */
	public void set__2(java.lang.Object value) {
		setValue(test.generated.pg_catalog.routines.Gincostestimate._2, value);
	}

	/**
	 * Set the <code>_3</code> parameter IN value to the routine
	 */
	public void set__3(java.lang.Object value) {
		setValue(test.generated.pg_catalog.routines.Gincostestimate._3, value);
	}

	/**
	 * Set the <code>_4</code> parameter IN value to the routine
	 */
	public void set__4(java.lang.Object value) {
		setValue(test.generated.pg_catalog.routines.Gincostestimate._4, value);
	}

	/**
	 * Set the <code>_5</code> parameter IN value to the routine
	 */
	public void set__5(java.lang.Object value) {
		setValue(test.generated.pg_catalog.routines.Gincostestimate._5, value);
	}

	/**
	 * Set the <code>_6</code> parameter IN value to the routine
	 */
	public void set__6(java.lang.Object value) {
		setValue(test.generated.pg_catalog.routines.Gincostestimate._6, value);
	}

	/**
	 * Set the <code>_7</code> parameter IN value to the routine
	 */
	public void set__7(java.lang.Object value) {
		setValue(test.generated.pg_catalog.routines.Gincostestimate._7, value);
	}

	/**
	 * Set the <code>_8</code> parameter IN value to the routine
	 */
	public void set__8(java.lang.Object value) {
		setValue(test.generated.pg_catalog.routines.Gincostestimate._8, value);
	}
}
