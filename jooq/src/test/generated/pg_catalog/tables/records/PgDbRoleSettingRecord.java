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
public class PgDbRoleSettingRecord extends org.jooq.impl.TableRecordImpl<test.generated.pg_catalog.tables.records.PgDbRoleSettingRecord> {

	private static final long serialVersionUID = -2021022959;

	/**
	 * The table column <code>pg_catalog.pg_db_role_setting.setdatabase</code>
	 */
	public void setSetdatabase(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgDbRoleSetting.PG_DB_ROLE_SETTING.SETDATABASE, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_db_role_setting.setdatabase</code>
	 */
	public java.lang.Long getSetdatabase() {
		return getValue(test.generated.pg_catalog.tables.PgDbRoleSetting.PG_DB_ROLE_SETTING.SETDATABASE);
	}

	/**
	 * The table column <code>pg_catalog.pg_db_role_setting.setrole</code>
	 */
	public void setSetrole(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgDbRoleSetting.PG_DB_ROLE_SETTING.SETROLE, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_db_role_setting.setrole</code>
	 */
	public java.lang.Long getSetrole() {
		return getValue(test.generated.pg_catalog.tables.PgDbRoleSetting.PG_DB_ROLE_SETTING.SETROLE);
	}

	/**
	 * The table column <code>pg_catalog.pg_db_role_setting.setconfig</code>
	 */
	public void setSetconfig(java.lang.String[] value) {
		setValue(test.generated.pg_catalog.tables.PgDbRoleSetting.PG_DB_ROLE_SETTING.SETCONFIG, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_db_role_setting.setconfig</code>
	 */
	public java.lang.String[] getSetconfig() {
		return getValue(test.generated.pg_catalog.tables.PgDbRoleSetting.PG_DB_ROLE_SETTING.SETCONFIG);
	}

	/**
	 * Create a detached PgDbRoleSettingRecord
	 */
	public PgDbRoleSettingRecord() {
		super(test.generated.pg_catalog.tables.PgDbRoleSetting.PG_DB_ROLE_SETTING);
	}
}