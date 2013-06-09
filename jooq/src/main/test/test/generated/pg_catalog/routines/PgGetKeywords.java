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
public class PgGetKeywords extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 1980261117;


	/**
	 * The procedure parameter <code>pg_catalog.pg_get_keywords.word</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> WORD = createParameter("word", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * The procedure parameter <code>pg_catalog.pg_get_keywords.catcode</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> CATCODE = createParameter("catcode", org.jooq.impl.SQLDataType.CHAR);

	/**
	 * The procedure parameter <code>pg_catalog.pg_get_keywords.catdesc</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> CATDESC = createParameter("catdesc", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * Create a new routine call instance
	 */
	public PgGetKeywords() {
		super("pg_get_keywords", test.generated.pg_catalog.PgCatalog.PG_CATALOG);

		addOutParameter(WORD);
		addOutParameter(CATCODE);
		addOutParameter(CATDESC);
	}

	/**
	 * Get the <code>word</code> parameter OUT value from the routine
	 */
	public java.lang.String getWord() {
		return getValue(WORD);
	}

	/**
	 * Get the <code>catcode</code> parameter OUT value from the routine
	 */
	public java.lang.String getCatcode() {
		return getValue(CATCODE);
	}

	/**
	 * Get the <code>catdesc</code> parameter OUT value from the routine
	 */
	public java.lang.String getCatdesc() {
		return getValue(CATDESC);
	}
}
