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
public class CurrentUser extends org.jooq.impl.AbstractRoutine<java.lang.String> {

	private static final long serialVersionUID = 1310932880;


	/**
	 * The procedure parameter <code>pg_catalog.current_user.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * Create a new routine call instance
	 */
	public CurrentUser() {
		super("current_user", test.generated.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.VARCHAR);

		setReturnParameter(RETURN_VALUE);
	}
}
