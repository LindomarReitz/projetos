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
public class PgLastXlogReceiveLocation extends org.jooq.impl.AbstractRoutine<java.lang.String> {

	private static final long serialVersionUID = -826353640;


	/**
	 * The procedure parameter <code>pg_catalog.pg_last_xlog_receive_location.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * Create a new routine call instance
	 */
	public PgLastXlogReceiveLocation() {
		super("pg_last_xlog_receive_location", test.generated.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.CLOB);

		setReturnParameter(RETURN_VALUE);
	}
}
