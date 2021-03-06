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
public class PgRolesRecord extends org.jooq.impl.TableRecordImpl<test.generated.pg_catalog.tables.records.PgRolesRecord> {

	private static final long serialVersionUID = -240500907;

	/**
	 * The table column <code>pg_catalog.pg_roles.rolname</code>
	 */
	public void setRolname(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgRoles.PG_ROLES.ROLNAME, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_roles.rolname</code>
	 */
	public java.lang.String getRolname() {
		return getValue(test.generated.pg_catalog.tables.PgRoles.PG_ROLES.ROLNAME);
	}

	/**
	 * The table column <code>pg_catalog.pg_roles.rolsuper</code>
	 */
	public void setRolsuper(java.lang.Boolean value) {
		setValue(test.generated.pg_catalog.tables.PgRoles.PG_ROLES.ROLSUPER, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_roles.rolsuper</code>
	 */
	public java.lang.Boolean getRolsuper() {
		return getValue(test.generated.pg_catalog.tables.PgRoles.PG_ROLES.ROLSUPER);
	}

	/**
	 * The table column <code>pg_catalog.pg_roles.rolinherit</code>
	 */
	public void setRolinherit(java.lang.Boolean value) {
		setValue(test.generated.pg_catalog.tables.PgRoles.PG_ROLES.ROLINHERIT, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_roles.rolinherit</code>
	 */
	public java.lang.Boolean getRolinherit() {
		return getValue(test.generated.pg_catalog.tables.PgRoles.PG_ROLES.ROLINHERIT);
	}

	/**
	 * The table column <code>pg_catalog.pg_roles.rolcreaterole</code>
	 */
	public void setRolcreaterole(java.lang.Boolean value) {
		setValue(test.generated.pg_catalog.tables.PgRoles.PG_ROLES.ROLCREATEROLE, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_roles.rolcreaterole</code>
	 */
	public java.lang.Boolean getRolcreaterole() {
		return getValue(test.generated.pg_catalog.tables.PgRoles.PG_ROLES.ROLCREATEROLE);
	}

	/**
	 * The table column <code>pg_catalog.pg_roles.rolcreatedb</code>
	 */
	public void setRolcreatedb(java.lang.Boolean value) {
		setValue(test.generated.pg_catalog.tables.PgRoles.PG_ROLES.ROLCREATEDB, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_roles.rolcreatedb</code>
	 */
	public java.lang.Boolean getRolcreatedb() {
		return getValue(test.generated.pg_catalog.tables.PgRoles.PG_ROLES.ROLCREATEDB);
	}

	/**
	 * The table column <code>pg_catalog.pg_roles.rolcatupdate</code>
	 */
	public void setRolcatupdate(java.lang.Boolean value) {
		setValue(test.generated.pg_catalog.tables.PgRoles.PG_ROLES.ROLCATUPDATE, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_roles.rolcatupdate</code>
	 */
	public java.lang.Boolean getRolcatupdate() {
		return getValue(test.generated.pg_catalog.tables.PgRoles.PG_ROLES.ROLCATUPDATE);
	}

	/**
	 * The table column <code>pg_catalog.pg_roles.rolcanlogin</code>
	 */
	public void setRolcanlogin(java.lang.Boolean value) {
		setValue(test.generated.pg_catalog.tables.PgRoles.PG_ROLES.ROLCANLOGIN, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_roles.rolcanlogin</code>
	 */
	public java.lang.Boolean getRolcanlogin() {
		return getValue(test.generated.pg_catalog.tables.PgRoles.PG_ROLES.ROLCANLOGIN);
	}

	/**
	 * The table column <code>pg_catalog.pg_roles.rolconnlimit</code>
	 */
	public void setRolconnlimit(java.lang.Integer value) {
		setValue(test.generated.pg_catalog.tables.PgRoles.PG_ROLES.ROLCONNLIMIT, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_roles.rolconnlimit</code>
	 */
	public java.lang.Integer getRolconnlimit() {
		return getValue(test.generated.pg_catalog.tables.PgRoles.PG_ROLES.ROLCONNLIMIT);
	}

	/**
	 * The table column <code>pg_catalog.pg_roles.rolpassword</code>
	 */
	public void setRolpassword(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgRoles.PG_ROLES.ROLPASSWORD, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_roles.rolpassword</code>
	 */
	public java.lang.String getRolpassword() {
		return getValue(test.generated.pg_catalog.tables.PgRoles.PG_ROLES.ROLPASSWORD);
	}

	/**
	 * The table column <code>pg_catalog.pg_roles.rolvaliduntil</code>
	 */
	public void setRolvaliduntil(java.sql.Timestamp value) {
		setValue(test.generated.pg_catalog.tables.PgRoles.PG_ROLES.ROLVALIDUNTIL, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_roles.rolvaliduntil</code>
	 */
	public java.sql.Timestamp getRolvaliduntil() {
		return getValue(test.generated.pg_catalog.tables.PgRoles.PG_ROLES.ROLVALIDUNTIL);
	}

	/**
	 * The table column <code>pg_catalog.pg_roles.rolconfig</code>
	 */
	public void setRolconfig(java.lang.String[] value) {
		setValue(test.generated.pg_catalog.tables.PgRoles.PG_ROLES.ROLCONFIG, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_roles.rolconfig</code>
	 */
	public java.lang.String[] getRolconfig() {
		return getValue(test.generated.pg_catalog.tables.PgRoles.PG_ROLES.ROLCONFIG);
	}

	/**
	 * The table column <code>pg_catalog.pg_roles.oid</code>
	 */
	public void setOid(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgRoles.PG_ROLES.OID, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_roles.oid</code>
	 */
	public java.lang.Long getOid() {
		return getValue(test.generated.pg_catalog.tables.PgRoles.PG_ROLES.OID);
	}

	/**
	 * Create a detached PgRolesRecord
	 */
	public PgRolesRecord() {
		super(test.generated.pg_catalog.tables.PgRoles.PG_ROLES);
	}
}
