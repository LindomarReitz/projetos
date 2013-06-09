package exemploDesktopII;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ExemploTela extends JFrame{

	private Container c;

	
	public ExemploTela() {
	super("Exemplo de janela swing");
	
	c= getContentPane();

	c.setLayout(new FlowLayout());	
	setSize(400, 400);	
	
	fazerTela(c); //Invocando o método fazerTela com o container jogando por parâmetro
	
	c.setVisible(true);
		
	}//Construtor ExemploTela
	
	public void fazerTela(Container box){
	final JTextField nome= new JTextField(10);	
	final JTextField idade= new JTextField(4);
	JButton b1= new JButton("Cadastrar");
	JButton b2= new JButton("Listar");
	final JPasswordField senha= new JPasswordField(10);
	final JTextArea painel= new JTextArea();
	
	box.add(new JLabel("Nome:"));
	box.add(nome);
	box.add(idade);
	box.add(senha);
	b1.addActionListener(
	new ActionListener(){
		
		public void actionPerformed(ActionEvent e) {
		String saida="";
		
		saida= saida+"Nome: "+nome.getText()+" Idade: "+idade.getText()+"Senha: "+senha.getText()+"\n\n"; //Pegando o que foi digitado no campo e gerando um output do mesmo
		painel.setText(saida);
			
		}//Método actionPerfomed
		
	}//Método ActionListener
	
	);
	box.add(b1); //Adicionando o botão com o evento já criado	
	
	b2.addActionListener(
	new ActionListener(){
		
		public void actionPerformed(ActionEvent e) {

		JOptionPane.showMessageDialog(null, painel);	
		
	  }//Método actionPerfomed
	
	}//Método ActionListener
	
	);
	box.add(b2);
	box.add(painel, BorderLayout.SOUTH);
		
	}//Método fazerTela
	
	public static void main(String args[]){
		
	ExemploTela a= new ExemploTela();	
		
	}//Main

}//Class
