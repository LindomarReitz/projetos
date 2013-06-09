package DesktopI;

import java.awt.*;
import javax.swing.*;

public class TestandoJLabel extends JFrame{
	
	private JLabel l1, l2, l3;

	public TestandoJLabel() {
	super("Testando JLabel com imagens");
	
	//setLayout(new FlowLayout());
		
	l1= new JLabel("Nome");	
	l1.setToolTipText("Aqui é um exemplo de informação para o usuário");
	add(l1);
	
	l2= new JLabel("Imagem com o arqueiro", SwingConstants.LEFT); //Centrando o label com a imagem
	l2.setToolTipText("Esse é um exemplo de arqueiro na tela"); //Adicionando uma 'ajuda' para o usuário
	add(l2); //Adicionando ao JFrame
	
	l3= new JLabel();
	l3.setText("Alguma coisa aqui");
	l3.setHorizontalTextPosition(SwingConstants.CENTER); //Setando o texto para o centro
	l3.setToolTipText("De novo a imagem aqui sendo exibida");
	add(l3);
	
	setSize(275,180); //Definindo o tamanho
	setVisible(true);
		
	}//Construtor TestandoJLabel

	public static void main(String[] args) {
		
	TestandoJLabel a= new TestandoJLabel(); //Criando um objeto com o nome de 'a'	
	a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}//Main

}//Class
