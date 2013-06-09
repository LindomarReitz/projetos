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
public class DepartamentoFuncionarioRecord extends org.jooq.impl.UpdatableRecordImpl<test.generated.public_.tables.records.DepartamentoFuncionarioRecord> {

	private static final long serialVersionUID = 1834859026;

	/**
	 * The table column <code>public.departamento_funcionario.departamento_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT departamento_funcionario__fkad3c220c5816ceb
	 * FOREIGN KEY (departamento_id)
	 * REFERENCES public.departamento (id)
	 * </pre></code>
	 */
	public void setDepartamentoId(java.lang.Long value) {
		setValue(test.generated.public_.tables.DepartamentoFuncionario.DEPARTAMENTO_FUNCIONARIO.DEPARTAMENTO_ID, value);
	}

	/**
	 * The table column <code>public.departamento_funcionario.departamento_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT departamento_funcionario__fkad3c220c5816ceb
	 * FOREIGN KEY (departamento_id)
	 * REFERENCES public.departamento (id)
	 * </pre></code>
	 */
	public java.lang.Long getDepartamentoId() {
		return getValue(test.generated.public_.tables.DepartamentoFuncionario.DEPARTAMENTO_FUNCIONARIO.DEPARTAMENTO_ID);
	}

	/**
	 * Link this record to a given {@link test.generated.public_.tables.records.DepartamentoRecord 
	 * DepartamentoRecord}
	 */
	public void setDepartamentoId(test.generated.public_.tables.records.DepartamentoRecord value) {
		if (value == null) {
			setValue(test.generated.public_.tables.DepartamentoFuncionario.DEPARTAMENTO_FUNCIONARIO.DEPARTAMENTO_ID, null);
		}
		else {
			setValue(test.generated.public_.tables.DepartamentoFuncionario.DEPARTAMENTO_FUNCIONARIO.DEPARTAMENTO_ID, value.getValue(test.generated.public_.tables.Departamento.DEPARTAMENTO.ID));
		}
	}

	/**
	 * The table column <code>public.departamento_funcionario.departamento_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT departamento_funcionario__fkad3c220c5816ceb
	 * FOREIGN KEY (departamento_id)
	 * REFERENCES public.departamento (id)
	 * </pre></code>
	 */
	public test.generated.public_.tables.records.DepartamentoRecord fetchDepartamento() {
		return create()
			.selectFrom(test.generated.public_.tables.Departamento.DEPARTAMENTO)
			.where(test.generated.public_.tables.Departamento.DEPARTAMENTO.ID.equal(getValue(test.generated.public_.tables.DepartamentoFuncionario.DEPARTAMENTO_FUNCIONARIO.DEPARTAMENTO_ID)))
			.fetchOne();
	}

	/**
	 * The table column <code>public.departamento_funcionario.funcionario_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT departamento_funcionario__fkad3c2203ab1bc09
	 * FOREIGN KEY (funcionario_id)
	 * REFERENCES public.funcionario (id)
	 * </pre></code>
	 */
	public void setFuncionarioId(java.lang.Long value) {
		setValue(test.generated.public_.tables.DepartamentoFuncionario.DEPARTAMENTO_FUNCIONARIO.FUNCIONARIO_ID, value);
	}

	/**
	 * The table column <code>public.departamento_funcionario.funcionario_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT departamento_funcionario__fkad3c2203ab1bc09
	 * FOREIGN KEY (funcionario_id)
	 * REFERENCES public.funcionario (id)
	 * </pre></code>
	 */
	public java.lang.Long getFuncionarioId() {
		return getValue(test.generated.public_.tables.DepartamentoFuncionario.DEPARTAMENTO_FUNCIONARIO.FUNCIONARIO_ID);
	}

	/**
	 * Link this record to a given {@link test.generated.public_.tables.records.FuncionarioRecord 
	 * FuncionarioRecord}
	 */
	public void setFuncionarioId(test.generated.public_.tables.records.FuncionarioRecord value) {
		if (value == null) {
			setValue(test.generated.public_.tables.DepartamentoFuncionario.DEPARTAMENTO_FUNCIONARIO.FUNCIONARIO_ID, null);
		}
		else {
			setValue(test.generated.public_.tables.DepartamentoFuncionario.DEPARTAMENTO_FUNCIONARIO.FUNCIONARIO_ID, value.getValue(test.generated.public_.tables.Funcionario.FUNCIONARIO.ID));
		}
	}

	/**
	 * The table column <code>public.departamento_funcionario.funcionario_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT departamento_funcionario__fkad3c2203ab1bc09
	 * FOREIGN KEY (funcionario_id)
	 * REFERENCES public.funcionario (id)
	 * </pre></code>
	 */
	public test.generated.public_.tables.records.FuncionarioRecord fetchFuncionario() {
		return create()
			.selectFrom(test.generated.public_.tables.Funcionario.FUNCIONARIO)
			.where(test.generated.public_.tables.Funcionario.FUNCIONARIO.ID.equal(getValue(test.generated.public_.tables.DepartamentoFuncionario.DEPARTAMENTO_FUNCIONARIO.FUNCIONARIO_ID)))
			.fetchOne();
	}

	/**
	 * Create a detached DepartamentoFuncionarioRecord
	 */
	public DepartamentoFuncionarioRecord() {
		super(test.generated.public_.tables.DepartamentoFuncionario.DEPARTAMENTO_FUNCIONARIO);
	}
}
