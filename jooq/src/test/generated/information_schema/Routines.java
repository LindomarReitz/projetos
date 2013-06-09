/**
 * This class is generated by jOOQ
 */
package test.generated.information_schema;

/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all stored procedures and functions in information_schema
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public final class Routines {

	/**
	 * Call information_schema._pg_char_max_length
	 *
	 * @param typid
	 * @param typmod
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.lang.Integer _PgCharMaxLength(org.jooq.Configuration configuration, java.lang.Long typid, java.lang.Integer typmod) {
		test.generated.information_schema.routines._PgCharMaxLength f = new test.generated.information_schema.routines._PgCharMaxLength();
		f.setTypid(typid);
		f.setTypmod(typmod);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get information_schema._pg_char_max_length as a field
	 *
	 * @param typid
	 * @param typmod
	 */
	public static org.jooq.Field<java.lang.Integer> _PgCharMaxLength(java.lang.Long typid, java.lang.Integer typmod) {
		test.generated.information_schema.routines._PgCharMaxLength f = new test.generated.information_schema.routines._PgCharMaxLength();
		f.setTypid(typid);
		f.setTypmod(typmod);

		return f.asField();
	}

	/**
	 * Get information_schema._pg_char_max_length as a field
	 *
	 * @param typid
	 * @param typmod
	 */
	public static org.jooq.Field<java.lang.Integer> _PgCharMaxLength(org.jooq.Field<java.lang.Long> typid, org.jooq.Field<java.lang.Integer> typmod) {
		test.generated.information_schema.routines._PgCharMaxLength f = new test.generated.information_schema.routines._PgCharMaxLength();
		f.setTypid(typid);
		f.setTypmod(typmod);

		return f.asField();
	}

	/**
	 * Call information_schema._pg_char_octet_length
	 *
	 * @param typid
	 * @param typmod
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.lang.Integer _PgCharOctetLength(org.jooq.Configuration configuration, java.lang.Long typid, java.lang.Integer typmod) {
		test.generated.information_schema.routines._PgCharOctetLength f = new test.generated.information_schema.routines._PgCharOctetLength();
		f.setTypid(typid);
		f.setTypmod(typmod);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get information_schema._pg_char_octet_length as a field
	 *
	 * @param typid
	 * @param typmod
	 */
	public static org.jooq.Field<java.lang.Integer> _PgCharOctetLength(java.lang.Long typid, java.lang.Integer typmod) {
		test.generated.information_schema.routines._PgCharOctetLength f = new test.generated.information_schema.routines._PgCharOctetLength();
		f.setTypid(typid);
		f.setTypmod(typmod);

		return f.asField();
	}

	/**
	 * Get information_schema._pg_char_octet_length as a field
	 *
	 * @param typid
	 * @param typmod
	 */
	public static org.jooq.Field<java.lang.Integer> _PgCharOctetLength(org.jooq.Field<java.lang.Long> typid, org.jooq.Field<java.lang.Integer> typmod) {
		test.generated.information_schema.routines._PgCharOctetLength f = new test.generated.information_schema.routines._PgCharOctetLength();
		f.setTypid(typid);
		f.setTypmod(typmod);

		return f.asField();
	}

	/**
	 * Call information_schema._pg_datetime_precision
	 *
	 * @param typid
	 * @param typmod
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.lang.Integer _PgDatetimePrecision(org.jooq.Configuration configuration, java.lang.Long typid, java.lang.Integer typmod) {
		test.generated.information_schema.routines._PgDatetimePrecision f = new test.generated.information_schema.routines._PgDatetimePrecision();
		f.setTypid(typid);
		f.setTypmod(typmod);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get information_schema._pg_datetime_precision as a field
	 *
	 * @param typid
	 * @param typmod
	 */
	public static org.jooq.Field<java.lang.Integer> _PgDatetimePrecision(java.lang.Long typid, java.lang.Integer typmod) {
		test.generated.information_schema.routines._PgDatetimePrecision f = new test.generated.information_schema.routines._PgDatetimePrecision();
		f.setTypid(typid);
		f.setTypmod(typmod);

		return f.asField();
	}

	/**
	 * Get information_schema._pg_datetime_precision as a field
	 *
	 * @param typid
	 * @param typmod
	 */
	public static org.jooq.Field<java.lang.Integer> _PgDatetimePrecision(org.jooq.Field<java.lang.Long> typid, org.jooq.Field<java.lang.Integer> typmod) {
		test.generated.information_schema.routines._PgDatetimePrecision f = new test.generated.information_schema.routines._PgDatetimePrecision();
		f.setTypid(typid);
		f.setTypmod(typmod);

		return f.asField();
	}

	/**
	 * Call information_schema._pg_expandarray
	 *
	 * @param __1 IN parameter
	 * @param x OUT parameter
	 * @param n OUT parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static test.generated.information_schema.routines._PgExpandarray _PgExpandarray(org.jooq.Configuration configuration, java.lang.Object __1) {
		test.generated.information_schema.routines._PgExpandarray p = new test.generated.information_schema.routines._PgExpandarray();
		p.set__1(__1);

		p.execute(configuration);
		return p;
	}

	/**
	 * Call information_schema._pg_index_position
	 *
	 * @param __1
	 * @param __2
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.lang.Integer _PgIndexPosition(org.jooq.Configuration configuration, java.lang.Long __1, java.lang.Short __2) {
		test.generated.information_schema.routines._PgIndexPosition f = new test.generated.information_schema.routines._PgIndexPosition();
		f.set__1(__1);
		f.set__2(__2);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get information_schema._pg_index_position as a field
	 *
	 * @param __1
	 * @param __2
	 */
	public static org.jooq.Field<java.lang.Integer> _PgIndexPosition(java.lang.Long __1, java.lang.Short __2) {
		test.generated.information_schema.routines._PgIndexPosition f = new test.generated.information_schema.routines._PgIndexPosition();
		f.set__1(__1);
		f.set__2(__2);

		return f.asField();
	}

	/**
	 * Get information_schema._pg_index_position as a field
	 *
	 * @param __1
	 * @param __2
	 */
	public static org.jooq.Field<java.lang.Integer> _PgIndexPosition(org.jooq.Field<java.lang.Long> __1, org.jooq.Field<java.lang.Short> __2) {
		test.generated.information_schema.routines._PgIndexPosition f = new test.generated.information_schema.routines._PgIndexPosition();
		f.set__1(__1);
		f.set__2(__2);

		return f.asField();
	}

	/**
	 * Call information_schema._pg_keysequal
	 *
	 * @param __1
	 * @param __2
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.lang.Boolean _PgKeysequal(org.jooq.Configuration configuration, java.lang.Short[] __1, java.lang.Short[] __2) {
		test.generated.information_schema.routines._PgKeysequal f = new test.generated.information_schema.routines._PgKeysequal();
		f.set__1(__1);
		f.set__2(__2);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get information_schema._pg_keysequal as a field
	 *
	 * @param __1
	 * @param __2
	 */
	public static org.jooq.Field<java.lang.Boolean> _PgKeysequal(java.lang.Short[] __1, java.lang.Short[] __2) {
		test.generated.information_schema.routines._PgKeysequal f = new test.generated.information_schema.routines._PgKeysequal();
		f.set__1(__1);
		f.set__2(__2);

		return f.asField();
	}

	/**
	 * Get information_schema._pg_keysequal as a field
	 *
	 * @param __1
	 * @param __2
	 */
	public static org.jooq.Field<java.lang.Boolean> _PgKeysequal(org.jooq.Field<java.lang.Short[]> __1, org.jooq.Field<java.lang.Short[]> __2) {
		test.generated.information_schema.routines._PgKeysequal f = new test.generated.information_schema.routines._PgKeysequal();
		f.set__1(__1);
		f.set__2(__2);

		return f.asField();
	}

	/**
	 * Call information_schema._pg_numeric_precision
	 *
	 * @param typid
	 * @param typmod
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.lang.Integer _PgNumericPrecision(org.jooq.Configuration configuration, java.lang.Long typid, java.lang.Integer typmod) {
		test.generated.information_schema.routines._PgNumericPrecision f = new test.generated.information_schema.routines._PgNumericPrecision();
		f.setTypid(typid);
		f.setTypmod(typmod);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get information_schema._pg_numeric_precision as a field
	 *
	 * @param typid
	 * @param typmod
	 */
	public static org.jooq.Field<java.lang.Integer> _PgNumericPrecision(java.lang.Long typid, java.lang.Integer typmod) {
		test.generated.information_schema.routines._PgNumericPrecision f = new test.generated.information_schema.routines._PgNumericPrecision();
		f.setTypid(typid);
		f.setTypmod(typmod);

		return f.asField();
	}

	/**
	 * Get information_schema._pg_numeric_precision as a field
	 *
	 * @param typid
	 * @param typmod
	 */
	public static org.jooq.Field<java.lang.Integer> _PgNumericPrecision(org.jooq.Field<java.lang.Long> typid, org.jooq.Field<java.lang.Integer> typmod) {
		test.generated.information_schema.routines._PgNumericPrecision f = new test.generated.information_schema.routines._PgNumericPrecision();
		f.setTypid(typid);
		f.setTypmod(typmod);

		return f.asField();
	}

	/**
	 * Call information_schema._pg_numeric_precision_radix
	 *
	 * @param typid
	 * @param typmod
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.lang.Integer _PgNumericPrecisionRadix(org.jooq.Configuration configuration, java.lang.Long typid, java.lang.Integer typmod) {
		test.generated.information_schema.routines._PgNumericPrecisionRadix f = new test.generated.information_schema.routines._PgNumericPrecisionRadix();
		f.setTypid(typid);
		f.setTypmod(typmod);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get information_schema._pg_numeric_precision_radix as a field
	 *
	 * @param typid
	 * @param typmod
	 */
	public static org.jooq.Field<java.lang.Integer> _PgNumericPrecisionRadix(java.lang.Long typid, java.lang.Integer typmod) {
		test.generated.information_schema.routines._PgNumericPrecisionRadix f = new test.generated.information_schema.routines._PgNumericPrecisionRadix();
		f.setTypid(typid);
		f.setTypmod(typmod);

		return f.asField();
	}

	/**
	 * Get information_schema._pg_numeric_precision_radix as a field
	 *
	 * @param typid
	 * @param typmod
	 */
	public static org.jooq.Field<java.lang.Integer> _PgNumericPrecisionRadix(org.jooq.Field<java.lang.Long> typid, org.jooq.Field<java.lang.Integer> typmod) {
		test.generated.information_schema.routines._PgNumericPrecisionRadix f = new test.generated.information_schema.routines._PgNumericPrecisionRadix();
		f.setTypid(typid);
		f.setTypmod(typmod);

		return f.asField();
	}

	/**
	 * Call information_schema._pg_numeric_scale
	 *
	 * @param typid
	 * @param typmod
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.lang.Integer _PgNumericScale(org.jooq.Configuration configuration, java.lang.Long typid, java.lang.Integer typmod) {
		test.generated.information_schema.routines._PgNumericScale f = new test.generated.information_schema.routines._PgNumericScale();
		f.setTypid(typid);
		f.setTypmod(typmod);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get information_schema._pg_numeric_scale as a field
	 *
	 * @param typid
	 * @param typmod
	 */
	public static org.jooq.Field<java.lang.Integer> _PgNumericScale(java.lang.Long typid, java.lang.Integer typmod) {
		test.generated.information_schema.routines._PgNumericScale f = new test.generated.information_schema.routines._PgNumericScale();
		f.setTypid(typid);
		f.setTypmod(typmod);

		return f.asField();
	}

	/**
	 * Get information_schema._pg_numeric_scale as a field
	 *
	 * @param typid
	 * @param typmod
	 */
	public static org.jooq.Field<java.lang.Integer> _PgNumericScale(org.jooq.Field<java.lang.Long> typid, org.jooq.Field<java.lang.Integer> typmod) {
		test.generated.information_schema.routines._PgNumericScale f = new test.generated.information_schema.routines._PgNumericScale();
		f.setTypid(typid);
		f.setTypmod(typmod);

		return f.asField();
	}

	/**
	 * Call information_schema._pg_truetypid
	 *
	 * @param __1
	 * @param __2
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.lang.Long _PgTruetypid(org.jooq.Configuration configuration, java.lang.Object __1, java.lang.Object __2) {
		test.generated.information_schema.routines._PgTruetypid f = new test.generated.information_schema.routines._PgTruetypid();
		f.set__1(__1);
		f.set__2(__2);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get information_schema._pg_truetypid as a field
	 *
	 * @param __1
	 * @param __2
	 */
	public static org.jooq.Field<java.lang.Long> _PgTruetypid(java.lang.Object __1, java.lang.Object __2) {
		test.generated.information_schema.routines._PgTruetypid f = new test.generated.information_schema.routines._PgTruetypid();
		f.set__1(__1);
		f.set__2(__2);

		return f.asField();
	}

	/**
	 * Get information_schema._pg_truetypid as a field
	 *
	 * @param __1
	 * @param __2
	 */
	public static org.jooq.Field<java.lang.Long> _PgTruetypid(org.jooq.Field<java.lang.Object> __1, org.jooq.Field<java.lang.Object> __2) {
		test.generated.information_schema.routines._PgTruetypid f = new test.generated.information_schema.routines._PgTruetypid();
		f.set__1(__1);
		f.set__2(__2);

		return f.asField();
	}

	/**
	 * Call information_schema._pg_truetypmod
	 *
	 * @param __1
	 * @param __2
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.lang.Integer _PgTruetypmod(org.jooq.Configuration configuration, java.lang.Object __1, java.lang.Object __2) {
		test.generated.information_schema.routines._PgTruetypmod f = new test.generated.information_schema.routines._PgTruetypmod();
		f.set__1(__1);
		f.set__2(__2);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get information_schema._pg_truetypmod as a field
	 *
	 * @param __1
	 * @param __2
	 */
	public static org.jooq.Field<java.lang.Integer> _PgTruetypmod(java.lang.Object __1, java.lang.Object __2) {
		test.generated.information_schema.routines._PgTruetypmod f = new test.generated.information_schema.routines._PgTruetypmod();
		f.set__1(__1);
		f.set__2(__2);

		return f.asField();
	}

	/**
	 * Get information_schema._pg_truetypmod as a field
	 *
	 * @param __1
	 * @param __2
	 */
	public static org.jooq.Field<java.lang.Integer> _PgTruetypmod(org.jooq.Field<java.lang.Object> __1, org.jooq.Field<java.lang.Object> __2) {
		test.generated.information_schema.routines._PgTruetypmod f = new test.generated.information_schema.routines._PgTruetypmod();
		f.set__1(__1);
		f.set__2(__2);

		return f.asField();
	}

	/**
	 * No instances
	 */
	private Routines() {}
}
