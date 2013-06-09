package exemplo.trabalhoII;

public class Pessoa {
	private String nome, endereco, estado, sexo, cargo, banco, empresa;
	private int idade, telefone, id;
	private float salario, liquido;
	private boolean java, c , delphi, ruby;

        public Pessoa() {
            
        }
        
	public Pessoa(String nome, int idade, String sexo, String estado, String endereco, 
                int telefone, int id, float salario, String cargo, boolean java, 
                boolean c , boolean delphi, boolean ruby, String banco, String empresa) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.estado = estado;
		this.endereco = endereco;
		this.telefone = telefone;
		this.id = id;
		this.salario = salario;
		this.cargo = cargo;
		this.java = java;
		this.c = c;
		this.delphi = delphi;
		this.ruby = ruby;
		this.banco = banco;
		this.empresa = empresa;
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
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
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