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
public class QueryToXmlschema extends org.jooq.impl.AbstractRoutine<java.lang.Object> {

	private static final long serialVersionUID = 120456080;


	/**
	 * The procedure parameter <code>pg_catalog.query_to_xmlschema.RETURN_VALUE</code>
	 * <p>
	 * The SQL type of this item (xml) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.Parameter<java.lang.Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("xml"));

	/**
	 * The procedure parameter <code>pg_catalog.query_to_xmlschema.query</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> QUERY = createParameter("query", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * The procedure parameter <code>pg_catalog.query_to_xmlschema.nulls</code>
	 */
	public static final org.jooq.Parameter<java.lang.Boolean> NULLS = createParameter("nulls", org.jooq.impl.SQLDataType.BOOLEAN);

	/**
	 * The procedure parameter <code>pg_catalog.query_to_xmlschema.tableforest</code>
	 */
	public static final org.jooq.Parameter<java.lang.Boolean> TABLEFOREST = createParameter("tableforest", org.jooq.impl.SQLDataType.BOOLEAN);

	/**
	 * The procedure parameter <code>pg_catalog.query_to_xmlschema.targetns</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> TARGETNS = createParameter("targetns", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * Create a new routine call instance
	 */
	public QueryToXmlschema() {
		super("query_to_xmlschema", test.generated.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.util.postgres.PostgresDataType.getDefaultDataType("xml"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(QUERY);
		addInParameter(NULLS);
		addInParameter(TABLEFOREST);
		addInParameter(TARGETNS);
	}

	/**
	 * Set the <code>query</code> parameter IN value to the routine
	 */
	public void setQuery(java.lang.String value) {
		setValue(test.generated.pg_catalog.routines.QueryToXmlschema.QUERY, value);
	}

	/**
	 * Set the <code>query</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setQuery(org.jooq.Field<java.lang.String> field) {
		setField(QUERY, field);
	}

	/**
	 * Set the <code>nulls</code> parameter IN value to the routine
	 */
	public void setNulls(java.lang.Boolean value) {
		setValue(test.generated.pg_catalog.routines.QueryToXmlschema.NULLS, value);
	}

	/**
	 * Set the <code>nulls</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setNulls(org.jooq.Field<java.lang.Boolean> field) {
		setField(NULLS, field);
	}

	/**
	 * Set the <code>tableforest</code> parameter IN value to the routine
	 */
	public void setTableforest(java.lang.Boolean value) {
		setValue(test.generated.pg_catalog.routines.QueryToXmlschema.TABLEFOREST, value);
	}

	/**
	 * Set the <code>tableforest</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setTableforest(org.jooq.Field<java.lang.Boolean> field) {
		setField(TABLEFOREST, field);
	}

	/**
	 * Set the <code>targetns</code> parameter IN value to the routine
	 */
	public void setTargetns(java.lang.String value) {
		setValue(test.generated.pg_catalog.routines.QueryToXmlschema.TARGETNS, value);
	}

	/**
	 * Set the <code>targetns</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setTargetns(org.jooq.Field<java.lang.String> field) {
		setField(TARGETNS, field);
	}
}
