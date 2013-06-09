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
public class MicToIso extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -921321369;


	/**
	 * The procedure parameter <code>pg_catalog.mic_to_iso._1</code>
	 */
	public static final org.jooq.Parameter<java.lang.Integer> _1 = createParameter("_1", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The procedure parameter <code>pg_catalog.mic_to_iso._2</code>
	 */
	public static final org.jooq.Parameter<java.lang.Integer> _2 = createParameter("_2", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The procedure parameter <code>pg_catalog.mic_to_iso._3</code>
	 * <p>
	 * The SQL type of this item (cstring) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.Parameter<java.lang.Object> _3 = createParameter("_3", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("cstring"));

	/**
	 * The procedure parameter <code>pg_catalog.mic_to_iso._4</code>
	 * <p>
	 * The SQL type of this item (internal) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.Parameter<java.lang.Object> _4 = createParameter("_4", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("internal"));

	/**
	 * The procedure parameter <code>pg_catalog.mic_to_iso._5</code>
	 */
	public static final org.jooq.Parameter<java.lang.Integer> _5 = createParameter("_5", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public MicToIso() {
		super("mic_to_iso", test.generated.pg_catalog.PgCatalog.PG_CATALOG);

		addInParameter(_1);
		addInParameter(_2);
		addInParameter(_3);
		addInParameter(_4);
		addInParameter(_5);
	}

	/**
	 * Set the <code>_1</code> parameter IN value to the routine
	 */
	public void set__1(java.lang.Integer value) {
		setValue(test.generated.pg_catalog.routines.MicToIso._1, value);
	}

	/**
	 * Set the <code>_2</code> parameter IN value to the routine
	 */
	public void set__2(java.lang.Integer value) {
		setValue(test.generated.pg_catalog.routines.MicToIso._2, value);
	}

	/**
	 * Set the <code>_3</code> parameter IN value to the routine
	 */
	public void set__3(java.lang.Object value) {
		setValue(test.generated.pg_catalog.routines.MicToIso._3, value);
	}

	/**
	 * Set the <code>_4</code> parameter IN value to the routine
	 */
	public void set__4(java.lang.Object value) {
		setValue(test.generated.pg_catalog.routines.MicToIso._4, value);
	}

	/**
	 * Set the <code>_5</code> parameter IN value to the routine
	 */
	public void set__5(java.lang.Integer value) {
		setValue(test.generated.pg_catalog.routines.MicToIso._5, value);
	}
}
