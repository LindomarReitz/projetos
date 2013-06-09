package DesktopI;

import java.awt.FlowLayout;
import javax.swing.*;

public class TestandoJComboBox extends JFrame{

	private JComboBox caixa;
	private String cores[]= {"Azul", "Vermelho", "Cinza", "Prata", "Verde", "Amarelo"};
	
	public TestandoJComboBox() {
	super("Testando JComboBox");
	
	setLayout(new FlowLayout());
	
	caixa= new JComboBox(cores); //Adcionando o array de nomes no combo box
	caixa.setMaximumRowCount(3); //Setando para mostrar dois itens por vez na caixa
	add(caixa);

	}//Construtor
	
	public static void main(String[] args) {
		
	TestandoJComboBox a= new TestandoJComboBox();
	
	a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	a.setSize(400, 350);
	a.setVisible(true);
	
	}//Main

}//Class
