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
public class PgStatFile extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -255435023;


	/**
	 * The procedure parameter <code>pg_catalog.pg_stat_file.filename</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> FILENAME = createParameter("filename", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * The procedure parameter <code>pg_catalog.pg_stat_file.size</code>
	 */
	public static final org.jooq.Parameter<java.lang.Long> SIZE = createParameter("size", org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * The procedure parameter <code>pg_catalog.pg_stat_file.access</code>
	 */
	public static final org.jooq.Parameter<java.sql.Timestamp> ACCESS = createParameter("access", org.jooq.impl.SQLDataType.TIMESTAMP);

	/**
	 * The procedure parameter <code>pg_catalog.pg_stat_file.modification</code>
	 */
	public static final org.jooq.Parameter<java.sql.Timestamp> MODIFICATION = createParameter("modification", org.jooq.impl.SQLDataType.TIMESTAMP);

	/**
	 * The procedure parameter <code>pg_catalog.pg_stat_file.change</code>
	 */
	public static final org.jooq.Parameter<java.sql.Timestamp> CHANGE = createParameter("change", org.jooq.impl.SQLDataType.TIMESTAMP);

	/**
	 * The procedure parameter <code>pg_catalog.pg_stat_file.creation</code>
	 */
	public static final org.jooq.Parameter<java.sql.Timestamp> CREATION = createParameter("creation", org.jooq.impl.SQLDataType.TIMESTAMP);

	/**
	 * The procedure parameter <code>pg_catalog.pg_stat_file.isdir</code>
	 */
	public static final org.jooq.Parameter<java.lang.Boolean> ISDIR = createParameter("isdir", org.jooq.impl.SQLDataType.BOOLEAN);

	/**
	 * Create a new routine call instance
	 */
	public PgStatFile() {
		super("pg_stat_file", test.generated.pg_catalog.PgCatalog.PG_CATALOG);

		addInParameter(FILENAME);
		addOutParameter(SIZE);
		addOutParameter(ACCESS);
		addOutParameter(MODIFICATION);
		addOutParameter(CHANGE);
		addOutParameter(CREATION);
		addOutParameter(ISDIR);
	}

	/**
	 * Set the <code>filename</code> parameter IN value to the routine
	 */
	public void setFilename(java.lang.String value) {
		setValue(test.generated.pg_catalog.routines.PgStatFile.FILENAME, value);
	}

	/**
	 * Get the <code>size</code> parameter OUT value from the routine
	 */
	public java.lang.Long getSize() {
		return getValue(SIZE);
	}

	/**
	 * Get the <code>access</code> parameter OUT value from the routine
	 */
	public java.sql.Timestamp getAccess() {
		return getValue(ACCESS);
	}

	/**
	 * Get the <code>modification</code> parameter OUT value from the routine
	 */
	public java.sql.Timestamp getModification() {
		return getValue(MODIFICATION);
	}

	/**
	 * Get the <code>change</code> parameter OUT value from the routine
	 */
	public java.sql.Timestamp getChange() {
		return getValue(CHANGE);
	}

	/**
	 * Get the <code>creation</code> parameter OUT value from the routine
	 */
	public java.sql.Timestamp getCreation() {
		return getValue(CREATION);
	}

	/**
	 * Get the <code>isdir</code> parameter OUT value from the routine
	 */
	public java.lang.Boolean getIsdir() {
		return getValue(ISDIR);
	}
}