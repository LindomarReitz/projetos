/**
 * This class is generated by jOOQ
 */
package test.generated.pg_catalog.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class PgStatUserFunctionsRecord extends org.jooq.impl.TableRecordImpl<test.generated.pg_catalog.tables.records.PgStatUserFunctionsRecord> {

	private static final long serialVersionUID = -853284061;

	/**
	 * The table column <code>pg_catalog.pg_stat_user_functions.funcid</code>
	 */
	public void setFuncid(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatUserFunctions.PG_STAT_USER_FUNCTIONS.FUNCID, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_user_functions.funcid</code>
	 */
	public java.lang.Long getFuncid() {
		return getValue(test.generated.pg_catalog.tables.PgStatUserFunctions.PG_STAT_USER_FUNCTIONS.FUNCID);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_user_functions.schemaname</code>
	 */
	public void setSchemaname(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgStatUserFunctions.PG_STAT_USER_FUNCTIONS.SCHEMANAME, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_user_functions.schemaname</code>
	 */
	public java.lang.String getSchemaname() {
		return getValue(test.generated.pg_catalog.tables.PgStatUserFunctions.PG_STAT_USER_FUNCTIONS.SCHEMANAME);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_user_functions.funcname</code>
	 */
	public void setFuncname(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgStatUserFunctions.PG_STAT_USER_FUNCTIONS.FUNCNAME, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_user_functions.funcname</code>
	 */
	public java.lang.String getFuncname() {
		return getValue(test.generated.pg_catalog.tables.PgStatUserFunctions.PG_STAT_USER_FUNCTIONS.FUNCNAME);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_user_functions.calls</code>
	 */
	public void setCalls(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatUserFunctions.PG_STAT_USER_FUNCTIONS.CALLS, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_user_functions.calls</code>
	 */
	public java.lang.Long getCalls() {
		return getValue(test.generated.pg_catalog.tables.PgStatUserFunctions.PG_STAT_USER_FUNCTIONS.CALLS);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_user_functions.total_time</code>
	 */
	public void setTotalTime(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatUserFunctions.PG_STAT_USER_FUNCTIONS.TOTAL_TIME, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_user_functions.total_time</code>
	 */
	public java.lang.Long getTotalTime() {
		return getValue(test.generated.pg_catalog.tables.PgStatUserFunctions.PG_STAT_USER_FUNCTIONS.TOTAL_TIME);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_user_functions.self_time</code>
	 */
	public void setSelfTime(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgStatUserFunctions.PG_STAT_USER_FUNCTIONS.SELF_TIME, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_stat_user_functions.self_time</code>
	 */
	public java.lang.Long getSelfTime() {
		return getValue(test.generated.pg_catalog.tables.PgStatUserFunctions.PG_STAT_USER_FUNCTIONS.SELF_TIME);
	}

	/**
	 * Create a detached PgStatUserFunctionsRecord
	 */
	public PgStatUserFunctionsRecord() {
		super(test.generated.pg_catalog.tables.PgStatUserFunctions.PG_STAT_USER_FUNCTIONS);
	}
}