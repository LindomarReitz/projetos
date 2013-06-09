/**
 * This class is generated by jOOQ
 */
package test.generated.public_.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class Setores extends org.jooq.impl.UpdatableTableImpl<test.generated.public_.tables.records.SetoresRecord> {

	private static final long serialVersionUID = 278856796;

	/**
	 * The singleton instance of public.setores
	 */
	public static final test.generated.public_.tables.Setores SETORES = new test.generated.public_.tables.Setores();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.public_.tables.records.SetoresRecord> getRecordType() {
		return test.generated.public_.tables.records.SetoresRecord.class;
	}

	/**
	 * The table column <code>public.setores.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<test.generated.public_.tables.records.SetoresRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>public.setores.descricao</code>
	 */
	public final org.jooq.TableField<test.generated.public_.tables.records.SetoresRecord, java.lang.String> DESCRICAO = createField("descricao", org.jooq.impl.SQLDataType.VARCHAR, this);

	public Setores() {
		super("setores", test.generated.public_.Public.PUBLIC);
	}

	public Setores(java.lang.String alias) {
		super(alias, test.generated.public_.Public.PUBLIC, test.generated.public_.tables.Setores.SETORES);
	}

	@Override
	public org.jooq.UniqueKey<test.generated.public_.tables.records.SetoresRecord> getMainKey() {
		return test.generated.public_.Keys.SETORES_PKEY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<test.generated.public_.tables.records.SetoresRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<test.generated.public_.tables.records.SetoresRecord>>asList(test.generated.public_.Keys.SETORES_PKEY);
	}

	@Override
	public test.generated.public_.tables.Setores as(java.lang.String alias) {
		return new test.generated.public_.tables.Setores(alias);
	}
}
