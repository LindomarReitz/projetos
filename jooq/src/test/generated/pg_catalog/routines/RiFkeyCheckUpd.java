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
public class RiFkeyCheckUpd extends org.jooq.impl.AbstractRoutine<java.lang.Object> {

	private static final long serialVersionUID = 1667664731;


	/**
	 * The procedure parameter <code>pg_catalog.RI_FKey_check_upd.RETURN_VALUE</code>
	 * <p>
	 * The SQL type of this item (trigger) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.Parameter<java.lang.Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("trigger"));

	/**
	 * Create a new routine call instance
	 */
	public RiFkeyCheckUpd() {
		super("RI_FKey_check_upd", test.generated.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.util.postgres.PostgresDataType.getDefaultDataType("trigger"));

		setReturnParameter(RETURN_VALUE);
	}
}