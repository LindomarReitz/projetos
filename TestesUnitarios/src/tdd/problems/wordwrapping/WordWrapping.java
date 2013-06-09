package tdd.problems.wordwrapping;

public class WordWrapping {
	private String texto;

	public WordWrapping() {
		
	}
	
	public WordWrapping(String texto) {
		this.texto = texto;
	}
	
	public String escreverTexto(int tamanho) {
		if (this.texto == null)
				throw new NullPointerException("O texto não pode ser nulo!");
		
		if (tamanho > getTexto().length())
			return this.texto;
		else 
			return quebrarLinha(tamanho);	
	}
	
	public String quebrarLinha(int tamanho) {
		String saida = "", trecho = "";
		String[] quebras = new String[tamanho];
		int quantidade = 0, contador = 0, contador2 = 1;
		
		if (tamanho < getTexto().length() - 1) {
			for (int i = 0; i < tamanho; i++) {
				quebras[i] = this.texto.substring(0, tamanho - 1);
				quantidade = this.texto.length() / quebras[i].length();
			}
			
			for (int i = 1; i < quantidade; i++) {
				trecho = quebras[i];
				quebras[i] = this.texto.substring(trecho.length() * ++contador, 
						trecho.length() * ++contador2);
			}
			
			String[] linhas = new String[quantidade];
		
			for (int i = 0; i < quantidade; i++) {
				linhas[i] = quebras[i] + "\n";
				if (i == quantidade - 1) 
					linhas[i] = quebras[i];
					
				saida += linhas[i];
			}
			return saida;
		}
		return "";
	}
	
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
}