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
public class PgXlogfileNameOffset extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 1705552143;


	/**
	 * The procedure parameter <code>pg_catalog.pg_xlogfile_name_offset.wal_location</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> WAL_LOCATION = createParameter("wal_location", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * The procedure parameter <code>pg_catalog.pg_xlogfile_name_offset.file_name</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> FILE_NAME = createParameter("file_name", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * The procedure parameter <code>pg_catalog.pg_xlogfile_name_offset.file_offset</code>
	 */
	public static final org.jooq.Parameter<java.lang.Integer> FILE_OFFSET = createParameter("file_offset", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public PgXlogfileNameOffset() {
		super("pg_xlogfile_name_offset", test.generated.pg_catalog.PgCatalog.PG_CATALOG);

		addInParameter(WAL_LOCATION);
		addOutParameter(FILE_NAME);
		addOutParameter(FILE_OFFSET);
	}

	/**
	 * Set the <code>wal_location</code> parameter IN value to the routine
	 */
	public void setWalLocation(java.lang.String value) {
		setValue(test.generated.pg_catalog.routines.PgXlogfileNameOffset.WAL_LOCATION, value);
	}

	/**
	 * Get the <code>file_name</code> parameter OUT value from the routine
	 */
	public java.lang.String getFileName() {
		return getValue(FILE_NAME);
	}

	/**
	 * Get the <code>file_offset</code> parameter OUT value from the routine
	 */
	public java.lang.Integer getFileOffset() {
		return getValue(FILE_OFFSET);
	}
}