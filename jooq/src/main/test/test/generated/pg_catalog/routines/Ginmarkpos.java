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
public class Ginmarkpos extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -981147574;


	/**
	 * The procedure parameter <code>pg_catalog.ginmarkpos._1</code>
	 * <p>
	 * The SQL type of this item (internal) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.Parameter<java.lang.Object> _1 = createParameter("_1", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("internal"));

	/**
	 * Create a new routine call instance
	 */
	public Ginmarkpos() {
		super("ginmarkpos", test.generated.pg_catalog.PgCatalog.PG_CATALOG);

		addInParameter(_1);
	}

	/**
	 * Set the <code>_1</code> parameter IN value to the routine
	 */
	public void set__1(java.lang.Object value) {
		setValue(test.generated.pg_catalog.routines.Ginmarkpos._1, value);
	}
}
