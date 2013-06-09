package tdd.problem.URLsplitting;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 *  @author Lindomar Reitz
 *
 *	Passos para resolver o problema:
 *
 *	1 - Quebrar uma URL pegando somente o seu protocolo. Ex.: http (OK)
 *	2 - Quebrar uma URL qualquer e pegar somente o seu domínio. Ex.: google.com (OK)
 *	3 - Quebrar uma URL e pegar o seu caminho (path). Ex.: index.html (OK)
 *	4 - Lançar uma exceção caso uma URL não comece com http/https ou ftp. (OK)
 *
 */

public class URLSplittingTest {
	private URLSplitting url;
	
	@Before
	public void init() {
		url = new URLSplitting("http://google.com");
	}
	
	@Test
	public void deveriaPegarProtocolo() {
		assertEquals("http", url.getProtocolo());
	}
	
	@Test
	public void deveriaPegarDominio() {
		url = new URLSplitting("ftp://www.vidadeprogramador.com.br");
		
		assertEquals("www.vidadeprogramador.com.br", 
				url.getDominio(url.getProtocolo()));
	}
	
	@Test
	public void deveriaPegarCaminho() {
		url = new URLSplitting("http://www.teste.com/testes.xhtml");
		
		assertEquals("testes.xhtml", 
				url.getCaminho(url.getDominio(url.getProtocolo())));
	}
	
	@Test(expected = ProtocoloURLException.class)
	public void deveriaLancarExceptionAoUsarOutroProtocolo() {
		url = new URLSplitting("abc://www.google.com.br");
		
		url.getProtocolo();
	}
}