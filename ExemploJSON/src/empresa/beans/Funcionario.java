package empresa.beans;

public class Funcionario {
	private int id;
	private String nome;
	private double salario;
	private boolean autonomo;
	
	public Funcionario() {
		
	}
	
	public Funcionario(int id, String nome, double salario, boolean autonomo) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
		this.autonomo = autonomo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public boolean isAutonomo() {
		return autonomo;
	}

	public void setAutonomo(boolean autonomo) {
		this.autonomo = autonomo;
	}
	
	public String toString() {
		return "[" + "ID:" + this.id + " Nome: " + this.nome 
			+ " Salário: " + this.salario + " Autonômo: " + this.autonomo + "]";
	}
}