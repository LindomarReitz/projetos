package tdd.problems.reloadCountdown;

public class Arma {
	private long tempo;
	
	public Arma() {
		
	}
	
	public Arma(long tempo) {
		this.tempo = tempo;
	}
	
	public long efetuarDisparo(long tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		pararDisparo();
		
		return tempo;
	}

	public long pararDisparo() {
		return 0;
	}

	public long recomecarDisparo(long tempo) {
		if (tempo > getTempo())
			throw new ArithmeticException("Tempo de recarga maior do que dos disparos.");
		
		efetuarDisparo(getTempo());
		
		return tempo;
	}
	
	public long getTempo() {
		return tempo;
	}

	public void setTempo(long tempo) {
		this.tempo = tempo;
	}
}