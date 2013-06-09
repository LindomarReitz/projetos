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
public class Funcionario3Record extends org.jooq.impl.UpdatableRecordImpl<test.generated.public_.tables.records.Funcionario3Record> {

	private static final long serialVersionUID = 1869086964;

	/**
	 * The table column <code>public.funcionario3.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(test.generated.public_.tables.Funcionario3.FUNCIONARIO3.ID, value);
	}

	/**
	 * The table column <code>public.funcionario3.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(test.generated.public_.tables.Funcionario3.FUNCIONARIO3.ID);
	}

	/**
	 * The table column <code>public.funcionario3.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<test.generated.public_.tables.records.Projeto2Funcionario3Record> fetchProjeto2Funcionario3List() {
		return create()
			.selectFrom(test.generated.public_.tables.Projeto2Funcionario3.PROJETO2_FUNCIONARIO3)
			.where(test.generated.public_.tables.Projeto2Funcionario3.PROJETO2_FUNCIONARIO3.FUNCIONARIO3_ID.equal(getValue(test.generated.public_.tables.Funcionario3.FUNCIONARIO3.ID)))
			.fetch();
	}

	/**
	 * The table column <code>public.funcionario3.endereco</code>
	 */
	public void setEndereco(java.lang.String value) {
		setValue(test.generated.public_.tables.Funcionario3.FUNCIONARIO3.ENDERECO, value);
	}

	/**
	 * The table column <code>public.funcionario3.endereco</code>
	 */
	public java.lang.String getEndereco() {
		return getValue(test.generated.public_.tables.Funcionario3.FUNCIONARIO3.ENDERECO);
	}

	/**
	 * The table column <code>public.funcionario3.nome</code>
	 */
	public void setNome(java.lang.String value) {
		setValue(test.generated.public_.tables.Funcionario3.FUNCIONARIO3.NOME, value);
	}

	/**
	 * The table column <code>public.funcionario3.nome</code>
	 */
	public java.lang.String getNome() {
		return getValue(test.generated.public_.tables.Funcionario3.FUNCIONARIO3.NOME);
	}

	/**
	 * The table column <code>public.funcionario3.salario</code>
	 */
	public void setSalario(java.lang.Float value) {
		setValue(test.generated.public_.tables.Funcionario3.FUNCIONARIO3.SALARIO, value);
	}

	/**
	 * The table column <code>public.funcionario3.salario</code>
	 */
	public java.lang.Float getSalario() {
		return getValue(test.generated.public_.tables.Funcionario3.FUNCIONARIO3.SALARIO);
	}

	/**
	 * The table column <code>public.funcionario3.sexo</code>
	 */
	public void setSexo(java.lang.String value) {
		setValue(test.generated.public_.tables.Funcionario3.FUNCIONARIO3.SEXO, value);
	}

	/**
	 * The table column <code>public.funcionario3.sexo</code>
	 */
	public java.lang.String getSexo() {
		return getValue(test.generated.public_.tables.Funcionario3.FUNCIONARIO3.SEXO);
	}

	/**
	 * The table column <code>public.funcionario3.funcionario_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT funcionario3__fkc18ef1d83a180687
	 * FOREIGN KEY (funcionario_id)
	 * REFERENCES public.projeto2 (id)
	 * </pre></code>
	 */
	public void setFuncionarioId(java.lang.Integer value) {
		setValue(test.generated.public_.tables.Funcionario3.FUNCIONARIO3.FUNCIONARIO_ID, value);
	}

	/**
	 * The table column <code>public.funcionario3.funcionario_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT funcionario3__fkc18ef1d83a180687
	 * FOREIGN KEY (funcionario_id)
	 * REFERENCES public.projeto2 (id)
	 * </pre></code>
	 */
	public java.lang.Integer getFuncionarioId() {
		return getValue(test.generated.public_.tables.Funcionario3.FUNCIONARIO3.FUNCIONARIO_ID);
	}

	/**
	 * Link this record to a given {@link test.generated.public_.tables.records.Projeto2Record 
	 * Projeto2Record}
	 */
	public void setFuncionarioId(test.generated.public_.tables.records.Projeto2Record value) {
		if (value == null) {
			setValue(test.generated.public_.tables.Funcionario3.FUNCIONARIO3.FUNCIONARIO_ID, null);
		}
		else {
			setValue(test.generated.public_.tables.Funcionario3.FUNCIONARIO3.FUNCIONARIO_ID, value.getValue(test.generated.public_.tables.Projeto2.PROJETO2.ID));
		}
	}

	/**
	 * The table column <code>public.funcionario3.funcionario_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT funcionario3__fkc18ef1d83a180687
	 * FOREIGN KEY (funcionario_id)
	 * REFERENCES public.projeto2 (id)
	 * </pre></code>
	 */
	public test.generated.public_.tables.records.Projeto2Record fetchProjeto2() {
		return create()
			.selectFrom(test.generated.public_.tables.Projeto2.PROJETO2)
			.where(test.generated.public_.tables.Projeto2.PROJETO2.ID.equal(getValue(test.generated.public_.tables.Funcionario3.FUNCIONARIO3.FUNCIONARIO_ID)))
			.fetchOne();
	}

	/**
	 * Create a detached Funcionario3Record
	 */
	public Funcionario3Record() {
		super(test.generated.public_.tables.Funcionario3.FUNCIONARIO3);
	}
}