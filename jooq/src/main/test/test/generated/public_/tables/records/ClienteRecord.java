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
public class ClienteRecord extends org.jooq.impl.UpdatableRecordImpl<test.generated.public_.tables.records.ClienteRecord> {

	private static final long serialVersionUID = 461401932;

	/**
	 * The table column <code>public.cliente.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Long value) {
		setValue(test.generated.public_.tables.Cliente.CLIENTE.ID, value);
	}

	/**
	 * The table column <code>public.cliente.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Long getId() {
		return getValue(test.generated.public_.tables.Cliente.CLIENTE.ID);
	}

	/**
	 * The table column <code>public.cliente.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<test.generated.public_.tables.records.PedidoRecord> fetchPedidoList() {
		return create()
			.selectFrom(test.generated.public_.tables.Pedido.PEDIDO)
			.where(test.generated.public_.tables.Pedido.PEDIDO.CLIENTE_ID.equal(getValue(test.generated.public_.tables.Cliente.CLIENTE.ID)))
			.fetch();
	}

	/**
	 * The table column <code>public.cliente.nome</code>
	 */
	public void setNome(java.lang.String value) {
		setValue(test.generated.public_.tables.Cliente.CLIENTE.NOME, value);
	}

	/**
	 * The table column <code>public.cliente.nome</code>
	 */
	public java.lang.String getNome() {
		return getValue(test.generated.public_.tables.Cliente.CLIENTE.NOME);
	}

	/**
	 * Create a detached ClienteRecord
	 */
	public ClienteRecord() {
		super(test.generated.public_.tables.Cliente.CLIENTE);
	}
}
