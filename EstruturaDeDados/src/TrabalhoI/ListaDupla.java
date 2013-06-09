package TrabalhoI;

import javax.swing.JOptionPane;

public class ListaDupla {
	No inicio, fim, local;
	private int tamanho = 0;

	public ListaDupla() {
		inicio = null;
		fim = null;
		local = null;
	}

	public void inserirNoInicio(Pessoa p) {
		No no = new No(p);
		if (local == null) { // Caso a lista esteja vazia
			inicio = no;
			local = no;
			fim = no;
		} else {
			no.proximo = inicio;
			local = no;
			inicio = no;
			no.proximo.anterior = local;
		}
		tamanho++; // Incrementando por um na variável tamanho
	}

	public void inserirNaPosicao(int posicao) {
		if (posicao < 0 || posicao > tamanho - 1) {
			JOptionPane.showMessageDialog(null,
					"Posição inválida, tente novamente...", "Lista",
					JOptionPane.WARNING_MESSAGE);
			return;
		}
		String nome;
		int idade;
		char sexo;

		nome = JOptionPane.showInputDialog("Nome:");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
		sexo = JOptionPane.showInputDialog("Sexo:").toUpperCase().charAt(0);
		
		No atual = inicio;
		
		if(posicao == 0) {
			inserirNoInicio(new Pessoa(nome, idade, sexo));
		} else {
			No no = new No(new Pessoa(nome, idade, sexo));
			for (int i = 0; i < posicao; i++) {
				atual = atual.proximo;
			}	
			no.anterior = atual.anterior;
			atual.anterior = no;
			no.anterior.proximo = no;
			no.proximo = atual;
		}
		tamanho++;
	}

	public void excluirNaPosicao(int posicao) {
		if (posicao < 0 || posicao > tamanho - 1) {
			JOptionPane.showMessageDialog(null,
					"Não é possivel excluir. Posição inexistente.", "Erro",
					JOptionPane.ERROR_MESSAGE);
			return;
		}
		No atual = inicio;
		if (posicao == 0) {
			inicio = inicio.proximo;
			local = inicio;
		} else if (posicao == tamanho-1) {
			fim = fim.anterior;
			fim.proximo = null;
		} else {
			for (int i = 0; i < posicao; i++) {
				atual = atual.proximo;	
			}
			atual.anterior.proximo = atual.proximo;
		}
		tamanho--;
	}

	public void pegarNaPosicao(int posicao) {
		if (posicao < 0 || posicao > tamanho - 1) {
			JOptionPane.showMessageDialog(null,
					"Posição inválida, tente novamente...", "Lista",
					JOptionPane.WARNING_MESSAGE);
			return;
		}
		No atual = inicio;
		for (int i = 0; i < posicao; i++) {
			atual = atual.proximo;
		}
		String saida = atual.getPessoa().toString();
		JOptionPane.showMessageDialog(null, "A pessoa na posicao " + posicao
				+ " é:\n" + saida);
	}

	public Pessoa ponteiroAtual() {
		No atual = local;
		return atual.getPessoa();
	}

	public void limparLista() {
		inicio = null;
		local = null;
		fim = null;
		this.tamanho = 0;
		JOptionPane.showMessageDialog(null, "Todos os elementos foram removidos com sucesso");
	}

	public No proximo() {
		No ponteiro = local;
		if (local != null) {
			local = local.proximo;
		}
		return ponteiro;
	}

	public No anterior() {
		No ponteiro = local;
		if (local != null) {
			local = local.anterior;
		}
		return ponteiro;
	}

	public void reinicializarNoInicio() {
		local = inicio;
	}

	public void reinicializarNoFim() {
		local = fim;
	}

	public int getTamanho() {
		return this.tamanho;
	}
}
