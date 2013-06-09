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
public class Timenow extends org.jooq.impl.AbstractRoutine<java.lang.Object> {

	private static final long serialVersionUID = 1113379242;


	/**
	 * The procedure parameter <code>pg_catalog.timenow.RETURN_VALUE</code>
	 * <p>
	 * The SQL type of this item (abstime) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.Parameter<java.lang.Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("abstime"));

	/**
	 * Create a new routine call instance
	 */
	public Timenow() {
		super("timenow", test.generated.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.util.postgres.PostgresDataType.getDefaultDataType("abstime"));

		setReturnParameter(RETURN_VALUE);
	}
}
