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
public class PgGroupRecord extends org.jooq.impl.TableRecordImpl<test.generated.pg_catalog.tables.records.PgGroupRecord> {

	private static final long serialVersionUID = -1993719207;

	/**
	 * The table column <code>pg_catalog.pg_group.groname</code>
	 */
	public void setGroname(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgGroup.PG_GROUP.GRONAME, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_group.groname</code>
	 */
	public java.lang.String getGroname() {
		return getValue(test.generated.pg_catalog.tables.PgGroup.PG_GROUP.GRONAME);
	}

	/**
	 * The table column <code>pg_catalog.pg_group.grosysid</code>
	 */
	public void setGrosysid(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgGroup.PG_GROUP.GROSYSID, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_group.grosysid</code>
	 */
	public java.lang.Long getGrosysid() {
		return getValue(test.generated.pg_catalog.tables.PgGroup.PG_GROUP.GROSYSID);
	}

	/**
	 * The table column <code>pg_catalog.pg_group.grolist</code>
	 */
	public void setGrolist(java.lang.Long[] value) {
		setValue(test.generated.pg_catalog.tables.PgGroup.PG_GROUP.GROLIST, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_group.grolist</code>
	 */
	public java.lang.Long[] getGrolist() {
		return getValue(test.generated.pg_catalog.tables.PgGroup.PG_GROUP.GROLIST);
	}

	/**
	 * Create a detached PgGroupRecord
	 */
	public PgGroupRecord() {
		super(test.generated.pg_catalog.tables.PgGroup.PG_GROUP);
	}
}
