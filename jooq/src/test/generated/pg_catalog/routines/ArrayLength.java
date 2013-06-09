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
public class ArrayLength extends org.jooq.impl.AbstractRoutine<java.lang.Integer> {

	private static final long serialVersionUID = 289632140;


	/**
	 * The procedure parameter <code>pg_catalog.array_length.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.lang.Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The procedure parameter <code>pg_catalog.array_length._1</code>
	 * <p>
	 * The SQL type of this item (anyarray) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.Parameter<java.lang.Object> _1 = createParameter("_1", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("anyarray"));

	/**
	 * The procedure parameter <code>pg_catalog.array_length._2</code>
	 */
	public static final org.jooq.Parameter<java.lang.Integer> _2 = createParameter("_2", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public ArrayLength() {
		super("array_length", test.generated.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.INTEGER);

		setReturnParameter(RETURN_VALUE);
		addInParameter(_1);
		addInParameter(_2);
	}

	/**
	 * Set the <code>_1</code> parameter IN value to the routine
	 */
	public void set__1(java.lang.Object value) {
		setValue(test.generated.pg_catalog.routines.ArrayLength._1, value);
	}

	/**
	 * Set the <code>_1</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__1(org.jooq.Field<java.lang.Object> field) {
		setField(_1, field);
	}

	/**
	 * Set the <code>_2</code> parameter IN value to the routine
	 */
	public void set__2(java.lang.Integer value) {
		setValue(test.generated.pg_catalog.routines.ArrayLength._2, value);
	}

	/**
	 * Set the <code>_2</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__2(org.jooq.Field<java.lang.Integer> field) {
		setField(_2, field);
	}
}
