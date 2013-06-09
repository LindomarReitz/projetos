package tdd.operacoes;

public class Funcionario {
	private static final float SALARIO_MINIMO = 530;
	
	private String nome;
	private int idade;
	private float salario, comissao;
	private int inss;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, int idade, float salario, float comissao) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.comissao = comissao;
	}
	
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
	
	public float getSalario() {
		return salario;
	}
	
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public float getComissao() {
		return comissao;
	}
	
	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	public int getInss() {
		return inss;
	}

	public void setInss(int inss) {
		this.inss = inss;
	}

	public float calcularSalario(float salario, float comissao) {
		if (salario < 0 || comissao < 0) 
			throw new ArithmeticException("O salário e/ou comissão não " +
					"podem ser menores do que zero.");
			
		return salario + comissao;
	}
	
	public float calcularINSS() {
		float bruto = calcularSalario(getSalario(), getComissao());
		if (bruto <= SALARIO_MINIMO)
			this.inss = 8;
		else 
			this.inss = 10;
			
		return (bruto * getInss()) / 100;
	}
	
	public float calcularSalarioLiquido() {
		return calcularSalario(getSalario(), getComissao()) - calcularINSS();
	}
	
	public boolean isAssalariado() {
		if (getComissao() > 0)
			return true;
		
		return false;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nNome: " + getNome());
		builder.append("\nIdade: " + getIdade());
		builder.append("\nSalário: " + getSalario());
		builder.append("\nComissão: " + getComissao());
		builder.append("\nINSS: " + getInss());
		
		return builder.toString();
	}
}