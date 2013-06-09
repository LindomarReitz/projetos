package DesktopI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class TestandoCampos extends JFrame{

	private JTextField login;
	private JPasswordField senha;
	private JCheckBox c1, c2;
	private JButton b1, b2;
	
	public TestandoCampos() {
	super("Testando validação de campos");
	
	setLayout(new FlowLayout());	
	
	TextFieldHandler handler= new TextFieldHandler();
	
	login= new JTextField(20);
	add(new JLabel("Login:"));
	login.addActionListener(handler);
	add(login);
	
	senha= new JPasswordField(20);
	add(new JLabel("Senha:"));
	senha.addActionListener(handler);
	add(senha);
	
	b1= new JButton("Entrar");
	b1.addActionListener(handler);
	add(b1);
	
	b2= new JButton("Sair");
	b2.addActionListener(handler);
	add(b2);	
	
	c1= new JCheckBox("Negrito");
	c1.addItemListener(handler);
	add(c1);
	
	c2= new JCheckBox("Itálico");
	c2.addItemListener(handler);
	add(c2);
	
	}//Construtor
	
	private class TextFieldHandler implements ActionListener, ItemListener{
		
		private int negrito, italico;
		
		public void actionPerformed(ActionEvent e) {
		String saida="";
		
		if(e.getSource() == login || e.getSource() == senha){
			
		saida= saida+"Login: "+login.getText()+"\nSenha: "+senha.getText();
		
		login.setText("");
		senha.setText("");		
		
		JOptionPane.showMessageDialog(null, saida, "Listagem de login e senha", JOptionPane.PLAIN_MESSAGE);
		
		}//if
		
		if (e.getSource() == b1 ) JOptionPane.showMessageDialog(null, "Conectando com o banco...");
		else if (e.getSource() == b2) System.exit(0);
		
		}//Método actionPerfomed

		public void itemStateChanged(ItemEvent e) {
			
		if( e.getSource() == c1)
			negrito= c1.isSelected() ? Font.BOLD : Font.PLAIN;	
			
			else if (e.getSource() == c2)	
			italico= c2.isSelected() ? Font.ITALIC : Font.PLAIN;
		
			login.setFont(new Font("Times new Roman", negrito+italico, 14));	
			
		}//Método itemStateChanged
			
	}//Class TextFieldHandler
	
}//Class
