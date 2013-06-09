package exemplo.spring;

public class Pessoa {
	private String nome;
	private int idade;
	private char sexo;
	private float salario;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public char getSexo() {
		return sexo;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public float getSalario() {
		return salario;
	}
	
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public String toString() {
		return nome + " tem a idade de " + idade + " anos(s) com o sexo " + sexo + " e tem um salário de: " 
			+ salario;
	}
}
