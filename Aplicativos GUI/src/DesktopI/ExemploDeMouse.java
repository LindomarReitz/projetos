package DesktopI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ExemploDeMouse extends JFrame{

	private JPanel painel;
	private JLabel status;
	
	public ExemploDeMouse() {
		super("Exemplo de eventos de mouse");
		
		painel= new JPanel(); //Criando o painel para utilizar nos eventos de mouse
		painel.setBackground(Color.WHITE);		
		add(painel, BorderLayout.CENTER); //Adicionando o painel centralizado no borderLayout
		
		status= new JLabel("Status atual");
		add(status, BorderLayout.SOUTH); //Adicionando o JLabel na parte inferior da tela
	
		EventoDeMouse handler= new EventoDeMouse();
		
		painel.addMouseListener(handler); //Adicionando o paiel para ser tratado na classe interna
		painel.addMouseMotionListener(handler);
	}//Construtor
	
	private class EventoDeMouse implements MouseListener, MouseMotionListener{
		
		public void mouseDragged(MouseEvent e) {
			status.setText(String.format("Clicado em: [%d, %d] ", e.getX(), e.getY())); //Pegando as posições x e y para mostrar na tela
        }//Método mouseDragged

		public void mouseMoved(MouseEvent e) {
			status.setText(String.format("Movido em : [%d, %d]", e.getX(), e.getY()));
		}//Método mouseMoved

		public void mouseClicked(MouseEvent e) {
			status.setText(String.format("Clicado em: [%d, %d]", e.getX(), e.getY()));
		}//Método mouseClicked

		public void mouseEntered(MouseEvent e) {
			status.setText(String.format("Entrou em: [%d, %d]", e.getX(), e.getY()));
			painel.setBackground(Color.BLACK); //Pintando o fundo do container de laranja
		}//Método mouseEntered

		public void mouseExited(MouseEvent e) {
			status.setText(String.format("Entrou em: [%d, %d]", e.getX(), e.getY()));
			painel.setBackground(Color.WHITE); //Voltando o fundo a ser branco quando sair da janela
		}//Método mouseExited

		public void mousePressed(MouseEvent e) {
			status.setText(String.format("Pressionado em: [%d, %d]", e.getX(), e.getY()));
		}//Método mousePressed

		public void mouseReleased(MouseEvent e) {
			status.setText(String.format("Liberado em: [%d, %d]", e.getX(), e.getY()));
		}//Método mouseReleased
	}//Class

	public static void main(String[] args) {
		ExemploDeMouse mouse= new ExemploDeMouse();
		mouse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mouse.setSize(300,100);
		mouse.setVisible(true);
	}//Main
}//Class