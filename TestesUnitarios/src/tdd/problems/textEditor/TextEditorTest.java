package tdd.problems.textEditor;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Lindomar Reitz
 * 
 * Passos para solucionar o problema:
 * 
 * 	1 - Cortar os espaços em branco no final do texto; (OK)
 * 	2 - Não remover os espaços em branco que estão no ínicio do texto; (OK)
 * 	3 - Deve-se remover os espaços em branco de cada linha; (OK)
 * 	4 - O texto com slashes de quebra de linha ou outros devem ficar juntos;
 */

public class TextEditorTest {
	private TextEditor editor;

	@Before
	public void init() {
		editor = new TextEditor();
	}
	
	@Test
	public void deveriarCortarEspacosNoFinal() {
		assertEquals("exemplo", editor.cortarEspacosNoFinal("exemplo "));
		assertEquals("exemplo", editor.cortarEspacosNoFinal("exemplo\t"));
	}
	
	@Test
	public void deveriaNaoCortarEspacosNoInicio() {
		assertEquals(" texto", editor.cortarEspacosNoFinal(" texto"));
		assertEquals(" Lindomar", editor.cortarEspacosNoFinal(" Lindomar"));
	}
	
	@Test
	public void deveriaCortarEspacosParaCadaLinha() {
		assertEquals("texto\ncd\n", editor.cortarEspacosParaCadaLinha("texto\n cd \n"));
	}
	
	@Test
	public void deveriaSerMesmaString() {
		assertEquals("lindomar\n\n\n\t", editor.deixarNaMesmaString("lindomar\n\n\n\t"));
	}
}