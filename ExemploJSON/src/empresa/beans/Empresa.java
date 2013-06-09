package empresa.beans;

public class Empresa {
	private int cnpj;
	private String nome, razaoSocial;
	private boolean capitalAberto;

	public Empresa(int cnpj, String nome, String razaoSocial, boolean capitalAberto) {
		this.cnpj = cnpj;
		this.nome = nome;
		this.razaoSocial = razaoSocial;
		this.capitalAberto = capitalAberto;
	}

	public Empresa() {
		
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public boolean isCapitalAberto() {
		return capitalAberto;
	}

	public void setCapitalAberto(boolean capitalAberto) {
		this.capitalAberto = capitalAberto;
	}
	
	public String toString() {
		return "[ CNPJ: " + this.cnpj + " Nome: " + this.nome + 
			" Razão Social: " + this.razaoSocial + " Capital aberto: " 
			+ this.capitalAberto + "]";
	}
}