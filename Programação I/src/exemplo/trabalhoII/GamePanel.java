package exemplo.trabalhoII;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GamePanel {
	private JPanel painelJogo;
	private JButton start;
	private JFrame janelaPrincipal;
	
	public GamePanel() {
		painelJogo = new JPanel();
		start = new JButton("Começar Jogo");
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new GamePanelAtivo();
				janelaPrincipal.setVisible(false);
			}
		});
		painelJogo.add(start);
		
		janelaPrincipal = new JFrame("Janela principal");
		janelaPrincipal.add(painelJogo);
		janelaPrincipal.setSize(150,150);
		janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janelaPrincipal.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GamePanel();
	}
}
