package exemplo.spring;

public class Usuario {

	private String login, senha;
	private int codigo;
	
	public Usuario(String login, String senha, int codigo) {
		this.login = login;
		this.senha = senha;
		this.codigo = codigo;
	}
	
	public String toString() {
		return "Login: " + login + "\nSenha: " + senha + "\nCódigo: " + codigo;
	}
}
