/**
 * This class is generated by jOOQ
 */
package test.generated.pg_catalog.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class PgTsConfigMap extends org.jooq.impl.TableImpl<test.generated.pg_catalog.tables.records.PgTsConfigMapRecord> {

	private static final long serialVersionUID = -1570279971;

	/**
	 * The singleton instance of pg_catalog.pg_ts_config_map
	 */
	public static final test.generated.pg_catalog.tables.PgTsConfigMap PG_TS_CONFIG_MAP = new test.generated.pg_catalog.tables.PgTsConfigMap();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.pg_catalog.tables.records.PgTsConfigMapRecord> getRecordType() {
		return test.generated.pg_catalog.tables.records.PgTsConfigMapRecord.class;
	}

	/**
	 * The table column <code>pg_catalog.pg_ts_config_map.mapcfg</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgTsConfigMapRecord, java.lang.Long> MAPCFG = createField("mapcfg", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_ts_config_map.maptokentype</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgTsConfigMapRecord, java.lang.Integer> MAPTOKENTYPE = createField("maptokentype", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>pg_catalog.pg_ts_config_map.mapseqno</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgTsConfigMapRecord, java.lang.Integer> MAPSEQNO = createField("mapseqno", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>pg_catalog.pg_ts_config_map.mapdict</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgTsConfigMapRecord, java.lang.Long> MAPDICT = createField("mapdict", org.jooq.impl.SQLDataType.BIGINT, this);

	public PgTsConfigMap() {
		super("pg_ts_config_map", test.generated.pg_catalog.PgCatalog.PG_CATALOG);
	}

	public PgTsConfigMap(java.lang.String alias) {
		super(alias, test.generated.pg_catalog.PgCatalog.PG_CATALOG, test.generated.pg_catalog.tables.PgTsConfigMap.PG_TS_CONFIG_MAP);
	}

	@Override
	public test.generated.pg_catalog.tables.PgTsConfigMap as(java.lang.String alias) {
		return new test.generated.pg_catalog.tables.PgTsConfigMap(alias);
	}
}