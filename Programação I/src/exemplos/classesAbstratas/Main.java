package exemplos.classesAbstratas;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String saida;

		Pessoa p; // Usando a variável de referência 'p' para as subclasses
					// possam utilizar

		p = new Pessoa2(); // Pegando os atributos/métodos da classe abstrata
		saida = p.exemplo();
		JOptionPane.showMessageDialog(null, saida); // Gerando a saída com o
													// método da classe Pessoa,
													// ele aproveita o que tem e
													// mostra

		p = new Pessoa3(); // Aqui ele mostra o seu próprio método, isso é só
							// para mostrar a diferença
		saida = p.exemplo();
		JOptionPane.showMessageDialog(null, saida);

	}// Main

}// Class
