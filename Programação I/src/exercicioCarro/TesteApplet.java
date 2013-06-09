package exercicioCarro;

import java.applet.*;
import java.awt.*;
import javax.swing.*;

public class TesteApplet extends Applet {

	private JTextArea texto;

	public void init() {
		String saida = "Alguma coisa";

		setLayout(new FlowLayout());
		setBackground(Color.blue);

		JTextField t1 = new JTextField(20);
		add(new JLabel("Nome:"));
		add(t1);

		texto = new JTextArea();
		texto.setText(saida);
		add(texto);

		JButton a = new JButton("Clique aqui");
		add(a);

	}// Método init

	public static void main(String args[]) {

		TesteApplet a = new TesteApplet();

	}// Main

}// Class
