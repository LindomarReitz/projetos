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
public class RowNumber extends org.jooq.impl.AbstractRoutine<java.lang.Long> {

	private static final long serialVersionUID = 1194992932;


	/**
	 * The procedure parameter <code>pg_catalog.row_number.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.lang.Long> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * Create a new routine call instance
	 */
	public RowNumber() {
		super("row_number", test.generated.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.BIGINT);

		setReturnParameter(RETURN_VALUE);
	}
}
