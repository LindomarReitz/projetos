package exemplos.classesAbstratas;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String saida;

		Pessoa p; // Usando a vari�vel de refer�ncia 'p' para as subclasses
					// possam utilizar

		p = new Pessoa2(); // Pegando os atributos/m�todos da classe abstrata
		saida = p.exemplo();
		JOptionPane.showMessageDialog(null, saida); // Gerando a sa�da com o
													// m�todo da classe Pessoa,
													// ele aproveita o que tem e
													// mostra

		p = new Pessoa3(); // Aqui ele mostra o seu pr�prio m�todo, isso � s�
							// para mostrar a diferen�a
		saida = p.exemplo();
		JOptionPane.showMessageDialog(null, saida);

	}// Main

}// Class
