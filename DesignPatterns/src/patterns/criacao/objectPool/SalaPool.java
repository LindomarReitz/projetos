package patterns.criacao.objectPool;

import java.util.ArrayList;
import java.util.List;

public class SalaPool implements Pool<Sala> {
	private List<Sala> salas;
	
	public SalaPool() {
		this.salas = new ArrayList<Sala>();
		this.salas.add(new Sala(1));
		this.salas.add(new Sala(2));
		this.salas.add(new Sala(3));
	}
	
	@Override
	public Sala acquire() {
		if (this.salas.size() > 0) {
			return this.salas.remove(0);
		} else {
			return null;
		}
	}

	@Override
	public void release(Sala sala) {
		this.salas.add(sala);
	}
}