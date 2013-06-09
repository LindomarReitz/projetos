package TrabalhoI;

import javax.swing.JOptionPane;

public class Programador extends Funcionario { // Fazendo herança da classe Funcionario
											
	private String linguagem;

	public Programador(int id, String nome, int idade, char sexo, float salario, String linguagem) {
		super(id, nome, idade, sexo, salario, linguagem);
		this.linguagem = linguagem;
	}

	public void setLinguagem(String ling) {
		this.linguagem = ling;
	}

	public String getLinguagem() {
		return this.linguagem;
	}

	public void cadastrar() throws IdadeException, SalarioException {
		String nome, linguagem;
		int id, idade;
		char sexo;
		float salario;

		id = Integer.parseInt(JOptionPane.showInputDialog("ID:"));
		nome = JOptionPane.showInputDialog("Nome:");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
		if (idade <= 0) throw new IdadeException(idade);
		
		sexo = JOptionPane.showInputDialog("Sexo M/F:").toUpperCase().charAt(0);
		salario = Float.parseFloat(JOptionPane.showInputDialog("Salário:"));
		if (salario < 545f) throw new SalarioException(salario);
		
		linguagem = JOptionPane.showInputDialog("Linguagem que utiliza:");

		lista.add(new Funcionario(id, nome, idade, sexo, salario, linguagem));
	}

	public void excluir(int id) {

		for (int i = 0; i < lista.size(); i++) {

			if (id == lista.get(i).getId()) { // Compara o id recebido por parâmetro com o id do ArrayList
							
				lista.remove(i);
				JOptionPane.showMessageDialog(null, "O cadastro com ID " + id
						+ " foi removido com sucesso");
			}
		}
	}
	
	public void atualizar(int id1) throws IdadeException, SalarioException {
		String nome, linguagem;
		int id, idade;
		char sexo;
		float salario;

		for (int i = 0; i < lista.size(); i++) {

			if (id1 == lista.get(i).getId()) {

				id = id1;
				nome = JOptionPane.showInputDialog("Nome:");
				idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
				if (idade <= 0) throw new IdadeException(idade);

				sexo = JOptionPane.showInputDialog("Sexo M/F:").toUpperCase().charAt(0);
						
				salario = Float.parseFloat(JOptionPane.showInputDialog("Salário:"));
				if (salario < 545f) throw new SalarioException(salario);
				
				linguagem = JOptionPane.showInputDialog("Linguagem que utiliza:");

				lista.set(i, new Funcionario(id, nome, idade, sexo, salario, linguagem)); // Atualizando a posição desejada
				
				JOptionPane.showMessageDialog(null, "O cadastro com ID " + id1
						+ " foi atualizado com sucesso");
			}// if
		}// for
	}// Método atualizar

	public String toString() {
		String saida = "";

		for (int i = 0; i < lista.size(); i++) {
			saida += "ID: " + lista.get(i).getId();  
			saida += "\nNome: " + lista.get(i).getNome();
			saida += "\nIdade: " + lista.get(i).getIdade();
			saida += "\nSexo: " + lista.get(i).getSexo();
			saida += "\nSalário: R$" + lista.get(i).getSalario();
			saida += "\nLinguagem: " + lista.get(i).getArea() + "\n\n";
			saida += "--------------------------------\n";
		}
		return saida;
	}
}