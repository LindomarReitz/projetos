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
public class PgStatGetBgwriterMaxwrittenClean extends org.jooq.impl.AbstractRoutine<java.lang.Long> {

	private static final long serialVersionUID = 1175212740;


	/**
	 * The procedure parameter <code>pg_catalog.pg_stat_get_bgwriter_maxwritten_clean.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.lang.Long> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * Create a new routine call instance
	 */
	public PgStatGetBgwriterMaxwrittenClean() {
		super("pg_stat_get_bgwriter_maxwritten_clean", test.generated.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.BIGINT);

		setReturnParameter(RETURN_VALUE);
	}
}