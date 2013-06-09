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
public class PgIndexRecord extends org.jooq.impl.TableRecordImpl<test.generated.pg_catalog.tables.records.PgIndexRecord> {

	private static final long serialVersionUID = 570760233;

	/**
	 * The table column <code>pg_catalog.pg_index.indexrelid</code>
	 */
	public void setIndexrelid(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgIndex.PG_INDEX.INDEXRELID, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_index.indexrelid</code>
	 */
	public java.lang.Long getIndexrelid() {
		return getValue(test.generated.pg_catalog.tables.PgIndex.PG_INDEX.INDEXRELID);
	}

	/**
	 * The table column <code>pg_catalog.pg_index.indrelid</code>
	 */
	public void setIndrelid(java.lang.Long value) {
		setValue(test.generated.pg_catalog.tables.PgIndex.PG_INDEX.INDRELID, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_index.indrelid</code>
	 */
	public java.lang.Long getIndrelid() {
		return getValue(test.generated.pg_catalog.tables.PgIndex.PG_INDEX.INDRELID);
	}

	/**
	 * The table column <code>pg_catalog.pg_index.indnatts</code>
	 */
	public void setIndnatts(java.lang.Short value) {
		setValue(test.generated.pg_catalog.tables.PgIndex.PG_INDEX.INDNATTS, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_index.indnatts</code>
	 */
	public java.lang.Short getIndnatts() {
		return getValue(test.generated.pg_catalog.tables.PgIndex.PG_INDEX.INDNATTS);
	}

	/**
	 * The table column <code>pg_catalog.pg_index.indisunique</code>
	 */
	public void setIndisunique(java.lang.Boolean value) {
		setValue(test.generated.pg_catalog.tables.PgIndex.PG_INDEX.INDISUNIQUE, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_index.indisunique</code>
	 */
	public java.lang.Boolean getIndisunique() {
		return getValue(test.generated.pg_catalog.tables.PgIndex.PG_INDEX.INDISUNIQUE);
	}

	/**
	 * The table column <code>pg_catalog.pg_index.indisprimary</code>
	 */
	public void setIndisprimary(java.lang.Boolean value) {
		setValue(test.generated.pg_catalog.tables.PgIndex.PG_INDEX.INDISPRIMARY, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_index.indisprimary</code>
	 */
	public java.lang.Boolean getIndisprimary() {
		return getValue(test.generated.pg_catalog.tables.PgIndex.PG_INDEX.INDISPRIMARY);
	}

	/**
	 * The table column <code>pg_catalog.pg_index.indimmediate</code>
	 */
	public void setIndimmediate(java.lang.Boolean value) {
		setValue(test.generated.pg_catalog.tables.PgIndex.PG_INDEX.INDIMMEDIATE, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_index.indimmediate</code>
	 */
	public java.lang.Boolean getIndimmediate() {
		return getValue(test.generated.pg_catalog.tables.PgIndex.PG_INDEX.INDIMMEDIATE);
	}

	/**
	 * The table column <code>pg_catalog.pg_index.indisclustered</code>
	 */
	public void setIndisclustered(java.lang.Boolean value) {
		setValue(test.generated.pg_catalog.tables.PgIndex.PG_INDEX.INDISCLUSTERED, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_index.indisclustered</code>
	 */
	public java.lang.Boolean getIndisclustered() {
		return getValue(test.generated.pg_catalog.tables.PgIndex.PG_INDEX.INDISCLUSTERED);
	}

	/**
	 * The table column <code>pg_catalog.pg_index.indisvalid</code>
	 */
	public void setIndisvalid(java.lang.Boolean value) {
		setValue(test.generated.pg_catalog.tables.PgIndex.PG_INDEX.INDISVALID, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_index.indisvalid</code>
	 */
	public java.lang.Boolean getIndisvalid() {
		return getValue(test.generated.pg_catalog.tables.PgIndex.PG_INDEX.INDISVALID);
	}

	/**
	 * The table column <code>pg_catalog.pg_index.indcheckxmin</code>
	 */
	public void setIndcheckxmin(java.lang.Boolean value) {
		setValue(test.generated.pg_catalog.tables.PgIndex.PG_INDEX.INDCHECKXMIN, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_index.indcheckxmin</code>
	 */
	public java.lang.Boolean getIndcheckxmin() {
		return getValue(test.generated.pg_catalog.tables.PgIndex.PG_INDEX.INDCHECKXMIN);
	}

	/**
	 * The table column <code>pg_catalog.pg_index.indisready</code>
	 */
	public void setIndisready(java.lang.Boolean value) {
		setValue(test.generated.pg_catalog.tables.PgIndex.PG_INDEX.INDISREADY, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_index.indisready</code>
	 */
	public java.lang.Boolean getIndisready() {
		return getValue(test.generated.pg_catalog.tables.PgIndex.PG_INDEX.INDISREADY);
	}

	/**
	 * The table column <code>pg_catalog.pg_index.indkey</code>
	 * <p>
	 * The SQL type of this item (ARRAY, int2vector) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public void setIndkey(java.lang.Object[] value) {
		setValue(test.generated.pg_catalog.tables.PgIndex.PG_INDEX.INDKEY, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_index.indkey</code>
	 * <p>
	 * The SQL type of this item (ARRAY, int2vector) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public java.lang.Object[] getIndkey() {
		return getValue(test.generated.pg_catalog.tables.PgIndex.PG_INDEX.INDKEY);
	}

	/**
	 * The table column <code>pg_catalog.pg_index.indclass</code>
	 */
	public void setIndclass(java.lang.Long[] value) {
		setValue(test.generated.pg_catalog.tables.PgIndex.PG_INDEX.INDCLASS, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_index.indclass</code>
	 */
	public java.lang.Long[] getIndclass() {
		return getValue(test.generated.pg_catalog.tables.PgIndex.PG_INDEX.INDCLASS);
	}

	/**
	 * The table column <code>pg_catalog.pg_index.indoption</code>
	 * <p>
	 * The SQL type of this item (ARRAY, int2vector) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public void setIndoption(java.lang.Object[] value) {
		setValue(test.generated.pg_catalog.tables.PgIndex.PG_INDEX.INDOPTION, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_index.indoption</code>
	 * <p>
	 * The SQL type of this item (ARRAY, int2vector) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public java.lang.Object[] getIndoption() {
		return getValue(test.generated.pg_catalog.tables.PgIndex.PG_INDEX.INDOPTION);
	}

	/**
	 * The table column <code>pg_catalog.pg_index.indexprs</code>
	 */
	public void setIndexprs(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgIndex.PG_INDEX.INDEXPRS, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_index.indexprs</code>
	 */
	public java.lang.String getIndexprs() {
		return getValue(test.generated.pg_catalog.tables.PgIndex.PG_INDEX.INDEXPRS);
	}

	/**
	 * The table column <code>pg_catalog.pg_index.indpred</code>
	 */
	public void setIndpred(java.lang.String value) {
		setValue(test.generated.pg_catalog.tables.PgIndex.PG_INDEX.INDPRED, value);
	}

	/**
	 * The table column <code>pg_catalog.pg_index.indpred</code>
	 */
	public java.lang.String getIndpred() {
		return getValue(test.generated.pg_catalog.tables.PgIndex.PG_INDEX.INDPRED);
	}

	/**
	 * Create a detached PgIndexRecord
	 */
	public PgIndexRecord() {
		super(test.generated.pg_catalog.tables.PgIndex.PG_INDEX);
	}
}