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
public class HasColumnPrivilege4 extends org.jooq.impl.AbstractRoutine<java.lang.Boolean> {

	private static final long serialVersionUID = -882063779;


	/**
	 * The procedure parameter <code>pg_catalog.has_column_privilege.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.lang.Boolean> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BOOLEAN);

	/**
	 * The procedure parameter <code>pg_catalog.has_column_privilege._1</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> _1 = createParameter("_1", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * The procedure parameter <code>pg_catalog.has_column_privilege._2</code>
	 */
	public static final org.jooq.Parameter<java.lang.Long> _2 = createParameter("_2", org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * The procedure parameter <code>pg_catalog.has_column_privilege._3</code>
	 */
	public static final org.jooq.Parameter<java.lang.Short> _3 = createParameter("_3", org.jooq.impl.SQLDataType.SMALLINT);

	/**
	 * The procedure parameter <code>pg_catalog.has_column_privilege._4</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> _4 = createParameter("_4", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * Create a new routine call instance
	 */
	public HasColumnPrivilege4() {
		super("has_column_privilege", test.generated.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.BOOLEAN);

		setReturnParameter(RETURN_VALUE);
		addInParameter(_1);
		addInParameter(_2);
		addInParameter(_3);
		addInParameter(_4);
		setOverloaded(true);
	}

	/**
	 * Set the <code>_1</code> parameter IN value to the routine
	 */
	public void set__1(java.lang.String value) {
		setValue(test.generated.pg_catalog.routines.HasColumnPrivilege4._1, value);
	}

	/**
	 * Set the <code>_1</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__1(org.jooq.Field<java.lang.String> field) {
		setField(_1, field);
	}

	/**
	 * Set the <code>_2</code> parameter IN value to the routine
	 */
	public void set__2(java.lang.Long value) {
		setValue(test.generated.pg_catalog.routines.HasColumnPrivilege4._2, value);
	}

	/**
	 * Set the <code>_2</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__2(org.jooq.Field<java.lang.Long> field) {
		setField(_2, field);
	}

	/**
	 * Set the <code>_3</code> parameter IN value to the routine
	 */
	public void set__3(java.lang.Short value) {
		setValue(test.generated.pg_catalog.routines.HasColumnPrivilege4._3, value);
	}

	/**
	 * Set the <code>_3</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__3(org.jooq.Field<java.lang.Short> field) {
		setField(_3, field);
	}

	/**
	 * Set the <code>_4</code> parameter IN value to the routine
	 */
	public void set__4(java.lang.String value) {
		setValue(test.generated.pg_catalog.routines.HasColumnPrivilege4._4, value);
	}

	/**
	 * Set the <code>_4</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__4(org.jooq.Field<java.lang.String> field) {
		setField(_4, field);
	}
}
