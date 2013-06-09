package patterns.criacao.objectPool;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioPool implements Pool<Funcionario> {
	private List<Funcionario> funcionarios;
	
	public FuncionarioPool() {
		this.funcionarios = new ArrayList<Funcionario>();
		this.funcionarios.add(new Funcionario("Lindomar"));
		this.funcionarios.add(new Funcionario("Augusto Limeira"));
		this.funcionarios.add(new Funcionario("João"));
	}

	@Override
	public Funcionario acquire() {
		if (this.funcionarios.size() > 0) {
			return this.funcionarios.remove(0);
		} else {
			return null; 
		}
	}

	@Override
	public void release(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}
}