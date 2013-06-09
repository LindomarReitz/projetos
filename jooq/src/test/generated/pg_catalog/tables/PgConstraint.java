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
public class PgConstraint extends org.jooq.impl.TableImpl<test.generated.pg_catalog.tables.records.PgConstraintRecord> {

	private static final long serialVersionUID = 1194484211;

	/**
	 * The singleton instance of pg_catalog.pg_constraint
	 */
	public static final test.generated.pg_catalog.tables.PgConstraint PG_CONSTRAINT = new test.generated.pg_catalog.tables.PgConstraint();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.pg_catalog.tables.records.PgConstraintRecord> getRecordType() {
		return test.generated.pg_catalog.tables.records.PgConstraintRecord.class;
	}

	/**
	 * The table column <code>pg_catalog.pg_constraint.conname</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgConstraintRecord, java.lang.String> CONNAME = createField("conname", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_constraint.connamespace</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgConstraintRecord, java.lang.Long> CONNAMESPACE = createField("connamespace", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_constraint.contype</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgConstraintRecord, java.lang.String> CONTYPE = createField("contype", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_constraint.condeferrable</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgConstraintRecord, java.lang.Boolean> CONDEFERRABLE = createField("condeferrable", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>pg_catalog.pg_constraint.condeferred</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgConstraintRecord, java.lang.Boolean> CONDEFERRED = createField("condeferred", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>pg_catalog.pg_constraint.conrelid</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgConstraintRecord, java.lang.Long> CONRELID = createField("conrelid", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_constraint.contypid</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgConstraintRecord, java.lang.Long> CONTYPID = createField("contypid", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_constraint.conindid</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgConstraintRecord, java.lang.Long> CONINDID = createField("conindid", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_constraint.confrelid</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgConstraintRecord, java.lang.Long> CONFRELID = createField("confrelid", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>pg_catalog.pg_constraint.confupdtype</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgConstraintRecord, java.lang.String> CONFUPDTYPE = createField("confupdtype", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_constraint.confdeltype</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgConstraintRecord, java.lang.String> CONFDELTYPE = createField("confdeltype", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_constraint.confmatchtype</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgConstraintRecord, java.lang.String> CONFMATCHTYPE = createField("confmatchtype", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The table column <code>pg_catalog.pg_constraint.conislocal</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgConstraintRecord, java.lang.Boolean> CONISLOCAL = createField("conislocal", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>pg_catalog.pg_constraint.coninhcount</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgConstraintRecord, java.lang.Integer> CONINHCOUNT = createField("coninhcount", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>pg_catalog.pg_constraint.conkey</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgConstraintRecord, java.lang.Short[]> CONKEY = createField("conkey", org.jooq.impl.SQLDataType.SMALLINT.getArrayDataType(), this);

	/**
	 * The table column <code>pg_catalog.pg_constraint.confkey</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgConstraintRecord, java.lang.Short[]> CONFKEY = createField("confkey", org.jooq.impl.SQLDataType.SMALLINT.getArrayDataType(), this);

	/**
	 * The table column <code>pg_catalog.pg_constraint.conpfeqop</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgConstraintRecord, java.lang.Long[]> CONPFEQOP = createField("conpfeqop", org.jooq.impl.SQLDataType.BIGINT.getArrayDataType(), this);

	/**
	 * The table column <code>pg_catalog.pg_constraint.conppeqop</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgConstraintRecord, java.lang.Long[]> CONPPEQOP = createField("conppeqop", org.jooq.impl.SQLDataType.BIGINT.getArrayDataType(), this);

	/**
	 * The table column <code>pg_catalog.pg_constraint.conffeqop</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgConstraintRecord, java.lang.Long[]> CONFFEQOP = createField("conffeqop", org.jooq.impl.SQLDataType.BIGINT.getArrayDataType(), this);

	/**
	 * The table column <code>pg_catalog.pg_constraint.conexclop</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgConstraintRecord, java.lang.Long[]> CONEXCLOP = createField("conexclop", org.jooq.impl.SQLDataType.BIGINT.getArrayDataType(), this);

	/**
	 * The table column <code>pg_catalog.pg_constraint.conbin</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgConstraintRecord, java.lang.String> CONBIN = createField("conbin", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The table column <code>pg_catalog.pg_constraint.consrc</code>
	 */
	public final org.jooq.TableField<test.generated.pg_catalog.tables.records.PgConstraintRecord, java.lang.String> CONSRC = createField("consrc", org.jooq.impl.SQLDataType.CLOB, this);

	public PgConstraint() {
		super("pg_constraint", test.generated.pg_catalog.PgCatalog.PG_CATALOG);
	}

	public PgConstraint(java.lang.String alias) {
		super(alias, test.generated.pg_catalog.PgCatalog.PG_CATALOG, test.generated.pg_catalog.tables.PgConstraint.PG_CONSTRAINT);
	}

	@Override
	public test.generated.pg_catalog.tables.PgConstraint as(java.lang.String alias) {
		return new test.generated.pg_catalog.tables.PgConstraint(alias);
	}
}