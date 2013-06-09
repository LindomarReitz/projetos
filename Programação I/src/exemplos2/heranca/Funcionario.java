package exemplos2.heranca;

public class Funcionario extends Pessoa {
	private int id;
	private float salario, liquido;
	private boolean contratado;

	public Funcionario(int id, String nome, int idade, char sexo, float salario, boolean contratado) {
		super(nome, idade, sexo);
		this.id = id;
		this.salario = salario;
		this.contratado = contratado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public float getLiquido() {
		return liquido;
	}

	public void setLiquido(float liquido) {
		this.liquido = liquido;
	}

	public boolean isContratado() {
		return contratado;
	}

	public void setContratado(boolean contratado) {
		this.contratado = contratado;
	}	
	
	public String toString() {
		String saida=  "";
	
		saida += "ID: " + getId() + "\n";
		saida += "Nome: " + getNome() + "\n";
		saida += "Idade: " + getIdade() + "\n"; 
		saida += "Sexo: " + getSexo() + "\n";
		saida += "Salário: " + getSalario() +"\n";
		saida += "Salário líquido: " + getLiquido() + "\n";
		saida += "Contratado: " + isContratado() + "\n";
		
		return saida;
	}
}
