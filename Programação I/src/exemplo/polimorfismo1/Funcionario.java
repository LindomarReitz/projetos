package exemplo.polimorfismo1;

public class Funcionario extends Pessoa {

	private int id;
	private float salario, liquido;
	
	public Funcionario(int id, String nome, int idade, char sexo, float salario) {
		super(nome, idade, sexo);
		this.id = id;
		this.salario = salario;
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
		return salario - (salario * (8f / 100));
	}

	public void setLiquido(float liquido) {
		this.liquido = liquido;
	}
	
	public String toString() {
		String saida = "";
		
		saida += "ID: " + getId() + "\n";
		saida += "Nome: " + getNome() + "\n";
		saida += "Idade: " + getIdade() + "\n";
		saida += "Sexo: " + getSexo() + "\n";
		saida += "Salário: " + getSalario() + "\n";
		saida += "Salário líquido: " + getLiquido() + "\n"; 
		
		return saida;
	}
}
