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
public class Projeto2Funcionario3 extends org.jooq.impl.UpdatableTableImpl<test.generated.public_.tables.records.Projeto2Funcionario3Record> {

	private static final long serialVersionUID = 1903569332;

	/**
	 * The singleton instance of public.projeto2_funcionario3
	 */
	public static final test.generated.public_.tables.Projeto2Funcionario3 PROJETO2_FUNCIONARIO3 = new test.generated.public_.tables.Projeto2Funcionario3();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.public_.tables.records.Projeto2Funcionario3Record> getRecordType() {
		return test.generated.public_.tables.records.Projeto2Funcionario3Record.class;
	}

	/**
	 * The table column <code>public.projeto2_funcionario3.projeto2_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT projeto2_funcionario3__fk91397c88496b7473
	 * FOREIGN KEY (projeto2_id)
	 * REFERENCES public.projeto2 (id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<test.generated.public_.tables.records.Projeto2Funcionario3Record, java.lang.Integer> PROJETO2_ID = createField("projeto2_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>public.projeto2_funcionario3.funcionario3_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT projeto2_funcionario3__fk91397c88540af53
	 * FOREIGN KEY (funcionario3_id)
	 * REFERENCES public.funcionario3 (id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<test.generated.public_.tables.records.Projeto2Funcionario3Record, java.lang.Integer> FUNCIONARIO3_ID = createField("funcionario3_id", org.jooq.impl.SQLDataType.INTEGER, this);

	public Projeto2Funcionario3() {
		super("projeto2_funcionario3", test.generated.public_.Public.PUBLIC);
	}

	public Projeto2Funcionario3(java.lang.String alias) {
		super(alias, test.generated.public_.Public.PUBLIC, test.generated.public_.tables.Projeto2Funcionario3.PROJETO2_FUNCIONARIO3);
	}

	@Override
	public org.jooq.UniqueKey<test.generated.public_.tables.records.Projeto2Funcionario3Record> getMainKey() {
		return test.generated.public_.Keys.PROJETO2_FUNCIONARIO3_FUNCIONARIO3_ID_KEY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<test.generated.public_.tables.records.Projeto2Funcionario3Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<test.generated.public_.tables.records.Projeto2Funcionario3Record>>asList(test.generated.public_.Keys.PROJETO2_FUNCIONARIO3_FUNCIONARIO3_ID_KEY);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<test.generated.public_.tables.records.Projeto2Funcionario3Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<test.generated.public_.tables.records.Projeto2Funcionario3Record, ?>>asList(test.generated.public_.Keys.PROJETO2_FUNCIONARIO3__FK91397C88496B7473, test.generated.public_.Keys.PROJETO2_FUNCIONARIO3__FK91397C88540AF53);
	}

	@Override
	public test.generated.public_.tables.Projeto2Funcionario3 as(java.lang.String alias) {
		return new test.generated.public_.tables.Projeto2Funcionario3(alias);
	}
}
