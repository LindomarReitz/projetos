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
public class PgTimezoneAbbrevsRecord extends org.jooq.impl.TableRecordImpl<test.generated.pg_catalog.tables.records.PgTimezoneAbbrevsRecord> {

	private static final long serialVersionUID = -1784489576;

	/**
	 * The table column <code>pg_catalog.pg_timezone_abbrevs.abbrev</code>
	 */
	public void setAbbrev(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgTimezoneAbbrevs.PG_TIMEZONE_ABBREVS.ABBREV, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_timezone_abbrevs.abbrev</code>
	 */
	public java.lang.String getAbbrev() {
		return getValue(test.generated.pg_catalog.tables.PgTimezoneAbbrevs.PG_TIMEZONE_ABBREVS.ABBREV);
	}

	/**
	 * The table column <code>pg_catalog.pg_timezone_abbrevs.utc_offset</code>
	 * <p>
	 * The SQL type of this item (interval) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public void setUtcOffset(java.lang.Object value) {
		setValue(test.generated.pg_catalog.tables.PgTimezoneAbbrevs.PG_TIMEZONE_ABBREVS.UTC_OFFSET, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_timezone_abbrevs.utc_offset</code>
	 * <p>
	 * The SQL type of this item (interval) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public java.lang.Object getUtcOffset() {
		return getValue(test.generated.pg_catalog.tables.PgTimezoneAbbrevs.PG_TIMEZONE_ABBREVS.UTC_OFFSET);
	}

	/**
	 * The table column <code>pg_catalog.pg_timezone_abbrevs.is_dst</code>
	 */
	public void setIsDst(java.lang.Boolean value) {
		setValue(test.generated.pg_catalog.tables.PgTimezoneAbbrevs.PG_TIMEZONE_ABBREVS.IS_DST, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_timezone_abbrevs.is_dst</code>
	 */
	public java.lang.Boolean getIsDst() {
		return getValue(test.generated.pg_catalog.tables.PgTimezoneAbbrevs.PG_TIMEZONE_ABBREVS.IS_DST);
	}

	/**
	 * Create a detached PgTimezoneAbbrevsRecord
	 */
	public PgTimezoneAbbrevsRecord() {
		super(test.generated.pg_catalog.tables.PgTimezoneAbbrevs.PG_TIMEZONE_ABBREVS);
	}
}