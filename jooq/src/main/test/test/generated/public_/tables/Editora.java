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
public class Editora extends org.jooq.impl.UpdatableTableImpl<test.generated.public_.tables.records.EditoraRecord> {

	private static final long serialVersionUID = -595838344;

	/**
	 * The singleton instance of public.editora
	 */
	public static final test.generated.public_.tables.Editora EDITORA = new test.generated.public_.tables.Editora();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.public_.tables.records.EditoraRecord> getRecordType() {
		return test.generated.public_.tables.records.EditoraRecord.class;
	}

	/**
	 * The table column <code>public.editora.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<test.generated.public_.tables.records.EditoraRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>public.editora.datadecriacao</code>
	 */
	public final org.jooq.TableField<test.generated.public_.tables.records.EditoraRecord, java.sql.Date> DATADECRIACAO = createField("datadecriacao", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * The table column <code>public.editora.email</code>
	 */
	public final org.jooq.TableField<test.generated.public_.tables.records.EditoraRecord, java.lang.String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>public.editora.nome</code>
	 */
	public final org.jooq.TableField<test.generated.public_.tables.records.EditoraRecord, java.lang.String> NOME = createField("nome", org.jooq.impl.SQLDataType.VARCHAR, this);

	public Editora() {
		super("editora", test.generated.public_.Public.PUBLIC);
	}

	public Editora(java.lang.String alias) {
		super(alias, test.generated.public_.Public.PUBLIC, test.generated.public_.tables.Editora.EDITORA);
	}

	@Override
	public org.jooq.UniqueKey<test.generated.public_.tables.records.EditoraRecord> getMainKey() {
		return test.generated.public_.Keys.EDITORA_PKEY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<test.generated.public_.tables.records.EditoraRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<test.generated.public_.tables.records.EditoraRecord>>asList(test.generated.public_.Keys.EDITORA_PKEY, test.generated.public_.Keys.EDITORA_EMAIL_KEY);
	}

	@Override
	public test.generated.public_.tables.Editora as(java.lang.String alias) {
		return new test.generated.public_.tables.Editora(alias);
	}
}