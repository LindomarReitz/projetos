package treinandoDesktop;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ExemploDeFrame extends JFrame{
	
	private JButton b1;

	public ExemploDeFrame() {
		super("Exemplo de JFrame");
		
		b1= new JButton("Exemplo");
		add(b1);
		

	}//Construtor

	public static void main(String[] args) {
		
		ExemploDeFrame frame= new ExemploDeFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200,200);
		frame.setVisible(true);
		
	}//Main

}//Class
