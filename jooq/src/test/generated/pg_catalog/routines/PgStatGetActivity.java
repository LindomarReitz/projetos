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
public class PgStatGetActivity extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 1537639139;


	/**
	 * The procedure parameter <code>pg_catalog.pg_stat_get_activity.pid</code>
	 */
	public static final org.jooq.Parameter<java.lang.Integer> PID = createParameter("pid", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The procedure parameter <code>pg_catalog.pg_stat_get_activity.datid</code>
	 */
	public static final org.jooq.Parameter<java.lang.Long> DATID = createParameter("datid", org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * The procedure parameter <code>pg_catalog.pg_stat_get_activity.procpid</code>
	 */
	public static final org.jooq.Parameter<java.lang.Integer> PROCPID = createParameter("procpid", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The procedure parameter <code>pg_catalog.pg_stat_get_activity.usesysid</code>
	 */
	public static final org.jooq.Parameter<java.lang.Long> USESYSID = createParameter("usesysid", org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * The procedure parameter <code>pg_catalog.pg_stat_get_activity.application_name</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> APPLICATION_NAME = createParameter("application_name", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * The procedure parameter <code>pg_catalog.pg_stat_get_activity.current_query</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> CURRENT_QUERY = createParameter("current_query", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * The procedure parameter <code>pg_catalog.pg_stat_get_activity.waiting</code>
	 */
	public static final org.jooq.Parameter<java.lang.Boolean> WAITING = createParameter("waiting", org.jooq.impl.SQLDataType.BOOLEAN);

	/**
	 * The procedure parameter <code>pg_catalog.pg_stat_get_activity.xact_start</code>
	 */
	public static final org.jooq.Parameter<java.sql.Timestamp> XACT_START = createParameter("xact_start", org.jooq.impl.SQLDataType.TIMESTAMP);

	/**
	 * The procedure parameter <code>pg_catalog.pg_stat_get_activity.query_start</code>
	 */
	public static final org.jooq.Parameter<java.sql.Timestamp> QUERY_START = createParameter("query_start", org.jooq.impl.SQLDataType.TIMESTAMP);

	/**
	 * The procedure parameter <code>pg_catalog.pg_stat_get_activity.backend_start</code>
	 */
	public static final org.jooq.Parameter<java.sql.Timestamp> BACKEND_START = createParameter("backend_start", org.jooq.impl.SQLDataType.TIMESTAMP);

	/**
	 * The procedure parameter <code>pg_catalog.pg_stat_get_activity.client_addr</code>
	 * <p>
	 * The SQL type of this item (inet) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.Parameter<java.lang.Object> CLIENT_ADDR = createParameter("client_addr", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("inet"));

	/**
	 * The procedure parameter <code>pg_catalog.pg_stat_get_activity.client_port</code>
	 */
	public static final org.jooq.Parameter<java.lang.Integer> CLIENT_PORT = createParameter("client_port", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public PgStatGetActivity() {
		super("pg_stat_get_activity", test.generated.pg_catalog.PgCatalog.PG_CATALOG);

		addInParameter(PID);
		addOutParameter(DATID);
		addOutParameter(PROCPID);
		addOutParameter(USESYSID);
		addOutParameter(APPLICATION_NAME);
		addOutParameter(CURRENT_QUERY);
		addOutParameter(WAITING);
		addOutParameter(XACT_START);
		addOutParameter(QUERY_START);
		addOutParameter(BACKEND_START);
		addOutParameter(CLIENT_ADDR);
		addOutParameter(CLIENT_PORT);
	}

	/**
	 * Set the <code>pid</code> parameter IN value to the routine
	 */
	public void setPid(java.lang.Integer value) {
		setValue(test.generated.pg_catalog.routines.PgStatGetActivity.PID, value);
	}

	/**
	 * Get the <code>datid</code> parameter OUT value from the routine
	 */
	public java.lang.Long getDatid() {
		return getValue(DATID);
	}

	/**
	 * Get the <code>procpid</code> parameter OUT value from the routine
	 */
	public java.lang.Integer getProcpid() {
		return getValue(PROCPID);
	}

	/**
	 * Get the <code>usesysid</code> parameter OUT value from the routine
	 */
	public java.lang.Long getUsesysid() {
		return getValue(USESYSID);
	}

	/**
	 * Get the <code>application_name</code> parameter OUT value from the routine
	 */
	public java.lang.String getApplicationName() {
		return getValue(APPLICATION_NAME);
	}

	/**
	 * Get the <code>current_query</code> parameter OUT value from the routine
	 */
	public java.lang.String getCurrentQuery() {
		return getValue(CURRENT_QUERY);
	}

	/**
	 * Get the <code>waiting</code> parameter OUT value from the routine
	 */
	public java.lang.Boolean getWaiting() {
		return getValue(WAITING);
	}

	/**
	 * Get the <code>xact_start</code> parameter OUT value from the routine
	 */
	public java.sql.Timestamp getXactStart() {
		return getValue(XACT_START);
	}

	/**
	 * Get the <code>query_start</code> parameter OUT value from the routine
	 */
	public java.sql.Timestamp getQueryStart() {
		return getValue(QUERY_START);
	}

	/**
	 * Get the <code>backend_start</code> parameter OUT value from the routine
	 */
	public java.sql.Timestamp getBackendStart() {
		return getValue(BACKEND_START);
	}

	/**
	 * Get the <code>client_addr</code> parameter OUT value from the routine
	 */
	public java.lang.Object getClientAddr() {
		return getValue(CLIENT_ADDR);
	}

	/**
	 * Get the <code>client_port</code> parameter OUT value from the routine
	 */
	public java.lang.Integer getClientPort() {
		return getValue(CLIENT_PORT);
	}
}
