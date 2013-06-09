/**
 * This class is generated by jOOQ
 */
package test.generated.public_;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class Public extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = 309064799;

	/**
	 * The singleton instance of public
	 */
	public static final Public PUBLIC = new Public();

	/**
	 * No further instances allowed
	 */
	private Public() {
		super("public");
	}

	@Override
	public final java.util.List<org.jooq.Sequence<?>> getSequences() {
		return java.util.Arrays.<org.jooq.Sequence<?>>asList(
			test.generated.public_.Sequences.ID_AUTOR_SEQ,
			test.generated.public_.Sequences.ID_CLIENTE_SEQ,
			test.generated.public_.Sequences.ID_DEPARTAMENTO_SEQ,
			test.generated.public_.Sequences.ID_EDITORA_SEQ,
			test.generated.public_.Sequences.ID_ESTADO_SEQ,
			test.generated.public_.Sequences.ID_FUNCIONARIO_SEQ,
			test.generated.public_.Sequences.ID_FUNCIONARIOS2_SEQ,
			test.generated.public_.Sequences.ID_GOVERNADOR_SEQ,
			test.generated.public_.Sequences.ID_LIVRO_SEQ,
			test.generated.public_.Sequences.ID_PEDIDO_SEQ,
			test.generated.public_.Sequences.ID_PESSOA_SEQ,
			test.generated.public_.Sequences.ID_PESSOA2_SEQ,
			test.generated.public_.Sequences.ID_PROJETO_SEQ,
			test.generated.public_.Sequences.ID_PROJETOS_SEQ,
			test.generated.public_.Sequences.ID_SETORES_SEQ,
			test.generated.public_.Sequences.ID_USUARIO_SEQ);
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			test.generated.public_.tables.Autor.AUTOR,
			test.generated.public_.tables.Cliente.CLIENTE,
			test.generated.public_.tables.Departamento.DEPARTAMENTO,
			test.generated.public_.tables.DepartamentoFuncionario.DEPARTAMENTO_FUNCIONARIO,
			test.generated.public_.tables.Editora.EDITORA,
			test.generated.public_.tables.Estado.ESTADO,
			test.generated.public_.tables.Funcionario.FUNCIONARIO,
			test.generated.public_.tables.Funcionario3.FUNCIONARIO3,
			test.generated.public_.tables.Funcionarios2.FUNCIONARIOS2,
			test.generated.public_.tables.Governador.GOVERNADOR,
			test.generated.public_.tables.Livro.LIVRO,
			test.generated.public_.tables.LivroAutor.LIVRO_AUTOR,
			test.generated.public_.tables.Pedido.PEDIDO,
			test.generated.public_.tables.Pessoa.PESSOA,
			test.generated.public_.tables.Pessoa2.PESSOA2,
			test.generated.public_.tables.Pessoafisica.PESSOAFISICA,
			test.generated.public_.tables.Pessoajuridica.PESSOAJURIDICA,
			test.generated.public_.tables.Projeto2.PROJETO2,
			test.generated.public_.tables.Projeto2Funcionario3.PROJETO2_FUNCIONARIO3,
			test.generated.public_.tables.Projetos.PROJETOS,
			test.generated.public_.tables.ProjetosFuncionarios.PROJETOS_FUNCIONARIOS,
			test.generated.public_.tables.Setores.SETORES,
			test.generated.public_.tables.Usuario.USUARIO);
	}
}