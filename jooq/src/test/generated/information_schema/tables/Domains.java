/**
 * This class is generated by jOOQ
 */
package test.generated.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class Domains extends org.jooq.impl.TableImpl<test.generated.information_schema.tables.records.DomainsRecord> {

	private static final long serialVersionUID = 1408640620;

	/**
	 * The singleton instance of information_schema.domains
	 */
	public static final test.generated.information_schema.tables.Domains DOMAINS = new test.generated.information_schema.tables.Domains();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.information_schema.tables.records.DomainsRecord> getRecordType() {
		return test.generated.information_schema.tables.records.DomainsRecord.class;
	}

	/**
	 * The table column <code>information_schema.domains.domain_catalog</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.DomainsRecord, java.lang.String> DOMAIN_CATALOG = createField("domain_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.domains.domain_schema</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.DomainsRecord, java.lang.String> DOMAIN_SCHEMA = createField("domain_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.domains.domain_name</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.DomainsRecord, java.lang.String> DOMAIN_NAME = createField("domain_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.domains.data_type</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.DomainsRecord, java.lang.String> DATA_TYPE = createField("data_type", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.domains.character_maximum_length</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.DomainsRecord, java.lang.Integer> CHARACTER_MAXIMUM_LENGTH = createField("character_maximum_length", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>information_schema.domains.character_octet_length</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.DomainsRecord, java.lang.Integer> CHARACTER_OCTET_LENGTH = createField("character_octet_length", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>information_schema.domains.character_set_catalog</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.DomainsRecord, java.lang.String> CHARACTER_SET_CATALOG = createField("character_set_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.domains.character_set_schema</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.DomainsRecord, java.lang.String> CHARACTER_SET_SCHEMA = createField("character_set_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.domains.character_set_name</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.DomainsRecord, java.lang.String> CHARACTER_SET_NAME = createField("character_set_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.domains.collation_catalog</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.DomainsRecord, java.lang.String> COLLATION_CATALOG = createField("collation_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.domains.collation_schema</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.DomainsRecord, java.lang.String> COLLATION_SCHEMA = createField("collation_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.domains.collation_name</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.DomainsRecord, java.lang.String> COLLATION_NAME = createField("collation_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.domains.numeric_precision</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.DomainsRecord, java.lang.Integer> NUMERIC_PRECISION = createField("numeric_precision", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>information_schema.domains.numeric_precision_radix</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.DomainsRecord, java.lang.Integer> NUMERIC_PRECISION_RADIX = createField("numeric_precision_radix", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>information_schema.domains.numeric_scale</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.DomainsRecord, java.lang.Integer> NUMERIC_SCALE = createField("numeric_scale", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>information_schema.domains.datetime_precision</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.DomainsRecord, java.lang.Integer> DATETIME_PRECISION = createField("datetime_precision", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>information_schema.domains.interval_type</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.DomainsRecord, java.lang.String> INTERVAL_TYPE = createField("interval_type", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.domains.interval_precision</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.DomainsRecord, java.lang.String> INTERVAL_PRECISION = createField("interval_precision", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.domains.domain_default</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.DomainsRecord, java.lang.String> DOMAIN_DEFAULT = createField("domain_default", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.domains.udt_catalog</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.DomainsRecord, java.lang.String> UDT_CATALOG = createField("udt_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.domains.udt_schema</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.DomainsRecord, java.lang.String> UDT_SCHEMA = createField("udt_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.domains.udt_name</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.DomainsRecord, java.lang.String> UDT_NAME = createField("udt_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.domains.scope_catalog</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.DomainsRecord, java.lang.String> SCOPE_CATALOG = createField("scope_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.domains.scope_schema</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.DomainsRecord, java.lang.String> SCOPE_SCHEMA = createField("scope_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.domains.scope_name</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.DomainsRecord, java.lang.String> SCOPE_NAME = createField("scope_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.domains.maximum_cardinality</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.DomainsRecord, java.lang.Integer> MAXIMUM_CARDINALITY = createField("maximum_cardinality", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>information_schema.domains.dtd_identifier</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.DomainsRecord, java.lang.String> DTD_IDENTIFIER = createField("dtd_identifier", org.jooq.impl.SQLDataType.VARCHAR, this);

	public Domains() {
		super("domains", test.generated.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}

	public Domains(java.lang.String alias) {
		super(alias, test.generated.information_schema.InformationSchema.INFORMATION_SCHEMA, test.generated.information_schema.tables.Domains.DOMAINS);
	}

	@Override
	public test.generated.information_schema.tables.Domains as(java.lang.String alias) {
		return new test.generated.information_schema.tables.Domains(alias);
	}
}