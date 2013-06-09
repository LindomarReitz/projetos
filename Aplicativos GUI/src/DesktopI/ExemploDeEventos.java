package DesktopI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ExemploDeEventos extends JFrame{
	
	private JButton left, right, center;
	private Container c;
	private FlowLayout layout;
	
	public ExemploDeEventos(){
	super("Exemplo de eventos");
		
	layout= new FlowLayout();
	c= getContentPane();
	c.setLayout(layout);
	
	left= new JButton("Left");
	left.addActionListener( 
	new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			
		layout.setAlignment(FlowLayout.LEFT);
		layout.layoutContainer(c);
			
		}//Método ActionListener
		
	}//ActionListener
	
	);
	c.add(left);
	
	center= new JButton("Center"); //Instanciando o botão
	center.addActionListener( //Criando o evento para o botão
	new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			
		layout.setAlignment(FlowLayout.CENTER);
		layout.layoutContainer( c );	
		
		}//Método ActionListener
			
	}//ActionListener
	
	);
	c.add(center);
	
	right= new JButton("Right");
	right.addActionListener(
	new ActionListener(){
		public void actionPerformed(ActionEvent e) {
		
		layout.setAlignment(FlowLayout.RIGHT);
		layout.layoutContainer(c);
			
		}//Método ActionListener
		
	}//ActionListener
	
	);
	c.add(right);

	setSize(300,150); //Definindo o tamanho
	setVisible(true);
		
	}//Construtor

	public static void main(String args[]){
	ExemploDeEventos a= new ExemploDeEventos(); //Invocando o construtor
	a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
  }//Main
}//Clas
