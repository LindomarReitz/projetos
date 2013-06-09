package AgendaTelefonica;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Agenda {

	static Cliente c = new Cliente();
	static int quantidade = 0, n;

	public void cadastrar(int i) {
		c.nome[i] = JOptionPane.showInputDialog("Nome: " + i);
		c.fixo[i] = Integer.parseInt(JOptionPane.showInputDialog("Telefone fixo: " + i));
		c.celular[i] = Integer.parseInt(JOptionPane.showInputDialog("Telefone celular: " + i));
	}

	public void contador() {
		if (quantidade < n) {
			cadastrar(quantidade);
			quantidade++;
		}
		else
			JOptionPane.showMessageDialog(null, "Cadastro lotado", "Cadastro",
					JOptionPane.WARNING_MESSAGE);
	}

	public void inicializar() {
		c.nome = new String[n];
		c.fixo = new int[n];
		c.celular = new int[n];
	}

	public void listar() {
		String saida = "";

		for (int i = 0; i < quantidade; i++) {

			saida = saida + "Nome: " + c.nome[i] + "\nTelefone fixo: "
					+ c.fixo[i] + "\nTelefone celular: " + c.celular[i]
					+ "\n\n";

		}

		JTextArea painel = new JTextArea();
		painel.setEditable(false);
		painel.setText(saida);

		JOptionPane.showMessageDialog(null, painel, "Listagem",
				JOptionPane.PLAIN_MESSAGE);
	}

	public void ordenarNome() {
		String saida = "";

		for (int passos = 0; passos < quantidade - 1; passos++) {
			for (int i = 0; i < quantidade - 1 - passos; i++) {
				if (c.nome[i].compareToIgnoreCase(c.nome[i]) >= 0) {

					String aux = c.nome[i + 1];
					c.nome[i + 1] = c.nome[i];
					c.nome[i] = aux;

				}

				for (int a = 0; i < quantidade; i++) {
					saida = saida + "Nome: " + c.nome[i] + "\nTelefone fixo: "
							+ c.fixo[i] + "\nTelefone celular: " + c.celular[i]
							+ "\n\n";
				}
			}
		}

		JOptionPane.showMessageDialog(null, saida, "Ordenando nomes",
				JOptionPane.PLAIN_MESSAGE);
	}
	
	public void excluir(String name) {
		for (int i = 0; i < quantidade; i++) {
			if (name.compareToIgnoreCase(c.nome[i]) == 0) {

				String aux = c.nome[i + 1];
				c.nome[i + 1] = c.nome[i];
				c.nome[i] = aux;

			}

		}

	}

	public void procurar(String search) {
		String lista = "";

		for (int i = 0; i < quantidade; i++) {
			if (search.compareToIgnoreCase(c.nome[i]) == 0) {

				String aux = c.nome[i + 1];
				c.nome[i + 1] = c.nome[i];
				c.nome[i] = aux;

				lista = lista + "Nome: " + c.nome[i] + "\nTelefone fixo: "
						+ c.fixo[i] + "\nTelefone celular: " + c.celular[i]
						+ "\n\n";

			}

		}

		JOptionPane.showMessageDialog(null, lista);

	}

	public void menu() {
		String busca;
		int op = 0;

		while (op != 6) {
			op = Integer.parseInt(JOptionPane.showInputDialog(
					"1- Cadastrar\n2- Listar\n3- Ordenar nomes\n4- Excluir por nome" +
					"\n5- Procurar por nome\n6- Sair"));

			switch (op) {

			case 1:
				contador();
				break;

			case 2:
				listar();
				break;

			case 3:
				ordenarNome();
				break;

			case 4:
				busca = JOptionPane.showInputDialog("Nome para exclus�o:");
				excluir(busca);
				break;

			case 5:
				busca = JOptionPane.showInputDialog("Nome para procura:");
				procurar(busca);
			}
		}
	}
}