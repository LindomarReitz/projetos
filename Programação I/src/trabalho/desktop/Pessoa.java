package trabalho.desktop;

public class Pessoa {
	private String nome, estado, endereco, cargo, banco, empresa, sexo;
	private int idade, telefone, id;
	private boolean java, c, delphi, ruby;
	private float salario, liquido;

	public Pessoa(String nome, int idade, String sexo, String estado, String endereco, int telefone) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.estado = estado;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public int getTelefone() {
		return telefone;
	}
	
	public int getId() {
		return id;
	}
	
	public float getSalario() {
		return salario;
	}
	
	public float getLiquido(float sal) {
		sal -= sal*(8f/100);
		liquido = sal;
		return liquido;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public boolean isJava() {
		return java;
	}
	
	public boolean isC() {
		return c;
	}
	
	public boolean isDelphi() {
		return delphi;
	}
	
	public boolean isRuby() {
		return ruby;
	}
	
	public String getBanco() {
		return banco;
	}
	
	public String getEmpresa() {
		return empresa;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setCargo(String cargo){
		this.cargo = cargo;
	}
	
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public void setJava(boolean java) {
		this.java = java;
	}
	
	public void setC(boolean c) {
		this.c = c;
	}
	
	public void setDelphi(boolean delphi) {
		this.delphi = delphi;
	}
	
	public void setRuby(boolean ruby) {
		this.ruby = ruby;
	}
	
	public void setBanco(String banco) {
		this.banco = banco;
	}
	
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
}
