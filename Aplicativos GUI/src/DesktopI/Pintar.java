package DesktopI;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Pintar {

	public static void main(String[] args) {
		
		JFrame janela= new JFrame("Desenhando no JPanel");
		
		PainelDePintura painel= new PainelDePintura();
		janela.add(painel, BorderLayout.CENTER);
		janela.add(new JLabel("Arraste o mouse para desenhar"), BorderLayout.SOUTH);
	
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(400,400);
		janela.setVisible(true);

	}//Main

}//Class
