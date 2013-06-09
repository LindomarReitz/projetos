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
public class Governador extends org.jooq.impl.UpdatableTableImpl<test.generated.public_.tables.records.GovernadorRecord> {

	private static final long serialVersionUID = -1690044795;

	/**
	 * The singleton instance of public.governador
	 */
	public static final test.generated.public_.tables.Governador GOVERNADOR = new test.generated.public_.tables.Governador();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.public_.tables.records.GovernadorRecord> getRecordType() {
		return test.generated.public_.tables.records.GovernadorRecord.class;
	}

	/**
	 * The table column <code>public.governador.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<test.generated.public_.tables.records.GovernadorRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>public.governador.nome</code>
	 */
	public final org.jooq.TableField<test.generated.public_.tables.records.GovernadorRecord, java.lang.String> NOME = createField("nome", org.jooq.impl.SQLDataType.VARCHAR, this);

	public Governador() {
		super("governador", test.generated.public_.Public.PUBLIC);
	}

	public Governador(java.lang.String alias) {
		super(alias, test.generated.public_.Public.PUBLIC, test.generated.public_.tables.Governador.GOVERNADOR);
	}

	@Override
	public org.jooq.UniqueKey<test.generated.public_.tables.records.GovernadorRecord> getMainKey() {
		return test.generated.public_.Keys.GOVERNADOR_PKEY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<test.generated.public_.tables.records.GovernadorRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<test.generated.public_.tables.records.GovernadorRecord>>asList(test.generated.public_.Keys.GOVERNADOR_PKEY);
	}

	@Override
	public test.generated.public_.tables.Governador as(java.lang.String alias) {
		return new test.generated.public_.tables.Governador(alias);
	}
}
