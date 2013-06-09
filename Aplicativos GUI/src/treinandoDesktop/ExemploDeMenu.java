package treinandoDesktop;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class ExemploDeMenu extends JFrame{

	private JRadioButtonMenuItem item, fonte;
	private JCheckBoxMenuItem estiloFonte;

	public ExemploDeMenu() {
		super("Exemplo de menus");
		
		JMenu arquivo= new JMenu("Arquivo");
		arquivo.setMnemonic('F'); //Setando uma tecla de atalho
		
		JMenuItem sobre= new JMenuItem("Sobre...");
		sobre.setMnemonic('A');
		arquivo.add(sobre); //Adicionando o item sobre ao menu
		
		JMenuBar barra= new JMenuBar(); //Criando a barra do menu
		setJMenuBar(barra);
		barra.add(arquivo); //Adicionando o arquivo na barra de menu
	
	}//Construtor
	
	public static void main(String args[]){
		
		ExemploDeMenu menu= new ExemploDeMenu();
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menu.setSize(100,100);
		menu.setVisible(true);
	
	}//Main

}//Class
