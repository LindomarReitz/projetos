package DesktopI;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ExemploDeJList extends JFrame{
	
	private String nomes[]= {"Azul", "Amarelo", "Verde", "Vermelho", "Cinza"};
	private final Color cores[]= {Color.BLUE, Color.YELLOW, Color.GREEN, Color.RED, Color.GRAY}; 
	private JList lista;
	
	public ExemploDeJList() {
		super("Exemplo de JList");
		
		setLayout(new FlowLayout());	
		
		lista= new JList(nomes); //Adicionando os nomes na lista para a seleção de cores
		lista.setVisibleRowCount(5); //Deixando 5 linhas para a visualização
		lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //Setando a lista para uma seleção simples
		
		add(new JScrollPane(lista)); //Adicionando a lista ao JFrame e colocando um scroll no mesmo(barra de rolagem)
		
		Evento handler= new Evento();
		lista.addListSelectionListener(handler); //Adcionando a lista ao tratador de eventos para modificar
		
	}//Construtor
	
	private class Evento implements ListSelectionListener{ //Classe interna para tratar os eventos

		public void valueChanged(ListSelectionEvent e) {
			
			getContentPane().setBackground(cores[lista.getSelectedIndex()]); //Pintando o fundo da janela com a cor selecionada no array
		
		}//Método valueChanged
		
	}//Class

	public static void main(String[] args) {
		
		ExemploDeJList lista= new ExemploDeJList();
		lista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lista.pack();
		lista.setVisible(true);
		
	}//Main

}//Class
