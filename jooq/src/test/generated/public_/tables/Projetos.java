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
public class Projetos extends org.jooq.impl.UpdatableTableImpl<test.generated.public_.tables.records.ProjetosRecord> {

	private static final long serialVersionUID = 1834509778;

	/**
	 * The singleton instance of public.projetos
	 */
	public static final test.generated.public_.tables.Projetos PROJETOS = new test.generated.public_.tables.Projetos();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.public_.tables.records.ProjetosRecord> getRecordType() {
		return test.generated.public_.tables.records.ProjetosRecord.class;
	}

	/**
	 * The table column <code>public.projetos.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<test.generated.public_.tables.records.ProjetosRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>public.projetos.descricao</code>
	 */
	public final org.jooq.TableField<test.generated.public_.tables.records.ProjetosRecord, java.lang.String> DESCRICAO = createField("descricao", org.jooq.impl.SQLDataType.VARCHAR, this);

	public Projetos() {
		super("projetos", test.generated.public_.Public.PUBLIC);
	}

	public Projetos(java.lang.String alias) {
		super(alias, test.generated.public_.Public.PUBLIC, test.generated.public_.tables.Projetos.PROJETOS);
	}

	@Override
	public org.jooq.UniqueKey<test.generated.public_.tables.records.ProjetosRecord> getMainKey() {
		return test.generated.public_.Keys.PROJETOS_PKEY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<test.generated.public_.tables.records.ProjetosRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<test.generated.public_.tables.records.ProjetosRecord>>asList(test.generated.public_.Keys.PROJETOS_PKEY);
	}

	@Override
	public test.generated.public_.tables.Projetos as(java.lang.String alias) {
		return new test.generated.public_.tables.Projetos(alias);
	}
}
