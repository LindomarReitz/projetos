package DesktopI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class ExemploDesktop extends JFrame {
	
	private Container c;
	private String nomes[]={"Azul", "Vermelho", "Verde", "Cinza"};
	private Color cores[]= {Color.BLUE, Color.RED, Color.GREEN, Color.GRAY};
	private JComboBox caixa= new JComboBox(nomes);
	private JTextField nome= new JTextField(20);
	private JTextField vazio= new JTextField("Texto vazio aqui");
	private JPasswordField pass= new JPasswordField(10);
	
	public ExemploDesktop(){
	super("Exemplo de aplicativo GUI - Desktop");
	
	c= getContentPane();

	setLayout(new FlowLayout());	
	setSize(400,200);
	
	fazerTela(c);
	
    setVisible(true);
	
	}//Construtor exemplo desktop
	
	public void fazerTela(Container box){
	
	box.add(caixa);
	box.add(nome);
	box.add(pass);
	
	vazio.setEditable(false); //Não deixando o JTextField ser editado
	box.add(vazio);
	
	TextFieldHandler handler= new TextFieldHandler();
	
	nome.addActionListener(handler);
	pass.addActionListener(handler);
	vazio.addActionListener(handler);
	caixa.addItemListener(handler);
	
	}//Método fazer tela
	
	private class TextFieldHandler implements ActionListener, ItemListener{
		
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == pass){
			
		e.getActionCommand();
		
		JOptionPane.showMessageDialog(null, "O nome é: "+pass.getText());
		pass.setText("");
		
		}//if
		
	  }//Método actionPerfomed

	public void itemStateChanged(ItemEvent e) {
		
		getContentPane().setBackground(cores[caixa.getSelectedIndex()]); //Pegando a cor selecionada no ComboBox
		repaint();
		
	}//Método itemStateChanged
		
	}//Class TextFieldHandler
	
	public static void main(String args[]){
		
	ExemploDesktop ed= new ExemploDesktop();	
	
	}//Main

}//Class
