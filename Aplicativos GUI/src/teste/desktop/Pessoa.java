package teste.desktop;

public class Pessoa {
	private String nome;
	private int idade, id;
	private float salario;
	private boolean brasileiro;
	public String estado = null;
	
	public Pessoa(String nome, int idade, int id, float salario, boolean brasileiro) {
		this.nome = nome;
		this.idade = idade;
		this.id = id;
		this.salario = salario;
		this.brasileiro = brasileiro;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public int getId(){
		return id;
	}
	
	public float getSalario(){
		return salario;
	}
	
	public float getSalarioLiquido(float salario){
		this.salario = salario;
		return salario -= salario*(8f/100);
	}
	
	public String getEstado(String estado) {
		return estado;
	}
	
	public boolean isBrasileiro() {
		return brasileiro;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public void setSalario(float salario){
		this.salario = salario;
	}
	
	public void setBrasileiro(boolean brasileiro) {
		this.brasileiro = brasileiro;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
