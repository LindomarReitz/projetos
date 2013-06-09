package exemploDesktopII;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TestandoAPI extends JFrame {

	private Container c;
	private JTextField t1, nome;
	private JButton b1;
	public TestandoAPI() {
	super("Testando a API");
	
	c= getContentPane();
	c.setLayout(new FlowLayout());		

	montarTela(c);
	
	setSize(800, 600);
	setVisible(true);
	
	}//Construtor TestandoAPI

	public void montarTela(Container c){
	JTextField idade, endereco;
	JPasswordField senha;
	String campos[]= {"A", "B", "C", "D", "E"};	
	JComboBox caixa= new JComboBox(campos);
	
	
	TextHandler handler= new TextHandler();
	
	c.add(new JLabel("Nome:"));
	this.nome= new JTextField(20);
	this.nome.addActionListener(handler);
	c.add(nome);
	
	c.add(new JLabel("Idade:"));
	idade= new JTextField(2);
	idade.addActionListener(handler);
	c.add(idade);
	
	c.add(new JLabel("Endere�o:"));
	endereco= new JTextField(30);
	endereco.addActionListener(handler);
	c.add(endereco);
	
	c.add(caixa, new JScrollPane());
	
	b1= new JButton("Pr�xima tela");
	b1.addActionListener(handler);
	c.add(b1);
		
	}//M�todo montarTela
	
	private class TextHandler implements ActionListener{

		public void actionPerformed(ActionEvent e) {
	
		if(nome.getText() == null){
			
		System.err.println("Digite o nome");
				
		}//if
		else if(e.getSource() == b1)
		System.out.println("Ir para uma outra tela");
		ExemploTela a= new ExemploTela();
		
		}//M�todo actionPerfomed
		
	}//Class

	public static void main(String args[]){
		
	TestandoAPI a= new TestandoAPI();	
		
	}//Main
	
}//Class


