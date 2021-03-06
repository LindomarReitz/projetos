package patterns.comportamental.visitor;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
	private String nome;
	private List<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	public Departamento(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Funcionario> getFuncionarios() {	
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	public void aceitar(IAtualizadorDeFuncionario atualizador) {
		for (Funcionario f : this.funcionarios) {
			f.aceitar(atualizador);
		}
	}
}