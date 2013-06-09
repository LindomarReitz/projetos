package treinandoDesktop;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExemploDeBorda extends JPanel {
	
	private JButton b1;
	private JLabel l1;
	private JTextField texto;

	public ExemploDeBorda() {
		super(new BorderLayout());		
		
		l1= new JLabel("Exemplo", JLabel.CENTER); //Setando o JLabel para o centro
		l1.setToolTipText("Exemplo de JLabel");
		JPanel Pane= new JPanel(new BorderLayout());
		Pane.add(l1, BorderLayout.CENTER);
		Pane.setBorder(BorderFactory.createTitledBorder("Exemplo de JLabel"));
		add(Pane);
		
		JPanel painel= new JPanel(new BorderLayout());	    
		b1= new JButton("Entrar");
		painel.add(b1, BorderLayout.CENTER);
	    painel.setBorder(BorderFactory.createTitledBorder("Exemplo de JButton"));
		add(painel, BorderLayout.SOUTH);
	
	}//Construtor
	
	public static void mostrarJanela(){
		
		JFrame frame= new JFrame("Exemplo de borda");
		frame.setLayout(new FlowLayout());		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JComponent caixa= new ExemploDeBorda(); //Colocando a classe no JComponent
		caixa.setOpaque(true); //Deixando a caixa visível
		
		frame.setContentPane(caixa);
		frame.pack();
		frame.setVisible(true);
		
	}//Método mostrarJanela
	
	public static void main(String args[]){
		
		mostrarJanela();
	
	}//Main

}//Class
