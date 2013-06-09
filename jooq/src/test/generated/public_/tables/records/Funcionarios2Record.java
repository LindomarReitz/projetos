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
public class Funcionarios2Record extends org.jooq.impl.UpdatableRecordImpl<test.generated.public_.tables.records.Funcionarios2Record> {

	private static final long serialVersionUID = 1087468467;

	/**
	 * The table column <code>public.funcionarios2.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(test.generated.public_.tables.Funcionarios2.FUNCIONARIOS2.ID, value);
	}

	/**
	 * The table column <code>public.funcionarios2.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(test.generated.public_.tables.Funcionarios2.FUNCIONARIOS2.ID);
	}

	/**
	 * The table column <code>public.funcionarios2.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<test.generated.public_.tables.records.ProjetosFuncionariosRecord> fetchProjetosFuncionariosList() {
		return create()
			.selectFrom(test.generated.public_.tables.ProjetosFuncionarios.PROJETOS_FUNCIONARIOS)
			.where(test.generated.public_.tables.ProjetosFuncionarios.PROJETOS_FUNCIONARIOS.FUNCIONARIOS_ID.equal(getValue(test.generated.public_.tables.Funcionarios2.FUNCIONARIOS2.ID)))
			.fetch();
	}

	/**
	 * The table column <code>public.funcionarios2.nome</code>
	 */
	public void setNome(java.lang.String value) {
		setValue(test.generated.public_.tables.Funcionarios2.FUNCIONARIOS2.NOME, value);
	}

	/**
	 * The table column <code>public.funcionarios2.nome</code>
	 */
	public java.lang.String getNome() {
		return getValue(test.generated.public_.tables.Funcionarios2.FUNCIONARIOS2.NOME);
	}

	/**
	 * The table column <code>public.funcionarios2.salario</code>
	 */
	public void setSalario(java.lang.Double value) {
		setValue(test.generated.public_.tables.Funcionarios2.FUNCIONARIOS2.SALARIO, value);
	}

	/**
	 * The table column <code>public.funcionarios2.salario</code>
	 */
	public java.lang.Double getSalario() {
		return getValue(test.generated.public_.tables.Funcionarios2.FUNCIONARIOS2.SALARIO);
	}

	/**
	 * The table column <code>public.funcionarios2.setores_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT funcionarios2__fk40b0213a3258fa16
	 * FOREIGN KEY (setores_id)
	 * REFERENCES public.setores (id)
	 * </pre></code>
	 */
	public void setSetoresId(java.lang.Integer value) {
		setValue(test.generated.public_.tables.Funcionarios2.FUNCIONARIOS2.SETORES_ID, value);
	}

	/**
	 * The table column <code>public.funcionarios2.setores_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT funcionarios2__fk40b0213a3258fa16
	 * FOREIGN KEY (setores_id)
	 * REFERENCES public.setores (id)
	 * </pre></code>
	 */
	public java.lang.Integer getSetoresId() {
		return getValue(test.generated.public_.tables.Funcionarios2.FUNCIONARIOS2.SETORES_ID);
	}

	/**
	 * Link this record to a given {@link test.generated.public_.tables.records.SetoresRecord 
	 * SetoresRecord}
	 */
	public void setSetoresId(test.generated.public_.tables.records.SetoresRecord value) {
		if (value == null) {
			setValue(test.generated.public_.tables.Funcionarios2.FUNCIONARIOS2.SETORES_ID, null);
		}
		else {
			setValue(test.generated.public_.tables.Funcionarios2.FUNCIONARIOS2.SETORES_ID, value.getValue(test.generated.public_.tables.Setores.SETORES.ID));
		}
	}

	/**
	 * The table column <code>public.funcionarios2.setores_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT funcionarios2__fk40b0213a3258fa16
	 * FOREIGN KEY (setores_id)
	 * REFERENCES public.setores (id)
	 * </pre></code>
	 */
	public test.generated.public_.tables.records.SetoresRecord fetchSetores() {
		return create()
			.selectFrom(test.generated.public_.tables.Setores.SETORES)
			.where(test.generated.public_.tables.Setores.SETORES.ID.equal(getValue(test.generated.public_.tables.Funcionarios2.FUNCIONARIOS2.SETORES_ID)))
			.fetchOne();
	}

	/**
	 * Create a detached Funcionarios2Record
	 */
	public Funcionarios2Record() {
		super(test.generated.public_.tables.Funcionarios2.FUNCIONARIOS2);
	}
}