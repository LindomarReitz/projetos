package exemplo.trabalhoII;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamePanelAtivo {
	private JFrame janelaJogo;
	private JPanel gameAtivo;
	private JLabel aviso;
	public GamePanelAtivo() {
		gameAtivo = new JPanel();
		aviso = new JLabel("O jogo rodará aqui!");
		gameAtivo.add(aviso);
		janelaJogo = new JFrame("Jogo");
		janelaJogo.add(gameAtivo);
		janelaJogo.setSize(180,250);
		janelaJogo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janelaJogo.setVisible(true);
	}
}
