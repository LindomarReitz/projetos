package patterns.estrutural.bridge;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class GeradorDeArquivoTXT implements IGeradorDeArquivo {
	@Override
	public void gerar(String conteudo) {
		try {
			 PrintStream arquivo = new PrintStream("arquivo.txt");
			 arquivo.println(conteudo);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}	
}