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
public class PgLargeobjectMetadataRecord extends org.jooq.impl.TableRecordImpl<test.generated.pg_catalog.tables.records.PgLargeobjectMetadataRecord> {

	private static final long serialVersionUID = -2099205384;

	/**
	 * The table column <code>pg_catalog.pg_largeobject_metadata.lomowner</code>
	 */
	public void setLomowner(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgLargeobjectMetadata.PG_LARGEOBJECT_METADATA.LOMOWNER, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_largeobject_metadata.lomowner</code>
	 */
	public java.lang.Long getLomowner() {
		return getValue(test.generated.pg_catalog.tables.PgLargeobjectMetadata.PG_LARGEOBJECT_METADATA.LOMOWNER);
	}

	/**
	 * The table column <code>pg_catalog.pg_largeobject_metadata.lomacl</code>
	 */
	public void setLomacl(java.lang.String[] value) {
		setValue(test.generated.pg_catalog.tables.PgLargeobjectMetadata.PG_LARGEOBJECT_METADATA.LOMACL, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_largeobject_metadata.lomacl</code>
	 */
	public java.lang.String[] getLomacl() {
		return getValue(test.generated.pg_catalog.tables.PgLargeobjectMetadata.PG_LARGEOBJECT_METADATA.LOMACL);
	}

	/**
	 * Create a detached PgLargeobjectMetadataRecord
	 */
	public PgLargeobjectMetadataRecord() {
		super(test.generated.pg_catalog.tables.PgLargeobjectMetadata.PG_LARGEOBJECT_METADATA);
	}
}
