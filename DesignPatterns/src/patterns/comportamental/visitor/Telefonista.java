package patterns.comportamental.visitor;

public class Telefonista extends Funcionario {
	private int ramal;
	
	public Telefonista(String nome, double salario, int ramal) {
		super(nome, salario);
		this.ramal = ramal;
	}

	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}

	@Override
	public void aceitar(IAtualizadorDeFuncionario atualizador) {
		atualizador.atualizar(this);		
	}
}