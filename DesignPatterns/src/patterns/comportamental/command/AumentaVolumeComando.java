package patterns.comportamental.command;

public class AumentaVolumeComando implements IComando {
	private Player player;
	private int levels;
	
	public AumentaVolumeComando(Player player, int levels) {
		this.player = player;
		this.levels = levels;
	}

	@Override
	public void executar() {
		this.player.increaseVolume(this.levels);
	}
}