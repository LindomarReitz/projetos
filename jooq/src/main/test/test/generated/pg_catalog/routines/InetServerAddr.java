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
public class InetServerAddr extends org.jooq.impl.AbstractRoutine<java.lang.Object> {

	private static final long serialVersionUID = 267546879;


	/**
	 * The procedure parameter <code>pg_catalog.inet_server_addr.RETURN_VALUE</code>
	 * <p>
	 * The SQL type of this item (inet) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.Parameter<java.lang.Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("inet"));

	/**
	 * Create a new routine call instance
	 */
	public InetServerAddr() {
		super("inet_server_addr", test.generated.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.util.postgres.PostgresDataType.getDefaultDataType("inet"));

		setReturnParameter(RETURN_VALUE);
	}
}
