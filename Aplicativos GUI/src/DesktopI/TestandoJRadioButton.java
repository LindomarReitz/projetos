package DesktopI;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class TestandoJRadioButton extends JFrame{ //Fazendo herança de JFrame para criar a janela desktop
	
	private JRadioButton r1, r2, r3, r4;
	private Font negrito, italico, normal, todos;
	private JTextField campo;
	private ButtonGroup grupo;

	public TestandoJRadioButton() {
	super("Testando JRadioButton");
	
	setLayout(new FlowLayout());
	
	campo= new JTextField("Campo para ser trocada a fonte", 20);
	add(campo); //Adicionando o campo ao JFrame (janela)
	
	negrito= new Font("Times new roman", Font.BOLD, 14); //Criando as fontes e jogando por parâmetro (tipo de fonte, estilo, tamanho);
	italico= new Font("Times new roman", Font.ITALIC, 14);
	normal= new Font("Times new roman", Font.PLAIN, 14);
	todos= new Font("Times new roman", Font.BOLD+Font.ITALIC, 14);
	campo.setFont(normal);
	
	r1= new JRadioButton("Normal", true);
	add(r1);
	r2= new JRadioButton("Negrito", false); //O booleano é opcional
	add(r2);
	r3= new JRadioButton("Itálico", false);
	add(r3);
	r4= new JRadioButton("Negrito/itálico", false);
	add(r4);
	
	grupo= new ButtonGroup();
	//Adicionando os JRadioButton´s ao grupo
	grupo.add(r1); 
	grupo.add(r2);
	grupo.add(r3);
	grupo.add(r4);
	
	//Adiocionando os JRadioButtons a classe de eventos
	r1.addItemListener(new RadioButtonHandler(normal)); //Mandando a fonte por parâmento para o construtor
	r2.addItemListener(new RadioButtonHandler(negrito));
	r3.addItemListener(new RadioButtonHandler(italico));
	r4.addItemListener(new RadioButtonHandler(todos));
		
	}//Construtor
	
	private class RadioButtonHandler implements ItemListener{
		
		private Font font;
		
		public RadioButtonHandler(Font font){
			
		this.font= font; //Recebendo a fonte jogado por parâmetro das variáveis Font acima
			
		}//Construtor 

		public void itemStateChanged(ItemEvent e) {
	
		campo.setFont(font); //Setando a fonte para o campo de texto
		
		}//Método itemStateChanged
		
	}//Class RadioButtonHandler

	public static void main(String[] args) {
		
	TestandoJRadioButton a= new TestandoJRadioButton(); //Instanciando o objeto 'a' para a classe
	a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	a.setSize(800, 600);
	a.setVisible(true);	

	}//Main

}//Class
