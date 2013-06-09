package exemploConexao02;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		int op = 0;

		Conexao conexao = new Conexao("a", 18, 'm');

		while (op != 6) {
			op = Integer.parseInt(JOptionPane.showInputDialog("1- Inserir\n2- Atualizar\n3- Excluir" +
					"\n4- Ordenar por nome\n5- Ordenar por idade\n6- Sair"));
					
			switch (op) {

			case 1: conexao.inserir("a", 15, 'm');
					break;

			case 2: conexao.atualizar("a", 0, 'm');
					break;

			case 3: conexao.excluir();
					break;

			case 4: conexao.ordenarNome();
					break;

			case 5: conexao.ordenarIdade();
			}
		}
	}
}
