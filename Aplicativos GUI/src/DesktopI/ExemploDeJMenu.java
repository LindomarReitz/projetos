package DesktopI;

import java.awt.FlowLayout;

import javax.swing.*;

public class ExemploDeJMenu extends JFrame{

	private JMenu a, b;
	private JMenuBar barra;
	
	public ExemploDeJMenu() {
	super("Exemplo de janela com JMenu");		
	
	setLayout(new FlowLayout());		
	
	barra= new JMenuBar();
	setJMenuBar(barra); //Adicionando a barra de menus na janela
	add(barra);
	
	a= new JMenu("Abrir...");	
	barra.add(a); //Adicionando a opção de menu na barra de tarefas do aplicativo
	
	b= new JMenu("Sair...");
	barra.add(b);	
		
	}//Construtor 

	public static void main(String[] args) {
		
	ExemploDeJMenu a= new ExemploDeJMenu();
	a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	a.setSize(350, 100);
	a.setVisible(true);	

	}//Main

}//Class
