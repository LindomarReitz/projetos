package TrabalhoI;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String args[]) {
		String nome, saida = "";
		int idade, op = 1, n;
		char sexo;
		No no = null;
		ListaDupla lista = new ListaDupla();

		while (op != 0) {
			op = Integer.parseInt(JOptionPane.showInputDialog("1- Cadastrar\n2-Listar"
							+ "\n3-Inserir na posi��o\n4- Pessoa atual\n5- Limpar lista"
							+ "\n6- Quantidade de pessoas\n7- Excluir na posi��o"
							+ "\n8- Buscar na posi��o\n0- Sair"));
						
			switch (op) {

			case 1:
				nome = JOptionPane.showInputDialog("Nome:");
				idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
				sexo = JOptionPane.showInputDialog("Sexo:").toUpperCase().charAt(0);
				lista.inserirNoInicio(new Pessoa(nome, idade, sexo));
				break;

			case 2:
				saida = ""; // Limpa a lista para adicionar o outro objeto
				do { // Pegando o proximo da lista enquanto n�o estiver vazia
					no = lista.proximo();
					if (no != null) {
						saida += no.getPessoa();
					}
				} while (no != null);
				lista.reinicializarNoInicio();
				JOptionPane.showMessageDialog(null, saida);
				break;

			case 3:
				n = Integer.parseInt(JOptionPane.showInputDialog("Digite uma posi��o para inserir:"));		
				lista.inserirNaPosicao(n);
				break;

			case 4:
				if (lista.local == null) {
					JOptionPane.showMessageDialog(null,
							"O ponteiro n�o est� apontado para ningu�m");
				} else
					JOptionPane.showMessageDialog(null, "O ponteiro est� apontando para:\n"
							+ lista.ponteiroAtual());				
				break;

			case 5:
				lista.limparLista();
				break;

			case 6:
				n = lista.getTamanho();
				if (n == 0) {
					JOptionPane.showMessageDialog(null, "N�o h� ningu�m cadastrado");						
				} else {
					JOptionPane.showMessageDialog(null, "N�mero de pessoas cadastradas: " + n);
				}
				break;

			case 7:
				n = Integer.parseInt(JOptionPane.showInputDialog("Digite uma posi��o para excluir:"));
				lista.excluirNaPosicao(n);
				break;

			case 8:
				n = Integer.parseInt(JOptionPane.showInputDialog("Digite uma posi��o para buscar:"));
				lista.pegarNaPosicao(n);
			}
		}
	}
}
