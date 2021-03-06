package TrabalhoI;

import javax.swing.JOptionPane;

public class DesignGrafico extends Funcionario {

	private String softDesenho;

	public DesignGrafico(int id, String nome, int idade, char sexo, float salario, String softDesenho) {
		super(id, nome, idade, sexo, salario, softDesenho);

		this.softDesenho = softDesenho;
	}

	public void setSoftDesenho(String softDesenho) {
		this.softDesenho = softDesenho;
	}

	public String getSoftDesenho() {
		return this.softDesenho;
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
		salario = Float.parseFloat(JOptionPane.showInputDialog("Sal�rio:"));
		if (salario < 545f) throw new SalarioException(salario);

		soft = JOptionPane.showInputDialog("Software de desenho:");

		lista.add(new Funcionario(id, nome, idade, sexo, salario, soft));
	}

	public void excluir(int id) {

		for (int i = 0; i < lista.size(); i++) {
			if (id == lista.get(i).getId()) {
				lista.remove(i);
				JOptionPane.showMessageDialog(null, "O cadastro com ID " + id
						+ " foi removido com sucesso");
			}
		}
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
				salario = Float.parseFloat(JOptionPane.showInputDialog("Sal�rio:"));
				if (salario < 545f) throw new SalarioException(salario);

				soft = JOptionPane.showInputDialog("Software de desenho:");
				
				lista.set(i, new Funcionario(id, nome, idade, sexo, salario, soft));
						
				JOptionPane.showMessageDialog(null, "O cadastro com ID " + id1
						+ " foi atualizado com sucesso");
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
			saida += "\nSal�rio: R$" + lista.get(i).getSalario();
			saida += "\nSoftware de desenho: " + lista.get(i).getArea() + "\n\n";
			saida += "--------------------------------\n";
		}
		return saida;
	}
}