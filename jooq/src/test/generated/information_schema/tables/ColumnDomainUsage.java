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
public class ColumnDomainUsage extends org.jooq.impl.TableImpl<test.generated.information_schema.tables.records.ColumnDomainUsageRecord> {

	private static final long serialVersionUID = -1454512966;

	/**
	 * The singleton instance of information_schema.column_domain_usage
	 */
	public static final test.generated.information_schema.tables.ColumnDomainUsage COLUMN_DOMAIN_USAGE = new test.generated.information_schema.tables.ColumnDomainUsage();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.information_schema.tables.records.ColumnDomainUsageRecord> getRecordType() {
		return test.generated.information_schema.tables.records.ColumnDomainUsageRecord.class;
	}

	/**
	 * The table column <code>information_schema.column_domain_usage.domain_catalog</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ColumnDomainUsageRecord, java.lang.String> DOMAIN_CATALOG = createField("domain_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.column_domain_usage.domain_schema</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ColumnDomainUsageRecord, java.lang.String> DOMAIN_SCHEMA = createField("domain_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.column_domain_usage.domain_name</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ColumnDomainUsageRecord, java.lang.String> DOMAIN_NAME = createField("domain_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.column_domain_usage.table_catalog</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ColumnDomainUsageRecord, java.lang.String> TABLE_CATALOG = createField("table_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.column_domain_usage.table_schema</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ColumnDomainUsageRecord, java.lang.String> TABLE_SCHEMA = createField("table_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.column_domain_usage.table_name</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ColumnDomainUsageRecord, java.lang.String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>information_schema.column_domain_usage.column_name</code>
	 */
	public final org.jooq.TableField<test.generated.information_schema.tables.records.ColumnDomainUsageRecord, java.lang.String> COLUMN_NAME = createField("column_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	public ColumnDomainUsage() {
		super("column_domain_usage", test.generated.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}

	public ColumnDomainUsage(java.lang.String alias) {
		super(alias, test.generated.information_schema.InformationSchema.INFORMATION_SCHEMA, test.generated.information_schema.tables.ColumnDomainUsage.COLUMN_DOMAIN_USAGE);
	}

	@Override
	public test.generated.information_schema.tables.ColumnDomainUsage as(java.lang.String alias) {
		return new test.generated.information_schema.tables.ColumnDomainUsage(alias);
	}
}
