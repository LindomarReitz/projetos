package tdd.problems.wordwrapping;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Lindomar Reitz
 * 
 * Passos para resolver o problema: 
 * 
 * 	1 - Caso o texto seja menor do que a linha suporta, deve-se manter na mesma. (OK)
 *	2 - Caso o texto seja maior do que a linha suporta, deve-se quebrar e descer uma linha. (OK)
 *	2.1 - Se a linha tiver espaço, deve-se quebrar a linha. Ex.: abc def (OK)
 *	2.2 - Se a linha não tiver com espaços, quebra-se também. Ex.: abcdef (OK)
 *	3 - Lançar exceção caso o texto seja enviado como null. (OK)
 */

public class WordWrappingTest {
	private WordWrapping txt;
	
	@Before
	public void init() {
		txt = new WordWrapping("teste");
	}
	
	@Test
	public void deveriaReceberTextoNaMesmaLinha() {
		assertEquals("teste", txt.escreverTexto(6));
	}
	
	@Test
	public void deveriaQuebrarLinhaComEspacos() {
		txt.setTexto("testa teste testi testo ");
		
		assertEquals("testa \nteste \ntesti \ntesto ", txt.escreverTexto(7));
	}
	
	@Test
	public void deveriaQuebrarLinhaSemEspacos() {
		txt.setTexto("abcdef");
		
		assertEquals("abc\ndef", txt.escreverTexto(4));
	}
	
	@Test(expected = NullPointerException.class)
	public void deveriaLancarExcecaoComTextoVazio() {
		txt.setTexto(null);
		
		txt.escreverTexto(2);
	}
}