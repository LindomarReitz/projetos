package patterns.comportamental.command;

public class DiminuiVolumeComando implements IComando {
	private Player player;
	private int levels;
	
	public DiminuiVolumeComando(Player player, int levels) {
		this.player = player;
		this.levels = levels;
	}

	@Override
	public void executar() {
		this.player.descreaseVolume(this.levels);
	}	
}