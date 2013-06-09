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
public class _PgIndexPosition extends org.jooq.impl.AbstractRoutine<java.lang.Integer> {

	private static final long serialVersionUID = 947565944;


	/**
	 * The procedure parameter <code>information_schema._pg_index_position.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.lang.Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The procedure parameter <code>information_schema._pg_index_position._1</code>
	 */
	public static final org.jooq.Parameter<java.lang.Long> _1 = createParameter("_1", org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * The procedure parameter <code>information_schema._pg_index_position._2</code>
	 */
	public static final org.jooq.Parameter<java.lang.Short> _2 = createParameter("_2", org.jooq.impl.SQLDataType.SMALLINT);

	/**
	 * Create a new routine call instance
	 */
	public _PgIndexPosition() {
		super("_pg_index_position", test.generated.information_schema.InformationSchema.INFORMATION_SCHEMA, org.jooq.impl.SQLDataType.INTEGER);

		setReturnParameter(RETURN_VALUE);
		addInParameter(_1);
		addInParameter(_2);
	}

	/**
	 * Set the <code>_1</code> parameter IN value to the routine
	 */
	public void set__1(java.lang.Long value) {
		setValue(test.generated.information_schema.routines._PgIndexPosition._1, value);
	}

	/**
	 * Set the <code>_1</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__1(org.jooq.Field<java.lang.Long> field) {
		setField(_1, field);
	}

	/**
	 * Set the <code>_2</code> parameter IN value to the routine
	 */
	public void set__2(java.lang.Short value) {
		setValue(test.generated.information_schema.routines._PgIndexPosition._2, value);
	}

	/**
	 * Set the <code>_2</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__2(org.jooq.Field<java.lang.Short> field) {
		setField(_2, field);
	}
}