/**
 * This class is generated by jOOQ
 */
package test.generated.information_schema.routines;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class _PgNumericScale extends org.jooq.impl.AbstractRoutine<java.lang.Integer> {

	private static final long serialVersionUID = -1159681066;


	/**
	 * The procedure parameter <code>information_schema._pg_numeric_scale.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.lang.Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The procedure parameter <code>information_schema._pg_numeric_scale.typid</code>
	 */
	public static final org.jooq.Parameter<java.lang.Long> TYPID = createParameter("typid", org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * The procedure parameter <code>information_schema._pg_numeric_scale.typmod</code>
	 */
	public static final org.jooq.Parameter<java.lang.Integer> TYPMOD = createParameter("typmod", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public _PgNumericScale() {
		super("_pg_numeric_scale", test.generated.information_schema.InformationSchema.INFORMATION_SCHEMA, org.jooq.impl.SQLDataType.INTEGER);

		setReturnParameter(RETURN_VALUE);
		addInParameter(TYPID);
		addInParameter(TYPMOD);
	}

	/**
	 * Set the <code>typid</code> parameter IN value to the routine
	 */
	public void setTypid(java.lang.Long value) {
		setValue(test.generated.information_schema.routines._PgNumericScale.TYPID, value);
	}

	/**
	 * Set the <code>typid</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setTypid(org.jooq.Field<java.lang.Long> field) {
		setField(TYPID, field);
	}

	/**
	 * Set the <code>typmod</code> parameter IN value to the routine
	 */
	public void setTypmod(java.lang.Integer value) {
		setValue(test.generated.information_schema.routines._PgNumericScale.TYPMOD, value);
	}

	/**
	 * Set the <code>typmod</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setTypmod(org.jooq.Field<java.lang.Integer> field) {
		setField(TYPMOD, field);
	}
}
