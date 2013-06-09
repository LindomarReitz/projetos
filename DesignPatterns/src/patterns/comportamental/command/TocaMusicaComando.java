package patterns.comportamental.command;

public class TocaMusicaComando implements IComando {
	private Player player;
	private String file;
	
	public TocaMusicaComando(Player player, String file) {
		this.player = player;
		this.file = file;
	}

	@Override
	public void executar() {
		try {
			this.player.play(file);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}