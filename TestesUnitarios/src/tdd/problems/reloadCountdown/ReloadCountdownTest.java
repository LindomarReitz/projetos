package tdd.problems.reloadCountdown;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Lindomar Reitz
 * 
 * Passos para solucionar o problema:
 * 
 *  1 - A arma deve disparar durante um certo per�odo de tempo; (OK)
 *  2 - Após o tempo de disparo terminar, deve-se parar de efetuar o mesmo; (OK)
 *  3 - Depois de um certo tempo, a arma deve ser carregada e voltar a efetuar os disparos; (OK)
 *	4 - Lançar uma exceção caso tente carregar por mais tempo que o permitido. (OK)
 */

public class ReloadCountdownTest {
	private Arma arma;
	
	@Before
	public void init() {
		arma = new Arma();
	}
	
	@Test
	public void deveriaComecarDisparo() {
		arma.setTempo(5);
		assertEquals(5, arma.efetuarDisparo(arma.getTempo()));
	}
	
	@Test
	public void deveriaPararDisparo() {
		assertEquals(0, arma.pararDisparo());
	}
	
	@Test
	public void deveriaRecomecarDisparo() {
		arma.setTempo(5);
		assertEquals(2, arma.recomecarDisparo(2));
	}
	
	@Test(expected = ArithmeticException.class)
	public void deveriaLancarExcecaoSeTempoDeRecargaForMaior() {
		arma.setTempo(5);
		arma.recomecarDisparo(arma.getTempo() + 1);
	}
}