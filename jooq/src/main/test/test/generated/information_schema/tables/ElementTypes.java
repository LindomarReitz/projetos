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
public class ElementTypes extends org.jooq.impl.TableImpl<test.generated.information_schema.tables.records.ElementTypesRecord> {

	private static final long serialVersionUID = -264973555;

	/**
	 * The singleton instance of information_schema.element_types
	 */
	public static final test.generated.information_schema.tables.ElementTypes ELEMENT_TYPES = new test.generated.information_schema.tables.ElementTypes();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.information_schema.tables.records.ElementTypesRecord> getRecordType() {
		return test.generated.information_schema.tables.records.ElementTypesRecord.class;
	}

	/**
	 * The table column <code>information_schema.element_types.object_catalog</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ElementTypesRecord, java.lang.String> OBJECT_CATALOG = createField("object_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.element_types.object_schema</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ElementTypesRecord, java.lang.String> OBJECT_SCHEMA = createField("object_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.element_types.object_name</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ElementTypesRecord, java.lang.String> OBJECT_NAME = createField("object_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.element_types.object_type</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ElementTypesRecord, java.lang.String> OBJECT_TYPE = createField("object_type", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.element_types.collection_type_identifier</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ElementTypesRecord, java.lang.String> COLLECTION_TYPE_IDENTIFIER = createField("collection_type_identifier", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.element_types.data_type</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ElementTypesRecord, java.lang.String> DATA_TYPE = createField("data_type", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.element_types.character_maximum_length</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ElementTypesRecord, java.lang.Integer> CHARACTER_MAXIMUM_LENGTH = createField("character_maximum_length", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>information_schema.element_types.character_octet_length</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ElementTypesRecord, java.lang.Integer> CHARACTER_OCTET_LENGTH = createField("character_octet_length", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>information_schema.element_types.character_set_catalog</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ElementTypesRecord, java.lang.String> CHARACTER_SET_CATALOG = createField("character_set_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.element_types.character_set_schema</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ElementTypesRecord, java.lang.String> CHARACTER_SET_SCHEMA = createField("character_set_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.element_types.character_set_name</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ElementTypesRecord, java.lang.String> CHARACTER_SET_NAME = createField("character_set_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.element_types.collation_catalog</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ElementTypesRecord, java.lang.String> COLLATION_CATALOG = createField("collation_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.element_types.collation_schema</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ElementTypesRecord, java.lang.String> COLLATION_SCHEMA = createField("collation_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.element_types.collation_name</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ElementTypesRecord, java.lang.String> COLLATION_NAME = createField("collation_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.element_types.numeric_precision</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ElementTypesRecord, java.lang.Integer> NUMERIC_PRECISION = createField("numeric_precision", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>information_schema.element_types.numeric_precision_radix</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ElementTypesRecord, java.lang.Integer> NUMERIC_PRECISION_RADIX = createField("numeric_precision_radix", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>information_schema.element_types.numeric_scale</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ElementTypesRecord, java.lang.Integer> NUMERIC_SCALE = createField("numeric_scale", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>information_schema.element_types.datetime_precision</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ElementTypesRecord, java.lang.Integer> DATETIME_PRECISION = createField("datetime_precision", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>information_schema.element_types.interval_type</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ElementTypesRecord, java.lang.String> INTERVAL_TYPE = createField("interval_type", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.element_types.interval_precision</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ElementTypesRecord, java.lang.String> INTERVAL_PRECISION = createField("interval_precision", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.element_types.domain_default</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ElementTypesRecord, java.lang.String> DOMAIN_DEFAULT = createField("domain_default", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.element_types.udt_catalog</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ElementTypesRecord, java.lang.String> UDT_CATALOG = createField("udt_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.element_types.udt_schema</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ElementTypesRecord, java.lang.String> UDT_SCHEMA = createField("udt_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.element_types.udt_name</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ElementTypesRecord, java.lang.String> UDT_NAME = createField("udt_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.element_types.scope_catalog</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ElementTypesRecord, java.lang.String> SCOPE_CATALOG = createField("scope_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.element_types.scope_schema</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ElementTypesRecord, java.lang.String> SCOPE_SCHEMA = createField("scope_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.element_types.scope_name</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ElementTypesRecord, java.lang.String> SCOPE_NAME = createField("scope_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.element_types.maximum_cardinality</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ElementTypesRecord, java.lang.Integer> MAXIMUM_CARDINALITY = createField("maximum_cardinality", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>information_schema.element_types.dtd_identifier</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ElementTypesRecord, java.lang.String> DTD_IDENTIFIER = createField("dtd_identifier", org.jooq.impl.SQLDataType.VARCHAR, this);

	public ElementTypes() {
		super("element_types", test.generated.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}

	public ElementTypes(java.lang.String alias) {
		super(alias, test.generated.information_schema.InformationSchema.INFORMATION_SCHEMA, test.generated.information_schema.tables.ElementTypes.ELEMENT_TYPES);
	}

	@Override
	public test.generated.information_schema.tables.ElementTypes as(java.lang.String alias) {
		return new test.generated.information_schema.tables.ElementTypes(alias);
	}
}