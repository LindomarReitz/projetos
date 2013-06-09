/**
 * This class is generated by jOOQ
 */
package test.generated.information_schema.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class RoutinePrivilegesRecord extends org.jooq.impl.TableRecordImpl<test.generated.information_schema.tables.records.RoutinePrivilegesRecord> {

	private static final long serialVersionUID = 1438223196;

	/**
	 * The table column <code>information_schema.routine_privileges.grantor</code>
	 */
	public void setGrantor(java.lang.String value) {
		setValue(test.generated.information_schema.tables.RoutinePrivileges.ROUTINE_PRIVILEGES.GRANTOR, value);
	}

	/**
	 * The table column <code>information_schema.routine_privileges.grantor</code>
	 */
	public java.lang.String getGrantor() {
		return getValue(test.generated.information_schema.tables.RoutinePrivileges.ROUTINE_PRIVILEGES.GRANTOR);
	}

	/**
	 * The table column <code>information_schema.routine_privileges.grantee</code>
	 */
	public void setGrantee(java.lang.String value) {
		setValue(test.generated.information_schema.tables.RoutinePrivileges.ROUTINE_PRIVILEGES.GRANTEE, value);
	}

	/**
	 * The table column <code>information_schema.routine_privileges.grantee</code>
	 */
	public java.lang.String getGrantee() {
		return getValue(test.generated.information_schema.tables.RoutinePrivileges.ROUTINE_PRIVILEGES.GRANTEE);
	}

	/**
	 * The table column <code>information_schema.routine_privileges.specific_catalog</code>
	 */
	public void setSpecificCatalog(java.lang.String value) {
		setValue(test.generated.information_schema.tables.RoutinePrivileges.ROUTINE_PRIVILEGES.SPECIFIC_CATALOG, value);
	}

	/**
	 * The table column <code>information_schema.routine_privileges.specific_catalog</code>
	 */
	public java.lang.String getSpecificCatalog() {
		return getValue(test.generated.information_schema.tables.RoutinePrivileges.ROUTINE_PRIVILEGES.SPECIFIC_CATALOG);
	}

	/**
	 * The table column <code>information_schema.routine_privileges.specific_schema</code>
	 */
	public void setSpecificSchema(java.lang.String value) {
		setValue(test.generated.information_schema.tables.RoutinePrivileges.ROUTINE_PRIVILEGES.SPECIFIC_SCHEMA, value);
	}

	/**
	 * The table column <code>information_schema.routine_privileges.specific_schema</code>
	 */
	public java.lang.String getSpecificSchema() {
		return getValue(test.generated.information_schema.tables.RoutinePrivileges.ROUTINE_PRIVILEGES.SPECIFIC_SCHEMA);
	}

	/**
	 * The table column <code>information_schema.routine_privileges.specific_name</code>
	 */
	public void setSpecificName(java.lang.String value) {
		setValue(test.generated.information_schema.tables.RoutinePrivileges.ROUTINE_PRIVILEGES.SPECIFIC_NAME, value);
	}

	/**
	 * The table column <code>information_schema.routine_privileges.specific_name</code>
	 */
	public java.lang.String getSpecificName() {
		return getValue(test.generated.information_schema.tables.RoutinePrivileges.ROUTINE_PRIVILEGES.SPECIFIC_NAME);
	}

	/**
	 * The table column <code>information_schema.routine_privileges.routine_catalog</code>
	 */
	public void setRoutineCatalog(java.lang.String value) {
		setValue(test.generated.information_schema.tables.RoutinePrivileges.ROUTINE_PRIVILEGES.ROUTINE_CATALOG, value);
	}

	/**
	 * The table column <code>information_schema.routine_privileges.routine_catalog</code>
	 */
	public java.lang.String getRoutineCatalog() {
		return getValue(test.generated.information_schema.tables.RoutinePrivileges.ROUTINE_PRIVILEGES.ROUTINE_CATALOG);
	}

	/**
	 * The table column <code>information_schema.routine_privileges.routine_schema</code>
	 */
	public void setRoutineSchema(java.lang.String value) {
		setValue(test.generated.information_schema.tables.RoutinePrivileges.ROUTINE_PRIVILEGES.ROUTINE_SCHEMA, value);
	}

	/**
	 * The table column <code>information_schema.routine_privileges.routine_schema</code>
	 */
	public java.lang.String getRoutineSchema() {
		return getValue(test.generated.information_schema.tables.RoutinePrivileges.ROUTINE_PRIVILEGES.ROUTINE_SCHEMA);
	}

	/**
	 * The table column <code>information_schema.routine_privileges.routine_name</code>
	 */
	public void setRoutineName(java.lang.String value) {
		setValue(test.generated.information_schema.tables.RoutinePrivileges.ROUTINE_PRIVILEGES.ROUTINE_NAME, value);
	}

	/**
	 * The table column <code>information_schema.routine_privileges.routine_name</code>
	 */
	public java.lang.String getRoutineName() {
		return getValue(test.generated.information_schema.tables.RoutinePrivileges.ROUTINE_PRIVILEGES.ROUTINE_NAME);
	}

	/**
	 * The table column <code>information_schema.routine_privileges.privilege_type</code>
	 */
	public void setPrivilegeType(java.lang.String value) {
		setValue(test.generated.information_schema.tables.RoutinePrivileges.ROUTINE_PRIVILEGES.PRIVILEGE_TYPE, value);
	}

	/**
	 * The table column <code>information_schema.routine_privileges.privilege_type</code>
	 */
	public java.lang.String getPrivilegeType() {
		return getValue(test.generated.information_schema.tables.RoutinePrivileges.ROUTINE_PRIVILEGES.PRIVILEGE_TYPE);
	}

	/**
	 * The table column <code>information_schema.routine_privileges.is_grantable</code>
	 */
	public void setIsGrantable(java.lang.String value) {
		setValue(test.generated.information_schema.tables.RoutinePrivileges.ROUTINE_PRIVILEGES.IS_GRANTABLE, value);
	}

	/**
	 * The table column <code>information_schema.routine_privileges.is_grantable</code>
	 */
	public java.lang.String getIsGrantable() {
		return getValue(test.generated.information_schema.tables.RoutinePrivileges.ROUTINE_PRIVILEGES.IS_GRANTABLE);
	}

	/**
	 * Create a detached RoutinePrivilegesRecord
	 */
	public RoutinePrivilegesRecord() {
		super(test.generated.information_schema.tables.RoutinePrivileges.ROUTINE_PRIVILEGES);
	}
}