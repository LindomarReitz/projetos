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
public class RoleTableGrantsRecord extends org.jooq.impl.TableRecordImpl<test.generated.information_schema.tables.records.RoleTableGrantsRecord> {

	private static final long serialVersionUID = 979730527;

	/**
	 * The table column <code>information_schema.role_table_grants.grantor</code>
	 */
	public void setGrantor(java.lang.String value) {
		setValue(test.generated.information_schema.tables.RoleTableGrants.ROLE_TABLE_GRANTS.GRANTOR, value);
	}

	/**
	 * The table column <code>information_schema.role_table_grants.grantor</code>
	 */
	public java.lang.String getGrantor() {
		return getValue(test.generated.information_schema.tables.RoleTableGrants.ROLE_TABLE_GRANTS.GRANTOR);
	}

	/**
	 * The table column <code>information_schema.role_table_grants.grantee</code>
	 */
	public void setGrantee(java.lang.String value) {
		setValue(test.generated.information_schema.tables.RoleTableGrants.ROLE_TABLE_GRANTS.GRANTEE, value);
	}

	/**
	 * The table column <code>information_schema.role_table_grants.grantee</code>
	 */
	public java.lang.String getGrantee() {
		return getValue(test.generated.information_schema.tables.RoleTableGrants.ROLE_TABLE_GRANTS.GRANTEE);
	}

	/**
	 * The table column <code>information_schema.role_table_grants.table_catalog</code>
	 */
	public void setTableCatalog(java.lang.String value) {
		setValue(test.generated.information_schema.tables.RoleTableGrants.ROLE_TABLE_GRANTS.TABLE_CATALOG, value);
	}

	/**
	 * The table column <code>information_schema.role_table_grants.table_catalog</code>
	 */
	public java.lang.String getTableCatalog() {
		return getValue(test.generated.information_schema.tables.RoleTableGrants.ROLE_TABLE_GRANTS.TABLE_CATALOG);
	}

	/**
	 * The table column <code>information_schema.role_table_grants.table_schema</code>
	 */
	public void setTableSchema(java.lang.String value) {
		setValue(test.generated.information_schema.tables.RoleTableGrants.ROLE_TABLE_GRANTS.TABLE_SCHEMA, value);
	}

	/**
	 * The table column <code>information_schema.role_table_grants.table_schema</code>
	 */
	public java.lang.String getTableSchema() {
		return getValue(test.generated.information_schema.tables.RoleTableGrants.ROLE_TABLE_GRANTS.TABLE_SCHEMA);
	}

	/**
	 * The table column <code>information_schema.role_table_grants.table_name</code>
	 */
	public void setTableName(java.lang.String value) {
		setValue(test.generated.information_schema.tables.RoleTableGrants.ROLE_TABLE_GRANTS.TABLE_NAME, value);
	}

	/**
	 * The table column <code>information_schema.role_table_grants.table_name</code>
	 */
	public java.lang.String getTableName() {
		return getValue(test.generated.information_schema.tables.RoleTableGrants.ROLE_TABLE_GRANTS.TABLE_NAME);
	}

	/**
	 * The table column <code>information_schema.role_table_grants.privilege_type</code>
	 */
	public void setPrivilegeType(java.lang.String value) {
		setValue(test.generated.information_schema.tables.RoleTableGrants.ROLE_TABLE_GRANTS.PRIVILEGE_TYPE, value);
	}

	/**
	 * The table column <code>information_schema.role_table_grants.privilege_type</code>
	 */
	public java.lang.String getPrivilegeType() {
		return getValue(test.generated.information_schema.tables.RoleTableGrants.ROLE_TABLE_GRANTS.PRIVILEGE_TYPE);
	}

	/**
	 * The table column <code>information_schema.role_table_grants.is_grantable</code>
	 */
	public void setIsGrantable(java.lang.String value) {
		setValue(test.generated.information_schema.tables.RoleTableGrants.ROLE_TABLE_GRANTS.IS_GRANTABLE, value);
	}

	/**
	 * The table column <code>information_schema.role_table_grants.is_grantable</code>
	 */
	public java.lang.String getIsGrantable() {
		return getValue(test.generated.information_schema.tables.RoleTableGrants.ROLE_TABLE_GRANTS.IS_GRANTABLE);
	}

	/**
	 * The table column <code>information_schema.role_table_grants.with_hierarchy</code>
	 */
	public void setWithHierarchy(java.lang.String value) {
		setValue(test.generated.information_schema.tables.RoleTableGrants.ROLE_TABLE_GRANTS.WITH_HIERARCHY, value);
	}

	/**
	 * The table column <code>information_schema.role_table_grants.with_hierarchy</code>
	 */
	public java.lang.String getWithHierarchy() {
		return getValue(test.generated.information_schema.tables.RoleTableGrants.ROLE_TABLE_GRANTS.WITH_HIERARCHY);
	}

	/**
	 * Create a detached RoleTableGrantsRecord
	 */
	public RoleTableGrantsRecord() {
		super(test.generated.information_schema.tables.RoleTableGrants.ROLE_TABLE_GRANTS);
	}
}
