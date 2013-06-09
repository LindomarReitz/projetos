package ListaDupla;

public class Pessoa {

	String nome;
	int idade;
	boolean sexo;
	String telefone;
	// Ponteiros
	Pessoa proximo;
	Pessoa anterior;
	
	public Pessoa(String nome, int idade, boolean masculino, String telefone) {
		this.nome = nome;
		this.idade = idade;
		sexo = masculino;
		this.telefone = telefone;
		proximo = null;
		anterior = null;
	}
	
	public String toString() {
		String out = "Nome : " + nome + "\n";
		out += "Idade: " + idade + "\n";
		out += "Sexo : ";
		if (sexo) {
			out += "masculino\n";
		} else {
			out += "feminino\n";
		}
		out += "Fone : " + telefone + "\n";
		out += "---------------------------\n";
		return out;
	}

}
