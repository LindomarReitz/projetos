package treinandoDesktop;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Janela extends JFrame{
	
	private JButton b1, b2;
	private JTextField login;
	private JPasswordField senha;

	public Janela() {
		super("Janela para treinar desktop");
		
		setLayout(new FlowLayout());	
		
		add(new JLabel("Login:"));
		login= new JTextField(20);
		add(login);
		
		add(new JLabel("Senha:"));
		senha= new JPasswordField(20);
		add(senha);
	
		b1= new JButton("Entrar");
		add(b1);
		
		b2= new JButton("Sair");
		add(b2);
		
	}//Main

}//Class
