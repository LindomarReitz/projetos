package TrabalhoI;

import javax.swing.JOptionPane;

public class DesignDeSom extends Funcionario {

	private String softDeSom;

	public DesignDeSom(int id, String nome, int idade, char sexo,
			float salario, String softDeSom) {
		super(id, nome, idade, sexo, salario, softDeSom);

		this.softDeSom = softDeSom;
	}

	public void setSoftDeSom(String soft) {
		this.softDeSom = soft;
	}

	public String getSoftDeSom() {
		return this.softDeSom;
	}

	public void cadastrar() throws IdadeException, SalarioException {
		String nome, soft;
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

		soft = JOptionPane.showInputDialog("Software de som:");

		lista.add(new Funcionario(id, nome, idade, sexo, salario, soft));

	}

	public void excluir(int id) {

		for (int i = 0; i < lista.size(); i++) {

			if (id == lista.get(i).getId()) {
				lista.remove(i);
			}
		}
		JOptionPane.showMessageDialog(null, "O cadastro com ID " + id + " foi removido com sucesso");
	}

	public void atualizar(int id1) throws IdadeException, SalarioException {
		String nome, soft;
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
				if (salario < 545f)	throw new SalarioException(salario);
				
				soft = JOptionPane.showInputDialog("Software de desenho:");

				lista.set(i, new Funcionario(id, nome, idade, sexo, salario, soft));
				
				JOptionPane.showMessageDialog(null, "O cadastro com ID " + id1 + " foi atualizado com sucesso");
			}
		}
	}

	public String toString() {
		String saida = "";

		for (int i = 0; i < lista.size(); i++) {
			saida += "ID: " + lista.get(i).getId();  
			saida += "\nNome: " + lista.get(i).getNome();
			saida += "\nIdade: " + lista.get(i).getIdade();
			saida += "\nSexo: " + lista.get(i).getSexo();
			saida += "\nSalário: R$" + lista.get(i).getSalario();
			saida += "\nSoftware de som: " + lista.get(i).getArea() + "\n\n";
			saida += "--------------------------------\n";
		}
		return saida;
	}
}
