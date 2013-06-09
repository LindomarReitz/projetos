package patterns.comportamental.visitor;

public class Gerente extends Funcionario {
	private String senha;
	
	public Gerente(String nome, double salario, String senha) {
		super(nome, salario);
		this.senha = senha;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public void aceitar(IAtualizadorDeFuncionario atualizador) {
		atualizador.atualizar(this);
	}
}