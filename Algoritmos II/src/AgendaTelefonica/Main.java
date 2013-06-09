package AgendaTelefonica;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Agenda a = new Agenda(); // Composi��o do objeto Agenda

		a.n = Integer.parseInt(JOptionPane.showInputDialog("Número de posições"));
		a.inicializar();
		a.menu();
	}
}
