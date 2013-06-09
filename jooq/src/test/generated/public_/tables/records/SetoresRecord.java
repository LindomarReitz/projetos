/**
 * This class is generated by jOOQ
 */
package test.generated.public_.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class SetoresRecord extends org.jooq.impl.UpdatableRecordImpl<test.generated.public_.tables.records.SetoresRecord> {

	private static final long serialVersionUID = -3276782;

	/**
	 * The table column <code>public.setores.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(test.generated.public_.tables.Setores.SETORES.ID, value);
	}

	/**
	 * The table column <code>public.setores.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(test.generated.public_.tables.Setores.SETORES.ID);
	}

	/**
	 * The table column <code>public.setores.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<test.generated.public_.tables.records.Funcionarios2Record> fetchFuncionarios2List() {
		return create()
			.selectFrom(test.generated.public_.tables.Funcionarios2.FUNCIONARIOS2)
			.where(test.generated.public_.tables.Funcionarios2.FUNCIONARIOS2.SETORES_ID.equal(getValue(test.generated.public_.tables.Setores.SETORES.ID)))
			.fetch();
	}

	/**
	 * The table column <code>public.setores.descricao</code>
	 */
	public void setDescricao(java.lang.String value) {
		setValue(test.generated.public_.tables.Setores.SETORES.DESCRICAO, value);
	}

	/**
	 * The table column <code>public.setores.descricao</code>
	 */
	public java.lang.String getDescricao() {
		return getValue(test.generated.public_.tables.Setores.SETORES.DESCRICAO);
	}

	/**
	 * Create a detached SetoresRecord
	 */
	public SetoresRecord() {
		super(test.generated.public_.tables.Setores.SETORES);
	}
}
