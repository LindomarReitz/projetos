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
public class RoleRoutineGrantsRecord extends org.jooq.impl.TableRecordImpl<test.generated.information_schema.tables.records.RoleRoutineGrantsRecord> {

	private static final long serialVersionUID = 226254015;

	/**
	 * The table column <code>information_schema.role_routine_grants.grantor</code>
	 */
	public void setGrantor(java.lang.String value) {
		setValue(test.generated.information_schema.tables.RoleRoutineGrants.ROLE_ROUTINE_GRANTS.GRANTOR, value);
	}

	/**
	 * The table column <code>information_schema.role_routine_grants.grantor</code>
	 */
	public java.lang.String getGrantor() {
		return getValue(test.generated.information_schema.tables.RoleRoutineGrants.ROLE_ROUTINE_GRANTS.GRANTOR);
	}

	/**
	 * The table column <code>information_schema.role_routine_grants.grantee</code>
	 */
	public void setGrantee(java.lang.String value) {
		setValue(test.generated.information_schema.tables.RoleRoutineGrants.ROLE_ROUTINE_GRANTS.GRANTEE, value);
	}

	/**
	 * The table column <code>information_schema.role_routine_grants.grantee</code>
	 */
	public java.lang.String getGrantee() {
		return getValue(test.generated.information_schema.tables.RoleRoutineGrants.ROLE_ROUTINE_GRANTS.GRANTEE);
	}

	/**
	 * The table column <code>information_schema.role_routine_grants.specific_catalog</code>
	 */
	public void setSpecificCatalog(java.lang.String value) {
		setValue(test.generated.information_schema.tables.RoleRoutineGrants.ROLE_ROUTINE_GRANTS.SPECIFIC_CATALOG, value);
	}

	/**
	 * The table column <code>information_schema.role_routine_grants.specific_catalog</code>
	 */
	public java.lang.String getSpecificCatalog() {
		return getValue(test.generated.information_schema.tables.RoleRoutineGrants.ROLE_ROUTINE_GRANTS.SPECIFIC_CATALOG);
	}

	/**
	 * The table column <code>information_schema.role_routine_grants.specific_schema</code>
	 */
	public void setSpecificSchema(java.lang.String value) {
		setValue(test.generated.information_schema.tables.RoleRoutineGrants.ROLE_ROUTINE_GRANTS.SPECIFIC_SCHEMA, value);
	}

	/**
	 * The table column <code>information_schema.role_routine_grants.specific_schema</code>
	 */
	public java.lang.String getSpecificSchema() {
		return getValue(test.generated.information_schema.tables.RoleRoutineGrants.ROLE_ROUTINE_GRANTS.SPECIFIC_SCHEMA);
	}

	/**
	 * The table column <code>information_schema.role_routine_grants.specific_name</code>
	 */
	public void setSpecificName(java.lang.String value) {
		setValue(test.generated.information_schema.tables.RoleRoutineGrants.ROLE_ROUTINE_GRANTS.SPECIFIC_NAME, value);
	}

	/**
	 * The table column <code>information_schema.role_routine_grants.specific_name</code>
	 */
	public java.lang.String getSpecificName() {
		return getValue(test.generated.information_schema.tables.RoleRoutineGrants.ROLE_ROUTINE_GRANTS.SPECIFIC_NAME);
	}

	/**
	 * The table column <code>information_schema.role_routine_grants.routine_catalog</code>
	 */
	public void setRoutineCatalog(java.lang.String value) {
		setValue(test.generated.information_schema.tables.RoleRoutineGrants.ROLE_ROUTINE_GRANTS.ROUTINE_CATALOG, value);
	}

	/**
	 * The table column <code>information_schema.role_routine_grants.routine_catalog</code>
	 */
	public java.lang.String getRoutineCatalog() {
		return getValue(test.generated.information_schema.tables.RoleRoutineGrants.ROLE_ROUTINE_GRANTS.ROUTINE_CATALOG);
	}

	/**
	 * The table column <code>information_schema.role_routine_grants.routine_schema</code>
	 */
	public void setRoutineSchema(java.lang.String value) {
		setValue(test.generated.information_schema.tables.RoleRoutineGrants.ROLE_ROUTINE_GRANTS.ROUTINE_SCHEMA, value);
	}

	/**
	 * The table column <code>information_schema.role_routine_grants.routine_schema</code>
	 */
	public java.lang.String getRoutineSchema() {
		return getValue(test.generated.information_schema.tables.RoleRoutineGrants.ROLE_ROUTINE_GRANTS.ROUTINE_SCHEMA);
	}

	/**
	 * The table column <code>information_schema.role_routine_grants.routine_name</code>
	 */
	public void setRoutineName(java.lang.String value) {
		setValue(test.generated.information_schema.tables.RoleRoutineGrants.ROLE_ROUTINE_GRANTS.ROUTINE_NAME, value);
	}

	/**
	 * The table column <code>information_schema.role_routine_grants.routine_name</code>
	 */
	public java.lang.String getRoutineName() {
		return getValue(test.generated.information_schema.tables.RoleRoutineGrants.ROLE_ROUTINE_GRANTS.ROUTINE_NAME);
	}

	/**
	 * The table column <code>information_schema.role_routine_grants.privilege_type</code>
	 */
	public void setPrivilegeType(java.lang.String value) {
		setValue(test.generated.information_schema.tables.RoleRoutineGrants.ROLE_ROUTINE_GRANTS.PRIVILEGE_TYPE, value);
	}

	/**
	 * The table column <code>information_schema.role_routine_grants.privilege_type</code>
	 */
	public java.lang.String getPrivilegeType() {
		return getValue(test.generated.information_schema.tables.RoleRoutineGrants.ROLE_ROUTINE_GRANTS.PRIVILEGE_TYPE);
	}

	/**
	 * The table column <code>information_schema.role_routine_grants.is_grantable</code>
	 */
	public void setIsGrantable(java.lang.String value) {
		setValue(test.generated.information_schema.tables.RoleRoutineGrants.ROLE_ROUTINE_GRANTS.IS_GRANTABLE, value);
	}

	/**
	 * The table column <code>information_schema.role_routine_grants.is_grantable</code>
	 */
	public java.lang.String getIsGrantable() {
		return getValue(test.generated.information_schema.tables.RoleRoutineGrants.ROLE_ROUTINE_GRANTS.IS_GRANTABLE);
	}

	/**
	 * Create a detached RoleRoutineGrantsRecord
	 */
	public RoleRoutineGrantsRecord() {
		super(test.generated.information_schema.tables.RoleRoutineGrants.ROLE_ROUTINE_GRANTS);
	}
}
