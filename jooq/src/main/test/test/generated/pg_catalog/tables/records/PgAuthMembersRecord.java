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
public class PgAuthMembersRecord extends org.jooq.impl.TableRecordImpl<test.generated.pg_catalog.tables.records.PgAuthMembersRecord> {

	private static final long serialVersionUID = 1422207216;

	/**
	 * The table column <code>pg_catalog.pg_auth_members.roleid</code>
	 */
	public void setRoleid(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgAuthMembers.PG_AUTH_MEMBERS.ROLEID, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_auth_members.roleid</code>
	 */
	public java.lang.Long getRoleid() {
		return getValue(test.generated.pg_catalog.tables.PgAuthMembers.PG_AUTH_MEMBERS.ROLEID);
	}

	/**
	 * The table column <code>pg_catalog.pg_auth_members.member</code>
	 */
	public void setMember(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgAuthMembers.PG_AUTH_MEMBERS.MEMBER, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_auth_members.member</code>
	 */
	public java.lang.Long getMember() {
		return getValue(test.generated.pg_catalog.tables.PgAuthMembers.PG_AUTH_MEMBERS.MEMBER);
	}

	/**
	 * The table column <code>pg_catalog.pg_auth_members.grantor</code>
	 */
	public void setGrantor(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgAuthMembers.PG_AUTH_MEMBERS.GRANTOR, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_auth_members.grantor</code>
	 */
	public java.lang.Long getGrantor() {
		return getValue(test.generated.pg_catalog.tables.PgAuthMembers.PG_AUTH_MEMBERS.GRANTOR);
	}

	/**
	 * The table column <code>pg_catalog.pg_auth_members.admin_option</code>
	 */
	public void setAdminOption(java.lang.Boolean value) {
		setValue(test.generated.pg_catalog.tables.PgAuthMembers.PG_AUTH_MEMBERS.ADMIN_OPTION, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_auth_members.admin_option</code>
	 */
	public java.lang.Boolean getAdminOption() {
		return getValue(test.generated.pg_catalog.tables.PgAuthMembers.PG_AUTH_MEMBERS.ADMIN_OPTION);
	}

	/**
	 * Create a detached PgAuthMembersRecord
	 */
	public PgAuthMembersRecord() {
		super(test.generated.pg_catalog.tables.PgAuthMembers.PG_AUTH_MEMBERS);
	}
}
