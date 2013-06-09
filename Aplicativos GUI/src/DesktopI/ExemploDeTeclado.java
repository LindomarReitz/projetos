package DesktopI;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ExemploDeTeclado extends JFrame implements KeyListener {

	private String linha1="", linha2="", linha3="";
	private JTextArea painel;
	
	public ExemploDeTeclado() {
		super("Exemplos de eventos com teclado");
		
		painel= new JTextArea(10,15); //Jogando por parâmeto a altura e largura do painel
		painel.setText("Pressione uma tecla...");
		painel.setEnabled(false); //Desativa o painel
		painel.setDisabledTextColor(Color.BLACK); //Setando a cor do texto mostrado no painel
		add(painel);
		
		addKeyListener(this); //Adicionando o painel no ouvinte de eventos
		
	}//Construtor

	public void keyPressed(KeyEvent e) {
		
		linha1= String.format("Tecla pressionada: %s", KeyEvent.getKeyText(e.getKeyCode())); //Pegando a tecla pressionada e mostrando na tela
		setLinhas2E3(e); //Mandando o evento por parâmetro para o método
		
	}//Método keyPressed

	public void keyReleased(KeyEvent e) {
		
		linha1= String.format("Tecla liberada: %s", KeyEvent.getKeyText(e.getKeyCode()));
		setLinhas2E3(e);

	}//Método keyReleased

	public void keyTyped(KeyEvent e) {
		
		linha1= String.format("Tipo de tecla: %s", e.getKeyChar());
		setLinhas2E3(e);
		
	}//Método keyTyped
	
	public void setLinhas2E3(KeyEvent e){
		String temp;
		
		linha2= String.format("Esta tecla %s é uma tecla de ação", e.isActionKey()? "" : "não");
		
		temp= KeyEvent.getKeyModifiersText(e.getModifiers());
		
		linha3= String.format("Tecla modificadora pressionada: %s", temp.equals("") ? "nenhuma" : temp);
		
		painel.setText(String.format("%s\n%s\n%s\n", linha1, linha2, linha3)); //Pega a tecla pressionada com %s
		
	}//Método setLinhas2E3
	
	public static void main(String[] args) {
		
		ExemploDeTeclado teclado= new ExemploDeTeclado();
		teclado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		teclado.setSize(350,100);
		teclado.setVisible(true);

	}//Main

}//Class
