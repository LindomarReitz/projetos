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
public class AdministrableRoleAuthorizationsRecord extends org.jooq.impl.TableRecordImpl<test.generated.information_schema.tables.records.AdministrableRoleAuthorizationsRecord> {

	private static final long serialVersionUID = -1301232011;

	/**
	 * The table column <code>information_schema.administrable_role_authorizations.grantee</code>
	 */
	public void setGrantee(java.lang.String value) {
		setValue(test.generated.information_schema.tables.AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS.GRANTEE, value);
	}

	/**
	 * The table column <code>information_schema.administrable_role_authorizations.grantee</code>
	 */
	public java.lang.String getGrantee() {
		return getValue(test.generated.information_schema.tables.AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS.GRANTEE);
	}

	/**
	 * The table column <code>information_schema.administrable_role_authorizations.role_name</code>
	 */
	public void setRoleName(java.lang.String value) {
		setValue(test.generated.information_schema.tables.AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS.ROLE_NAME, value);
	}

	/**
	 * The table column <code>information_schema.administrable_role_authorizations.role_name</code>
	 */
	public java.lang.String getRoleName() {
		return getValue(test.generated.information_schema.tables.AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS.ROLE_NAME);
	}

	/**
	 * The table column <code>information_schema.administrable_role_authorizations.is_grantable</code>
	 */
	public void setIsGrantable(java.lang.String value) {
		setValue(test.generated.information_schema.tables.AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS.IS_GRANTABLE, value);
	}

	/**
	 * The table column <code>information_schema.administrable_role_authorizations.is_grantable</code>
	 */
	public java.lang.String getIsGrantable() {
		return getValue(test.generated.information_schema.tables.AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS.IS_GRANTABLE);
	}

	/**
	 * Create a detached AdministrableRoleAuthorizationsRecord
	 */
	public AdministrableRoleAuthorizationsRecord() {
		super(test.generated.information_schema.tables.AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS);
	}
}